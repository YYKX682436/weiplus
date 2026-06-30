package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI */
/* loaded from: classes9.dex */
public class ActivityC17135x4b12f675 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f238944d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f238945e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f238946f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f238947g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f238948h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f238949i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f238950m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f238951n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.RelativeLayout f238952o;

    /* renamed from: p, reason: collision with root package name */
    public int f238953p = 4;

    /* renamed from: q, reason: collision with root package name */
    public int f238954q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f238955r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f238956s;

    /* renamed from: t, reason: collision with root package name */
    public double f238957t;

    public void U6(double d17) {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f238948h;
        if (c22894x55bf3223 != null) {
            c22894x55bf3223.e(false);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5410x1ada3b11 c5410x1ada3b11 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5410x1ada3b11();
        java.lang.String stringExtra = getIntent().getStringExtra("key_amount_remind_sign");
        am.f9 f9Var = c5410x1ada3b11.f135756g;
        f9Var.f88187a = stringExtra;
        f9Var.f88190d = getIntent().getStringExtra("key_qr_code");
        f9Var.f88188b = (int) java.lang.Math.round(d17 * 100.0d);
        f9Var.f88189c = this;
        c5410x1ada3b11.e();
    }

    public void V6() {
        this.f238953p = getIntent().getIntExtra("key_amount_remind_bit", 4);
        this.f238955r = getIntent().getStringExtra("key_title");
        this.f238956s = getIntent().getStringExtra("key_desc");
    }

    public void W6() {
        this.f238945e.setText(this.f238955r);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.s1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.s1.class)).m42291x53d8522f("page_title_key", this.f238955r);
        this.f238946f.setText(this.f238956s);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceF2fLargeMoneyUI", "finish()");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ce8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r6(this));
        this.f238944d = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2);
        this.f238945e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565804dm1);
        this.f238946f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565803dm0);
        this.f238947g = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.luu);
        this.f238948h = (com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) findViewById(com.p314xaae8f345.mm.R.id.pok);
        this.f238951n = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.pcl);
        this.f238952o = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.pco);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.pck);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.pcp);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.pcm);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.chv);
        } else {
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.pcp);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.pcm);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.chu);
        }
        W6();
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) this.f238947g.m83186xefe232c4()).m83145x4e4ad719(4);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) this.f238947g.m83169xe7297452();
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) c28001xdd2bb359.getLayoutParams();
        layoutParams.leftMargin = 0;
        c28001xdd2bb359.setLayoutParams(layoutParams);
        android.widget.TextView m83186xefe232c4 = this.f238947g.m83186xefe232c4();
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) m83186xefe232c4.getLayoutParams();
        layoutParams2.width = -2;
        m83186xefe232c4.setLayoutParams(layoutParams2);
        m83130x21cc23c2(this.f238947g.m83169xe7297452(), true, true);
        this.f238948h.m82979x8ac63285(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((or4.c) pf5.z.f435481a.a(activity).a(or4.c.class)).m42291x53d8522f("keyboard_title_key", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        ((android.widget.RelativeLayout.LayoutParams) this.f238948h.getLayoutParams()).addRule(12);
        this.f238947g.r(7, 2);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = this.f238947g;
        int b17 = i65.a.b(mo55332x76847179(), 2);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = viewOnFocusChangeListenerC22907xe18534c2.f295694h;
        if (c28001xdd2bb3592 != null) {
            c28001xdd2bb3592.setPadding(b17, 0, 0, 0);
        }
        this.f238947g.m83169xe7297452().setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s6(this));
        this.f238947g.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.t6(this));
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f238948h;
        if (c22894x55bf3223 != null) {
            c22894x55bf3223.e(false);
        }
        this.f238952o.setVisibility(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_CN") || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_TW") || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_HK")) {
            this.f238949i = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.pcn);
            this.f238950m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pcq);
            this.f238949i.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.u6(this));
            this.f238947g.m83218xe68631a1(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.v6(this));
        } else {
            this.f238951n.setVisibility(8);
        }
        this.f238944d.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.w6(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceF2fLargeMoneyUI", "RemittanceF2fLargeMoneyUI show");
        int intExtra = getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", 0);
        int intExtra2 = getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", 0);
        if (intExtra != 0 && intExtra2 != 0) {
            overridePendingTransition(intExtra, intExtra2);
        }
        V6();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceF2fLargeMoneyUI", "onResume()");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r1.f239444a.a(this);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.s1.class);
    }
}
