package d04;

/* loaded from: classes8.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f306965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f306966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d04.i2 f306967f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f306968g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f306969h;

    public h2(int i17, byte[] bArr, d04.i2 i2Var, int i18, android.widget.ImageView imageView) {
        this.f306965d = i17;
        this.f306966e = bArr;
        this.f306967f = i2Var;
        this.f306968g = i18;
        this.f306969h = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.System.currentTimeMillis();
        int i17 = this.f306965d;
        android.graphics.Bitmap bitmap = null;
        if (i17 == 1 || i17 == 3) {
            byte[] bArr = this.f306966e;
            int i18 = this.f306967f.f306975e;
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I(bArr, i18 * 2, i18 * 2, null);
        } else if (i17 == 2) {
            byte[] bArr2 = this.f306966e;
            int i19 = this.f306967f.f306975e;
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I(bArr2, i19, i19, null);
        }
        java.lang.System.currentTimeMillis();
        if (bitmap != null) {
            bitmap.getAllocationByteCount();
        }
        ((ku5.t0) ku5.t0.f394148d).B(new d04.g2(bitmap, this.f306968g, this.f306969h));
    }
}
