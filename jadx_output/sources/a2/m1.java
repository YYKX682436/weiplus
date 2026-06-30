package a2;

/* loaded from: classes14.dex */
public final class m1 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f781b = a2.n1.a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f782c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f783a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final boolean b(long j17) {
        return ((int) (j17 >> 32)) == c(j17);
    }

    public static final int c(long j17) {
        return (int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask);
    }

    public static final int d(long j17) {
        return e(j17) - f(j17);
    }

    public static final int e(long j17) {
        int i17 = (int) (j17 >> 32);
        return i17 > c(j17) ? i17 : c(j17);
    }

    public static final int f(long j17) {
        int i17 = (int) (j17 >> 32);
        return i17 > c(j17) ? c(j17) : i17;
    }

    public static final boolean g(long j17) {
        return ((int) (j17 >> 32)) > c(j17);
    }

    public static java.lang.String h(long j17) {
        return "TextRange(" + ((int) (j17 >> 32)) + ", " + c(j17) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof a2.m1) {
            return this.f783a == ((a2.m1) obj).f783a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f783a);
    }

    public java.lang.String toString() {
        return h(this.f783a);
    }
}
