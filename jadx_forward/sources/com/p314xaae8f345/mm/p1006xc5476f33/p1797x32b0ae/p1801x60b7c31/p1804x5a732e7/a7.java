package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class a7 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c7 f225042d;

    public a7(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c7 c7Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f225042d = c7Var;
        this.f225039a = str;
        this.f225040b = str2;
        this.f225041c = str3;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendFileMessage", "downloadCdnThumbImage result success");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c7 c7Var = this.f225042d;
        java.lang.String str = c7Var.f225066p + java.lang.String.format("MMImage_%d_%d.jpg", java.lang.Long.valueOf(c7Var.f224975e.f380561e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (ra3.h0.c(bitmap, str)) {
            ra3.h0.d(str, bArr);
            c7Var.f225065o = str;
            c7Var.B(this.f225039a, this.f225040b, str, this.f225041c);
        }
    }
}
