package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class f9 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.i9 f80885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f80886f;

    public f9(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.jsapi.i9 i9Var, int i17) {
        this.f80884d = lVar;
        this.f80885e = i9Var;
        this.f80886f = i17;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (i17 == 113) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenCameraForImageSearch", "requestCameraPermission sys perm denied for choose image");
                com.tencent.mm.plugin.appbrand.m6.a(this.f80884d.getAppId()).f85713f = false;
                com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80884d;
                int i18 = this.f80886f;
                com.tencent.mm.plugin.appbrand.jsapi.i9 i9Var = this.f80885e;
                i9Var.getClass();
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
                lVar.a(i18, i9Var.u(str, jSONObject));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCameraForImageSearch", "requestCameraPermission permission is grant for choose image");
                android.content.Context context = this.f80884d.getContext();
                com.tencent.mm.plugin.appbrand.jsapi.i9 i9Var2 = this.f80885e;
                com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest jsApiOpenCameraForImageSearch$ChooseRequest = i9Var2.f81310h;
                if (jsApiOpenCameraForImageSearch$ChooseRequest == null) {
                    kotlin.jvm.internal.o.o("mRequest");
                    throw null;
                }
                com.tencent.mm.plugin.appbrand.ipc.u uVar = i9Var2.f81311i;
                if (uVar == null) {
                    kotlin.jvm.internal.o.o("mResultReceiver");
                    throw null;
                }
                java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
                com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiOpenCameraForImageSearch$ChooseRequest, uVar, null);
            }
            si1.e1.c(this.f80884d.getAppId());
            this.f80885e.f81309g = false;
        }
    }
}
