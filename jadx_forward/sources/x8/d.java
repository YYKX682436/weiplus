package x8;

/* loaded from: classes15.dex */
public abstract class d {
    public static x8.b a(q8.f fVar) {
        long j17;
        fVar.getClass();
        t9.p pVar = new t9.p(16);
        if (x8.c.a(fVar, pVar).f534010a != t9.d0.f("RIFF")) {
            return null;
        }
        q8.b bVar = (q8.b) fVar;
        bVar.b(pVar.f498073a, 0, 4, false);
        pVar.w(0);
        if (pVar.c() != t9.d0.f("WAVE")) {
            return null;
        }
        x8.c a17 = x8.c.a(fVar, pVar);
        while (true) {
            int f17 = t9.d0.f("fmt ");
            int i17 = a17.f534010a;
            j17 = a17.f534011b;
            if (i17 == f17) {
                break;
            }
            bVar.a((int) j17, false);
            a17 = x8.c.a(fVar, pVar);
        }
        t9.a.d(j17 >= 16);
        bVar.b(pVar.f498073a, 0, 16, false);
        pVar.w(0);
        int g17 = pVar.g();
        int g18 = pVar.g();
        int e17 = pVar.e();
        if (e17 < 0) {
            throw new java.lang.IllegalStateException("Top bit not zero: " + e17);
        }
        int e18 = pVar.e();
        if (e18 < 0) {
            throw new java.lang.IllegalStateException("Top bit not zero: " + e18);
        }
        int g19 = pVar.g();
        int g27 = pVar.g();
        int i18 = (g18 * g27) / 8;
        if (g19 != i18) {
            throw new m8.x("Expected block alignment: " + i18 + "; got: " + g19);
        }
        int g28 = t9.d0.g(g27);
        if (g28 == 0) {
            return null;
        }
        if (g17 != 1 && g17 != 65534) {
            return null;
        }
        bVar.a(((int) j17) - 16, false);
        return new x8.b(g18, e17, e18, g19, g27, g28);
    }
}
