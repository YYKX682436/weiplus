package rf4;

/* loaded from: classes3.dex */
public final class f extends f51.b {

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.Bitmap f476579J;
    public final int K;
    public final int L;

    public f(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.f476579J = bitmap;
        this.K = bitmap.getWidth() / 2;
        this.L = bitmap.getHeight() / 2;
    }

    @Override // f51.b
    public void e(android.graphics.Canvas canvas, android.graphics.Matrix matrix, android.graphics.Paint paint, float f17, float f18, float f19, float f27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        float f28 = 1 - f27;
        float max = java.lang.Math.max(f28, 0.5f);
        float f29 = f27 < 0.3f ? f27 / 0.3f : ((double) f27) > 0.7d ? f28 / 0.3f : 1.0f;
        int alpha = paint.getAlpha();
        matrix.preTranslate(f17, f18);
        matrix.preScale(max, max, this.K, this.L);
        paint.setAlpha((int) (f29 * 255));
        canvas.drawBitmap(this.f476579J, matrix, paint);
        paint.setAlpha(alpha);
    }

    @Override // f51.b
    public int f() {
        return this.f476579J.getHeight();
    }

    @Override // f51.b
    public int g() {
        return this.f476579J.getWidth();
    }
}
