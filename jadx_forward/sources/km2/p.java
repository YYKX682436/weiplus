package km2;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public r45.fa2 f390699a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f390700b;

    /* renamed from: c, reason: collision with root package name */
    public r45.lp1 f390701c;

    public p(r45.fa2 fa2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.lp1 lp1Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        fa2Var = (i17 & 1) != 0 ? null : fa2Var;
        gVar = (i17 & 2) != 0 ? null : gVar;
        lp1Var = (i17 & 4) != 0 ? null : lp1Var;
        this.f390699a = fa2Var;
        this.f390700b = gVar;
        this.f390701c = lp1Var;
    }

    /* renamed from: equals */
    public boolean m143680xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.p)) {
            return false;
        }
        km2.p pVar = (km2.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390699a, pVar.f390699a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390700b, pVar.f390700b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390701c, pVar.f390701c);
    }

    /* renamed from: hashCode */
    public int m143681x8cdac1b() {
        r45.fa2 fa2Var = this.f390699a;
        int hashCode = (fa2Var == null ? 0 : fa2Var.hashCode()) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f390700b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        r45.lp1 lp1Var = this.f390701c;
        return hashCode2 + (lp1Var != null ? lp1Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m143682x9616526c() {
        return "FinderLiveGuidePageData(container=" + this.f390699a + ", navBuffer=" + this.f390700b + ", extInfo=" + this.f390701c + ')';
    }
}
