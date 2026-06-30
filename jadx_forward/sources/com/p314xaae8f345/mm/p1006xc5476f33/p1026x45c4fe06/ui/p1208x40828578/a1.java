package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 f171556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f171557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 f171559g;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4, int i17, java.lang.String str) {
        this.f171559g = c1Var;
        this.f171556d = c11712x63ef1ef4;
        this.f171557e = i17;
        this.f171558f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4 = this.f171556d;
        boolean z17 = c11712x63ef1ef4.B;
        int i18 = c11712x63ef1ef4.A;
        java.lang.String str = c11712x63ef1ef4.f157888w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var = this.f171559g;
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)).D0(str, i18, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = c1Var.f171587p;
            if (!c12723x5ab2de90.f171535m && c12723x5ab2de90.f171534i) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().m0(c11712x63ef1ef4.f157888w, c11712x63ef1ef4.A, false, 0, 2, null, false);
            }
            c1Var.f171587p.m0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.z0(this));
            i17 = 7;
        } else {
            int m07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)).m0(str, i18, true);
            if (m07 == -2) {
                c1Var.f171587p.n0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.x0(this));
                return;
            } else if (m07 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLauncherRecentsList", "addStarApp, username %s, type %d, fatal", str, java.lang.Integer.valueOf(i18));
                return;
            } else {
                c1Var.f171587p.m0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.y0(this));
                i17 = 6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.y0.b(c11712x63ef1ef4, i17, this.f171557e, this.f171558f);
    }
}
