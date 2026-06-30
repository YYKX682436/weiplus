package av3;

/* loaded from: classes10.dex */
public final class c extends av3.a {

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f95751e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.graphics.Bitmap bitmap, android.graphics.Matrix matrix) {
        super(matrix);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f95751e = bitmap;
    }

    @Override // av3.a
    public void b() {
    }

    @Override // av3.a
    public void c(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        if (g()) {
            canvas.save();
            canvas.concat(this.f95744a);
            android.graphics.Bitmap bitmap = this.f95751e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            canvas.restore();
        }
    }

    @Override // av3.a
    public void d() {
    }

    @Override // av3.a
    public long e() {
        return com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
    }
}
