package l36;

/* loaded from: classes16.dex */
public final class u0 implements l36.n {

    /* renamed from: d, reason: collision with root package name */
    public final l36.q0 f397184d;

    /* renamed from: e, reason: collision with root package name */
    public final p36.l f397185e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.g f397186f;

    /* renamed from: g, reason: collision with root package name */
    public l36.f0 f397187g;

    /* renamed from: h, reason: collision with root package name */
    public final l36.w0 f397188h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f397189i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f397190m;

    public u0(l36.q0 q0Var, l36.w0 w0Var, boolean z17) {
        this.f397184d = q0Var;
        this.f397188h = w0Var;
        this.f397189i = z17;
        this.f397185e = new p36.l(q0Var, z17);
        l36.s0 s0Var = new l36.s0(this);
        this.f397186f = s0Var;
        s0Var.g(q0Var.D, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public void a() {
        p36.d dVar;
        o36.d dVar2;
        p36.l lVar = this.f397185e;
        lVar.f433273d = true;
        o36.j jVar = lVar.f433271b;
        if (jVar != null) {
            synchronized (jVar.f424322d) {
                jVar.f424331m = true;
                dVar = jVar.f424332n;
                dVar2 = jVar.f424328j;
            }
            if (dVar != null) {
                dVar.mo157819xae7a2e7a();
            } else if (dVar2 != null) {
                m36.e.d(dVar2.f424294d);
            }
        }
    }

    public void b(l36.o oVar) {
        synchronized (this) {
            if (this.f397190m) {
                throw new java.lang.IllegalStateException("Already Executed");
            }
            this.f397190m = true;
        }
        this.f397185e.f433272c = t36.k.f496994a.j("response.body().close()");
        this.f397187g.getClass();
        l36.z zVar = this.f397184d.f397120d;
        l36.t0 t0Var = new l36.t0(this, oVar);
        synchronized (zVar) {
            ((java.util.ArrayDeque) zVar.f397221b).add(t0Var);
        }
        zVar.b();
    }

    public l36.a1 c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f397184d.f397124h);
        arrayList.add(this.f397185e);
        arrayList.add(new p36.a(this.f397184d.f397128o));
        l36.q0 q0Var = this.f397184d;
        l36.j jVar = q0Var.f397129p;
        arrayList.add(new n36.b(jVar != null ? jVar.f397049d : q0Var.f397130q));
        arrayList.add(new o36.a(this.f397184d));
        if (!this.f397189i) {
            arrayList.addAll(this.f397184d.f397125i);
        }
        arrayList.add(new p36.c(this.f397189i));
        l36.w0 w0Var = this.f397188h;
        l36.f0 f0Var = this.f397187g;
        l36.q0 q0Var2 = this.f397184d;
        l36.a1 a17 = new p36.i(arrayList, null, null, null, 0, w0Var, this, f0Var, q0Var2.E, q0Var2.F, q0Var2.G).a(w0Var, null, null, null);
        if (!this.f397185e.f433273d) {
            return a17;
        }
        m36.e.c(a17);
        throw new java.io.IOException("Canceled");
    }

    /* renamed from: clone */
    public java.lang.Object m145047x5a5dd5d() {
        l36.q0 q0Var = this.f397184d;
        l36.u0 u0Var = new l36.u0(q0Var, this.f397188h, this.f397189i);
        u0Var.f397187g = ((l36.d0) q0Var.f397126m).f397007a;
        return u0Var;
    }

    public java.io.IOException d(java.io.IOException iOException) {
        if (!this.f397186f.j()) {
            return iOException;
        }
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public java.lang.String e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f397185e.f433273d ? "canceled " : "");
        sb6.append(this.f397189i ? "web socket" : "call");
        sb6.append(" to ");
        sb6.append(this.f397188h.f397214a.n());
        return sb6.toString();
    }
}
