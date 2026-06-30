package i1;

/* loaded from: classes14.dex */
public final class h extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368450c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368451d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368452e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f368453f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f368454g;

    /* renamed from: h, reason: collision with root package name */
    public final float f368455h;

    /* renamed from: i, reason: collision with root package name */
    public final float f368456i;

    public h(float f17, float f18, float f19, boolean z17, boolean z18, float f27, float f28) {
        super(false, false, 3, null);
        this.f368450c = f17;
        this.f368451d = f18;
        this.f368452e = f19;
        this.f368453f = z17;
        this.f368454g = z18;
        this.f368455h = f27;
        this.f368456i = f28;
    }

    /* renamed from: equals */
    public boolean m134445xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.h)) {
            return false;
        }
        i1.h hVar = (i1.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368450c), java.lang.Float.valueOf(hVar.f368450c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368451d), java.lang.Float.valueOf(hVar.f368451d)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368452e), java.lang.Float.valueOf(hVar.f368452e)) && this.f368453f == hVar.f368453f && this.f368454g == hVar.f368454g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368455h), java.lang.Float.valueOf(hVar.f368455h)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368456i), java.lang.Float.valueOf(hVar.f368456i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m134446x8cdac1b() {
        int hashCode = ((((java.lang.Float.hashCode(this.f368450c) * 31) + java.lang.Float.hashCode(this.f368451d)) * 31) + java.lang.Float.hashCode(this.f368452e)) * 31;
        boolean z17 = this.f368453f;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        boolean z18 = this.f368454g;
        return ((((i18 + (z18 ? 1 : z18 ? 1 : 0)) * 31) + java.lang.Float.hashCode(this.f368455h)) * 31) + java.lang.Float.hashCode(this.f368456i);
    }

    /* renamed from: toString */
    public java.lang.String m134447x9616526c() {
        return "ArcTo(horizontalEllipseRadius=" + this.f368450c + ", verticalEllipseRadius=" + this.f368451d + ", theta=" + this.f368452e + ", isMoreThanHalf=" + this.f368453f + ", isPositiveArc=" + this.f368454g + ", arcStartX=" + this.f368455h + ", arcStartY=" + this.f368456i + ')';
    }
}
