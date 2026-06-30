package wh;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Boolean f527310a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Boolean f527311b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Boolean f527312c;

    /* renamed from: d, reason: collision with root package name */
    public final int f527313d;

    /* renamed from: e, reason: collision with root package name */
    public final int f527314e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Boolean f527315f;

    public g(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i17, int i18, java.lang.Boolean bool4) {
        this.f527310a = bool;
        this.f527311b = bool2;
        this.f527312c = bool3;
        this.f527313d = i17;
        this.f527314e = i18;
        this.f527315f = bool4;
    }

    /* renamed from: equals */
    public boolean m173773xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh.g)) {
            return false;
        }
        wh.g gVar = (wh.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527310a, gVar.f527310a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527311b, gVar.f527311b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527312c, gVar.f527312c) && this.f527313d == gVar.f527313d && this.f527314e == gVar.f527314e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527315f, gVar.f527315f);
    }

    /* renamed from: hashCode */
    public int m173774x8cdac1b() {
        java.lang.Boolean bool = this.f527310a;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        java.lang.Boolean bool2 = this.f527311b;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        java.lang.Boolean bool3 = this.f527312c;
        int hashCode3 = (((((hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + this.f527313d) * 31) + this.f527314e) * 31;
        java.lang.Boolean bool4 = this.f527315f;
        return hashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m173775x9616526c() {
        return "DeviceChargeSates(deviceChargingV1=" + this.f527310a + ", deviceChargingV2=" + this.f527311b + ", deviceChargingV3=" + this.f527312c + ", status=" + this.f527313d + ", plugged=" + this.f527314e + ", onBattery=" + this.f527315f + ")";
    }
}
