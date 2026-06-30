package re2;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f475894a = kz5.c1.k(new jz5.l(14, 512L), new jz5.l(15, 256L), new jz5.l(34, 4L), new jz5.l(38, 64L), new jz5.l(50, 16L), new jz5.l(51, 8L), new jz5.l(57, 32L), new jz5.l(61, 32768L), new jz5.l(63, 16384L), new jz5.l(64, 8192L), new jz5.l(66, 16777216L), new jz5.l(69, 2L), new jz5.l(76, 131072L), new jz5.l(77, 65536L), new jz5.l(80, 4096L), new jz5.l(85, 2048L), new jz5.l(86, 128L), new jz5.l(87, 1024L));

    public static final boolean a(int i17) {
        gk2.e eVar = dk2.ef.I;
        if (eVar == null) {
            return true;
        }
        mm2.n0 n0Var = (mm2.n0) eVar.a(mm2.n0.class);
        if (!n0Var.f410806r) {
            return true;
        }
        jz5.g b17 = jz5.h.b(new re2.a(n0Var));
        if (i17 != 2) {
            if (i17 != 6) {
                if (i17 == 16 || i17 == 23) {
                    return true;
                }
            } else if ((((java.lang.Number) ((jz5.n) b17).mo141623x754a37bb()).longValue() & 65536) != 0) {
                return true;
            }
        } else if ((((java.lang.Number) ((jz5.n) b17).mo141623x754a37bb()).longValue() & 16384) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean b(int i17) {
        java.lang.Long l17;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null) {
            return true;
        }
        mm2.n0 n0Var = (mm2.n0) eVar.a(mm2.n0.class);
        if (!n0Var.f410806r || (l17 = (java.lang.Long) f475894a.get(java.lang.Integer.valueOf(i17))) == null) {
            return true;
        }
        long longValue = l17.longValue();
        r45.e50 e50Var = (r45.e50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) n0Var.f410802n).mo144003x754a37bb();
        return (longValue & (e50Var != null ? e50Var.m75942xfb822ef2(1) : 0L)) != 0;
    }
}
