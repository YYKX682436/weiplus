package com.p314xaae8f345.mm.ui;

@db5.a(m123858x6ac9171 = 0)
/* renamed from: com.tencent.mm.ui.MMActivity */
/* loaded from: classes14.dex */
public abstract class AbstractActivityC21394xb3d2c0cf extends com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l, db5.b1 {

    /* renamed from: ANDROID_API_LEVEL_11 */
    private static final int f39301x1dc9c970 = 11;

    /* renamed from: DEFAULT_TOAST_TIME */
    protected static final int f39302xc9616e3 = 3000;

    /* renamed from: FLAG_OVERRIDE_ENTER_ANIMATION */
    public static final java.lang.String f39303x6d0059d = "MMActivity.OverrideEnterAnimation";

    /* renamed from: FLAG_OVERRIDE_EXIT_ANIMATION */
    public static final java.lang.String f39304x2b3dd283 = "MMActivity.OverrideExitAnimation";

    /* renamed from: NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME */
    private static final java.lang.String f39305x3726a9e = "navigation_bar_height_landscape";

    /* renamed from: NAV_BAR_HEIGHT_RES_NAME */
    private static final java.lang.String f39306xe323717a = "navigation_bar_height";

    /* renamed from: SHOW_NAV_BAR_RES_NAME */
    private static final java.lang.String f39307x878f3474 = "config_showNavigationBar";
    private static final java.lang.String TAG = "MicroMsg.MMActivity";

    /* renamed from: TAG2 */
    private static final java.lang.String f39308x272bf8 = "MicroMsg.INIT";

    /* renamed from: sNavBarOverride */
    private static java.lang.String f39309x3760bb2f;

    /* renamed from: _hellAccFlag_ */
    private byte f39310x7f11beae;

    /* renamed from: className */
    java.lang.String f39311xff691c23;

    /* renamed from: customResources */
    private android.content.res.Resources f39312x2f3fa1b4;

    /* renamed from: gestureDetector */
    private android.view.GestureDetector f39315x7bb2802f;

    /* renamed from: mBaseResources */
    private android.content.res.Resources f39320xd87afae7;

    /* renamed from: mForceBaseResources */
    private android.content.res.Resources f39323x47724876;

    /* renamed from: mForceNewResources */
    private android.content.res.Resources f39324xaab86603;

    /* renamed from: mForceOldResources */
    private android.content.res.Resources f39325xa337895c;

    /* renamed from: mNewResources */
    private android.content.res.Resources f39328x33872172;

    /* renamed from: mOldResources */
    private android.content.res.Resources f39329x2c0644cb;

    /* renamed from: mSelfNavigationBar */
    private android.view.View f39330xde1af486;

    /* renamed from: landscapeMode */
    protected boolean f39316x876ccafe = false;

    /* renamed from: mIsPaused */
    private boolean f39326x11d73285 = false;

    /* renamed from: mController */
    protected com.p314xaae8f345.mm.ui.ga f39322x2305be9 = new com.p314xaae8f345.mm.ui.aa(this);

    /* renamed from: fixStatusbar */
    boolean f39314xa10faa4c = false;

    /* renamed from: statusBarStrategy */
    al5.r f39334xb5668d54 = al5.r.f87537d;

    /* renamed from: navigationBarStrategy */
    al5.q f39332x33e09f2 = al5.q.f87521d;

    /* renamed from: transparentTheme */
    boolean f39335xfbd3ab97 = false;

    /* renamed from: customfixStatusbar */
    boolean f39313xc03943d = false;

    /* renamed from: mWrappingFrame */
    protected android.view.ViewGroup f39331xd9e73aa4 = null;

    /* renamed from: mIsStopped */
    private boolean f39327xe7d82356 = false;

    /* renamed from: mConfigChangedListeners */
    private final java.util.Map<com.p314xaae8f345.mm.ui.fa, java.lang.Object> f39321xdde44a1a = new x.b();

    /* renamed from: updateResource */
    private boolean f39338x1f8987f7 = false;

    /* renamed from: updateNewResource */
    private boolean f39337xf2a57945 = false;

    /* renamed from: updateForceResource */
    private boolean f39336x8fdcddd0 = false;

    /* renamed from: lastOnResumeTicks */
    private long f39319x7cd6c7f4 = 0;

    /* renamed from: lastOnPauseTicks */
    private long f39318x8d262b15 = 0;

    /* renamed from: lastBrowseTime */
    private long f39317x2a9c3ad = 0;

    /* renamed from: onBackPressListeners */
    java.util.List<com.p314xaae8f345.mm.ui.ea> f39333x79bfca42 = new java.util.ArrayList();

    static {
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.os.SystemProperties").getDeclaredMethod("get", java.lang.String.class);
            declaredMethod.setAccessible(true);
            f39309x3760bb2f = (java.lang.String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
        } catch (java.lang.Throwable unused) {
            f39309x3760bb2f = null;
        }
    }

    /* renamed from: initLanguage */
    public static java.util.Locale m78472x26f04c88(android.content.Context context) {
        return com.p314xaae8f345.mm.ui.ga.Q(context);
    }

    /* renamed from: setMainProcess */
    public static void m78474x290838b4() {
        com.p314xaae8f345.mm.ui.ga.f290161v0 = true;
    }

    public <T> T $(int i17) {
        return (T) findViewById(i17);
    }

    public int S6() {
        return mo78508x85b50c3c();
    }

    /* renamed from: activateBroadcast */
    public void mo78476xf16d150e(boolean z17) {
        this.f39322x2305be9.e(z17);
    }

    @java.lang.Deprecated
    /* renamed from: activityHasDestroyed */
    public boolean m78477x9d1e994e() {
        return isDestroyed();
    }

    /* renamed from: addDialog */
    public void mo53058xe5d1a549(android.app.Dialog dialog) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
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
    public void mo74404x84f07bce(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39322x2305be9.i(i17, i18, "", false, onMenuItemClickListener, null, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    /* renamed from: addOnBackPressListener */
    public void m78487x199f61f0(com.p314xaae8f345.mm.ui.ea eaVar) {
        if (this.f39333x79bfca42.contains(eaVar)) {
            return;
        }
        this.f39333x79bfca42.add(eaVar);
    }

    /* renamed from: addOnConfigurationChangedListener */
    public void m78488x9f743232(com.p314xaae8f345.mm.ui.fa faVar) {
        if (faVar != null) {
            this.f39321xdde44a1a.put(faVar, this);
        }
    }

    /* renamed from: addSearchMenu */
    public void m78489xd6d59aa8(boolean z17, com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var) {
        this.f39322x2305be9.j(z17, c9Var);
    }

    /* renamed from: addTextOptionMenu */
    public void mo78491xd9193382(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39322x2305be9.i(i17, 0, str, false, onMenuItemClickListener, null, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    /* renamed from: applyHalfScreenActionbarHeight */
    public void m78495xf385c157() {
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.hwa);
        if (frameLayout != null) {
            ((android.widget.FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = dimension;
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.hvf);
        if (frameLayout2 != null) {
            frameLayout2.getLayoutParams().height = dimension;
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.coz);
        if (findViewById != null) {
            ((android.widget.RelativeLayout.LayoutParams) findViewById.getLayoutParams()).addRule(15, -1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: callBackMenu */
    public boolean m78496x82776364() {
        return this.f39322x2305be9.k();
    }

    @java.lang.Deprecated
    /* renamed from: customfixStatusbar */
    public void m78497xc03943d(boolean z17) {
        this.f39313xc03943d = z17;
    }

    /* renamed from: dealContentView */
    public void mo47898x2105eeb2(android.view.View view) {
        if (!com.p314xaae8f345.mm.ui.b4.a(this)) {
            setContentView(view);
            return;
        }
        try {
            setContentView(view);
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "dealContentView fail:" + e17);
        }
    }

    /* renamed from: dispatchOnConfigurationChanged */
    public void m78498x28bbba77(android.content.res.Configuration configuration) {
        if (this.f39321xdde44a1a.isEmpty()) {
            return;
        }
        for (com.p314xaae8f345.mm.ui.fa faVar : (com.p314xaae8f345.mm.ui.fa[]) this.f39321xdde44a1a.keySet().toArray(new com.p314xaae8f345.mm.ui.fa[this.f39321xdde44a1a.size()])) {
            faVar.mo74853x50e1c15d(configuration);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f39315x7bb2802f;
        if (gestureDetector != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/MMActivity", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: enableBackMenu */
    public void m78499x92e71989(boolean z17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        com.p314xaae8f345.mm.ui.eb ebVar = gaVar.C;
        if (ebVar == null || ebVar.f289913f == z17) {
            return;
        }
        ebVar.f289913f = z17;
        gaVar.N0();
    }

    /* renamed from: enableOptionMenu */
    public void m78501x43e00957(boolean z17) {
        this.f39322x2305be9.p(true, -1, z17);
    }

    /* renamed from: expendActionbar */
    public void m78502xa0296e1f() {
        int i17;
        int i18;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (!gaVar.d0() && (i17 = gaVar.f290204t0) < (i18 = gaVar.Y)) {
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(i17, i18).setDuration(200L);
            duration.addUpdateListener(new com.p314xaae8f345.mm.ui.va(gaVar));
            duration.start();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(getIntent(), "MMActivity.OverrideEnterAnimation", -1);
        int g18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(getIntent(), "MMActivity.OverrideExitAnimation", -1);
        if (g17 != -1) {
            super.overridePendingTransition(g17, g18);
        }
    }

    @java.lang.Deprecated
    /* renamed from: fixStatusbar */
    public void m78503xa10faa4c(boolean z17) {
        this.f39314xa10faa4c = z17;
    }

    /* renamed from: fromFullScreenActivity */
    public boolean mo78504x402fb154() {
        return false;
    }

    /* renamed from: fullScreenNoTitleBar */
    public void m78505x1ef531b7(boolean z17) {
        this.f39322x2305be9.t(z17);
    }

    /* renamed from: fullScreenWithTitleBar */
    public void m78507x744d5cfc(boolean z17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (z17) {
            gaVar.f290203t.getWindow().setFlags(1024, 1024);
        } else {
            gaVar.f290203t.getWindow().clearFlags(1024);
        }
    }

    /* renamed from: getActionbarColor */
    public int mo78508x85b50c3c() {
        return this.f39322x2305be9.u();
    }

    /* renamed from: getActivityBrowseTimeMs */
    public long mo78509x4b0ac5a2() {
        long elapsedRealtime;
        long j17;
        long j18 = this.f39318x8d262b15;
        if (j18 != 0) {
            elapsedRealtime = j18 - this.f39319x7cd6c7f4;
            j17 = this.f39317x2a9c3ad;
        } else {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f39319x7cd6c7f4;
            j17 = this.f39317x2a9c3ad;
        }
        long j19 = elapsedRealtime + j17;
        if (j19 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "%d get activity browse time is error, may be something warn here.[%d %d %d %d]", java.lang.Integer.valueOf(hashCode()), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(this.f39319x7cd6c7f4), java.lang.Long.valueOf(this.f39318x8d262b15), java.lang.Long.valueOf(this.f39317x2a9c3ad));
        }
        hashCode();
        return j19;
    }

    /* renamed from: getBodyView */
    public android.view.View m78510xe15784dd() {
        return this.f39322x2305be9.f290167b;
    }

    /* renamed from: getBounceView */
    public ul5.k m78511x9f88d943() {
        return this.f39322x2305be9.f290207v;
    }

    /* renamed from: getCallerPackage */
    public java.lang.String m78512xb8359e85() {
        java.lang.String str;
        android.net.Uri referrer;
        android.content.ComponentName callingActivity = getCallingActivity();
        if (callingActivity != null) {
            str = callingActivity.getPackageName();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "get calling activity, %s", str);
        } else {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                java.lang.Object a17 = new yo.b(this, "mReferrer", null).a();
                if (a17 != null) {
                    str = (java.lang.String) a17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "get referrer, %s", str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "get mReferrer error", new java.lang.Object[0]);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (referrer = getReferrer()) == null) {
            return str;
        }
        java.lang.String authority = referrer.getAuthority();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "get referrer, %s", authority);
        return authority;
    }

    /* renamed from: getContentView */
    public final android.view.View m78513xc2a54588() {
        return this.f39322x2305be9.w();
    }

    /* renamed from: getContext */
    public p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179() {
        return this.f39322x2305be9.x();
    }

    /* renamed from: getController */
    public com.p314xaae8f345.mm.ui.ga mo78514x143f1b92() {
        return this.f39322x2305be9;
    }

    /* renamed from: getCurrentActionbarHeight */
    public int m78515x731a2de1() {
        return this.f39322x2305be9.f290204t0;
    }

    /* renamed from: getCurrentStatusBarColor */
    public int m78516xe7fb4d45() {
        return this.f39322x2305be9.f290206u0;
    }

    /* renamed from: getCustomBounceId */
    public int mo56571xc86d394a() {
        return -1;
    }

    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return -1;
    }

    /* renamed from: getForceUIMode */
    public int mo48756xbf6603cc() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: getHostActivity */
    public android.app.Activity mo53059x9d6db74d() {
        return this;
    }

    /* renamed from: getIdentString */
    public s75.b mo65195x6a200eb() {
        return new s75.b("");
    }

    /* renamed from: getLayoutId */
    public abstract int mo43051x2ee31f5b();

    /* renamed from: getLayoutView */
    public android.view.View mo44092x29ebce5() {
        return null;
    }

    /* renamed from: getMMSubTitle */
    public android.widget.TextView m78517x1162058e() {
        return this.f39322x2305be9.N;
    }

    /* renamed from: getMMTitle */
    public java.lang.CharSequence m78518x4c0ad082() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        p012xc85e97e9.p016x746ad0e3.app.b bVar = gaVar.G;
        if (bVar == null) {
            return null;
        }
        java.lang.String str = gaVar.f290185k;
        return str != null ? str : bVar.n();
    }

    /* renamed from: getMMTitleView */
    public android.widget.TextView m78519xb1736e47() {
        return this.f39322x2305be9.H;
    }

    /* renamed from: getMabBackBtn */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m78520x322d3abd() {
        return this.f39322x2305be9.K;
    }

    /* renamed from: getMenu */
    public db5.g4 m78521xfb827dd5() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.e eVar = this.f39322x2305be9.E;
        if (eVar == null || !eVar.f291897c) {
            return null;
        }
        return eVar.f291898d;
    }

    /* renamed from: getNavigationBarColor */
    public int m78522xf7c7d33a() {
        return this.f39322x2305be9.f290202s0;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.Context baseContext = getBaseContext();
        if (baseContext == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(TAG, "no base context!!", new java.lang.Object[0]);
            return super.getResources();
        }
        if (mo48756xbf6603cc() != 0) {
            if (!this.f39337xf2a57945 || this.f39328x33872172 == null) {
                this.f39320xd87afae7 = baseContext.getResources();
                this.f39329x2c0644cb = super.getResources();
                this.f39320xd87afae7.getConfiguration().updateFrom(this.f39329x2c0644cb.getConfiguration());
                this.f39328x33872172 = new j65.y(this.f39320xd87afae7, mo48756xbf6603cc(), j65.f.d());
                this.f39337xf2a57945 = true;
            }
            return this.f39328x33872172;
        }
        if (!this.f39338x1f8987f7 || this.f39312x2f3fa1b4 == null) {
            android.content.res.Resources resources = baseContext.getResources();
            android.content.res.Resources resources2 = super.getResources();
            this.f39312x2f3fa1b4 = resources2;
            if ((resources2 instanceof j65.j) && resources != null) {
                j65.j jVar = (j65.j) resources2;
                android.content.res.Configuration b17 = jVar.f379494e.b(resources.getConfiguration());
                j65.m.c(b17, com.p314xaae8f345.mm.ui.bk.E(this.f39312x2f3fa1b4));
                jVar.getConfiguration().updateFrom(b17);
                this.f39312x2f3fa1b4 = jVar;
                this.f39338x1f8987f7 = true;
            }
        }
        return this.f39312x2f3fa1b4;
    }

    /* renamed from: getStatusBarColor */
    public int mo78523xb48e4618() {
        return com.p314xaae8f345.mm.ui.b4.c(this) ? this.f39322x2305be9.f290206u0 : getWindow().getStatusBarColor();
    }

    /* renamed from: getStatusBarHeight */
    public int m78524xe5345112(int i17) {
        android.view.ViewGroup viewGroup = this.f39331xd9e73aa4;
        return viewGroup instanceof vj5.h ? ((vj5.h) viewGroup).m172249x6b326eb4() : com.p314xaae8f345.mm.ui.bl.i(this, i17);
    }

    /* renamed from: getStreamMaxVolume */
    public int m78525xa1b0efc8(int i17) {
        return this.f39322x2305be9.f290181i.getStreamMaxVolume(i17);
    }

    /* renamed from: getStreamVolume */
    public int m78526x107e1530(int i17) {
        return this.f39322x2305be9.f290181i.getStreamVolume(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
    /* renamed from: getSupportActionBar */
    public p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264() {
        return al5.p0.N(super.mo2533x106ab264());
    }

    /* renamed from: getTitleLocation */
    public int m78527x73620a77() {
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f39322x2305be9.G;
        if (bVar == null) {
            return 0;
        }
        return bVar.l();
    }

    /* renamed from: getWrappingFrame */
    public android.view.ViewGroup m78528x3c38ee5b() {
        return this.f39331xd9e73aa4;
    }

    /* renamed from: hideActionBarOperationArea */
    public void mo78529xe76c1b79() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar != null) {
            gaVar.G();
        }
    }

    /* renamed from: hideActionbarLine */
    public void mo78530x8b45058f() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar.F() != null) {
            gaVar.F().G(0.0f);
        }
    }

    /* renamed from: hideAllManagedDialogs */
    public void mo54210xbb94da6b() {
        this.f39322x2305be9.H();
    }

    /* renamed from: hideTitleView */
    public void m78531x8f8cf1fb() {
        this.f39322x2305be9.J();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: hideVKB */
    public void mo48674x36654fab() {
        this.f39322x2305be9.K();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: hideVKBHavingResult */
    public boolean mo53061x30be3ed() {
        return this.f39322x2305be9.K();
    }

    /* renamed from: initActionBarOperationArea */
    public void m78532xc326b4c7() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar != null) {
            android.view.View view = gaVar.f290166a0;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = gaVar.I;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: initActionBarOperationAreaTxt */
    public void m78533xf5488c29(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22596xee3b48b1 c22596xee3b48b1;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar == null || (c22596xee3b48b1 = gaVar.f290168b0) == null) {
            return;
        }
        c22596xee3b48b1.f292773d.setText(str);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initSwipeBack */
    public void mo64511xb83ef811() {
        super.mo64511xb83ef811();
        if (m78735x28280f95() == null || m78735x28280f95().getChildCount() <= 0) {
            return;
        }
        android.view.View childAt = m78735x28280f95().getChildAt(0);
        m78735x28280f95().removeView(childAt);
        if (com.p314xaae8f345.mm.ui.b4.c(this) && m78732xefeb73a5()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 c22602x8bae1c88 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88(this);
            this.f39331xd9e73aa4 = c22602x8bae1c88;
            c22602x8bae1c88.setId(com.p314xaae8f345.mm.R.id.twm);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) this.f39331xd9e73aa4).m81262xe4312112(this.f39334xb5668d54);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) this.f39331xd9e73aa4).m81261xdefc8eb0(this.f39332x33e09f2);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) this.f39331xd9e73aa4).m81259x3d6c86dd((db5.f.e(getClass()) & 16384) != 0);
        } else if (this.f39314xa10faa4c) {
            this.f39331xd9e73aa4 = new vj5.h(this);
        } else {
            this.f39331xd9e73aa4 = new android.widget.FrameLayout(this);
        }
        this.f39331xd9e73aa4.addView(childAt, new android.widget.FrameLayout.LayoutParams(-1, -1));
        m78735x28280f95().addView(this.f39331xd9e73aa4);
        m78735x28280f95().m81446x590ab8fc(this.f39331xd9e73aa4);
        if (com.p314xaae8f345.mm.ui.b4.c(this)) {
            com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
            gaVar.E0(gaVar.f290202s0);
        }
    }

    @java.lang.Deprecated
    /* renamed from: initView */
    public void mo43517x10010bd5() {
    }

    /* renamed from: isActionbarCenterLayoutMode */
    public boolean mo63712xc695d055() {
        return true;
    }

    /* renamed from: isActionbarMenuUseOriginalSys */
    public boolean m78535xb498afe7() {
        return false;
    }

    /* renamed from: isForceFixStatusBar */
    public boolean mo53703xa622f4ad() {
        return false;
    }

    /* renamed from: isHideVKBWhenScroll */
    public boolean mo48757x621268a8() {
        return false;
    }

    /* renamed from: isLayoutInDecorView */
    public boolean mo68955xfd09f471() {
        return false;
    }

    /* renamed from: isOptionMenuEnable */
    public boolean m78536x89ba3761(int i17) {
        java.util.Iterator it = this.f39322x2305be9.D.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.eb ebVar = (com.p314xaae8f345.mm.ui.eb) it.next();
            if (ebVar.f289908a == i17) {
                return ebVar.f289913f;
            }
        }
        return false;
    }

    /* renamed from: isOptionMenuShow */
    public boolean m78537xfe91cc5b(int i17) {
        java.util.Iterator it = this.f39322x2305be9.D.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.eb ebVar = (com.p314xaae8f345.mm.ui.eb) it.next();
            if (ebVar.f289908a == i17) {
                return ebVar.f289914g;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isPaused */
    public boolean mo78538xecd98af8() {
        return this.f39326x11d73285;
    }

    /* renamed from: isScreenEnable */
    public boolean m78539x564fc359() {
        return this.f39322x2305be9.f290183j;
    }

    /* renamed from: isShowDialog */
    public boolean m78540x95dccf6f() {
        java.util.ArrayList arrayList = this.f39322x2305be9.F;
        if (arrayList == null) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((android.app.Dialog) it.next()).isShowing()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSingleTitleView */
    public boolean m78541xeeaf432b() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        p012xc85e97e9.p016x746ad0e3.app.b bVar = gaVar.G;
        return (bVar == null || bVar.j() == null || gaVar.G.j().findViewById(com.p314xaae8f345.mm.R.id.f563972em) == null) ? false : true;
    }

    /* renamed from: isStopped */
    public boolean m78542x6d20d943() {
        return this.f39327xe7d82356;
    }

    /* renamed from: isTitleShowing */
    public boolean m78543x79591497() {
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f39322x2305be9.G;
        if (bVar == null) {
            return false;
        }
        return bVar.q();
    }

    /* renamed from: keyboardState */
    public int mo70705x8200b8ea() {
        return this.f39322x2305be9.f290188l0;
    }

    /* renamed from: makeActionBarOperationAreaToCenter */
    public void m78544x817a68f5() {
        android.view.View view;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar == null || (view = gaVar.f290166a0) == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(0, layoutParams.topMargin, 0, layoutParams.bottomMargin);
        layoutParams.addRule(13);
    }

    /* renamed from: mmSetOnActivityResultCallback */
    public void m78545xde66c1f2(com.p314xaae8f345.mm.ui.da daVar) {
        super.m78750xc5512edd(daVar);
    }

    /* renamed from: mmStartActivityForResult */
    public void m78546x70d84175(com.p314xaae8f345.mm.ui.da daVar, android.content.Intent intent, int i17) {
        super.m78743x70d84175((com.p314xaae8f345.mm.ui.xc) daVar, intent, i17);
    }

    /* renamed from: needResetStatusBarColorOnActivityCreate */
    public boolean mo44292x104fd6a5() {
        return true;
    }

    /* renamed from: needShowIdcError */
    public boolean mo48676x712cd213() {
        return true;
    }

    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        java.util.Iterator<com.p314xaae8f345.mm.ui.ea> it = this.f39333x79bfca42.iterator();
        while (it.hasNext()) {
            if (it.next().mo80638xbdc3c5dc()) {
                return;
            }
        }
        super.onBackPressed();
    }

    /* renamed from: onBusinessPermissionDenied */
    public void mo53824x34301f29(java.lang.String str) {
        finish();
    }

    /* renamed from: onBusinessPermissionGranted */
    public void mo53825x600c4ed(java.lang.String str) {
        if (getCallingActivity() != null) {
            recreate();
            return;
        }
        finish();
        overridePendingTransition(0, 0);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.ca(this), 50L);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m78498x28bbba77(configuration);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View childAt;
        android.view.ViewGroup viewGroup;
        zk3.c Ai;
        int i17;
        al5.r rVar;
        if (!this.f39313xc03943d) {
            this.f39314xa10faa4c = true;
        }
        mo78514x143f1b92().f290184j0 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569451bk;
        super.onCreate(bundle);
        if (getP() && !mo53703xa622f4ad()) {
            this.f39314xa10faa4c = false;
        }
        if (com.p314xaae8f345.mm.ui.b4.c(this) && m78732xefeb73a5()) {
            com.p314xaae8f345.mm.ui.a4.f278650a.i(this);
            java.lang.Class<?> cls = getClass();
            int e17 = db5.f.e(cls);
            if ((e17 & 128) != 0) {
                rVar = al5.r.f87537d;
            } else if ((e17 & 256) != 0) {
                rVar = al5.r.f87538e;
            } else {
                rVar = (db5.f.e(cls) & 32) != 0 ? al5.r.f87537d : al5.r.f87538e;
            }
            this.f39334xb5668d54 = rVar;
            al5.q f17 = db5.f.f(getClass());
            this.f39332x33e09f2 = f17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Edge2Edge statusBarStrategy:%s, navigationBarStrategy:%s for %s", this.f39334xb5668d54, f17, getClass().getSimpleName());
        } else {
            this.f39334xb5668d54 = al5.r.f87537d;
            this.f39332x33e09f2 = al5.q.f87521d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Edge2Edge customfixStatusbar:%s, fixStatusbar:%s, isForceFixStatusBar:%s", java.lang.Boolean.valueOf(this.f39313xc03943d), java.lang.Boolean.valueOf(this.f39314xa10faa4c), java.lang.Boolean.valueOf(mo53703xa622f4ad()));
        this.f39322x2305be9.e0(getApplicationContext(), this);
        mo52921x858d605d();
        if (com.p314xaae8f345.mm.ui.b4.c(this) && m78732xefeb73a5()) {
            if (m78735x28280f95() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Edge2Edge already init DrawStatusBarFrameLayout");
            } else {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) getWindow().getDecorView();
                android.view.View childAt2 = viewGroup2.getChildAt(0);
                if (childAt2.findViewById(android.R.id.content) == null) {
                    int childCount = viewGroup2.getChildCount();
                    i17 = 0;
                    while (i17 < childCount) {
                        android.view.View childAt3 = viewGroup2.getChildAt(i17);
                        if ((childAt3 instanceof android.view.ViewGroup) && childAt3.findViewById(android.R.id.content) != null) {
                            childAt2 = childAt3;
                            break;
                        }
                        i17++;
                    }
                }
                i17 = 0;
                viewGroup2.removeView(childAt2);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 c22602x8bae1c88 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88(this);
                this.f39331xd9e73aa4 = c22602x8bae1c88;
                c22602x8bae1c88.addView(childAt2, new android.widget.FrameLayout.LayoutParams(-1, -1));
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) this.f39331xd9e73aa4).m81262xe4312112(this.f39334xb5668d54);
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) this.f39331xd9e73aa4).m81261xdefc8eb0(this.f39332x33e09f2);
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) this.f39331xd9e73aa4).m81259x3d6c86dd((db5.f.e(getClass()) & 16384) != 0);
                this.f39331xd9e73aa4.setId(com.p314xaae8f345.mm.R.id.twm);
                viewGroup2.addView(this.f39331xd9e73aa4, i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "add EdgeToEdgeWrapperLayout to Decor");
                com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
                gaVar.E0(gaVar.f290202s0);
            }
        }
        if (!mo44293x69604d3c()) {
            mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
            m78576x47d78717(i65.a.f(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b) * i65.a.m(this));
        }
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20290xed36a802()) == 1) {
            db5.t7.m123883x26a183b(this, getClass().getSimpleName(), 0).show();
        }
        if (mo48757x621268a8()) {
            this.f39315x7bb2802f = new android.view.GestureDetector(this, new com.p314xaae8f345.mm.ui.ba(this));
        }
        android.view.View decorView = getWindow().getDecorView();
        if (this.f39314xa10faa4c && (decorView instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) decorView;
            if (viewGroup3.getChildCount() > 0) {
                childAt = viewGroup3.getChildAt(0);
                if (childAt != null || (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this)) == null) {
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).R6(childAt, null, false);
                return;
            }
        }
        childAt = (this.f39314xa10faa4c || (viewGroup = this.f39331xd9e73aa4) == null || viewGroup.getChildCount() <= 0) ? null : this.f39331xd9e73aa4.getChildAt(0);
        if (childAt != null) {
        }
    }

    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        try {
            if (this.f39322x2305be9.g0(menu)) {
                return true;
            }
            return super.onCreateOptionsMenu(menu);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "onCreateOptionsMenu", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.f290182i0.mo48814x2efc64();
        gaVar.H();
        q75.a.b(this);
        this.f39321xdde44a1a.clear();
    }

    /* renamed from: onDialogDismiss */
    public void mo48629xdbdf3083(android.app.Dialog dialog) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (this.f39322x2305be9.h0(i17, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        boolean z17;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
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
        if (z17) {
            return true;
        }
        try {
            return super.onKeyUp(i17, keyEvent);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState", new java.lang.Object[0]);
            return true;
        }
    }

    /* renamed from: onKeyboardStateChanged */
    public void mo54561x62d1e2e9() {
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        return this.f39322x2305be9.j0(menuItem);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.zj.a(2, this.f39311xff691c23);
        this.f39326x11d73285 = true;
        super.onPause();
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.e(false);
        gaVar.f290182i0.mo48814x2efc64();
        isFinishing();
        java.lang.System.currentTimeMillis();
        hashCode();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f39318x8d262b15 = android.os.SystemClock.elapsedRealtime();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.f39322x2305be9.k0(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.zj.a(1, this.f39311xff691c23);
        this.f39326x11d73285 = false;
        super.onResume();
        java.lang.System.currentTimeMillis();
        this.f39322x2305be9.l0();
        java.lang.System.currentTimeMillis();
        hashCode();
        long j17 = this.f39318x8d262b15;
        long j18 = this.f39319x7cd6c7f4;
        if (j17 > j18) {
            this.f39317x2a9c3ad += j17 - j18;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f39319x7cd6c7f4 = android.os.SystemClock.elapsedRealtime();
        this.f39318x8d262b15 = 0L;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        if (mo52915xa8181dad()) {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        mo50393x3c0b42ee();
        this.f39327xe7d82356 = false;
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        this.f39327xe7d82356 = true;
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        if (!mo48654xe4dc1f55()) {
            this.f39322x2305be9.k();
        }
        super.mo2295x59cfc822();
    }

    /* renamed from: onSwipeBackFinish */
    public boolean mo48654xe4dc1f55() {
        return false;
    }

    /* renamed from: playActionBarOperationAreaAnim */
    public void m78547xfde6309c() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22596xee3b48b1 c22596xee3b48b1;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar == null || (c22596xee3b48b1 = gaVar.f290168b0) == null || c22596xee3b48b1.f292775f) {
            return;
        }
        c22596xee3b48b1.f292775f = true;
        c22596xee3b48b1.f292774e.animate().rotationBy(180.0f).setDuration(200L).withEndAction(new al5.b(c22596xee3b48b1)).start();
    }

    /* renamed from: provideCustomActivityContentView */
    public android.view.View mo44294xa334195d() {
        return null;
    }

    /* renamed from: removeAllOptionMenu */
    public void m78548x39037dd1() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        java.util.LinkedList linkedList = gaVar.D;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.clear();
        gaVar.N0();
    }

    /* renamed from: removeOnBackPressListener */
    public void m78549x2090992d(com.p314xaae8f345.mm.ui.ea eaVar) {
        if (this.f39333x79bfca42.contains(eaVar)) {
            this.f39333x79bfca42.remove(eaVar);
        }
    }

    /* renamed from: removeOnConfigurationChangedListener */
    public void m78550x87bf02d5(com.p314xaae8f345.mm.ui.fa faVar) {
        if (faVar != null) {
            this.f39321xdde44a1a.remove(faVar);
        }
    }

    /* renamed from: removeOptionMenu */
    public boolean m78551x8f8ecf18(int i17) {
        return this.f39322x2305be9.n0(i17);
    }

    /* renamed from: removeSearchMenu */
    public void m78552x1356dacb() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.f290205u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8);
        gaVar.n0(com.p314xaae8f345.mm.R.id.jha);
        gaVar.N0();
    }

    /* renamed from: setActionBarOperationAreaClickListener */
    public void m78553x387ff443(al5.d dVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22596xee3b48b1 c22596xee3b48b1;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar == null || (c22596xee3b48b1 = gaVar.f290168b0) == null) {
            return;
        }
        c22596xee3b48b1.m81248xaca64416(dVar);
    }

    /* renamed from: setActionbarColor */
    public void mo64405x4dab7448(int i17) {
        this.f39322x2305be9.p0(i17);
        if (mo56571xc86d394a() != -1 || m78511x9f88d943() == null) {
            return;
        }
        m78511x9f88d943().mo82174x3b2a1eb1(i17);
    }

    /* renamed from: setActionbarElementColor */
    public void m78554x41d7d42(int i17) {
        this.f39322x2305be9.q0(i17);
    }

    /* renamed from: setActionbarFrosted */
    public void m78555x349cea08(boolean z17) {
        if (z17) {
            this.f39322x2305be9.o(50, com.p314xaae8f345.mm.R.C30859x5a72f63.agt, 94);
        } else {
            this.f39322x2305be9.n();
        }
    }

    /* renamed from: setActionbarHeight */
    public void m78557x6fbce8e2(int i17) {
        this.f39322x2305be9.r0(i17, false);
    }

    /* renamed from: setActivityPopAnimParam */
    public void m78558x15b795dc(int i17, int i18) {
        getIntent().putExtra("MMActivity.OverrideEnterAnimation", i17);
        getIntent().putExtra("MMActivity.OverrideExitAnimation", i18);
    }

    /* renamed from: setBackBtn */
    public void mo54448x9c8c0d33(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39322x2305be9.s0(onMenuItemClickListener, 0);
    }

    /* renamed from: setBackBtnColorFilter */
    public void m78559x68e5fd88(int i17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = gaVar.K;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(gaVar.f290205u.getResources().getColor(i17));
        }
    }

    /* renamed from: setBackBtnVisible */
    public void m78560xe21cbbf(boolean z17) {
        this.f39322x2305be9.t0(z17);
    }

    /* renamed from: setBackGroundColorResource */
    public void m78561xe5bc8f21(int i17) {
        this.f39322x2305be9.u0(i17);
    }

    /* renamed from: setBodyView */
    public final void m78562xdc0fe5e9(int i17) {
        this.f39322x2305be9.v0(i17);
    }

    /* renamed from: setBounceEnabled */
    public void m78563x4e0f6657(boolean z17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.f290208w = z17;
        ul5.k kVar = gaVar.f290207v;
        if (kVar != null) {
            kVar.mo82163x4e0f6657(z17);
        }
    }

    /* renamed from: setContentViewVisibility */
    public void mo67598xf0aced2e(int i17) {
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/ui/MMActivity", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 0) {
            m78602x5a7a36a0();
        } else {
            m78531x8f8cf1fb();
        }
    }

    /* renamed from: setCurController */
    public void m78564xfbba14ba(com.p314xaae8f345.mm.ui.ga gaVar) {
        this.f39322x2305be9 = gaVar;
    }

    /* renamed from: setCurrentStatusColor */
    public void m78565x45496f5a(int i17) {
        this.f39322x2305be9.G0(i17);
    }

    /* renamed from: setIconAlpha */
    public void m78566x7369a23(float f17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        android.view.View view = gaVar.f290164J;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "setIconAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/MMActivityController", "setIconAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (f17 == 0.0f) {
                gaVar.f290164J.setEnabled(false);
            } else {
                gaVar.f290164J.setEnabled(true);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = gaVar.U;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setAlpha(f17);
            if (f17 == 0.0f) {
                gaVar.U.setEnabled(false);
            } else {
                gaVar.U.setEnabled(true);
            }
        }
    }

    /* renamed from: setIsDarkActionbarBg */
    public void m78567x3bd95720(boolean z17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.R = z17;
        gaVar.O0(z17);
        gaVar.P0();
    }

    /* renamed from: setLightNavigationbarIcon */
    public void m78568xd7114f24() {
        android.view.View decorView = this.f39322x2305be9.f290203t.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
    }

    /* renamed from: setMMNormalView */
    public void m78569xd2a3374e() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar.f290205u != null) {
            gaVar.N(gaVar.f290203t);
        }
    }

    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        if (mo44431x663c095b() != -1) {
            setRequestedOrientation(mo44431x663c095b());
            return;
        }
        this.f39316x876ccafe = getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("settings_landscape_mode", false);
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_SUPPORT_ORIENTATION", false);
        if (this.f39316x876ccafe || booleanExtra) {
            com.p314xaae8f345.mm.ui.ee.c(1);
            setRequestedOrientation(-1);
        } else {
            com.p314xaae8f345.mm.ui.ee.c(0);
            setRequestedOrientation(1);
        }
    }

    /* renamed from: setMMSingleTitle */
    public void m78570x2a00680e(java.lang.String str) {
        this.f39322x2305be9.y0(str, null);
    }

    /* renamed from: setMMSubTitle */
    public void mo54449x3f86539a(java.lang.String str) {
        this.f39322x2305be9.A0(str);
    }

    @java.lang.Deprecated
    /* renamed from: setMMSubTitleColor */
    public void m78573x31241be9(int i17) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar.G == null || (textView = gaVar.N) == null) {
            return;
        }
        textView.setTextColor(i17);
        gaVar.f290198q0 = i17;
    }

    /* renamed from: setMMSubTitleEllipsize */
    public void m78574x6f33f413(android.text.TextUtils.TruncateAt truncateAt) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar.G == null || (textView = gaVar.N) == null) {
            return;
        }
        textView.setEllipsize(truncateAt);
    }

    /* renamed from: setMMSubTitleSize */
    public void m78575xa6c64abb(float f17) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar.G == null || (textView = gaVar.N) == null) {
            return;
        }
        textView.setTextSize(0, f17);
    }

    /* renamed from: setMMTitle */
    public void mo54450xbf7c1df6(java.lang.String str) {
        super.setTitle(str);
        this.f39322x2305be9.C0(str);
    }

    /* renamed from: setMMTitleColor */
    public void mo54451xb23a6b0d(int i17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar.G == null) {
            return;
        }
        gaVar.H.setTextColor(i17);
    }

    /* renamed from: setMMTitleSize */
    public void m78576x47d78717(float f17) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar.G == null || (textView = gaVar.H) == null) {
            return;
        }
        textView.setTextSize(0, f17);
    }

    /* renamed from: setMMTitleVisibility */
    public void m78577x7b07e1a8(int i17) {
        this.f39322x2305be9.D0(i17);
    }

    /* renamed from: setNavigationbarColor */
    public void mo78578x8b18f126(int i17) {
        this.f39322x2305be9.E0(i17);
        android.view.ViewGroup viewGroup = this.f39331xd9e73aa4;
        if (viewGroup instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) viewGroup).m81260xbba45cf8(i17);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) this.f39331xd9e73aa4).u();
        }
    }

    /* renamed from: setProgressIcon */
    public void m78579xc1fc21c8(int i17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar.G == null) {
            return;
        }
        gaVar.M.setIndeterminateDrawable(gaVar.x().getDrawable(i17));
    }

    /* renamed from: setProgressVisibility */
    public void m78580x7c0dd121(int i17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar.G == null) {
            return;
        }
        gaVar.M.setVisibility(i17);
    }

    @java.lang.Deprecated
    /* renamed from: setRedDotVisibilty */
    public void m78581x98c60ac7(int i17) {
    }

    /* renamed from: setScreenEnable */
    public void mo65198x1aec5e91(boolean z17) {
        this.f39322x2305be9.F0(z17);
    }

    /* renamed from: setSelfNavigationBarColor */
    public void m78582xfed654b2(int i17) {
        if (!com.p314xaae8f345.mm.ui.bl.f(mo55332x76847179())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "has not NavigationBar!");
            return;
        }
        if (this.f39330xde1af486 == null) {
            this.f39330xde1af486 = new android.view.View(mo55332x76847179());
            ((android.view.ViewGroup) getWindow().getDecorView()).addView(this.f39330xde1af486);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, com.p314xaae8f345.mm.ui.bl.c(mo55332x76847179()));
        layoutParams.gravity = 80;
        this.f39330xde1af486.setLayoutParams(layoutParams);
        this.f39330xde1af486.setBackgroundColor(i17);
        android.view.View view = this.f39330xde1af486;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setSelfNavigationBarVisible */
    public void m78583x85ccfe01(int i17) {
        android.view.View view = this.f39330xde1af486;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: setSmartGalleryEntryVisibility */
    public void m78584xbdfaa6d9(boolean z17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar != null) {
            gaVar.f290211z = z17;
            gaVar.N0();
        }
    }

    /* renamed from: setStatusBarShowStrategy */
    public void m78585xe3232baf(al5.r rVar) {
        if ((this.f39331xd9e73aa4 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) && com.p314xaae8f345.mm.ui.b4.c(this)) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) this.f39331xd9e73aa4).m81262xe4312112(rVar);
        }
    }

    /* renamed from: setTitleAlpha */
    public void m78586xb1075be8(float f17) {
        android.widget.TextView textView = this.f39322x2305be9.H;
        if (textView != null) {
            textView.setAlpha(f17);
        }
    }

    /* renamed from: setTitleBarClickListener */
    public void m78587xced74c3f(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        p012xc85e97e9.p016x746ad0e3.app.b bVar = gaVar.G;
        if (bVar == null || bVar.j() == null) {
            return;
        }
        gaVar.G.j().setOnClickListener(new com.p314xaae8f345.mm.ui.pa(gaVar, runnable, runnable2));
    }

    /* renamed from: setTitleBarDoubleClickListener */
    public void m78588xfb5745ae(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        p012xc85e97e9.p016x746ad0e3.app.b bVar = gaVar.G;
        if (bVar == null || runnable == null) {
            return;
        }
        bVar.j().setOnClickListener(new com.p314xaae8f345.mm.ui.oa(gaVar, runnable));
    }

    @java.lang.Deprecated
    /* renamed from: setTitleClickAction */
    public void m78589xf19404e8(android.view.GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
    }

    /* renamed from: setTitleDividerColor */
    public void m78590x1b667a00(int i17) {
        this.f39322x2305be9.getClass();
    }

    /* renamed from: setTitleDividerVis */
    public void m78591x7f5d15fd(boolean z17) {
        this.f39322x2305be9.getClass();
    }

    /* renamed from: setTitleForceNotifyIconVisibility */
    public void m78592x81128529(int i17) {
        this.f39322x2305be9.Y0();
    }

    /* renamed from: setTitleLogo */
    public void m78593xdc70a1e1(int i17, int i18) {
        this.f39322x2305be9.I0(i17, i18);
    }

    /* renamed from: setTitleMuteIconVisibility */
    public void m78594xca3c3c9a(int i17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.getClass();
        gaVar.f290199r = i17 == 0;
        gaVar.Y0();
    }

    /* renamed from: setTitlePhoneIconVisibility */
    public void m78595x81055a83(int i17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.getClass();
        gaVar.f290201s = i17 == 0;
        gaVar.Y0();
    }

    /* renamed from: setTitleVisibility */
    public void m78596x71afbec8(int i17) {
        this.f39322x2305be9.J0(i17);
    }

    @java.lang.Deprecated
    /* renamed from: setToTop */
    public void m78597x53c22598(android.view.View.OnClickListener onClickListener) {
    }

    /* renamed from: setTransparentTheme */
    public void m78598x47a8a819(boolean z17) {
        this.f39335xfbd3ab97 = z17;
    }

    /* renamed from: showActionbarLine */
    public void m78599xdf056fb4() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar.F() != null) {
            gaVar.F().G(1.0f);
        }
    }

    /* renamed from: showHomeBtn */
    public void m78600x5843c740(boolean z17) {
        this.f39322x2305be9.K0(z17);
    }

    /* renamed from: showMMLogo */
    public void m78601x22395ca8() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.K.setVisibility(8);
        android.view.View view = gaVar.f290164J;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "showMMLogo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/MMActivityController", "showMMLogo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: showOptionMenu */
    public void mo74408xb0dfae51(boolean z17) {
        this.f39322x2305be9.L0(true, -1, z17);
    }

    /* renamed from: showTitleView */
    public void m78602x5a7a36a0() {
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f39322x2305be9.G;
        if (bVar == null) {
            return;
        }
        bVar.L();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: showVKB */
    public void mo26063x7b383410() {
        com.p314xaae8f345.mm.ui.ga.M0(this.f39322x2305be9.f290203t);
    }

    /* renamed from: startActivity */
    public void m78603xa4df9991(java.lang.Class<?> cls) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, cls);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(la5.t0.class);
        hashSet.add(uj5.e.class);
        ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).wi(this, hashSet);
    }

    /* renamed from: supportLightStatusBar */
    public void m78605xc85f0ffa() {
        android.view.View decorView = this.f39322x2305be9.f290203t.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    /* renamed from: triggerActivityResult */
    public void m78606xf64f9fe4(int i17, int i18, android.content.Intent intent) {
        onActivityResult(i17, i18, intent);
    }

    /* renamed from: updataStatusBarIcon */
    public void m78607xef685e15(boolean z17) {
        this.f39322x2305be9.O0(z17);
    }

    /* renamed from: updateActionBarOperationAreaTxt */
    public void m78608x20ca2a90(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22596xee3b48b1 c22596xee3b48b1;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar == null || (c22596xee3b48b1 = gaVar.f290168b0) == null || c22596xee3b48b1.f292775f) {
            return;
        }
        c22596xee3b48b1.f292775f = true;
        c22596xee3b48b1.f292774e.animate().rotationBy(180.0f).setDuration(200L).withEndAction(new al5.c(c22596xee3b48b1, str)).start();
    }

    /* renamed from: updateBackBtn */
    public void m78609x92231eec(android.graphics.drawable.Drawable drawable) {
        this.f39322x2305be9.Q0(drawable);
    }

    /* renamed from: updateDescription */
    public void m78610x5546cb73(java.lang.String str) {
        this.f39322x2305be9.R0(str);
    }

    /* renamed from: updateOptionMenuIcon */
    public void m78611xf6ad1736(int i17, int i18) {
        this.f39322x2305be9.T0(i17, i18);
    }

    /* renamed from: updateOptionMenuListener */
    public void m78612x9ba2f8f1(int i17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        com.p314xaae8f345.mm.ui.eb E = this.f39322x2305be9.E(i17);
        if (E != null) {
            E.f289921n = onMenuItemClickListener;
            E.f289922o = onLongClickListener;
        }
    }

    /* renamed from: updateOptionMenuRedDot */
    public void m78613xf365e75(int i17, boolean z17) {
        this.f39322x2305be9.U0(i17, z17);
    }

    /* renamed from: updateOptionMenuRightButtonColor */
    public void m78614x49282ad2(int i17, int i18, int i19, int i27, int i28, boolean z17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        com.p314xaae8f345.mm.ui.eb E = gaVar.E(i17);
        if ((E == null || (E.f289924q == i18 && E.f289925r == i19 && E.f289926s == i27 && E.f289927t == i28)) && E.f289928u == z17) {
            return;
        }
        E.f289924q = i18;
        E.f289925r = i19;
        E.f289926s = i27;
        E.f289927t = i28;
        E.f289928u = z17;
        gaVar.N0();
    }

    /* renamed from: updateOptionMenuStyle */
    public void m78615xdf8a9a94(int i17, com.p314xaae8f345.mm.ui.fb fbVar) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        com.p314xaae8f345.mm.ui.eb E = gaVar.E(i17);
        if (E != null) {
            E.f289919l = fbVar;
            gaVar.N0();
        }
    }

    /* renamed from: updateOptionMenuText */
    public void mo60878xf6b21fea(int i17, java.lang.String str) {
        this.f39322x2305be9.V0(i17, str);
    }

    /* renamed from: updateStatusBarAndActionBarIconColor */
    public void m78616xfddc9a0c() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.S0();
        gaVar.O0(gaVar.R);
        gaVar.P0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActivityController", "updateStatusBarAndActionBarIconColor: isDarkActionBar = %s", java.lang.Boolean.valueOf(gaVar.R));
    }

    /* renamed from: initLanguage */
    public static java.util.Locale m78473x26f04c88(android.content.Context context, java.lang.String str) {
        if (str.equals("language_default")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.u(context, java.util.Locale.ENGLISH);
            return java.util.Locale.getDefault();
        }
        java.util.Locale s17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.s(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.u(context, s17);
        return s17;
    }

    /* renamed from: fullScreenNoTitleBar */
    public void m78506x1ef531b7(boolean z17, long j17) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        java.lang.Runnable runnable = gaVar.f290196p0;
        java.lang.Runnable runnable2 = gaVar.f290194o0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = gaVar.f290210y;
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.b bVar = gaVar.G;
            if (bVar != null) {
                bVar.o();
            }
            n3Var.mo50300x3fa464aa(runnable);
            n3Var.mo50300x3fa464aa(runnable2);
            n3Var.mo50297x7c4d7ca2(runnable2, j17);
            return;
        }
        gaVar.f290203t.getWindow().clearFlags(1024);
        n3Var.mo50300x3fa464aa(runnable2);
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, j17);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: hideVKB */
    public void mo53060x36654fab(android.view.View view) {
        this.f39322x2305be9.M(view);
    }

    /* renamed from: setBackBtn */
    public void mo74406x9c8c0d33(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i17) {
        this.f39322x2305be9.s0(onMenuItemClickListener, i17);
    }

    /* renamed from: setMMSubTitle */
    public void m78572x3f86539a(int i17) {
        this.f39322x2305be9.z0(i17);
    }

    /* renamed from: enableOptionMenu */
    public void m78500x43e00957(int i17, boolean z17) {
        this.f39322x2305be9.p(false, i17, z17);
    }

    /* renamed from: setMMSingleTitle */
    public void m78571x2a00680e(java.lang.String str, android.view.animation.Animation animation) {
        this.f39322x2305be9.y0(str, animation);
    }

    /* renamed from: setMMTitle */
    public void mo56583xbf7c1df6(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f39322x2305be9.B0(charSequence);
    }

    /* renamed from: showOptionMenu */
    public void mo74407xb0dfae51(int i17, boolean z17) {
        this.f39322x2305be9.L0(false, i17, z17);
    }

    /* renamed from: showVKB */
    public static void m78475x7b383410(android.app.Activity activity) {
        android.view.View currentFocus;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = activity.getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    /* renamed from: addIconOptionMenu */
    public void m78482x84f07bce(int i17, int i18, android.graphics.drawable.Drawable drawable, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39322x2305be9.h(i17, getString(i18), drawable, onMenuItemClickListener);
    }

    /* renamed from: addTextOptionMenu */
    public void m78490xd9193382(int i17, java.lang.String str, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.getClass();
        com.p314xaae8f345.mm.ui.fb fbVar = com.p314xaae8f345.mm.ui.fb.NORMAL;
        com.p314xaae8f345.mm.ui.eb ebVar = new com.p314xaae8f345.mm.ui.eb();
        ebVar.f289908a = i17;
        ebVar.f289915h = str;
        ebVar.f289916i = i18;
        ebVar.f289921n = onMenuItemClickListener;
        ebVar.f289922o = null;
        ebVar.f289919l = fbVar;
        gaVar.o0(i17);
        gaVar.D.add(ebVar);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.ua(gaVar), 200L);
    }

    /* renamed from: setActionbarFrosted */
    public void m78556x349cea08(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            this.f39322x2305be9.o(i17, i18, i19);
        } else {
            this.f39322x2305be9.n();
        }
    }

    /* renamed from: addIconOptionMenu */
    public void m78486x84f07bce(int i17, java.lang.String str, android.graphics.drawable.Drawable drawable, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39322x2305be9.h(i17, str, drawable, onMenuItemClickListener);
    }

    /* renamed from: initActionBarOperationAreaTxt */
    public void m78534xf5488c29(java.lang.String str, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22596xee3b48b1 c22596xee3b48b1;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar == null || (c22596xee3b48b1 = gaVar.f290168b0) == null) {
            return;
        }
        c22596xee3b48b1.f292773d.setText(str);
        c22596xee3b48b1.f292773d.setTextColor(c22596xee3b48b1.getContext().getResources().getColor(i17));
        ((android.widget.LinearLayout) c22596xee3b48b1.f292773d.getParent()).setBackground(c22596xee3b48b1.getContext().getResources().getDrawable(i27));
        c22596xee3b48b1.f292774e.m82040x7541828(c22596xee3b48b1.getContext().getResources().getColor(i18));
        ((android.widget.FrameLayout) c22596xee3b48b1.f292774e.getParent()).setBackground(c22596xee3b48b1.getContext().getResources().getDrawable(i19));
    }

    /* renamed from: setMMTitle */
    public void mo56582xbf7c1df6(int i17) {
        super.setTitle(i17);
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.C0(gaVar.f290205u.getString(i17));
    }

    /* renamed from: addIconOptionMenu */
    public void m78485x84f07bce(int i17, java.lang.String str, int i18, boolean z17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39322x2305be9.i(i17, i18, str, z17, onMenuItemClickListener, null, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    /* renamed from: addIconOptionMenu */
    public void m78484x84f07bce(int i17, java.lang.String str, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        mo78514x143f1b92().g(i17, str, i18, onMenuItemClickListener);
    }

    /* renamed from: addIconOptionMenu */
    public void m78478x84f07bce(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        mo78514x143f1b92().f(i17, i18, i19, onMenuItemClickListener);
    }

    /* renamed from: startActivity */
    public void m78604xa4df9991(java.lang.Class<?> cls, android.content.Intent intent) {
        intent.setClass(this, cls);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: addIconOptionMenu */
    public void m78480x84f07bce(int i17, int i18, int i19, boolean z17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.i(i17, i19, gaVar.f290205u.getString(i18), z17, onMenuItemClickListener, null, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    /* renamed from: addIconOptionMenu */
    public void m78481x84f07bce(int i17, int i18, int i19, boolean z17, boolean z18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = mo78514x143f1b92();
        java.lang.String string = mo78514x143f1b92.f290205u.getString(i18);
        com.p314xaae8f345.mm.ui.fb fbVar = com.p314xaae8f345.mm.ui.fb.NORMAL;
        com.p314xaae8f345.mm.ui.eb ebVar = new com.p314xaae8f345.mm.ui.eb();
        ebVar.f289908a = i17;
        ebVar.f289909b = i19;
        ebVar.f289915h = string;
        ebVar.f289921n = onMenuItemClickListener;
        ebVar.f289922o = null;
        ebVar.f289919l = fbVar;
        ebVar.f289920m = z17;
        if (i19 == com.p314xaae8f345.mm.R.C30861xcebc809e.f563513ap2 || i19 == com.p314xaae8f345.mm.R.raw.f80193xebd790ad || i19 == com.p314xaae8f345.mm.R.raw.f78355x20db789a || (i19 == com.p314xaae8f345.mm.R.raw.f80136xebd52499 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string))) {
            ebVar.f289915h = mo78514x143f1b92.f290205u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.w_);
        }
        mo78514x143f1b92.o0(ebVar.f289908a);
        java.util.LinkedList linkedList = mo78514x143f1b92.D;
        if (z18) {
            linkedList.addFirst(ebVar);
        } else {
            linkedList.add(ebVar);
        }
        mo78514x143f1b92.N0();
    }

    /* renamed from: addTextOptionMenu */
    public void m78492xd9193382(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        this.f39322x2305be9.i(i17, 0, str, false, onMenuItemClickListener, onLongClickListener, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    /* renamed from: addTextOptionMenu */
    public void m78494xd9193382(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener, com.p314xaae8f345.mm.ui.fb fbVar) {
        this.f39322x2305be9.i(i17, 0, str, false, onMenuItemClickListener, onLongClickListener, fbVar);
    }

    /* renamed from: addTextOptionMenu */
    public void m78493xd9193382(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener, android.view.View.OnTouchListener onTouchListener, com.p314xaae8f345.mm.ui.fb fbVar) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.getClass();
        com.p314xaae8f345.mm.ui.eb ebVar = new com.p314xaae8f345.mm.ui.eb();
        ebVar.f289908a = i17;
        ebVar.f289909b = 0;
        ebVar.f289915h = str;
        ebVar.f289921n = onMenuItemClickListener;
        ebVar.f289922o = onLongClickListener;
        ebVar.f289923p = onTouchListener;
        ebVar.f289919l = fbVar;
        ebVar.f289920m = false;
        gaVar.o0(i17);
        gaVar.D.add(ebVar);
        gaVar.N0();
    }

    /* renamed from: addIconOptionMenu */
    public void m78483x84f07bce(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        this.f39322x2305be9.i(i17, i18, "", false, onMenuItemClickListener, onLongClickListener, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }

    /* renamed from: addIconOptionMenu */
    public void m78479x84f07bce(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        gaVar.i(i17, i19, gaVar.f290205u.getString(i18), false, onMenuItemClickListener, onLongClickListener, com.p314xaae8f345.mm.ui.fb.NORMAL);
    }
}
