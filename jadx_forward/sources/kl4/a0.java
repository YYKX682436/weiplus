package kl4;

/* loaded from: classes11.dex */
public final class a0 extends jm4.t3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f390400d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public ll4.d f390401e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f390402f;

    /* renamed from: g, reason: collision with root package name */
    public long f390403g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f390404h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Float f390405i;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f390406m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f390407n;

    /* renamed from: o, reason: collision with root package name */
    public ll4.d f390408o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f390409p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 f390410q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f390411r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f390412s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f390413t;

    /* renamed from: u, reason: collision with root package name */
    public final kl4.q f390414u;

    static {
        ml4.b.f409940a.a();
    }

    public a0() {
        p3321xbce91901.jvm.p3324x21ffc6bd.i iVar = null;
        this.f390410q = new com.p314xaae8f345.p3118xeeebfacc.C26845xac206036(iVar, 1, iVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlatformPlayerCore", "initTingPlatformPlayerCore");
        this.f390411r = jz5.h.b(kl4.t.f390496d);
        this.f390412s = "MicroMsg.TingPlatformPlayerCoreTask@" + a();
        this.f390413t = "MicroMsg.TingPlatformPlayerCore@" + a();
        this.f390414u = new kl4.q(this);
    }

    @Override // jm4.w3
    public void P1(jm4.u3 u3Var) {
        this.f390400d.remove(new com.p314xaae8f345.p3118xeeebfacc.C26845xac206036(u3Var));
    }

    @Override // jm4.w3
    public void Z8(jm4.u3 u3Var) {
        if (u3Var == null) {
            rk4.k5.d(this.f390413t, "addPlayerStateClient listener is null");
        } else {
            this.f390400d.add(new com.p314xaae8f345.p3118xeeebfacc.C26845xac206036(u3Var));
        }
    }

    public final java.lang.String a() {
        return (java.lang.String) this.f390411r.mo141623x754a37bb();
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop last player core. playId:");
        ll4.d dVar = this.f390408o;
        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.o()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390413t, sb6.toString());
        ll4.d dVar2 = this.f390408o;
        if (dVar2 != null) {
            dVar2.mo145974x360802();
        }
        ll4.d dVar3 = this.f390408o;
        if (dVar3 != null) {
            dVar3.mo145969x41012807();
        }
        this.f390408o = null;
    }

    @Override // jm4.w3
    public float h() {
        java.lang.Float f17 = this.f390405i;
        if (f17 == null) {
            ll4.d dVar = this.f390401e;
            f17 = dVar != null ? java.lang.Float.valueOf(dVar.h()) : null;
            if (f17 == null) {
                return 1.0f;
            }
        }
        return f17.floatValue();
    }

    @Override // jm4.w3
    public int i() {
        return 0;
    }

    @Override // jm4.w3
    public long k() {
        ll4.d dVar = this.f390401e;
        if (dVar != null) {
            return dVar.k();
        }
        return 0L;
    }

    @Override // jm4.w3
    public long m() {
        if (this.f390404h) {
            return this.f390403g;
        }
        ll4.d dVar = this.f390401e;
        if (dVar != null) {
            return dVar.m();
        }
        return 0L;
    }

    @Override // jm4.w3
    public long s() {
        ll4.d dVar = this.f390401e;
        if (dVar != null) {
            return dVar.d();
        }
        return 0L;
    }
}
