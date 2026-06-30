package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI */
/* loaded from: classes3.dex */
public final class ActivityC13123x212a66da extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f177327d;

    /* renamed from: e, reason: collision with root package name */
    public int f177328e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f177329f = jz5.h.b(cw1.t6.f304874d);

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f177330g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f177331h;

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        if (!this.f177327d) {
            super.finish();
            return;
        }
        ((com.p314xaae8f345.mm.app.y7) f14.g.b()).d(new android.content.Intent().putExtra("Intro_Need_Clear_Top ", true), mo55332x76847179());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dmc;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f177327d = false;
        boolean booleanExtra = getIntent().getBooleanExtra("cleanModuleFiles", false);
        boolean z17 = booleanExtra && com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301726q;
        yv1.g1 b17 = yv1.g1.f547573p.b(getIntent().getIntExtra("session", -1));
        long j17 = b17.f547580f;
        int i17 = b17.f547581g;
        long j18 = (booleanExtra ? b17.f547582h : 0L) + j17;
        int i18 = i17 + (booleanExtra ? b17.f547583i : 0);
        this.f177328e = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        mo54448x9c8c0d33(new cw1.u6(this));
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.r0z);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.qzg);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.l68);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qze);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qzf);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mbo);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.m9e);
        android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.d2_);
        android.widget.TextView textView6 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.s1x);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String a17 = fp.n0.a(j18);
        textView4.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.dxx, a17));
        com.p314xaae8f345.mm.ui.bk.s0(((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o3c)).getPaint());
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        com.p314xaae8f345.mm.ui.bk.s0(textView3.getPaint());
        int i19 = (((i18 / 5) + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8) - 1) / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o7z)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572447ey2, java.lang.Integer.valueOf(i19)));
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.s8_);
        int i27 = z17 ? 0 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cw1.j7 j7Var = new cw1.j7(this, booleanExtra, b17, j18, findViewById, findViewById2, findViewById3, textView3, textView4, z17, textView5, textView6, i18, textView, textView2);
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.b5i);
        android.widget.TextView textView7 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jbv);
        textView7.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.dxp, a17));
        textView7.setOnClickListener(new cw1.a7(this, b17, findViewById, findViewById2, findViewById3, textView, textView2, i19, findViewById5, j7Var));
        findViewById5.setOnClickListener(new cw1.e7(this, textView, textView2, findViewById5));
        textView5.setOnClickListener(new cw1.f7(this));
    }
}
