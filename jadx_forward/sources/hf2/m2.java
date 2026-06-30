package hf2;

/* loaded from: classes10.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f362649a;

    /* renamed from: b, reason: collision with root package name */
    public final hf2.r2 f362650b;

    public m2(int i17, hf2.r2 locationInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(locationInfo, "locationInfo");
        this.f362649a = i17;
        this.f362650b = locationInfo;
    }

    /* renamed from: equals */
    public boolean m133472xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf2.m2)) {
            return false;
        }
        hf2.m2 m2Var = (hf2.m2) obj;
        return this.f362649a == m2Var.f362649a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362650b, m2Var.f362650b);
    }

    /* renamed from: hashCode */
    public int m133473x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f362649a) * 31) + this.f362650b.m133478x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m133474x9616526c() {
        return "LocationInfoWrapper(stickerType=" + this.f362649a + ", locationInfo=" + this.f362650b + ')';
    }
}
