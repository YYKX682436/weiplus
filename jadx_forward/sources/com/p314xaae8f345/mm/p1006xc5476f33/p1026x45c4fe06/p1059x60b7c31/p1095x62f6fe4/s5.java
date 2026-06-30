package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f163580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t5 f163582f;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t5 t5Var, boolean z17, java.lang.String str) {
        this.f163582f = t5Var;
        this.f163580d = z17;
        this.f163581e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t5 t5Var = this.f163582f;
        nf.g.a(t5Var.f163611b.getF229340d()).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r5(this));
        java.lang.String str = lp0.b.K() + "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImageMode", 1);
        intent.putExtra("CropImage_OutputPath", str);
        intent.putExtra("CropImage_ImgPath", this.f163581e);
        intent.putExtra("CropImage_from_scene", 5);
        int i17 = t5Var.f163613d;
        float f17 = i17 > 0 ? t5Var.f163614e / i17 : 1.0f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCropImage", "aspectRatio:%f", java.lang.Float.valueOf(f17));
        intent.putExtra("CropImage_aspect_ratio", f17);
        j45.l.o(t5Var.f163611b.getF229340d(), "gallery", ".picker.view.ImageCropUI", intent, t5Var.f163615f.f163622g, false);
    }
}
