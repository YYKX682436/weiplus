package d1;

/* loaded from: classes14.dex */
public abstract class b {
    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | (java.lang.Float.floatToIntBits(f17) << 32);
        int i17 = d1.a.f307151b;
        return floatToIntBits;
    }

    public static /* synthetic */ long b(float f17, float f18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            f18 = f17;
        }
        return a(f17, f18);
    }
}
