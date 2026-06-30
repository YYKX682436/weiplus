package ao0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f12514a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12515b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f12516c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f12517d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12518e;

    /* renamed from: f, reason: collision with root package name */
    public final float f12519f;

    /* renamed from: g, reason: collision with root package name */
    public final float f12520g;

    /* renamed from: h, reason: collision with root package name */
    public final float f12521h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f12522i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f12523j;

    public b(java.lang.String sdkUserId, float f17, java.lang.String gestureId, java.lang.String randomId, float f18, float f19, float f27, float f28, java.lang.String giftComboId, java.lang.String giftSoundId) {
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        kotlin.jvm.internal.o.g(gestureId, "gestureId");
        kotlin.jvm.internal.o.g(randomId, "randomId");
        kotlin.jvm.internal.o.g(giftComboId, "giftComboId");
        kotlin.jvm.internal.o.g(giftSoundId, "giftSoundId");
        this.f12514a = sdkUserId;
        this.f12515b = f17;
        this.f12516c = gestureId;
        this.f12517d = randomId;
        this.f12518e = f18;
        this.f12519f = f19;
        this.f12520g = f27;
        this.f12521h = f28;
        this.f12522i = giftComboId;
        this.f12523j = giftSoundId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao0.b)) {
            return false;
        }
        ao0.b bVar = (ao0.b) obj;
        return kotlin.jvm.internal.o.b(this.f12514a, bVar.f12514a) && java.lang.Float.compare(this.f12515b, bVar.f12515b) == 0 && kotlin.jvm.internal.o.b(this.f12516c, bVar.f12516c) && kotlin.jvm.internal.o.b(this.f12517d, bVar.f12517d) && java.lang.Float.compare(this.f12518e, bVar.f12518e) == 0 && java.lang.Float.compare(this.f12519f, bVar.f12519f) == 0 && java.lang.Float.compare(this.f12520g, bVar.f12520g) == 0 && java.lang.Float.compare(this.f12521h, bVar.f12521h) == 0 && kotlin.jvm.internal.o.b(this.f12522i, bVar.f12522i) && kotlin.jvm.internal.o.b(this.f12523j, bVar.f12523j);
    }

    public int hashCode() {
        return (((((((((((((((((this.f12514a.hashCode() * 31) + java.lang.Float.hashCode(this.f12515b)) * 31) + this.f12516c.hashCode()) * 31) + this.f12517d.hashCode()) * 31) + java.lang.Float.hashCode(this.f12518e)) * 31) + java.lang.Float.hashCode(this.f12519f)) * 31) + java.lang.Float.hashCode(this.f12520g)) * 31) + java.lang.Float.hashCode(this.f12521h)) * 31) + this.f12522i.hashCode()) * 31) + this.f12523j.hashCode();
    }

    public java.lang.String toString() {
        return "GestureSei(sdkUserId=" + this.f12514a + ", aspect=" + this.f12515b + ", gestureId=" + this.f12516c + ", randomId=" + this.f12517d + ", transX=" + this.f12518e + ", transY=" + this.f12519f + ", rotation=" + this.f12520g + ", scale=" + this.f12521h + ", giftComboId=" + this.f12522i + ", giftSoundId=" + this.f12523j + ')';
    }
}
