package zn1;

/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f556016a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f556017b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f556018c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f556019d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f556020e;

    public z(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5) {
        this.f556016a = num;
        this.f556017b = num2;
        this.f556018c = num3;
        this.f556019d = num4;
        this.f556020e = num5;
    }

    /* renamed from: equals */
    public boolean m179215xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1.z)) {
            return false;
        }
        zn1.z zVar = (zn1.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556016a, zVar.f556016a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556017b, zVar.f556017b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556018c, zVar.f556018c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556019d, zVar.f556019d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556020e, zVar.f556020e);
    }

    /* renamed from: hashCode */
    public int m179216x8cdac1b() {
        java.lang.Integer num = this.f556016a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f556017b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f556018c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.Integer num4 = this.f556019d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        java.lang.Integer num5 = this.f556020e;
        return hashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m179217x9616526c() {
        return "UsbDeviceInfo(vendorId=" + this.f556016a + ", productId=" + this.f556017b + ", clazz=" + this.f556018c + ", subClass=" + this.f556019d + ", protocol=" + this.f556020e + ')';
    }
}
