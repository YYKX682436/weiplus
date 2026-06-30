package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "<init>", "()V", "zo1/s", "zo1/w", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI */
/* loaded from: classes5.dex */
public final class ActivityC12867x6b26c82f extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f174331w = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f174334g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Spinner f174335h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f174336i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f174337m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f174338n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f174339o;

    /* renamed from: p, reason: collision with root package name */
    public zo1.w f174340p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f174341q;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f174343s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f174344t;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f174332e = "MicroMsg.CheckBaoContentUI";

    /* renamed from: f, reason: collision with root package name */
    public long f174333f = -1;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f174342r = jz5.h.b(new zo1.b0(this));

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f174345u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f174346v = jz5.h.b(new zo1.u0(this));

    public static final void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f, java.util.List list, int i17) {
        activityC12867x6b26c82f.getClass();
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            if (list.size() > 1) {
                kz5.g0.t(list, new zo1.z());
            }
        } else if (list.size() > 1) {
            kz5.g0.t(list, new zo1.a0());
        }
        zo1.w wVar = activityC12867x6b26c82f.f174340p;
        if (wVar != null) {
            wVar.m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("conversationAdapter");
            throw null;
        }
    }

    public static final void a7(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str, android.view.View.OnClickListener onClickListener) {
        android.widget.LinearLayout linearLayout = activityC12867x6b26c82f.f174334g;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mainContentLl");
            throw null;
        }
        linearLayout.setVisibility(8);
        activityC12867x6b26c82f.c7().setVisibility(0);
        boolean z17 = true;
        activityC12867x6b26c82f.f174344t = true;
        ((android.widget.TextView) activityC12867x6b26c82f.c7().findViewById(com.p314xaae8f345.mm.R.id.rgi)).setText(charSequence);
        if (charSequence2 != null && charSequence2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            ((android.widget.TextView) activityC12867x6b26c82f.c7().findViewById(com.p314xaae8f345.mm.R.id.rgg)).setVisibility(8);
        } else {
            android.widget.TextView textView = (android.widget.TextView) activityC12867x6b26c82f.c7().findViewById(com.p314xaae8f345.mm.R.id.rgg);
            textView.setVisibility(0);
            textView.setText(charSequence2);
        }
        android.widget.Button button = (android.widget.Button) activityC12867x6b26c82f.c7().findViewById(com.p314xaae8f345.mm.R.id.rgf);
        if (str != null) {
            button.setText(str);
        } else {
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.m77);
        }
        if (onClickListener != null) {
            button.setOnClickListener(onClickListener);
        } else {
            button.setOnClickListener(new zo1.t0(activityC12867x6b26c82f));
        }
    }

    public final void b7() {
        finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559262q, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    public final android.widget.LinearLayout c7() {
        return (android.widget.LinearLayout) ((jz5.n) this.f174342r).mo141623x754a37bb();
    }

    public final void d7() {
        android.widget.LinearLayout linearLayout = this.f174334g;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mainContentLl");
            throw null;
        }
        linearLayout.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f174343s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f174343s = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwe), true, 3, new zo1.c0(this));
        ((ku5.t0) ku5.t0.f394148d).q(new zo1.g0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxe;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        b7();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.mvn);
        m78560xe21cbbf(false);
        mo78514x143f1b92().x0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvh), new java.lang.Runnable() { // from class: zo1.l0
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f.f174331w;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f.this.b7();
            }
        });
        m78563x4e0f6657(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.S);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 9L;
        c6839x89375b51.f141600e = 1L;
        c6839x89375b51.k();
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f174333f = longExtra;
        if (longExtra < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f174332e, "Invalid package id = " + this.f174333f);
            b7();
            return;
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f567761rz1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174334g = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f567763rz3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.Spinner spinner = (android.widget.Spinner) findViewById2;
        this.f174335h = spinner;
        spinner.setAdapter((android.widget.SpinnerAdapter) ((jz5.n) this.f174346v).mo141623x754a37bb());
        android.widget.Spinner spinner2 = this.f174335h;
        if (spinner2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("typeSpinner");
            throw null;
        }
        spinner2.setOnItemSelectedListener(new zo1.m0(this));
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f565797rk3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174336i = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById3;
        this.f174340p = new zo1.w();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f174336i;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f174336i;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        zo1.w wVar = this.f174340p;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("conversationAdapter");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(wVar);
        zo1.w wVar2 = this.f174340p;
        if (wVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("conversationAdapter");
            throw null;
        }
        wVar2.f556340g = new zo1.n0(this);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f567762rz2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f174337m = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f567760rz0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f174338n = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.ryz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById6;
        this.f174339o = button;
        button.setEnabled(false);
        android.widget.TextView textView = this.f174337m;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectAllTv");
            throw null;
        }
        textView.setOnClickListener(new zo1.o0(this));
        android.widget.Button button2 = this.f174339o;
        if (button2 != null) {
            button2.setOnClickListener(new zo1.p0(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.k(this.f174333f);
        if (k17 != null) {
            this.f174341q = k17;
            d7();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f174332e, "Fail to get package by id = " + this.f174333f);
        b7();
    }
}
