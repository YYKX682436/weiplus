package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.BaseFrActivity */
/* loaded from: classes9.dex */
public abstract class AbstractActivityC3282x418ff5cc extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: HARDCODE_TENPAY_KEYBOARD_HEIGHT */
    public static final int f12561xb9d95a72 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 270);
    public static final java.lang.String TAG = "MicroMsg.BaseFrActivity";

    /* renamed from: _hellAccFlag_ */
    private byte f12563x7f11beae;

    /* renamed from: mTenpayKBStateCallBackListener */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IWalletTenpayKBStateCallBackListener f12566xef78dc9b;

    /* renamed from: mTenpayKBStateListener */
    private com.p314xaae8f345.mm.p2802xd031a825.ui.m f12567xa7c89b16;

    /* renamed from: m_scrollViewBecouseOfKeyBoard */
    private android.view.View f12568x9fb08252 = null;

    /* renamed from: PWD_INPUT_VIEW_AND_KEYBOARD_GAP_PX */
    private final int f12562x5ee44cbe = 26;

    /* renamed from: isDestroyByThisFinish */
    private boolean f12564x24771418 = false;

    /* renamed from: isVKBFirstTimeShown */
    protected boolean f12565x123dbf17 = false;

    /* renamed from: com.tencent.kinda.framework.widget.base.BaseFrActivity$IEditFocusChangeCallback */
    /* loaded from: classes9.dex */
    public interface IEditFocusChangeCallback {
        /* renamed from: shouldKeepKeyboardOnEditClearFocus */
        boolean mo26065x6db4cdf3();
    }

    /* renamed from: com.tencent.kinda.framework.widget.base.BaseFrActivity$IWalletTenpayKBStateCallBackListener */
    /* loaded from: classes9.dex */
    public interface IWalletTenpayKBStateCallBackListener {
        /* renamed from: onCallBackKinda */
        void mo26066xff698e49(boolean z17, float f17, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061);
    }

    /* renamed from: topShowFragmentOf */
    public static com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 m26044x8ef48bd9(java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> list) {
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "fragmentList == null.");
            return null;
        }
        java.util.ListIterator<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061) listIterator.previous();
            if (!(abstractViewOnTouchListenerC3283x43ef4061 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "not a BaseFragment.");
            } else {
                if (!abstractViewOnTouchListenerC3283x43ef4061.m7483xdf9b8f74()) {
                    return abstractViewOnTouchListenerC3283x43ef4061;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "fragment is hidden, next.");
            }
        }
        return null;
    }

    /* renamed from: useKeyboardCoverMode */
    private boolean m26045x5b12c70c(java.lang.ref.WeakReference<com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010> weakReference) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010;
        if (weakReference == null || (abstractViewOnAttachStateChangeListenerC21400xb429b010 = weakReference.get()) == null || !(abstractViewOnAttachStateChangeListenerC21400xb429b010 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061)) {
            return false;
        }
        return ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061) abstractViewOnAttachStateChangeListenerC21400xb429b010).mo25486x5b12c70c();
    }

    /* renamed from: attachOnlyActivity */
    public void m26046xa70c0dc0() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.m27170xa70c0dc0(this);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity
    public android.view.View findViewById(int i17) {
        return super.findViewById(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        this.f12564x24771418 = true;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.m27171xb06a1793(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "BaseFrActivity finish exec! " + android.util.Log.getStackTraceString(new java.lang.Throwable("the stack of finish: ")));
    }

    /* renamed from: getKBLayout */
    public android.view.View m26048x11932cb7(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010) {
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "fragment == null");
            return m26047x11932cb7();
        }
        return abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.o1v);
    }

    /* renamed from: getKeyboard */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 m26050x99e0b15d(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010) {
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "fragment == null");
            return m26049x99e0b15d();
        }
        return (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26077x4ff8c0f0(com.p3249xcbb51f6b.R.id.f62750xe9b380d4);
    }

    /* renamed from: getTenpaySecureEditText */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 m26051x7f323baf() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 mo26064x748f9262 = mo26064x748f9262();
        if (mo26064x748f9262 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "fragment == null.");
            return null;
        }
        android.view.View mo26077x4ff8c0f0 = mo26064x748f9262.mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.pbn);
        if (mo26077x4ff8c0f0 instanceof com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) {
            return (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) mo26077x4ff8c0f0;
        }
        return null;
    }

    /* renamed from: hideTenpayKB */
    public void m26052xd46dd964() {
        m26053xd46dd964(null, null);
    }

    /* renamed from: needToShowClearIcon */
    public boolean m26054x58cbbb8(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359) {
        return (c28001xdd2bb359.getText().toString().equals("") || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.PASSWORD == c28001xdd2bb359.m121596x8f8b0df1() || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_PAYMENT == c28001xdd2bb359.m121596x8f8b0df1() || com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.EditState.CVV_4_PAYMENT == c28001xdd2bb359.m121596x8f8b0df1()) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onCreate");
        super.onCreate(bundle);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.m27169xac1eee45(this);
        int intExtra = getIntent().getIntExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13295x54f0f6fa, -1);
        if (intExtra != -1) {
            overridePendingTransition(intExtra, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onDestroy");
        if (!this.f12564x24771418) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.m27171xb06a1793(this);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.m27169xac1eee45(this);
    }

    /* renamed from: scrollTo */
    public void m26055xe8077228(android.view.View view, int i17, int i18) {
        if (view != null) {
            view.scrollTo(i17, i18);
        }
    }

    /* renamed from: scrollToFormEditPosAfterShowTenPay */
    public void m26056x97a0486(final android.view.View view, android.view.View view2, int i17) {
        if (view != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int k17 = (i65.a.k(mo55332x76847179()) - (iArr[1] + view2.getHeight())) - i65.a.b(mo55332x76847179(), i17);
            int i18 = f12561xb9d95a72;
            if (k17 <= 0 || k17 >= i18) {
                return;
            }
            final int i19 = i18 - k17;
            view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    view.scrollBy(0, i19);
                }
            });
        }
    }

    /* renamed from: setEditFocusListener */
    public void m26057x8f91b80(android.view.View view, int i17, boolean z17) {
        m26058x8f91b80(view, i17, z17, true);
    }

    /* renamed from: setTenpayKBStateCallBackListener */
    public void m26060x61b540c6(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener) {
        this.f12566xef78dc9b = iWalletTenpayKBStateCallBackListener;
    }

    /* renamed from: setTenpayKBStateListener */
    public void m26061xcfb55a41(com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar) {
        this.f12567xa7c89b16 = mVar;
    }

    /* renamed from: showTenpayKB */
    public void m26062x8022ec1f(final android.view.View view, java.lang.ref.WeakReference<com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010> weakReference) {
        if (view == null || view.isShown()) {
            return;
        }
        if (!m26045x5b12c70c(weakReference)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar = this.f12567xa7c89b16;
            if (mVar != null) {
                mVar.mo26891xca4e600e(true);
            }
            if (this.f12566xef78dc9b != null) {
                view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.f12566xef78dc9b.mo26066xff698e49(true, view.getHeight(), null);
                    }
                });
                return;
            }
            return;
        }
        android.view.View findViewById = view.findViewById(com.p3249xcbb51f6b.R.id.f62748x33428a22);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.p3249xcbb51f6b.R.id.f62751xd41a9ed3);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        final com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar2 = this.f12567xa7c89b16;
        final com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener = this.f12566xef78dc9b;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0);
        loadAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        loadAnimation.setDuration(200L);
        loadAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.5

            /* renamed from: _hellAccFlag_ */
            private byte f12599x7f11beae;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar3 = mVar2;
                if (mVar3 != null) {
                    mVar3.mo26891xca4e600e(true);
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener2 = iWalletTenpayKBStateCallBackListener;
                if (iWalletTenpayKBStateCallBackListener2 != null) {
                    iWalletTenpayKBStateCallBackListener2.mo26066xff698e49(true, view.getHeight(), null);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
                android.view.View view2 = view;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view2, arrayList5.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity$5", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/BaseFrActivity$5", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        });
        view.startAnimation(loadAnimation);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: showVKB */
    public void mo26063x7b383410() {
        android.view.View currentFocus;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) mo55332x76847179().getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    /* renamed from: topShowFragment */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 mo26064x748f9262() {
        return m26044x8ef48bd9(mo7595x9cdc264().m7675x1626d96d());
    }

    /* renamed from: hideTenpayKB */
    public void m26053xd46dd964(final android.view.View view, java.lang.ref.WeakReference<com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010> weakReference) {
        if (view == null || !view.isShown()) {
            return;
        }
        if (m26045x5b12c70c(weakReference)) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
            loadAnimation.setDuration(200L);
            loadAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
            final com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar = this.f12567xa7c89b16;
            final com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener = this.f12566xef78dc9b;
            loadAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.4

                /* renamed from: _hellAccFlag_ */
                private byte f12594x7f11beae;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(android.view.animation.Animation animation) {
                    android.view.View view2 = view;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/BaseFrActivity$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar2 = mVar;
                    if (mVar2 != null) {
                        mVar2.mo26891xca4e600e(false);
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener2 = iWalletTenpayKBStateCallBackListener;
                    if (iWalletTenpayKBStateCallBackListener2 != null) {
                        iWalletTenpayKBStateCallBackListener2.mo26066xff698e49(false, view.getHeight(), null);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(android.view.animation.Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(android.view.animation.Animation animation) {
                }
            });
            view.startAnimation(loadAnimation);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "hideTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "hideTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2802xd031a825.ui.m mVar2 = this.f12567xa7c89b16;
        if (mVar2 != null) {
            mVar2.mo26891xca4e600e(false);
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener2 = this.f12566xef78dc9b;
        if (iWalletTenpayKBStateCallBackListener2 != null) {
            iWalletTenpayKBStateCallBackListener2.mo26066xff698e49(false, view.getHeight(), null);
        }
    }

    /* renamed from: setEditFocusListener */
    public void m26058x8f91b80(android.view.View view, int i17, boolean z17, boolean z18) {
        m26059x8f91b80(view, i17, z17, z18, null, false, null);
    }

    /* renamed from: setEditFocusListener */
    public void m26059x8f91b80(final android.view.View view, final int i17, final boolean z17, final boolean z18, final com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, boolean z19, final com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IEditFocusChangeCallback iEditFocusChangeCallback) {
        final com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 m26050x99e0b15d = m26050x99e0b15d(abstractViewOnAttachStateChangeListenerC21400xb429b010);
        final android.view.View m26048x11932cb7 = m26048x11932cb7(abstractViewOnAttachStateChangeListenerC21400xb429b010);
        if (m26050x99e0b15d == null || m26048x11932cb7 == null) {
            return;
        }
        android.view.View findViewById = m26048x11932cb7.findViewById(com.p3249xcbb51f6b.R.id.f62751xd41a9ed3);
        android.view.View findViewById2 = m26048x11932cb7.findViewById(com.p3249xcbb51f6b.R.id.f62748x33428a22);
        if (z19) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "setEditFocusListener", "(Landroid/view/View;IZZLcom/tencent/mm/ui/MMFragment;ZLcom/tencent/kinda/framework/widget/base/BaseFrActivity$IEditFocusChangeCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        final android.widget.EditText editText = view instanceof com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 ? (android.widget.EditText) view : (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.pbn);
        if (editText == null) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText);
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(abstractViewOnAttachStateChangeListenerC21400xb429b010);
        editText.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(final android.view.View view2, boolean z27) {
                if (!view2.isFocused() || z17) {
                    android.view.View view3 = view;
                    java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
                    if (view3 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p0(view3, m26050x99e0b15d);
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.IEditFocusChangeCallback iEditFocusChangeCallback2 = iEditFocusChangeCallback;
                    final boolean mo26065x6db4cdf3 = iEditFocusChangeCallback2 != null ? iEditFocusChangeCallback2.mo26065x6db4cdf3() : false;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!mo26065x6db4cdf3) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1 anonymousClass1 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1.this;
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.m26053xd46dd964(m26048x11932cb7, weakReference);
                            }
                            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.f12568x9fb08252 != null) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.f12568x9fb08252.scrollTo(0, 0);
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.f12568x9fb08252 = null;
                            }
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1 anonymousClass12 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1.this;
                            if (z17) {
                                ((android.view.inputmethod.InputMethodManager) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.mo55332x76847179().getSystemService("input_method")).showSoftInput(editText, 0);
                            }
                        }
                    };
                    java.lang.ref.WeakReference weakReference2 = weakReference;
                    if (weakReference2 != null && (weakReference2.get() instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd) && ((com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd) weakReference.get()).mo25485xa1e9f293()) {
                        view2.post(runnable);
                    } else {
                        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(runnable, 200L);
                    }
                } else {
                    ((android.view.inputmethod.InputMethodManager) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                    java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1 anonymousClass1 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1.this;
                            android.view.View m26048x11932cb72 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.m26048x11932cb7(abstractViewOnAttachStateChangeListenerC21400xb429b010);
                            android.view.View view4 = m26048x11932cb7;
                            if (view4 == m26048x11932cb72) {
                                if (!view4.isShown() && view2.getVisibility() == 0) {
                                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1 anonymousClass12 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1.this;
                                    if (z18 || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.f12565x123dbf17) {
                                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc abstractActivityC3282x418ff5cc = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this;
                                        abstractActivityC3282x418ff5cc.f12565x123dbf17 = true;
                                        abstractActivityC3282x418ff5cc.m26062x8022ec1f(m26048x11932cb7, weakReference);
                                    }
                                }
                                android.view.View view5 = view;
                                if (view5 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) {
                                    com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) view5;
                                    if ((c01.z1.I() || viewOnFocusChangeListenerC22907xe18534c2.m83170x84e6382c() == 100) && (!c01.z1.I() || viewOnFocusChangeListenerC22907xe18534c2.m83170x84e6382c() == 0)) {
                                        m26050x99e0b15d.m121468xa24be148();
                                        editText.setAccessibilityDelegate(null);
                                    } else {
                                        com.p314xaae8f345.mm.p2802xd031a825.e eVar = new com.p314xaae8f345.mm.p2802xd031a825.e(true);
                                        m26050x99e0b15d.m121472x2408cb55(eVar);
                                        editText.setAccessibilityDelegate(eVar);
                                    }
                                }
                                if (view instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
                                    com.p314xaae8f345.mm.p2802xd031a825.e eVar2 = new com.p314xaae8f345.mm.p2802xd031a825.e(true);
                                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.mo55332x76847179();
                                    java.util.regex.Pattern pattern2 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
                                    m26050x99e0b15d.m121472x2408cb55(eVar2);
                                    editText.setAccessibilityDelegate(eVar2);
                                }
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1 anonymousClass13 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1.this;
                                android.view.View view6 = view;
                                java.util.regex.Pattern pattern3 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
                                if (view6 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
                                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.N(view6, m26050x99e0b15d);
                                }
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1 anonymousClass14 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.AnonymousClass1.this;
                                m26050x99e0b15d.m121476x53eb72f9(i17);
                                m26050x99e0b15d.m121469xce4186ff((android.widget.EditText) view2);
                                ((android.view.inputmethod.InputMethodManager) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                            }
                        }
                    };
                    java.lang.ref.WeakReference weakReference3 = weakReference;
                    if (weakReference3 != null && (weakReference3.get() instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd) && ((com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd) weakReference.get()).mo25485xa1e9f293()) {
                        view2.post(runnable2);
                    } else {
                        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(runnable2, 300L);
                    }
                }
                if (view2 instanceof com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) {
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) view2;
                    if (c28001xdd2bb359.getTag() instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622 c3331x1644c622 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622) c28001xdd2bb359.getTag();
                        if (!c28001xdd2bb359.isFocused()) {
                            c3331x1644c622.m26887xb9920496(false);
                            c3331x1644c622.m26829xcc0eb552();
                            return;
                        } else {
                            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.m26054x58cbbb8(c28001xdd2bb359)) {
                                c3331x1644c622.m26887xb9920496(true);
                                return;
                            }
                            return;
                        }
                    }
                    if (c28001xdd2bb359.getTag() instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3297xcd1e1f35) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3297xcd1e1f35 c3297xcd1e1f35 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3297xcd1e1f35) c28001xdd2bb359.getTag();
                        if (c28001xdd2bb359.isFocused()) {
                            return;
                        }
                        c3297xcd1e1f35.m26397x1241dd72();
                        return;
                    }
                    if (c28001xdd2bb359.getTag() instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b) {
                        if (!c28001xdd2bb359.isFocused()) {
                            ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b) c28001xdd2bb359.getTag()).m26660xb9920496(false);
                            return;
                        } else {
                            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.m26054x58cbbb8(c28001xdd2bb359)) {
                                ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3311xaab48c3b) c28001xdd2bb359.getTag()).m26660xb9920496(true);
                                return;
                            }
                            return;
                        }
                    }
                    if (!c28001xdd2bb359.isFocused()) {
                        c28001xdd2bb359.setCompoundDrawables(c28001xdd2bb359.getCompoundDrawables()[0], c28001xdd2bb359.getCompoundDrawables()[1], null, c28001xdd2bb359.getCompoundDrawables()[3]);
                    } else if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.m26054x58cbbb8(c28001xdd2bb359)) {
                        c28001xdd2bb359.setCompoundDrawables(c28001xdd2bb359.getCompoundDrawables()[0], c28001xdd2bb359.getCompoundDrawables()[1], c28001xdd2bb359.m121595x514f9e03(), c28001xdd2bb359.getCompoundDrawables()[3]);
                    }
                }
            }
        });
        editText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                if (!m26048x11932cb7.isShown() && !z17) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.m26062x8022ec1f(m26048x11932cb7, weakReference);
                    m26050x99e0b15d.m121476x53eb72f9(i17);
                } else if (z17) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.m26053xd46dd964(m26048x11932cb7, weakReference);
                    ((android.view.inputmethod.InputMethodManager) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.mo55332x76847179().getSystemService("input_method")).showSoftInput(editText, 0);
                }
            }
        });
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.m26053xd46dd964(m26048x11932cb7, weakReference);
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.f12568x9fb08252 != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.f12568x9fb08252.scrollTo(0, 0);
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.this.f12568x9fb08252 = null;
                }
            }
        });
    }

    /* renamed from: getKBLayout */
    public android.view.View m26047x11932cb7() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 mo26064x748f9262 = mo26064x748f9262();
        if (mo26064x748f9262 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "fragment == null.");
            return null;
        }
        return mo26064x748f9262.mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.o1v);
    }

    /* renamed from: getKeyboard */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 m26049x99e0b15d() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 mo26064x748f9262 = mo26064x748f9262();
        if (mo26064x748f9262 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "fragment == null.");
            return null;
        }
        return (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) mo26064x748f9262.mo26077x4ff8c0f0(com.p3249xcbb51f6b.R.id.f62750xe9b380d4);
    }
}
