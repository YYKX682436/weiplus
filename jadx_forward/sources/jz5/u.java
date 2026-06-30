package jz5;

/* loaded from: classes8.dex */
public final class u implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f384381d;

    public static java.lang.String a(int i17) {
        return java.lang.String.valueOf(i17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f384381d ^ Integer.MIN_VALUE, ((jz5.u) obj).f384381d ^ Integer.MIN_VALUE);
    }

    /* renamed from: equals */
    public boolean m141650xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof jz5.u) {
            return this.f384381d == ((jz5.u) obj).f384381d;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m141651x8cdac1b() {
        return java.lang.Integer.hashCode(this.f384381d);
    }

    /* renamed from: toString */
    public java.lang.String m141652x9616526c() {
        return a(this.f384381d);
    }
}
