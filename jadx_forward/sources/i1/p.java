package i1;

/* loaded from: classes14.dex */
public final class p extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368531c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368532d;

    public p(float f17, float f18) {
        super(false, true, 1, null);
        this.f368531c = f17;
        this.f368532d = f18;
    }

    /* renamed from: equals */
    public boolean m134486xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.p)) {
            return false;
        }
        i1.p pVar = (i1.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368531c), java.lang.Float.valueOf(pVar.f368531c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368532d), java.lang.Float.valueOf(pVar.f368532d));
    }

    /* renamed from: hashCode */
    public int m134487x8cdac1b() {
        return (java.lang.Float.hashCode(this.f368531c) * 31) + java.lang.Float.hashCode(this.f368532d);
    }

    /* renamed from: toString */
    public java.lang.String m134488x9616526c() {
        return "ReflectiveQuadTo(x=" + this.f368531c + ", y=" + this.f368532d + ')';
    }
}
