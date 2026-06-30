package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public abstract class BaseFrActivity extends com.tencent.mm.ui.MMActivity {
    public static final int HARDCODE_TENPAY_KEYBOARD_HEIGHT = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 270);
    public static final java.lang.String TAG = "MicroMsg.BaseFrActivity";
    private byte _hellAccFlag_;
    public com.tencent.kinda.framework.widget.base.BaseFrActivity.IWalletTenpayKBStateCallBackListener mTenpayKBStateCallBackListener;
    private com.tencent.mm.wallet_core.ui.m mTenpayKBStateListener;
    private android.view.View m_scrollViewBecouseOfKeyBoard = null;
    private final int PWD_INPUT_VIEW_AND_KEYBOARD_GAP_PX = 26;
    private boolean isDestroyByThisFinish = false;
    protected boolean isVKBFirstTimeShown = false;

    /* loaded from: classes9.dex */
    public interface IEditFocusChangeCallback {
        boolean shouldKeepKeyboardOnEditClearFocus();
    }

    /* loaded from: classes9.dex */
    public interface IWalletTenpayKBStateCallBackListener {
        void onCallBackKinda(boolean z17, float f17, com.tencent.kinda.framework.widget.base.BaseFragment baseFragment);
    }

    public static com.tencent.kinda.framework.widget.base.BaseFragment topShowFragmentOf(java.util.List<androidx.fragment.app.Fragment> list) {
        if (list == null) {
            com.tencent.mars.xlog.Log.e(TAG, "fragmentList == null.");
            return null;
        }
        java.util.ListIterator<androidx.fragment.app.Fragment> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            com.tencent.kinda.framework.widget.base.BaseFragment baseFragment = (com.tencent.kinda.framework.widget.base.BaseFragment) listIterator.previous();
            if (!(baseFragment instanceof com.tencent.kinda.framework.widget.base.BaseFragment)) {
                com.tencent.mars.xlog.Log.e(TAG, "not a BaseFragment.");
            } else {
                if (!baseFragment.isHidden()) {
                    return baseFragment;
                }
                com.tencent.mars.xlog.Log.e(TAG, "fragment is hidden, next.");
            }
        }
        return null;
    }

    private boolean useKeyboardCoverMode(java.lang.ref.WeakReference<com.tencent.mm.ui.MMFragment> weakReference) {
        com.tencent.mm.ui.MMFragment mMFragment;
        if (weakReference == null || (mMFragment = weakReference.get()) == null || !(mMFragment instanceof com.tencent.kinda.framework.widget.base.BaseFragment)) {
            return false;
        }
        return ((com.tencent.kinda.framework.widget.base.BaseFragment) mMFragment).useKeyboardCoverMode();
    }

    public void attachOnlyActivity() {
        com.tencent.kinda.framework.widget.tools.ActivityController.attachOnlyActivity(this);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public android.view.View findViewById(int i17) {
        return super.findViewById(i17);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        this.isDestroyByThisFinish = true;
        com.tencent.kinda.framework.widget.tools.ActivityController.detach(this);
        com.tencent.mars.xlog.Log.i(TAG, "BaseFrActivity finish exec! " + android.util.Log.getStackTraceString(new java.lang.Throwable("the stack of finish: ")));
    }

    public android.view.View getKBLayout(com.tencent.mm.ui.MMFragment mMFragment) {
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "fragment == null");
            return getKBLayout();
        }
        return mMFragment.findViewById(com.tencent.mm.R.id.o1v);
    }

    public com.tenpay.android.wechat.MyKeyboardWindow getKeyboard(com.tencent.mm.ui.MMFragment mMFragment) {
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "fragment == null");
            return getKeyboard();
        }
        return (com.tenpay.android.wechat.MyKeyboardWindow) mMFragment.findViewById(com.tenpay.R.id.tenpay_num_keyboard);
    }

    public com.tenpay.android.wechat.TenpaySecureEditText getTenpaySecureEditText() {
        com.tencent.kinda.framework.widget.base.BaseFragment baseFragment = topShowFragment();
        if (baseFragment == null) {
            com.tencent.mars.xlog.Log.e(TAG, "fragment == null.");
            return null;
        }
        android.view.View findViewById = baseFragment.findViewById(com.tencent.mm.R.id.pbn);
        if (findViewById instanceof com.tenpay.android.wechat.TenpaySecureEditText) {
            return (com.tenpay.android.wechat.TenpaySecureEditText) findViewById;
        }
        return null;
    }

    public void hideTenpayKB() {
        hideTenpayKB(null, null);
    }

    public boolean needToShowClearIcon(com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText) {
        return (tenpaySecureEditText.getText().toString().equals("") || com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD == tenpaySecureEditText.getEditState() || com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT == tenpaySecureEditText.getEditState() || com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT == tenpaySecureEditText.getEditState()) ? false : true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(TAG, "onCreate");
        super.onCreate(bundle);
        com.tencent.kinda.framework.widget.tools.ActivityController.attach(this);
        int intExtra = getIntent().getIntExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_ENTER_ANIMATION, -1);
        if (intExtra != -1) {
            overridePendingTransition(intExtra, 0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(TAG, "onDestroy");
        if (!this.isDestroyByThisFinish) {
            com.tencent.kinda.framework.widget.tools.ActivityController.detach(this);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.kinda.framework.widget.tools.ActivityController.attach(this);
    }

    public void scrollTo(android.view.View view, int i17, int i18) {
        if (view != null) {
            view.scrollTo(i17, i18);
        }
    }

    public void scrollToFormEditPosAfterShowTenPay(final android.view.View view, android.view.View view2, int i17) {
        if (view != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int k17 = (i65.a.k(getContext()) - (iArr[1] + view2.getHeight())) - i65.a.b(getContext(), i17);
            int i18 = HARDCODE_TENPAY_KEYBOARD_HEIGHT;
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

    public void setEditFocusListener(android.view.View view, int i17, boolean z17) {
        setEditFocusListener(view, i17, z17, true);
    }

    public void setTenpayKBStateCallBackListener(com.tencent.kinda.framework.widget.base.BaseFrActivity.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener) {
        this.mTenpayKBStateCallBackListener = iWalletTenpayKBStateCallBackListener;
    }

    public void setTenpayKBStateListener(com.tencent.mm.wallet_core.ui.m mVar) {
        this.mTenpayKBStateListener = mVar;
    }

    public void showTenpayKB(final android.view.View view, java.lang.ref.WeakReference<com.tencent.mm.ui.MMFragment> weakReference) {
        if (view == null || view.isShown()) {
            return;
        }
        if (!useKeyboardCoverMode(weakReference)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.wallet_core.ui.m mVar = this.mTenpayKBStateListener;
            if (mVar != null) {
                mVar.onVisibleStateChange(true);
            }
            if (this.mTenpayKBStateCallBackListener != null) {
                view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.kinda.framework.widget.base.BaseFrActivity.this.mTenpayKBStateCallBackListener.onCallBackKinda(true, view.getHeight(), null);
                    }
                });
                return;
            }
            return;
        }
        android.view.View findViewById = view.findViewById(com.tenpay.R.id.tenpay_keyboard_top_line);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "showTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.tenpay.R.id.tenpay_push_down);
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
        final com.tencent.mm.wallet_core.ui.m mVar2 = this.mTenpayKBStateListener;
        final com.tencent.kinda.framework.widget.base.BaseFrActivity.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener = this.mTenpayKBStateCallBackListener;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477876e0);
        loadAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        loadAnimation.setDuration(200L);
        loadAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.5
            private byte _hellAccFlag_;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                com.tencent.mm.wallet_core.ui.m mVar3 = mVar2;
                if (mVar3 != null) {
                    mVar3.onVisibleStateChange(true);
                }
                com.tencent.kinda.framework.widget.base.BaseFrActivity.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener2 = iWalletTenpayKBStateCallBackListener;
                if (iWalletTenpayKBStateCallBackListener2 != null) {
                    iWalletTenpayKBStateCallBackListener2.onCallBackKinda(true, view.getHeight(), null);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
                android.view.View view2 = view;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view2, arrayList5.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity$5", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/BaseFrActivity$5", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        });
        view.startAnimation(loadAnimation);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public void showVKB() {
        android.view.View currentFocus;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    public com.tencent.kinda.framework.widget.base.BaseFragment topShowFragment() {
        return topShowFragmentOf(getSupportFragmentManager().getFragments());
    }

    public void hideTenpayKB(final android.view.View view, java.lang.ref.WeakReference<com.tencent.mm.ui.MMFragment> weakReference) {
        if (view == null || !view.isShown()) {
            return;
        }
        if (useKeyboardCoverMode(weakReference)) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477877e1);
            loadAnimation.setDuration(200L);
            loadAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
            final com.tencent.mm.wallet_core.ui.m mVar = this.mTenpayKBStateListener;
            final com.tencent.kinda.framework.widget.base.BaseFrActivity.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener = this.mTenpayKBStateCallBackListener;
            loadAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.4
                private byte _hellAccFlag_;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(android.view.animation.Animation animation) {
                    android.view.View view2 = view;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/BaseFrActivity$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.tencent.mm.wallet_core.ui.m mVar2 = mVar;
                    if (mVar2 != null) {
                        mVar2.onVisibleStateChange(false);
                    }
                    com.tencent.kinda.framework.widget.base.BaseFrActivity.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener2 = iWalletTenpayKBStateCallBackListener;
                    if (iWalletTenpayKBStateCallBackListener2 != null) {
                        iWalletTenpayKBStateCallBackListener2.onCallBackKinda(false, view.getHeight(), null);
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
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseFrActivity", "hideTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/kinda/framework/widget/base/BaseFrActivity", "hideTenpayKB", "(Landroid/view/View;Ljava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.wallet_core.ui.m mVar2 = this.mTenpayKBStateListener;
        if (mVar2 != null) {
            mVar2.onVisibleStateChange(false);
        }
        com.tencent.kinda.framework.widget.base.BaseFrActivity.IWalletTenpayKBStateCallBackListener iWalletTenpayKBStateCallBackListener2 = this.mTenpayKBStateCallBackListener;
        if (iWalletTenpayKBStateCallBackListener2 != null) {
            iWalletTenpayKBStateCallBackListener2.onCallBackKinda(false, view.getHeight(), null);
        }
    }

    public void setEditFocusListener(android.view.View view, int i17, boolean z17, boolean z18) {
        setEditFocusListener(view, i17, z17, z18, null, false, null);
    }

    public void setEditFocusListener(final android.view.View view, final int i17, final boolean z17, final boolean z18, final com.tencent.mm.ui.MMFragment mMFragment, boolean z19, final com.tencent.kinda.framework.widget.base.BaseFrActivity.IEditFocusChangeCallback iEditFocusChangeCallback) {
        final com.tenpay.android.wechat.MyKeyboardWindow keyboard = getKeyboard(mMFragment);
        final android.view.View kBLayout = getKBLayout(mMFragment);
        if (keyboard == null || kBLayout == null) {
            return;
        }
        android.view.View findViewById = kBLayout.findViewById(com.tenpay.R.id.tenpay_push_down);
        android.view.View findViewById2 = kBLayout.findViewById(com.tenpay.R.id.tenpay_keyboard_top_line);
        if (z19) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
        final android.widget.EditText editText = view instanceof com.tenpay.android.wechat.TenpaySecureEditText ? (android.widget.EditText) view : (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.pbn);
        if (editText == null) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(mMFragment);
        editText.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(final android.view.View view2, boolean z27) {
                if (!view2.isFocused() || z17) {
                    android.view.View view3 = view;
                    java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
                    if (view3 instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
                        com.tencent.mm.wallet_core.ui.r1.p0(view3, keyboard);
                    }
                    com.tencent.kinda.framework.widget.base.BaseFrActivity.IEditFocusChangeCallback iEditFocusChangeCallback2 = iEditFocusChangeCallback;
                    final boolean shouldKeepKeyboardOnEditClearFocus = iEditFocusChangeCallback2 != null ? iEditFocusChangeCallback2.shouldKeepKeyboardOnEditClearFocus() : false;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!shouldKeepKeyboardOnEditClearFocus) {
                                com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1 anonymousClass1 = com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1.this;
                                com.tencent.kinda.framework.widget.base.BaseFrActivity.this.hideTenpayKB(kBLayout, weakReference);
                            }
                            if (com.tencent.kinda.framework.widget.base.BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard != null) {
                                com.tencent.kinda.framework.widget.base.BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard.scrollTo(0, 0);
                                com.tencent.kinda.framework.widget.base.BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard = null;
                            }
                            com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1 anonymousClass12 = com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1.this;
                            if (z17) {
                                ((android.view.inputmethod.InputMethodManager) com.tencent.kinda.framework.widget.base.BaseFrActivity.this.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
                            }
                        }
                    };
                    java.lang.ref.WeakReference weakReference2 = weakReference;
                    if (weakReference2 != null && (weakReference2.get() instanceof com.tencent.kinda.framework.app.ModalFragment) && ((com.tencent.kinda.framework.app.ModalFragment) weakReference.get()).useImmediateKeyboardAnimation()) {
                        view2.post(runnable);
                    } else {
                        new com.tencent.mm.sdk.platformtools.n3().postDelayed(runnable, 200L);
                    }
                } else {
                    ((android.view.inputmethod.InputMethodManager) com.tencent.kinda.framework.widget.base.BaseFrActivity.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                    java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1 anonymousClass1 = com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1.this;
                            android.view.View kBLayout2 = com.tencent.kinda.framework.widget.base.BaseFrActivity.this.getKBLayout(mMFragment);
                            android.view.View view4 = kBLayout;
                            if (view4 == kBLayout2) {
                                if (!view4.isShown() && view2.getVisibility() == 0) {
                                    com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1 anonymousClass12 = com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1.this;
                                    if (z18 || com.tencent.kinda.framework.widget.base.BaseFrActivity.this.isVKBFirstTimeShown) {
                                        com.tencent.kinda.framework.widget.base.BaseFrActivity baseFrActivity = com.tencent.kinda.framework.widget.base.BaseFrActivity.this;
                                        baseFrActivity.isVKBFirstTimeShown = true;
                                        baseFrActivity.showTenpayKB(kBLayout, weakReference);
                                    }
                                }
                                android.view.View view5 = view;
                                if (view5 instanceof com.tencent.mm.wallet_core.ui.formview.WalletFormView) {
                                    com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) view5;
                                    if ((c01.z1.I() || walletFormView.getEncrptType() == 100) && (!c01.z1.I() || walletFormView.getEncrptType() == 0)) {
                                        keyboard.resetSecureAccessibility();
                                        editText.setAccessibilityDelegate(null);
                                    } else {
                                        com.tencent.mm.wallet_core.e eVar = new com.tencent.mm.wallet_core.e(true);
                                        keyboard.setSecureAccessibility(eVar);
                                        editText.setAccessibilityDelegate(eVar);
                                    }
                                }
                                if (view instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
                                    com.tencent.mm.wallet_core.e eVar2 = new com.tencent.mm.wallet_core.e(true);
                                    com.tencent.kinda.framework.widget.base.BaseFrActivity.this.getContext();
                                    java.util.regex.Pattern pattern2 = com.tencent.mm.wallet_core.ui.r1.f214222a;
                                    keyboard.setSecureAccessibility(eVar2);
                                    editText.setAccessibilityDelegate(eVar2);
                                }
                                com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1 anonymousClass13 = com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1.this;
                                android.view.View view6 = view;
                                java.util.regex.Pattern pattern3 = com.tencent.mm.wallet_core.ui.r1.f214222a;
                                if (view6 instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
                                    com.tencent.mm.wallet_core.ui.r1.N(view6, keyboard);
                                }
                                com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1 anonymousClass14 = com.tencent.kinda.framework.widget.base.BaseFrActivity.AnonymousClass1.this;
                                keyboard.setXMode(i17);
                                keyboard.setInputEditText((android.widget.EditText) view2);
                                ((android.view.inputmethod.InputMethodManager) com.tencent.kinda.framework.widget.base.BaseFrActivity.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                            }
                        }
                    };
                    java.lang.ref.WeakReference weakReference3 = weakReference;
                    if (weakReference3 != null && (weakReference3.get() instanceof com.tencent.kinda.framework.app.ModalFragment) && ((com.tencent.kinda.framework.app.ModalFragment) weakReference.get()).useImmediateKeyboardAnimation()) {
                        view2.post(runnable2);
                    } else {
                        new com.tencent.mm.sdk.platformtools.n3().postDelayed(runnable2, 300L);
                    }
                }
                if (view2 instanceof com.tenpay.android.wechat.TenpaySecureEditText) {
                    com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = (com.tenpay.android.wechat.TenpaySecureEditText) view2;
                    if (tenpaySecureEditText.getTag() instanceof com.tencent.kinda.framework.widget.base.MMKEditText) {
                        com.tencent.kinda.framework.widget.base.MMKEditText mMKEditText = (com.tencent.kinda.framework.widget.base.MMKEditText) tenpaySecureEditText.getTag();
                        if (!tenpaySecureEditText.isFocused()) {
                            mMKEditText.setVisibleClearIcon(false);
                            mMKEditText.callBackKindaTextEndEditing();
                            return;
                        } else {
                            if (com.tencent.kinda.framework.widget.base.BaseFrActivity.this.needToShowClearIcon(tenpaySecureEditText)) {
                                mMKEditText.setVisibleClearIcon(true);
                                return;
                            }
                            return;
                        }
                    }
                    if (tenpaySecureEditText.getTag() instanceof com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl) {
                        com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl kindaCardNumberEditViewImpl = (com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl) tenpaySecureEditText.getTag();
                        if (tenpaySecureEditText.isFocused()) {
                            return;
                        }
                        kindaCardNumberEditViewImpl.callbackKindaTextEndEditing();
                        return;
                    }
                    if (tenpaySecureEditText.getTag() instanceof com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl) {
                        if (!tenpaySecureEditText.isFocused()) {
                            ((com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl) tenpaySecureEditText.getTag()).setVisibleClearIcon(false);
                            return;
                        } else {
                            if (com.tencent.kinda.framework.widget.base.BaseFrActivity.this.needToShowClearIcon(tenpaySecureEditText)) {
                                ((com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl) tenpaySecureEditText.getTag()).setVisibleClearIcon(true);
                                return;
                            }
                            return;
                        }
                    }
                    if (!tenpaySecureEditText.isFocused()) {
                        tenpaySecureEditText.setCompoundDrawables(tenpaySecureEditText.getCompoundDrawables()[0], tenpaySecureEditText.getCompoundDrawables()[1], null, tenpaySecureEditText.getCompoundDrawables()[3]);
                    } else if (com.tencent.kinda.framework.widget.base.BaseFrActivity.this.needToShowClearIcon(tenpaySecureEditText)) {
                        tenpaySecureEditText.setCompoundDrawables(tenpaySecureEditText.getCompoundDrawables()[0], tenpaySecureEditText.getCompoundDrawables()[1], tenpaySecureEditText.getClearBtnDrawable(), tenpaySecureEditText.getCompoundDrawables()[3]);
                    }
                }
            }
        });
        editText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                if (!kBLayout.isShown() && !z17) {
                    com.tencent.kinda.framework.widget.base.BaseFrActivity.this.showTenpayKB(kBLayout, weakReference);
                    keyboard.setXMode(i17);
                } else if (z17) {
                    com.tencent.kinda.framework.widget.base.BaseFrActivity.this.hideTenpayKB(kBLayout, weakReference);
                    ((android.view.inputmethod.InputMethodManager) com.tencent.kinda.framework.widget.base.BaseFrActivity.this.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
                }
            }
        });
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFrActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.tencent.kinda.framework.widget.base.BaseFrActivity.this.hideTenpayKB(kBLayout, weakReference);
                if (com.tencent.kinda.framework.widget.base.BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard != null) {
                    com.tencent.kinda.framework.widget.base.BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard.scrollTo(0, 0);
                    com.tencent.kinda.framework.widget.base.BaseFrActivity.this.m_scrollViewBecouseOfKeyBoard = null;
                }
            }
        });
    }

    public android.view.View getKBLayout() {
        com.tencent.kinda.framework.widget.base.BaseFragment baseFragment = topShowFragment();
        if (baseFragment == null) {
            com.tencent.mars.xlog.Log.e(TAG, "fragment == null.");
            return null;
        }
        return baseFragment.findViewById(com.tencent.mm.R.id.o1v);
    }

    public com.tenpay.android.wechat.MyKeyboardWindow getKeyboard() {
        com.tencent.kinda.framework.widget.base.BaseFragment baseFragment = topShowFragment();
        if (baseFragment == null) {
            com.tencent.mars.xlog.Log.e(TAG, "fragment == null.");
            return null;
        }
        return (com.tenpay.android.wechat.MyKeyboardWindow) baseFragment.findViewById(com.tenpay.R.id.tenpay_num_keyboard);
    }
}
