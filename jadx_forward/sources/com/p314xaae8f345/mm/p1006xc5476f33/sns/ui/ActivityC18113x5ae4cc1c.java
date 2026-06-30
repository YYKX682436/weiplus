package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsStarListUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsStarListUI */
/* loaded from: classes4.dex */
public final class ActivityC18113x5ae4cc1c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public boolean f248952d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f248953e = "";

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0 f248954f = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0();

    /* renamed from: g, reason: collision with root package name */
    public int f248955g;

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        if (!(keyEvent != null && keyEvent.getKeyCode() == 4) || keyEvent.getAction() != 0) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
            return dispatchKeyEvent;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListUI", "back press in starList UI");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.class);
        c17694x1b4b7a7.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        intent.putExtra("sns_cmd_list", c17694x1b4b7a7.f244085r);
        setResult(-1, intent);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ctp;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("importUIComponents", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        java.util.Set D0 = kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.class, com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.class});
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("importUIComponents", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        return D0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        this.f248952d = getIntent().getBooleanExtra("KEY_IS_SELF", false);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_USER_NAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f248953e = stringExtra;
        this.f248955g = getIntent().getIntExtra("INTENT_SOURCE_PATH", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStarListUITitle", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        if (this.f248952d) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574779jf4);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj()).n(this.f248953e, true);
            java.lang.String v07 = ca4.z0.v0(n17 != null ? n17.g2() : this.f248953e);
            java.lang.String r17 = i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.f574780jf5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
            java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{v07}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            mo54450xbf7c1df6(format);
        }
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.rq(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStarListUITitle", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInitRptData", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        boolean h17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(this.f248953e);
        java.util.ArrayList arrayList = ta4.h1.f498283a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentStruct", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d c6912x2cb3987d = ta4.h1.f498285c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentStruct", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        c6912x2cb3987d.f142306f = h17 ? 1L : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentStruct", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d c6912x2cb3987d2 = ta4.h1.f498285c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentStruct", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        c6912x2cb3987d2.f142304d = c6912x2cb3987d2.b("OwnerUsername", this.f248953e, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initReporter", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        java.lang.String str = this.f248953e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0 b0Var = this.f248954f;
        b0Var.a(str);
        int i17 = this.f248955g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSourcePath50330", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        b0Var.f246364a = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSourcePath50330", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        java.lang.String stringExtra2 = getIntent().getStringExtra("INTENT_ALBUM_COMMENT_SESSION_ID");
        java.lang.String str2 = stringExtra2 != null ? stringExtra2 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsAlbumSessionId", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        b0Var.f246365b = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsAlbumSessionId", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsAlbumScene", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        b0Var.f246366c = 9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsAlbumScene", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.class);
        c17694x1b4b7a7.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReporter", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        c17694x1b4b7a7.f244077g = b0Var;
        sb4.w wVar = c17694x1b4b7a7.f244076f;
        if (wVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReporter", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            wVar.A = b0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReporter", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReporter", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initReporter", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInitRptData", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListUI", "initData >> " + this.f248952d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onDestroy();
        this.f248954f.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0.f246363k = new java.lang.ref.WeakReference(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onPause();
        this.f248954f.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onResume();
        this.f248954f.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onStart();
        java.util.ArrayList arrayList = ta4.h1.f498283a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("albumPageStart", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        ta4.h1.f498290h = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("albumPageStart", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
        super.onStop();
        java.util.ArrayList arrayList = ta4.h1.f498283a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("albumPageStop", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        if (ta4.h1.f498290h != 0) {
            ta4.h1.f498291i += java.lang.System.currentTimeMillis() - ta4.h1.f498290h;
            ta4.h1.f498290h = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("albumPageStop", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.SnsStarListUI");
    }
}
