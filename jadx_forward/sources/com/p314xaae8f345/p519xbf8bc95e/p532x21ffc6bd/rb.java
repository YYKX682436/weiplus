package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class rb extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh {

    /* renamed from: h, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.lk.a f132674h = new com.tencent.mapsdk.internal.lk.a(android.graphics.Bitmap.Config.ARGB_8888);

    public rb() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh.a(f132674h);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh
    public final boolean f() {
        android.graphics.Bitmap bitmap = this.f131614c;
        if (bitmap != null && !bitmap.isRecycled() && this.f131613b.get() <= 0) {
            synchronized (this.f131618g) {
                this.f131614c.recycle();
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s).a("tileBitmap recycle out");
        }
        this.f131615d = null;
        android.graphics.Bitmap bitmap2 = this.f131614c;
        return bitmap2 == null || bitmap2.isRecycled();
    }

    public rb(byte[] bArr) {
        super(bArr);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh.a(f132674h);
    }
}
