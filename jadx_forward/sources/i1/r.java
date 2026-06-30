package i1;

/* loaded from: classes14.dex */
public final class r extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368545c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368546d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368547e;

    /* renamed from: f, reason: collision with root package name */
    public final float f368548f;

    /* renamed from: g, reason: collision with root package name */
    public final float f368549g;

    /* renamed from: h, reason: collision with root package name */
    public final float f368550h;

    public r(float f17, float f18, float f19, float f27, float f28, float f29) {
        super(true, false, 2, null);
        this.f368545c = f17;
        this.f368546d = f18;
        this.f368547e = f19;
        this.f368548f = f27;
        this.f368549g = f28;
        this.f368550h = f29;
    }

    /* renamed from: equals */
    public boolean m134497xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.r)) {
            return false;
        }
        i1.r rVar = (i1.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368545c), java.lang.Float.valueOf(rVar.f368545c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368546d), java.lang.Float.valueOf(rVar.f368546d)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368547e), java.lang.Float.valueOf(rVar.f368547e)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368548f), java.lang.Float.valueOf(rVar.f368548f)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368549g), java.lang.Float.valueOf(rVar.f368549g)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368550h), java.lang.Float.valueOf(rVar.f368550h));
    }

    /* renamed from: hashCode */
    public int m134498x8cdac1b() {
        return (((((((((java.lang.Float.hashCode(this.f368545c) * 31) + java.lang.Float.hashCode(this.f368546d)) * 31) + java.lang.Float.hashCode(this.f368547e)) * 31) + java.lang.Float.hashCode(this.f368548f)) * 31) + java.lang.Float.hashCode(this.f368549g)) * 31) + java.lang.Float.hashCode(this.f368550h);
    }

    /* renamed from: toString */
    public java.lang.String m134499x9616526c() {
        return "RelativeCurveTo(dx1=" + this.f368545c + ", dy1=" + this.f368546d + ", dx2=" + this.f368547e + ", dy2=" + this.f368548f + ", dx3=" + this.f368549g + ", dy3=" + this.f368550h + ')';
    }
}
