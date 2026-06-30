package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderAndBizProfileUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderAndBizProfileUI */
/* loaded from: classes8.dex */
public final class ActivityC15011x9eafb87b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 370;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e5l;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.p1.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class, sr2.l5.class, pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.m8.class)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s7.f184071a.b(mo55332x76847179());
        boolean z17 = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).aj() || ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).nj();
        if (b17 && z17) {
            mo54450xbf7c1df6(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o8g));
        } else if (z17) {
            mo54450xbf7c1df6(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572261aj1));
        } else if (b17) {
            mo54450xbf7c1df6(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.clc));
        }
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.x0(this), 0);
        int i17 = (b17 && z17) ? 1 : z17 ? 2 : 0;
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.ttp, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3(i17), null);
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.sjg, new com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6(((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449687b, !b17), null);
        m7630xb2c12e75.e();
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderAndBiz);
        aVar.gk(this, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.a(this, kz5.c1.l(new jz5.l("finder_username", xy2.c.e(this)), new jz5.l("bizuin", ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ai()), new jz5.l("page_account_type", java.lang.Integer.valueOf(i17)))));
        aVar.Tj(this, 12, 1, false);
    }
}
