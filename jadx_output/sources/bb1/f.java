package bb1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f18781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bb1.g f18783g;

    public f(int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i18, bb1.g gVar) {
        this.f18780d = i17;
        this.f18781e = lVar;
        this.f18782f = i18;
        this.f18783g = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long sessionPtr;
        boolean z17;
        java.lang.String str;
        x71.m mVar = (x71.m) i95.n0.c(x71.m.class);
        int i17 = this.f18780d;
        j81.a aVar = (j81.a) mVar;
        synchronized (aVar) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandXNetSessionMgr", "try to release sessionId: " + i17);
            if (aVar.f298139e.containsKey(java.lang.Integer.valueOf(i17))) {
                try {
                    com.tencent.mm.wexnet.WeXNet.Companion companion = com.tencent.mm.wexnet.WeXNet.INSTANCE;
                    java.lang.Object obj = aVar.f298139e.get(java.lang.Integer.valueOf(i17));
                    kotlin.jvm.internal.o.d(obj);
                    sessionPtr = ((x71.o) obj).getSessionPtr();
                    companion.a();
                } catch (com.tencent.mm.wexnet.w unused) {
                }
                if (com.tencent.mm.wexnet.WeXNet.releaseSession(sessionPtr).getSuccess()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandXNetSessionMgr", "release sessionId: " + i17 + " success");
                    x71.o oVar = (x71.o) aVar.f298139e.get(java.lang.Integer.valueOf(i17));
                    if (oVar != null) {
                        oVar.expire();
                    }
                    aVar.f298139e.remove(java.lang.Integer.valueOf(i17));
                    aVar.f298140f.remove(java.lang.Integer.valueOf(i17));
                    z17 = true;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandXNetSessionMgr", "release sessionId: " + i17 + " failed");
                }
            }
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f18781e;
            int i18 = this.f18782f;
            bb1.g gVar = this.f18783g;
            gVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i18, gVar.u(str, jSONObject));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = this.f18781e;
        int i19 = this.f18782f;
        bb1.g gVar2 = this.f18783g;
        gVar2.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "fail:session id not exist" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 2004011);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar2.a(i19, gVar2.u(str, jSONObject2));
    }
}
