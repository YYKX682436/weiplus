package bb1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f100313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f100314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f100315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bb1.g f100316g;

    public f(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i18, bb1.g gVar) {
        this.f100313d = i17;
        this.f100314e = lVar;
        this.f100315f = i18;
        this.f100316g = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long sessionPtr;
        boolean z17;
        java.lang.String str;
        x71.m mVar = (x71.m) i95.n0.c(x71.m.class);
        int i17 = this.f100313d;
        j81.a aVar = (j81.a) mVar;
        synchronized (aVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandXNetSessionMgr", "try to release sessionId: " + i17);
            if (aVar.f379672e.containsKey(java.lang.Integer.valueOf(i17))) {
                try {
                    com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.Companion companion = com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.INSTANCE;
                    java.lang.Object obj = aVar.f379672e.get(java.lang.Integer.valueOf(i17));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                    sessionPtr = ((x71.o) obj).getSessionPtr();
                    companion.a();
                } catch (com.p314xaae8f345.mm.p2818xd0d82df3.w unused) {
                }
                if (com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.m83546xab932c8f(sessionPtr).getSuccess()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandXNetSessionMgr", "release sessionId: " + i17 + " success");
                    x71.o oVar = (x71.o) aVar.f379672e.get(java.lang.Integer.valueOf(i17));
                    if (oVar != null) {
                        oVar.mo83524xb328fd1f();
                    }
                    aVar.f379672e.remove(java.lang.Integer.valueOf(i17));
                    aVar.f379673f.remove(java.lang.Integer.valueOf(i17));
                    z17 = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandXNetSessionMgr", "release sessionId: " + i17 + " failed");
                }
            }
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f100314e;
            int i18 = this.f100315f;
            bb1.g gVar = this.f100316g;
            gVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i18, gVar.u(str, jSONObject));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = this.f100314e;
        int i19 = this.f100315f;
        bb1.g gVar2 = this.f100316g;
        gVar2.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "fail:session id not exist" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 2004011);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar2.a(i19, gVar2.u(str, jSONObject2));
    }
}
