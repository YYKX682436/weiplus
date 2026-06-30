package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class m3 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f81937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest f81939g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.z3 f81940h;

    public m3(com.tencent.mm.plugin.appbrand.jsapi.media.z3 z3Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest) {
        this.f81940h = z3Var;
        this.f81936d = lVar;
        this.f81937e = jSONObject;
        this.f81938f = i17;
        this.f81939g = jsApiChooseMedia$ChooseRequest;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest = this.f81939g;
        org.json.JSONObject jSONObject = this.f81937e;
        int i18 = this.f81938f;
        com.tencent.mm.plugin.appbrand.jsapi.media.z3 z3Var = this.f81940h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81936d;
        if (i17 == 145) {
            if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "requestExternalStoragePermission permission is grant for choose media");
                z3Var.C(lVar, jSONObject, i18, jsApiChooseMedia$ChooseRequest);
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "requestExternalStoragePermission sys perm denied for choose media");
                lVar.a(i18, z3Var.o("fail:system permission denied"));
                si1.e1.c(lVar.getAppId());
                z3Var.f82167g = false;
                return;
            }
        }
        if (i17 == 119) {
            if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "requestCameraPermission permission is grant for choose media");
                z3Var.C(lVar, jSONObject, i18, jsApiChooseMedia$ChooseRequest);
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "requestCameraPermission sys perm denied for choose media");
                lVar.a(i18, z3Var.o("fail:system permission denied"));
                si1.e1.c(lVar.getAppId());
                z3Var.f82167g = false;
                return;
            }
        }
        if (i17 == 120) {
            if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "requestAudioPermission permission is grant for choose media");
                z3Var.C(lVar, jSONObject, i18, jsApiChooseMedia$ChooseRequest);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "requestAudioPermission sys perm denied for choose media");
                lVar.a(i18, z3Var.o("fail:system permission denied"));
                si1.e1.c(lVar.getAppId());
                z3Var.f82167g = false;
            }
        }
    }
}
