package i1;

/* loaded from: classes14.dex */
public final class j extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368472c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368473d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368474e;

    /* renamed from: f, reason: collision with root package name */
    public final float f368475f;

    /* renamed from: g, reason: collision with root package name */
    public final float f368476g;

    /* renamed from: h, reason: collision with root package name */
    public final float f368477h;

    public j(float f17, float f18, float f19, float f27, float f28, float f29) {
        super(true, false, 2, null);
        this.f368472c = f17;
        this.f368473d = f18;
        this.f368474e = f19;
        this.f368475f = f27;
        this.f368476g = f28;
        this.f368477h = f29;
    }

    /* renamed from: equals */
    public boolean m134454xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.j)) {
            return false;
        }
        i1.j jVar = (i1.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368472c), java.lang.Float.valueOf(jVar.f368472c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368473d), java.lang.Float.valueOf(jVar.f368473d)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368474e), java.lang.Float.valueOf(jVar.f368474e)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368475f), java.lang.Float.valueOf(jVar.f368475f)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368476g), java.lang.Float.valueOf(jVar.f368476g)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368477h), java.lang.Float.valueOf(jVar.f368477h));
    }

    /* renamed from: hashCode */
    public int m134455x8cdac1b() {
        return (((((((((java.lang.Float.hashCode(this.f368472c) * 31) + java.lang.Float.hashCode(this.f368473d)) * 31) + java.lang.Float.hashCode(this.f368474e)) * 31) + java.lang.Float.hashCode(this.f368475f)) * 31) + java.lang.Float.hashCode(this.f368476g)) * 31) + java.lang.Float.hashCode(this.f368477h);
    }

    /* renamed from: toString */
    public java.lang.String m134456x9616526c() {
        return "CurveTo(x1=" + this.f368472c + ", y1=" + this.f368473d + ", x2=" + this.f368474e + ", y2=" + this.f368475f + ", x3=" + this.f368476g + ", y3=" + this.f368477h + ')';
    }
}
