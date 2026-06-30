package hk0;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final hk0.z0 f363379a;

    /* renamed from: b, reason: collision with root package name */
    public final hk0.z0 f363380b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f363381c;

    public y0(hk0.z0 mosaicType, hk0.z0 lastMosaicType, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mosaicType, "mosaicType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastMosaicType, "lastMosaicType");
        this.f363379a = mosaicType;
        this.f363380b = lastMosaicType;
        this.f363381c = z17;
    }

    /* renamed from: equals */
    public boolean m133662xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.y0)) {
            return false;
        }
        hk0.y0 y0Var = (hk0.y0) obj;
        return this.f363379a == y0Var.f363379a && this.f363380b == y0Var.f363380b && this.f363381c == y0Var.f363381c;
    }

    /* renamed from: hashCode */
    public int m133663x8cdac1b() {
        return (((this.f363379a.hashCode() * 31) + this.f363380b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f363381c);
    }

    /* renamed from: toString */
    public java.lang.String m133664x9616526c() {
        return "MosaicState(mosaicType=" + this.f363379a + ", lastMosaicType=" + this.f363380b + ", changeAni=" + this.f363381c + ')';
    }
}
