package com.tencent.mm.plugin.collect.reward.ui;

@db5.a(2)
/* loaded from: classes9.dex */
public class QrRewardSelectMoneyUI extends com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public r45.tw4 E;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f96248d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f96249e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f96250f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f96251g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f96252h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f96253i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMGridView f96254m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f96255n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f96256o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.collect.reward.ui.k0 f96257p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f96258q;

    /* renamed from: r, reason: collision with root package name */
    public int f96259r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f96260s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f96261t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f96262u;

    /* renamed from: v, reason: collision with root package name */
    public int f96263v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f96264w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f96265x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f96266y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f96267z;

    public static void U6(com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI qrRewardSelectMoneyUI, int i17, int i18) {
        qrRewardSelectMoneyUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardSelectMoneyUI", "go to grant ui");
        android.content.Intent intent = new android.content.Intent(qrRewardSelectMoneyUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.class);
        intent.putExtra("key_amt_type", i18);
        if (i18 == 1) {
            intent.putExtra("key_money_amt", i17);
        }
        intent.putExtra("key_rcvr_name", qrRewardSelectMoneyUI.f96261t);
        intent.putExtra("key_rcvr_true_name", qrRewardSelectMoneyUI.f96262u);
        intent.putExtra("key_rcvr_open_id", qrRewardSelectMoneyUI.f96264w);
        intent.putExtra("key_qrcode_desc", qrRewardSelectMoneyUI.f96265x);
        intent.putExtra("key_channel", qrRewardSelectMoneyUI.f96259r);
        intent.putExtra("key_web_url", qrRewardSelectMoneyUI.f96260s);
        intent.putExtra("key_scan_id", qrRewardSelectMoneyUI.A);
        intent.putExtra("key_sxtend_1", qrRewardSelectMoneyUI.f96266y);
        intent.putExtra("key_sxtend_2", qrRewardSelectMoneyUI.f96267z);
        intent.putExtra("key_max_amt", qrRewardSelectMoneyUI.f96263v);
        intent.putExtra("key_receiver_nickname", qrRewardSelectMoneyUI.C);
        intent.putExtra("key_photo_url", qrRewardSelectMoneyUI.D);
        intent.putExtra("key_chat_type", qrRewardSelectMoneyUI.getIntent().getIntExtra("key_chat_type", 0));
        intent.putExtra("key_send_type", qrRewardSelectMoneyUI.getIntent().getIntExtra("key_send_type", 0));
        r45.tw4 tw4Var = qrRewardSelectMoneyUI.E;
        if (tw4Var != null) {
            try {
                intent.putExtra("key_notice_item", android.util.Base64.encodeToString(tw4Var.toByteArray(), 2));
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QrRewardSelectMoneyUI", e17, "", new java.lang.Object[0]);
            }
        }
        qrRewardSelectMoneyUI.startActivityForResult(intent, 1);
    }

    public final void V6(java.lang.String str) {
        java.lang.String x17 = com.tencent.mm.sdk.platformtools.t8.K0(this.C) ? com.tencent.mm.wallet_core.ui.r1.x(str) : this.C;
        android.widget.TextView textView = this.f96251g;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, x17));
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cbo;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f96249e = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.lgg);
        this.f96250f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lgl);
        this.f96251g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lgj);
        this.f96252h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lgh);
        this.f96253i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lgm);
        this.f96254m = (com.tencent.mm.ui.base.MMGridView) findViewById(com.tencent.mm.R.id.lgi);
        this.f96255n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lgk);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f96256o = wcPayBannerView;
        wcPayBannerView.setBgColor(getResources().getColor(com.tencent.mm.R.color.f478526a7));
        this.f96256o.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        com.tencent.mm.plugin.collect.reward.ui.k0 k0Var = new com.tencent.mm.plugin.collect.reward.ui.k0(this, null);
        this.f96257p = k0Var;
        this.f96254m.setAdapter((android.widget.ListAdapter) k0Var);
        this.f96254m.setOnItemClickListener(new com.tencent.mm.plugin.collect.reward.ui.e0(this));
        this.f96255n.setOnClickListener(new com.tencent.mm.plugin.collect.reward.ui.f0(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
        } else if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardSelectMoneyUI", "pay succ");
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1516);
        setMMTitle(com.tencent.mm.R.string.f492744hp3);
        this.f96258q = getIntent().getStringExtra("key_qrcode_url");
        this.f96259r = getIntent().getIntExtra("key_channel", 0);
        this.f96260s = getIntent().getStringExtra("key_web_url");
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardSelectMoneyUI", "do scan code");
        doSceneProgress(new xw1.h(this.f96258q, this.f96259r, this.f96260s));
        initView();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14721, 2, java.lang.Integer.valueOf(getIntent().getIntExtra("key_scene", 0)));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1516);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof xw1.h) {
            xw1.h hVar = (xw1.h) m1Var;
            hVar.K(new com.tencent.mm.plugin.collect.reward.ui.i0(this, hVar));
            if (hVar.f457662i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QrRewardSelectMoneyUI", "scan response error");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(hVar.f457675n.f379904e)) {
                    dp.a.makeText(this, hVar.f457675n.f379904e, 1).show();
                }
                finish();
            }
            com.tencent.mm.plugin.collect.reward.ui.h0 h0Var = new com.tencent.mm.plugin.collect.reward.ui.h0(this, hVar);
            if (hVar.f457661h) {
                h0Var.a(hVar.f457657d, hVar.f457658e, hVar.f457659f, hVar);
            }
            setContentViewVisibility(0);
        }
        return true;
    }
}
