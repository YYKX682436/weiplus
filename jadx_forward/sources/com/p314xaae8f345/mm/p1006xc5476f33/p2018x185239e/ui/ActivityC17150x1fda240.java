package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultOldUI */
/* loaded from: classes9.dex */
public class ActivityC17150x1fda240 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17151xe789054f {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f239122i = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f239123e;

    /* renamed from: f, reason: collision with root package name */
    public int f239124f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f239125g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239126h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17151xe789054f
    public boolean U6() {
        return false;
    }

    public final void W6() {
        if (!m83105x7498fe14().containsKey("key_realname_guide_helper")) {
            m83108x2b5a5a39().f(this, m83105x7498fe14());
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h8(this), 100L);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1) m83105x7498fe14().getParcelable("key_realname_guide_helper");
        if (c19088xa4b300c1 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceResultUI");
            bundle.putString("realname_verify_process_jump_plugin", "remittance");
            c19088xa4b300c1.a(this, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.g8(this), null);
            m83105x7498fe14().remove("key_realname_guide_helper");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17151xe789054f, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ceg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str;
        boolean z17;
        java.util.List list;
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i17));
        mo54448x9c8c0d33(null);
        m78600x5843c740(false);
        m78499x92e71989(false);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568158lx0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f239123e;
        if (c19099x8d444f05 != null) {
            textView.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c19099x8d444f05.f261211h, c19099x8d444f05.f261214m));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().getParcelable("key_pay_info");
        if (c19760x34448d56 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceResultOldUI", "payInfo is null!!!");
            finish();
            return;
        }
        android.os.Bundle bundle = c19760x34448d56.f273655u;
        if (bundle != null) {
            this.f239126h = bundle.getBoolean("extinfo_key_4");
            str = c19760x34448d56.f273655u.getString("extinfo_key_1");
        } else {
            str = "";
        }
        int i17 = c19760x34448d56.f273642e;
        this.f239124f = i17;
        this.f239125g = str;
        java.lang.String x17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(str);
        if (i17 == 31) {
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568160lx2);
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574365i16, x17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                textView2.setVisibility(8);
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                float textSize = textView2.getTextSize();
                ((ke0.e) xVar).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string, textSize));
                textView2.setVisibility(0);
            }
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.lwt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f239123e.f261215n > 0.0d) {
                android.content.res.Resources resources = getResources();
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f052 = this.f239123e;
                ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565143bf1)).setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574363i14, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c19099x8d444f052.f261215n, c19099x8d444f052.f261214m)));
                android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565144bf2);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.os.Bundle bundle2 = c19760x34448d56.f273655u;
            java.lang.String string2 = bundle2 != null ? bundle2.getString("extinfo_key_2") : "";
            if (i17 != 32 && i17 != 33) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                    x17 = x17 + getString(com.p314xaae8f345.mm.R.C30867xcad56011.i1n);
                } else {
                    x17 = x17 + "（" + com.p314xaae8f345.mm.p2802xd031a825.ui.r1.y(string2) + "）";
                }
            }
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568160lx2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
                textView3.setVisibility(8);
            } else {
                java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574364i15, x17);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                float textSize2 = textView3.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string3, textSize2));
                textView3.setVisibility(0);
            }
            if (i17 == 33 || i17 == 32) {
                android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.lwy);
                android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lwz);
                android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lwx);
                java.lang.String string4 = c19760x34448d56.f273655u.getString("extinfo_key_3");
                java.lang.String string5 = c19760x34448d56.f273655u.getString("extinfo_key_8");
                boolean z18 = true;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    z17 = false;
                } else {
                    le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                    float textSize3 = textView5.getTextSize();
                    ((ke0.e) xVar3).getClass();
                    textView5.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string4, textSize3));
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string5)) {
                        textView4.setText(string5);
                    }
                    z17 = true;
                }
                android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.lwv);
                android.widget.TextView textView6 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lww);
                android.widget.TextView textView7 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lwu);
                java.lang.String string6 = c19760x34448d56.f273655u.getString("extinfo_key_6");
                java.lang.String string7 = c19760x34448d56.f273655u.getString("extinfo_key_7");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string7)) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    z18 = false;
                } else {
                    le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                    float textSize4 = textView7.getTextSize();
                    ((ke0.e) xVar4).getClass();
                    textView7.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string7, textSize4));
                    textView7.setVisibility(0);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string6)) {
                        le0.x xVar5 = (le0.x) i95.n0.c(le0.x.class);
                        float textSize5 = textView6.getTextSize();
                        ((ke0.e) xVar5).getClass();
                        textView6.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string6, textSize5));
                    }
                }
                if (!z17 && !z18) {
                    android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.lwt);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i17 == 5 && (list = this.f239123e.M) != null && ((java.util.ArrayList) list).get(0) != null && !android.text.TextUtils.isEmpty(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f239123e.M).get(0)).f261239g)) {
                textView3.setText(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f239123e.M).get(0)).f261239g);
            }
        }
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f568159lx1)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.f8(this));
        ((mz2.j2) ((mz2.e1) i95.n0.c(mz2.e1.class))).Ai(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17151xe789054f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f239123e = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) m83105x7498fe14().getParcelable("key_orders");
        mo43517x10010bd5();
        if (this.f239124f == 31) {
            java.lang.String str = ((java.util.ArrayList) this.f239123e.M).size() > 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f239123e.M).get(0)).f261247r : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResultOldUI", "transId: %s", str);
            kw3.p.Ai().Di().d(str, this.f239125g, "");
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            W6();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17151xe789054f, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
