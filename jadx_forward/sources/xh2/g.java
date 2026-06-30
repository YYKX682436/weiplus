package xh2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f536079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f536080b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f536081c;

    public g(boolean z17, int i17, boolean z18) {
        this.f536079a = z17;
        this.f536080b = i17;
        this.f536081c = z18;
    }

    /* renamed from: equals */
    public boolean m175549xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.g)) {
            return false;
        }
        xh2.g gVar = (xh2.g) obj;
        return this.f536079a == gVar.f536079a && this.f536080b == gVar.f536080b && this.f536081c == gVar.f536081c;
    }

    /* renamed from: hashCode */
    public int m175550x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f536079a) * 31) + java.lang.Integer.hashCode(this.f536080b)) * 31) + java.lang.Boolean.hashCode(this.f536081c);
    }

    /* renamed from: toString */
    public java.lang.String m175551x9616526c() {
        return "LiveUserMicMuteModel(notTalking=" + this.f536079a + ", userState=" + this.f536080b + ", isDiffMuteByAnchor=" + this.f536081c + ')';
    }
}
