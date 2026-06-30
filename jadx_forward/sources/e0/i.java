package e0;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f327128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f327129b;

    public i(int i17, int i18) {
        this.f327128a = i17;
        this.f327129b = i18;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i18 >= i17)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: equals */
    public boolean m126527xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0.i)) {
            return false;
        }
        e0.i iVar = (e0.i) obj;
        return this.f327128a == iVar.f327128a && this.f327129b == iVar.f327129b;
    }

    /* renamed from: hashCode */
    public int m126528x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f327128a) * 31) + java.lang.Integer.hashCode(this.f327129b);
    }

    /* renamed from: toString */
    public java.lang.String m126529x9616526c() {
        return "Interval(start=" + this.f327128a + ", end=" + this.f327129b + ')';
    }
}
