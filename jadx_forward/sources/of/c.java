package of;

/* loaded from: classes3.dex */
public final class c implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f426355d;

    /* renamed from: e, reason: collision with root package name */
    public final long f426356e;

    /* renamed from: f, reason: collision with root package name */
    public final long f426357f;

    public c(long j17, long j18, long j19) {
        this.f426355d = j17;
        this.f426356e = j18;
        this.f426357f = j19;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        of.c other = (of.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        long j17 = this.f426355d;
        long j18 = other.f426355d;
        if (j17 > j18) {
            return 1;
        }
        return j17 < j18 ? -1 : 0;
    }

    /* renamed from: toString */
    public java.lang.String m151179x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        double d17 = this.f426355d;
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
        sb6.append(": [0x");
        r26.a.a(16);
        java.lang.String l17 = java.lang.Long.toString(this.f426356e, 16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "toString(...)");
        sb6.append(l17);
        sb6.append(", 0x");
        r26.a.a(16);
        java.lang.String l18 = java.lang.Long.toString(this.f426357f, 16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l18, "toString(...)");
        sb6.append(l18);
        sb6.append(')');
        return sb6.toString();
    }
}
