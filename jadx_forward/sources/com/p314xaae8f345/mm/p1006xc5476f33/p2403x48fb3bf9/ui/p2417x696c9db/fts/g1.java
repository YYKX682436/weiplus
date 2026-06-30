package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class g1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.h1 f265951a;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.h1 h1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v0 v0Var) {
        this.f265951a = h1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onPageFinished %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.h1 h1Var = this.f265951a;
        h1Var.f265961c.mo74408xb0dfae51(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 activityC19379x488a6357 = h1Var.f265961c;
        if (activityC19379x488a6357.F4 == null || activityC19379x488a6357.R3) {
            return;
        }
        activityC19379x488a6357.getClass();
        h1Var.f265961c.F4.mo81005xdc5215a6().d();
        h1Var.f265961c.mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onPageStarted %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.h1 h1Var = this.f265951a;
        h1Var.f265961c.mo74408xb0dfae51(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 activityC19379x488a6357 = h1Var.f265961c;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 c22484x63a3bec1 = activityC19379x488a6357.F4;
        if (c22484x63a3bec1 != null && !activityC19379x488a6357.R3) {
            c22484x63a3bec1.mo81005xdc5215a6().d();
            activityC19379x488a6357.mo48674x36654fab();
        }
        su4.k3.f(activityC19379x488a6357.K4, 1);
        su4.k3.g(activityC19379x488a6357.K4, 1, 0, 0, "");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.h1 h1Var = this.f265951a;
            if (str2.equals(h1Var.f265961c.F7())) {
                su4.k3.f(h1Var.f265961c.K4, 16);
            }
        }
    }
}
