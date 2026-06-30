package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderEditTextUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderEditTextUI */
/* loaded from: classes5.dex */
public final class ActivityC15027x39e0411 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f210095w = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 f210096t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b f210097u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f210098v = "Finder.FinderEditTextUI";

    public final void c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d02 = this.f210096t;
        if (c15505x942e3d02 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15505x942e3d02.m63438xfb85ada3().toString())) {
            finish();
        } else {
            db5.e1.l(this, com.p314xaae8f345.mm.R.C30867xcad56011.f9e, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f9j, com.p314xaae8f345.mm.R.C30867xcad56011.f9i, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e5(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.f5(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560154cg);
        }
    }

    public final void d7(int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b.f218473p;
        if (i17 == 101) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d02 = this.f210096t;
            if (c15505x942e3d02 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
                throw null;
            }
            c15505x942e3d02.m63441x4ee3c29f(8388611);
        } else if (i17 == 102) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d022 = this.f210096t;
            if (c15505x942e3d022 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
                throw null;
            }
            c15505x942e3d022.m63441x4ee3c29f(1);
        }
        getIntent().putExtra("saveAlign", i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ag_;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.g5(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.d76);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f210096t = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565684d61);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f210097u = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b) findViewById2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d02 = this.f210096t;
        if (c15505x942e3d02 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        c15505x942e3d02.m63444x9e8131ca(10);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d022 = this.f210096t;
        if (c15505x942e3d022 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        c15505x942e3d022.m63439x372124a3(com.p314xaae8f345.mm.R.C30861xcebc809e.afr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d023 = this.f210096t;
        if (c15505x942e3d023 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        c15505x942e3d023.m63441x4ee3c29f(8388611);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d024 = this.f210096t;
        if (c15505x942e3d024 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        c15505x942e3d024.m63443xc656e635(147457);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d025 = this.f210096t;
        if (c15505x942e3d025 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573538ex2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c15505x942e3d025.m63442x3abad7d6(string);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d026 = this.f210096t;
        if (c15505x942e3d026 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c15505x942e3d026.f218481e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
        c22621x7603e017.requestFocus();
        java.lang.String stringExtra = getIntent().getStringExtra("saveText");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d027 = this.f210096t;
            if (c15505x942e3d027 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c15505x942e3d027.f218481e;
            if (c22621x7603e0172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
                throw null;
            }
            c22621x7603e0172.n(stringExtra);
        }
        int intExtra = getIntent().getIntExtra("saveAlign", -1);
        if (intExtra > 0) {
            d7(intExtra);
        }
        mo26063x7b383410();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b c15504xec43012b = this.f210097u;
        if (c15504xec43012b == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editFooter");
            throw null;
        }
        c15504xec43012b.m63436x2d08422a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.h5(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b c15504xec43012b2 = this.f210097u;
        if (c15504xec43012b2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editFooter");
            throw null;
        }
        c15504xec43012b2.m63437xf9b941db(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.i5(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.j5(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        c7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }
}
