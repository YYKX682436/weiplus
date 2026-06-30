package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class QrRewardSetMoneyUI extends com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f96268x = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMGridView f96269d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f96270e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f96271f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f96272g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f96273h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f96274i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f96275m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f96276n;

    /* renamed from: o, reason: collision with root package name */
    public android.util.SparseArray f96277o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f96278p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f96279q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f96280r;

    /* renamed from: s, reason: collision with root package name */
    public int f96281s;

    /* renamed from: u, reason: collision with root package name */
    public r45.tw4 f96283u;

    /* renamed from: t, reason: collision with root package name */
    public boolean f96282t = false;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f96284v = new com.tencent.mm.plugin.collect.reward.ui.o0(this);

    /* renamed from: w, reason: collision with root package name */
    public final android.text.TextWatcher f96285w = new com.tencent.mm.plugin.collect.reward.ui.p0(this);

    public static boolean U6(com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI qrRewardSetMoneyUI) {
        boolean z17 = false;
        boolean z18 = false;
        for (int i17 = 0; i17 < qrRewardSetMoneyUI.f96277o.size(); i17++) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) qrRewardSetMoneyUI.f96277o.get(i17);
            int round = (int) java.lang.Math.round(com.tencent.mm.sdk.platformtools.t8.F(walletFormView.getText(), 0.0d) * 100.0d);
            ((java.util.ArrayList) qrRewardSetMoneyUI.f96279q).set(i17, java.lang.Integer.valueOf(round));
            if (round > qrRewardSetMoneyUI.f96281s) {
                walletFormView.setContentTextColorRes(com.tencent.mm.R.color.f478529a9);
                z17 = true;
            } else {
                if (round <= 0) {
                    z18 = true;
                }
                walletFormView.setContentTextColorRes(com.tencent.mm.R.color.a0c);
            }
        }
        if (z17) {
            if (!qrRewardSetMoneyUI.f96274i.isShown()) {
                qrRewardSetMoneyUI.f96274i.startAnimation(android.view.animation.AnimationUtils.loadAnimation(qrRewardSetMoneyUI, com.tencent.mm.R.anim.f477814c8));
                qrRewardSetMoneyUI.f96274i.setVisibility(0);
            }
            qrRewardSetMoneyUI.f96271f.setEnabled(false);
        } else if (z18) {
            qrRewardSetMoneyUI.f96271f.setEnabled(false);
        } else {
            if (qrRewardSetMoneyUI.f96274i.isShown()) {
                qrRewardSetMoneyUI.f96274i.startAnimation(android.view.animation.AnimationUtils.loadAnimation(qrRewardSetMoneyUI, com.tencent.mm.R.anim.f477834cs));
                qrRewardSetMoneyUI.f96274i.setVisibility(8);
            }
            qrRewardSetMoneyUI.f96271f.setEnabled(true);
        }
        return z17;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cbr;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f96269d = (com.tencent.mm.ui.base.MMGridView) findViewById(com.tencent.mm.R.id.lgr);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f96276n = wcPayBannerView;
        wcPayBannerView.a();
        this.f96276n.setBannerData(this.f96283u);
        this.f96271f = (android.widget.Button) findViewById(com.tencent.mm.R.id.lgq);
        this.f96274i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lgn);
        this.f96273h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.lgo);
        this.f96272g = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.lgs);
        this.f96270e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lgt);
        this.f96275m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lgp);
        java.lang.String l17 = c01.z1.l();
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            l17 = c01.z1.b();
        }
        android.widget.TextView textView = this.f96270e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, l17));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f96273h, c01.z1.r(), 0.06f);
        this.f96269d.setAdapter((android.widget.ListAdapter) new com.tencent.mm.plugin.collect.reward.ui.q0(this, null));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f96280r)) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f96272g;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = this.f96280r;
            float textSize = this.f96272g.getTextSize();
            ((ke0.e) xVar2).getClass();
            mMEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str, textSize));
        }
        this.f96274i.setText(getString(com.tencent.mm.R.string.hpe, "" + java.lang.Math.round(this.f96281s / 100.0f)));
        if (this.f96282t) {
            this.f96271f.setText(com.tencent.mm.R.string.how);
            this.f96275m.setVisibility(8);
        }
        this.f96271f.setOnClickListener(new com.tencent.mm.plugin.collect.reward.ui.l0(this));
    }

    @Override // com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.hph);
        addSceneEndListener(1562);
        java.util.List O1 = com.tencent.mm.sdk.platformtools.t8.O1((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, ""), ",");
        this.f96278p = new java.util.ArrayList();
        if (O1.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardSetMoneyUI", "use client hardcode amt list");
            this.f96278p = java.util.Arrays.asList(yw1.d.f466605a);
        } else {
            java.util.Iterator it = O1.iterator();
            while (it.hasNext()) {
                this.f96278p.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) it.next(), 0)));
            }
        }
        this.f96279q = new java.util.ArrayList(this.f96278p);
        this.f96281s = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_MAX_AMT_INT_SYNC, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL))).intValue();
        this.f96282t = getIntent().getBooleanExtra("key_first_flag", false);
        this.f96280r = getIntent().getStringExtra("key_desc_word");
        java.lang.String stringExtra = getIntent().getStringExtra("key_notice_item");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            try {
                r45.tw4 tw4Var = new r45.tw4();
                tw4Var.parseFrom(android.util.Base64.decode(stringExtra, 2));
                this.f96283u = tw4Var;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QrRewardSetMoneyUI", e17, "", new java.lang.Object[0]);
            }
        }
        this.f96277o = new android.util.SparseArray();
        for (int i17 = 0; i17 < this.f96279q.size(); i17++) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cbp, (android.view.ViewGroup) null);
            walletFormView.b(this.f96285w);
            int intValue = ((java.lang.Integer) this.f96279q.get(i17)).intValue();
            int i18 = intValue / 100;
            double d17 = intValue / 100.0d;
            if (d17 > i18) {
                walletFormView.setText(java.lang.String.format("%.2f", java.lang.Double.valueOf(d17)));
            } else {
                walletFormView.setText(java.lang.String.format("%d", java.lang.Integer.valueOf(i18)));
            }
            setEditFocusListener(walletFormView, 2, false);
            this.f96277o.put(i17, walletFormView);
        }
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1562);
        com.tencent.mm.sdk.platformtools.u3.l(this.f96284v);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof xw1.i)) {
            return false;
        }
        xw1.i iVar = (xw1.i) m1Var;
        iVar.K(new com.tencent.mm.plugin.collect.reward.ui.n0(this, iVar));
        iVar.J(new com.tencent.mm.plugin.collect.reward.ui.m0(this, iVar));
        if (!iVar.f457661h) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.QrRewardSetMoneyUI", "net error: %s", iVar);
        return false;
    }
}
