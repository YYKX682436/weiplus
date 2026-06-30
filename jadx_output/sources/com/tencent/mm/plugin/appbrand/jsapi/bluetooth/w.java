package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z f80119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z zVar) {
        super(1);
        this.f80117d = lVar;
        this.f80118e = i17;
        this.f80119f = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        kotlin.Result.m529toStringimpl(value);
        boolean m528isSuccessimpl = kotlin.Result.m528isSuccessimpl(value);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z zVar = this.f80119f;
        int i17 = this.f80118e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80117d;
        if (m528isSuccessimpl) {
            zVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, zVar.u(str2, jSONObject));
        } else {
            zVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, zVar.u(str2, jSONObject2));
        }
        return jz5.f0.f302826a;
    }
}
