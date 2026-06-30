package f51;

/* loaded from: classes14.dex */
public class a extends f51.b {

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.Bitmap f341129J;
    public final float K;
    public final float L;

    public a(android.graphics.Bitmap bitmap) {
        this.f341129J = bitmap;
        this.K = bitmap.getWidth() / 2.0f;
        this.L = bitmap.getHeight() / 2.0f;
    }

    @Override // f51.b
    public void e(android.graphics.Canvas canvas, android.graphics.Matrix matrix, android.graphics.Paint paint, float f17, float f18, float f19, float f27) {
        matrix.preTranslate(f17, f18);
        matrix.preRotate(f19, this.K, this.L);
        canvas.drawBitmap(this.f341129J, matrix, paint);
    }

    @Override // f51.b
    public int f() {
        return this.f341129J.getHeight();
    }

    @Override // f51.b
    public int g() {
        return this.f341129J.getWidth();
    }
}
