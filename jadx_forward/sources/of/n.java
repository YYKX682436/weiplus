package of;

/* loaded from: classes13.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(long j17) {
        long abs = j17 == Long.MIN_VALUE ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : java.lang.Math.abs(j17);
        if (abs < 1024) {
            return j17 + " B";
        }
        java.text.StringCharacterIterator stringCharacterIterator = new java.text.StringCharacterIterator("KMGTPE");
        long j18 = abs;
        for (int i17 = 40; i17 >= 0 && abs > (1152865209611504844 >> i17); i17 -= 10) {
            j18 >>= 10;
            stringCharacterIterator.next();
        }
        java.lang.String format = java.lang.String.format("%.1f %ciB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((j18 * java.lang.Long.signum(j17)) / 1024.0d), java.lang.Character.valueOf(stringCharacterIterator.current())}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
