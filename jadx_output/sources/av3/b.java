package av3;

/* loaded from: classes10.dex */
public final class b extends av3.a {

    /* renamed from: e, reason: collision with root package name */
    public final long f14215e;

    /* renamed from: f, reason: collision with root package name */
    public int f14216f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f14217g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.graphics.Bitmap[] bitmapArr, long j17, android.graphics.Matrix matrix) {
        super(matrix);
        kotlin.jvm.internal.o.g(matrix, "matrix");
        this.f14215e = j17;
        this.f14217g = new java.util.ArrayList();
        if (bitmapArr == null) {
            return;
        }
        java.util.Iterator a17 = kotlin.jvm.internal.c.a(bitmapArr);
        while (true) {
            kotlin.jvm.internal.b bVar = (kotlin.jvm.internal.b) a17;
            if (!bVar.hasNext()) {
                return;
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bVar.next();
            if (bitmap != null) {
                ((java.util.ArrayList) this.f14217g).add(bitmap);
            }
        }
    }

    @Override // av3.a
    public void b() {
    }

    @Override // av3.a
    public void c(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        java.util.List list = this.f14217g;
        if (((java.util.ArrayList) list).isEmpty()) {
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.ArrayList) list).get(this.f14216f);
        canvas.save();
        canvas.concat(this.f14211a);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    @Override // av3.a
    public void d() {
    }

    @Override // av3.a
    public long e() {
        java.util.List list = this.f14217g;
        if (((java.util.ArrayList) list).isEmpty()) {
            return com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        int i17 = this.f14216f + 1;
        this.f14216f = i17;
        this.f14216f = i17 % list.size();
        return this.f14215e;
    }
}
