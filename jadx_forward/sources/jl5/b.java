package jl5;

/* loaded from: classes14.dex */
public abstract class b {
    public static long a(int i17, int i18) {
        return i18 | (i17 << 32);
    }

    public static java.lang.CharSequence b(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        int i17 = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (java.lang.Character.isHighSurrogate(charSequence.charAt(99999)) && java.lang.Character.isLowSurrogate(charSequence.charAt(100000))) {
            i17 = 99999;
        }
        return charSequence.subSequence(0, i17);
    }

    public static int c(long j17) {
        return (int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
    }
}
