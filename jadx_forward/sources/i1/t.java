package i1;

/* loaded from: classes14.dex */
public final class t extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368558c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368559d;

    public t(float f17, float f18) {
        super(false, false, 3, null);
        this.f368558c = f17;
        this.f368559d = f18;
    }

    /* renamed from: equals */
    public boolean m134507xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.t)) {
            return false;
        }
        i1.t tVar = (i1.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368558c), java.lang.Float.valueOf(tVar.f368558c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368559d), java.lang.Float.valueOf(tVar.f368559d));
    }

    /* renamed from: hashCode */
    public int m134508x8cdac1b() {
        return (java.lang.Float.hashCode(this.f368558c) * 31) + java.lang.Float.hashCode(this.f368559d);
    }

    /* renamed from: toString */
    public java.lang.String m134509x9616526c() {
        return "RelativeLineTo(dx=" + this.f368558c + ", dy=" + this.f368559d + ')';
    }
}
