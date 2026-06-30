package sr2;

/* loaded from: classes10.dex */
public final class f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6) {
        super(0);
        this.f493096d = c14609xb4d6eef6;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.nf2 nf2Var;
        r45.nf2 nf2Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493096d;
        dv2.m0 m0Var = (dv2.m0) ((jz5.n) c14609xb4d6eef6.Q).mo141623x754a37bb();
        sr2.e3 e3Var = new sr2.e3(c14609xb4d6eef6);
        m0Var.getClass();
        m92.b P6 = m0Var.P6();
        java.lang.Boolean bool = null;
        r45.nc4 u07 = P6 != null ? P6.u0() : null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (u07 == null || (nf2Var2 = (r45.nf2) u07.m75936x14adae67(55)) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) nf2Var2.m75936x14adae67(1);
        boolean z17 = !r26.n0.N(m0Var.f325429i);
        ry2.o k76 = m0Var.S6().k7();
        r45.q23 q23Var = m0Var.S6().k7().P;
        java.lang.String str = q23Var != null ? q23Var.f465118d : null;
        java.lang.Integer num = m0Var.S6().k7().f482953e;
        ov2.b bVar = ov2.b.f430701a;
        int i17 = k76.U;
        int v17 = bVar.v(str, i17, num);
        boolean z18 = false;
        if (v17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostAddTagUIC", "skip reminder, reason=%d videoTemplateId=%s enterScene=%d postType=%d", java.lang.Integer.valueOf(v17), str, java.lang.Integer.valueOf(i17), num);
        } else {
            m92.b P62 = m0Var.P6();
            r45.nc4 u08 = P62 != null ? P62.u0() : null;
            if (u08 != null && (nf2Var = (r45.nf2) u08.m75936x14adae67(55)) != null) {
                bool = java.lang.Boolean.valueOf(nf2Var.m75933x41a8a7f2(0));
            }
            z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE);
        }
        if (!z18 || c19786x6a1e2862 == null || z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderPostAddTagUIC", "tryAddTagBeforeClickPost: alreadyAdd:" + z17);
            e3Var.mo152xb9724478();
        } else {
            m0Var.f325430m = true;
            java.util.Map Q6 = m0Var.Q6();
            c61.ub ubVar = (c61.ub) ((jz5.n) m0Var.f325427g).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ubVar, "<get-routerService>(...)");
            c61.ub.M8(ubVar, m0Var.m80379x76847179(), c19786x6a1e2862, Q6, null, new dv2.l0(m0Var, e3Var), 8, null);
        }
        return jz5.f0.f384359a;
    }
}
