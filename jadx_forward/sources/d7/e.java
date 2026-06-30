package d7;

/* loaded from: classes13.dex */
public class e implements w6.z0, w6.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f308327d;

    /* renamed from: e, reason: collision with root package name */
    public final x6.d f308328e;

    public e(android.graphics.Bitmap bitmap, x6.d dVar) {
        if (bitmap == null) {
            throw new java.lang.NullPointerException("Bitmap must not be null");
        }
        this.f308327d = bitmap;
        if (dVar == null) {
            throw new java.lang.NullPointerException("BitmapPool must not be null");
        }
        this.f308328e = dVar;
    }

    public static d7.e b(android.graphics.Bitmap bitmap, x6.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new d7.e(bitmap, dVar);
    }

    @Override // w6.z0
    public java.lang.Class a() {
        return android.graphics.Bitmap.class;
    }

    @Override // w6.z0
    public java.lang.Object get() {
        return this.f308327d;
    }

    @Override // w6.z0
    /* renamed from: getSize */
    public int mo14473xfb854877() {
        return q7.p.c(this.f308327d);
    }

    @Override // w6.u0
    /* renamed from: initialize */
    public void mo123606x33ebcb90() {
        this.f308327d.prepareToDraw();
    }

    @Override // w6.z0
    /* renamed from: recycle */
    public void mo14474x408b7293() {
        this.f308328e.b(this.f308327d);
    }
}
