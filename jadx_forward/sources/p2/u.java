package p2;

/* loaded from: classes14.dex */
public abstract class u {
    public static final long a(double d17) {
        return d(4294967296L, (float) d17);
    }

    public static final long b(int i17) {
        return d(4294967296L, i17);
    }

    public static final boolean c(long j17) {
        p2.v[] vVarArr = p2.t.f432933b;
        return (j17 & 1095216660480L) == 0;
    }

    public static final long d(long j17, float f17) {
        long floatToIntBits = j17 | (java.lang.Float.floatToIntBits(f17) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
        p2.v[] vVarArr = p2.t.f432933b;
        return floatToIntBits;
    }
}
