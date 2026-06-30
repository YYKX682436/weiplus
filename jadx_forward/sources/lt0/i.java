package lt0;

/* loaded from: classes15.dex */
public abstract class i implements lt0.c {

    /* renamed from: a, reason: collision with root package name */
    public kk.l f402706a;

    /* renamed from: b, reason: collision with root package name */
    public final lt0.a f402707b;

    /* renamed from: c, reason: collision with root package name */
    public final kk.h f402708c;

    /* renamed from: d, reason: collision with root package name */
    public final kk.i f402709d;

    public i(lt0.a aVar, kk.h hVar, kk.i iVar) {
        this.f402707b = null;
        this.f402707b = aVar;
        this.f402708c = hVar;
        this.f402709d = iVar;
        this.f402706a = new kk.l(aVar.f402696a, new lt0.g(this), new lt0.h(this));
    }

    public void a(double d17) {
        double d18 = d17 + 1.0d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UsageLruMap", "growMaxSize %s and old %s  result %s", java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(this.f402707b.f402696a), java.lang.Integer.valueOf((int) (r1.f402696a * d18)));
        this.f402706a.s((int) (r1.f402696a * d18));
    }

    public abstract java.lang.Object b(java.lang.Object obj, java.lang.Object obj2);
}
