package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI */
/* loaded from: classes9.dex */
public class ActivityC16769x400fef4 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: f, reason: collision with root package name */
    public int f234105f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f234103d = true;

    /* renamed from: e, reason: collision with root package name */
    public int f234104e = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f234106g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f234107h = false;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f234108i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5777xd8d54b5c>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI.2
        {
            this.f39173x3fe91575 = 484738412;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5777xd8d54b5c c5777xd8d54b5c) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5777xd8d54b5c c5777xd8d54b5c2 = c5777xd8d54b5c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "rcv funk event: %s", c5777xd8d54b5c2.f136090g.f87894a);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_callback", c5777xd8d54b5c2.f136090g.f87894a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16769x400fef4 activityC16769x400fef4 = com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16769x400fef4.this;
            activityC16769x400fef4.setResult(-1, intent);
            activityC16769x400fef4.finish();
            return false;
        }
    };

    public final void U6() {
        int i17;
        ss4.d dVar;
        at4.g0.e(1);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(30, 1);
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("key_from_scene", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "parserCardData(), scene is " + intExtra);
            if (intExtra == 3) {
                yo3.m.f545693g = intExtra;
                int intExtra2 = getIntent().getIntExtra("key_expire_time", 0);
                long longExtra = getIntent().getLongExtra("key_begin_time", 0L);
                boolean booleanExtra = getIntent().getBooleanExtra("key_is_mark", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "expire_time:" + intExtra2 + " beginTime:" + longExtra + " isMark:" + booleanExtra);
                yo3.m.f545694h = intExtra2;
                yo3.m.f545695i = longExtra;
                yo3.m.f545696j = booleanExtra;
                yo3.m.f545697k = getIntent().getStringExtra("key_card_id");
                yo3.m.f545698l = getIntent().getStringExtra("key_user_card_id");
                yo3.m.f545699m = getIntent().getStringExtra("key_card_code");
            } else if (intExtra == 1 || intExtra == 2 || intExtra == 4) {
                yo3.m.f545693g = intExtra;
                yo3.m.f545694h = 0;
                yo3.m.f545695i = 0L;
                yo3.m.f545696j = false;
                yo3.m.f545697k = "";
                yo3.m.f545698l = "";
                yo3.m.f545699m = "";
            }
        }
        this.f234105f = getIntent().getIntExtra("key_from_scene", 0);
        if (getIntent().getBooleanExtra("is_offline_create", false) || !((i17 = this.f234105f) == 6 || i17 == 7)) {
            V6();
            this.f234103d = false;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "from h5 or wxapp check sign: %s", java.lang.Integer.valueOf(i17));
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent.getStringExtra("appId");
        java.lang.String stringExtra2 = intent.getStringExtra("timeStamp");
        java.lang.String stringExtra3 = intent.getStringExtra("nonceStr");
        java.lang.String stringExtra4 = intent.getStringExtra("packageExt");
        java.lang.String stringExtra5 = intent.getStringExtra("signtype");
        java.lang.String stringExtra6 = intent.getStringExtra("paySignature");
        int intExtra3 = intent.getIntExtra("pay_channel", 0);
        if (this.f234105f == 6) {
            dVar = new ss4.d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, intent.getStringExtra("url"), 16, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w9.f34941x24728b, intExtra3);
        } else {
            java.lang.String stringExtra7 = intent.getStringExtra("wxapp_username");
            java.lang.String stringExtra8 = intent.getStringExtra("wxapp_path");
            java.lang.String stringExtra9 = intent.getStringExtra("jsapiFuncName");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra9)) {
                stringExtra9 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w9.f34941x24728b;
            }
            dVar = new ss4.d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, 16, stringExtra7, stringExtra8, stringExtra9, intExtra3);
        }
        m83090x14f40144(580);
        m83099x5406100e(dVar, true);
        this.f234103d = false;
    }

    public final void V6() {
        android.content.Intent intent = getIntent();
        this.f234107h = intent != null && intent.getBooleanExtra("from_pinned_shortcut", false);
        if (intent != null && intent.hasExtra("key_from_scene")) {
            int intExtra = intent.getIntExtra("key_from_scene", 0);
            int i17 = 2;
            if (intExtra == 1) {
                this.f234104e = 1;
            } else {
                if (intExtra == 2) {
                    this.f234104e = 2;
                } else if (intExtra == 3) {
                    this.f234104e = 3;
                    i17 = 3;
                } else {
                    i17 = 6;
                    if (intExtra == 4) {
                        this.f234104e = this.f234107h ? 13 : 4;
                    } else {
                        if (intExtra == 5) {
                            this.f234104e = 8;
                        } else {
                            r9 = 7;
                            if (intExtra == 6) {
                                this.f234104e = 10;
                            } else if (intExtra == 7) {
                                this.f234104e = 11;
                                i17 = 8;
                            } else if (intExtra == 8) {
                                this.f234104e = 12;
                                i17 = 9;
                            } else {
                                this.f234104e = 0;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "unknown scene: %d", java.lang.Integer.valueOf(intExtra));
                            }
                        }
                        i17 = r9;
                    }
                }
                i17 = 1;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14021, 1, java.lang.Integer.valueOf(i17));
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().s() || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95532h == null);
        if (java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_ignore_bindquerynew_before_offlinepay, false)).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "ignore bindquery new before offline is true");
            valueOf = java.lang.Boolean.FALSE;
        }
        java.util.HashMap hashMap = null;
        if (valueOf.booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isDataInvalid()");
            m83099x5406100e(new ss4.e0(null, 8), true);
            this.f234103d = false;
            return;
        }
        if (!this.f39902xe856ec83 || !yo3.m.i()) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_entry_scene", this.f234104e);
            intent2.putExtra("key_from_scene", this.f234105f);
            java.lang.String stringExtra = getIntent().getStringExtra("key_business_attach");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                intent2.putExtra("key_business_attach", stringExtra);
            }
            intent2.putExtra("is_offline_create", getIntent().getBooleanExtra("is_offline_create", false));
            intent2.putExtra("key_appid", getIntent().getStringExtra("key_appid"));
            j45.l.n(mo55332x76847179(), "offline", ".ui.WalletOfflineCoinPurseUI", intent2, 1);
            return;
        }
        if (yo3.m.f545693g == 3) {
            hashMap = new java.util.HashMap();
            java.lang.String str = yo3.m.f545697k;
            if (str == null) {
                str = "";
            }
            hashMap.put("card_id", str);
            java.lang.String str2 = yo3.m.f545698l;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("user_card_id", str2);
            java.lang.String str3 = yo3.m.f545699m;
            hashMap.put("card_code", str3 != null ? str3 : "");
        }
        ((h45.q) i95.n0.c(h45.q.class)).mo24822x9cee3d86(mo55332x76847179(), this.f234104e, getIntent().getIntExtra("pay_channel", 0), this.f234105f, hashMap, this.f234107h, getIntent().getStringExtra("queryString"), new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.i4(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "do not finish");
        } else {
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (26 != android.os.Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        android.view.Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().f(getApplicationContext());
        this.f234108i.mo48813x58998cd();
        U6();
        r45.t54 t54Var = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ni(this, 1, 3, r45.t54.class);
        if (t54Var != null && "launch_type_offline_wallet".equals(t54Var.f467690d)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7043xd67274fc c7043xd67274fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7043xd67274fc();
            c7043xd67274fc.f143597d = 1L;
            c7043xd67274fc.f143598e = 1L;
            c7043xd67274fc.k();
            c7043xd67274fc.o();
        }
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.WalletOfflineEntranceUI)).Rj(this, iy1.a.Money);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f234108i.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return true;
        }
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "onNewIntent");
        if (intent == null || !intent.hasExtra("is_offline_create")) {
            this.f234103d = false;
            this.f234106g = true;
            setIntent(intent);
            U6();
            return;
        }
        this.f234103d = true;
        this.f234106g = true;
        setIntent(intent);
        U6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onResume()");
        if (!this.f234103d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is false , not finish activity");
            this.f234103d = true;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is true , finish activity");
        if (!yo3.m.k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isOfflineCreate() false");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_entry_scene", this.f234104e);
        intent.putExtra("key_from_scene", 0);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof ss4.d)) {
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd SUCC");
                V6();
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "net error: %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            V6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd FAIL");
            finish();
            return false;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "net error: %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            int i19 = this.f234105f;
            if (i19 == 6 || i19 == 7) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_callback", "fail");
                setResult(0, intent);
            }
            finish();
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd SUCC");
        h45.y.f360501a = ((ss4.d) m1Var).H();
        int i27 = this.f234105f;
        if (i27 == 6 || i27 == 7) {
            android.content.Intent intent2 = new android.content.Intent();
            if (this.f234106g) {
                intent2.putExtra("key_callback", "return");
            } else {
                intent2.putExtra("key_callback", "ok");
            }
            setResult(-1, intent2);
        }
        V6();
        return true;
    }
}
