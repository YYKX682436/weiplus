package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class q2 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.e3 f82007f;

    public q2(com.tencent.mm.plugin.appbrand.jsapi.media.e3 e3Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f82007f = e3Var;
        this.f82005d = lVar;
        this.f82006e = i17;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 == 145) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission sys perm denied for choose image");
                com.tencent.mm.plugin.appbrand.m6.a(this.f82005d.getAppId()).f85713f = false;
                this.f82005d.a(this.f82006e, this.f82007f.o("fail:system permission denied"));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission permission is grant for choose image");
                android.content.Context context = this.f82005d.getContext();
                com.tencent.mm.plugin.appbrand.jsapi.media.e3 e3Var = this.f82007f;
                com.tencent.mm.plugin.appbrand.ipc.d.b(context, e3Var.f81782h, e3Var.f81783i);
            }
            si1.e1.c(this.f82005d.getAppId());
            this.f82007f.f81781g = false;
            return;
        }
        if (i17 == 113) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseImage", "requestCameraPermission sys perm denied for choose image");
                com.tencent.mm.plugin.appbrand.m6.a(this.f82005d.getAppId()).f85713f = false;
                this.f82005d.a(this.f82006e, this.f82007f.o("fail:system permission denied"));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "requestCameraPermission permission is grant for choose image");
                android.content.Context context2 = this.f82005d.getContext();
                com.tencent.mm.plugin.appbrand.jsapi.media.e3 e3Var2 = this.f82007f;
                com.tencent.mm.plugin.appbrand.ipc.d.b(context2, e3Var2.f81782h, e3Var2.f81783i);
            }
            si1.e1.c(this.f82005d.getAppId());
            this.f82007f.f81781g = false;
        }
    }
}
