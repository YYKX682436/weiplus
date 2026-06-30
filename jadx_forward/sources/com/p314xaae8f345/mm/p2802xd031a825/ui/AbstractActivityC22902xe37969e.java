package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* renamed from: com.tencent.mm.wallet_core.ui.WalletBaseUI */
/* loaded from: classes9.dex */
public abstract class AbstractActivityC22902xe37969e extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements np5.f, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s {

    /* renamed from: CLEAN_UI_DATA_ACTION_CODE_CLEAN_PASSWORD */
    public static final int f39886xb0714ada = 1;

    /* renamed from: CLEAN_UI_DATA_ACTION_CODE_DEFAULT */
    public static final int f39887x37031758 = 0;

    /* renamed from: DIALOG_ID_CONFIRM_FINISH */
    public static final int f39888x1a49b7f = 1000;
    private static final java.lang.String TAG = "MicroMsg.WalletBaseUI";

    /* renamed from: _hellAccFlag_ */
    private byte f39892x7f11beae;

    /* renamed from: backListener */
    private android.view.MenuItem.OnMenuItemClickListener f39893x21c156bb;

    /* renamed from: mClassSimpleName */
    private java.lang.String f39897xb1c336c8;

    /* renamed from: mIsAuthDoing */
    private boolean f39899x45df09f8;

    /* renamed from: mKBLayout */
    protected android.view.View f39900xbab696ce;

    /* renamed from: mKeyboard */
    protected com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 f39901x43041b74;

    /* renamed from: mKindaEnable */
    protected boolean f39902xe856ec83;

    /* renamed from: mProcessEnd */
    private com.p314xaae8f345.mm.p2802xd031a825.g f39908xf55ba039;

    /* renamed from: mProgressDialog */
    private android.app.Dialog f39909x7b659fa2;

    /* renamed from: mTenpayKBStateListener */
    private com.p314xaae8f345.mm.p2802xd031a825.ui.m f39910xa7c89b16;

    /* renamed from: mWcKeyboard */
    protected com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f39912xe2ad5320;

    /* renamed from: nextListener */
    private android.view.MenuItem.OnMenuItemClickListener f39913x121610c7;

    /* renamed from: HARDCODE_TENPAY_KEYBOARD_HEIGHT */
    public static final int f39889xb9d95a72 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 270);

    /* renamed from: mLockSet */
    private static java.util.Set<java.lang.String> f39890xb2489e0a = new java.util.HashSet();

    /* renamed from: mProcess */
    private com.p314xaae8f345.mm.p2802xd031a825.h f39907x8ba5d142 = null;

    /* renamed from: mNetSceneMgr */
    protected np5.b0 f39904x9eeebfc = null;

    /* renamed from: mNetController */
    private np5.g f39903xf4e251ac = null;

    /* renamed from: mCurrentNetScene */
    private com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0 f39898xa248c15b = null;

    /* renamed from: mBundle */
    private android.os.Bundle f39896xfd4b574f = new android.os.Bundle();

    /* renamed from: mPayResultType */
    protected int f39906x53855852 = 0;

    /* renamed from: mTipDialog */
    protected android.app.Dialog f39911xe3cdd3d6 = null;

    /* renamed from: mPayLoopInterruptListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5835xb3e6e063> f39905xe8955fb8 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5835xb3e6e063>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.wallet_core.ui.WalletBaseUI.1
        {
            this.f39173x3fe91575 = 1264607315;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5835xb3e6e063 c5835xb3e6e063) {
            if (1 != c5835xb3e6e063.f136143g.f88014a) {
                return false;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e.this.finish();
            return false;
        }
    };

    /* renamed from: _hasFinish */
    private boolean f39891x803b2a4e = false;

    /* renamed from: isVKBFirstTimeShown */
    protected boolean f39895x123dbf17 = false;

    /* renamed from: callbacks */
    private java.util.LinkedList<com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.u> f39894xc1c7e8ce = new java.util.LinkedList<>();

    /* renamed from: ifAutoReqFocusTarget28 */
    public static boolean m83089xbfd0151d() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_target28_pay_keyboard_focus, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ifAutoReqFocusTarget28() swt:%s", java.lang.Integer.valueOf(Ni));
        return Ni == 1;
    }

    /* renamed from: addSceneEndListener */
    public void m83090x14f40144(int i17) {
        this.f39904x9eeebfc.c(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: addTextOptionMenu */
    public void mo78491xd9193382(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39913x121610c7 = onMenuItemClickListener;
        super.mo78491xd9193382(i17, str, onMenuItemClickListener);
    }

    /* renamed from: cancelNetScene */
    public void m83092xd92c7189(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.app.Dialog dialog;
        np5.b0 b0Var = this.f39904x9eeebfc;
        b0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletNetSceneMgr", "cancel scene: %s %s", b0Var, m1Var);
        gm0.j1.i();
        gm0.j1.n().f354821b.d(m1Var);
        java.util.HashSet hashSet = b0Var.f420354g;
        hashSet.remove(m1Var);
        java.util.HashSet hashSet2 = b0Var.f420353f;
        hashSet2.remove(m1Var);
        b0Var.f420355h.remove(m1Var);
        if (hashSet.isEmpty() && hashSet2.isEmpty() && (dialog = b0Var.f420356i) != null && dialog.isShowing()) {
            b0Var.f420356i.dismiss();
        }
    }

    /* renamed from: cancelQRPay */
    public void m83093xa17dbc8d() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().getParcelable("key_pay_info");
        if (c19760x34448d56 == null) {
            c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) getIntent().getParcelableExtra("key_pay_info");
        }
        if (c19760x34448d56 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19760x34448d56.f273648n)) {
            return;
        }
        this.f39904x9eeebfc.d(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q0(c19760x34448d56.f273648n, c19760x34448d56.f273647m), true);
        c19760x34448d56.f273648n = null;
    }

    /* renamed from: checkProcLife */
    public boolean mo66577x53f7ec9a() {
        return true;
    }

    /* renamed from: cleanScenes */
    public void m83094xccf10110() {
        this.f39904x9eeebfc.f();
    }

    /* renamed from: cleanUiData */
    public void mo65144xd0a01007(int i17) {
    }

    /* renamed from: clearErr */
    public void m83095x2f1a9bd8() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.v1.f295775a = 0;
        com.p314xaae8f345.mm.p2802xd031a825.ui.v1.f295776b = 0;
        com.p314xaae8f345.mm.p2802xd031a825.ui.v1.f295777c = null;
    }

    /* renamed from: doSceneForceProgress */
    public void m83096xe7b1ccf7(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m83100x5406100e(m1Var, true, false);
    }

    /* renamed from: doSceneProgress */
    public void m83099x5406100e(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        m83100x5406100e(m1Var, z17, false);
    }

    /* renamed from: doSceneProgressWithVerify */
    public void m83102xf150ab8d(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = m83108x2b5a5a39();
        if (m83108x2b5a5a39 != null) {
            this.f39904x9eeebfc.f420359o = m83108x2b5a5a39.f295334c;
        }
        this.f39904x9eeebfc.e(m1Var, true, 3, 0);
    }

    /* renamed from: doSceneSafeProgress */
    public void m83103x148c7e3b(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m83100x5406100e(m1Var, true, true);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        mo48627xce38d9a();
        mo48632xd46dd964();
        mo73823x964575a5();
        this.f39891x803b2a4e = true;
    }

    /* renamed from: forceCancel */
    public void mo73851xc8398945() {
        this.f39904x9eeebfc.f();
        finish();
    }

    /* renamed from: getCancelable */
    public boolean mo73849x5ed8aeca() {
        return true;
    }

    /* renamed from: getContentViewVisibility */
    public int m83104x209a3aba() {
        return m78513xc2a54588().getVisibility();
    }

    /* renamed from: getInput */
    public android.os.Bundle m83105x7498fe14() {
        return this.f39896xfd4b574f;
    }

    /* renamed from: getNetController */
    public np5.g m83106x57340563() {
        if (this.f39903xf4e251ac == null) {
            com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = m83108x2b5a5a39();
            if (m83108x2b5a5a39 != null) {
                this.f39903xf4e251ac = m83108x2b5a5a39.p(this, this.f39904x9eeebfc);
            }
            if (this.f39903xf4e251ac == null) {
                this.f39903xf4e251ac = new com.p314xaae8f345.mm.p2802xd031a825.ui.g0(this, this, this.f39904x9eeebfc);
            }
        }
        return this.f39903xf4e251ac;
    }

    /* renamed from: getPayReqKey */
    public java.lang.String m83107xcc3330f3() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56;
        android.os.Bundle bundle = this.f39896xfd4b574f;
        return (bundle == null || (c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) bundle.getParcelable("key_pay_info")) == null) ? "" : c19760x34448d56.f273647m;
    }

    /* renamed from: getProcess */
    public com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39() {
        if (this.f39907x8ba5d142 == null) {
            this.f39907x8ba5d142 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
        }
        return this.f39907x8ba5d142;
    }

    /* renamed from: getReportUIC */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p2802xd031a825.ui.c0> mo73821xea5de7c5() {
        return com.p314xaae8f345.mm.p2802xd031a825.ui.c0.class;
    }

    /* renamed from: getSubTitle */
    public java.lang.String m83109xff46996e() {
        return "";
    }

    /* renamed from: getTips */
    public java.lang.CharSequence m83110xfb85bbae(int i17) {
        np5.g gVar = this.f39903xf4e251ac;
        if (gVar == null) {
            return null;
        }
        return gVar.a(i17);
    }

    /* renamed from: handleKeyboardTouchEvent */
    public void m83111x7c491e2a(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || this.f39912xe2ad5320.r()) {
            return;
        }
        m83133x1e3567d1();
    }

    /* renamed from: hasFinish */
    public boolean m83112xd8fa2fcd() {
        return this.f39891x803b2a4e;
    }

    /* renamed from: hideKeyboardPushDownBtn */
    public void m83113x77af3ad7() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f78325xd41a9ed3);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = findViewById(com.p3249xcbb51f6b.R.id.f62748x33428a22);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: hideLoading */
    public void mo48627xce38d9a() {
        android.app.Dialog dialog = this.f39911xe3cdd3d6;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f39911xe3cdd3d6.dismiss();
        this.f39911xe3cdd3d6 = null;
    }

    /* renamed from: hideProgress */
    public void m83114xe5d7a18f() {
        android.app.Dialog dialog = this.f39909x7b659fa2;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: hideTenpayKB */
    public void mo48632xd46dd964() {
        android.view.View view = this.f39900xbab696ce;
        if (view == null || !view.isShown()) {
            return;
        }
        android.view.View view2 = this.f39900xbab696ce;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar = this.f39910xa7c89b16;
        if (mVar != null) {
            mVar.mo26891xca4e600e(false);
        }
    }

    /* renamed from: hideWcKb */
    public void mo73823x964575a5() {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f39912xe2ad5320;
        if (c22894x55bf3223 != null) {
            c22894x55bf3223.i();
            com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar = this.f39910xa7c89b16;
            if (mVar != null) {
                mVar.mo26891xca4e600e(false);
            }
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.c0) m80391xac8f1cfd(mo73821xea5de7c5())).T6(2);
        }
    }

    /* renamed from: isAuthDoing */
    public boolean m83115x9bd1f8a5() {
        return this.f39899x45df09f8;
    }

    /* renamed from: isHandleAutoShowNormalStWcKb */
    public boolean mo48628x7c5cc589() {
        return false;
    }

    /* renamed from: isProcessing */
    public boolean m83116x9a952bdd() {
        return this.f39904x9eeebfc.g();
    }

    /* renamed from: isTransparent */
    public boolean mo63463x4510f9c8() {
        return mo43051x2ee31f5b() <= 0 || this.f39904x9eeebfc.g();
    }

    /* renamed from: keepProcessEnd */
    public void m83117x3e84cd51(com.p314xaae8f345.mm.p2802xd031a825.g gVar) {
        this.f39908xf55ba039 = gVar;
    }

    /* renamed from: lockPage */
    public boolean m83118x71cc0e5a() {
        java.lang.String simpleName = getClass().getSimpleName();
        if (!f39890xb2489e0a.contains(simpleName)) {
            return f39890xb2489e0a.add(simpleName);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "has contain lock key: %s", simpleName);
        finish();
        return false;
    }

    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return false;
    }

    /* renamed from: needExecuteBackListener */
    public boolean mo48644xb863f65a() {
        return true;
    }

    /* renamed from: needLockPage */
    public boolean mo68404xcdeb0510() {
        return false;
    }

    /* renamed from: next */
    public void mo73812x338af3() {
        m83108x2b5a5a39().o(this, 0, m83105x7498fe14());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        m83106x57340563().b(i17, i18, intent);
        java.util.Iterator it = ((java.util.List) this.f39894xc1c7e8ce.clone()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n0) ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.u) it.next())).f295483a;
            p0Var.f295505k.mo48814x2efc64();
            p0Var.f295506l.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (mo68404xcdeb0510()) {
            m83118x71cc0e5a();
        }
        mo66579x11aba77f();
        if (mo48648xabe27cf2()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).Ai();
            cu5.b.b();
        }
        super.onCreate(bundle);
        mo66578x399050cf();
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "hy: account not ready. finish now");
            db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575012ke0), "", false, new com.p314xaae8f345.mm.p2802xd031a825.ui.m0(this));
        }
        np5.b0 b0Var = new np5.b0(this, this);
        this.f39904x9eeebfc = b0Var;
        b0Var.c(385);
        this.f39904x9eeebfc.c(1518);
        this.f39905xe8955fb8.mo48813x58998cd();
        getIntent().getIntExtra("process_id", 0);
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
        if (g17 != null) {
            this.f39904x9eeebfc.f420358n = g17.e();
            g17.b(this);
        }
        java.util.Objects.toString(g17);
        android.os.Bundle e17 = com.p314xaae8f345.mm.p2802xd031a825.a.e(this);
        this.f39896xfd4b574f = e17;
        if (e17 == null) {
            this.f39896xfd4b574f = new android.os.Bundle();
        }
        this.f39904x9eeebfc.f420359o = this.f39896xfd4b574f;
        if (mo66577x53f7ec9a()) {
            if (!(com.p314xaae8f345.mm.p2802xd031a825.a.g(this) != null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Activity extends WalletBaseUI but not in process!!!");
            }
        }
        if (mo43051x2ee31f5b() > 0) {
            java.lang.String m83109xff46996e = m83109xff46996e();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83109xff46996e)) {
                mo54449x3f86539a(m83109xff46996e);
            }
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p2802xd031a825.ui.n0(this));
        np5.g m83106x57340563 = m83106x57340563();
        this.f39903xf4e251ac = m83106x57340563;
        if (m83106x57340563 != null && m83106x57340563.c(new java.lang.Object[0])) {
            mo67598xf0aced2e(4);
        } else if (mo43051x2ee31f5b() <= 0) {
            mo67598xf0aced2e(4);
        } else if (mo63463x4510f9c8()) {
            mo67598xf0aced2e(4);
        } else {
            mo67598xf0aced2e(0);
        }
        java.util.Iterator it = ((java.util.List) this.f39894xc1c7e8ce.clone()).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.u) it.next()).getClass();
        }
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        this.f39902xe856ec83 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "old id: %s, new id: %s", (java.lang.String) wo.p.a().f529305a.get(256), wo.w0.k());
        java.lang.String simpleName = getClass().getSimpleName();
        this.f39897xb1c336c8 = simpleName;
        com.p314xaae8f345.mm.p2802xd031a825.ui.b0.c(simpleName);
    }

    @Override // android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onCreateDialog id = %s, this.hascode = %x", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(hashCode()));
        if (i17 != 1000) {
            return super.onCreateDialog(i17);
        }
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
        int q17 = g17 != null ? g17.q(this, 1) : -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[onCreateDialog] tipsId : %s", java.lang.Integer.valueOf(q17));
        if (q17 != -1) {
            return db5.e1.K(this, true, getString(q17), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx), new com.p314xaae8f345.mm.p2802xd031a825.ui.o0(this), new com.p314xaae8f345.mm.p2802xd031a825.ui.p0(this));
        }
        if (g17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[onCreateDialog] pro.end");
            g17.f(this, m83105x7498fe14());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[onCreateDialog] finish");
            this.f39906x53855852 = 4;
            finish();
        }
        return super.onCreateDialog(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f39904x9eeebfc.i(385);
        this.f39904x9eeebfc.i(1518);
        this.f39905xe8955fb8.mo48814x2efc64();
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = m83108x2b5a5a39();
        if (m83108x2b5a5a39 != null) {
            m83108x2b5a5a39.y(this);
        }
        m83141xccc473f3();
        java.util.Iterator it = ((java.util.List) this.f39894xc1c7e8ce.clone()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n0) ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.u) it.next())).f295483a;
            p0Var.f295505k.mo48814x2efc64();
            p0Var.f295506l.mo48814x2efc64();
        }
        this.f39894xc1c7e8ce.clear();
        m83117x3e84cd51(null);
        com.p314xaae8f345.mm.p2802xd031a825.ui.b0.d(getClass().getSimpleName());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            android.view.View view = this.f39900xbab696ce;
            if (view != null && view.isShown()) {
                mo48632xd46dd964();
                return true;
            }
            if (mo73847x7d641a7d()) {
                mo48674x36654fab();
                showDialog(1000);
                return true;
            }
            if (this.f39893x21c156bb != null && mo48644xb863f65a()) {
                this.f39893x21c156bb.onMenuItemClick(new db5.h4(mo55332x76847179(), 0, 0));
                return true;
            }
            android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f39913x121610c7;
            if (onMenuItemClickListener != null) {
                onMenuItemClickListener.onMenuItemClick(new db5.h4(mo55332x76847179(), 0, 0));
                return true;
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (!intent.getBooleanExtra("key_process_is_end", false) || intent.getBooleanExtra("key_process_is_stay", true)) {
            return;
        }
        setIntent(intent);
        android.os.Bundle extras = getIntent().getExtras();
        int i17 = (extras == null || !extras.containsKey("key_process_result_code")) ? 0 : extras.getInt("key_process_result_code", 0);
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "process end ok!");
            setResult(-1, getIntent());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "process end with user cancel or err! resultCode : " + i17);
            setResult(0, getIntent());
        }
        if (intent.getBooleanExtra("key_should_contain_activity_when_on_new_intent", false)) {
            return;
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* renamed from: onPreSceneEnd */
    public boolean mo73852x5df1e913(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return true;
    }

    /* renamed from: onProgressFinish */
    public boolean mo63464xa6efccdf() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.m121588x764fefd8(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.B());
        if (!com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "VoiceOverUsingReport, voiceover disable.");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29123, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "VoiceOverUsingReport, voiceover enable report.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo66167x76e0bfae(int r19, int r20, java.lang.String r21, com.p314xaae8f345.mm.p944x882e457a.m1 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e.mo66167x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1, boolean):void");
    }

    /* renamed from: onSceneEnd */
    public abstract boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onSwipeBackFinish */
    public boolean mo48654xe4dc1f55() {
        mo73823x964575a5();
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f39893x21c156bb;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(new db5.h4(mo55332x76847179(), 0, 0));
            return true;
        }
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener2 = this.f39913x121610c7;
        if (onMenuItemClickListener2 == null) {
            return super.mo48654xe4dc1f55();
        }
        onMenuItemClickListener2.onMenuItemClick(new db5.h4(mo55332x76847179(), 0, 0));
        return true;
    }

    /* renamed from: regeistQueryOrder */
    public void m83120x5a0f3cdf(int i17, np5.c cVar) {
        np5.b0 b0Var = this.f39904x9eeebfc;
        b0Var.getClass();
        cVar.f420364e = i17;
        cVar.f420363d = b0Var;
        b0Var.f420362r.put(java.lang.Integer.valueOf(i17), cVar);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s
    /* renamed from: register */
    public void mo66168xd6dc2ea3(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.u uVar) {
        if (this.f39894xc1c7e8ce.contains(uVar)) {
            return;
        }
        this.f39894xc1c7e8ce.add(uVar);
    }

    /* renamed from: removeSceneEndListener */
    public void m83121xf6ff5b27(int i17) {
        this.f39904x9eeebfc.i(i17);
    }

    /* renamed from: resend */
    public boolean m83122xc84d8c3b(boolean z17) {
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0 z0Var = this.f39898xa248c15b;
        if (z0Var == null) {
            return false;
        }
        if (!z0Var.mo8969xc84d8c3b() && !z17) {
            return false;
        }
        this.f39904x9eeebfc.a(this.f39898xa248c15b, true);
        return true;
    }

    /* renamed from: scrollToFormEditPosAfterShowTenPay */
    public void m83123x97a0486(android.view.View view, android.view.View view2, int i17) {
        if (view != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int k17 = (i65.a.k(this) - (iArr[1] + view2.getHeight())) - i65.a.b(this, i17);
            int i18 = f39889xb9d95a72;
            if (k17 <= 0 || k17 >= i18) {
                return;
            }
            view.post(new com.p314xaae8f345.mm.p2802xd031a825.ui.j0(this, view, i18 - k17));
        }
    }

    /* renamed from: setAuthState */
    public void m83124xb22b7187(boolean z17) {
        h45.f0 f0Var;
        this.f39899x45df09f8 = z17;
        synchronized (h45.f0.class) {
            f0Var = h45.e0.f360475a;
        }
        f0Var.f360477a.put("key_pay_offline_is_auth_doing", java.lang.Boolean.valueOf(z17));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setBackBtn */
    public void mo54448x9c8c0d33(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39893x21c156bb = onMenuItemClickListener;
        super.mo54448x9c8c0d33(onMenuItemClickListener);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setContentViewVisibility */
    public void mo67598xf0aced2e(int i17) {
        super.mo67598xf0aced2e(i17);
    }

    /* renamed from: setEditFocusListener */
    public void m83125x8f91b80(android.view.View view, int i17, boolean z17) {
        mo48633x8f91b80(view, i17, z17, true);
    }

    /* renamed from: setKBMode */
    public void m83128x12a99e7c(int i17) {
        this.f39901x43041b74.m121476x53eb72f9(i17);
    }

    /* renamed from: setStatusColor */
    public void mo66578x399050cf() {
        mo64405x4dab7448(mo78508x85b50c3c());
    }

    /* renamed from: setTenpayKBStateListener */
    public void m83129xcfb55a41(com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar) {
        this.f39910xa7c89b16 = mVar;
    }

    /* renamed from: setWPKeyboard */
    public void m83130x21cc23c2(android.widget.EditText editText, boolean z17, boolean z18) {
        if (this.f39912xe2ad5320 == null) {
            this.f39912xe2ad5320 = (com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) findViewById(com.p314xaae8f345.mm.R.id.pok);
        }
        if (this.f39912xe2ad5320 == null || editText == null) {
            return;
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = z18 ? editText.getOnFocusChangeListener() : null;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.s0(this, z17, editText, onFocusChangeListener));
        if (fp.h.c(28) && z17) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (m83089xbfd0151d()) {
                editText.post(new com.p314xaae8f345.mm.p2802xd031a825.ui.t0(this, editText));
            }
        }
        editText.setOnClickListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.u0(this));
    }

    /* renamed from: setWcKbHeightListener */
    public void m83131x28a5f720(mp5.v vVar) {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f39912xe2ad5320;
        if (c22894x55bf3223 != null) {
            c22894x55bf3223.m82980x6329d7fd(vVar);
        }
    }

    /* renamed from: setmPayResultType */
    public void m83132x45ccc134(int i17) {
        this.f39906x53855852 = i17;
    }

    /* renamed from: shouldEnsureSoterConnection */
    public boolean mo48648xabe27cf2() {
        return false;
    }

    /* renamed from: shouldFixStatusBar */
    public void mo66579x11aba77f() {
    }

    /* renamed from: showCircleStWcKb */
    public void m83133x1e3567d1() {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f39912xe2ad5320;
        if (c22894x55bf3223 != null) {
            c22894x55bf3223.v();
            com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar = this.f39910xa7c89b16;
            if (mVar != null) {
                mVar.mo26891xca4e600e(true);
            }
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.c0) m80391xac8f1cfd(mo73821xea5de7c5())).U6(2);
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.c0) m80391xac8f1cfd(mo73821xea5de7c5())).T6(1);
        }
    }

    /* renamed from: showLoading */
    public void m83134x2b33b77f(boolean z17) {
        android.app.Dialog dialog = this.f39911xe3cdd3d6;
        if (dialog != null) {
            dialog.show();
            return;
        }
        if (z17) {
            this.f39911xe3cdd3d6 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.i(mo55332x76847179(), false, false, new com.p314xaae8f345.mm.p2802xd031a825.ui.k0(this));
        } else {
            this.f39911xe3cdd3d6 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(mo55332x76847179(), true, false, null);
        }
        android.app.Dialog dialog2 = this.f39911xe3cdd3d6;
        if (dialog2 != null) {
            dialog2.setCancelable(true);
        }
    }

    /* renamed from: showNetErrorDialog */
    public void m83135x118607f0(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
        }
        db5.e1.E(this, str, null, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, new com.p314xaae8f345.mm.p2802xd031a825.ui.l0(this, z17));
    }

    /* renamed from: showNormalStWcKb */
    public void m83136xb67ebaa8() {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f39912xe2ad5320;
        if (c22894x55bf3223 != null) {
            c22894x55bf3223.u();
            com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar = this.f39910xa7c89b16;
            if (mVar != null) {
                mVar.mo26891xca4e600e(true);
            }
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.c0) m80391xac8f1cfd(mo73821xea5de7c5())).U6(1);
        }
    }

    /* renamed from: showProgress */
    public void m83137x918cb44a() {
        android.app.Dialog dialog = this.f39909x7b659fa2;
        if (dialog == null || !(dialog == null || dialog.isShowing())) {
            android.app.Dialog dialog2 = this.f39909x7b659fa2;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f39909x7b659fa2 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(this, false, false, new com.p314xaae8f345.mm.p2802xd031a825.ui.i0(this));
        }
    }

    /* renamed from: showSafeProgress */
    public void m83138x296ea477() {
        android.app.Dialog dialog = this.f39909x7b659fa2;
        if (dialog == null || !(dialog == null || dialog.isShowing())) {
            android.app.Dialog dialog2 = this.f39909x7b659fa2;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f39909x7b659fa2 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(this, false, new com.p314xaae8f345.mm.p2802xd031a825.ui.h0(this));
        }
    }

    /* renamed from: showTenpayKB */
    public void m83139x8022ec1f() {
        android.view.View view = this.f39900xbab696ce;
        if (view == null || view.isShown()) {
            return;
        }
        android.view.View view2 = this.f39900xbab696ce;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/wallet_core/ui/WalletBaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/wallet_core/ui/WalletBaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar = this.f39910xa7c89b16;
        if (mVar != null) {
            mVar.mo26891xca4e600e(true);
        }
    }

    /* renamed from: showWcKb */
    public void m83140xebcf1de0() {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f39912xe2ad5320;
        if (c22894x55bf3223 == null || c22894x55bf3223.isShown()) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf32232 = this.f39912xe2ad5320;
        c22894x55bf32232.g(true);
        c22894x55bf32232.setVisibility(0);
        c22894x55bf32232.f295352w.setVisibility(4);
        c22894x55bf32232.f295352w.post(new mp5.g(c22894x55bf32232, true));
        com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar = this.f39910xa7c89b16;
        if (mVar != null) {
            mVar.mo26891xca4e600e(true);
        }
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.c0) m80391xac8f1cfd(mo73821xea5de7c5())).U6(1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(mo73821xea5de7c5());
    }

    /* renamed from: unlockPage */
    public void m83141xccc473f3() {
        f39890xb2489e0a.remove(getClass().getSimpleName());
    }

    /* renamed from: unregister */
    public void m83142x31d4943c(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.u uVar) {
        if (this.f39894xc1c7e8ce.contains(uVar)) {
            this.f39894xc1c7e8ce.remove(uVar);
        }
    }

    /* renamed from: doSceneForceProgress */
    public void m83097xe7b1ccf7(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17) {
        m83101x5406100e(m1Var, true, false, i17);
    }

    /* renamed from: doSceneProgress */
    public void m83100x5406100e(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17, boolean z18) {
        m83101x5406100e(m1Var, z17, z18, 0);
    }

    /* renamed from: setEditFocusListener */
    public void mo48633x8f91b80(android.view.View view, int i17, boolean z17, boolean z18) {
        m83126x8f91b80(view, i17, z17, true, z18);
    }

    /* renamed from: addTextOptionMenu */
    public void m83091xd9193382(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, com.p314xaae8f345.mm.ui.fb fbVar) {
        this.f39913x121610c7 = onMenuItemClickListener;
        super.m78494xd9193382(i17, str, onMenuItemClickListener, null, fbVar);
    }

    /* renamed from: doSceneProgress */
    public void m83098x5406100e(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m83100x5406100e(m1Var, true, true);
    }

    /* renamed from: next */
    public void m83119x338af3(android.os.Bundle bundle) {
        m83108x2b5a5a39().o(this, 0, bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setBackBtn */
    public void mo74406x9c8c0d33(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i17) {
        this.f39893x21c156bb = onMenuItemClickListener;
        super.mo74406x9c8c0d33(onMenuItemClickListener, i17);
    }

    /* renamed from: setEditFocusListener */
    public void m83126x8f91b80(android.view.View view, int i17, boolean z17, boolean z18, boolean z19) {
        m83127x8f91b80(view, null, i17, z17, z18, z19);
    }

    /* renamed from: doSceneProgress */
    public void m83101x5406100e(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17, boolean z18, int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = m83108x2b5a5a39();
        if (m83108x2b5a5a39 != null) {
            this.f39904x9eeebfc.f420359o = m83108x2b5a5a39.f295334c;
        }
        this.f39904x9eeebfc.e(m1Var, z17, !z18 ? 2 : 1, i17);
    }

    /* renamed from: setEditFocusListener */
    public void m83127x8f91b80(android.view.View view, android.widget.EditText editText, int i17, boolean z17, boolean z18, boolean z19) {
        this.f39901x43041b74 = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) findViewById(com.p314xaae8f345.mm.R.id.f78324xe9b380d4);
        this.f39900xbab696ce = findViewById(com.p314xaae8f345.mm.R.id.o1v);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f78325xd41a9ed3);
        if (editText == null) {
            editText = (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.pbn);
        }
        if (this.f39901x43041b74 == null || editText == null || this.f39900xbab696ce == null) {
            return;
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = z19 ? editText.getOnFocusChangeListener() : null;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.x0(this, z17, view, editText, i17, onFocusChangeListener));
        editText.setOnClickListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.d0(this, z17, i17, editText));
        if (fp.h.c(28) && z18) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (m83089xbfd0151d()) {
                editText.post(new com.p314xaae8f345.mm.p2802xd031a825.ui.e0(this, editText));
            }
        }
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.f0(this));
    }

    /* renamed from: showLoading */
    public void mo73913x2b33b77f() {
        m83134x2b33b77f(true);
    }
}
