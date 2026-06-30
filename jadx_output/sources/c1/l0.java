package c1;

/* loaded from: classes14.dex */
public abstract class l0 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o0.i a(c1.p r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r5, r0)
            o0.i r5 = r5.f37766e
            int r0 = r5.f341852f
            r1 = 0
            if (r0 <= 0) goto L21
            java.lang.Object[] r2 = r5.f341850d
            r3 = r1
        Lf:
            r4 = r2[r3]
            c1.p r4 = (c1.p) r4
            c1.j0 r4 = r4.f37767f
            boolean r4 = r4.h()
            if (r4 == 0) goto L1d
            r0 = 1
            goto L22
        L1d:
            int r3 = r3 + 1
            if (r3 < r0) goto Lf
        L21:
            r0 = r1
        L22:
            if (r0 != 0) goto L25
            return r5
        L25:
            o0.i r0 = new o0.i
            r2 = 16
            c1.p[] r2 = new c1.p[r2]
            r0.<init>(r2, r1)
            int r2 = r5.f341852f
            if (r2 <= 0) goto L51
            java.lang.Object[] r5 = r5.f341850d
        L34:
            r3 = r5[r1]
            c1.p r3 = (c1.p) r3
            c1.j0 r4 = r3.f37767f
            boolean r4 = r4.h()
            if (r4 != 0) goto L44
            r0.b(r3)
            goto L4d
        L44:
            o0.i r3 = a(r3)
            int r4 = r0.f341852f
            r0.d(r4, r3)
        L4d:
            int r1 = r1 + 1
            if (r1 < r2) goto L34
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.l0.a(c1.p):o0.i");
    }

    public static final c1.p b(c1.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<this>");
        int ordinal = pVar.f37767f.ordinal();
        if (ordinal == 0) {
            return pVar;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return pVar;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new jz5.j();
                    }
                }
            }
            return null;
        }
        c1.p pVar2 = pVar.f37768g;
        if (pVar2 != null) {
            return b(pVar2);
        }
        return null;
    }

    public static final c1.p c(c1.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<this>");
        c1.p pVar2 = pVar.f37765d;
        if (pVar2 == null) {
            return null;
        }
        int ordinal = pVar.f37767f.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return pVar;
            }
            if (ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                throw new jz5.j();
            }
        }
        return c(pVar2);
    }

    public static final d1.g d(c1.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<this>");
        u1.c1 c1Var = pVar.f37775q;
        return c1Var != null ? ((u1.c1) s1.a0.c(c1Var)).r0(c1Var, false) : d1.g.f225628e;
    }

    public static final boolean e(c1.p pVar) {
        u1.w wVar;
        u1.w wVar2;
        kotlin.jvm.internal.o.g(pVar, "<this>");
        u1.c1 c1Var = pVar.f37775q;
        if ((c1Var == null || (wVar2 = c1Var.f423554h) == null || !wVar2.A) ? false : true) {
            if ((c1Var == null || (wVar = c1Var.f423554h) == null || !wVar.x()) ? false : true) {
                return true;
            }
        }
        return false;
    }
}
