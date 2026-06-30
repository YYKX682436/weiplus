package ln2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vu1 f401417a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f401418b;

    /* renamed from: c, reason: collision with root package name */
    public final dk2.z7 f401419c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f401420d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f401421e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f401422f;

    public e(r45.vu1 vu1Var, boolean z17, dk2.z7 z7Var, boolean z18, java.util.List list, boolean z19) {
        this.f401417a = vu1Var;
        this.f401418b = z17;
        this.f401419c = z7Var;
        this.f401420d = z18;
        this.f401421e = list;
        this.f401422f = z19;
    }

    /* renamed from: equals */
    public boolean m146107xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln2.e)) {
            return false;
        }
        ln2.e eVar = (ln2.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f401417a, eVar.f401417a) && this.f401418b == eVar.f401418b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f401419c, eVar.f401419c) && this.f401420d == eVar.f401420d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f401421e, eVar.f401421e) && this.f401422f == eVar.f401422f;
    }

    /* renamed from: hashCode */
    public int m146108x8cdac1b() {
        r45.vu1 vu1Var = this.f401417a;
        int hashCode = (((vu1Var == null ? 0 : vu1Var.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f401418b)) * 31;
        dk2.z7 z7Var = this.f401419c;
        int m124696x8cdac1b = (((hashCode + (z7Var == null ? 0 : z7Var.m124696x8cdac1b())) * 31) + java.lang.Boolean.hashCode(this.f401420d)) * 31;
        java.util.List list = this.f401421e;
        return ((m124696x8cdac1b + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f401422f);
    }

    /* renamed from: toString */
    public java.lang.String m146109x9616526c() {
        return "WishAudiencePanelData(rewardWishListResp=" + this.f401417a + ", rewardWishUpdate=" + this.f401418b + ", interactionWishInfo=" + this.f401419c + ", interactionWishUpdate=" + this.f401420d + ", boardEventEntries=" + this.f401421e + ", boardEventUpdate=" + this.f401422f + ')';
    }

    public /* synthetic */ e(r45.vu1 vu1Var, boolean z17, dk2.z7 z7Var, boolean z18, java.util.List list, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(vu1Var, z17, z7Var, z18, (i17 & 16) != 0 ? null : list, (i17 & 32) != 0 ? false : z19);
    }
}
