package bs2;

/* loaded from: classes2.dex */
public final class x {
    public x(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.xs2 a(int i17, zy2.fa redDotManager) {
        r45.xs2 xs2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.a(i17);
        r45.xs2 Q = redDotManager.Q(a17);
        if (Q != null && (Q.m75942xfb822ef2(3) != 0 || Q.m75934xbce7f2f(7) != null)) {
            return Q;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = redDotManager.L0("FinderEntrance");
        if (L0 != null && (xs2Var = L0.N) != null) {
            if (!(xs2Var.m75942xfb822ef2(3) != 0 && xs2Var.m75939xb282bd08(9) == i17)) {
                xs2Var = null;
            }
            if (xs2Var != null) {
                return xs2Var;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02 = redDotManager.L0(a17);
        if (L02 != null) {
            return L02.N;
        }
        return null;
    }
}
