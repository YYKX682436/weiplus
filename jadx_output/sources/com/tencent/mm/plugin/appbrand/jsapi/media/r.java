package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.p f82020f;

    public r(com.tencent.mm.plugin.appbrand.jsapi.media.p pVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f82020f = pVar;
        this.f82018d = lVar;
        this.f82019e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.media.p pVar = this.f82020f;
        pVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:system permission denied" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f82018d.a(this.f82019e, pVar.u(str, jSONObject));
    }
}
