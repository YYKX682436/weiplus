package av3;

/* loaded from: classes10.dex */
public final class c extends av3.a {

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f14218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.graphics.Bitmap bitmap, android.graphics.Matrix matrix) {
        super(matrix);
        kotlin.jvm.internal.o.g(matrix, "matrix");
        this.f14218e = bitmap;
    }

    @Override // av3.a
    public void b() {
    }

    @Override // av3.a
    public void c(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        if (g()) {
            canvas.save();
            canvas.concat(this.f14211a);
            android.graphics.Bitmap bitmap = this.f14218e;
            kotlin.jvm.internal.o.d(bitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            canvas.restore();
        }
    }

    @Override // av3.a
    public void d() {
    }

    @Override // av3.a
    public long e() {
        return com.tencent.wcdb.core.Database.DictDefaultMatchValue;
    }
}
