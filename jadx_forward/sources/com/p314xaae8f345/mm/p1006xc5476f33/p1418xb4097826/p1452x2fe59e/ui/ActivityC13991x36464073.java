package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI */
/* loaded from: classes8.dex */
public final class ActivityC13991x36464073 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 {
    public static final /* synthetic */ int C = 0;
    public int A;
    public java.lang.String B;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f190874v;

    /* renamed from: w, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f190875w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f190876x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f190877y;

    /* renamed from: z, reason: collision with root package name */
    public final bm2.f1 f190878z = new bm2.f1();

    public final void d7(yz5.q qVar) {
        r45.nw1 nw1Var;
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.d dVar = (mm2.d) efVar.i(mm2.d.class);
        java.lang.String str = dVar != null ? dVar.f410476g : null;
        if (str == null || str.length() == 0) {
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            str = c1Var != null ? c1Var.f410415s5 : null;
        }
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        java.lang.String str2 = c1Var2 != null ? c1Var2.f410385o : null;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        long j17 = 0;
        long j18 = e1Var != null ? e1Var.f410516m : 0L;
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var2 != null && (nw1Var = e1Var2.f410521r) != null) {
            j17 = nw1Var.m75942xfb822ef2(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("finder_live_biz_list", "username = " + str2 + ", objectId = " + pm0.v.u(j18) + ", liveId = " + j17 + ", biz username = " + str);
        r45.ld2 ld2Var = new r45.ld2();
        ld2Var.set(2, 1);
        ld2Var.set(3, str2);
        ld2Var.set(0, java.lang.Long.valueOf(j18));
        ld2Var.set(1, java.lang.Long.valueOf(j17));
        r45.ul3 ul3Var = new r45.ul3();
        ul3Var.set(0, str);
        ul3Var.set(1, java.lang.Integer.valueOf(this.A));
        ul3Var.set(3, this.B);
        ul3Var.set(2, 15);
        ul3Var.set(4, 0);
        pq5.g l17 = new ke2.o0("/cgi-bin/mmbiz-bin/finderlivegetprofilescreencast", 9914, ul3Var, ld2Var, null).l();
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.w7(this, qVar));
        l17.f(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aom;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        android.os.Bundle extras;
        if (i17 == 5 && i18 == -1) {
            if (intent == null || (extras = intent.getExtras()) == null || (str = extras.getString("finder_biz_live_article_url")) == null) {
                str = "";
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_biz_live_article_url", str);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m2d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f190876x = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.imn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f190877y = findViewById2;
        android.view.View view = this.f190876x;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
            throw null;
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a8(this));
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.akl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById3;
        this.f190875w = c1163xf1deaba4;
        c1163xf1deaba4.mo7960x6cab2c8d(this.f190878z);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f190875w;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bizList");
            throw null;
        }
        c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        findViewById(com.p314xaae8f345.mm.R.id.mdg).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.b8(this));
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.lr8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) findViewById4;
        this.f190874v = c22851x22587864;
        mn5.a aVar = new mn5.a();
        aVar.f411724a = 0.5f;
        aVar.f411725b = 300;
        aVar.f411726c = false;
        aVar.f411728e = true;
        aVar.f411729f = true;
        aVar.f411730g = true;
        aVar.f411731h = true;
        aVar.f411732i = false;
        aVar.f411733j = true;
        aVar.f411734k = true;
        aVar.f411735l = true;
        aVar.f411736m = false;
        aVar.f411737n = false;
        aVar.f411738o = true;
        aVar.f411739p = false;
        aVar.f411740q = false;
        c22851x22587864.m82934x82b4ca8f(aVar);
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878642 = this.f190874v;
        if (c22851x225878642 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
            throw null;
        }
        c22851x225878642.m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.z7(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.dzc);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x7(this));
        d7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.c8(this));
    }
}
