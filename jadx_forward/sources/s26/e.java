package s26;

/* loaded from: classes11.dex */
public abstract class e {
    public static final double a(double d17, s26.d sourceUnit, s26.d targetUnit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceUnit, "sourceUnit");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUnit, "targetUnit");
        long convert = targetUnit.f483910d.convert(1L, sourceUnit.f483910d);
        return convert > 0 ? d17 * convert : d17 / r8.convert(1L, r9);
    }

    public static final long b(long j17, s26.d sourceUnit, s26.d targetUnit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceUnit, "sourceUnit");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUnit, "targetUnit");
        return targetUnit.f483910d.convert(j17, sourceUnit.f483910d);
    }

    public static final long c(long j17, s26.d sourceUnit, s26.d targetUnit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceUnit, "sourceUnit");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUnit, "targetUnit");
        return targetUnit.f483910d.convert(j17, sourceUnit.f483910d);
    }
}
