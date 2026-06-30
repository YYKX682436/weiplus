package p36;

/* loaded from: classes16.dex */
public final class l implements l36.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final l36.q0 f433270a;

    /* renamed from: b, reason: collision with root package name */
    public volatile o36.j f433271b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f433272c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f433273d;

    public l(l36.q0 q0Var, boolean z17) {
        this.f433270a = q0Var;
    }

    @Override // l36.m0
    public l36.a1 a(l36.l0 l0Var) {
        l36.a1 a17;
        l36.w0 c17;
        p36.d dVar;
        l36.w0 w0Var = ((p36.i) l0Var).f433260f;
        p36.i iVar = (p36.i) l0Var;
        l36.n nVar = iVar.f433261g;
        l36.f0 f0Var = iVar.f433262h;
        o36.j jVar = new o36.j(this.f433270a.f397138y, b(w0Var.f397214a), nVar, f0Var, this.f433272c);
        this.f433271b = jVar;
        int i17 = 0;
        l36.a1 a1Var = null;
        while (!this.f433273d) {
            try {
                try {
                    a17 = iVar.a(w0Var, jVar, null, null);
                    if (a1Var != null) {
                        l36.z0 z0Var = new l36.z0(a17);
                        l36.z0 z0Var2 = new l36.z0(a1Var);
                        z0Var2.f397230g = null;
                        l36.a1 a18 = z0Var2.a();
                        if (a18.f396994m != null) {
                            throw new java.lang.IllegalArgumentException("priorResponse.body != null");
                        }
                        z0Var.f397233j = a18;
                        a17 = z0Var.a();
                    }
                    try {
                        c17 = c(a17, jVar.f424321c);
                    } catch (java.io.IOException e17) {
                        jVar.g();
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    if (!d(e18, jVar, !(e18 instanceof r36.a), w0Var)) {
                        throw e18;
                    }
                } catch (o36.f e19) {
                    if (!d(e19.f424308e, jVar, false, w0Var)) {
                        throw e19.f424307d;
                    }
                }
                if (c17 == null) {
                    jVar.g();
                    return a17;
                }
                m36.e.c(a17.f396994m);
                int i18 = i17 + 1;
                if (i18 > 20) {
                    jVar.g();
                    throw new java.net.ProtocolException("Too many follow-up requests: " + i18);
                }
                if (f(a17, c17.f397214a)) {
                    synchronized (jVar.f424322d) {
                        dVar = jVar.f424332n;
                    }
                    if (dVar != null) {
                        throw new java.lang.IllegalStateException("Closing the body of " + a17 + " didn't close its backing stream. Bad interceptor?");
                    }
                } else {
                    jVar.g();
                    jVar = new o36.j(this.f433270a.f397138y, b(c17.f397214a), nVar, f0Var, this.f433272c);
                    this.f433271b = jVar;
                }
                a1Var = a17;
                w0Var = c17;
                i17 = i18;
            } catch (java.lang.Throwable th6) {
                jVar.h(null);
                jVar.g();
                throw th6;
            }
        }
        jVar.g();
        throw new java.io.IOException("Canceled");
    }

    public final l36.a b(l36.k0 k0Var) {
        javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        javax.net.ssl.HostnameVerifier hostnameVerifier;
        l36.p pVar;
        boolean equals = k0Var.f397064a.equals("https");
        l36.q0 q0Var = this.f433270a;
        if (equals) {
            sSLSocketFactory = q0Var.f397132s;
            hostnameVerifier = q0Var.f397134u;
            pVar = q0Var.f397135v;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            pVar = null;
        }
        return new l36.a(k0Var.f397067d, k0Var.f397068e, q0Var.f397139z, q0Var.f397131r, sSLSocketFactory, hostnameVerifier, pVar, q0Var.f397136w, q0Var.f397121e, q0Var.f397122f, q0Var.f397123g, q0Var.f397127n);
    }

    public final l36.w0 c(l36.a1 a1Var, l36.d1 d1Var) {
        java.lang.String b17;
        l36.j0 j0Var;
        if (a1Var == null) {
            throw new java.lang.IllegalStateException();
        }
        l36.w0 w0Var = a1Var.f396988d;
        java.lang.String str = w0Var.f397215b;
        l36.y0 y0Var = null;
        l36.q0 q0Var = this.f433270a;
        int i17 = a1Var.f396990f;
        if (i17 == 307 || i17 == 308) {
            if (!str.equals("GET") && !str.equals("HEAD")) {
                return null;
            }
        } else {
            if (i17 == 401) {
                q0Var.f397137x.getClass();
                return null;
            }
            l36.a1 a1Var2 = a1Var.f396997p;
            if (i17 == 503) {
                if ((a1Var2 == null || a1Var2.f396990f != 503) && e(a1Var, Integer.MAX_VALUE) == 0) {
                    return w0Var;
                }
                return null;
            }
            if (i17 == 407) {
                if (d1Var.f397009b.type() != java.net.Proxy.Type.HTTP) {
                    throw new java.net.ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                q0Var.f397136w.getClass();
                return null;
            }
            if (i17 == 408) {
                if (!q0Var.C) {
                    return null;
                }
                if ((a1Var2 == null || a1Var2.f396990f != 408) && e(a1Var, 0) <= 0) {
                    return w0Var;
                }
                return null;
            }
            switch (i17) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!q0Var.B || (b17 = a1Var.b("Location")) == null) {
            return null;
        }
        l36.k0 k0Var = w0Var.f397214a;
        k0Var.getClass();
        try {
            j0Var = new l36.j0();
            j0Var.b(k0Var, b17);
        } catch (java.lang.IllegalArgumentException unused) {
            j0Var = null;
        }
        l36.k0 a17 = j0Var != null ? j0Var.a() : null;
        if (a17 == null) {
            return null;
        }
        if (!a17.f397064a.equals(k0Var.f397064a) && !q0Var.A) {
            return null;
        }
        l36.v0 v0Var = new l36.v0(w0Var);
        if (p36.h.b(str)) {
            boolean equals = str.equals("PROPFIND");
            if (!str.equals("PROPFIND")) {
                v0Var.c("GET", null);
            } else {
                if (equals) {
                    y0Var = null;
                    w0Var.getClass();
                }
                v0Var.c(str, y0Var);
            }
            if (!equals) {
                v0Var.d("Transfer-Encoding");
                v0Var.d("Content-Length");
                v0Var.d("Content-Type");
            }
        }
        if (!f(a1Var, a17)) {
            v0Var.d("Authorization");
        }
        v0Var.f(a17);
        return v0Var.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if ((r3.f424310b < r3.f424309a.size()) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.io.IOException r3, o36.j r4, boolean r5, l36.w0 r6) {
        /*
            r2 = this;
            r4.h(r3)
            l36.q0 r0 = r2.f433270a
            boolean r0 = r0.C
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            if (r5 == 0) goto L15
            r6.getClass()
            boolean r6 = r3 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L15
            return r1
        L15:
            boolean r6 = r3 instanceof java.net.ProtocolException
            r0 = 1
            if (r6 == 0) goto L1b
            goto L37
        L1b:
            boolean r6 = r3 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L26
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L37
            if (r5 != 0) goto L37
            goto L39
        L26:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L33
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L33
            goto L37
        L33:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L39
        L37:
            r3 = r1
            goto L3a
        L39:
            r3 = r0
        L3a:
            if (r3 != 0) goto L3d
            return r1
        L3d:
            l36.d1 r3 = r4.f424321c
            if (r3 != 0) goto L78
            o36.g r3 = r4.f424320b
            if (r3 == 0) goto L54
            int r5 = r3.f424310b
            java.util.List r3 = r3.f424309a
            int r3 = r3.size()
            if (r5 >= r3) goto L51
            r3 = r0
            goto L52
        L51:
            r3 = r1
        L52:
            if (r3 != 0) goto L78
        L54:
            o36.h r3 = r4.f424326h
            int r4 = r3.f424315e
            java.util.List r5 = r3.f424314d
            int r5 = r5.size()
            if (r4 >= r5) goto L62
            r4 = r0
            goto L63
        L62:
            r4 = r1
        L63:
            if (r4 != 0) goto L72
            java.util.List r3 = r3.f424317g
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L70
            goto L72
        L70:
            r3 = r1
            goto L73
        L72:
            r3 = r0
        L73:
            if (r3 == 0) goto L76
            goto L78
        L76:
            r3 = r1
            goto L79
        L78:
            r3 = r0
        L79:
            if (r3 != 0) goto L7c
            return r1
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p36.l.d(java.io.IOException, o36.j, boolean, l36.w0):boolean");
    }

    public final int e(l36.a1 a1Var, int i17) {
        java.lang.String b17 = a1Var.b("Retry-After");
        if (b17 == null) {
            return i17;
        }
        if (b17.matches("\\d+")) {
            return java.lang.Integer.valueOf(b17).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final boolean f(l36.a1 a1Var, l36.k0 k0Var) {
        l36.k0 k0Var2 = a1Var.f396988d.f397214a;
        return k0Var2.f397067d.equals(k0Var.f397067d) && k0Var2.f397068e == k0Var.f397068e && k0Var2.f397064a.equals(k0Var.f397064a);
    }
}
