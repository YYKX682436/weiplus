package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f82047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.t5 f82049f;

    public s5(com.tencent.mm.plugin.appbrand.jsapi.media.t5 t5Var, boolean z17, java.lang.String str) {
        this.f82049f = t5Var;
        this.f82047d = z17;
        this.f82048e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.media.t5 t5Var = this.f82049f;
        nf.g.a(t5Var.f82078b.getF147807d()).f(new com.tencent.mm.plugin.appbrand.jsapi.media.r5(this));
        java.lang.String str = lp0.b.K() + "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImageMode", 1);
        intent.putExtra("CropImage_OutputPath", str);
        intent.putExtra("CropImage_ImgPath", this.f82048e);
        intent.putExtra("CropImage_from_scene", 5);
        int i17 = t5Var.f82080d;
        float f17 = i17 > 0 ? t5Var.f82081e / i17 : 1.0f;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCropImage", "aspectRatio:%f", java.lang.Float.valueOf(f17));
        intent.putExtra("CropImage_aspect_ratio", f17);
        j45.l.o(t5Var.f82078b.getF147807d(), "gallery", ".picker.view.ImageCropUI", intent, t5Var.f82082f.f82089g, false);
    }
}
