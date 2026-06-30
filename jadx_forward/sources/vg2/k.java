package vg2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.p3363xbe4143f1.C29690xfae77312 f518064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f518065e;

    public k(org.p3363xbe4143f1.C29690xfae77312 c29690xfae77312, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f518064d = c29690xfae77312;
        this.f518065e = c22789xd23e9a9b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.p3363xbe4143f1.C29690xfae77312 c29690xfae77312 = this.f518064d;
        float m154689x6be2dc6 = c29690xfae77312.m154689x6be2dc6();
        float m154680xb7389127 = c29690xfae77312.m154680xb7389127();
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f518065e;
        int width = c22789xd23e9a9b.getWidth();
        int height = c22789xd23e9a9b.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f17 = width / m154689x6be2dc6;
        if ((f17 == 0.0f) || java.lang.Float.isInfinite(f17) || java.lang.Float.isNaN(f17)) {
            f17 = 1.0f;
        }
        matrix.setTranslate(0.0f, height - m154680xb7389127);
        matrix.preScale(f17, f17, 0.0f, m154680xb7389127);
        c22789xd23e9a9b.mo82568x3e3ac3e8(c29690xfae77312);
        c22789xd23e9a9b.m82580x67981db5(matrix);
        c22789xd23e9a9b.g();
    }
}
