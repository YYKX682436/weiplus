package s26;

/* loaded from: classes11.dex */
public abstract class c {
    public static final long a(long j17) {
        long j18 = (j17 << 1) + 1;
        int i17 = s26.a.f483901f;
        int i18 = s26.b.f483902a;
        return j18;
    }

    public static final long b(long j17) {
        boolean z17 = false;
        if (-4611686018426L <= j17 && j17 < 4611686018427L) {
            z17 = true;
        }
        return z17 ? c(j17 * 1000000) : a(e06.p.h(j17, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long c(long j17) {
        long j18 = j17 << 1;
        int i17 = s26.a.f483901f;
        int i18 = s26.b.f483902a;
        return j18;
    }

    public static final long d(double d17, s26.d unit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unit, "unit");
        double a17 = s26.e.a(d17, unit, s26.d.f483903e);
        if (!(!java.lang.Double.isNaN(a17))) {
            throw new java.lang.IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long c17 = a06.d.c(a17);
        return -4611686018426999999L <= c17 && c17 < 4611686018427000000L ? c(c17) : b(a06.d.c(s26.e.a(d17, unit, s26.d.f483904f)));
    }

    public static final long e(int i17, s26.d unit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unit, "unit");
        return unit.compareTo(s26.d.f483905g) <= 0 ? c(s26.e.c(i17, unit, s26.d.f483903e)) : f(i17, unit);
    }

    public static final long f(long j17, s26.d unit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unit, "unit");
        s26.d dVar = s26.d.f483903e;
        long c17 = s26.e.c(4611686018426999999L, dVar, unit);
        boolean z17 = false;
        if ((-c17) <= j17 && j17 <= c17) {
            z17 = true;
        }
        return z17 ? c(s26.e.c(j17, unit, dVar)) : a(e06.p.h(s26.e.b(j17, unit, s26.d.f483904f), -4611686018427387903L, 4611686018427387903L));
    }
}
