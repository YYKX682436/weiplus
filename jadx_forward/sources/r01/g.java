package r01;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f449603a;

    /* renamed from: b, reason: collision with root package name */
    public final int f449604b;

    /* renamed from: c, reason: collision with root package name */
    public final long f449605c;

    public g(long j17, int i17, long j18) {
        this.f449603a = j17;
        this.f449604b = i17;
        this.f449605c = j18;
    }

    /* renamed from: equals */
    public boolean m161191xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01.g)) {
            return false;
        }
        r01.g gVar = (r01.g) obj;
        return this.f449603a == gVar.f449603a && this.f449604b == gVar.f449604b && this.f449605c == gVar.f449605c;
    }

    /* renamed from: hashCode */
    public int m161192x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f449603a) * 31) + java.lang.Integer.hashCode(this.f449604b)) * 31) + java.lang.Long.hashCode(this.f449605c);
    }

    /* renamed from: toString */
    public java.lang.String m161193x9616526c() {
        return "BrandServiceMsgTripletInfo(mid=" + this.f449603a + ", idx=" + this.f449604b + ", bizUin=" + this.f449605c + ')';
    }
}
