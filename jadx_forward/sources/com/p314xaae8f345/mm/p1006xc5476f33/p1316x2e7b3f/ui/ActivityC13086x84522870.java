package com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/cast/ui/CastUIC;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.cast.ui.CastUIC */
/* loaded from: classes5.dex */
public final class ActivityC13086x84522870 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f177013m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f177014d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f177015e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f177016f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f177017g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f177018h;

    /* renamed from: i, reason: collision with root package name */
    public final av1.f f177019i;

    public ActivityC13086x84522870() {
        jz5.i iVar = jz5.i.f384364f;
        this.f177014d = jz5.h.a(iVar, new av1.c(this));
        this.f177015e = jz5.h.a(iVar, new av1.d(this));
        this.f177016f = jz5.h.a(iVar, new av1.b(this));
        this.f177017g = jz5.h.a(iVar, new av1.g(this));
        this.f177018h = jz5.h.a(iVar, new av1.a(this));
        this.f177019i = new av1.f(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutView */
    public android.view.View mo44092x29ebce5() {
        return new android.widget.FrameLayout(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575928lx);
        o25.n1.f(this);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i((java.lang.String) this.f177018h.mo141623x754a37bb(), "onCreate");
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1792);
        getWindow().setNavigationBarColor(0);
        getWindow().setStatusBarColor(0);
        m78531x8f8cf1fb();
        m78568xd7114f24();
        cv3.i iVar = (cv3.i) this.f177014d.mo141623x754a37bb();
        iVar.mo68194x6c4ebec7(this.f177019i);
        jz5.g gVar = this.f177017g;
        if (((com.p314xaae8f345.mm.p773xe98cb951.p774x4fc5b2ca.C10699x91316b6a) gVar.mo141623x754a37bb()) != null) {
            com.p314xaae8f345.mm.p773xe98cb951.p774x4fc5b2ca.C10699x91316b6a c10699x91316b6a = (com.p314xaae8f345.mm.p773xe98cb951.p774x4fc5b2ca.C10699x91316b6a) gVar.mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10699x91316b6a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
            c16997xb0aa383a.f237251o = 1;
            java.lang.String str = c10699x91316b6a.f149405d;
            java.lang.Integer h17 = r26.h0.h(str);
            c16997xb0aa383a.f237244e = h17 != null ? h17.intValue() : 0;
            int i17 = c10699x91316b6a.f149411m;
            if (i17 == 1) {
                r45.pg4 pg4Var = new r45.pg4();
                c16997xb0aa383a.A = pg4Var;
                pg4Var.f464551d = str;
            }
            java.lang.String str2 = c10699x91316b6a.f149407f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            c16997xb0aa383a.f237256t = str2;
            c16997xb0aa383a.f237247h = new java.util.ArrayList(c10699x91316b6a.f149408g);
            c16997xb0aa383a.f237245f = c10699x91316b6a.f149406e;
            c16997xb0aa383a.f237253q = c10699x91316b6a.f149410i;
            java.lang.String str3 = c10699x91316b6a.f149409h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
            c16997xb0aa383a.f237258v = str3;
            c16997xb0aa383a.I = i17;
            c16997xb0aa383a.f237250n = false;
            c16997xb0aa383a.f237249m = false;
            c16997xb0aa383a.f237254r = false;
            iVar.mo68195x60eb836b(kz5.b0.c(c16997xb0aa383a));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c.m68300x20d2931a(iVar, "", (java.util.ArrayList) this.f177015e.mo141623x754a37bb(), 0L, 30L, true, null, false, 96, null);
        iVar.f304109i = new av1.e(this);
        iVar.mo68201x76500a7f(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i((java.lang.String) this.f177018h.mo141623x754a37bb(), "onDestroy");
        super.onDestroy();
        ((cv3.i) this.f177014d.mo141623x754a37bb()).mo68177x5cd39ffa();
    }
}
