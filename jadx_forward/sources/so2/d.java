package so2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f491835a;

    /* renamed from: b, reason: collision with root package name */
    public int f491836b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f491837c;

    /* renamed from: d, reason: collision with root package name */
    public final so2.e f491838d;

    /* renamed from: e, reason: collision with root package name */
    public final so2.e f491839e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.e f491840f;

    public d(int i17, int i18, boolean z17, so2.e preRenderLife, so2.e oneStagePreload, so2.e twoStagePreload) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preRenderLife, "preRenderLife");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oneStagePreload, "oneStagePreload");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(twoStagePreload, "twoStagePreload");
        this.f491835a = i17;
        this.f491836b = i18;
        this.f491837c = z17;
        this.f491838d = preRenderLife;
        this.f491839e = oneStagePreload;
        this.f491840f = twoStagePreload;
    }

    /* renamed from: equals */
    public boolean m164858xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.d)) {
            return false;
        }
        so2.d dVar = (so2.d) obj;
        return this.f491835a == dVar.f491835a && this.f491836b == dVar.f491836b && this.f491837c == dVar.f491837c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491838d, dVar.f491838d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491839e, dVar.f491839e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491840f, dVar.f491840f);
    }

    /* renamed from: hashCode */
    public int m164859x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f491835a) * 31) + java.lang.Integer.hashCode(this.f491836b)) * 31) + java.lang.Boolean.hashCode(this.f491837c)) * 31) + this.f491838d.m164863x8cdac1b()) * 31) + this.f491839e.m164863x8cdac1b()) * 31) + this.f491840f.m164863x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m164860x9616526c() {
        return "ContextInStream(position=" + this.f491835a + ", curScrollDirection=" + this.f491836b + ", isComeToPreRender=" + this.f491837c + ", preRenderLife=" + this.f491838d + ", oneStagePreload=" + this.f491839e + ", twoStagePreload=" + this.f491840f + ')';
    }
}
