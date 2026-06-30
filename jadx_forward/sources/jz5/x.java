package jz5;

/* loaded from: classes10.dex */
public final class x implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f384385d;

    public static java.lang.String a(long j17) {
        return jz5.h0.b(j17, 10);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(this.f384385d ^ Long.MIN_VALUE, ((jz5.x) obj).f384385d ^ Long.MIN_VALUE);
    }

    /* renamed from: equals */
    public boolean m141654xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof jz5.x) {
            return this.f384385d == ((jz5.x) obj).f384385d;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m141655x8cdac1b() {
        return java.lang.Long.hashCode(this.f384385d);
    }

    /* renamed from: toString */
    public java.lang.String m141656x9616526c() {
        return a(this.f384385d);
    }
}
