package l36;

/* loaded from: classes16.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f397036k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f397037l;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f397038a;

    /* renamed from: b, reason: collision with root package name */
    public final l36.i0 f397039b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f397040c;

    /* renamed from: d, reason: collision with root package name */
    public final l36.r0 f397041d;

    /* renamed from: e, reason: collision with root package name */
    public final int f397042e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397043f;

    /* renamed from: g, reason: collision with root package name */
    public final l36.i0 f397044g;

    /* renamed from: h, reason: collision with root package name */
    public final l36.g0 f397045h;

    /* renamed from: i, reason: collision with root package name */
    public final long f397046i;

    /* renamed from: j, reason: collision with root package name */
    public final long f397047j;

    static {
        t36.k kVar = t36.k.f496994a;
        kVar.getClass();
        f397036k = "OkHttp-Sent-Millis";
        kVar.getClass();
        f397037l = "OkHttp-Received-Millis";
    }

    public i(x36.h0 h0Var) {
        l36.e1 e1Var;
        try {
            x36.m b17 = x36.v.b(h0Var);
            x36.b0 b0Var = (x36.b0) b17;
            this.f397038a = b0Var.L0();
            this.f397040c = b0Var.L0();
            l36.h0 h0Var2 = new l36.h0();
            int b18 = l36.j.b(b17);
            for (int i17 = 0; i17 < b18; i17++) {
                h0Var2.a(b0Var.L0());
            }
            this.f397039b = new l36.i0(h0Var2);
            p36.m a17 = p36.m.a(b0Var.L0());
            this.f397041d = a17.f433274a;
            this.f397042e = a17.f433275b;
            this.f397043f = a17.f433276c;
            l36.h0 h0Var3 = new l36.h0();
            int b19 = l36.j.b(b17);
            for (int i18 = 0; i18 < b19; i18++) {
                h0Var3.a(b0Var.L0());
            }
            java.lang.String str = f397036k;
            java.lang.String c17 = h0Var3.c(str);
            java.lang.String str2 = f397037l;
            java.lang.String c18 = h0Var3.c(str2);
            h0Var3.d(str);
            h0Var3.d(str2);
            this.f397046i = c17 != null ? java.lang.Long.parseLong(c17) : 0L;
            this.f397047j = c18 != null ? java.lang.Long.parseLong(c18) : 0L;
            this.f397044g = new l36.i0(h0Var3);
            if (this.f397038a.startsWith("https://")) {
                java.lang.String L0 = b0Var.L0();
                if (L0.length() <= 0) {
                    l36.r a18 = l36.r.a(b0Var.L0());
                    java.util.List a19 = a(b17);
                    java.util.List a27 = a(b17);
                    if (!b0Var.o1()) {
                        e1Var = l36.e1.a(b0Var.L0());
                    } else {
                        e1Var = l36.e1.SSL_3_0;
                    }
                    this.f397045h = new l36.g0(e1Var, a18, m36.e.l(a19), m36.e.l(a27));
                } else {
                    throw new java.io.IOException("expected \"\" but was \"" + L0 + "\"");
                }
            } else {
                this.f397045h = null;
            }
        } finally {
            h0Var.close();
        }
    }

    public final java.util.List a(x36.m mVar) {
        int b17 = l36.j.b(mVar);
        if (b17 == -1) {
            return java.util.Collections.emptyList();
        }
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
            java.util.ArrayList arrayList = new java.util.ArrayList(b17);
            for (int i17 = 0; i17 < b17; i17++) {
                java.lang.String L0 = mVar.L0();
                x36.k kVar = new x36.k();
                kVar.x(x36.o.i(L0));
                arrayList.add(certificateFactory.generateCertificate(new x36.j(kVar)));
            }
            return arrayList;
        } catch (java.security.cert.CertificateException e17) {
            throw new java.io.IOException(e17.getMessage());
        }
    }

    public final void b(x36.l lVar, java.util.List list) {
        try {
            lVar.G(list.size()).e(10);
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                lVar.F0(x36.o.p(((java.security.cert.Certificate) list.get(i17)).getEncoded()).h()).e(10);
            }
        } catch (java.security.cert.CertificateEncodingException e17) {
            throw new java.io.IOException(e17.getMessage());
        }
    }

    public void c(n36.h hVar) {
        x36.l a17 = x36.v.a(hVar.d(0));
        x36.z zVar = (x36.z) a17;
        java.lang.String str = this.f397038a;
        zVar.F0(str);
        zVar.e(10);
        zVar.F0(this.f397040c);
        zVar.e(10);
        l36.i0 i0Var = this.f397039b;
        zVar.G(i0Var.f397048a.length / 2);
        zVar.e(10);
        int length = i0Var.f397048a.length / 2;
        for (int i17 = 0; i17 < length; i17++) {
            zVar.F0(i0Var.d(i17));
            zVar.F0(": ");
            zVar.F0(i0Var.f(i17));
            zVar.e(10);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f397041d == l36.r0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb6.append(' ');
        sb6.append(this.f397042e);
        java.lang.String str2 = this.f397043f;
        if (str2 != null) {
            sb6.append(' ');
            sb6.append(str2);
        }
        zVar.F0(sb6.toString());
        zVar.e(10);
        l36.i0 i0Var2 = this.f397044g;
        zVar.G((i0Var2.f397048a.length / 2) + 2);
        zVar.e(10);
        int length2 = i0Var2.f397048a.length / 2;
        for (int i18 = 0; i18 < length2; i18++) {
            zVar.F0(i0Var2.d(i18));
            zVar.F0(": ");
            zVar.F0(i0Var2.f(i18));
            zVar.e(10);
        }
        zVar.F0(f397036k);
        zVar.F0(": ");
        zVar.G(this.f397046i);
        zVar.e(10);
        zVar.F0(f397037l);
        zVar.F0(": ");
        zVar.G(this.f397047j);
        zVar.e(10);
        if (str.startsWith("https://")) {
            zVar.e(10);
            l36.g0 g0Var = this.f397045h;
            zVar.F0(g0Var.f397028b.f397160a);
            zVar.e(10);
            b(a17, g0Var.f397029c);
            b(a17, g0Var.f397030d);
            zVar.F0(g0Var.f397027a.f397019d);
            zVar.e(10);
        }
        zVar.close();
    }

    public i(l36.a1 a1Var) {
        l36.i0 i0Var;
        this.f397038a = a1Var.f396988d.f397214a.f397071h;
        int i17 = p36.g.f433254a;
        l36.i0 i0Var2 = a1Var.f396995n.f396988d.f397216c;
        l36.i0 i0Var3 = a1Var.f396993i;
        java.util.Set f17 = p36.g.f(i0Var3);
        if (f17.isEmpty()) {
            i0Var = new l36.i0(new l36.h0());
        } else {
            l36.h0 h0Var = new l36.h0();
            int length = i0Var2.f397048a.length / 2;
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String d17 = i0Var2.d(i18);
                if (f17.contains(d17)) {
                    java.lang.String f18 = i0Var2.f(i18);
                    l36.i0.a(d17);
                    l36.i0.b(f18, d17);
                    h0Var.b(d17, f18);
                }
            }
            i0Var = new l36.i0(h0Var);
        }
        this.f397039b = i0Var;
        this.f397040c = a1Var.f396988d.f397215b;
        this.f397041d = a1Var.f396989e;
        this.f397042e = a1Var.f396990f;
        this.f397043f = a1Var.f396991g;
        this.f397044g = i0Var3;
        this.f397045h = a1Var.f396992h;
        this.f397046i = a1Var.f396998q;
        this.f397047j = a1Var.f396999r;
    }
}
