package xj;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f536284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f536285b;

    public k(boolean z17, int i17) {
        this.f536284a = z17;
        this.f536285b = i17;
    }

    /* renamed from: equals */
    public boolean m175605xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj.k)) {
            return false;
        }
        xj.k kVar = (xj.k) obj;
        return this.f536284a == kVar.f536284a && this.f536285b == kVar.f536285b;
    }

    /* renamed from: hashCode */
    public int m175606x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f536284a) * 31) + java.lang.Integer.hashCode(this.f536285b);
    }

    /* renamed from: toString */
    public java.lang.String m175607x9616526c() {
        return "AdExptInfo(open=" + this.f536284a + ", groupId=" + this.f536285b + ')';
    }
}
