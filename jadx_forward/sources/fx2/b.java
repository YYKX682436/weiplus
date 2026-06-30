package fx2;

/* loaded from: classes8.dex */
public final class b implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fx2.c f348647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fx2.c f348648b;

    public b(fx2.c cVar, fx2.c cVar2) {
        this.f348647a = cVar;
        this.f348648b = cVar2;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            if (!(!bitmap.isRecycled())) {
                bitmap = null;
            }
            if (bitmap != null) {
                fx2.c cVar = this.f348647a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f348650b, "loaded, " + this.f348648b.f348649a);
                pm0.v.X(new fx2.a(cVar, bitmap));
            }
        }
    }
}
