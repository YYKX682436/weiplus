package u1;

/* loaded from: classes13.dex */
public abstract class k {
    public static final int a(long j17, long j18) {
        boolean b17 = b(j17);
        return b17 != b(j18) ? b17 ? -1 : 1 : (int) java.lang.Math.signum(java.lang.Float.intBitsToFloat((int) (j17 >> 32)) - java.lang.Float.intBitsToFloat((int) (j18 >> 32)));
    }

    public static final boolean b(long j17) {
        return ((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2)) != 0;
    }
}
