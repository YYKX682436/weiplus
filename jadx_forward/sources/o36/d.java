package o36;

/* loaded from: classes16.dex */
public final class d extends r36.t {

    /* renamed from: b, reason: collision with root package name */
    public final l36.t f424292b;

    /* renamed from: c, reason: collision with root package name */
    public final l36.d1 f424293c;

    /* renamed from: d, reason: collision with root package name */
    public java.net.Socket f424294d;

    /* renamed from: e, reason: collision with root package name */
    public java.net.Socket f424295e;

    /* renamed from: f, reason: collision with root package name */
    public l36.g0 f424296f;

    /* renamed from: g, reason: collision with root package name */
    public l36.r0 f424297g;

    /* renamed from: h, reason: collision with root package name */
    public r36.z f424298h;

    /* renamed from: i, reason: collision with root package name */
    public x36.m f424299i;

    /* renamed from: j, reason: collision with root package name */
    public x36.l f424300j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f424301k;

    /* renamed from: l, reason: collision with root package name */
    public int f424302l;

    /* renamed from: m, reason: collision with root package name */
    public int f424303m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f424304n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public long f424305o = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;

    public d(l36.t tVar, l36.d1 d1Var) {
        this.f424292b = tVar;
        this.f424293c = d1Var;
    }

    @Override // r36.t
    public void a(r36.z zVar) {
        int i17;
        synchronized (this.f424292b) {
            try {
                synchronized (zVar) {
                    r36.m0 m0Var = zVar.f451022y;
                    i17 = (m0Var.f450973a & 16) != 0 ? m0Var.f450974b[4] : Integer.MAX_VALUE;
                }
                this.f424303m = i17;
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // r36.t
    public void b(r36.g0 g0Var) {
        g0Var.c(r36.b.REFUSED_STREAM);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0176 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r16, int r17, int r18, int r19, boolean r20, l36.n r21, l36.f0 r22) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o36.d.c(int, int, int, int, boolean, l36.n, l36.f0):void");
    }

    public final void d(int i17, int i18, l36.n nVar, l36.f0 f0Var) {
        l36.d1 d1Var = this.f424293c;
        java.net.Proxy proxy = d1Var.f397009b;
        this.f424294d = (proxy.type() == java.net.Proxy.Type.DIRECT || proxy.type() == java.net.Proxy.Type.HTTP) ? d1Var.f397008a.f396979c.createSocket() : new java.net.Socket(proxy);
        java.net.InetSocketAddress inetSocketAddress = d1Var.f397010c;
        f0Var.getClass();
        this.f424294d.setSoTimeout(i18);
        try {
            t36.k.f496994a.g(this.f424294d, d1Var.f397010c, i17);
            try {
                this.f424299i = x36.v.b(x36.v.g(this.f424294d));
                this.f424300j = x36.v.a(x36.v.d(this.f424294d));
            } catch (java.lang.NullPointerException e17) {
                if ("throw with null exception".equals(e17.getMessage())) {
                    throw new java.io.IOException(e17);
                }
            }
        } catch (java.net.ConnectException e18) {
            java.net.ConnectException connectException = new java.net.ConnectException("Failed to connect to " + d1Var.f397010c);
            connectException.initCause(e18);
            throw connectException;
        }
    }

    public final void e(int i17, int i18, int i19, l36.n nVar, l36.f0 f0Var) {
        l36.v0 v0Var = new l36.v0();
        l36.d1 d1Var = this.f424293c;
        v0Var.f(d1Var.f397008a.f396977a);
        v0Var.c("CONNECT", null);
        l36.a aVar = d1Var.f397008a;
        v0Var.f397199c.e("Host", m36.e.k(aVar.f396977a, true));
        v0Var.f397199c.e("Proxy-Connection", "Keep-Alive");
        v0Var.f397199c.e("User-Agent", "okhttp/3.12.13");
        l36.w0 a17 = v0Var.a();
        l36.z0 z0Var = new l36.z0();
        z0Var.f397224a = a17;
        z0Var.f397225b = l36.r0.HTTP_1_1;
        z0Var.f397226c = 407;
        z0Var.f397227d = "Preemptive Authenticate";
        z0Var.f397230g = m36.e.f404921c;
        z0Var.f397234k = -1L;
        z0Var.f397235l = -1L;
        z0Var.f397229f.e("Proxy-Authenticate", "OkHttp-Preemptive");
        z0Var.a();
        aVar.f396980d.getClass();
        d(i17, i18, nVar, f0Var);
        java.lang.String str = "CONNECT " + m36.e.k(a17.f397214a, true) + " HTTP/1.1";
        x36.m mVar = this.f424299i;
        q36.h hVar = new q36.h(null, null, mVar, this.f424300j);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        mVar.h().g(i18, timeUnit);
        this.f424300j.h().g(i19, timeUnit);
        hVar.i(a17.f397216c, str);
        hVar.d();
        l36.z0 f17 = hVar.f(false);
        f17.f397224a = a17;
        l36.a1 a18 = f17.a();
        long a19 = p36.g.a(a18);
        if (a19 == -1) {
            a19 = 0;
        }
        x36.h0 g17 = hVar.g(a19);
        m36.e.q(g17, Integer.MAX_VALUE, timeUnit);
        ((q36.f) g17).close();
        int i27 = a18.f396990f;
        if (i27 == 200) {
            if (!this.f424299i.m().o1() || !this.f424300j.m().o1()) {
                throw new java.io.IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (i27 == 407) {
                d1Var.f397008a.f396980d.getClass();
                throw new java.io.IOException("Failed to authenticate with proxy");
            }
            throw new java.io.IOException("Unexpected response code for CONNECT: " + i27);
        }
    }

    public final void f(o36.b bVar, int i17, l36.n nVar, l36.f0 f0Var) {
        javax.net.ssl.SSLSocket sSLSocket;
        l36.d1 d1Var = this.f424293c;
        l36.a aVar = d1Var.f397008a;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = aVar.f396985i;
        l36.r0 r0Var = l36.r0.HTTP_1_1;
        if (sSLSocketFactory == null) {
            java.util.List list = aVar.f396981e;
            l36.r0 r0Var2 = l36.r0.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(r0Var2)) {
                this.f424295e = this.f424294d;
                this.f424297g = r0Var;
                return;
            } else {
                this.f424295e = this.f424294d;
                this.f424297g = r0Var2;
                i(i17);
                return;
            }
        }
        f0Var.getClass();
        l36.a aVar2 = d1Var.f397008a;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = aVar2.f396985i;
        l36.k0 k0Var = aVar2.f396977a;
        try {
            try {
                sSLSocket = (javax.net.ssl.SSLSocket) sSLSocketFactory2.createSocket(this.f424294d, k0Var.f397067d, k0Var.f397068e, true);
            } catch (java.lang.Throwable th6) {
                th = th6;
                sSLSocket = null;
            }
        } catch (java.lang.AssertionError e17) {
            e = e17;
        }
        try {
            l36.v a17 = bVar.a(sSLSocket);
            java.lang.String str = k0Var.f397067d;
            boolean z17 = a17.f397194b;
            if (z17) {
                t36.k.f496994a.f(sSLSocket, str, aVar2.f396981e);
            }
            sSLSocket.startHandshake();
            javax.net.ssl.SSLSession session = sSLSocket.getSession();
            l36.g0 a18 = l36.g0.a(session);
            boolean verify = aVar2.f396986j.verify(str, session);
            java.util.List list2 = a18.f397029c;
            if (verify) {
                aVar2.f396987k.a(str, list2);
                java.lang.String i18 = z17 ? t36.k.f496994a.i(sSLSocket) : null;
                this.f424295e = sSLSocket;
                this.f424299i = x36.v.b(x36.v.g(sSLSocket));
                this.f424300j = x36.v.a(x36.v.d(this.f424295e));
                this.f424296f = a18;
                if (i18 != null) {
                    r0Var = l36.r0.a(i18);
                }
                this.f424297g = r0Var;
                t36.k.f496994a.a(sSLSocket);
                if (this.f424297g == l36.r0.HTTP_2) {
                    i(i17);
                    return;
                }
                return;
            }
            if (list2.isEmpty()) {
                throw new javax.net.ssl.SSLPeerUnverifiedException("Hostname " + str + " not verified (no certificates)");
            }
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) list2.get(0);
            throw new javax.net.ssl.SSLPeerUnverifiedException("Hostname " + str + " not verified:\n    certificate: " + l36.p.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + v36.d.a(x509Certificate));
        } catch (java.lang.AssertionError e18) {
            e = e18;
            if (!m36.e.o(e)) {
                throw e;
            }
            throw new java.io.IOException(e);
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (sSLSocket != null) {
                t36.k.f496994a.a(sSLSocket);
            }
            m36.e.d(sSLSocket);
            throw th;
        }
    }

    public boolean g(l36.a aVar, l36.d1 d1Var) {
        if (((java.util.ArrayList) this.f424304n).size() < this.f424303m && !this.f424301k) {
            m36.a aVar2 = m36.a.f404915a;
            l36.d1 d1Var2 = this.f424293c;
            l36.a aVar3 = d1Var2.f397008a;
            ((l36.o0) aVar2).getClass();
            if (!aVar3.a(aVar)) {
                return false;
            }
            l36.k0 k0Var = aVar.f396977a;
            if (k0Var.f397067d.equals(d1Var2.f397008a.f396977a.f397067d)) {
                return true;
            }
            if (this.f424298h == null || d1Var == null || d1Var.f397009b.type() != java.net.Proxy.Type.DIRECT || d1Var2.f397009b.type() != java.net.Proxy.Type.DIRECT || !d1Var2.f397010c.equals(d1Var.f397010c) || d1Var.f397008a.f396986j != v36.d.f514708a || !j(k0Var)) {
                return false;
            }
            try {
                aVar.f396987k.a(k0Var.f397067d, this.f424296f.f397029c);
                return true;
            } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public p36.d h(l36.q0 q0Var, l36.l0 l0Var, o36.j jVar) {
        if (this.f424298h != null) {
            return new r36.i(q0Var, l0Var, jVar, this.f424298h);
        }
        this.f424295e.setSoTimeout(((p36.i) l0Var).f433264j);
        x36.j0 h17 = this.f424299i.h();
        long j17 = ((p36.i) l0Var).f433264j;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        h17.g(j17, timeUnit);
        this.f424300j.h().g(r6.f433265k, timeUnit);
        return new q36.h(q0Var, jVar, this.f424299i, this.f424300j);
    }

    public final void i(int i17) {
        this.f424295e.setSoTimeout(0);
        r36.q qVar = new r36.q(true);
        java.net.Socket socket = this.f424295e;
        java.lang.String str = this.f424293c.f397008a.f396977a.f397067d;
        x36.m mVar = this.f424299i;
        x36.l lVar = this.f424300j;
        qVar.f450984a = socket;
        qVar.f450985b = str;
        qVar.f450986c = mVar;
        qVar.f450987d = lVar;
        qVar.f450988e = this;
        qVar.f450989f = i17;
        r36.z zVar = new r36.z(qVar);
        this.f424298h = zVar;
        r36.h0 h0Var = zVar.A;
        synchronized (h0Var) {
            if (h0Var.f450947h) {
                throw new java.io.IOException("closed");
            }
            if (h0Var.f450944e) {
                java.util.logging.Logger logger = r36.h0.f450942m;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    logger.fine(m36.e.j(">> CONNECTION %s", r36.g.f450924a.m()));
                }
                x36.l lVar2 = h0Var.f450943d;
                byte[] bArr = r36.g.f450924a.f533232f;
                byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
                lVar2.mo174975x6c257df(copyOf);
                h0Var.f450943d.flush();
            }
        }
        r36.h0 h0Var2 = zVar.A;
        r36.m0 m0Var = zVar.f451021x;
        synchronized (h0Var2) {
            if (h0Var2.f450947h) {
                throw new java.io.IOException("closed");
            }
            h0Var2.c(0, java.lang.Integer.bitCount(m0Var.f450973a) * 6, (byte) 4, (byte) 0);
            int i18 = 0;
            while (i18 < 10) {
                if (((1 << i18) & m0Var.f450973a) != 0) {
                    h0Var2.f450943d.i1(i18 == 4 ? 3 : i18 == 7 ? 4 : i18);
                    h0Var2.f450943d.o(m0Var.f450974b[i18]);
                }
                i18++;
            }
            h0Var2.f450943d.flush();
        }
        if (zVar.f451021x.a() != 65535) {
            zVar.A.l(0, r0 - 65535);
        }
        new java.lang.Thread(zVar.B).start();
    }

    public boolean j(l36.k0 k0Var) {
        int i17 = k0Var.f397068e;
        l36.k0 k0Var2 = this.f424293c.f397008a.f396977a;
        if (i17 != k0Var2.f397068e) {
            return false;
        }
        java.lang.String str = k0Var2.f397067d;
        java.lang.String str2 = k0Var.f397067d;
        if (str2.equals(str)) {
            return true;
        }
        l36.g0 g0Var = this.f424296f;
        return g0Var != null && v36.d.f514708a.c(str2, (java.security.cert.X509Certificate) g0Var.f397029c.get(0));
    }

    /* renamed from: toString */
    public java.lang.String m150561x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Connection{");
        l36.d1 d1Var = this.f424293c;
        sb6.append(d1Var.f397008a.f396977a.f397067d);
        sb6.append(":");
        sb6.append(d1Var.f397008a.f396977a.f397068e);
        sb6.append(", proxy=");
        sb6.append(d1Var.f397009b);
        sb6.append(" hostAddress=");
        sb6.append(d1Var.f397010c);
        sb6.append(" cipherSuite=");
        l36.g0 g0Var = this.f424296f;
        sb6.append(g0Var != null ? g0Var.f397028b : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc);
        sb6.append(" protocol=");
        sb6.append(this.f424297g);
        sb6.append('}');
        return sb6.toString();
    }
}
