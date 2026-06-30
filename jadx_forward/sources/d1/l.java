package d1;

/* loaded from: classes14.dex */
public abstract class l {
    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | (java.lang.Float.floatToIntBits(f17) << 32);
        int i17 = d1.k.f307176d;
        return floatToIntBits;
    }

    public static final long b(long j17) {
        return d1.f.a(d1.k.d(j17) / 2.0f, d1.k.b(j17) / 2.0f);
    }
}
