package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI */
/* loaded from: classes9.dex */
public class ActivityC19028xce441c18 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements qp5.i0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f260122r = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f260123d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260124e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260125f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260126g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260127h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a f260128i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f260129m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 f260130n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c f260131o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f260132p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f260133q;

    public final boolean U6() {
        boolean c17 = this.f260125f.c(null);
        if (this.f260128i.getVisibility() == 0) {
            if ((this.f260128i.f262254h == 0) && !this.f260127h.c(null)) {
                c17 = false;
            }
        }
        if (!this.f260126g.c(null)) {
            c17 = false;
        }
        if (this.f260129m == null || this.f260130n == null) {
            c17 = false;
        }
        if (c17) {
            this.f260123d.setEnabled(true);
            this.f260123d.setClickable(true);
        } else {
            this.f260123d.setEnabled(false);
            this.f260123d.setClickable(false);
        }
        return c17;
    }

    public final void V6() {
        int i17 = m83105x7498fe14().getInt("key_err_code", 408);
        if (i17 == 402) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kya);
            this.f260126g.setVisibility(0);
            this.f260132p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ky_);
        } else if (i17 != 403) {
            if (m83105x7498fe14().getBoolean("key_balance_change_phone_need_confirm_phone", true)) {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kye);
                this.f260128i.setVisibility(0);
            } else {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kyc);
            }
            if (this.f260133q != null) {
                this.f260132p.setText(java.lang.String.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kyd), this.f260133q.f69218x2f3ef78d));
            }
            if (this.f260131o == null && this.f260133q != null) {
                this.f260131o = ((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.a(this.f260133q.f69223x58802fcb);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = this.f260131o;
            if (c19097xe6dc5b4c != null && c19097xe6dc5b4c.f261185i) {
                this.f260126g.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c2 = this.f260131o;
            if (c19097xe6dc5b4c2 != null && c19097xe6dc5b4c2.f261186m) {
                this.f260125f.setVisibility(0);
            }
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kyg);
            this.f260125f.setVisibility(0);
            this.f260132p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kyf);
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f260123d = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.h0(this));
        U6();
        if (m83105x7498fe14().getInt("key_err_code", 408) == 408 && this.f260131o == null) {
            mo67598xf0aced2e(4);
        } else {
            mo67598xf0aced2e(0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d86;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f260132p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pex);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) m83105x7498fe14().getParcelable("key_switch_phone_reset_bank_card");
        if (c19091x9511676c == null) {
            c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) m83105x7498fe14().getParcelable("key_bankcard");
        }
        this.f260133q = c19091x9511676c;
        this.f260129m = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) m83105x7498fe14().getParcelable("key_orders");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) m83105x7498fe14().getParcelable("key_authen");
        this.f260130n = c19090x75920c71;
        if (c19090x75920c71 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Micromsg.WalletResetInfoUI", "authen is null!");
            return;
        }
        if (android.text.TextUtils.isEmpty(m83105x7498fe14().getString("key_pwd1", ""))) {
            m83105x7498fe14().putString("key_pwd1", this.f260130n.f261077f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.WalletResetInfoUI", "pwd is empty, reset it to input");
        }
        this.f260131o = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) m83105x7498fe14().getParcelable("elemt_query");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a c19148x59bc9c3a = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a) findViewById(com.p314xaae8f345.mm.R.id.jn7);
        this.f260128i = c19148x59bc9c3a;
        this.f260127h = c19148x59bc9c3a.m73927xcfff45b0();
        boolean z17 = false;
        if (this.f260133q.f261104j3 == 1) {
            this.f260128i.c();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a c19148x59bc9c3a2 = this.f260128i;
            c19148x59bc9c3a2.f262254h = 0;
            u11.a aVar = (u11.a) ((java.util.HashMap) c19148x59bc9c3a2.f262255i).get("86");
            c19148x59bc9c3a2.f262257n = aVar.f505261b;
            java.lang.String str = aVar.f505262c;
            c19148x59bc9c3a2.f262256m = str;
            c19148x59bc9c3a2.f262250d.m83213x765074af(str);
            c19148x59bc9c3a2.f262252f.setText(c19148x59bc9c3a2.f262257n);
            c19148x59bc9c3a2.f262250d.setVisibility(8);
            c19148x59bc9c3a2.f262252f.setVisibility(8);
            c19148x59bc9c3a2.f262253g.setVisibility(8);
        }
        android.widget.EditText editText = (android.widget.EditText) this.f260128i.findViewById(com.p314xaae8f345.mm.R.id.f567921l30);
        m83125x8f91b80(this.f260128i.m73927xcfff45b0(), 0, false);
        m83127x8f91b80(this.f260128i.m73927xcfff45b0(), editText, 0, false, false, true);
        this.f260124e = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.aec);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.cqm);
        this.f260125f = viewOnFocusChangeListenerC22907xe18534c2;
        qp5.p.d(this, viewOnFocusChangeListenerC22907xe18534c2);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.cpz);
        this.f260126g = viewOnFocusChangeListenerC22907xe18534c22;
        qp5.p.c(this, viewOnFocusChangeListenerC22907xe18534c22);
        this.f260125f.m83211x749e7e77(this);
        this.f260126g.m83211x749e7e77(this);
        this.f260127h.m83211x749e7e77(this);
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 viewOnFocusChangeListenerC22901x93fec4d2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) findViewById(com.p314xaae8f345.mm.R.id.f569213pf3);
        viewOnFocusChangeListenerC22901x93fec4d2.a(viewOnFocusChangeListenerC22901x93fec4d2, viewOnFocusChangeListenerC22901x93fec4d2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = this.f260133q;
        if (c19091x9511676c2 != null) {
            this.f260124e.m83213x765074af(c19091x9511676c2.f69233x225aa2b6);
        } else {
            this.f260124e.setVisibility(8);
        }
        V6();
        if (m83105x7498fe14().getInt("key_err_code", 408) == 408 && this.f260131o == null) {
            z17 = true;
        }
        if (z17) {
            m83099x5406100e(new ss4.z("", "", null), true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (this.f260128i.d(i17, i18, intent)) {
            return;
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // qp5.i0
    /* renamed from: onInputValidChange */
    public void mo9068x194c4a1(boolean z17) {
        U6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            android.os.Bundle m83105x7498fe14 = m83105x7498fe14();
            if ((m1Var instanceof as4.b) || (m1Var instanceof as4.c)) {
                as4.b bVar = (as4.b) m1Var;
                m83105x7498fe14.putBoolean("key_need_verify_sms", !bVar.f95083z);
                m83105x7498fe14.putString("kreq_token", bVar.C);
                if (bVar.f39883x9cd69705) {
                    m83105x7498fe14.putParcelable("key_orders", bVar.A);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = bVar.f295594s;
                if (c19088xa4b300c1 != null) {
                    m83105x7498fe14.putParcelable("key_realname_guide_helper", c19088xa4b300c1);
                }
                m83105x7498fe14.putInt("key_err_code", 0);
                com.p314xaae8f345.mm.p2802xd031a825.a.d(this, m83105x7498fe14);
                return true;
            }
            if ((m1Var instanceof ss4.z) && this.f260133q != null) {
                at4.b1 b1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d;
                java.lang.String str2 = this.f260133q.f69225xed6d60f6;
                b1Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = null;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    java.util.List list = b1Var.f95344b;
                    if (list != null && list.size() != 0) {
                        java.util.Iterator it = b1Var.f95344b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBankElementManager", "hy: not found given element query");
                                break;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) it.next();
                            if (str2.equals(c19097xe6dc5b4c2.f261180d)) {
                                c19097xe6dc5b4c = c19097xe6dc5b4c2;
                                break;
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBankElementManager", "hy: element list is null. get element failed");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBankElementManager", "hy: bindSerail given is null");
                }
                this.f260131o = c19097xe6dc5b4c;
                V6();
            }
        }
        return false;
    }
}
