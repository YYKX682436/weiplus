package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19402x2b328b6 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d {
    public static final /* synthetic */ int K3 = 0;
    public boolean A3 = false;
    public int B3 = 0;
    public int C3 = 0;
    public int D3 = 0;
    public java.lang.String E3 = "";
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6429x5666eb5 F3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6429x5666eb5();
    public boolean G3 = false;
    public int H3 = 0;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 I3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.h5(this, android.os.Looper.getMainLooper());
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j5 J3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j5(this);

    public static void m9(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19402x2b328b6 activityC19402x2b328b6, java.lang.String str, int i17) {
        java.lang.String[] split;
        if (activityC19402x2b328b6.A3 || activityC19402x2b328b6.B3 == 0) {
            return;
        }
        activityC19402x2b328b6.A3 = true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19402x2b328b6.N) || !activityC19402x2b328b6.N.startsWith("wes") || (split = activityC19402x2b328b6.N.split("#")) == null || split.length < 5) {
            return;
        }
        if (activityC19402x2b328b6.D3 == 0) {
            activityC19402x2b328b6.D3 = 200;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("deadlinks=1&scene=");
        stringBuffer.append(activityC19402x2b328b6.B3);
        stringBuffer.append("&searchid=");
        stringBuffer.append(split[1]);
        stringBuffer.append("&businesstype=");
        stringBuffer.append(split[2]);
        stringBuffer.append("&docid=");
        stringBuffer.append(split[3]);
        stringBuffer.append("&subtype=");
        stringBuffer.append(activityC19402x2b328b6.C3);
        stringBuffer.append("&contentlength=");
        stringBuffer.append(str.length());
        stringBuffer.append("&status=");
        stringBuffer.append(activityC19402x2b328b6.D3);
        stringBuffer.append("&httpstatus=");
        stringBuffer.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosWebViewUI", "reportHtmlStatus %s", stringBuffer.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("reportString", stringBuffer.toString());
        try {
            activityC19402x2b328b6.K1.U6(8, bundle);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.SosWebViewUI", e17, "reportHtmlStatus", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e76 = super.e7();
        e76.E(this.J3);
        return e76;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean l7() {
        return !getIntent().getBooleanExtra("disable_minimize", false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f265348f.mo120128x74041feb(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.k5(this), "SosJSApi");
        this.B3 = getIntent().getIntExtra("from_scence", 0);
        this.C3 = getIntent().getIntExtra("subtype", 0);
        this.E3 = getIntent().getStringExtra("rawUrl");
        java.lang.String stringExtra = getIntent().getStringExtra("key_init_url");
        boolean z17 = stringExtra != null;
        this.G3 = z17;
        if (z17) {
            long c17 = c01.id.c();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6429x5666eb5 c6429x5666eb5 = this.F3;
            c6429x5666eb5.f137671e = c17;
            c6429x5666eb5.f137673g = c6429x5666eb5.b("InitUrl", stringExtra.replace(",", "!"), true);
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_search_query");
            c6429x5666eb5.f137670d = c6429x5666eb5.b("Query", stringExtra2 == null ? "" : stringExtra2.replace(",", "!"), true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f265348f.mo120173x7af55728("SosJSApi");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j5 j5Var = this.J3;
        e3Var.M0(j5Var);
        this.L1.K0(j5Var.f266011b);
        if (this.G3) {
            long mo78509x4b0ac5a2 = mo78509x4b0ac5a2();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6429x5666eb5 c6429x5666eb5 = this.F3;
            c6429x5666eb5.f137672f = mo78509x4b0ac5a2;
            c6429x5666eb5.f137674h = this.H3;
            c6429x5666eb5.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosWebViewUI", "FTSRelatedSugH5ReportStruct.report url : %s, enterTime : %d, stayTime : %d, getQuery : %s ,id : %d, pageChangeCount : %d.", c6429x5666eb5.f137673g, java.lang.Long.valueOf(c6429x5666eb5.f137671e), java.lang.Long.valueOf(c6429x5666eb5.f137672f), c6429x5666eb5.f137670d, 22251, java.lang.Integer.valueOf(this.H3));
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void x8(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        super.x8(c27816xac2547f9, str);
        if (this.G3) {
            this.H3++;
        }
    }
}
