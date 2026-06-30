package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.MMFragment */
/* loaded from: classes14.dex */
public abstract class AbstractViewOnAttachStateChangeListenerC21400xb429b010 extends com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930 implements ih5.d, android.view.View.OnAttachStateChangeListener {

    /* renamed from: DEFAULT_TOAST_TIME */
    protected static final int f39339xc9616e3 = 3000;

    /* renamed from: FLAG_OVERRIDE_ENTER_ANIMATION */
    public static final java.lang.String f39340x6d0059d = "MMActivity.OverrideEnterAnimation";

    /* renamed from: FLAG_OVERRIDE_EXIT_ANIMATION */
    public static final java.lang.String f39341x2b3dd283 = "MMActivity.OverrideExitAnimation";
    private static final java.lang.String TAG = "MicroMsg.MMFragment";

    /* renamed from: TAG2 */
    private static final java.lang.String f39342x272bf8 = "MicroMsg.INIT";

    /* renamed from: bounceEnable */
    private boolean f39343x6307022b;

    /* renamed from: className */
    java.lang.String f39344xff691c23;

    /* renamed from: mController */
    protected com.p314xaae8f345.mm.ui.ga f39345x2305be9;

    /* renamed from: mCurVisible */
    private boolean f39346xd92ff65f;

    /* renamed from: mListener */
    private ih5.d f39347x753a6c41;

    /* renamed from: mParent */
    protected p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f39348x14172f77;

    /* renamed from: mParentFragment */
    private com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 f39349x2ac50ee7;

    /* renamed from: mParentVisible */
    private boolean f39350x93fc54fb;

    /* renamed from: mSwipeBackLayout */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab f39351x13746d9e;

    public AbstractViewOnAttachStateChangeListenerC21400xb429b010() {
        this.f39345x2305be9 = new com.p314xaae8f345.mm.ui.rc(this);
        this.f39343x6307022b = true;
        this.f39350x93fc54fb = false;
        this.f39346xd92ff65f = false;
    }

    /* renamed from: initLanguage */
    public static java.util.Locale m78619x26f04c88(android.content.Context context) {
        return com.p314xaae8f345.mm.ui.ga.Q(context);
    }

    /* renamed from: activateBroadcast */
    public void m78621xf16d150e(boolean z17) {
        this.f39345x2305be9.e(z17);
    }

    /* renamed from: addDialog */
    public void m78622xe5d1a549(android.app.Dialog dialog) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        if (dialog == null) {
            gaVar.getClass();
            return;
        }
        if (gaVar.F == null) {
            gaVar.F = new java.util.ArrayList();
        }
        gaVar.F.add(dialog);
    }

    /* renamed from: addIconOptionMenu */
    public void m78627x84f07bce(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39345x2305be9.i(i17, i18, "", false, onMenuItemClickListener, null, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    /* renamed from: addSearchMenu */
    public void m78632xd6d59aa8(boolean z17, com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var) {
        this.f39345x2305be9.j(z17, c9Var);
    }

    /* renamed from: addTextOptionMenu */
    public void m78633xd9193382(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39345x2305be9.i(i17, 0, str, false, onMenuItemClickListener, null, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    /* renamed from: callBackMenu */
    public boolean m78636x82776364() {
        return this.f39345x2305be9.k();
    }

    /* renamed from: dealContentView */
    public void mo26076x2105eeb2(android.view.View view) {
    }

    /* renamed from: enableBackMenu */
    public void m78637x92e71989(boolean z17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        com.p314xaae8f345.mm.ui.eb ebVar = gaVar.C;
        if (ebVar == null || ebVar.f289913f == z17) {
            return;
        }
        ebVar.f289913f = z17;
        gaVar.N0();
    }

    /* renamed from: enableOptionMenu */
    public void m78639x43e00957(boolean z17) {
        this.f39345x2305be9.p(true, -1, z17);
    }

    /* renamed from: findMenuInfo */
    public com.p314xaae8f345.mm.ui.eb m78640xe4b7b786(int i17) {
        return this.f39345x2305be9.E(i17);
    }

    /* renamed from: finish */
    public void mo78641xb4098c93() {
        if (this.f39298x5262fd1e) {
            if (mo78409x676b27cd() != null) {
                mo78409x676b27cd().finish();
            }
        } else if (mo78409x676b27cd() != null) {
            mo78409x676b27cd().mo7595x9cdc264().m7702x93613e90();
        }
        int intExtra = mo78409x676b27cd().getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", -1);
        int intExtra2 = mo78409x676b27cd().getIntent().getIntExtra("MMActivity.OverrideExitAnimation", -1);
        if (intExtra != -1) {
            mo7438x76847179().overridePendingTransition(intExtra, intExtra2);
        }
    }

    /* renamed from: fullScreenNoTitleBar */
    public void m78642x1ef531b7(boolean z17) {
        this.f39345x2305be9.t(z17);
    }

    /* renamed from: fullScreenWithTitleBar */
    public void m78643x744d5cfc(boolean z17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        if (z17) {
            gaVar.f290203t.getWindow().setFlags(1024, 1024);
        } else {
            gaVar.f290203t.getWindow().clearFlags(1024);
        }
    }

    /* renamed from: getBodyView */
    public android.view.View m78644xe15784dd() {
        return this.f39345x2305be9.f290167b;
    }

    /* renamed from: getBounceView */
    public ul5.k m78645x9f88d943() {
        return this.f39345x2305be9.f290207v;
    }

    /* renamed from: getContentView */
    public final android.view.View m78646xc2a54588() {
        return this.f39345x2305be9.w();
    }

    /* renamed from: getController */
    public com.p314xaae8f345.mm.ui.ga m78647x143f1b92() {
        return this.f39345x2305be9;
    }

    /* renamed from: getCustomBounceId */
    public int mo78648xc86d394a() {
        return -1;
    }

    /* renamed from: getForceOrientation */
    public int mo54830x663c095b() {
        return this.f39345x2305be9.A();
    }

    /* renamed from: getIdentityString */
    public s75.b mo78649xe9868365() {
        return new s75.b("");
    }

    /* renamed from: getLandscapeMode */
    public boolean m78650x44cc8748() {
        return this.f39345x2305be9.f290209x;
    }

    /* renamed from: getLayoutId */
    public abstract int getF153758d();

    /* renamed from: getLayoutView */
    public android.view.View mo78651x29ebce5() {
        return null;
    }

    /* renamed from: getMMResources */
    public android.content.res.Resources m78652xba8c474f() {
        return mo78409x676b27cd().getResources();
    }

    /* renamed from: getMMString */
    public java.lang.String m78653x34347727(int i17) {
        return mo78409x676b27cd().getString(i17);
    }

    /* renamed from: getMMTitle */
    public java.lang.CharSequence m78655x4c0ad082() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        p012xc85e97e9.p016x746ad0e3.app.b bVar = gaVar.G;
        if (bVar == null) {
            return null;
        }
        java.lang.String str = gaVar.f290185k;
        return str != null ? str : bVar.n();
    }

    /* renamed from: getStreamMaxVolume */
    public int m78656xa1b0efc8(int i17) {
        return this.f39345x2305be9.f290181i.getStreamMaxVolume(i17);
    }

    /* renamed from: getStreamVolume */
    public int m78657x107e1530(int i17) {
        return this.f39345x2305be9.f290181i.getStreamVolume(i17);
    }

    /* renamed from: getSwipeBackLayout */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78658x28280f95() {
        return this.f39351x13746d9e;
    }

    /* renamed from: getTitleLocation */
    public int m78659x73620a77() {
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f39345x2305be9.G;
        if (bVar == null) {
            return 0;
        }
        return bVar.l();
    }

    /* renamed from: hideTitleView */
    public void m78660x8f8cf1fb() {
        this.f39345x2305be9.J();
    }

    /* renamed from: hideVKB */
    public boolean mo78661x36654fab() {
        return this.f39345x2305be9.K();
    }

    /* renamed from: interceptSupportInvalidateOptionsMenu */
    public boolean m78663xee30fa35() {
        if (!this.f39345x2305be9.S()) {
            return false;
        }
        this.f39345x2305be9.N0();
        return true;
    }

    /* renamed from: isActionbarMenuUseOriginalSys */
    public boolean m78664xb498afe7() {
        return false;
    }

    /* renamed from: isFragmentVisible */
    public boolean m78665x15e8dd78() {
        return this.f39346xd92ff65f;
    }

    /* renamed from: isLayoutInDecorView */
    public boolean m78666xfd09f471() {
        return false;
    }

    /* renamed from: isScreenEnable */
    public boolean m78667x564fc359() {
        return this.f39345x2305be9.f290183j;
    }

    /* renamed from: isSupportCustomActionBar */
    public boolean mo26090x345d1387() {
        return m78668x4e2d2008();
    }

    /* renamed from: isSupportNavigationSwipeBack */
    public final boolean m78668x4e2d2008() {
        if (db5.f.g() && ep.a.a()) {
            return mo25471x430f73e();
        }
        return false;
    }

    /* renamed from: isTitleShowing */
    public boolean m78669x79591497() {
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f39345x2305be9.G;
        if (bVar == null) {
            return false;
        }
        return bVar.q();
    }

    public final void j0(boolean z17, boolean z18) {
        if (z17 == this.f39346xd92ff65f) {
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f39349x2ac50ee7;
        boolean m78665x15e8dd78 = abstractViewOnAttachStateChangeListenerC21400xb429b010 == null ? this.f39350x93fc54fb : abstractViewOnAttachStateChangeListenerC21400xb429b010.m78665x15e8dd78();
        boolean m7493xf94337e8 = super.m7493xf94337e8();
        boolean mo7473x5e448b18 = mo7473x5e448b18();
        boolean z19 = m78665x15e8dd78 && m7493xf94337e8 && mo7473x5e448b18 && !z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[filterAndNotifyVisibility] visible = %s parent = %s, super = %s, hint = %s name:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(m78665x15e8dd78), java.lang.Boolean.valueOf(m7493xf94337e8), java.lang.Boolean.valueOf(mo7473x5e448b18), getClass().getName());
        if (z19 != this.f39346xd92ff65f) {
            this.f39346xd92ff65f = z19;
            mo54831x93512b23(z19);
        }
    }

    /* renamed from: keyboardState */
    public int m78670x8200b8ea() {
        return this.f39345x2305be9.f290188l0;
    }

    /* renamed from: needShowIdcError */
    public boolean m78671x712cd213() {
        return true;
    }

    /* renamed from: noActionBar */
    public boolean mo48374x69604d3c() {
        return false;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        super.mo7397x3b13c504(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onAttach");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210 = m7453x12a9d210();
        if (m7453x12a9d210 != null && (m7453x12a9d210 instanceof com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010)) {
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) m7453x12a9d210;
            this.f39349x2ac50ee7 = abstractViewOnAttachStateChangeListenerC21400xb429b010;
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78697x5913ff35(this);
        }
        j0(true, false);
    }

    /* renamed from: onCancelDrag */
    public void mo78672x37a8620d() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        this.f39345x2305be9.e0(mo78409x676b27cd().getBaseContext(), (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo78409x676b27cd());
        this.f39345x2305be9.E0(mo78409x676b27cd().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        boolean z17 = this.f39343x6307022b;
        gaVar.f290208w = z17;
        ul5.k kVar = gaVar.f290207v;
        if (kVar != null) {
            kVar.mo82163x4e0f6657(z17);
        }
    }

    /* renamed from: onCreateBeforeSetContentView */
    public void m78673x6c4bab6() {
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateOptionsMenu */
    public void mo7502xa71d2e62(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (this.f39345x2305be9.g0(menu)) {
            return;
        }
        super.mo7502xa71d2e62(menu, menuInflater);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onCreateView");
        m7568x9c2f1725(true);
        android.view.View m78646xc2a54588 = m78646xc2a54588();
        if (!m78668x4e2d2008()) {
            return m78646xc2a54588;
        }
        android.view.View m78646xc2a545882 = m78646xc2a54588();
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) m78646xc2a545882.getParent();
        if (viewGroup2 != null) {
            this.f39351x13746d9e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab) android.view.LayoutInflater.from(mo78409x676b27cd()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxh, viewGroup2, false);
            viewGroup2.removeView(m78646xc2a545882);
            viewGroup2.addView(this.f39351x13746d9e);
        } else {
            this.f39351x13746d9e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab) android.view.LayoutInflater.from(mo78409x676b27cd()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxh, (android.view.ViewGroup) null);
        }
        this.f39351x13746d9e.addView(m78646xc2a545882);
        this.f39351x13746d9e.m81446x590ab8fc(m78646xc2a545882);
        this.f39351x13746d9e.d(true);
        this.f39351x13746d9e.m81445xc09d199f(false);
        this.f39351x13746d9e.m81457xeb590ed6(new com.p314xaae8f345.mm.ui.sc(this));
        return this.f39351x13746d9e;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        gaVar.f290182i0.mo48814x2efc64();
        gaVar.H();
        q75.a.b(mo7430x19263085);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        m7474xfb86a31b().removeOnAttachStateChangeListener(this);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDetach */
    public void mo7400x3f5eee52() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f39349x2ac50ee7;
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78697x5913ff35(null);
        }
        super.mo7400x3f5eee52();
        j0(false, false);
        this.f39349x2ac50ee7 = null;
    }

    /* renamed from: onDragBegin */
    public void mo78674xe9fcb8b6() {
    }

    @Override // ih5.d
    /* renamed from: onFragmentVisibilityChanged */
    public void mo78675x611401b3(boolean z17) {
        j0(z17, false);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onHiddenChanged */
    public void mo7506x87316e0b(boolean z17) {
        super.mo7506x87316e0b(z17);
        j0(!z17, z17);
    }

    /* renamed from: onKeyDown */
    public boolean mo78345x1f03f0c2(int i17, android.view.KeyEvent keyEvent) {
        if (this.f39345x2305be9.h0(i17, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            mo78641xb4098c93();
            return true;
        }
        if (i17 == 82 && keyEvent.getAction() == 1) {
            return m78676xafd962bb(i17, keyEvent);
        }
        return false;
    }

    /* renamed from: onKeyUp */
    public boolean m78676xafd962bb(int i17, android.view.KeyEvent keyEvent) {
        boolean z17;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        gaVar.getClass();
        if (i17 == 82 && keyEvent.getAction() == 1) {
            com.p314xaae8f345.mm.ui.eb ebVar = gaVar.f290190m0;
            if (ebVar != null && ebVar.f289913f) {
                gaVar.l(gaVar.f290192n0, ebVar);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        return z17;
    }

    /* renamed from: onKeyboardStateChanged */
    public void mo78677x62d1e2e9() {
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onOptionsItemSelected */
    public boolean mo7510x25a2442d(android.view.MenuItem menuItem) {
        return this.f39345x2305be9.j0(menuItem);
    }

    /* renamed from: onParentVisibilityChanged */
    public void m78678x21d15ed9(boolean z17) {
        this.f39350x93fc54fb = z17;
        j0(z17, false);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.zj.a(2, this.f39344xff691c23);
        super.mo7512xb01dfb57();
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        gaVar.e(false);
        gaVar.f290182i0.mo48814x2efc64();
        java.lang.System.currentTimeMillis();
        m78678x21d15ed9(false);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPrepareOptionsMenu */
    public void mo7514x99b541d5(android.view.Menu menu) {
        this.f39345x2305be9.k0(menu);
        super.mo7514x99b541d5(menu);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.zj.a(1, this.f39344xff691c23);
        super.mo7517x57429eec();
        java.lang.System.currentTimeMillis();
        this.f39345x2305be9.l0();
        java.lang.System.currentTimeMillis();
        m78678x21d15ed9(true);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        if (gaVar.A() == -1) {
            gaVar.f290209x = gaVar.f290205u.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("settings_landscape_mode", false);
            boolean booleanExtra = gaVar.f290203t.getIntent().getBooleanExtra("KEY_SUPPORT_ORIENTATION", false);
            if (gaVar.f290209x || booleanExtra) {
                gaVar.f290203t.setRequestedOrientation(-1);
            } else {
                gaVar.f290203t.setRequestedOrientation(1);
            }
        } else {
            gaVar.f290203t.setRequestedOrientation(gaVar.A());
        }
        super.mo7405xb05099c3();
        m78678x21d15ed9(true);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        m78678x21d15ed9(false);
    }

    /* renamed from: onSwipeBack */
    public void mo25467x59cfc822() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        j0(true, false);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        m7474xfb86a31b().addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        j0(false, false);
    }

    /* renamed from: onVisibilityChanged */
    public void mo54831x93512b23(boolean z17) {
        ih5.d dVar = this.f39347x753a6c41;
        if (dVar != null) {
            dVar.mo78675x611401b3(z17);
        }
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[onVisibilityChanged] visible:%s name:%s id:%s", java.lang.Boolean.valueOf(z17), getClass().getName(), java.lang.Integer.valueOf((m7436x8619eaa0 == null || !m7436x8619eaa0.containsKey(getClass().getName())) ? -1 : m7436x8619eaa0.getInt(getClass().getName())));
    }

    /* renamed from: removeAllOptionMenu */
    public void m78679x39037dd1() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        java.util.LinkedList linkedList = gaVar.D;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.clear();
        gaVar.N0();
    }

    /* renamed from: removeOptionMenu */
    public boolean m78680x8f8ecf18(int i17) {
        return this.f39345x2305be9.n0(i17);
    }

    /* renamed from: setActivityController */
    public void m78681xd1f6d00d(com.p314xaae8f345.mm.ui.ga gaVar) {
        if (gaVar != null) {
            this.f39345x2305be9 = gaVar;
        }
    }

    /* renamed from: setBackBtn */
    public void mo78682x9c8c0d33(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39345x2305be9.s0(onMenuItemClickListener, 0);
    }

    /* renamed from: setBackBtnVisible */
    public void m78684xe21cbbf(boolean z17) {
        this.f39345x2305be9.t0(z17);
    }

    /* renamed from: setBackGroundColorResource */
    public void m78685xe5bc8f21(int i17) {
        this.f39345x2305be9.u0(i17);
    }

    /* renamed from: setBodyView */
    public final void m78686xdc0fe5e9(int i17) {
        this.f39345x2305be9.v0(i17);
    }

    /* renamed from: setBounceEnabled */
    public void m78687x4e0f6657(boolean z17) {
        this.f39343x6307022b = z17;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        gaVar.f290208w = z17;
        ul5.k kVar = gaVar.f290207v;
        if (kVar != null) {
            kVar.mo82163x4e0f6657(z17);
        }
    }

    /* renamed from: setLeftText */
    public void m78688xdcff9c56(java.lang.String str, java.lang.Runnable runnable) {
        this.f39345x2305be9.x0(str, runnable);
    }

    /* renamed from: setMMNormalView */
    public void m78689xd2a3374e() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        if (gaVar.f290205u != null) {
            gaVar.N(gaVar.f290203t);
        }
    }

    /* renamed from: setMMSubTitle */
    public void mo78691x3f86539a(java.lang.String str) {
        this.f39345x2305be9.A0(str);
    }

    /* renamed from: setMMSubTitleColor */
    public void m78692x31241be9(int i17) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        if (gaVar.G == null || (textView = gaVar.N) == null) {
            return;
        }
        textView.setTextColor(i17);
        gaVar.f290198q0 = i17;
    }

    /* renamed from: setMMSubTitleVisibility */
    public void m78693xb2165a4c(int i17) {
        this.f39345x2305be9.N.setVisibility(i17);
    }

    /* renamed from: setMMTitle */
    public void mo78695xbf7c1df6(java.lang.String str) {
        this.f39345x2305be9.C0(str);
    }

    /* renamed from: setMMTitleColor */
    public void m78696xb23a6b0d(int i17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        if (gaVar.G == null) {
            return;
        }
        gaVar.H.setTextColor(i17);
    }

    /* renamed from: setOnVisibilityChangedListener */
    public void m78697x5913ff35(ih5.d dVar) {
        this.f39347x753a6c41 = dVar;
    }

    /* renamed from: setParent */
    public void m78698x1cf75fac(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f39348x14172f77 = activityC0065xcd7aa112;
    }

    @java.lang.Deprecated
    /* renamed from: setRedDotVisibilty */
    public void m78699x98c60ac7(int i17) {
    }

    /* renamed from: setScreenEnable */
    public void m78700x1aec5e91(boolean z17) {
        this.f39345x2305be9.F0(z17);
    }

    /* renamed from: setTitleBarDoubleClickListener */
    public void m78701xfb5745ae(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        p012xc85e97e9.p016x746ad0e3.app.b bVar = gaVar.G;
        if (bVar == null || runnable == null) {
            return;
        }
        bVar.j().setOnClickListener(new com.p314xaae8f345.mm.ui.oa(gaVar, runnable));
    }

    @java.lang.Deprecated
    /* renamed from: setTitleClickAction */
    public void m78702xf19404e8(android.view.GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
    }

    /* renamed from: setTitleLogo */
    public void m78703xdc70a1e1(int i17, int i18) {
        this.f39345x2305be9.I0(i17, i18);
    }

    /* renamed from: setTitleMuteIconVisibility */
    public void m78704xca3c3c9a(int i17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        gaVar.getClass();
        gaVar.f290199r = i17 == 0;
        gaVar.Y0();
    }

    /* renamed from: setTitlePhoneIconVisibility */
    public void m78705x81055a83(int i17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        gaVar.getClass();
        gaVar.f290201s = i17 == 0;
        gaVar.Y0();
    }

    /* renamed from: setTitleVisibility */
    public void m78706x71afbec8(int i17) {
        this.f39345x2305be9.J0(i17);
    }

    @java.lang.Deprecated
    /* renamed from: setToTop */
    public void m78707x53c22598(android.view.View.OnClickListener onClickListener) {
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setUserVisibleHint */
    public void mo7583x951b248c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[setUserVisibleHint] isVisibleToUser:%s name:%s", java.lang.Boolean.valueOf(z17), getClass().getName());
        super.mo7583x951b248c(z17);
        j0(z17, false);
    }

    /* renamed from: showHomeBtn */
    public void m78708x5843c740(boolean z17) {
        this.f39345x2305be9.K0(z17);
    }

    /* renamed from: showOptionMenu */
    public void m78710xb0dfae51(boolean z17) {
        this.f39345x2305be9.L0(true, -1, z17);
    }

    /* renamed from: showTitleView */
    public void m78711x5a7a36a0() {
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f39345x2305be9.G;
        if (bVar == null) {
            return;
        }
        bVar.L();
    }

    /* renamed from: showVKB */
    public void m78712x7b383410() {
        com.p314xaae8f345.mm.ui.ga.M0(this.f39345x2305be9.f290203t);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: startActivity */
    public void mo7585xa4df9991(android.content.Intent intent) {
        m78713x918d36cf(intent);
    }

    /* renamed from: startActivityReal */
    public void m78713x918d36cf(android.content.Intent intent) {
        super.mo7585xa4df9991(intent);
    }

    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930
    /* renamed from: thisActivity */
    public p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo78409x676b27cd() {
        return this.f39345x2305be9.x() != null ? this.f39345x2305be9.x() : super.mo7430x19263085();
    }

    /* renamed from: thisResources */
    public android.content.res.Resources m78714x3942127() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = super.mo7430x19263085();
        return mo7430x19263085 == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources() : mo7430x19263085.getResources();
    }

    /* renamed from: updateDescription */
    public void m78715x5546cb73(java.lang.String str) {
        this.f39345x2305be9.R0(str);
    }

    /* renamed from: updateOptionMenu */
    public void m78716x5583d1d(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        m78717x5583d1d(i17, i18, i19, false, onMenuItemClickListener);
    }

    /* renamed from: updateOptionMenuIcon */
    public void m78719xf6ad1736(int i17, int i18) {
        this.f39345x2305be9.T0(i17, i18);
    }

    /* renamed from: updateOptionMenuListener */
    public void m78720x9ba2f8f1(int i17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        com.p314xaae8f345.mm.ui.eb E = this.f39345x2305be9.E(i17);
        if (E != null) {
            E.f289921n = onMenuItemClickListener;
            E.f289922o = onLongClickListener;
        }
    }

    /* renamed from: updateOptionMenuRedDot */
    public void m78721xf365e75(int i17, boolean z17) {
        this.f39345x2305be9.U0(i17, z17);
    }

    /* renamed from: updateOptionMenuText */
    public void m78722xf6b21fea(int i17, java.lang.String str) {
        this.f39345x2305be9.V0(i17, str);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: getContext */
    public final android.app.Activity mo7438x76847179() {
        return this.f39345x2305be9.x();
    }

    /* renamed from: getMMString */
    public java.lang.String m78654x34347727(int i17, java.lang.Object... objArr) {
        return mo78409x676b27cd().getString(i17, objArr);
    }

    /* renamed from: hideVKB */
    public boolean m78662x36654fab(android.view.View view) {
        return this.f39345x2305be9.M(view);
    }

    /* renamed from: setBackBtn */
    public void m78683x9c8c0d33(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i17) {
        this.f39345x2305be9.s0(onMenuItemClickListener, i17);
    }

    /* renamed from: setMMSubTitle */
    public void mo78690x3f86539a(int i17) {
        this.f39345x2305be9.z0(i17);
    }

    /* renamed from: setMMTitle */
    public void mo78694xbf7c1df6(int i17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        gaVar.C0(gaVar.f290205u.getString(i17));
    }

    /* renamed from: updateOptionMenu */
    public void m78717x5583d1d(int i17, int i18, int i19, boolean z17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        gaVar.V0(i17, gaVar.x().getString(i18));
        this.f39345x2305be9.T0(i17, i19);
        com.p314xaae8f345.mm.ui.eb E = this.f39345x2305be9.E(i17);
        if (E != null) {
            E.f289921n = onMenuItemClickListener;
            E.f289922o = null;
        }
        this.f39345x2305be9.U0(i17, z17);
        com.p314xaae8f345.mm.ui.ga gaVar2 = this.f39345x2305be9;
        com.p314xaae8f345.mm.ui.eb E2 = gaVar2.E(i17);
        gaVar2.o0(E2.f289908a);
        gaVar2.D.add(E2);
        gaVar2.N0();
    }

    /* renamed from: enableOptionMenu */
    public void m78638x43e00957(int i17, boolean z17) {
        this.f39345x2305be9.p(false, i17, z17);
    }

    /* renamed from: showOptionMenu */
    public void m78709xb0dfae51(int i17, boolean z17) {
        this.f39345x2305be9.L0(false, i17, z17);
    }

    /* renamed from: showVKB */
    public static void m78620x7b383410(android.app.Activity activity) {
        android.view.View currentFocus;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = activity.getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    /* renamed from: addIconOptionMenu */
    public void m78628x84f07bce(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i19) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        gaVar.getClass();
        com.p314xaae8f345.mm.ui.fb fbVar = com.p314xaae8f345.mm.ui.fb.NORMAL;
        com.p314xaae8f345.mm.ui.eb ebVar = new com.p314xaae8f345.mm.ui.eb();
        ebVar.f289908a = i17;
        ebVar.f289910c = i19;
        ebVar.f289909b = i18;
        ebVar.f289915h = "";
        ebVar.f289921n = onMenuItemClickListener;
        ebVar.f289922o = null;
        ebVar.f289919l = fbVar;
        ebVar.f289920m = false;
        if ((i18 == com.p314xaae8f345.mm.R.C30861xcebc809e.f563513ap2 || i18 == com.p314xaae8f345.mm.R.raw.f80193xebd790ad || i18 == com.p314xaae8f345.mm.R.raw.f78355x20db789a) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
            ebVar.f289915h = gaVar.f290205u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.w_);
        }
        gaVar.o0(ebVar.f289908a);
        gaVar.D.add(ebVar);
        gaVar.N0();
    }

    /* renamed from: addTextOptionMenu */
    public void m78634xd9193382(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        this.f39345x2305be9.i(i17, 0, str, false, onMenuItemClickListener, onLongClickListener, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    public AbstractViewOnAttachStateChangeListenerC21400xb429b010(boolean z17) {
        super(z17);
        this.f39345x2305be9 = new com.p314xaae8f345.mm.ui.rc(this);
        this.f39343x6307022b = true;
        this.f39350x93fc54fb = false;
        this.f39346xd92ff65f = false;
    }

    /* renamed from: addTextOptionMenu */
    public void m78635xd9193382(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener, com.p314xaae8f345.mm.ui.fb fbVar) {
        this.f39345x2305be9.i(i17, 0, str, false, onMenuItemClickListener, onLongClickListener, fbVar);
    }

    /* renamed from: updateOptionMenu */
    public void m78718x5583d1d(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i19) {
        this.f39345x2305be9.T0(i17, i18);
        com.p314xaae8f345.mm.ui.eb E = this.f39345x2305be9.E(i17);
        if (E != null) {
            E.f289921n = onMenuItemClickListener;
            E.f289922o = null;
        }
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        com.p314xaae8f345.mm.ui.eb E2 = gaVar.E(i17);
        if (E2 != null && (E2.f289909b != i18 || E2.f289910c != i19)) {
            E2.f289909b = i18;
            E2.f289910c = i19;
            E2.f289911d = true;
            gaVar.N0();
        }
        com.p314xaae8f345.mm.ui.ga gaVar2 = this.f39345x2305be9;
        com.p314xaae8f345.mm.ui.eb E3 = gaVar2.E(i17);
        gaVar2.o0(E3.f289908a);
        gaVar2.D.add(E3);
        gaVar2.N0();
    }

    /* renamed from: addIconOptionMenu */
    public void m78630x84f07bce(int i17, java.lang.String str, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39345x2305be9.g(i17, str, i18, onMenuItemClickListener);
    }

    /* renamed from: addIconOptionMenu */
    public void m78623x84f07bce(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39345x2305be9.f(i17, i18, i19, onMenuItemClickListener);
    }

    /* renamed from: addIconOptionMenu */
    public void m78625x84f07bce(int i17, int i18, int i19, boolean z17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        gaVar.i(i17, i19, gaVar.f290205u.getString(i18), z17, onMenuItemClickListener, null, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    /* renamed from: addIconOptionMenu */
    public void m78629x84f07bce(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        this.f39345x2305be9.i(i17, i18, "", false, onMenuItemClickListener, onLongClickListener, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    /* renamed from: addIconOptionMenu */
    public void m78624x84f07bce(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        gaVar.i(i17, i19, gaVar.f290205u.getString(i18), false, onMenuItemClickListener, onLongClickListener, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    /* renamed from: addIconOptionMenu */
    public void m78626x84f07bce(int i17, int i18, android.graphics.drawable.Drawable drawable, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39345x2305be9.h(i17, m7467x2fec8307(i18), drawable, onMenuItemClickListener);
    }

    /* renamed from: addIconOptionMenu */
    public void m78631x84f07bce(int i17, java.lang.String str, android.graphics.drawable.Drawable drawable, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39345x2305be9.h(i17, str, drawable, onMenuItemClickListener);
    }
}
