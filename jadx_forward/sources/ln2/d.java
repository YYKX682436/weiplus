package ln2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vu1 f401411a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f401412b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.xs1 f401413c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f401414d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f401415e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f401416f;

    public d(r45.vu1 vu1Var, boolean z17, r45.xs1 xs1Var, boolean z18, java.util.List list, boolean z19) {
        this.f401411a = vu1Var;
        this.f401412b = z17;
        this.f401413c = xs1Var;
        this.f401414d = z18;
        this.f401415e = list;
        this.f401416f = z19;
    }

    /* renamed from: equals */
    public boolean m146104xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln2.d)) {
            return false;
        }
        ln2.d dVar = (ln2.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f401411a, dVar.f401411a) && this.f401412b == dVar.f401412b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f401413c, dVar.f401413c) && this.f401414d == dVar.f401414d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f401415e, dVar.f401415e) && this.f401416f == dVar.f401416f;
    }

    /* renamed from: hashCode */
    public int m146105x8cdac1b() {
        r45.vu1 vu1Var = this.f401411a;
        int hashCode = (((vu1Var == null ? 0 : vu1Var.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f401412b)) * 31;
        r45.xs1 xs1Var = this.f401413c;
        int hashCode2 = (((hashCode + (xs1Var == null ? 0 : xs1Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f401414d)) * 31;
        java.util.List list = this.f401415e;
        return ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f401416f);
    }

    /* renamed from: toString */
    public java.lang.String m146106x9616526c() {
        return "WishAnchorPanelData(rewardWishListResp=" + this.f401411a + ", rewardWishUpdate=" + this.f401412b + ", interactionWishResp=" + this.f401413c + ", interactionWishUpdate=" + this.f401414d + ", boardEventEntries=" + this.f401415e + ", boardEventUpdate=" + this.f401416f + ')';
    }

    public /* synthetic */ d(r45.vu1 vu1Var, boolean z17, r45.xs1 xs1Var, boolean z18, java.util.List list, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(vu1Var, z17, xs1Var, z18, (i17 & 16) != 0 ? null : list, (i17 & 32) != 0 ? false : z19);
    }
}
