package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI */
/* loaded from: classes9.dex */
public class ActivityC17128x8dd0c05 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f238650u = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f238651d;

    /* renamed from: f, reason: collision with root package name */
    public int f238653f;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f238659o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f238660p;

    /* renamed from: q, reason: collision with root package name */
    public int f238661q;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f238652e = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f238654g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238655h = false;

    /* renamed from: i, reason: collision with root package name */
    public nr4.a f238656i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f238657m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f238658n = null;

    /* renamed from: r, reason: collision with root package name */
    public int f238662r = 0;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f238663s = "";

    /* renamed from: t, reason: collision with root package name */
    public long f238664t = 0;

    public final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r0 r0Var) {
        java.lang.String str = r0Var.f238535u;
        java.lang.String str2 = r0Var.f238521d;
        this.f238652e = str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            finish();
            return;
        }
        if (this.f238651d == 1) {
            if (r0Var.f238525h == 33) {
                nr4.a c17 = nr4.a.c(this.f238652e, 2);
                this.f238656i = c17;
                c17.a(20, getIntent().getStringExtra("receiver_name"));
            } else {
                nr4.a c18 = nr4.a.c(this.f238652e, 3);
                this.f238656i = c18;
                c18.a(10, getIntent().getStringExtra("receiver_name"));
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("fee", r0Var.f238523f);
        intent.putExtra("desc", r0Var.f238524g);
        intent.putExtra("scan_remittance_id", r0Var.f238526i);
        intent.putExtra("receiver_true_name", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.y(r0Var.f238522e));
        intent.putExtra("receiver_true_name_busi", r0Var.f238539y);
        intent.putExtra("receiver_tips", r0Var.f238527m);
        intent.putExtra("rcvr_new_desc", r0Var.f238528n);
        intent.putExtra("payer_desc", r0Var.f238529o);
        intent.putExtra("rcvr_open_id", r0Var.f238535u);
        intent.putExtra("mch_name", r0Var.f238532r);
        intent.putExtra("mch_info", r0Var.f238538x);
        intent.putExtra("mch_photo", r0Var.f238533s);
        intent.putExtra("mch_type", r0Var.f238536v);
        intent.putExtra("mch_time", r0Var.f238534t);
        intent.putExtra("amount_remind_bit", r0Var.f238540z);
        intent.putExtra("payer_desc_required", r0Var.G);
        intent.putExtra("payer_desc_placeholder", r0Var.H);
        int i17 = r0Var.f238531q;
        if (i17 == 1) {
            intent.putExtra("busi_type", i17);
            intent.putExtra("rcvr_ticket", r0Var.f238530p);
            intent.putExtra("rcvr_open_id", r0Var.f238535u);
            intent.putExtra("get_pay_wifi", r0Var.f238537w);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.C17122x2c1fc2f7 c17122x2c1fc2f7 = r0Var.F;
            if (c17122x2c1fc2f7 != null) {
                intent.putExtra("BusiRemittanceResp", c17122x2c1fc2f7);
            }
        }
        if (this.f238653f == 56) {
            intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, this.f238657m);
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(this.f238652e);
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str3 = this.f238652e;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.g.f(str3, 3);
        if (f07 != null || this.f238652e.equals("")) {
            W6(this.f238652e, r0Var.f238525h, intent);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((c01.k7) c01.n8.a()).b(this.f238652e, 4, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j0(this, currentTimeMillis, r0Var, intent));
    }

    public final void V6(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
        }
        u1Var.g(str);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.i0(this));
        u1Var.n(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ke6));
        u1Var.q(false);
    }

    public void W6(java.lang.String str, int i17, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.f238651d + ", name=" + str + " payScene: " + i17);
        android.content.Intent intent2 = intent != null ? new android.content.Intent(intent) : new android.content.Intent();
        nr4.a.e(this.f238656i, intent2);
        int intExtra = intent2.getIntExtra("busi_type", 0);
        if (intExtra == 1) {
            intent2.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17131x6f022b9b.class);
            intent2.putExtra("chat_type", getIntent().getIntExtra("chat_type", 0));
            intent2.putExtra("send_type", getIntent().getIntExtra("send_type", 0));
        } else {
            intent2.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2.class);
        }
        intent2.putExtra("receiver_name", str);
        intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f238651d);
        intent2.putExtra("pay_scene", i17);
        intent2.putExtra("pay_channel", this.f238653f);
        intent2.putExtra("qq_extend_info", this.f238654g);
        intent2.putExtra("qrcode_sender_username", getIntent().getStringExtra("qrcode_sender_username"));
        intent2.putExtra("msg_svr_id", java.lang.String.valueOf(this.f238664t));
        java.lang.String stringExtra = getIntent().getStringExtra("payInitRawUrl");
        long longExtra = getIntent().getLongExtra("payInitTimestamp", 0L);
        java.lang.String stringExtra2 = getIntent().getStringExtra("receiver_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        intent2.putExtra("payInitRawUrl", stringExtra == null ? "" : stringExtra);
        intent2.putExtra("payInitTimestamp", longExtra);
        intent2.putExtra("qrcode_url", stringExtra2 != null ? stringExtra2 : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI initRawUrl: %s, qrcodeUrl: %s, initTimestamp: %d", stringExtra, stringExtra2, java.lang.Long.valueOf(longExtra));
        if (intExtra != 1) {
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        setResult(-1);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 16) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 != -1) {
            finish();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "select user: %s", stringExtra);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            finish();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_group_name", this.f238652e);
        W6(stringExtra, 31, intent2);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f238655h) {
            return;
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39;
        super.onCreate(bundle);
        mo67598xf0aced2e(8);
        this.f238651d = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        this.f238652e = getIntent().getStringExtra("receiver_name");
        this.f238653f = getIntent().getIntExtra("pay_channel", -1);
        this.f238654g = getIntent().getStringExtra("qq_extend_info");
        this.f238656i = nr4.a.d(getIntent());
        this.f238658n = getIntent().getStringExtra("qrcodeUrl");
        this.f238661q = getIntent().getIntExtra("ScanScene", 0);
        this.f238659o = getIntent().getStringExtra("qrcode_sender_username");
        this.f238660p = getIntent().getStringExtra("stat_send_msg_user");
        this.f238662r = getIntent().getIntExtra("qrcodeSessionType", 0);
        this.f238663s = getIntent().getStringExtra("qrcodeSessionName");
        java.lang.String stringExtra = getIntent().getStringExtra("msg_svr_id");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            try {
                this.f238664t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(stringExtra.replaceAll("[^\\d]", ""));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RemittanceAdapterUI", e17, "", new java.lang.Object[0]);
            }
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("payInitRawUrl");
        long longExtra = getIntent().getLongExtra("payInitTimestamp", 0L);
        if (longExtra == 0) {
            longExtra = c01.id.a() / 1000;
        }
        getIntent().putExtra("payInitRawUrl", stringExtra2 != null ? stringExtra2 : "");
        getIntent().putExtra("payInitTimestamp", longExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "onCreate initRawUrl: %s, initTimestamp: %d", stringExtra2, java.lang.Long.valueOf(longExtra));
        int i17 = this.f238653f;
        if (i17 == 56) {
            this.f238657m = this.f238656i.f420872a;
        }
        if (i17 == -1 && (m83108x2b5a5a39 = m83108x2b5a5a39()) != null) {
            this.f238653f = m83108x2b5a5a39.f295334c.getInt("pay_channel", -1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "ScanScene:%s，mChannel: %s，mScene：%s，mQrcodeUrl：%s", java.lang.Integer.valueOf(this.f238661q), java.lang.Integer.valueOf(this.f238653f), java.lang.Integer.valueOf(this.f238651d), this.f238658n);
        if (this.f238653f < 0) {
            this.f238653f = 0;
        }
        int i18 = this.f238651d;
        if (i18 == 1) {
            this.f238655h = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r0(this.f238652e, this.f238653f, this.f238654g, this.f238659o, this.f238664t, this.f238663s, this.f238662r, this.f238660p);
            r0Var.m82989x7c4af7d8("RemittanceProcess");
            m83099x5406100e(r0Var, true);
            return;
        }
        if (i18 == 7) {
            this.f238655h = true;
            m83090x14f40144(4708);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c0(this.f238658n, this.f238661q, this.f238653f, this.f238659o, this.f238664t, this.f238663s, this.f238662r);
            c0Var.m82989x7c4af7d8("MerchantPay");
            m83099x5406100e(c0Var, true);
            return;
        }
        if (i18 == 3) {
            m83090x14f40144(580);
            if (getIntent() == null) {
                setResult(0);
                finish();
                return;
            } else {
                ss4.d dVar = new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 3, "getTransferMoneyRequest", getIntent().getIntExtra("pay_channel", 0));
                dVar.m82989x7c4af7d8("RemittanceProcess");
                m83096xe7b1ccf7(dVar);
                return;
            }
        }
        if (i18 == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f238652e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.f238651d);
                finish();
                return;
            }
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f238652e)) {
                W6(this.f238652e, 31, null);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "do select a contact: %s", this.f238652e);
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16365xb36db592.class);
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 31);
            intent.putExtra("chatroomName", this.f238652e);
            intent.putExtra("key_title", getString(com.p314xaae8f345.mm.R.C30867xcad56011.i1d));
            intent.putExtra("key_same_name_tips", getString(com.p314xaae8f345.mm.R.C30867xcad56011.i1c));
            startActivityForResult(intent, 16);
            return;
        }
        if (i18 != 5 && i18 != 6) {
            W6(null, 31, null);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f238652e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.f238651d);
            finish();
            return;
        }
        java.lang.String str = this.f238652e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.f238651d + ", name=" + str);
        android.content.Intent intent2 = new android.content.Intent();
        nr4.a.e(this.f238656i, intent2);
        intent2.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17143x1f122c1e.class);
        intent2.putExtra("receiver_name", str);
        intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f238651d);
        intent2.putExtra("pay_scene", 31);
        intent2.putExtra("pay_channel", this.f238653f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceOSUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceOSUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        setResult(-1);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f238651d == 3) {
            m83121xf6ff5b27(580);
        }
        if (this.f238651d == 7) {
            m83121xf6ff5b27(4708);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r0;
        if (z17) {
            this.f238655h = false;
        }
        if (i17 != 0 || i18 != 0) {
            setResult(0);
            V6(str);
            return true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r0) m1Var;
            if (this.f238651d == 1) {
                int i19 = r0Var.B;
                if (i19 == 0 && r0Var.A == 1) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", r0Var.C);
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(this, intent);
                    finish();
                    return true;
                }
                if (i19 == 0 && r0Var.A == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "WPHK handle action_type 2");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.D)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "handle action_type 2 jump_route_info is null");
                    } else {
                        try {
                            byte[] decode = android.util.Base64.decode(r0Var.D, 0);
                            if (decode.length != 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "WPHK handle action_type 2, goto kinda common route");
                                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                                m27539xaf65a0fc.mo27555xc6c7e3f0("route_info", decode);
                                ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("commonRoute", m27539xaf65a0fc, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e0(this));
                                return true;
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RemittanceAdapterUI", e17, "handle action_type 2 catch exception", new java.lang.Object[0]);
                        }
                    }
                }
            }
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.d(r0Var.E)) {
                U6(r0Var);
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0(this);
            l0Var.b(r0Var.E, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.f0(this, r0Var, l0Var));
            return true;
        }
        if (m1Var instanceof ss4.d) {
            h45.y.f360501a = ((ss4.d) m1Var).H();
            W6(null, 31, null);
            return true;
        }
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c0) m1Var;
        r45.al4 al4Var = c0Var.f238332f;
        if (al4Var.f451626d != 0) {
            V6(al4Var.f451627e);
        } else {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.e(al4Var.f451634o)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0 l0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0(this);
                l0Var2.c(c0Var.f238332f.f451634o, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.g0(this, l0Var2));
                return true;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c0Var.f238332f.f451628f)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("rawUrl", c0Var.f238332f.f451628f);
                intent2.putExtra("pay_channel", this.f238653f);
                intent2.putExtra("pay_chat_type", getIntent().getIntExtra("chat_type", 0));
                intent2.putExtra("pay_send_type", getIntent().getIntExtra("send_type", 0));
                intent2.putExtra("pay_qrcode_session_type", getIntent().getIntExtra("qrcodeSessionType", 0));
                intent2.putExtra("pay_qrcode_session_name", getIntent().getStringExtra("qrcodeSessionName"));
                intent2.putExtra("pay_qrcode_timeline_objid", getIntent().getStringExtra("qrcodeTimelineObjId"));
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(this, intent2);
                finish();
                return true;
            }
            r45.al4 al4Var2 = c0Var.f238332f;
            if (al4Var2.f451640u) {
                java.lang.String str2 = al4Var2.f451641v;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    try {
                        byte[] decode2 = android.util.Base64.decode(str2, 0);
                        if (decode2.length != 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "WPHK handle NetSceneMerchantPayGetQRCodeInfo, goto kinda common route");
                            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc2 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                            m27539xaf65a0fc2.mo27555xc6c7e3f0("route_info", decode2);
                            ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("commonRoute", m27539xaf65a0fc2, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h0(this));
                            return true;
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RemittanceAdapterUI", e18, "handle NetSceneMerchantPayGetQRCodeInfo catch exception", new java.lang.Object[0]);
                    }
                }
            }
            r45.al4 al4Var3 = c0Var.f238332f;
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("payScene", 73);
            intent3.putExtra("payChannel", this.f238653f);
            intent3.putExtra("shopName", al4Var3.f451629g);
            intent3.putExtra("shopHeadImgURL", al4Var3.f451630h);
            intent3.putExtra("scanId", al4Var3.f451631i);
            intent3.putExtra("shopAdName", al4Var3.f451632m);
            intent3.putExtra("shopAddress", al4Var3.f451633n);
            intent3.putExtra("amountBit", al4Var3.f451635p);
            intent3.putExtra("key_shop_amount", al4Var3.f451636q);
            intent3.putExtra("key_shop_desc", al4Var3.f451637r);
            intent3.putExtra("qrcodeUrl", this.f238658n);
            intent3.putExtra("chat_type", getIntent().getIntExtra("chat_type", 0));
            intent3.putExtra("send_type", getIntent().getIntExtra("send_type", 0));
            intent3.putExtra("qrcodeSessionType", getIntent().getIntExtra("qrcodeSessionType", 0));
            intent3.putExtra("qrcodeSessionName", getIntent().getStringExtra("qrcodeSessionName"));
            intent3.putExtra("qrcodeTimelineObjId", getIntent().getStringExtra("qrcodeTimelineObjId"));
            intent3.putExtra("qrcode_sender_username", this.f238659o);
            intent3.putExtra("msg_svr_id", java.lang.String.valueOf(this.f238664t));
            intent3.putExtra("merchantPayPayerDescRequired", al4Var3.f451638s);
            intent3.putExtra("merchantPayPayerDescPlaceholder", al4Var3.f451639t);
            android.content.Intent intent4 = new android.content.Intent(intent3);
            java.lang.String stringExtra = getIntent().getStringExtra("payInitRawUrl");
            long longExtra = getIntent().getLongExtra("payInitTimestamp", 0L);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            intent4.putExtra("payInitRawUrl", stringExtra == null ? "" : stringExtra);
            intent4.putExtra("payInitTimestamp", longExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceAdapterUI", "startMerchantPayUI initRawUrl: %s, initTimestamp: %d", stringExtra, java.lang.Long.valueOf(longExtra));
            intent4.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startMerchantPayUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startMerchantPayUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            setResult(-1);
            finish();
        }
        return true;
    }
}
