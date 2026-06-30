package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p883x90995feb;

@db5.a(m123858x6ac9171 = 4099)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/image_composing/ImageComposingUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.mj_publisher.finder.image_composing.ImageComposingUI */
/* loaded from: classes5.dex */
public final class ActivityC10927x5b41b068 extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: enableLazyInitUIC */
    public boolean mo47004x48370588() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dyc;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{nu0.b4.class, nu0.d4.class, du0.i0.class, du0.b1.class, du0.t0.class, du0.v0.class, nu0.b1.class, nu0.k4.class, nu0.c4.class, nu0.r0.class, nu0.u0.class, nu0.s0.class, nu0.i4.class, nu0.o4.class, nu0.w0.class, nu0.g.class, nu0.f.class, nu0.s.class, nu0.p.class, nu0.j4.class, nu0.i.class});
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        mo2550x7c2abd06(1);
        getWindow().clearFlags(67108864);
        getWindow().clearFlags(134217728);
        getWindow().addFlags(Integer.MIN_VALUE);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        ug5.x.e(getWindow(), -16777216);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        super.onCreate(bundle);
        if (bundle == null) {
            i95.m c17 = i95.n0.c(w40.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            w40.e.eh((w40.e) c17, "MCImport", "MJShootComposing", null, 0, 12, null);
        }
        m78583x85ccfe01(8);
        mo78514x143f1b92().G0(0);
        mo78514x143f1b92().E0(0);
        m78567x3bd95720(true);
        m78568xd7114f24();
        int h17 = com.p314xaae8f345.mm.ui.bl.h(this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.q8o);
        findViewById.setPadding(0, h17, 0, 0);
        com.p314xaae8f345.mm.ui.a4.g(findViewById, true);
        i95.m c18 = i95.n0.c(pp0.h0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((yy0.m0) ((pp0.h0) c18)).mj();
        i95.m c19 = i95.n0.c(pp0.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        java.util.Map Ai = ((yy0.m7) ((pp0.l0) c19)).Ai();
        i95.m c27 = i95.n0.c(dy1.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
        iy1.c cVar = iy1.c.MJPublisherImageComposingUI;
        cy1.a aVar = (cy1.a) ((dy1.r) c27);
        cy1.a aVar2 = (cy1.a) aVar.ak(this, cVar);
        aVar2.gk(this, Ai);
        aVar2.Tj(this, 12, 6, false);
        i95.m c28 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
        w40.e eVar = (w40.e) c28;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624) getIntent().getParcelableExtra("KEY_PARAMS_CONFIG");
        android.os.Bundle bundle2 = c16993xacc19624 != null ? c16993xacc19624.M : null;
        cy1.a aVar3 = (cy1.a) aVar.ak(this, cVar);
        aVar3.Rj(this, iy1.a.Finder);
        aVar3.Tj(this, 12, 1, false);
        aVar3.gk(this, bundle2 != null ? zt0.a.a(bundle2) : null);
        w40.e.fh(eVar, "andr_MJ_Edit_Video_Expose", null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        getWindow().clearFlags(128);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().addFlags(128);
    }
}
