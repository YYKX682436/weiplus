package s7;

/* loaded from: classes16.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f485427a;

    /* renamed from: b, reason: collision with root package name */
    public final long f485428b;

    public y(long j17, int i17) {
        this.f485428b = j17;
        this.f485427a = i17;
    }

    public static s7.y a(java.lang.String str, int i17, int i18, boolean z17) {
        if (i17 >= i18) {
            return null;
        }
        if (z17) {
            char charAt = str.charAt(i17);
            if (charAt != '+') {
                r1 = charAt == '-';
            }
            i17++;
        }
        long j17 = 0;
        int i19 = i17;
        while (i19 < i18) {
            char charAt2 = str.charAt(i19);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            if (r1) {
                j17 = (j17 * 10) - (charAt2 - '0');
                if (j17 < -2147483648L) {
                    return null;
                }
            } else {
                j17 = (j17 * 10) + (charAt2 - '0');
                if (j17 > 2147483647L) {
                    return null;
                }
            }
            i19++;
        }
        if (i19 == i17) {
            return null;
        }
        return new s7.y(j17, i19);
    }
}
