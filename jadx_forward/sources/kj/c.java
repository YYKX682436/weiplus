package kj;

/* loaded from: classes12.dex */
public class c extends kj.g0 implements jj.d {

    /* renamed from: e, reason: collision with root package name */
    public gj.e f389720e;

    /* renamed from: f, reason: collision with root package name */
    public long f389721f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f389722g;

    public c(ej.c cVar) {
        this.f389721f = cVar.f334787a != null ? ((com.p314xaae8f345.mm.p849xbf8d97c1.o0) r0).a("clicfg_matrix_trace_evil_method_threshold", 700) : 700;
        this.f389722g = cVar.f334788b;
    }

    @Override // jj.d
    public void b(java.lang.String str, long j17, long j18) {
        long j19 = (j18 - j17) / 1000000;
        try {
            if (j19 >= this.f389721f) {
                long[] m41271xe1d050bf = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.m41264x9cf0d20b().m41271xe1d050bf(this.f389720e);
                oj.g.a().post(new kj.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v, m41271xe1d050bf, j19, j18));
            }
        } finally {
            this.f389720e.a();
        }
    }

    @Override // jj.d
    public void c(java.lang.String str) {
        this.f389720e = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.m41264x9cf0d20b().m41274xfbb0a546("EvilMethodTracer#dispatchBegin");
    }

    @Override // kj.g0
    public void d() {
        super.d();
        if (this.f389722g) {
            gj.k kVar = gj.k.f353887q;
            synchronized (kVar.f353894i) {
                ((java.util.HashMap) kVar.f353894i).put(this, new gj.g(this));
            }
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
        if (this.f389722g) {
            gj.k.d(this);
        }
    }

    @Override // jj.d
    /* renamed from: isValid */
    public boolean mo53758x7b953cf2() {
        return true;
    }
}
