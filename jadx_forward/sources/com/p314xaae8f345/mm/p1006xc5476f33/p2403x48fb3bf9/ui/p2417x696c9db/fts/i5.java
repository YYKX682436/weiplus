package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class i5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j5 f265976a;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j5 j5Var) {
        this.f265976a = j5Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j5 j5Var = this.f265976a;
        j5Var.f266012c.I3.mo50303x856b99f0(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6 activityC19402x2b328b6 = j5Var.f266012c;
        if (activityC19402x2b328b6.A3) {
            return;
        }
        activityC19402x2b328b6.I3.mo50307xb9e94560(0, 1000L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6 activityC19402x2b328b6 = this.f265976a.f266012c;
        activityC19402x2b328b6.E3 = str;
        activityC19402x2b328b6.I3.mo50303x856b99f0(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j5 j5Var = this.f265976a;
        java.lang.String str3 = j5Var.f266012c.E3;
        if (str3 == null || !str3.equals(str2)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedError %d %s", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6 activityC19402x2b328b6 = j5Var.f266012c;
        activityC19402x2b328b6.D3 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6.m9(activityC19402x2b328b6, "", 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void k(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, com.p314xaae8f345.p3210x3857dc.y0 y0Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j5 j5Var = this.f265976a;
        java.lang.String str2 = j5Var.f266012c.E3;
        if (str2 == null || !str2.equals(x0Var.mo120512xb5887639().toString())) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6 activityC19402x2b328b6 = j5Var.f266012c;
        int i17 = y0Var.f302156c;
        activityC19402x2b328b6.D3 = i17;
        if (i17 < 400 || i17 >= 600) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedHttpError not report %s %d", x0Var.mo120512xb5887639().toString(), java.lang.Integer.valueOf(j5Var.f266012c.D3));
            return;
        }
        try {
            str = new java.lang.String(kk.f.b(y0Var.f302159f));
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedHttpError %s %d %s", x0Var.mo120512xb5887639().toString(), java.lang.Integer.valueOf(j5Var.f266012c.D3), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6.m9(j5Var.f266012c, str, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void l(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.l0 l0Var, android.net.http.SslError sslError) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j5 j5Var = this.f265976a;
        java.lang.String str = j5Var.f266012c.E3;
        if (str == null || !str.equals(sslError.getUrl())) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedSslError");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6 activityC19402x2b328b6 = j5Var.f266012c;
        activityC19402x2b328b6.D3 = -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6.m9(activityC19402x2b328b6, "", 0);
    }
}
