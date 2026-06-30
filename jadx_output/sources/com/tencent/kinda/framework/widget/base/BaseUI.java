package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class BaseUI implements com.tencent.kinda.framework.widget.base.IExtendUI {
    public static final int HARDCODE_TENPAY_KEYBOARD_HEIGHT = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 270);
    public static final java.lang.String TAG = "MicroMsg.BaseUI";
    private byte _hellAccFlag_;
    protected boolean isVKBFirstTimeShown = false;
    protected android.view.View mKBLayout;
    protected com.tenpay.android.wechat.MyKeyboardWindow mKeyboard;
    private com.tencent.mm.wallet_core.ui.m mTenpayKBStateListener;
    private com.tencent.kinda.framework.widget.base.BaseUI.IBaseUIWrap wrap;

    /* loaded from: classes9.dex */
    public interface IBaseUIWrap {
        android.view.View findViewById(int i17);

        android.content.Context getContext();

        android.view.View getCurrentFocus();
    }

    public BaseUI(com.tencent.kinda.framework.widget.base.BaseUI.IBaseUIWrap iBaseUIWrap) {
        this.wrap = iBaseUIWrap;
    }

    @Override // com.tencent.kinda.framework.widget.base.IExtendUI
    public void hideTenpayKB() {
        android.view.View view = this.mKBLayout;
        if (view == null || !view.isShown()) {
            return;
        }
        android.view.View view2 = this.mKBLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/BaseUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.wallet_core.ui.m mVar = this.mTenpayKBStateListener;
        if (mVar != null) {
            mVar.onVisibleStateChange(false);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.IExtendUI
    public void scrollTo(android.view.View view, int i17, int i18) {
        if (view != null) {
            view.scrollTo(i17, i18);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.IExtendUI
    public void scrollToFormEditPosAfterShowTenPay(final android.view.View view, android.view.View view2, int i17) {
        if (view != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int k17 = (i65.a.k(this.wrap.getContext()) - (iArr[1] + view2.getHeight())) - i65.a.b(this.wrap.getContext(), i17);
            int i18 = HARDCODE_TENPAY_KEYBOARD_HEIGHT;
            if (k17 <= 0 || k17 >= i18) {
                return;
            }
            final int i19 = i18 - k17;
            view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.4
                @Override // java.lang.Runnable
                public void run() {
                    view.scrollBy(0, i19);
                }
            });
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.IExtendUI
    public void setEditFocusListener(android.view.View view, int i17, boolean z17) {
        setEditFocusListener(view, i17, z17, true);
    }

    public void setKBMode(int i17) {
        this.mKeyboard.setXMode(i17);
    }

    @Override // com.tencent.kinda.framework.widget.base.IExtendUI
    public void setTenpayKBStateListener(com.tencent.mm.wallet_core.ui.m mVar) {
        this.mTenpayKBStateListener = mVar;
    }

    @Override // com.tencent.kinda.framework.widget.base.IExtendUI
    public void showTenpayKB() {
        android.view.View view = this.mKBLayout;
        if (view == null || view.isShown()) {
            return;
        }
        android.view.View view2 = this.mKBLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/BaseUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.wallet_core.ui.m mVar = this.mTenpayKBStateListener;
        if (mVar != null) {
            mVar.onVisibleStateChange(true);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.IExtendUI
    public void showVKB() {
        android.view.View currentFocus;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.wrap.getContext().getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = this.wrap.getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    @Override // com.tencent.kinda.framework.widget.base.IExtendUI
    public void setEditFocusListener(final android.view.View view, final int i17, final boolean z17, final boolean z18) {
        this.mKeyboard = (com.tenpay.android.wechat.MyKeyboardWindow) this.wrap.findViewById(com.tenpay.R.id.tenpay_num_keyboard);
        this.mKBLayout = this.wrap.findViewById(com.tencent.mm.R.id.o1v);
        android.view.View findViewById = this.wrap.findViewById(com.tenpay.R.id.tenpay_push_down);
        final android.widget.EditText editText = view instanceof com.tenpay.android.wechat.TenpaySecureEditText ? (android.widget.EditText) view : (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.pbn);
        if (this.mKeyboard == null || editText == null || this.mKBLayout == null) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        final android.widget.EditText editText2 = editText;
        editText.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(final android.view.View view2, boolean z19) {
                if (view2.isFocused() && !z17) {
                    ((android.view.inputmethod.InputMethodManager) com.tencent.kinda.framework.widget.base.BaseUI.this.wrap.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                    new com.tencent.mm.sdk.platformtools.n3().postDelayed(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!com.tencent.kinda.framework.widget.base.BaseUI.this.mKBLayout.isShown() && view2.isShown()) {
                                com.tencent.kinda.framework.widget.base.BaseUI.AnonymousClass1 anonymousClass1 = com.tencent.kinda.framework.widget.base.BaseUI.AnonymousClass1.this;
                                if (z18 || com.tencent.kinda.framework.widget.base.BaseUI.this.isVKBFirstTimeShown) {
                                    com.tencent.kinda.framework.widget.base.BaseUI baseUI = com.tencent.kinda.framework.widget.base.BaseUI.this;
                                    baseUI.isVKBFirstTimeShown = true;
                                    baseUI.showTenpayKB();
                                }
                            }
                            android.view.View view3 = view;
                            if (view3 instanceof com.tencent.mm.wallet_core.ui.formview.WalletFormView) {
                                com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) view3;
                                if ((c01.z1.I() || walletFormView.getEncrptType() == 100) && (!c01.z1.I() || walletFormView.getEncrptType() == 0)) {
                                    com.tencent.kinda.framework.widget.base.BaseUI.this.mKeyboard.resetSecureAccessibility();
                                    editText2.setAccessibilityDelegate(null);
                                } else {
                                    com.tencent.mm.wallet_core.e eVar = new com.tencent.mm.wallet_core.e(true);
                                    com.tencent.kinda.framework.widget.base.BaseUI.this.mKeyboard.setSecureAccessibility(eVar);
                                    editText2.setAccessibilityDelegate(eVar);
                                }
                            }
                            if (view instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
                                com.tencent.mm.wallet_core.e eVar2 = new com.tencent.mm.wallet_core.e(true);
                                com.tencent.kinda.framework.widget.base.BaseUI.this.wrap.getContext();
                                java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
                                com.tencent.kinda.framework.widget.base.BaseUI.this.mKeyboard.setSecureAccessibility(eVar2);
                                editText2.setAccessibilityDelegate(eVar2);
                            }
                            com.tencent.kinda.framework.widget.base.BaseUI.AnonymousClass1 anonymousClass12 = com.tencent.kinda.framework.widget.base.BaseUI.AnonymousClass1.this;
                            android.view.View view4 = view;
                            java.util.regex.Pattern pattern2 = com.tencent.mm.wallet_core.ui.r1.f214222a;
                            if (view4 instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
                                com.tencent.mm.wallet_core.ui.r1.N(view4, com.tencent.kinda.framework.widget.base.BaseUI.this.mKeyboard);
                            }
                            com.tencent.kinda.framework.widget.base.BaseUI.AnonymousClass1 anonymousClass13 = com.tencent.kinda.framework.widget.base.BaseUI.AnonymousClass1.this;
                            com.tencent.kinda.framework.widget.base.BaseUI.this.setKBMode(i17);
                            com.tencent.kinda.framework.widget.base.BaseUI.this.mKeyboard.setInputEditText((android.widget.EditText) view2);
                            ((android.view.inputmethod.InputMethodManager) com.tencent.kinda.framework.widget.base.BaseUI.this.wrap.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                        }
                    }, 300L);
                    return;
                }
                android.view.View view3 = view;
                java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
                if (view3 instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
                    com.tencent.mm.wallet_core.ui.r1.p0(view3, com.tencent.kinda.framework.widget.base.BaseUI.this.mKeyboard);
                }
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.kinda.framework.widget.base.BaseUI.this.hideTenpayKB();
                        ((android.view.inputmethod.InputMethodManager) com.tencent.kinda.framework.widget.base.BaseUI.this.wrap.getContext().getSystemService("input_method")).showSoftInput(editText2, 0);
                    }
                }, 200L);
            }
        });
        editText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                if (!com.tencent.kinda.framework.widget.base.BaseUI.this.mKBLayout.isShown() && !z17) {
                    com.tencent.kinda.framework.widget.base.BaseUI.this.showTenpayKB();
                    com.tencent.kinda.framework.widget.base.BaseUI.this.setKBMode(i17);
                } else if (z17) {
                    com.tencent.kinda.framework.widget.base.BaseUI.this.hideTenpayKB();
                    ((android.view.inputmethod.InputMethodManager) com.tencent.kinda.framework.widget.base.BaseUI.this.wrap.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
                }
            }
        });
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseUI.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.tencent.kinda.framework.widget.base.BaseUI.this.hideTenpayKB();
            }
        });
    }
}
