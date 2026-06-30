package uo0;

/* loaded from: classes3.dex */
public final class a extends f51.b {

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.Bitmap f511074J;
    public final float K;
    public final int L;
    public final int M;
    public final int N;
    public final float O;
    public final float P;
    public final int Q;
    public float R;

    public a(android.graphics.Bitmap bitmap, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.f511074J = bitmap;
        this.K = f17;
        this.L = bitmap.getWidth() / 2;
        this.M = bitmap.getHeight() / 2;
        this.N = c06.e.f119249d.e(0, 2);
        this.O = 0.685f;
        this.P = 1.4f;
        this.Q = 250;
        this.R = 1.0f;
    }

    @Override // f51.b
    public void e(android.graphics.Canvas canvas, android.graphics.Matrix matrix, android.graphics.Paint paint, float f17, float f18, float f19, float f27) {
        float max;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        float f28 = this.O;
        float f29 = this.P;
        if (f27 <= f28) {
            max = java.lang.Math.max(f27 / (f28 / f29), 0.5f);
        } else {
            float f37 = 1;
            max = java.lang.Math.max((f37 - f27) / ((f37 - f28) / f29), 0.5f);
        }
        float f38 = max * this.R;
        int alpha = paint.getAlpha();
        float f39 = this.f341135f;
        int i17 = this.Q;
        matrix.preTranslate(f18 > f39 - ((float) i17) ? this.f341134e : this.f341134e - ((this.N * 0.5f) * ((f39 - i17) - f18)), f18);
        matrix.preScale(f38, f38, this.L, this.M);
        paint.setAlpha((int) (this.K * 255.0f));
        canvas.drawBitmap(this.f511074J, matrix, paint);
        paint.setAlpha(alpha);
    }

    @Override // f51.b
    public int f() {
        return this.f511074J.getHeight();
    }

    @Override // f51.b
    public int g() {
        return this.f511074J.getWidth();
    }
}
