package zq5;

/* loaded from: classes15.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f556589a = jz5.h.b(zq5.z.f556635d);

    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | (java.lang.Float.floatToIntBits(f17) << 32);
        zq5.x xVar = zq5.y.f556633b;
        return floatToIntBits;
    }

    public static final long b(zq5.x xVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xVar, "<this>");
        return ((zq5.y) ((jz5.n) f556589a).mo141623x754a37bb()).f556634a;
    }

    public static final java.lang.String c(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        zq5.x xVar = zq5.y.f556633b;
        sb6.append(zq5.b.c(java.lang.Float.intBitsToFloat((int) (j17 >> 32)), 2));
        sb6.append('x');
        sb6.append(zq5.b.c(java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2)), 2));
        return sb6.toString();
    }
}
