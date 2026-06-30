package i1;

/* loaded from: classes14.dex */
public final class x extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368602c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368603d;

    public x(float f17, float f18) {
        super(false, true, 1, null);
        this.f368602c = f17;
        this.f368603d = f18;
    }

    /* renamed from: equals */
    public boolean m134523xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.x)) {
            return false;
        }
        i1.x xVar = (i1.x) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368602c), java.lang.Float.valueOf(xVar.f368602c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368603d), java.lang.Float.valueOf(xVar.f368603d));
    }

    /* renamed from: hashCode */
    public int m134524x8cdac1b() {
        return (java.lang.Float.hashCode(this.f368602c) * 31) + java.lang.Float.hashCode(this.f368603d);
    }

    /* renamed from: toString */
    public java.lang.String m134525x9616526c() {
        return "RelativeReflectiveQuadTo(dx=" + this.f368602c + ", dy=" + this.f368603d + ')';
    }
}
