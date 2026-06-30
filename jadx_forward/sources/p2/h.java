package p2;

/* loaded from: classes5.dex */
public final class h implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final float f432913d;

    public static final boolean a(float f17, float f18) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
    }

    public static java.lang.String b(float f17) {
        if (java.lang.Float.isNaN(f17)) {
            return "Dp.Unspecified";
        }
        return f17 + ".dp";
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return java.lang.Float.compare(this.f432913d, ((p2.h) obj).f432913d);
    }

    /* renamed from: equals */
    public boolean m157735xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p2.h) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f432913d), java.lang.Float.valueOf(((p2.h) obj).f432913d));
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m157736x8cdac1b() {
        return java.lang.Float.hashCode(this.f432913d);
    }

    /* renamed from: toString */
    public java.lang.String m157737x9616526c() {
        return b(this.f432913d);
    }
}
