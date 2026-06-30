package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class QrRewardGrantUI extends com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI {
    public static final /* synthetic */ int K = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;
    public java.lang.String G;
    public java.lang.String H;
    public r45.tw4 I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f96205J = new com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.AnonymousClass8(com.tencent.mm.app.a0.f53288d);

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f96206d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f96207e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f96208f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f96209g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f96210h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f96211i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f96212m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f96213n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.RadioButton f96214o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f96215p;

    /* renamed from: q, reason: collision with root package name */
    public int f96216q;

    /* renamed from: r, reason: collision with root package name */
    public int f96217r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f96218s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f96219t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f96220u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f96221v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f96222w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f96223x;

    /* renamed from: y, reason: collision with root package name */
    public int f96224y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f96225z;

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI$8, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass8 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.F2fPayCheckEvent> {
        public AnonymousClass8(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1822922800;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.F2fPayCheckEvent f2fPayCheckEvent) {
            com.tencent.mm.autogen.events.F2fPayCheckEvent f2fPayCheckEvent2 = f2fPayCheckEvent;
            am.g9 g9Var = f2fPayCheckEvent2.f54224g;
            if (g9Var.f6745c) {
                com.tencent.mars.xlog.Log.f("MicroMsg.QrRewardGrantUI", "F2fPayCheckEvent is from kinda");
                am.g9 g9Var2 = f2fPayCheckEvent2.f54224g;
                if (g9Var2.f6746d == 1) {
                    com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI = com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.this;
                    java.lang.String str = g9Var2.f6743a;
                    java.lang.String str2 = g9Var2.f6744b;
                    int i17 = com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.K;
                    qrRewardGrantUI.a7(str, str2);
                    com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.this.setResult(-1);
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    com.tencent.mm.plugin.collect.reward.ui.j jVar = new com.tencent.mm.plugin.collect.reward.ui.j(this);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(jVar, 100L, false);
                }
            } else {
                com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI2 = com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.this;
                java.lang.String str3 = g9Var.f6743a;
                java.lang.String str4 = g9Var.f6744b;
                int i18 = com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.K;
                qrRewardGrantUI2.a7(str3, str4);
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean U6(com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI r7, int r8) {
        /*
            int r0 = r7.f96217r
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L7
            goto L1d
        L7:
            double r3 = (double) r8
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L11
            r8 = r1
            r0 = r2
            goto L2a
        L11:
            int r0 = r7.F
            if (r8 > r0) goto L20
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r8 = r7.f96211i
            r0 = 2131101993(0x7f060929, float:1.7816411E38)
            r8.setContentTextColorRes(r0)
        L1d:
            r0 = r1
            r8 = r2
            goto L2a
        L20:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r8 = r7.f96211i
            r0 = 2131100093(0x7f0601bd, float:1.7812558E38)
            r8.setContentTextColorRes(r0)
            r8 = r1
            r0 = r8
        L2a:
            if (r8 == 0) goto L4d
            android.widget.TextView r0 = r7.f96208f
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L47
            android.widget.TextView r0 = r7.f96208f
            r1 = 2130772126(0x7f01009e, float:1.7147362E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r7, r1)
            r0.startAnimation(r1)
            android.widget.TextView r0 = r7.f96208f
            r1 = 8
            r0.setVisibility(r1)
        L47:
            android.widget.Button r7 = r7.f96213n
            r7.setEnabled(r2)
            goto L73
        L4d:
            if (r0 == 0) goto L55
            android.widget.Button r7 = r7.f96213n
            r7.setEnabled(r1)
            goto L73
        L55:
            android.widget.TextView r0 = r7.f96208f
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L6e
            android.widget.TextView r0 = r7.f96208f
            r2 = 2130772103(0x7f010087, float:1.7147315E38)
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r7, r2)
            r0.startAnimation(r2)
            android.widget.TextView r0 = r7.f96208f
            r0.setVisibility(r1)
        L6e:
            android.widget.Button r7 = r7.f96213n
            r7.setEnabled(r1)
        L73:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.U6(com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI, int):boolean");
    }

    public static void V6(com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI) {
        qrRewardGrantUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardGrantUI", "start pay");
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192114m = qrRewardGrantUI.f96219t;
        payInfo.f192109e = 48;
        payInfo.f192111g = qrRewardGrantUI.f96224y;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("extinfo_key_1", qrRewardGrantUI.f96225z);
        bundle.putString("extinfo_key_2", qrRewardGrantUI.A);
        bundle.putString("extinfo_key_3", qrRewardGrantUI.f96218s);
        bundle.putString("extinfo_key_7", qrRewardGrantUI.f96212m.getText().toString().replace("\n", ""));
        bundle.putString("extinfo_key_27", qrRewardGrantUI.H);
        bundle.putString("extinfo_key_28", qrRewardGrantUI.G);
        int intExtra = qrRewardGrantUI.getIntent().getIntExtra("key_chat_type", 0);
        int intExtra2 = qrRewardGrantUI.getIntent().getIntExtra("key_send_type", 0);
        bundle.putInt("chat_type", intExtra);
        bundle.putInt("send_type", intExtra2);
        payInfo.f192122u = bundle;
        if (qrRewardGrantUI.mKindaEnable) {
            ((h45.q) i95.n0.c(h45.q.class)).startSNSPay(qrRewardGrantUI, payInfo);
        } else {
            h45.a0.f(qrRewardGrantUI, payInfo, 1);
        }
    }

    public static void X6(com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI) {
        java.lang.String replace = qrRewardGrantUI.f96212m.getText().toString().replace("\n", "");
        boolean isChecked = qrRewardGrantUI.f96214o.isChecked();
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardGrantUI", "do place order, amt: %s, amtType: %s, payer desc: %s showPayInfo %s", java.lang.Integer.valueOf(qrRewardGrantUI.f96216q), java.lang.Integer.valueOf(qrRewardGrantUI.f96217r), replace, java.lang.Integer.valueOf(isChecked ? 1 : 0));
        xw1.g gVar = new xw1.g(qrRewardGrantUI.f96216q, qrRewardGrantUI.f96217r, qrRewardGrantUI.f96225z, qrRewardGrantUI.f96218s, replace, qrRewardGrantUI.f96224y, qrRewardGrantUI.B, qrRewardGrantUI.f96222w, qrRewardGrantUI.C, qrRewardGrantUI.D, qrRewardGrantUI.E, isChecked ? 1 : 0);
        gVar.f457660g = new java.lang.ref.WeakReference(qrRewardGrantUI);
        if (!qrRewardGrantUI.mKindaEnable) {
            qrRewardGrantUI.doSceneProgress(gVar);
        } else {
            qrRewardGrantUI.showLoading();
            qrRewardGrantUI.doSceneProgress(gVar, false);
        }
    }

    public final void a7(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardGrantUI", "do pay check");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96219t)) {
            this.f96219t = str;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96221v)) {
            this.f96221v = str2;
        }
        doSceneProgress(new xw1.f(this.f96219t, this.f96220u, this.f96221v, this.f96216q, this.f96222w, this.f96223x), false);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cbk;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f96206d = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.lfp);
        this.f96207e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lfq);
        this.f96209g = (com.tencent.mm.wallet_core.ui.WalletTextView) findViewById(com.tencent.mm.R.id.lfu);
        this.f96210h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.lft);
        this.f96211i = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.lfr);
        this.f96212m = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.lfs);
        this.f96213n = (android.widget.Button) findViewById(com.tencent.mm.R.id.lfv);
        if (com.tencent.mm.ui.bk.C()) {
            this.f96213n.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.cvz));
        } else {
            this.f96213n.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.avz));
        }
        this.f96208f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lfo);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f96215p = wcPayBannerView;
        wcPayBannerView.a();
        android.widget.RadioButton radioButton = (android.widget.RadioButton) findViewById(com.tencent.mm.R.id.lht);
        this.f96214o = radioButton;
        radioButton.setChecked(true);
        this.f96208f.setText(getString(com.tencent.mm.R.string.hpe, "" + java.lang.Math.round(this.F / 100.0f)));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.H)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f96206d, this.f96225z, 0.03f);
        } else {
            int d17 = com.tencent.mm.sdk.platformtools.j.d(this, 50.0f);
            this.f96206d.setRoundCorner(true);
            this.f96206d.b(this.H, d17, d17, com.tencent.mm.R.drawable.bhm);
        }
        java.lang.String I = com.tencent.mm.sdk.platformtools.t8.K0(this.G) ? com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(this.f96225z), 10) : this.G;
        android.widget.TextView textView = this.f96207e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String string = getString(com.tencent.mm.R.string.f492742hp1, I);
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, string));
        if (this.f96217r == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardGrantUI", "edit layout");
            setEditFocusListener(this.f96211i, 2, false);
            this.f96211i.b(new com.tencent.mm.plugin.collect.reward.ui.b(this));
            this.f96211i.setVisibility(0);
            this.f96210h.setVisibility(8);
            this.f96211i.p();
            this.f96213n.setEnabled(false);
        } else {
            this.f96209g.setText(com.tencent.mm.wallet_core.ui.r1.o(this.f96216q / 100.0d));
            this.f96211i.setVisibility(8);
            this.f96210h.setVisibility(0);
        }
        this.f96213n.setOnClickListener(new com.tencent.mm.plugin.collect.reward.ui.c(this));
        findViewById(com.tencent.mm.R.id.lhu).setOnClickListener(new com.tencent.mm.plugin.collect.reward.ui.d(this));
        this.f96214o.setOnCheckedChangeListener(new com.tencent.mm.plugin.collect.reward.ui.e(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
        } else if (i18 == -1) {
            setResult(-1);
            if (intent != null) {
                a7(intent.getStringExtra("key_reqKey"), intent.getStringExtra("key_trans_id"));
            }
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1336);
        this.f96205J.alive();
        setMMTitle(com.tencent.mm.R.string.f492741hp0);
        this.f96216q = getIntent().getIntExtra("key_money_amt", com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        this.f96217r = getIntent().getIntExtra("key_amt_type", 0);
        this.f96218s = getIntent().getStringExtra("key_qrcode_desc");
        this.f96224y = getIntent().getIntExtra("key_channel", 0);
        this.f96222w = getIntent().getStringExtra("key_rcvr_open_id");
        this.f96225z = getIntent().getStringExtra("key_rcvr_name");
        this.A = getIntent().getStringExtra("key_rcvr_true_name");
        this.B = getIntent().getStringExtra("key_scan_id");
        this.C = getIntent().getStringExtra("key_web_url");
        this.D = getIntent().getStringExtra("key_sxtend_1");
        this.E = getIntent().getStringExtra("key_sxtend_2");
        this.F = getIntent().getIntExtra("key_max_amt", com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        this.G = getIntent().getStringExtra("key_receiver_nickname");
        this.H = getIntent().getStringExtra("key_photo_url");
        java.lang.String stringExtra = getIntent().getStringExtra("key_notice_item");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            r45.tw4 tw4Var = new r45.tw4();
            try {
                tw4Var.parseFrom(mt4.a.a(stringExtra));
                this.I = tw4Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QrRewardGrantUI", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardGrantUI", "amtType: %s, channel: %s, maxAmt: %s", java.lang.Integer.valueOf(this.f96217r), java.lang.Integer.valueOf(this.f96224y), java.lang.Integer.valueOf(this.F));
        initView();
        this.f96215p.setBannerData(this.I);
        com.tencent.mm.wallet_core.b.a().getClass();
        this.mKindaEnable = true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1336);
        this.f96205J.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof xw1.g)) {
            return true;
        }
        xw1.g gVar = (xw1.g) m1Var;
        gVar.K(new com.tencent.mm.plugin.collect.reward.ui.i(this, gVar));
        gVar.J(new com.tencent.mm.plugin.collect.reward.ui.f(this, gVar));
        if (!gVar.f457661h) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.QrRewardGrantUI", "net error: %s", gVar);
        if (!this.mKindaEnable) {
            return true;
        }
        hideLoading();
        return true;
    }
}
