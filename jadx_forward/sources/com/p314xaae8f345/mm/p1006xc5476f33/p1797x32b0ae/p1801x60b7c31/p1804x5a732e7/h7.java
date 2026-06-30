package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public final class h7 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k7 f225137b;

    public h7(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k7 k7Var) {
        this.f225136a = str;
        this.f225137b = k7Var;
    }

    @Override // k70.u
    public final void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        java.lang.String str = this.f225136a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k7 k7Var = this.f225137b;
        if (bitmap == null || bitmap.isRecycled()) {
            k7Var.f224976f.a("download " + str + " fail");
            return;
        }
        java.lang.String str2 = k7Var.f225175m + ("MMImage_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str) + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
        if (!ra3.h0.c(bitmap, str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiShareMediaToTimeline", "saveBitmapToFile fail, filePath: " + str2);
            k7Var.f224976f.a("saveBitmapToFile fail");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiShareMediaToTimeline", "saveBitmapToFile success, filePath: " + str2);
        if (!k7Var.f225172g) {
            k7Var.B(k7Var.f225177o, str2);
        } else {
            ra3.h0.d(str2, bArr);
            k7Var.B(str2, "");
        }
    }
}
