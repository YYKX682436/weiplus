package i1;

/* loaded from: classes14.dex */
public final class v extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368584c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368585d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368586e;

    /* renamed from: f, reason: collision with root package name */
    public final float f368587f;

    public v(float f17, float f18, float f19, float f27) {
        super(false, true, 1, null);
        this.f368584c = f17;
        this.f368585d = f18;
        this.f368586e = f19;
        this.f368587f = f27;
    }

    /* renamed from: equals */
    public boolean m134515xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.v)) {
            return false;
        }
        i1.v vVar = (i1.v) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368584c), java.lang.Float.valueOf(vVar.f368584c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368585d), java.lang.Float.valueOf(vVar.f368585d)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368586e), java.lang.Float.valueOf(vVar.f368586e)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368587f), java.lang.Float.valueOf(vVar.f368587f));
    }

    /* renamed from: hashCode */
    public int m134516x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f368584c) * 31) + java.lang.Float.hashCode(this.f368585d)) * 31) + java.lang.Float.hashCode(this.f368586e)) * 31) + java.lang.Float.hashCode(this.f368587f);
    }

    /* renamed from: toString */
    public java.lang.String m134517x9616526c() {
        return "RelativeQuadTo(dx1=" + this.f368584c + ", dy1=" + this.f368585d + ", dx2=" + this.f368586e + ", dy2=" + this.f368587f + ')';
    }
}
