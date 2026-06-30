package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class j6 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n6 f225157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 f225158c;

    public j6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 o6Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n6 n6Var) {
        this.f225158c = o6Var;
        this.f225156a = str;
        this.f225157b = n6Var;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n6 n6Var = this.f225157b;
        if (bitmap == null || bitmap.isRecycled() || bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live cover cdn download fail. url:%s", this.f225156a);
            n6Var.a(null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 o6Var = this.f225158c;
        java.lang.String str = o6Var.f225237g + java.lang.String.format("MMImage_live_cover_%d_%d.jpg", java.lang.Long.valueOf(o6Var.f224975e.f380561e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (ra3.h0.c(bitmap, str)) {
            ra3.h0.d(str, bArr);
            n6Var.a(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live cover cdn save fail. path: %s", str);
            n6Var.a(null);
        }
    }
}
