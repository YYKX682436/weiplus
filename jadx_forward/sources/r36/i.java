package r36;

/* loaded from: classes16.dex */
public final class i implements p36.d {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f450949f = m36.e.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f450950g = m36.e.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final l36.l0 f450951a;

    /* renamed from: b, reason: collision with root package name */
    public final o36.j f450952b;

    /* renamed from: c, reason: collision with root package name */
    public final r36.z f450953c;

    /* renamed from: d, reason: collision with root package name */
    public r36.g0 f450954d;

    /* renamed from: e, reason: collision with root package name */
    public final l36.r0 f450955e;

    public i(l36.q0 q0Var, l36.l0 l0Var, o36.j jVar, r36.z zVar) {
        this.f450951a = l0Var;
        this.f450952b = jVar;
        this.f450953c = zVar;
        java.util.List list = q0Var.f397122f;
        l36.r0 r0Var = l36.r0.H2_PRIOR_KNOWLEDGE;
        this.f450955e = list.contains(r0Var) ? r0Var : l36.r0.HTTP_2;
    }

    @Override // p36.d
    public void a(l36.w0 w0Var) {
        int i17;
        r36.g0 g0Var;
        if (this.f450954d != null) {
            return;
        }
        w0Var.getClass();
        l36.i0 i0Var = w0Var.f397216c;
        java.util.ArrayList arrayList = new java.util.ArrayList((i0Var.f397048a.length / 2) + 4);
        arrayList.add(new r36.c(r36.c.f450883f, w0Var.f397215b));
        x36.o oVar = r36.c.f450884g;
        l36.k0 k0Var = w0Var.f397214a;
        arrayList.add(new r36.c(oVar, p36.k.a(k0Var)));
        java.lang.String a17 = w0Var.a("Host");
        if (a17 != null) {
            arrayList.add(new r36.c(r36.c.f450886i, a17));
        }
        arrayList.add(new r36.c(r36.c.f450885h, k0Var.f397064a));
        int length = i0Var.f397048a.length / 2;
        for (int i18 = 0; i18 < length; i18++) {
            x36.o a18 = x36.o.f533229h.a(i0Var.d(i18).toLowerCase(java.util.Locale.US));
            if (!f450949f.contains(a18.u())) {
                arrayList.add(new r36.c(a18, i0Var.f(i18)));
            }
        }
        r36.z zVar = this.f450953c;
        boolean z17 = !false;
        synchronized (zVar.A) {
            synchronized (zVar) {
                if (zVar.f451009i > 1073741823) {
                    zVar.j(r36.b.REFUSED_STREAM);
                }
                if (zVar.f451010m) {
                    throw new r36.a();
                }
                i17 = zVar.f451009i;
                zVar.f451009i = i17 + 2;
                g0Var = new r36.g0(i17, zVar, z17, false, null);
                if (g0Var.f()) {
                    zVar.f451006f.put(java.lang.Integer.valueOf(i17), g0Var);
                }
            }
            r36.h0 h0Var = zVar.A;
            synchronized (h0Var) {
                if (h0Var.f450947h) {
                    throw new java.io.IOException("closed");
                }
                h0Var.i(z17, i17, arrayList);
            }
        }
        r36.h0 h0Var2 = zVar.A;
        synchronized (h0Var2) {
            if (h0Var2.f450947h) {
                throw new java.io.IOException("closed");
            }
            h0Var2.f450943d.flush();
        }
        this.f450954d = g0Var;
        r36.f0 f0Var = g0Var.f450936i;
        long j17 = ((p36.i) this.f450951a).f433264j;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        f0Var.g(j17, timeUnit);
        this.f450954d.f450937j.g(((p36.i) this.f450951a).f433265k, timeUnit);
    }

    @Override // p36.d
    public x36.f0 b(l36.w0 w0Var, long j17) {
        r36.g0 g0Var = this.f450954d;
        synchronized (g0Var) {
            if (!g0Var.f450933f && !g0Var.e()) {
                throw new java.lang.IllegalStateException("reply before requesting the sink");
            }
        }
        return g0Var.f450935h;
    }

    @Override // p36.d
    public void c() {
        this.f450953c.m161501x5d03b04();
    }

    @Override // p36.d
    /* renamed from: cancel */
    public void mo157819xae7a2e7a() {
        r36.g0 g0Var = this.f450954d;
        if (g0Var != null) {
            r36.b bVar = r36.b.CANCEL;
            if (g0Var.d(bVar)) {
                g0Var.f450931d.p(g0Var.f450930c, bVar);
            }
        }
    }

    @Override // p36.d
    public void d() {
        r36.g0 g0Var = this.f450954d;
        synchronized (g0Var) {
            if (!g0Var.f450933f && !g0Var.e()) {
                throw new java.lang.IllegalStateException("reply before requesting the sink");
            }
        }
        g0Var.f450935h.close();
    }

    @Override // p36.d
    public l36.c1 e(l36.a1 a1Var) {
        o36.j jVar = this.f450952b;
        l36.f0 f0Var = jVar.f424324f;
        l36.n nVar = jVar.f424323e;
        f0Var.getClass();
        return new p36.j(a1Var.b("Content-Type"), p36.g.a(a1Var), x36.v.b(new r36.h(this, this.f450954d.f450934g)));
    }

    @Override // p36.d
    public l36.z0 f(boolean z17) {
        l36.i0 i0Var;
        r36.g0 g0Var = this.f450954d;
        synchronized (g0Var) {
            g0Var.f450936i.i();
            while (((java.util.ArrayDeque) g0Var.f450932e).isEmpty() && g0Var.f450938k == null) {
                try {
                    g0Var.g();
                } catch (java.lang.Throwable th6) {
                    g0Var.f450936i.m();
                    throw th6;
                }
            }
            g0Var.f450936i.m();
            if (((java.util.ArrayDeque) g0Var.f450932e).isEmpty()) {
                throw new r36.n0(g0Var.f450938k);
            }
            i0Var = (l36.i0) ((java.util.ArrayDeque) g0Var.f450932e).removeFirst();
        }
        l36.r0 r0Var = this.f450955e;
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        int length = i0Var.f397048a.length / 2;
        p36.m mVar = null;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String d17 = i0Var.d(i17);
            java.lang.String f17 = i0Var.f(i17);
            if (d17.equals(":status")) {
                mVar = p36.m.a("HTTP/1.1 " + f17);
            } else if (!f450950g.contains(d17)) {
                ((l36.o0) m36.a.f404915a).getClass();
                arrayList.add(d17);
                arrayList.add(f17.trim());
            }
        }
        if (mVar == null) {
            throw new java.net.ProtocolException("Expected ':status' header not present");
        }
        l36.z0 z0Var = new l36.z0();
        z0Var.f397225b = r0Var;
        z0Var.f397226c = mVar.f433275b;
        z0Var.f397227d = mVar.f433276c;
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        l36.h0 h0Var = new l36.h0();
        java.util.Collections.addAll(h0Var.f397035a, strArr);
        z0Var.f397229f = h0Var;
        if (z17) {
            ((l36.o0) m36.a.f404915a).getClass();
            if (z0Var.f397226c == 100) {
                return null;
            }
        }
        return z0Var;
    }
}
