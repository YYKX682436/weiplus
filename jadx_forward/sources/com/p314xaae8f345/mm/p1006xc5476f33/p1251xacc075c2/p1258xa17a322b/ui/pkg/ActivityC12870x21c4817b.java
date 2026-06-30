package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI */
/* loaded from: classes5.dex */
public final class ActivityC12870x21c4817b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f174370m = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f174371d = -1;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f174372e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f174373f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f174374g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f174375h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f174376i;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxk;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PackageManagerUI", "onActivityResult requestCode=" + i17 + ", resultCode=" + i18);
        if (i17 == 125 && i18 == -1) {
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(mo55332x76847179(), 2, 0, false, false);
            z2Var.y(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            z2Var.F = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3() { // from class: zo1.q2
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
                public final void a() {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2.this.B();
                }
            };
            z2Var.x(1);
            z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.dq6);
            z2Var.C();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PackageManagerUI", "Roam is disable");
            finish();
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.mwf);
        mo54448x9c8c0d33(new zo1.r2(this));
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f174371d = longExtra;
        if (longExtra == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PackageManagerUI", "Get a invalid package id");
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.K);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 8L;
        c6839x89375b51.f141600e = 1L;
        c6839x89375b51.k();
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rzd)).setOnClickListener(new zo1.s2(this));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rz9)).setOnClickListener(new zo1.t2(this));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rzf)).setOnClickListener(new zo1.u2(this));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rzb)).setOnClickListener(new zo1.v2(this));
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.rza)).setOnClickListener(new zo1.x2(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.rze);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174373f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.rz_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174374g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.rzg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174375h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.rzc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f174376i = (android.widget.TextView) findViewById4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.e(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = r0Var.k(this.f174371d);
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PackageManagerUI", "Fail to get package by id=" + this.f174371d);
            finish();
            return;
        }
        this.f174372e = k17;
        java.lang.String a17 = go1.d.f355477a.a(k17);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f174372e;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        java.lang.String S1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S1(gVar.f297370o.f297371d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PackageManagerUI", "Package(pkgId=" + this.f174371d + ", displayName=" + a17 + ", size=" + S1 + ')');
        android.widget.TextView textView = this.f174373f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameTv");
            throw null;
        }
        textView.setText(a17);
        android.widget.TextView textView2 = this.f174374g;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backedUpConvsTv");
            throw null;
        }
        textView2.setText(S1);
        po1.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9.f35348x681a0c0c;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar2 = this.f174372e;
        if (gVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i iVar = gVar2.f297367i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iVar, "getBackupRange(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 a18 = aVar.a(iVar);
        android.widget.TextView textView3 = this.f174375h;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeTv");
            throw null;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        textView3.setText(fo1.r.c(a18, mo55332x76847179));
        po1.c cVar = po1.d.f438827i;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar3 = this.f174372e;
        if (gVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = gVar3.f297365g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
        po1.d a19 = cVar.a(uVar);
        android.widget.TextView textView4 = this.f174376i;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationTv");
            throw null;
        }
        textView4.setText(a19.b());
        r0Var.e(false);
    }
}
