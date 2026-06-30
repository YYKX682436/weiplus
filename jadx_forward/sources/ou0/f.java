package ou0;

/* loaded from: classes5.dex */
public abstract class f {
    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a minimumValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4128x879fba0a, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(minimumValue, "minimumValue");
        return c4128x879fba0a.m33986x9f3f7b48(minimumValue) ? minimumValue : c4128x879fba0a;
    }

    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a maximumValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4128x879fba0a, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(maximumValue, "maximumValue");
        return c4128x879fba0a.m33971xf922bec1(maximumValue) ? maximumValue : c4128x879fba0a;
    }

    public static final boolean c(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4128x879fba0a, "<this>");
        if (!(c4128x879fba0a instanceof ou0.g)) {
            return false;
        }
        long j18 = ((ou0.g) c4128x879fba0a).f430422d;
        return j18 <= 0 ? j17 == j18 : (j18 & j17) == j17;
    }

    public static final java.lang.String d(long j17) {
        long j18 = j17 / 1000;
        long j19 = 60;
        java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j18 / j19), java.lang.Long.valueOf(j18 % j19)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
