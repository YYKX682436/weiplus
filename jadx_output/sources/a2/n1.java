package a2;

/* loaded from: classes14.dex */
public abstract class n1 {
    public static final long a(int i17, int i18) {
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("start cannot be negative. [start: " + i17 + ']').toString());
        }
        if (i18 >= 0) {
            long j17 = (i18 & io.flutter.embedding.android.KeyboardMap.kValueMask) | (i17 << 32);
            int i19 = a2.m1.f782c;
            return j17;
        }
        throw new java.lang.IllegalArgumentException(("end cannot negative. [end: " + i18 + ']').toString());
    }

    public static final long b(long j17, int i17, int i18) {
        int i19 = a2.m1.f782c;
        int i27 = (int) (j17 >> 32);
        int f17 = e06.p.f(i27, i17, i18);
        int f18 = e06.p.f(a2.m1.c(j17), i17, i18);
        return (f17 == i27 && f18 == a2.m1.c(j17)) ? j17 : a(f17, f18);
    }
}
