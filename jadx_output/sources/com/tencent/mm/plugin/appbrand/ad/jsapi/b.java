package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes.dex */
public final class b implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.m f74899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f74900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ad.jsapi.c f74901f;

    public b(com.tencent.mm.plugin.appbrand.jsapi.m mVar, int i17, com.tencent.mm.plugin.appbrand.ad.jsapi.c cVar) {
        this.f74899d = mVar;
        this.f74900e = i17;
        this.f74901f = cVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d;
        com.tencent.mm.plugin.appbrand.ad.jsapi.c cVar = this.f74901f;
        int i17 = this.f74900e;
        com.tencent.mm.plugin.appbrand.jsapi.m mVar = this.f74899d;
        if (!z17) {
            if (mVar != null) {
                cVar.getClass();
                java.lang.String str = android.text.TextUtils.isEmpty("db operation failed") ? "fail:internal error" : "db operation failed";
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                mVar.a(i17, cVar.u(str, jSONObject));
                return;
            }
            return;
        }
        if (mVar != null) {
            cVar.getClass();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            mVar.a(i17, cVar.u(str3, jSONObject2));
        }
    }
}
