package d04;

/* loaded from: classes8.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f307048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f307049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d04.w1 f307050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307051g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f307052h;

    public u1(int i17, byte[] bArr, d04.w1 w1Var, int i18, android.widget.ImageView imageView) {
        this.f307048d = i17;
        this.f307049e = bArr;
        this.f307050f = w1Var;
        this.f307051g = i18;
        this.f307052h = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.System.currentTimeMillis();
        int i17 = this.f307048d;
        android.graphics.Bitmap bitmap = null;
        if (i17 == 1 || i17 == 3) {
            byte[] bArr = this.f307049e;
            int i18 = this.f307050f.f307071h;
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I(bArr, i18 * 2, i18 * 2, null);
        } else if (i17 == 2) {
            byte[] bArr2 = this.f307049e;
            int i19 = this.f307050f.f307071h;
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I(bArr2, i19, i19, null);
        }
        java.lang.System.currentTimeMillis();
        if (bitmap != null) {
            bitmap.getAllocationByteCount();
        }
        ((ku5.t0) ku5.t0.f394148d).B(new d04.t1(bitmap, this.f307051g, this.f307052h));
    }
}
