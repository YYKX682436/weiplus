package i1;

/* loaded from: classes14.dex */
public final class n extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368508c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368509d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368510e;

    /* renamed from: f, reason: collision with root package name */
    public final float f368511f;

    public n(float f17, float f18, float f19, float f27) {
        super(false, true, 1, null);
        this.f368508c = f17;
        this.f368509d = f18;
        this.f368510e = f19;
        this.f368511f = f27;
    }

    /* renamed from: equals */
    public boolean m134474xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.n)) {
            return false;
        }
        i1.n nVar = (i1.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368508c), java.lang.Float.valueOf(nVar.f368508c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368509d), java.lang.Float.valueOf(nVar.f368509d)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368510e), java.lang.Float.valueOf(nVar.f368510e)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368511f), java.lang.Float.valueOf(nVar.f368511f));
    }

    /* renamed from: hashCode */
    public int m134475x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f368508c) * 31) + java.lang.Float.hashCode(this.f368509d)) * 31) + java.lang.Float.hashCode(this.f368510e)) * 31) + java.lang.Float.hashCode(this.f368511f);
    }

    /* renamed from: toString */
    public java.lang.String m134476x9616526c() {
        return "QuadTo(x1=" + this.f368508c + ", y1=" + this.f368509d + ", x2=" + this.f368510e + ", y2=" + this.f368511f + ')';
    }
}
