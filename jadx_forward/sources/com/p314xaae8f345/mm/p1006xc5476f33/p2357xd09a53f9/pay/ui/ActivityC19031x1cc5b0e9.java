package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI */
/* loaded from: classes9.dex */
public class ActivityC19031x1cc5b0e9 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.c {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f260184z = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f260185d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f260186e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f260187f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 f260188g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f260189h;

    /* renamed from: m, reason: collision with root package name */
    public int f260191m;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f260198t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 f260199u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.d f260200v;

    /* renamed from: i, reason: collision with root package name */
    public int f260190i = 0;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f260192n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o3 f260193o = null;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 f260194p = null;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f260195q = null;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f260196r = null;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f260197s = null;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i0 f260201w = null;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260202x = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9.AnonymousClass1(com.p314xaae8f345.mm.app.a0.f134821d);

    /* renamed from: y, reason: collision with root package name */
    public boolean f260203y = false;

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12> {
        public AnonymousClass1(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = 323604482;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c122 = c6256xb3fb7c12;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "realnameNotifyListener %s", java.lang.Integer.valueOf(c6256xb3fb7c122.f136506g.f87653a));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
            int i17 = c6256xb3fb7c122.f136506g.f87653a;
            am.l10 l10Var = c6243x5c461184.f136491g;
            if (i17 == -1) {
                l10Var.f88748a = 17;
            } else if (i17 == 0) {
                l10Var.f88748a = 18;
            } else {
                l10Var.f88748a = 0;
            }
            c6243x5c461184.f136492h.f88825a = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.e(this, c6256xb3fb7c122);
            c6243x5c461184.e();
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.c
    public void R0(boolean z17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback");
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback, result.isSuccess is false");
            U6(this.f260198t);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback, result.isSuccess is true");
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f260196r;
        c19760x34448d56.A = str;
        c19760x34448d56.B = str2;
        U6(this.f260198t);
    }

    public void U6(java.lang.String str) {
        this.f260194p.f261077f = str;
        boolean z17 = m83105x7498fe14().getBoolean("key_has_click_bind_new_card", false);
        int i17 = m83105x7498fe14().getInt("key_pay_flag");
        if (z17 && i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "fix authen flag after bind card fail");
            this.f260194p.f261075d = 3;
        }
        if (this.f260192n != null) {
            m83105x7498fe14().putString("key_mobile", this.f260192n.f69249x61dbf87);
            m83105x7498fe14().putParcelable("key_bankcard", this.f260192n);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = this.f260194p;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f260192n;
            c19090x75920c71.f261079h = c19091x9511676c.f69225xed6d60f6;
            c19090x75920c71.f261078g = c19091x9511676c.f69223x58802fcb;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178 = this.f260199u;
            if (c19098xdf4bc178 != null) {
                c19090x75920c71.H = c19098xdf4bc178.f261200d;
            } else {
                c19090x75920c71.H = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f260195q;
            vr4.j0 j0Var = c19099x8d444f05.N;
            if (j0Var != null) {
                c19090x75920c71.G = j0Var.f521289g;
            }
            if (c19099x8d444f05 != null && c19099x8d444f05.f261212i == 3) {
                if (c19091x9511676c.y0()) {
                    this.f260194p.f261075d = 3;
                } else {
                    this.f260194p.f261075d = 6;
                }
                m83105x7498fe14().putBoolean("key_is_oversea", !this.f260192n.y0());
            }
        }
        m83105x7498fe14().putString("key_pwd1", str);
        m83105x7498fe14().putParcelable("key_authen", this.f260194p);
        as4.b a17 = zr4.a.a(this.f260194p, this.f260195q, false);
        if (a17 != null) {
            a17.m82989x7c4af7d8("PayProcess");
            a17.m82988x820c8e8f(m83105x7498fe14());
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f260196r;
            int i18 = c19760x34448d56.f273642e;
            if (i18 == 6 && c19760x34448d56.f273643f == 100) {
                a17.m82991x53aed94a(100);
            } else {
                a17.m82991x53aed94a(i18);
            }
            m83098x5406100e(a17);
        }
    }

    public void V6(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f260196r;
        this.f260189h = X6((c19760x34448d56 == null || c19760x34448d56.f273642e == 11) ? false : true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178 = this.f260199u;
        if (c19098xdf4bc178 != null) {
            if ((c19098xdf4bc178.f261201e != 0) && z17) {
                java.lang.String str = c19098xdf4bc178.f261202f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < this.f260189h.size(); i17++) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f260189h.get(i17);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        if (!c19091x9511676c.f69223x58802fcb.equalsIgnoreCase("CFT")) {
                            arrayList.add(c19091x9511676c);
                        }
                    } else if (c19091x9511676c.f69223x58802fcb.equals(str)) {
                        arrayList.add(c19091x9511676c);
                    }
                }
                this.f260189h = arrayList;
            }
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o3 W6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o3(this, this.f260189h, this.f260191m, this.f260195q);
    }

    public java.util.ArrayList X6(boolean z17) {
        return this.f260190i == 8 ? at4.l1.a(true) : at4.l1.a(false);
    }

    public void Y6(int i17) {
        java.util.ArrayList arrayList = this.f260189h;
        int size = arrayList != null ? arrayList.size() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "on select bankcard: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(size));
        java.util.ArrayList arrayList2 = this.f260189h;
        if (arrayList2 != null && i17 < size) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) arrayList2.get(i17);
            this.f260192n = c19091x9511676c;
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f260196r;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 != null ? c19760x34448d56.f273642e : 0, c19760x34448d56 != null ? c19760x34448d56.f273647m : "", 13, c19091x9511676c.f69225xed6d60f6);
            this.f260193o.f262087h = c19091x9511676c.f69225xed6d60f6;
            this.f260187f.setEnabled(true);
            this.f260193o.notifyDataSetChanged();
            Z6();
            return;
        }
        if (size == i17) {
            at4.n a17 = at4.n.a();
            if (a17.b()) {
                db5.e1.s(this, a17.f95435b, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = this.f260196r;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d562 != null ? c19760x34448d562.f273642e : 0, c19760x34448d562 == null ? "" : c19760x34448d562.f273647m, 14, "");
            m83105x7498fe14().putInt("key_err_code", com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15118x25060539);
            m83105x7498fe14().putBoolean("key_has_click_bind_new_card", true);
            com.p314xaae8f345.mm.p2802xd031a825.a.d(this, m83105x7498fe14());
        }
    }

    public void Z6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "pay with old bankcard!");
        m83105x7498fe14().getString("key_pwd1");
        this.f260203y = false;
        mo67598xf0aced2e(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 x17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8.x(this, true, this.f260195q, this.f260199u, this.f260192n, this.f260196r, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.j(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.k(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.l(this));
        this.f260188g = x17;
        this.f260201w = x17;
    }

    public final void a7(int i17) {
        if (-1 == i17) {
            com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
            if (g17 != null) {
                g17.c(this, 1);
            } else {
                finish();
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6257x7bcca1bd c6257x7bcca1bd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6257x7bcca1bd();
            c6257x7bcca1bd.f136507g.f87743a = i17;
            c6257x7bcca1bd.e();
        }
    }

    public void b7() {
        this.f260186e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hdt);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178 = this.f260199u;
        if (c19098xdf4bc178 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19098xdf4bc178.f261204h)) {
            this.f260186e.setVisibility(0);
            this.f260186e.setText(this.f260199u.f261204h);
        } else if (m83105x7498fe14().getInt("key_main_bankcard_state", 0) == 0) {
            this.f260186e.setVisibility(8);
        } else {
            this.f260186e.setVisibility(0);
            this.f260186e.setText(this.f260197s);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: cleanUiData */
    public void mo65144xd0a01007(int i17) {
        if (i17 != 0) {
            if (i17 != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletChangeBankcardUI", "hy: clean ui data not handled");
                return;
            } else {
                m83105x7498fe14().putString("key_pwd1", "");
                Z6();
                return;
            }
        }
        m83093xa17dbc8d();
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
        if (g17 != null) {
            g17.f(this, m83105x7498fe14());
        } else {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5w;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kqi);
        this.f260187f = button;
        button.setEnabled(false);
        this.f260187f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.g(this));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83105x7498fe14().getString("key_pwd1"))) {
            this.f260187f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        } else {
            this.f260187f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kwt);
        }
        this.f260185d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mps);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o3 W6 = W6();
        this.f260193o = W6;
        this.f260185d.setAdapter((android.widget.ListAdapter) W6);
        this.f260185d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.h(this));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.p_w);
        imageView.setClickable(true);
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.i(this));
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569211pf1)).getPaint(), 0.8f);
        b7();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isTransparent */
    public boolean mo63463x4510f9c8() {
        boolean z17;
        if (super.mo63463x4510f9c8()) {
            return true;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f260196r;
        if (c19760x34448d56 != null && (z17 = c19760x34448d56.f273645h)) {
            if (z17) {
                return true;
            }
            vr4.f1.wi().Ai().w();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "onActivityResult %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1) {
            a7(-1);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o3 o3Var;
        java.util.List list;
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kzl);
        android.os.Bundle m83105x7498fe14 = m83105x7498fe14();
        m83105x7498fe14.putInt("key_err_code", 0);
        this.f260191m = m83105x7498fe14.getInt("key_support_bankcard", 1);
        this.f260194p = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) m83105x7498fe14.getParcelable("key_authen");
        this.f260195q = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) m83105x7498fe14.getParcelable("key_orders");
        this.f260196r = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14.getParcelable("key_pay_info");
        this.f260199u = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178) m83105x7498fe14.getParcelable("key_favor_pay_info");
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f260196r;
        int i17 = c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e;
        this.f260190i = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "pay_scene %d", java.lang.Integer.valueOf(i17));
        if (m83105x7498fe14().getBoolean("key_is_filter_bank_type")) {
            V6(true);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = this.f260196r;
            this.f260189h = X6((c19760x34448d562 == null || c19760x34448d562.f273642e == 11) ? false : true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = this.f260195q;
        if (c19099x8d444f05 != null && (list = c19099x8d444f05.M) != null && ((java.util.ArrayList) list).size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f052 = this.f260195q;
            this.f260197s = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kjs, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c19099x8d444f052.f261211h, c19099x8d444f052.f261214m), ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) this.f260195q.M).get(0)).f261240h);
        }
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(7, 0);
        this.f260202x.mo48813x58998cd();
        if (!m83105x7498fe14().getBoolean("key_is_filter_bank_type") || (o3Var = this.f260193o) == null) {
            return;
        }
        o3Var.f262089m = false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.d dVar = this.f260200v;
        if (dVar != null) {
            dVar.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.d dVar2 = this.f260200v;
            dVar2.f260287c = null;
            dVar2.f260286b = null;
        }
        this.f260202x.mo48814x2efc64();
        this.f260201w = null;
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && this.f260199u != null && this.f260189h.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178 = this.f260199u;
            int i18 = 0;
            if ((c19098xdf4bc178 == null || c19098xdf4bc178.f261201e == 0) ? false : true) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "favor need bankcard bind but usr cancel");
                java.lang.String string = m83105x7498fe14().getString("key_is_cur_bankcard_bind_serial");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletChangeBankcardUI", "curBankcardBindSerial null & finish");
                    return super.onKeyUp(i17, keyEvent);
                }
                java.util.ArrayList X6 = X6(true);
                if (this.f260192n == null) {
                    while (true) {
                        if (i18 >= X6.size()) {
                            break;
                        }
                        if (string.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) X6.get(i18)).f69225xed6d60f6)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "get cur bankcard, bind_serial:".concat(string));
                            this.f260192n = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) X6.get(i18);
                            break;
                        }
                        i18++;
                    }
                    if (this.f260192n == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletChangeBankcardUI", "mDefaultBankcard still null & finish");
                        return super.onKeyUp(i17, keyEvent);
                    }
                }
                Z6();
                return true;
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i0 i0Var = this.f260201w;
        if (i0Var != null) {
            i0Var.mo73912xf470b888();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onProgressFinish */
    public boolean mo63464xa6efccdf() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        m83105x7498fe14().putInt("key_err_code", 0);
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i0 i0Var = this.f260201w;
        if (i0Var != null) {
            i0Var.M0();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("pwd", this.f260198t);
            m83105x7498fe14().putBoolean("key_need_verify_sms", false);
            ((pz2.a) gm0.j1.s(pz2.a.class)).Ge(this.f260194p.f261090v.f273658x == 1, true, bundle);
            switch (i18) {
                case 100000:
                case 100001:
                case 100102:
                    this.f260196r.E = i18;
                    Z6();
                    return true;
                case 100100:
                case 100101:
                    com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f260196r;
                    c19760x34448d56.E = i18;
                    boolean z17 = i18 == 100100;
                    if (this.f260200v == null) {
                        this.f260200v = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.d(this, this);
                    }
                    this.f260200v.b(z17, c19760x34448d56.C, c19760x34448d56.f273647m);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "mRegenFingerPrintRsaKey.genRsaKey isGenRsa is " + z17);
                    return true;
            }
        }
        if (m1Var instanceof cs4.f) {
            return true;
        }
        if (m1Var instanceof as4.b) {
            android.os.Bundle m83105x7498fe14 = m83105x7498fe14();
            as4.b bVar = (as4.b) m1Var;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260198t)) {
                m83105x7498fe14.putString("key_pwd1", this.f260198t);
            }
            m83105x7498fe14.putString("kreq_token", bVar.C);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = bVar.B;
            m83105x7498fe14.putParcelable("key_authen", c19090x75920c71);
            m83105x7498fe14.putBoolean("key_need_verify_sms", !bVar.f95083z);
            m83105x7498fe14.putParcelable("key_pay_info", this.f260196r);
            m83105x7498fe14.putInt("key_pay_flag", 3);
            m83105x7498fe14.putInt("key_can_verify_tail", bVar.F);
            m83105x7498fe14.putString("key_verify_tail_wording", bVar.G);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = bVar.f295594s;
            m83105x7498fe14().putBoolean("key_block_bind_new_card", bVar.H == 1);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.D)) {
                m83105x7498fe14.putString("key_mobile", this.f260192n.f69249x61dbf87);
            } else {
                m83105x7498fe14.putString("key_mobile", bVar.D);
            }
            m83105x7498fe14.putString("key_QADNA_URL", bVar.E);
            if (c19088xa4b300c1 != null) {
                m83105x7498fe14.putParcelable("key_realname_guide_helper", c19088xa4b300c1);
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("pwd", this.f260198t);
            mz2.a aVar = (mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class));
            bundle2.putInt("key_open_biometric_type", aVar.a() ? 1 : aVar.b() ? 2 : 0);
            aVar.Ge(c19090x75920c71.f261090v.f273658x == 1, true, bundle2);
            if (bVar.f39883x9cd69705) {
                m83105x7498fe14.putParcelable("key_orders", bVar.A);
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = this.f260196r;
                if (c19760x34448d562 != null && c19760x34448d562.f273642e == 8) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6247x5632a03e c6247x5632a03e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6247x5632a03e();
                    c6247x5632a03e.f136496g.f89220a = this.f260194p.f261079h;
                    c6247x5632a03e.e();
                }
            }
            com.p314xaae8f345.mm.p2802xd031a825.a.d(this, m83105x7498fe14);
            return true;
        }
        return false;
    }
}
