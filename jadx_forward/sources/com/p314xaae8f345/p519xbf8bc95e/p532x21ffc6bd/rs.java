package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class rs extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu {

    /* renamed from: a, reason: collision with root package name */
    private static final int f132792a = 3;

    /* renamed from: b, reason: collision with root package name */
    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rs f132793b;

    private static com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4370x811c48b3 b(byte[] bArr) {
        for (int i17 = 0; i17 < 3; i17++) {
            try {
                com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36694x5afb953c = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.df) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.du) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.du.class)).i()).m36694x5afb953c(bArr);
                if (m36694x5afb953c != null && m36694x5afb953c.f16977x2eefaa != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f fVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.f();
                    fVar.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    fVar.a(m36694x5afb953c.f16977x2eefaa);
                    return (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4370x811c48b3) fVar.b(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55720x1b30a884, true, (java.lang.ClassLoader) null);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static synchronized com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rs c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rs rsVar;
        synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rs.class) {
            if (f132793b == null) {
                f132793b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rs();
            }
            rsVar = f132793b;
        }
        return rsVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu
    public final byte[] a(byte[] bArr) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4370x811c48b3 b17;
        if (bArr != null) {
            try {
                if (bArr.length == 0 || (b17 = b(bArr)) == null) {
                    return null;
                }
                return b17.f17253xc84dc81d;
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    private static byte[] a(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.rtt.C4370x811c48b3 c4370x811c48b3) {
        if (c4370x811c48b3 == null) {
            return null;
        }
        return c4370x811c48b3.f17253xc84dc81d;
    }
}
