package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI */
/* loaded from: classes9.dex */
public class ActivityC12977xe43db9b8 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements l75.q0, pr1.i {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f175526p = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 f175528e;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f175527d = null;

    /* renamed from: f, reason: collision with root package name */
    public int f175529f = 251658241;

    /* renamed from: g, reason: collision with root package name */
    public boolean f175530g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f175531h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f175532i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f175533m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f175534n = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f175535o = new java.util.HashSet();

    @Override // pr1.i
    public void S4(int i17, java.lang.String str) {
        if (this.f175529f == 1) {
            java.util.HashSet hashSet = this.f175535o;
            if (hashSet.contains(java.lang.Integer.valueOf(i17))) {
                return;
            }
            hashSet.add(java.lang.Integer.valueOf(i17));
            boolean z17 = this.f175532i;
            java.lang.String str2 = z17 ? "7_2" : "7_3";
            java.lang.String str3 = z17 ? "me_bizlist" : "contacts_bizlist";
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x xVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x();
            xVar.f300748g = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.w.Expose;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            xVar.f300747f = java.lang.System.currentTimeMillis();
            xVar.f300749h = str2;
            xVar.f300750i = str3;
            if (str == null) {
                str = "";
            }
            xVar.f300751m = str;
            xVar.f300753o = java.lang.String.valueOf(i17 + 1);
            if (this.f175532i) {
                xVar.f300745d = com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b.b();
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a aVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b;
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y yVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y();
            yVar.f300787d = xVar;
            aVar.f(yVar);
        }
    }

    @Override // pr1.i
    public void X5(int i17, java.lang.String str) {
    }

    @Override // pr1.i
    public void b6(int i17, java.lang.String str) {
        if (this.f175529f == 1) {
            boolean z17 = this.f175532i;
            java.lang.String str2 = z17 ? "7_2" : "7_3";
            java.lang.String str3 = z17 ? "me_bizlist" : "contacts_bizlist";
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x xVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x();
            xVar.f300748g = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.w.Click;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            xVar.f300747f = java.lang.System.currentTimeMillis();
            xVar.f300749h = str2;
            xVar.f300750i = str3;
            if (str == null) {
                str = "";
            }
            xVar.f300751m = str;
            xVar.f300753o = java.lang.String.valueOf(i17 + 1);
            if (this.f175532i) {
                xVar.f300745d = com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b.b();
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a aVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b;
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y yVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y();
            yVar.f300787d = xVar;
            aVar.f(yVar);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569779o0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        int i17 = this.f175529f;
        if (i17 == 251658241 || i17 == 0) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571455fj);
        } else if (i17 == 1) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.me9);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1) findViewById(com.p314xaae8f345.mm.R.id.ndr);
        this.f175528e = viewOnCreateContextMenuListenerC12986xffd38cd1;
        viewOnCreateContextMenuListenerC12986xffd38cd1.m54323xfd4b21cd(this.f175529f);
        this.f175528e.m54324x6a3f32bf(true);
        this.f175528e.m54322xc605daef(this.f175534n);
        this.f175528e.m54318xa7687c07(this);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kn9);
        this.f175527d = textView;
        textView.setOnClickListener(new or1.s(this));
        this.f175527d.setVisibility(8);
        mo54448x9c8c0d33(new or1.t(this));
        if (((qk.s6) gm0.j1.s(qk.s6.class)).hh() && this.f175530g) {
            m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.jzr, com.p314xaae8f345.mm.R.raw.f78356x618865ad, new or1.u(this));
        }
        if (this.f175531h) {
            m78478x84f07bce(1, com.p314xaae8f345.mm.R.C30867xcad56011.jzq, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new or1.v(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1 && this.f175534n) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f175529f = getIntent().getIntExtra("intent_service_type", 251658241);
        this.f175530g = getIntent().getBooleanExtra("intent_should_show_search", true);
        this.f175531h = getIntent().getBooleanExtra("intent_should_show_menu", true);
        this.f175532i = getIntent().getBooleanExtra("intent_is_from_brand_service", false);
        this.f175534n = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(getIntent().getIntExtra("list_attr", 0), 16384);
        mo43517x10010bd5();
        r01.q3.cj().add(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1378L, 7L, 1L, false);
        int i17 = this.f175529f;
        if (i17 == 0) {
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.BrandServiceIndexUI)).Rj(this, iy1.a.ServiceBizList);
            return;
        }
        if (i17 == 1) {
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.BrandServiceContactsUI)).Rj(this, iy1.a.ServiceChat);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (gm0.j1.a()) {
            this.f175528e.j();
            r01.q3.cj().mo49775xc84af884(this);
        }
        super.onDestroy();
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        this.f175533m = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        gm0.j1.i();
        gm0.j1.u().c().w(233474, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        gm0.j1.i();
        gm0.j1.u().c().w(233473, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        gm0.j1.i();
        gm0.j1.u().c().w(233476, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (this.f175533m) {
            this.f175533m = false;
            this.f175528e.i();
        }
        super.onResume();
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        m78500x43e00957(1, true);
    }
}
