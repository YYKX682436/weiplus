package of;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f426353a;

    /* renamed from: b, reason: collision with root package name */
    public final long f426354b;

    public b(java.lang.String name, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f426353a = name;
        this.f426354b = j17;
    }

    /* renamed from: toString */
    public java.lang.String m151178x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f426353a);
        sb6.append(": ");
        java.lang.String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        double d17 = this.f426354b;
        int i17 = 0;
        while (d17 >= 1024.0d) {
            d17 /= 1024.0f;
            i17++;
            if (i17 == 4) {
                break;
            }
        }
        java.lang.String format = java.lang.String.format("%.2f%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d17), strArr[i17]}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        sb6.append(format);
        return sb6.toString();
    }
}
