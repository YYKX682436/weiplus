package q36;

/* loaded from: classes16.dex */
public final class h implements p36.d {

    /* renamed from: a, reason: collision with root package name */
    public final l36.q0 f441531a;

    /* renamed from: b, reason: collision with root package name */
    public final o36.j f441532b;

    /* renamed from: c, reason: collision with root package name */
    public final x36.m f441533c;

    /* renamed from: d, reason: collision with root package name */
    public final x36.l f441534d;

    /* renamed from: e, reason: collision with root package name */
    public int f441535e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f441536f = 262144;

    public h(l36.q0 q0Var, o36.j jVar, x36.m mVar, x36.l lVar) {
        this.f441531a = q0Var;
        this.f441532b = jVar;
        this.f441533c = mVar;
        this.f441534d = lVar;
    }

    @Override // p36.d
    public void a(l36.w0 w0Var) {
        java.net.Proxy.Type type = this.f441532b.b().f424293c.f397009b.type();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(w0Var.f397215b);
        sb6.append(' ');
        l36.k0 k0Var = w0Var.f397214a;
        if (!k0Var.f397064a.equals("https") && type == java.net.Proxy.Type.HTTP) {
            sb6.append(k0Var);
        } else {
            sb6.append(p36.k.a(k0Var));
        }
        sb6.append(" HTTP/1.1");
        i(w0Var.f397216c, sb6.toString());
    }

    @Override // p36.d
    public x36.f0 b(l36.w0 w0Var, long j17) {
        if ("chunked".equalsIgnoreCase(w0Var.a("Transfer-Encoding"))) {
            if (this.f441535e == 1) {
                this.f441535e = 2;
                return new q36.c(this);
            }
            throw new java.lang.IllegalStateException("state: " + this.f441535e);
        }
        if (j17 == -1) {
            throw new java.lang.IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f441535e == 1) {
            this.f441535e = 2;
            return new q36.e(this, j17);
        }
        throw new java.lang.IllegalStateException("state: " + this.f441535e);
    }

    @Override // p36.d
    public void c() {
        this.f441534d.flush();
    }

    @Override // p36.d
    /* renamed from: cancel */
    public void mo157819xae7a2e7a() {
        o36.d b17 = this.f441532b.b();
        if (b17 != null) {
            m36.e.d(b17.f424294d);
        }
    }

    @Override // p36.d
    public void d() {
        this.f441534d.flush();
    }

    @Override // p36.d
    public l36.c1 e(l36.a1 a1Var) {
        o36.j jVar = this.f441532b;
        l36.f0 f0Var = jVar.f424324f;
        l36.n nVar = jVar.f424323e;
        f0Var.getClass();
        java.lang.String b17 = a1Var.b("Content-Type");
        if (!p36.g.b(a1Var)) {
            return new p36.j(b17, 0L, x36.v.b(g(0L)));
        }
        if ("chunked".equalsIgnoreCase(a1Var.b("Transfer-Encoding"))) {
            l36.k0 k0Var = a1Var.f396988d.f397214a;
            if (this.f441535e == 4) {
                this.f441535e = 5;
                return new p36.j(b17, -1L, x36.v.b(new q36.d(this, k0Var)));
            }
            throw new java.lang.IllegalStateException("state: " + this.f441535e);
        }
        long a17 = p36.g.a(a1Var);
        if (a17 != -1) {
            return new p36.j(b17, a17, x36.v.b(g(a17)));
        }
        if (this.f441535e != 4) {
            throw new java.lang.IllegalStateException("state: " + this.f441535e);
        }
        if (jVar == null) {
            throw new java.lang.IllegalStateException("streamAllocation == null");
        }
        this.f441535e = 5;
        jVar.f();
        return new p36.j(b17, -1L, x36.v.b(new q36.g(this)));
    }

    @Override // p36.d
    public l36.z0 f(boolean z17) {
        int i17 = this.f441535e;
        if (i17 != 1 && i17 != 3) {
            throw new java.lang.IllegalStateException("state: " + this.f441535e);
        }
        try {
            java.lang.String A0 = this.f441533c.A0(this.f441536f);
            this.f441536f -= A0.length();
            p36.m a17 = p36.m.a(A0);
            int i18 = a17.f433275b;
            l36.z0 z0Var = new l36.z0();
            z0Var.f397225b = a17.f433274a;
            z0Var.f397226c = i18;
            z0Var.f397227d = a17.f433276c;
            z0Var.f397229f = h().e();
            if (z17 && i18 == 100) {
                return null;
            }
            if (i18 == 100) {
                this.f441535e = 3;
                return z0Var;
            }
            this.f441535e = 4;
            return z0Var;
        } catch (java.io.EOFException e17) {
            java.io.IOException iOException = new java.io.IOException("unexpected end of stream on " + this.f441532b);
            iOException.initCause(e17);
            throw iOException;
        }
    }

    public x36.h0 g(long j17) {
        if (this.f441535e == 4) {
            this.f441535e = 5;
            return new q36.f(this, j17);
        }
        throw new java.lang.IllegalStateException("state: " + this.f441535e);
    }

    public l36.i0 h() {
        l36.h0 h0Var = new l36.h0();
        while (true) {
            java.lang.String A0 = this.f441533c.A0(this.f441536f);
            this.f441536f -= A0.length();
            if (A0.length() == 0) {
                return new l36.i0(h0Var);
            }
            ((l36.o0) m36.a.f404915a).getClass();
            h0Var.a(A0);
        }
    }

    public void i(l36.i0 i0Var, java.lang.String str) {
        if (this.f441535e != 0) {
            throw new java.lang.IllegalStateException("state: " + this.f441535e);
        }
        x36.l lVar = this.f441534d;
        lVar.F0(str).F0(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
        int length = i0Var.f397048a.length / 2;
        for (int i17 = 0; i17 < length; i17++) {
            lVar.F0(i0Var.d(i17)).F0(": ").F0(i0Var.f(i17)).F0(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
        }
        lVar.F0(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
        this.f441535e = 1;
    }
}
