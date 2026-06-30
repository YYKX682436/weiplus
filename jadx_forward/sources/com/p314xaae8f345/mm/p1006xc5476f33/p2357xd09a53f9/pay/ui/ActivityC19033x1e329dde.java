package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI */
/* loaded from: classes9.dex */
public class ActivityC19033x1e329dde extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f260205w = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f260206d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260207e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f260208f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f260209g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f260210h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f260211i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f260212m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 f260213n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f260214o;

    /* renamed from: p, reason: collision with root package name */
    public double f260215p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f260217r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f260218s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f260219t;

    /* renamed from: u, reason: collision with root package name */
    public int f260220u;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f260216q = "CNY";

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260221v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.8
        {
            this.f39173x3fe91575 = 572563856;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b80) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b802 = c5663xbbd89b80;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "KindaBindCardEvent callback");
            if (c5663xbbd89b802 == null) {
                return false;
            }
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde activityC19033x1e329dde = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde.this;
            am.di diVar = c5663xbbd89b802.f135987g;
            if (diVar != null) {
                if (diVar.f87986a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "KindaBindCardEvent bindCard Succ");
                    activityC19033x1e329dde.m83099x5406100e(new zr4.c(activityC19033x1e329dde.f260217r), true);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "KindaBindCardEvent bindCard Cancel");
                    at4.t1 bj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj();
                    if (bj6.c()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b17 = bj6.b();
                        if (b17 == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f69239x93565523)) {
                            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde.f260205w;
                            activityC19033x1e329dde.V6();
                        } else {
                            activityC19033x1e329dde.W6(b17, activityC19033x1e329dde.f260215p, activityC19033x1e329dde.f260216q);
                        }
                    } else {
                        activityC19033x1e329dde.setResult(0, null);
                    }
                }
            }
            activityC19033x1e329dde.f260221v.mo48814x2efc64();
            return true;
        }
    };

    public void U6() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_bind_scene", 8);
        boolean z17 = true;
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putString("kreq_token", this.f260217r);
        if (com.p314xaae8f345.mm.p2802xd031a825.b.a().b()) {
            this.f260221v.mo48813x58998cd();
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, bundle.getInt("key_bind_scene"));
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(bundle.getInt("key_bind_scene"));
            ((h45.q) i95.n0.c(h45.q.class)).mo24800xa4a1f2e8(this, bundle);
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.a.j(this, ur4.a.class, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.t(this));
    }

    public final void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "to change a bankcard");
        startActivityForResult(new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19032x13870b5c.class), 1);
    }

    public final void W6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c, double d17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.o(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.p(this, c19091x9511676c);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.q(this);
        this.f260219t = c19091x9511676c.f69225xed6d60f6;
        java.lang.String str2 = this.f260214o;
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8.f262052l1;
        if (isFinishing()) {
            n8Var = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576328wh);
            n8Var2.w(qVar);
            n8Var2.setOnCancelListener(qVar);
            n8Var2.setCancelable(true);
            n8Var2.f262058h.setText(str2);
            n8Var2.t(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(d17, str), d17);
            n8Var2.f262053J = true;
            java.lang.String str3 = c19091x9511676c.f69233x225aa2b6;
            n8Var2.o(c19091x9511676c);
            n8Var2.A(!android.text.TextUtils.isEmpty(str3));
            n8Var2.p(str3, pVar, false);
            n8Var2.f262069u = oVar;
            n8Var2.show();
            db5.e1.a(this, n8Var2);
            n8Var = n8Var2;
        }
        this.f260213n = n8Var;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 != -1) {
            at4.t1 bj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj();
            if (!bj6.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLoanRepaymentUI", "onActivityResult hasRepaymentBankcard is false");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b17 = bj6.b();
            if (b17 == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f69239x93565523)) {
                finish();
                return;
            } else {
                W6(b17, this.f260215p, this.f260216q);
                return;
            }
        }
        int intExtra = intent.getIntExtra("ret", -1000);
        if (intExtra == -1003) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "to bind a new card");
            U6();
        } else {
            if (intExtra != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLoanRepaymentUI", "activity return unknow error");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "change card ok");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj().a(intent.getStringExtra("bindSerial"));
            if (a17 != null) {
                W6(a17, this.f260215p, this.f260216q);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLoanRepaymentUI", "bankcard is null by getBankcardBySerialNo");
                finish();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f260211i = intent.getStringExtra("appId");
        this.f260206d = intent.getStringExtra("timeStamp");
        this.f260207e = intent.getStringExtra("nonceStr");
        this.f260208f = intent.getStringExtra("packageExt");
        this.f260209g = intent.getStringExtra("signtype");
        this.f260210h = intent.getStringExtra("paySignature");
        this.f260212m = intent.getStringExtra("url");
        this.f260220u = intent.getIntExtra("pay_channel", 0);
        m83090x14f40144(580);
        m83096xe7b1ccf7(new ss4.d(this.f260211i, this.f260206d, this.f260207e, this.f260208f, this.f260209g, this.f260210h, this.f260212m, 7, "getWebPayCheckoutCounterRequst", this.f260220u));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(580);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "onNewIntent");
        if (extras.containsKey("intent_bind_end")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "back from bind card");
            m83099x5406100e(new zr4.c(this.f260217r), true);
        } else {
            if (!extras.containsKey("jsapi_verifycode_process_end")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "need to deal with,finish");
                finish();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "back from verify code");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("token", intent.getStringExtra("token"));
            intent2.putExtra("bind_serial", this.f260219t);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.d) {
                ss4.d dVar = (ss4.d) m1Var;
                h45.y.f360501a = dVar.H();
                this.f260217r = ((r45.y10) dVar.f493562e.f152244b.f152233a).f472235f;
                com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
                ((h45.q) i95.n0.c(h45.q.class)).mo24845x51356acc(this, this.f260217r, dVar.H(), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.n(this));
                return true;
            }
            if (m1Var instanceof zr4.c) {
                zr4.c cVar = (zr4.c) m1Var;
                this.f260216q = cVar.f556734e;
                this.f260215p = cVar.f556733d;
                this.f260214o = cVar.f556735f;
                at4.t1 bj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj();
                if (bj6.c()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b17 = bj6.b();
                    if (b17 == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f69239x93565523)) {
                        V6();
                    } else {
                        W6(b17, this.f260215p, this.f260216q);
                    }
                } else {
                    db5.e1.A(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kni), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575122kv1), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.r(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.s(this));
                }
                return true;
            }
            if (m1Var instanceof ss4.y) {
                ss4.y yVar = (ss4.y) m1Var;
                if (yVar.f493677e == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLoanRepaymentUI", "need free sms");
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("key_pwd1", this.f260218s);
                    bundle.putString("key_jsapi_token", this.f260217r);
                    bundle.putString("key_relation_key", yVar.f493679g);
                    bundle.putInt("key_verify_scene", 8);
                    bundle.putString("key_mobile", yVar.f493678f);
                    com.p314xaae8f345.mm.p2802xd031a825.a.j(this, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z4.class, bundle, null);
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("token", yVar.f493676d);
                    intent.putExtra("bind_serial", this.f260219t);
                    setResult(-1, intent);
                    finish();
                }
                return true;
            }
        }
        return false;
    }
}
