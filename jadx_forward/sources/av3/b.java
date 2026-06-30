package av3;

/* loaded from: classes10.dex */
public final class b extends av3.a {

    /* renamed from: e, reason: collision with root package name */
    public final long f95748e;

    /* renamed from: f, reason: collision with root package name */
    public int f95749f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f95750g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.graphics.Bitmap[] bitmapArr, long j17, android.graphics.Matrix matrix) {
        super(matrix);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f95748e = j17;
        this.f95750g = new java.util.ArrayList();
        if (bitmapArr == null) {
            return;
        }
        java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(bitmapArr);
        while (true) {
            p3321xbce91901.jvm.p3324x21ffc6bd.b bVar = (p3321xbce91901.jvm.p3324x21ffc6bd.b) a17;
            if (!bVar.hasNext()) {
                return;
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bVar.next();
            if (bitmap != null) {
                ((java.util.ArrayList) this.f95750g).add(bitmap);
            }
        }
    }

    @Override // av3.a
    public void b() {
    }

    @Override // av3.a
    public void c(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        java.util.List list = this.f95750g;
        if (((java.util.ArrayList) list).isEmpty()) {
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.ArrayList) list).get(this.f95749f);
        canvas.save();
        canvas.concat(this.f95744a);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    @Override // av3.a
    public void d() {
    }

    @Override // av3.a
    public long e() {
        java.util.List list = this.f95750g;
        if (((java.util.ArrayList) list).isEmpty()) {
            return com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        int i17 = this.f95749f + 1;
        this.f95749f = i17;
        this.f95749f = i17 % list.size();
        return this.f95748e;
    }
}
