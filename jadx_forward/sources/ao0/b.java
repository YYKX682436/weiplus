package ao0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94047a;

    /* renamed from: b, reason: collision with root package name */
    public final float f94048b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f94049c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f94050d;

    /* renamed from: e, reason: collision with root package name */
    public final float f94051e;

    /* renamed from: f, reason: collision with root package name */
    public final float f94052f;

    /* renamed from: g, reason: collision with root package name */
    public final float f94053g;

    /* renamed from: h, reason: collision with root package name */
    public final float f94054h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f94055i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f94056j;

    public b(java.lang.String sdkUserId, float f17, java.lang.String gestureId, java.lang.String randomId, float f18, float f19, float f27, float f28, java.lang.String giftComboId, java.lang.String giftSoundId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gestureId, "gestureId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(randomId, "randomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftComboId, "giftComboId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftSoundId, "giftSoundId");
        this.f94047a = sdkUserId;
        this.f94048b = f17;
        this.f94049c = gestureId;
        this.f94050d = randomId;
        this.f94051e = f18;
        this.f94052f = f19;
        this.f94053g = f27;
        this.f94054h = f28;
        this.f94055i = giftComboId;
        this.f94056j = giftSoundId;
    }

    /* renamed from: equals */
    public boolean m8679xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao0.b)) {
            return false;
        }
        ao0.b bVar = (ao0.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94047a, bVar.f94047a) && java.lang.Float.compare(this.f94048b, bVar.f94048b) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94049c, bVar.f94049c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94050d, bVar.f94050d) && java.lang.Float.compare(this.f94051e, bVar.f94051e) == 0 && java.lang.Float.compare(this.f94052f, bVar.f94052f) == 0 && java.lang.Float.compare(this.f94053g, bVar.f94053g) == 0 && java.lang.Float.compare(this.f94054h, bVar.f94054h) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94055i, bVar.f94055i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94056j, bVar.f94056j);
    }

    /* renamed from: hashCode */
    public int m8680x8cdac1b() {
        return (((((((((((((((((this.f94047a.hashCode() * 31) + java.lang.Float.hashCode(this.f94048b)) * 31) + this.f94049c.hashCode()) * 31) + this.f94050d.hashCode()) * 31) + java.lang.Float.hashCode(this.f94051e)) * 31) + java.lang.Float.hashCode(this.f94052f)) * 31) + java.lang.Float.hashCode(this.f94053g)) * 31) + java.lang.Float.hashCode(this.f94054h)) * 31) + this.f94055i.hashCode()) * 31) + this.f94056j.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m8681x9616526c() {
        return "GestureSei(sdkUserId=" + this.f94047a + ", aspect=" + this.f94048b + ", gestureId=" + this.f94049c + ", randomId=" + this.f94050d + ", transX=" + this.f94051e + ", transY=" + this.f94052f + ", rotation=" + this.f94053g + ", scale=" + this.f94054h + ", giftComboId=" + this.f94055i + ", giftSoundId=" + this.f94056j + ')';
    }
}
