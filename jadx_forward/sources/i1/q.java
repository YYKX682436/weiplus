package i1;

/* loaded from: classes14.dex */
public final class q extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368536c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368537d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368538e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f368539f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f368540g;

    /* renamed from: h, reason: collision with root package name */
    public final float f368541h;

    /* renamed from: i, reason: collision with root package name */
    public final float f368542i;

    public q(float f17, float f18, float f19, boolean z17, boolean z18, float f27, float f28) {
        super(false, false, 3, null);
        this.f368536c = f17;
        this.f368537d = f18;
        this.f368538e = f19;
        this.f368539f = z17;
        this.f368540g = z18;
        this.f368541h = f27;
        this.f368542i = f28;
    }

    /* renamed from: equals */
    public boolean m134492xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.q)) {
            return false;
        }
        i1.q qVar = (i1.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368536c), java.lang.Float.valueOf(qVar.f368536c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368537d), java.lang.Float.valueOf(qVar.f368537d)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368538e), java.lang.Float.valueOf(qVar.f368538e)) && this.f368539f == qVar.f368539f && this.f368540g == qVar.f368540g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368541h), java.lang.Float.valueOf(qVar.f368541h)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368542i), java.lang.Float.valueOf(qVar.f368542i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m134493x8cdac1b() {
        int hashCode = ((((java.lang.Float.hashCode(this.f368536c) * 31) + java.lang.Float.hashCode(this.f368537d)) * 31) + java.lang.Float.hashCode(this.f368538e)) * 31;
        boolean z17 = this.f368539f;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        boolean z18 = this.f368540g;
        return ((((i18 + (z18 ? 1 : z18 ? 1 : 0)) * 31) + java.lang.Float.hashCode(this.f368541h)) * 31) + java.lang.Float.hashCode(this.f368542i);
    }

    /* renamed from: toString */
    public java.lang.String m134494x9616526c() {
        return "RelativeArcTo(horizontalEllipseRadius=" + this.f368536c + ", verticalEllipseRadius=" + this.f368537d + ", theta=" + this.f368538e + ", isMoreThanHalf=" + this.f368539f + ", isPositiveArc=" + this.f368540g + ", arcStartDx=" + this.f368541h + ", arcStartDy=" + this.f368542i + ')';
    }
}
