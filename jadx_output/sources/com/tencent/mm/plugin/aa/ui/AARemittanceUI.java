package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class AARemittanceUI extends com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public long D;
    public java.lang.String E;
    public java.lang.String F;

    /* renamed from: g, reason: collision with root package name */
    public int f72454g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ScrollView f72455h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f72456i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f72457m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f72458n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f72459o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f72460p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f72461q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f72462r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f72463s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f72464t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f72465u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f72466v;

    /* renamed from: w, reason: collision with root package name */
    public double f72467w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f72469y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f72470z;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f72468x = "";
    public android.app.Dialog G = null;
    public final k61.w H = (k61.w) this.f72474e.a(this, k61.w.class);
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.Runnable f72453J = new com.tencent.mm.plugin.aa.ui.j0(this);

    public static void f7(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI) {
        aARemittanceUI.getClass();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.aa.ui.x0 x0Var = new com.tencent.mm.plugin.aa.ui.x0(aARemittanceUI);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(x0Var, 300L, false);
        gt4.l.b(aARemittanceUI, aARemittanceUI.getString(com.tencent.mm.R.string.f489759aw), aARemittanceUI.f72468x, aARemittanceUI.getString(com.tencent.mm.R.string.hyh), true, 20, new com.tencent.mm.plugin.aa.ui.z0(aARemittanceUI), new com.tencent.mm.plugin.aa.ui.b1(aARemittanceUI));
    }

    public static void h7(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI, r45.v vVar) {
        boolean z17 = aARemittanceUI.getIntent().getIntExtra("enter_scene", 0) == 1;
        java.lang.String str = vVar.f387773f;
        aARemittanceUI.A = vVar.f387774g;
        aARemittanceUI.B = vVar.f387776i;
        aARemittanceUI.C = vVar.f387778n;
        h61.o.q(aARemittanceUI, str, z17, vVar.f387775h, aARemittanceUI.f72469y, aARemittanceUI.E, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR);
    }

    public static void i7(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI, java.lang.String str) {
        aARemittanceUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "showErrorDialog,errMsg:%s", str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(aARemittanceUI.getContext());
        u1Var.u("");
        u1Var.g(str);
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.ga_);
        u1Var.l(new com.tencent.mm.plugin.aa.ui.u0(aARemittanceUI));
        u1Var.q(false);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487873aa;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void hideLoading() {
        android.app.Dialog dialog = this.G;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.G.dismiss();
        this.G = null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        this.f72455h = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.root_view);
        this.f72456i = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.mm.R.id.pok);
        this.f72457m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482319b8);
        this.f72458n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f482316b5);
        this.f72459o = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f482318b7);
        this.f72460p = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pcn);
        this.f72461q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pcq);
        this.f72462r = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pcl);
        int intExtra = getIntent().getIntExtra("amount_remind_bit", 4);
        if (com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_TW") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_HK")) {
            this.f72460p.post(new com.tencent.mm.plugin.aa.ui.h0(this));
            this.f72459o.setmWalletFormViewListener(new com.tencent.mm.plugin.aa.ui.i0(this, intExtra));
        } else {
            this.f72462r.setVisibility(8);
        }
        this.f72456i.h();
        this.f72456i.setActionText(getString(com.tencent.mm.R.string.f489758av));
        ((android.widget.RelativeLayout.LayoutParams) this.f72456i.getLayoutParams()).addRule(12);
        this.f72456i.e(false);
        setWPKeyboard(this.f72459o.getContentEt(), true, false);
        this.f72459o.setmContentAbnormalMoneyCheck(true);
        this.f72459o.post(new com.tencent.mm.plugin.aa.ui.g0(this));
        com.tencent.mm.wallet_core.ui.r1.v0(this.f72459o.getContentEt());
        this.f72459o.getContentEt().setOnEditorActionListener(new com.tencent.mm.plugin.aa.ui.e1(this, new com.tencent.mm.plugin.aa.ui.d1(this)));
        this.f72459o.b(new com.tencent.mm.plugin.aa.ui.f1(this));
        this.f72459o.r(7, 2);
        this.f72464t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482315b4);
        this.f72463s = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f482313b2);
        this.f72465u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486617lv4);
        this.f72466v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482711lu);
        k7();
        setMMTitle("");
        hideActionbarLine();
        this.f72455h.setOnTouchListener(new com.tencent.mm.plugin.aa.ui.c1(this));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f72458n, this.f72469y, null);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = this.f72469y;
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(str);
        java.lang.String string = getString(com.tencent.mm.R.string.gxe, this.f72470z);
        this.f72457m.setText(e17 + string);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.pck);
        if (com.tencent.mm.ui.bk.C()) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.pcp);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.pcm);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.chv);
            return;
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.pcp);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.pcm);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setBackgroundResource(com.tencent.mm.R.drawable.chu);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isHandleAutoShowNormalStWcKb() {
        return this.f72456i.o();
    }

    public void j7(int i17, android.content.Intent intent) {
        if (i17 != -1) {
            hideLoading();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "pay success, payMsgId: %s", this.A);
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) intent.getParcelableExtra("key_realname_guide_helper");
        if (realnameGuideHelper != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "do realname guide");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_realname_guide_helper", realnameGuideHelper);
            j45.l.j(this, "wallet_core", ".id_verify.RealnameDialogActivity", intent2, null);
        }
        h61.o.b(this.E);
        setResult(-1);
        finish();
        k61.w wVar = this.H;
        k61.u uVar = wVar.f304522d;
        java.lang.String str = this.A;
        java.lang.String str2 = this.f72469y;
        java.lang.String str3 = this.B;
        uVar.getClass();
        ((km5.q) km5.u.g(str, str2, str3)).n(uVar).h(new com.tencent.mm.plugin.aa.ui.s0(this));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 12L, 1L, false);
        java.lang.String stringExtra = intent.getStringExtra("key_trans_id");
        long j17 = this.D;
        java.lang.String str4 = this.C;
        k61.s sVar = wVar.f304523e;
        sVar.getClass();
        ((km5.q) km5.u.g(java.lang.Long.valueOf(j17), str4, stringExtra)).n(sVar);
    }

    public final void k7() {
        int b17 = i65.a.b(getContext(), 16);
        int b18 = i65.a.b(getContext(), 0);
        int b19 = i65.a.b(getContext(), 0);
        int b27 = i65.a.b(getContext(), 4);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f72468x)) {
            java.lang.String string = !com.tencent.mm.sdk.platformtools.t8.K0(this.F) ? getString(com.tencent.mm.R.string.f489760ax) : getString(com.tencent.mm.R.string.f489759aw);
            com.tencent.mm.wallet_core.ui.r1.w0(this.f72466v, string, 0, string.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.aa.ui.v0(this), true), getContext());
            this.f72466v.setVisibility(0);
            com.tencent.mm.ui.bk.t0(this.f72466v.getPaint());
            this.f72465u.setVisibility(8);
        } else {
            java.lang.String string2 = getString(com.tencent.mm.R.string.hgt);
            java.lang.String string3 = getString(com.tencent.mm.R.string.b9z, this.f72468x, string2);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(this, string3);
            com.tencent.mm.wallet_core.ui.r1.w0(this.f72465u, string3, i17.length() - string2.length(), i17.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.aa.ui.w0(this), true), getContext());
            this.f72465u.setVisibility(0);
            com.tencent.mm.ui.bk.t0(this.f72465u.getPaint());
            this.f72466v.setVisibility(8);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.F)) {
            this.f72464t.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f72463s.getLayoutParams();
            layoutParams.removeRule(3);
            layoutParams.addRule(3, com.tencent.mm.R.id.pco);
            this.f72466v.setPadding(b18, b19, b17, b17);
            this.f72465u.setPadding(b18, b19, b17, b17);
            return;
        }
        this.f72464t.setVisibility(0);
        this.f72464t.setText(this.F);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f72463s.getLayoutParams();
        layoutParams2.removeRule(3);
        layoutParams2.addRule(3, com.tencent.mm.R.id.f482315b4);
        this.f72466v.setPadding(b18, b27, b17, b17);
        this.f72465u.setPadding(b18, b27, b17, b17);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 233) {
            j7(i18, intent);
            return;
        }
        if (i17 == 222 && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "select chatroom：%s", stringExtra);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.aa.ui.LaunchAAUI.class);
            intent2.putExtra("enter_scene", 3);
            intent2.putExtra("chatroom_name", stringExtra);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f72469y = getIntent().getStringExtra("user_name");
        this.f72470z = getIntent().getStringExtra("user_real_name");
        this.E = getIntent().getStringExtra("chatroom");
        this.F = getIntent().getStringExtra("user_group_solitatire_content");
        initView();
        addSceneEndListener(2878);
        this.I = 1;
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2878);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.widget.dialog.l
    public void onDialogDismiss(android.app.Dialog dialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "onDialogDismiss()");
        com.tencent.mm.sdk.platformtools.u3.i(this.f72453J, 300L);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f72456i;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i17, keyEvent)) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "onPause()");
        if (this.f72456i.p()) {
            return;
        }
        this.I = 3;
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "onResume()");
        if (this.I == 3 && isHandleAutoShowNormalStWcKb()) {
            showNormalStWcKb();
        }
        this.I = 2;
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AARemittanceUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(h61.b.class);
    }
}
