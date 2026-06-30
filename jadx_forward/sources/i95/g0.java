package i95;

/* loaded from: classes12.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fs.q f371325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f371326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i95.r f371327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f371328g;

    public g0(fs.q qVar, java.lang.Throwable th6, i95.r rVar, boolean z17) {
        this.f371325d = qVar;
        this.f371326e = th6;
        this.f371327f = rVar;
        this.f371328g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        fs.q qVar = this.f371325d;
        i95.w wVar = (i95.w) qVar.get();
        if (wVar == null) {
            throw new com.p314xaae8f345.mm.p2624x91727fcf.p2625x1d1e926c.C21320x5c919cff(java.lang.String.format(java.util.Locale.ENGLISH, "fail to get instance from '%s'", qVar));
        }
        wVar.m134978xc7df9085(this.f371326e);
        i95.n0.j(null, wVar, this.f371327f, true, this.f371328g, false);
    }
}
