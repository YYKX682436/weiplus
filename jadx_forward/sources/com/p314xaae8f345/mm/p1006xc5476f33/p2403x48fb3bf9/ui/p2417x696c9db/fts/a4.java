package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class a4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b4 f265873a;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b4 b4Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.p3 p3Var) {
        this.f265873a = b4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "onPageFinished %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b4 b4Var = this.f265873a;
        b4Var.f265889c.mo74408xb0dfae51(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e = b4Var.f265889c;
        if (activityC19391xc941d0e.F4 == null || activityC19391xc941d0e.R3) {
            return;
        }
        activityC19391xc941d0e.getClass();
        b4Var.f265889c.F4.mo81005xdc5215a6().d();
        b4Var.f265889c.mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "onPageStarted %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b4 b4Var = this.f265873a;
        b4Var.f265889c.mo74408xb0dfae51(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e = b4Var.f265889c;
        tj5.z zVar = activityC19391xc941d0e.F4;
        if (zVar != null && !activityC19391xc941d0e.R3) {
            zVar.mo81005xdc5215a6().d();
            activityC19391xc941d0e.mo48674x36654fab();
        }
        su4.k3.f(activityC19391xc941d0e.K4, 1);
        su4.k3.g(activityC19391xc941d0e.K4, 1, 0, 0, "");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b4 b4Var = this.f265873a;
            if (str2.equals(b4Var.f265889c.F7())) {
                su4.k3.f(b4Var.f265889c.K4, 16);
            }
        }
    }
}
