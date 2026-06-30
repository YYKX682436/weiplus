package ey2;

/* loaded from: classes2.dex */
public final class a implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final int f338843d;

    /* renamed from: e, reason: collision with root package name */
    public final long f338844e;

    /* renamed from: f, reason: collision with root package name */
    public int f338845f;

    /* renamed from: g, reason: collision with root package name */
    public long f338846g;

    public a(int i17, long j17) {
        this.f338843d = i17;
        this.f338844e = j17;
    }

    /* renamed from: equals */
    public boolean m128319xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.a)) {
            return false;
        }
        ey2.a aVar = (ey2.a) obj;
        return this.f338843d == aVar.f338843d && this.f338844e == aVar.f338844e;
    }

    /* renamed from: hashCode */
    public int m128320x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f338843d) * 31) + java.lang.Long.hashCode(this.f338844e);
    }

    /* renamed from: toString */
    public java.lang.String m128321x9616526c() {
        return "Item(scene=" + this.f338843d + ", feedId=" + this.f338844e + ')';
    }
}
