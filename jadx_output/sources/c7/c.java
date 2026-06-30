package c7;

/* loaded from: classes13.dex */
public abstract class c implements t6.n {

    /* renamed from: a, reason: collision with root package name */
    public final d7.e0 f39516a;

    public c() {
        if (d7.e0.f226799g == null) {
            synchronized (d7.e0.class) {
                if (d7.e0.f226799g == null) {
                    d7.e0.f226799g = new d7.e0();
                }
            }
        }
        this.f39516a = d7.e0.f226799g;
    }

    @Override // t6.n
    public /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, t6.l lVar) {
        return true;
    }

    @Override // t6.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final w6.z0 a(android.graphics.ImageDecoder.Source source, int i17, int i18, t6.l lVar) {
        t6.b bVar = (t6.b) lVar.c(d7.y.f226851f);
        d7.v vVar = (d7.v) lVar.c(d7.v.f226843f);
        t6.k kVar = d7.y.f226854i;
        c7.b bVar2 = new c7.b(this, i17, i18, lVar.c(kVar) != null && ((java.lang.Boolean) lVar.c(kVar)).booleanValue(), bVar, vVar, (t6.m) lVar.c(d7.y.f226852g));
        d7.d dVar = (d7.d) this;
        android.graphics.Bitmap decodeBitmap = android.graphics.ImageDecoder.decodeBitmap(source, bVar2);
        if (android.util.Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new d7.e(decodeBitmap, dVar.f226792b);
    }
}
