package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class rb extends com.tencent.mapsdk.internal.kh {

    /* renamed from: h, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.lk.a f51141h = new com.tencent.mapsdk.internal.lk.a(android.graphics.Bitmap.Config.ARGB_8888);

    public rb() {
        com.tencent.mapsdk.internal.kh.a(f51141h);
    }

    @Override // com.tencent.mapsdk.internal.kh
    public final boolean f() {
        android.graphics.Bitmap bitmap = this.f50081c;
        if (bitmap != null && !bitmap.isRecycled() && this.f50080b.get() <= 0) {
            synchronized (this.f50085g) {
                this.f50081c.recycle();
            }
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50218s).a("tileBitmap recycle out");
        }
        this.f50082d = null;
        android.graphics.Bitmap bitmap2 = this.f50081c;
        return bitmap2 == null || bitmap2.isRecycled();
    }

    public rb(byte[] bArr) {
        super(bArr);
        com.tencent.mapsdk.internal.kh.a(f51141h);
    }
}
