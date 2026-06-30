package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI */
/* loaded from: classes9.dex */
public class ActivityC19106xf6056514 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements qp5.i0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f261391r = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f261392d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f261393e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f261394f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f261395g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f261396h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m1 f261397i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f261398m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f261399n = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f261400o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f261401p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f261402q;

    public ActivityC19106xf6056514() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f261401p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6239x3d383f6>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.1
            {
                this.f39173x3fe91575 = 92672998;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6239x3d383f6 c6239x3d383f6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.this.finish();
                return false;
            }
        };
        this.f261402q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.10
            {
                this.f39173x3fe91575 = 96068484;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94 c5961x66a09f94) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94 c5961x66a09f942 = c5961x66a09f94;
                if (!(c5961x66a09f942 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("Micromsg.WalletInputCardIDUI", "mismatched ScanBankCardResultEvent event");
                    return false;
                }
                com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
                java.lang.String m121807xce19d7e6 = c28013x36bca45.m121807xce19d7e6();
                java.lang.String m121800xea62cd8a = c28013x36bca45.m121800xea62cd8a(c5961x66a09f942.f136260g.f89274a, m121807xce19d7e6);
                android.graphics.Bitmap bitmap = c5961x66a09f942.f136260g.f89275b;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.f261391r;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514 activityC19106xf6056514 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.this;
                activityC19106xf6056514.getClass();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key_bankcard_id", m121800xea62cd8a);
                bundle.putString("key_bankcard_des", m121807xce19d7e6);
                bundle.putParcelable("key_bankcard_cropimg", bitmap);
                com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(activityC19106xf6056514);
                if (g17 != null) {
                    g17.B(activityC19106xf6056514, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986.class, bundle);
                }
                return true;
            }
        };
    }

    public final boolean U6() {
        if (this.f261393e.c(null)) {
            this.f261392d.setEnabled(true);
            this.f261392d.setClickable(true);
            return true;
        }
        this.f261392d.setEnabled(false);
        this.f261392d.setClickable(false);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5j;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f261392d = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f565113bb3);
        this.f261393e = viewOnFocusChangeListenerC22907xe18534c2;
        qp5.p.a(viewOnFocusChangeListenerC22907xe18534c2);
        this.f261394f = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.k3n);
        if (m83105x7498fe14().getBoolean("key_bind_show_change_card", false)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = this.f261394f;
            if (viewOnFocusChangeListenerC22907xe18534c22 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
            } else {
                viewOnFocusChangeListenerC22907xe18534c22.m83210x25bc1800(new qp5.k(this));
                viewOnFocusChangeListenerC22907xe18534c22.m83197xbfcb5cf0("\\x20\\t\\r\\n".toCharArray());
            }
        } else {
            qp5.p.h(this, this.f261394f);
        }
        this.f261393e.m83211x749e7e77(this);
        this.f261392d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d1(this));
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = m83108x2b5a5a39();
        if (m83108x2b5a5a39 != null) {
            this.f261400o = m83108x2b5a5a39.f295334c.getBoolean("key_is_realname_verify_process", false);
        } else {
            this.f261400o = false;
        }
        if (this.f261400o) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kx9);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.knd);
        }
        this.f261395g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hdt);
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y() || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(this);
            b4Var.f261679d = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e1(this);
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kn7);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(b4Var, string.length() - 6, string.length(), 33);
            this.f261395g.setText(spannableString);
            this.f261395g.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        } else {
            this.f261395g.setVisibility(0);
            java.lang.String string2 = m83105x7498fe14().getString("key_custom_bind_tips");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                this.f261395g.setText(string2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178) m83105x7498fe14().getParcelable("key_favor_pay_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) m83105x7498fe14().getParcelable("key_orders");
        if (c19098xdf4bc178 != null && c19099x8d444f05 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.h0.INSTANCE.a(c19099x8d444f05);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pba);
            if (a17 != null) {
                java.lang.String c17 = a17.c(c19098xdf4bc178.f261200d, false);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                vr4.j0 j0Var = a17.f261812a;
                if (j0Var.f521290h != null) {
                    java.util.Map b17 = a17.b(c17, false);
                    int i17 = 0;
                    while (true) {
                        java.util.LinkedList linkedList2 = j0Var.f521290h;
                        if (i17 >= linkedList2.size()) {
                            break;
                        }
                        vr4.i1 i1Var = (vr4.i1) linkedList2.get(i17);
                        if (i1Var != null) {
                            if (i1Var.f521278r != 0) {
                                if (((java.util.HashMap) b17).containsKey(i1Var.f521279s)) {
                                    linkedList.add(i1Var);
                                }
                            }
                        }
                        i17++;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavorLogicHelper", "fucn[getBankFavorListWithSelectedCompId] mFavorInfo.tradeFavList null");
                }
                if (linkedList.size() > 0) {
                    this.f261397i = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m1(mo55332x76847179(), linkedList);
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575072kn5);
                    textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f1(this));
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Micromsg.WalletInputCardIDUI", "favorlogichelper null");
                textView.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19087x5acf574b c19087x5acf574b = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19087x5acf574b) m83105x7498fe14().getParcelable("realname_verify_process_bundle");
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        if (this.f261400o && c19087x5acf574b != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19087x5acf574b.f260956d)) {
            this.f261394f.setVisibility(0);
            this.f261394f.m83213x765074af(c19087x5acf574b.f260956d);
            this.f261393e.m83199x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kit));
            this.f261394f.setClickable(false);
            this.f261394f.setEnabled(false);
            this.f261395g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.knc);
        } else if (!fj6.w() || fj6.q() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fj6.q().trim()) || !fj6.t()) {
            this.f261394f.setVisibility(8);
            this.f261393e.m83199x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kn9));
        } else {
            this.f261394f.setVisibility(0);
            this.f261394f.m83213x765074af(fj6.q());
            this.f261393e.m83199x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kit));
            this.f261394f.setClickable(false);
            this.f261394f.setEnabled(false);
        }
        if (m83105x7498fe14().getInt("key_bind_scene") == 18 || m83105x7498fe14().getInt("key_bind_scene") == 19) {
            this.f261393e.m83199x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kna));
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_SUPPORT_BANK_WORD_STRING, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f261393e.m83199x764b0e09(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) m83105x7498fe14().getParcelable("key_history_bankcard");
        this.f261396h = c19091x9511676c;
        if (c19091x9511676c != null) {
            this.f261393e.m83213x765074af(c19091x9511676c.J2);
            this.f261393e.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g1(this));
        }
        U6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.d(this, m83105x7498fe14(), 2);
        m83125x8f91b80(this.f261393e, 0, false);
        this.f261393e.m83210x25bc1800(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.h1(this, c19087x5acf574b));
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().g()) {
            this.f261393e.m83173x1e821d71().setVisibility(0);
            this.f261393e.m83173x1e821d71().setImageResource(com.p314xaae8f345.mm.R.raw.f81361x88cfa7e1);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.knd);
        mo43517x10010bd5();
        this.f261401p.mo48813x58998cd();
        this.f261402q.mo48813x58998cd();
        this.f261399n = m83105x7498fe14().getInt("key_bind_scene");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        if (i17 != 1) {
            if (!this.f261400o || i17 != 1000) {
                return super.onCreateDialog(i17);
            }
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kn6);
            com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
            int q17 = g17 != null ? g17.q(this, 1) : -1;
            if (q17 != -1) {
                string = getString(q17);
            }
            return db5.e1.K(this, true, string, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i1(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j1(this));
        }
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d6z, (android.view.ViewGroup) null);
        ((com.p314xaae8f345.mm.ui.C21391x3d89d23a) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564268mf)).setAdapter((android.widget.ListAdapter) this.f261397i);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575071kn4);
        aVar.L = inflate;
        aVar.G = null;
        aVar.f293265v = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmf);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        return j0Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f261401p.mo48814x2efc64();
        this.f261402q.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // qp5.i0
    /* renamed from: onInputValidChange */
    public void mo9068x194c4a1(boolean z17) {
        if (!z17) {
            this.f261396h = null;
            m83105x7498fe14().putParcelable("key_history_bankcard", null);
        }
        U6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.z) {
                ss4.z zVar = (ss4.z) m1Var;
                bundle.putBoolean("key_need_area", zVar.f493685i == 1);
                bundle.putBoolean("key_need_profession", zVar.f493686m == 1);
                bundle.putParcelableArray("key_profession_list", zVar.f493687n);
                bundle.putBoolean("key_need_country", zVar.f493688o == 1);
                bundle.putStringArray("key_country_excludes", zVar.f493689p);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = zVar.f493681e;
                if (c19097xe6dc5b4c != null) {
                    if (c19097xe6dc5b4c.f261189p && c19097xe6dc5b4c.c()) {
                        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.kfs, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                        return true;
                    }
                    bundle.putString("bank_name", zVar.f493681e.f261181e);
                    bundle.putParcelable("elemt_query", zVar.f493681e);
                    bundle.putString("key_card_id", this.f261393e.m83183xfb85ada3());
                    com.p314xaae8f345.mm.p2802xd031a825.a.d(this, bundle);
                    return true;
                }
                bundle.putString("bank_name", "");
                bundle.putParcelable("elemt_query", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c());
                bundle.putString("key_card_id", this.f261393e.m83183xfb85ada3());
                com.p314xaae8f345.mm.p2802xd031a825.a.d(this, bundle);
            }
        } else if (i18 == 1 && (m1Var instanceof ss4.z)) {
            bundle.putString("bank_name", "");
            bundle.putParcelable("elemt_query", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c());
            bundle.putString("key_card_id", this.f261393e.m83183xfb85ada3());
            com.p314xaae8f345.mm.p2802xd031a825.a.d(this, bundle);
            return true;
        }
        return false;
    }
}
