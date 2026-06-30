package h61;

/* loaded from: classes9.dex */
public class i implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.tw4 f360683d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f360684e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f360685f = "";

    /* renamed from: g, reason: collision with root package name */
    public km5.b f360686g;

    public i() {
    }

    public int a() {
        gm0.j1.i();
        return ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_PAYER_NUM_INT, 20)).intValue();
    }

    public long b() {
        gm0.j1.i();
        return ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_PER_AMOUNT_LONG, 200000L)).longValue();
    }

    public int c() {
        gm0.j1.i();
        return ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_TOTAL_USER_NUM_INT, 20)).intValue();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAOperationData", "get AAOperation, onSceneEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 || i18 != 0) {
            km5.u.b().a(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 34L, 1L, false);
            return;
        }
        r45.s sVar = ((i61.i) m1Var).f370457e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAOperationData", "get AAOperation data, retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s,response.default_mod:%s", java.lang.Integer.valueOf(sVar.f466871d), sVar.f466872e, java.lang.Integer.valueOf(sVar.f466873f), java.lang.Integer.valueOf(sVar.f466874g), java.lang.Integer.valueOf(sVar.f466875h), java.lang.Long.valueOf(sVar.f466876i), java.lang.Long.valueOf(sVar.f466877m), sVar.f466878n, sVar.f466879o, java.lang.Integer.valueOf(sVar.f466880p));
        if (sVar.f466871d != 0) {
            km5.u.b().a(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 35L, 1L, false);
            return;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_PAYER_NUM_INT, java.lang.Integer.valueOf(sVar.f466873f));
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_RECEIVER_NUM_INT, java.lang.Integer.valueOf(sVar.f466874g));
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_TOTAL_USER_NUM_INT, java.lang.Integer.valueOf(sVar.f466875h));
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_TOTAL_AMOUNT_LONG, java.lang.Long.valueOf(sVar.f466876i));
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_MAX_PER_AMOUNT_LONG, java.lang.Long.valueOf(sVar.f466877m));
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_DEFAULT_INT, java.lang.Integer.valueOf(sVar.f466880p));
        h61.i iVar = new h61.i(sVar.f466879o, sVar.f466878n);
        iVar.f360683d = sVar.f466881q;
        iVar.f360684e = sVar.f466882r;
        iVar.f360685f = sVar.f466883s;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 33L, 1L, false);
        km5.u.h(this.f360686g, iVar);
    }

    public i(java.lang.String str, java.lang.String str2) {
    }
}
