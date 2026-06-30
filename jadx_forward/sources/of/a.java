package of;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f426351a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f426352b;

    public a(long j17, java.util.List sortedFreeRegionList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sortedFreeRegionList, "sortedFreeRegionList");
        this.f426351a = j17;
        this.f426352b = sortedFreeRegionList;
    }

    /* renamed from: toString */
    public java.lang.String m151177x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        double d17 = this.f426351a;
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
        sb6.append(": ");
        java.util.List list = this.f426352b;
        int size = list.size();
        if (10 <= size) {
            size = 10;
        }
        java.lang.String arrays = java.util.Arrays.toString(list.subList(0, size).toArray(new of.c[0]));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        return sb6.toString();
    }
}
