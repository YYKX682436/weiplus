package z80;

/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f552193a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f552194b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f552195c;

    /* renamed from: d, reason: collision with root package name */
    public final float f552196d;

    /* renamed from: e, reason: collision with root package name */
    public final float f552197e;

    public q0(java.lang.String poiId, java.lang.String poiName, java.lang.String poiAddress, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiId, "poiId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiName, "poiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiAddress, "poiAddress");
        this.f552193a = poiId;
        this.f552194b = poiName;
        this.f552195c = poiAddress;
        this.f552196d = f17;
        this.f552197e = f18;
    }

    /* renamed from: equals */
    public boolean m178544xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80.q0)) {
            return false;
        }
        z80.q0 q0Var = (z80.q0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552193a, q0Var.f552193a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552194b, q0Var.f552194b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552195c, q0Var.f552195c) && java.lang.Float.compare(this.f552196d, q0Var.f552196d) == 0 && java.lang.Float.compare(this.f552197e, q0Var.f552197e) == 0;
    }

    /* renamed from: hashCode */
    public int m178545x8cdac1b() {
        return (((((((this.f552193a.hashCode() * 31) + this.f552194b.hashCode()) * 31) + this.f552195c.hashCode()) * 31) + java.lang.Float.hashCode(this.f552196d)) * 31) + java.lang.Float.hashCode(this.f552197e);
    }

    /* renamed from: toString */
    public java.lang.String m178546x9616526c() {
        return "POICorrectActionInfo(poiId=" + this.f552193a + ", poiName=" + this.f552194b + ", poiAddress=" + this.f552195c + ", longitude=" + this.f552196d + ", latitude=" + this.f552197e + ')';
    }
}
