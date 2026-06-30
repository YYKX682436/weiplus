package bb1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f100300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb1.b f100302f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100303g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f100304h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f100305i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f100306m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f100307n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f100308o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f100309p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f100310q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f100311r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f100312s;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, bb1.b bVar, java.lang.String str, int i18, com.p314xaae8f345.mm.vfs.r6 r6Var, boolean z17, boolean z18, boolean z19, int i19, java.util.HashMap hashMap, java.util.HashMap hashMap2, boolean z27) {
        this.f100300d = lVar;
        this.f100301e = i17;
        this.f100302f = bVar;
        this.f100303g = str;
        this.f100304h = i18;
        this.f100305i = r6Var;
        this.f100306m = z17;
        this.f100307n = z18;
        this.f100308o = z19;
        this.f100309p = i19;
        this.f100310q = hashMap;
        this.f100311r = hashMap2;
        this.f100312s = z27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int i17;
        long j17 = 1000;
        int nanoTime = (int) (java.lang.System.nanoTime() / j17);
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = this.f100305i;
            java.lang.String str2 = this.f100303g;
            boolean z17 = this.f100306m;
            boolean z18 = this.f100307n;
            boolean z19 = this.f100308o;
            int i18 = this.f100309p;
            java.util.HashMap hashMap = this.f100310q;
            java.util.HashMap hashMap2 = this.f100311r;
            boolean z27 = this.f100312s;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.Companion companion = com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.INSTANCE;
            java.lang.String u17 = r6Var.u();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "getPath(...)");
            com.p314xaae8f345.mm.p2818xd0d82df3.C22940x18bf1e7e c22940x18bf1e7e = new com.p314xaae8f345.mm.p2818xd0d82df3.C22940x18bf1e7e(1, str2, z17, z18, z19, i18, hashMap, hashMap2, z27, com.p314xaae8f345.mm.p2818xd0d82df3.v.f295912a.c());
            companion.getClass();
            companion.a();
            com.p314xaae8f345.mm.p2818xd0d82df3.C22942x75e515cf m83544xfc37a5fa = com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.m83544xfc37a5fa(u17, c22940x18bf1e7e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateInferenceSession", "tryCreateSession cost[" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ']');
            this.f100302f.C(this.f100303g);
            x71.m mVar = (x71.m) i95.n0.c(x71.m.class);
            if (mVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCreateInferenceSession", "AppBrandXNetSessionMgr is null");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f100300d;
                int i19 = this.f100301e;
                bb1.b bVar = this.f100302f;
                bVar.getClass();
                str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                lVar.a(i19, bVar.u(str, jSONObject));
                return;
            }
            java.lang.String mo48798x74292566 = this.f100300d.mo48798x74292566();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
            com.p314xaae8f345.mm.p2818xd0d82df3.C22943x18a74108 sessionPtr = m83544xfc37a5fa.getSessionKeeper();
            j81.a aVar = (j81.a) mVar;
            synchronized (aVar) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionPtr, "sessionPtr");
                i17 = aVar.f379671d;
                aVar.f379671d = i17 + 1;
                aVar.f379672e.put(java.lang.Integer.valueOf(i17), sessionPtr);
                aVar.f379673f.put(java.lang.Integer.valueOf(i17), mo48798x74292566);
            }
            int i27 = 0;
            if (m83544xfc37a5fa.getSuccess()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = this.f100300d;
                int i28 = this.f100301e;
                bb1.b bVar2 = this.f100302f;
                java.util.HashMap hashMap3 = new java.util.HashMap();
                hashMap3.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "" + i17);
                bVar2.getClass();
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                hashMap3.put("errno", 0);
                lVar2.a(i28, bVar2.t("ok", hashMap3));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateInferenceSession", "createInferenceSession invoke cost[" + ((((int) (java.lang.System.nanoTime() / j17)) - nanoTime) + this.f100304h) + ']');
                return;
            }
            java.lang.String str5 = "";
            long[] codes = m83544xfc37a5fa.getCodes();
            int length = codes.length;
            int i29 = 0;
            while (i27 < length) {
                long j18 = codes[i27];
                int i37 = i29 + 1;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str5);
                sb6.append(j18);
                sb6.append(':');
                sb6.append(m83544xfc37a5fa.getDesc().length > i29 ? m83544xfc37a5fa.getDesc()[i29] : "");
                sb6.append('\n');
                str5 = sb6.toString();
                i27++;
                i29 = i37;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar3 = this.f100300d;
            int i38 = this.f100301e;
            bb1.b bVar3 = this.f100302f;
            java.lang.String format = java.lang.String.format("fail:create session fail : %s", java.util.Arrays.copyOf(new java.lang.Object[]{str5}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            bVar3.getClass();
            str = android.text.TextUtils.isEmpty(null) ? format : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 2004001);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar3.a(i38, bVar3.u(str, jSONObject2));
        } catch (com.p314xaae8f345.mm.p2818xd0d82df3.w unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar4 = this.f100300d;
            int i39 = this.f100301e;
            bb1.b bVar4 = this.f100302f;
            bVar4.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:environment not ready" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 2004010);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            lVar4.a(i39, bVar4.u(str, jSONObject3));
        }
    }
}
