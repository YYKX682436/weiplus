package c9;

/* loaded from: classes15.dex */
public final class b implements z8.b {

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f121240a = new t9.p();

    /* renamed from: b, reason: collision with root package name */
    public final t9.o f121241b = new t9.o();

    /* renamed from: c, reason: collision with root package name */
    public t9.a0 f121242c;

    @Override // z8.b
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f a(z8.e eVar) {
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry c1618xa829b788;
        long j17;
        java.util.ArrayList arrayList;
        long j18;
        long j19;
        boolean z17;
        boolean z18;
        boolean z19;
        int i17;
        int i18;
        int i19;
        long j27;
        boolean z27;
        java.util.List list;
        long j28;
        long j29;
        boolean z28;
        boolean z29;
        boolean z37;
        boolean z38;
        int i27;
        int i28;
        int i29;
        boolean z39;
        t9.a0 a0Var = this.f121242c;
        if (a0Var == null || eVar.f552159i != a0Var.c()) {
            t9.a0 a0Var2 = new t9.a0(eVar.f425144g);
            this.f121242c = a0Var2;
            a0Var2.a(eVar.f425144g - eVar.f552159i);
        }
        java.nio.ByteBuffer byteBuffer = eVar.f425143f;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        t9.p pVar = this.f121240a;
        pVar.u(array, limit);
        t9.o oVar = this.f121241b;
        oVar.f498069a = array;
        oVar.f498070b = 0;
        oVar.f498071c = 0;
        oVar.f498072d = limit;
        oVar.f(39);
        long d17 = (oVar.d(1) << 32) | oVar.d(32);
        oVar.f(20);
        int d18 = oVar.d(12);
        int d19 = oVar.d(8);
        pVar.x(14);
        if (d19 == 0) {
            c1618xa829b788 = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1618xa829b788();
        } else if (d19 != 255) {
            long j37 = 128;
            long j38 = -9223372036854775807L;
            if (d19 == 4) {
                int m17 = pVar.m();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(m17);
                int i37 = 0;
                while (i37 < m17) {
                    long n17 = pVar.n();
                    boolean z47 = (pVar.m() & 128) != 0;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    if (z47) {
                        j17 = j37;
                        arrayList = arrayList3;
                        j18 = -9223372036854775807L;
                        j19 = -9223372036854775807L;
                        z17 = false;
                        z18 = false;
                        z19 = false;
                        i17 = 0;
                        i18 = 0;
                        i19 = 0;
                    } else {
                        int m18 = pVar.m();
                        boolean z48 = (m18 & 128) != 0;
                        boolean z49 = (m18 & 64) != 0;
                        boolean z57 = (m18 & 32) != 0;
                        long n18 = z49 ? pVar.n() : -9223372036854775807L;
                        if (!z49) {
                            int m19 = pVar.m();
                            java.util.ArrayList arrayList4 = new java.util.ArrayList(m19);
                            for (int i38 = 0; i38 < m19; i38++) {
                                arrayList4.add(new c9.g(pVar.m(), pVar.n()));
                            }
                            arrayList3 = arrayList4;
                        }
                        if (z57) {
                            long m27 = pVar.m();
                            j17 = 128;
                            z27 = (m27 & 128) != 0;
                            j27 = pVar.n() | ((m27 & 1) << 32);
                        } else {
                            j17 = 128;
                            j27 = -9223372036854775807L;
                            z27 = false;
                        }
                        z19 = z27;
                        arrayList = arrayList3;
                        z17 = z48;
                        z18 = z49;
                        j18 = n18;
                        j19 = j27;
                        i17 = pVar.r();
                        i18 = pVar.m();
                        i19 = pVar.m();
                    }
                    arrayList2.add(new c9.h(n17, z47, z17, z18, arrayList, j18, z19, j19, i17, i18, i19));
                    i37++;
                    j37 = j17;
                }
                c1618xa829b788 = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1619x5d0d9678(arrayList2);
            } else if (d19 == 5) {
                t9.a0 a0Var3 = this.f121242c;
                long n19 = pVar.n();
                boolean z58 = (pVar.m() & 128) != 0;
                java.util.List emptyList = java.util.Collections.emptyList();
                if (z58) {
                    list = emptyList;
                    j28 = -9223372036854775807L;
                    j29 = -9223372036854775807L;
                    z28 = false;
                    z29 = false;
                    z37 = false;
                    z38 = false;
                    i27 = 0;
                    i28 = 0;
                    i29 = 0;
                } else {
                    int m28 = pVar.m();
                    boolean z59 = (m28 & 128) != 0;
                    boolean z66 = (m28 & 64) != 0;
                    boolean z67 = (m28 & 32) != 0;
                    boolean z68 = (m28 & 16) != 0;
                    long a17 = (!z66 || z68) ? -9223372036854775807L : com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1620x54338d96.a(pVar, d17);
                    if (!z66) {
                        int m29 = pVar.m();
                        java.util.ArrayList arrayList5 = new java.util.ArrayList(m29);
                        for (int i39 = 0; i39 < m29; i39++) {
                            int m37 = pVar.m();
                            long a18 = !z68 ? com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1620x54338d96.a(pVar, d17) : -9223372036854775807L;
                            arrayList5.add(new c9.d(m37, a18, a0Var3.b(a18)));
                        }
                        emptyList = arrayList5;
                    }
                    if (z67) {
                        long m38 = pVar.m();
                        z39 = (m38 & 128) != 0;
                        j38 = ((m38 & 1) << 32) | pVar.n();
                    } else {
                        z39 = false;
                    }
                    int r17 = pVar.r();
                    int m39 = pVar.m();
                    z28 = z59;
                    z38 = z39;
                    i29 = pVar.m();
                    list = emptyList;
                    i27 = r17;
                    i28 = m39;
                    j29 = j38;
                    j28 = a17;
                    z37 = z68;
                    z29 = z66;
                }
                c1618xa829b788 = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1617x60b0fd16(n19, z58, z28, z29, z37, j28, a0Var3.b(j28), list, z38, j29, i27, i28, i29);
            } else if (d19 != 6) {
                c1618xa829b788 = null;
            } else {
                t9.a0 a0Var4 = this.f121242c;
                long a19 = com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1620x54338d96.a(pVar, d17);
                c1618xa829b788 = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1620x54338d96(a19, a0Var4.b(a19));
            }
        } else {
            long n27 = pVar.n();
            int i47 = d18 - 4;
            byte[] bArr = new byte[i47];
            pVar.b(bArr, 0, i47);
            c1618xa829b788 = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1615xeb7a7468(n27, bArr, d17);
        }
        return c1618xa829b788 == null ? new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f(new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry[0]) : new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f(c1618xa829b788);
    }
}
