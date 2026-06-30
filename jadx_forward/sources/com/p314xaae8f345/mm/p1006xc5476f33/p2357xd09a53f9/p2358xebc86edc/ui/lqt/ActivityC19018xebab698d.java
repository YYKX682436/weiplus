package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishProgressNewUI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishProgressNewUI */
/* loaded from: classes8.dex */
public final class ActivityC19018xebab698d extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f259568d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f259569e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f259570f;

    /* renamed from: g, reason: collision with root package name */
    public r45.an5 f259571g;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bto;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.iwf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f259568d = (android.widget.TextView) findViewById;
        r45.an5 an5Var = this.f259571g;
        if (an5Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redeemFundRes");
            throw null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(an5Var.f451686r)) {
            android.widget.TextView textView = this.f259568d;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                throw null;
            }
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_8));
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            r45.an5 an5Var2 = this.f259571g;
            if (an5Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redeemFundRes");
                throw null;
            }
            objArr[0] = an5Var2.f451686r;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchFinishProgressNewUI", "redeemFundRes.pre_arrival_time_headline: %s", objArr);
            android.widget.TextView textView2 = this.f259568d;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                throw null;
            }
            r45.an5 an5Var3 = this.f259571g;
            if (an5Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redeemFundRes");
                throw null;
            }
            textView2.setText(an5Var3.f451686r);
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.iwc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f259570f = (android.widget.LinearLayout) findViewById2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c c18997x8359ff6c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c((android.content.Context) this, true);
        if (this.f259571g == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redeemFundRes");
            throw null;
        }
        c18997x8359ff6c.b(com.p314xaae8f345.mm.R.C30867xcad56011.kqq, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(r4.f451682n / 100.0f));
        android.widget.LinearLayout linearLayout = this.f259570f;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentLayout");
            throw null;
        }
        linearLayout.addView(c18997x8359ff6c);
        r45.an5 an5Var4 = this.f259571g;
        if (an5Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redeemFundRes");
            throw null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(an5Var4.f451683o)) {
            r45.an5 an5Var5 = this.f259571g;
            if (an5Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redeemFundRes");
                throw null;
            }
            java.lang.String str = an5Var5.f451683o;
            if (an5Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redeemFundRes");
                throw null;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(an5Var5.f451684p)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(" (");
                r45.an5 an5Var6 = this.f259571g;
                if (an5Var6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redeemFundRes");
                    throw null;
                }
                sb6.append(an5Var6.f451684p);
                sb6.append(')');
                str = sb6.toString();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c c18997x8359ff6c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.C18997x8359ff6c((android.content.Context) this, false);
            c18997x8359ff6c2.b(com.p314xaae8f345.mm.R.C30867xcad56011.kpf, str);
            android.widget.LinearLayout linearLayout2 = this.f259570f;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentLayout");
                throw null;
            }
            linearLayout2.addView(c18997x8359ff6c2);
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.iwb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f259569e = findViewById3;
        findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.e5(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        mo2533x106ab264.o();
        m78600x5843c740(false);
        m78499x92e71989(false);
        m78560xe21cbbf(false);
        this.f39322x2305be9.G0(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_redeem_res");
        r45.an5 an5Var = new r45.an5();
        this.f259571g = an5Var;
        try {
            an5Var.mo11468x92b714fd(byteArrayExtra);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLqtSaveFetchFinishProgressNewUI", e17, "parse redeemFundRes error!", new java.lang.Object[0]);
            finish();
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.an5 an5Var2 = this.f259571g;
        if (an5Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("redeemFundRes");
            throw null;
        }
        java.lang.String format = java.lang.String.format("status:%s, wording_for_status2:%s, pre_arrive_time_wording:%s, redeem_fee:%s, bank_name:%s, card_tail:%s, failure_wording:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(an5Var2.f451679h), an5Var2.f451680i, an5Var2.f451681m, java.lang.Integer.valueOf(an5Var2.f451682n), an5Var2.f451683o, an5Var2.f451684p, an5Var2.f451685q}, 7));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        objArr[0] = format;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchFinishProgressNewUI", "onCreate, redeemRes: %s", objArr);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20287, 8);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
