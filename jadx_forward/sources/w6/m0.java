package w6;

/* loaded from: classes13.dex */
public class m0 implements w6.m, r7.f {
    public static final w6.j0 E = new w6.j0();
    public boolean A;
    public w6.r0 B;
    public w6.t C;
    public volatile boolean D;

    /* renamed from: d, reason: collision with root package name */
    public final w6.l0 f524685d;

    /* renamed from: e, reason: collision with root package name */
    public final r7.k f524686e;

    /* renamed from: f, reason: collision with root package name */
    public final w6.q0 f524687f;

    /* renamed from: g, reason: collision with root package name */
    public final m3.e f524688g;

    /* renamed from: h, reason: collision with root package name */
    public final w6.j0 f524689h;

    /* renamed from: i, reason: collision with root package name */
    public final w6.n0 f524690i;

    /* renamed from: m, reason: collision with root package name */
    public final z6.e f524691m;

    /* renamed from: n, reason: collision with root package name */
    public final z6.e f524692n;

    /* renamed from: o, reason: collision with root package name */
    public final z6.e f524693o;

    /* renamed from: p, reason: collision with root package name */
    public final z6.e f524694p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f524695q;

    /* renamed from: r, reason: collision with root package name */
    public t6.h f524696r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f524697s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f524698t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f524699u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f524700v;

    /* renamed from: w, reason: collision with root package name */
    public w6.z0 f524701w;

    /* renamed from: x, reason: collision with root package name */
    public t6.a f524702x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f524703y;

    /* renamed from: z, reason: collision with root package name */
    public w6.t0 f524704z;

    public m0(z6.e eVar, z6.e eVar2, z6.e eVar3, z6.e eVar4, w6.n0 n0Var, w6.q0 q0Var, m3.e eVar5) {
        w6.j0 j0Var = E;
        this.f524685d = new w6.l0(new java.util.ArrayList(2));
        this.f524686e = new r7.j();
        this.f524695q = new java.util.concurrent.atomic.AtomicInteger();
        this.f524691m = eVar;
        this.f524692n = eVar2;
        this.f524693o = eVar3;
        this.f524694p = eVar4;
        this.f524690i = n0Var;
        this.f524687f = q0Var;
        this.f524688g = eVar5;
        this.f524689h = j0Var;
    }

    public synchronized void a(m7.f fVar, java.util.concurrent.Executor executor) {
        this.f524686e.a();
        w6.l0 l0Var = this.f524685d;
        l0Var.getClass();
        l0Var.f524684d.add(new w6.k0(fVar, executor));
        boolean z17 = true;
        if (this.f524703y) {
            d(1);
            executor.execute(new w6.i0(this, fVar));
        } else if (this.A) {
            d(1);
            executor.execute(new w6.h0(this, fVar));
        } else {
            if (this.D) {
                z17 = false;
            }
            q7.n.a(z17, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public void b() {
        if (e()) {
            return;
        }
        this.D = true;
        w6.t tVar = this.C;
        tVar.K = true;
        w6.k kVar = tVar.I;
        if (kVar != null) {
            kVar.mo173234xae7a2e7a();
        }
        w6.n0 n0Var = this.f524690i;
        t6.h hVar = this.f524696r;
        w6.g0 g0Var = (w6.g0) n0Var;
        synchronized (g0Var) {
            w6.v0 v0Var = g0Var.f524648a;
            v0Var.getClass();
            java.util.Map map = this.f524700v ? v0Var.f524775b : v0Var.f524774a;
            if (equals(map.get(hVar))) {
                map.remove(hVar);
            }
        }
    }

    public void c() {
        w6.r0 r0Var;
        synchronized (this) {
            this.f524686e.a();
            q7.n.a(e(), "Not yet complete!");
            int decrementAndGet = this.f524695q.decrementAndGet();
            q7.n.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                r0Var = this.B;
                f();
            } else {
                r0Var = null;
            }
        }
        if (r0Var != null) {
            r0Var.c();
        }
    }

    public synchronized void d(int i17) {
        w6.r0 r0Var;
        q7.n.a(e(), "Not yet complete!");
        if (this.f524695q.getAndAdd(i17) == 0 && (r0Var = this.B) != null) {
            r0Var.b();
        }
    }

    public final boolean e() {
        return this.A || this.f524703y || this.D;
    }

    public final synchronized void f() {
        boolean a17;
        if (this.f524696r == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f524685d.f524684d.clear();
        this.f524696r = null;
        this.B = null;
        this.f524701w = null;
        this.A = false;
        this.D = false;
        this.f524703y = false;
        w6.t tVar = this.C;
        w6.q qVar = tVar.f524749m;
        synchronized (qVar) {
            qVar.f524719a = true;
            a17 = qVar.a(false);
        }
        if (a17) {
            tVar.o();
        }
        this.C = null;
        this.f524704z = null;
        this.f524702x = null;
        this.f524688g.b(this);
    }

    public synchronized void g(m7.f fVar) {
        boolean z17;
        this.f524686e.a();
        w6.l0 l0Var = this.f524685d;
        l0Var.getClass();
        l0Var.f524684d.remove(new w6.k0(fVar, q7.i.f441832b));
        if (this.f524685d.f524684d.isEmpty()) {
            b();
            if (!this.f524703y && !this.A) {
                z17 = false;
                if (z17 && this.f524695q.get() == 0) {
                    f();
                }
            }
            z17 = true;
            if (z17) {
                f();
            }
        }
    }

    @Override // r7.f
    public r7.k h() {
        return this.f524686e;
    }
}
