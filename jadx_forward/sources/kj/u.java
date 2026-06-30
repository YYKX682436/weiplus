package kj;

/* loaded from: classes12.dex */
public class u extends kj.g0 implements jj.d {

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f389800e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f389801f;

    /* renamed from: g, reason: collision with root package name */
    public final ej.c f389802g;

    /* renamed from: h, reason: collision with root package name */
    public final kj.s f389803h = new kj.s(this);

    /* renamed from: i, reason: collision with root package name */
    public final kj.t f389804i = new kj.t(this);

    /* renamed from: m, reason: collision with root package name */
    public final boolean f389805m;

    public u(ej.c cVar) {
        this.f389802g = cVar;
        this.f389805m = cVar.f334790d;
    }

    @Override // jj.d
    public void b(java.lang.String str, long j17, long j18) {
        if (this.f389802g.f334794h) {
            oj.j.e("Matrix.AnrTracer", "[dispatchEnd] beginNs:%s endNs:%s cost:%sms", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf((j18 - j17) / 1000000));
        }
        kj.s sVar = this.f389803h;
        sVar.f389797d.a();
        this.f389800e.removeCallbacks(sVar);
        this.f389801f.removeCallbacks(this.f389804i);
    }

    @Override // jj.d
    public void c(java.lang.String str) {
        gj.e m41274xfbb0a546 = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.m41264x9cf0d20b().m41274xfbb0a546("AnrTracer#dispatchBegin");
        kj.s sVar = this.f389803h;
        sVar.f389797d = m41274xfbb0a546;
        if (this.f389802g.f334794h) {
            oj.j.e("Matrix.AnrTracer", "* [dispatchBegin] index:%s", java.lang.Integer.valueOf(sVar.f389797d.f353873a));
        }
        this.f389800e.postDelayed(sVar, 5000L);
        this.f389801f.postDelayed(this.f389804i, 2000L);
    }

    @Override // kj.g0
    public void d() {
        super.d();
        if (this.f389805m) {
            gj.k kVar = gj.k.f353887q;
            synchronized (kVar.f353894i) {
                ((java.util.HashMap) kVar.f353894i).put(this, new gj.g(this));
            }
            this.f389800e = new android.os.Handler(oj.g.a().getLooper());
            this.f389801f = new android.os.Handler(oj.g.a().getLooper());
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
        if (this.f389805m) {
            gj.k.d(this);
            this.f389803h.f389797d.a();
            this.f389800e.removeCallbacksAndMessages(null);
            this.f389801f.removeCallbacksAndMessages(null);
        }
    }

    @Override // jj.d
    /* renamed from: isValid */
    public boolean mo53758x7b953cf2() {
        return true;
    }
}
