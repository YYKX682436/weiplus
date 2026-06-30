package su4;

/* loaded from: classes8.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f494663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su4.d3 f494664e;

    public w2(su4.d3 d3Var, java.lang.String str) {
        this.f494664e = d3Var;
        this.f494663d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        su4.d3 d3Var = this.f494664e;
        int i18 = d3Var.f494392b;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18)};
        java.lang.String str = d3Var.f494391a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "real start preloadWebView cached webview preloadBiz %d", objArr);
        d3Var.f494395e = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a17 = al5.l2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Create MMWebView %s", a17.m120143xc7aa84d5());
        a17.m81408x9e42f747(true);
        a17.m81409x2a6db82c(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y(16));
        a17.mo120153xd15cf999().E(true);
        a17.mo120153xd15cf999().z(true);
        a17.mo120153xd15cf999().r(false);
        a17.mo120153xd15cf999().P(true);
        a17.mo120153xd15cf999().G(true);
        a17.mo120153xd15cf999().M(false);
        a17.mo120153xd15cf999().L(false);
        a17.mo120153xd15cf999().C(true);
        a17.mo120153xd15cf999().D(true);
        a17.mo120153xd15cf999().J(0);
        a17.mo120153xd15cf999().l(10485760L);
        a17.mo120153xd15cf999().m(a17.getContext().getDir("webviewcache", 0).getAbsolutePath());
        a17.mo120153xd15cf999().k(true);
        a17.mo120153xd15cf999().t(true);
        a17.mo120153xd15cf999().u(lp0.b.X() + "databases/");
        com.p314xaae8f345.p3210x3857dc.d.g().d(true);
        com.p314xaae8f345.p3210x3857dc.d.g().f(a17, true);
        zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
        android.content.Context context = a17.getContext();
        java.lang.String g17 = a17.mo120153xd15cf999().g();
        ((yg0.s4) q3Var).getClass();
        a17.mo120153xd15cf999().Q(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.b(context, g17));
        nw4.p2 p2Var = new nw4.p2();
        a17.mo120128x74041feb(p2Var, "__wx");
        java.lang.String str2 = this.f494663d;
        a17.mo32265x141096a9(str2);
        android.net.Uri parse = android.net.Uri.parse(str2);
        java.lang.String queryParameter = parse.getQueryParameter(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        java.lang.String queryParameter2 = parse.getQueryParameter("subSessionId");
        try {
            i17 = java.lang.Integer.valueOf(parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)).intValue();
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        a17.mo74800x23d27c02(new su4.x2(d3Var, a17, new su4.e3(a17, queryParameter, queryParameter2, p2Var, i17)));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15005, java.lang.Integer.valueOf(i18), 1, 0);
    }
}
