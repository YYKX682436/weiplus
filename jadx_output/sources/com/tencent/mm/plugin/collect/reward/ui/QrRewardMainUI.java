package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class QrRewardMainUI extends com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f96227J = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f96229e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f96230f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f96231g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f96232h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f96233i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f96234m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f96235n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f96236o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f96237p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f96238q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f96239r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f96240s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f96241t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ScrollView f96242u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f96243v;

    /* renamed from: w, reason: collision with root package name */
    public r45.tw4 f96244w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f96246y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f96247z;

    /* renamed from: d, reason: collision with root package name */
    public final int f96228d = i65.a.b(getContext(), 200);

    /* renamed from: x, reason: collision with root package name */
    public boolean f96245x = false;

    public static void U6(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI, boolean z17) {
        qrRewardMainUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "goto set money");
        android.content.Intent intent = new android.content.Intent(qrRewardMainUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI.class);
        intent.putExtra("key_first_flag", z17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qrRewardMainUI.B)) {
            intent.putExtra("key_desc_word", qrRewardMainUI.B);
        }
        r45.tw4 tw4Var = qrRewardMainUI.f96244w;
        if (tw4Var != null) {
            try {
                intent.putExtra("key_notice_item", android.util.Base64.encodeToString(tw4Var.toByteArray(), 2));
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QrRewardMainUI", e17, "", new java.lang.Object[0]);
            }
        }
        qrRewardMainUI.startActivityForResult(intent, 1);
    }

    public final boolean V6() {
        return com.tencent.mm.sdk.platformtools.t8.K0(this.A);
    }

    public final void W6(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3 = this.f96246y;
        boolean z18 = str3 != null && str3.equals(str);
        boolean d17 = yw1.c.c().d();
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "do download photo: %s, same url: %s, pic exist: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(d17));
        if (!z17 && z18 && d17) {
            return;
        }
        yw1.c c17 = yw1.c.c();
        com.tencent.mm.plugin.collect.reward.ui.p pVar = new com.tencent.mm.plugin.collect.reward.ui.p(this);
        c17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardCdnDownloadHelper", "downloadImage. imageId:%s", str);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(yw1.c.b());
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_QrRewardCdnDownloadHelper";
        mVar.f241786e = false;
        mVar.f241787f = c17;
        mVar.field_fullpath = yw1.c.b() + c17.a();
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String b17 = com.tencent.mm.modelcdntran.i2.b("QrRewardImg", java.lang.System.currentTimeMillis(), c01.z1.g().d1(), "");
        mVar.field_mediaId = b17 != null ? b17 : "";
        mVar.field_fileId = str;
        mVar.field_aesKey = str2;
        mVar.field_fileType = 5;
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = 0;
        mVar.field_bzScene = 0;
        if (c17.f466603d == null) {
            c17.f466603d = new java.util.HashMap();
        }
        ((java.util.HashMap) c17.f466603d).put(mVar.field_mediaId, pVar);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.QrRewardCdnDownloadHelper", "ljd: cdntra addSendTask failed. imageId:%s", str);
    }

    public final void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "do set photo word");
        xw1.j jVar = new xw1.j(this.A);
        jVar.f457660g = new java.lang.ref.WeakReference(this);
        doSceneProgress(jVar, true);
    }

    public final void Y6() {
        int round = java.lang.Math.round(this.f96228d * ((this.F * 1.0f) / this.E));
        if (round <= 0) {
            round = 248;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f96236o.getLayoutParams();
        layoutParams.width = round;
        layoutParams.height = round;
        this.f96236o.setLayoutParams(layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f96235n.getLayoutParams();
        layoutParams2.width = round;
        layoutParams2.height = round;
        this.f96235n.setLayoutParams(layoutParams2);
        android.view.ViewGroup.LayoutParams layoutParams3 = this.f96237p.getLayoutParams();
        int i17 = round - 30;
        layoutParams3.width = i17;
        layoutParams3.height = i17;
        this.f96237p.setLayoutParams(layoutParams3);
        this.f96237p.setTextSize(0, (round * 2) / 3);
        this.f96232h.requestLayout();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.B)) {
            this.f96238q.setText("");
        } else {
            android.widget.TextView textView = this.f96238q;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = getString(com.tencent.mm.R.string.hpj, this.B);
            float textSize = this.f96238q.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string, textSize));
        }
        a7(V6());
    }

    public final void Z6() {
        if (V6()) {
            return;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f96237p;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        java.lang.String str = this.A;
        float textSize = this.f96237p.getTextSize();
        ((ke0.e) xVar).getClass();
        mMEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        this.f96237p.setSelection(this.A.length());
    }

    public final void a7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "switch mode: %s", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            this.f96235n.setVisibility(4);
            this.f96237p.setVisibility(0);
            return;
        }
        this.f96235n.setVisibility(0);
        this.f96237p.setVisibility(4);
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = this.f96235n;
        java.lang.String str = this.I;
        ((com.tencent.mm.feature.avatar.w) zVar).getClass();
        com.tencent.mm.pluginsdk.ui.u.b(imageView, str, 0.03f, true);
    }

    public final void b7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
            this.f96240s.setVisibility(8);
            return;
        }
        this.f96240s.setClickable(true);
        this.f96240s.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        com.tencent.mm.plugin.wallet_core.ui.d7 d7Var = new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.collect.reward.ui.q(this));
        android.text.SpannableString spannableString = new android.text.SpannableString(this.C);
        spannableString.setSpan(d7Var, 0, spannableString.length(), 18);
        this.f96240s.setText(spannableString);
        this.f96240s.setVisibility(0);
    }

    public final void c7() {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f96247z);
        int i17 = this.f96228d;
        if (!K0) {
            this.f96234m.b(this.f96247z, i17, i17, -1);
            this.f96233i.setVisibility(0);
            return;
        }
        if (!yw1.c.c().d()) {
            this.f96233i.setVisibility(4);
            return;
        }
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = this.f96234m;
        yw1.c c17 = yw1.c.c();
        c17.getClass();
        cdnImageView.b(yw1.c.b() + c17.a(), i17, i17, -1);
        this.f96233i.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cbl;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f96229e = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.m7q);
        this.f96230f = (android.widget.Button) findViewById(com.tencent.mm.R.id.lg6);
        this.f96231g = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f486502lg5);
        this.f96232h = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f486501lg4);
        this.f96234m = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.lfz);
        this.f96238q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486500lg3);
        this.f96235n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.lfy);
        this.f96236o = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.lfx);
        this.f96233i = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f486497lg0);
        this.f96237p = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.f486498lg1);
        this.f96239r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lg8);
        this.f96241t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lga);
        this.f96240s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lfw);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f96243v = wcPayBannerView;
        wcPayBannerView.a();
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = this.f96235n;
        java.lang.String str = this.I;
        ((com.tencent.mm.feature.avatar.w) zVar).getClass();
        com.tencent.mm.pluginsdk.ui.u.b(imageView, str, 0.03f, true);
        try {
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f96237p;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            java.lang.String str2 = this.A;
            float textSize = this.f96237p.getTextSize();
            ((ke0.e) xVar).getClass();
            mMEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize));
            this.f96237p.setSelection(this.A.length());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QrRewardMainUI", e17, "", new java.lang.Object[0]);
        }
        this.f96237p.addTextChangedListener(new com.tencent.mm.plugin.collect.reward.ui.u(this));
        this.f96237p.setOnEditorActionListener(new com.tencent.mm.plugin.collect.reward.ui.v(this));
        this.f96236o.setContentDescription(getString(com.tencent.mm.R.string.hov));
        this.f96236o.setOnClickListener(new com.tencent.mm.plugin.collect.reward.ui.w(this));
        this.f96239r.setClickable(true);
        this.f96239r.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        com.tencent.mm.plugin.wallet_core.ui.d7 d7Var = new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.collect.reward.ui.z(this));
        android.text.SpannableString spannableString = new android.text.SpannableString(getString(com.tencent.mm.R.string.hp8));
        spannableString.setSpan(d7Var, 0, spannableString.length(), 18);
        this.f96239r.setText(spannableString);
        this.f96241t.setClickable(true);
        this.f96241t.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        com.tencent.mm.plugin.wallet_core.ui.d7 d7Var2 = new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.collect.reward.ui.a0(this));
        android.text.SpannableString spannableString2 = new android.text.SpannableString(getString(com.tencent.mm.R.string.hph));
        spannableString2.setSpan(d7Var2, 0, spannableString2.length(), 18);
        this.f96241t.setText(spannableString2);
        c7();
        Y6();
        Z6();
        b7();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needExecuteBackListener() {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 == -1) {
            this.B = intent.getStringExtra("key_desc");
            this.E = intent.getIntExtra("key_photo_width", 900);
            this.F = intent.getIntExtra("key_icon_width", uc1.t1.CTRL_INDEX);
            boolean booleanExtra = intent.getBooleanExtra("key_return_from_first", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "return from first: %s", java.lang.Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                this.f96232h.setVisibility(0);
                this.f96231g.setVisibility(8);
            }
            this.H = true;
            Y6();
            java.lang.String stringExtra = intent.getStringExtra("key_photo_url");
            java.lang.String stringExtra2 = intent.getStringExtra("key_photo_aeskey");
            java.lang.String stringExtra3 = intent.getStringExtra("key_photo_url_v2");
            this.f96247z = stringExtra3;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                W6(stringExtra, stringExtra2, true);
            } else {
                c7();
            }
            this.f96246y = stringExtra;
        }
    }

    @Override // com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        addSceneEndListener(1323);
        addSceneEndListener(1649);
        this.E = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_PHOTO_WIDTH_INT_SYNC, 900)).intValue();
        this.F = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_ICON_WIDTH_INT_SYNC, java.lang.Integer.valueOf(uc1.t1.CTRL_INDEX))).intValue();
        this.B = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_DESC_STRING_SYNC, "");
        this.A = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, "");
        this.C = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_BOTTOM_STR_STRING_SYNC, "");
        this.D = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_BOTTOM_URL_STRING_SYNC, "");
        this.f96246y = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_STRING_SYNC, "");
        this.f96247z = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_V2_STRING_SYNC, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, ""))) {
            this.H = true;
        }
        this.I = c01.z1.r();
        setMMTitle(com.tencent.mm.R.string.f492744hp3);
        initView();
        boolean z17 = yw1.c.c().d() && this.H;
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "do get code: %s", java.lang.Boolean.valueOf(z17));
        xw1.d dVar = new xw1.d(z17);
        dVar.f457660g = new java.lang.ref.WeakReference(this);
        if (z17) {
            doSceneProgress(dVar, false);
        } else {
            doSceneProgress(dVar, true);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1323);
        removeSceneEndListener(1649);
        yw1.c c17 = yw1.c.c();
        java.util.Map map = c17.f466603d;
        if (map != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardCdnDownloadHelper", "callback size: %s", java.lang.Integer.valueOf(((java.util.HashMap) map).size()));
            ((java.util.HashMap) c17.f466603d).clear();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onKeyboardStateChanged() {
        super.onKeyboardStateChanged();
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "key board changed: %s", java.lang.Integer.valueOf(keyboardState()));
        if (keyboardState() == 2) {
            this.A = this.f96237p.getText().toString();
            X6();
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
                a7(true);
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(getContext(), this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(getContext(), this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof xw1.d) {
            xw1.d dVar = (xw1.d) m1Var;
            dVar.K(new com.tencent.mm.plugin.collect.reward.ui.d0(this, dVar));
            dVar.J(new com.tencent.mm.plugin.collect.reward.ui.c0(this, dVar));
            if (dVar.f457661h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QrRewardMainUI", "net error: %s", dVar);
                if (!dVar.f457666p) {
                    U6(this, false);
                }
            }
            return true;
        }
        if (m1Var instanceof xw1.j) {
            xw1.j jVar = (xw1.j) m1Var;
            jVar.K(new com.tencent.mm.plugin.collect.reward.ui.l(this, jVar));
            jVar.J(new com.tencent.mm.plugin.collect.reward.ui.k(this, jVar));
            if (jVar.f457661h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QrRewardMainUI", "net error: %s", jVar);
                this.A = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, "");
                a7(V6());
                this.f96237p.setText("");
                Z6();
            }
            this.f96237p.clearFocus();
            this.f96237p.setCursorVisible(false);
        }
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "onScreenShot");
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_qr_reward_page", null, 0);
    }
}
