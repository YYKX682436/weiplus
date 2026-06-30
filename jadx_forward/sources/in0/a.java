package in0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f374264a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f374265b;

    /* renamed from: c, reason: collision with root package name */
    public final float f374266c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f374267d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f374268e;

    /* renamed from: f, reason: collision with root package name */
    public final float f374269f;

    /* renamed from: g, reason: collision with root package name */
    public final float f374270g;

    /* renamed from: h, reason: collision with root package name */
    public final float f374271h;

    /* renamed from: i, reason: collision with root package name */
    public final float f374272i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f374273j;

    /* renamed from: k, reason: collision with root package name */
    public final int f374274k;

    public a(boolean z17, java.lang.String sdkUserId, float f17, java.lang.String gestureId, java.lang.String randomId, float f18, float f19, float f27, float f28, java.lang.String giftComboId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gestureId, "gestureId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(randomId, "randomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftComboId, "giftComboId");
        this.f374264a = z17;
        this.f374265b = sdkUserId;
        this.f374266c = f17;
        this.f374267d = gestureId;
        this.f374268e = randomId;
        this.f374269f = f18;
        this.f374270g = f19;
        this.f374271h = f27;
        this.f374272i = f28;
        this.f374273j = giftComboId;
        this.f374274k = i17;
    }

    /* renamed from: equals */
    public boolean m136772xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in0.a)) {
            return false;
        }
        in0.a aVar = (in0.a) obj;
        return this.f374264a == aVar.f374264a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f374265b, aVar.f374265b) && java.lang.Float.compare(this.f374266c, aVar.f374266c) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f374267d, aVar.f374267d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f374268e, aVar.f374268e) && java.lang.Float.compare(this.f374269f, aVar.f374269f) == 0 && java.lang.Float.compare(this.f374270g, aVar.f374270g) == 0 && java.lang.Float.compare(this.f374271h, aVar.f374271h) == 0 && java.lang.Float.compare(this.f374272i, aVar.f374272i) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f374273j, aVar.f374273j) && this.f374274k == aVar.f374274k;
    }

    /* renamed from: hashCode */
    public int m136773x8cdac1b() {
        return (((((((((((((((((((java.lang.Boolean.hashCode(this.f374264a) * 31) + this.f374265b.hashCode()) * 31) + java.lang.Float.hashCode(this.f374266c)) * 31) + this.f374267d.hashCode()) * 31) + this.f374268e.hashCode()) * 31) + java.lang.Float.hashCode(this.f374269f)) * 31) + java.lang.Float.hashCode(this.f374270g)) * 31) + java.lang.Float.hashCode(this.f374271h)) * 31) + java.lang.Float.hashCode(this.f374272i)) * 31) + this.f374273j.hashCode()) * 31) + java.lang.Integer.hashCode(this.f374274k);
    }

    /* renamed from: toString */
    public java.lang.String m136774x9616526c() {
        return "GestureSeiData(isSuccess=" + this.f374264a + ", sdkUserId=" + this.f374265b + ", aspect=" + this.f374266c + ", gestureId=" + this.f374267d + ", randomId=" + this.f374268e + ", transX=" + this.f374269f + ", transY=" + this.f374270g + ", rotation=" + this.f374271h + ", scale=" + this.f374272i + ", giftComboId=" + this.f374273j + ", renderMode=" + this.f374274k + ')';
    }
}
