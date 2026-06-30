package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI */
/* loaded from: classes9.dex */
public class ViewOnClickListenerC19035xfddf7d86 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements android.view.View.OnClickListener, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f260227d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f260228e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f260229f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f260230g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f260231h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f260232i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f260233m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f260234n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f260236p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f260237q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f260238r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f260239s;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f260242v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f260243w;

    /* renamed from: o, reason: collision with root package name */
    public android.app.Dialog f260235o = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f260240t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f260241u = 0;

    public void V6() {
        java.util.ArrayList arrayList = this.f260230g;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int size = this.f260230g.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260227d).m(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) this.f260230g.get(i17)).f279313q, false);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260227d).notifyDataSetChanged();
    }

    public void W6(boolean z17) {
        if (z17) {
            android.view.View findViewById = findViewById(android.R.id.list);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f260228e.S.f261261i == 1) {
                this.f260239s.setVisibility(0);
            } else {
                this.f260239s.setVisibility(8);
            }
            V6();
            if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                this.f260232i.setVisibility(8);
                this.f260231h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kkr);
            } else {
                this.f260232i.setVisibility(0);
                this.f260232i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kkq);
                this.f260231h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kko);
            }
        } else {
            java.util.ArrayList arrayList2 = this.f260230g;
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = this.f260230g.size();
                for (int i17 = 0; i17 < size; i17++) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260227d).m(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) this.f260230g.get(i17)).f279313q, true);
                }
            }
            android.view.View findViewById2 = findViewById(android.R.id.list);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f260239s.setVisibility(8);
            this.f260232i.setVisibility(8);
            this.f260231h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kkp);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayDeductUI", "isCheck=" + this.f260229f.f292896x);
    }

    public final void X6() {
        at4.x1 Ai = vr4.f1.wi().Ai();
        if (this.f260238r == null) {
            this.f260238r = Ai.l(null, null, true, true, true);
        }
        if (this.f260238r == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayDeductUI", "no bank card!");
            finish();
            return;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(this.f260238r.f69233x225aa2b6);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(mo55332x76847179());
        b4Var.f261679d = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.a0(this, at4.l1.a(false));
        spannableString.setSpan(b4Var, 0, spannableString.length(), 18);
        this.f260233m.setText(spannableString);
        this.f260233m.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d7r;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f260232i = (android.widget.TextView) m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.ait);
        this.f260231h = (android.widget.Button) m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f260239s = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.krh);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.crj)).setText(this.f260228e.S.f261256d);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc)).setText(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f260228e.M).get(0)).f261240h);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab c22904x897710ab = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) findViewById(com.p314xaae8f345.mm.R.id.f565881dz2);
        c22904x897710ab.m83145x4e4ad719(0);
        c22904x897710ab.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.l(this.f260228e.f261214m));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565879dz0)).setText(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f260228e.M).get(0)).f261242m + "");
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gc7);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cri);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260228e.S.f261265p)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.f260228e.S.f261265p);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260228e.S.f261266q)) {
                textView2.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(this.f260228e.S.f261266q, true));
            }
        }
        this.f260233m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.crl);
        this.f260234n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564871ad5);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductInfo deductInfo = this.f260228e.S;
        boolean z17 = deductInfo.f261258f == 1;
        this.f260240t = z17;
        this.f260241u = deductInfo.f261262m;
        this.f260242v = deductInfo.f261263n;
        this.f260243w = deductInfo.f261264o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayDeductUI", "open: %s, show_type: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f260241u));
        if (this.f260241u == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.btf);
            this.f260229f = viewOnClickListenerC22631x1cc07cc8;
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(this.f260240t);
            this.f260229f.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.y(this));
            W6(this.f260240t);
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260242v)) {
                this.f260231h.setText(this.f260242v);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260243w)) {
                this.f260232i.setText(this.f260243w);
                this.f260232i.setVisibility(0);
            }
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.crh);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V6();
        }
        int i17 = this.f260228e.S.f261261i;
        if (this.f260228e.S.f261261i == 1) {
            gm0.j1.i();
            this.f260237q = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_DEDUCT_CHANGE_WORDING_STRING, "");
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_DEDUCT_SELECT_WORDING_STRING, "");
            this.f260236p = str;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260236p)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayDeductUI", "need do pay manager");
                this.f260235o = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(mo55332x76847179(), false, null);
                gs4.p pVar = new gs4.p();
                gm0.j1.i();
                gm0.j1.n().f354821b.g(pVar);
            } else {
                this.f260234n.setText(this.f260237q);
                X6();
            }
        } else {
            this.f260239s.setVisibility(8);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260228e.S.f261259g)) {
            textView.setVisibility(8);
        } else {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkm);
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkn);
            java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkl, string, string2);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, string3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(mo55332x76847179());
            android.text.SpannableString spannableString = new android.text.SpannableString(i18);
            spannableString.setSpan(b4Var, i18.length() - string2.length(), i18.length(), 33);
            textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
            textView.setText(spannableString);
            textView.setOnClickListener(this);
            textView.setVisibility(0);
        }
        this.f260231h.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        if (id6 == com.p314xaae8f345.mm.R.id.kao) {
            android.content.Intent intent = new android.content.Intent();
            if (this.f260241u == 0) {
                intent.putExtra("auto_deduct_flag", this.f260229f.f292896x ? 1 : 0);
            } else {
                intent.putExtra("auto_deduct_flag", this.f260228e.S.f261258f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f260238r;
            if (c19091x9511676c != null) {
                intent.putExtra("deduct_bank_type", c19091x9511676c.f69223x58802fcb);
                intent.putExtra("deduct_bind_serial", this.f260238r.f69225xed6d60f6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayDeductUI", "deduct bankType: %s", this.f260238r.f69223x58802fcb);
            }
            setResult(-1, intent);
            finish();
        } else if (id6 == com.p314xaae8f345.mm.R.id.gc7 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260228e.S.f261259g)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", this.f260228e.S.f261259g);
            intent2.putExtra("showShare", false);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(mo55332x76847179(), intent2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f260227d = m79336x8b97809d();
        mo2533x106ab264().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)));
        android.view.View j17 = mo2533x106ab264().j();
        if (j17 != null) {
            android.view.View findViewById = j17.findViewById(com.p314xaae8f345.mm.R.id.d0v);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            }
            android.view.View findViewById2 = j17.findViewById(android.R.id.text2);
            if (findViewById2 != null && (findViewById2 instanceof android.widget.TextView)) {
                ((android.widget.TextView) findViewById2).setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            }
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        if (fp.h.c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        } else {
            getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741));
        }
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletPayDeductUI", "intent is null");
            finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) intent.getParcelableExtra("orders");
        this.f260228e = c19099x8d444f05;
        if (c19099x8d444f05 == null || c19099x8d444f05.S == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletPayDeductUI", "Orders data or deductInfo is null   : " + this.f260228e);
            finish();
        }
        java.util.List list = this.f260228e.S.f261260h;
        if (list != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.size() != 0) {
                if (this.f260230g == null) {
                    int size = arrayList.size();
                    this.f260230g = new java.util.ArrayList();
                    for (int i17 = 0; i17 < size; i17++) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductShowInfo deductShowInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DeductShowInfo) arrayList.get(i17);
                        if (deductShowInfo != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(deductShowInfo.f261267d)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k0(this);
                            k0Var.L(deductShowInfo.f261267d);
                            if (deductShowInfo.f261269f > 0) {
                                k0Var.N = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo);
                                java.lang.String str = deductShowInfo.f261268e;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.b0(this, deductShowInfo);
                                k0Var.M = str;
                                k0Var.P = true;
                                k0Var.S = b0Var;
                            } else {
                                k0Var.M = deductShowInfo.f261268e;
                                k0Var.P = false;
                            }
                            k0Var.C("deduct_info_" + i17);
                            this.f260230g.add(k0Var);
                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260227d).d(k0Var, -1);
                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260227d).m(k0Var.f279313q, true);
                        }
                    }
                }
                setResult(0);
                mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.x(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
                gm0.j1.i();
                gm0.j1.n().f354821b.a(385, this);
                mo43517x10010bd5();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletPayDeductUI", "showinfos is null or length is 0");
        setResult(0);
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.x(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(385, this);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(385, this);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayDeductUI", "errType: %d, errCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if ((m1Var instanceof gs4.p) && i17 == 0 && i18 == 0) {
            gm0.j1.i();
            this.f260237q = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_DEDUCT_CHANGE_WORDING_STRING, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvi));
            gm0.j1.i();
            this.f260236p = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_DEDUCT_SELECT_WORDING_STRING, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvk));
            this.f260234n.setText(this.f260237q);
            X6();
        }
        android.app.Dialog dialog = this.f260235o;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
