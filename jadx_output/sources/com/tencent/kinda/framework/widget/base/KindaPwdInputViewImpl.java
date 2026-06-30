package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaPwdInputViewImpl extends com.tencent.kinda.framework.widget.base.MMKView<android.view.View> implements com.tencent.kinda.gen.KPwdInputView, com.tencent.kinda.framework.widget.base.BaseFrActivity.IEditFocusChangeCallback {
    private java.lang.ref.WeakReference<android.content.Context> mContext;
    private com.tencent.kinda.gen.KPwdInputViewOnPasswordChangeCallback pwdChangeCallback;
    private com.tencent.kinda.gen.KPwdInputViewOnEndEnterPasswordCallback pwdEndCallback;
    private com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView pwdView;
    private android.widget.LinearLayout dummyFocusView = null;
    private com.tencent.kinda.gen.PwdViewStyle pwdStyle = com.tencent.kinda.gen.PwdViewStyle.CHECKPWDSTYLE;
    private com.tencent.kinda.gen.PwdEncryptMode pwdEncryptMode = com.tencent.kinda.gen.PwdEncryptMode.RSA;
    private java.lang.String pwdNonce = "";
    private long pwdTimestamp = 0;
    private java.lang.String softEncryptSalt = "";
    private int softEncryptVersion = 0;
    private boolean keyboardDisabled = false;
    private boolean shouldKeepKeyboardOnClearFocus = false;
    private final int HKSOFT_RSA2048WithMD5 = 0;
    private final int HKSOFT_RSA2048WithPBKDF2 = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPwdNullAndSm2EncryptMode(java.lang.String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        com.tencent.kinda.gen.PwdEncryptMode pwdEncryptMode = this.pwdEncryptMode;
        return pwdEncryptMode == com.tencent.kinda.gen.PwdEncryptMode.SM2WITHMD5 || pwdEncryptMode == com.tencent.kinda.gen.PwdEncryptMode.SM2WITHPBKDF2;
    }

    private void setupPwdView(android.content.Context context) {
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = new com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView(context);
        this.pwdView = editHintPasswdView;
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = editHintPasswdView.f214143d;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setMovementMethod(null);
        }
        com.tencent.kinda.gen.PwdViewStyle pwdViewStyle = this.pwdStyle;
        if (pwdViewStyle == com.tencent.kinda.gen.PwdViewStyle.CHECKPWDSTYLE || pwdViewStyle == com.tencent.kinda.gen.PwdViewStyle.HALFPAGECASHIERSTYLE) {
            this.pwdView.d(1);
        } else {
            this.pwdView.d(0);
        }
        qp5.p.b(this.pwdView);
        this.pwdView.setEditTextMaxLength(6);
        if (context instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity) {
            ((com.tencent.kinda.framework.widget.base.BaseFrActivity) context).setEditFocusListener(this.pwdView, 0, false, true, null, true, this);
        }
        this.pwdView.setOnInputValidListener(new qp5.t() { // from class: com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.1
            @Override // qp5.t
            public void onInputValidChange(boolean z17) {
                com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView2 = com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView;
                if (editHintPasswdView2.f214143d != null) {
                    if (editHintPasswdView2.f214151o.length() > 0) {
                        com.tenpay.android.wechat.TenpaySecureEditText.setSalt(editHintPasswdView2.f214151o);
                    } else {
                        com.tenpay.android.wechat.TenpaySecureEditText.setSalt(com.tencent.mm.wallet_core.ui.r1.B());
                    }
                }
                if (!z17) {
                    if (com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdChangeCallback != null) {
                        com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdChangeCallback.onPasswordChange(com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.getPwdInputTextLength(), com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.getText(), com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.getMd5Value());
                        return;
                    }
                    return;
                }
                if (com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdEncryptMode == com.tencent.kinda.gen.PwdEncryptMode.SM2WITHMD5) {
                    com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.setEncrType(4);
                } else if (com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdEncryptMode == com.tencent.kinda.gen.PwdEncryptMode.SM2WITHPBKDF2) {
                    com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.setEncrType(5);
                } else if (com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdEncryptMode == com.tencent.kinda.gen.PwdEncryptMode.RSAWITHHKSOFT) {
                    if (com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.softEncryptVersion == 0) {
                        com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.setEncrType(6);
                    } else if (com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.softEncryptVersion == 1) {
                        com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.setEncrType(7);
                    }
                }
                com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.setPwdNonce(com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdNonce);
                com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.setPwdTimestamp(com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdTimestamp);
                com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.setEncryptSoftSalt(com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.softEncryptSalt);
                java.lang.String text = com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.getText();
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_sm2_downgrade_to_rsa, false);
                if (com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.isPwdNullAndSm2EncryptMode(text) || (fj6 && com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdEncryptMode != com.tencent.kinda.gen.PwdEncryptMode.RSAWITHHKSOFT)) {
                    com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.setEncrType(1);
                    com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.setPwdNonce("");
                    com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView3 = com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView;
                    if (editHintPasswdView3.f214143d != null) {
                        if (editHintPasswdView3.f214151o.length() > 0) {
                            com.tenpay.android.wechat.TenpaySecureEditText.setSalt(editHintPasswdView3.f214151o);
                        } else {
                            com.tenpay.android.wechat.TenpaySecureEditText.setSalt(com.tencent.mm.wallet_core.ui.r1.B());
                        }
                    }
                    com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.getText();
                }
                if (com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdEndCallback != null) {
                    com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdEndCallback.onEndEnterPassword(com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.getText(), com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.getMd5Value());
                }
                if (com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdChangeCallback != null) {
                    com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdChangeCallback.onPasswordChange(6, com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.getText(), com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.getMd5Value());
                }
            }
        });
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.view.View createView(android.content.Context context) {
        this.mContext = new java.lang.ref.WeakReference<>(context);
        boolean z17 = android.os.Build.VERSION.SDK_INT < 26;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_kinda_pwd_input_dummy_focus_enable, false);
        if (!z17 && !fj6) {
            setupPwdView(context);
            return this.pwdView;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        this.dummyFocusView = linearLayout2;
        linearLayout2.setFocusable(true);
        this.dummyFocusView.setFocusableInTouchMode(true);
        linearLayout.addView(this.dummyFocusView, layoutParams);
        setupPwdView(context);
        linearLayout.addView(this.pwdView, new android.widget.LinearLayout.LayoutParams(-1, -1));
        return linearLayout;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public boolean getAutoRemarkKeyBoradType() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public boolean getChearInput() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public boolean getFocus() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public java.lang.String getHashData() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public boolean getKeyboardDisabled() {
        return this.keyboardDisabled;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public com.tencent.kinda.gen.PwdEncryptMode getPwdEncryptMode() {
        return this.pwdEncryptMode;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public java.lang.String getPwdNonce() {
        return this.pwdNonce;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public com.tencent.kinda.gen.PwdViewStyle getPwdStyle() {
        return this.pwdStyle;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public long getPwdTimestamp() {
        return this.pwdTimestamp;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public long getTextLength() {
        return 0L;
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public void setAccessible(boolean z17) {
        super.setAccessible(z17);
        this.pwdView.getEditText().setImportantForAccessibility(2);
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setAutoRemarkKeyBoradType(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setChearInput(boolean z17) {
        if (z17) {
            this.pwdView.a();
        }
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setEncryptSoftSaltAndVersion(java.lang.String str, int i17) {
        this.softEncryptSalt = str;
        this.softEncryptVersion = i17;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setFocus(boolean z17) {
        if (z17 && this.pwdView.getVisibility() == 0 && !this.pwdView.hasFocus()) {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.getEditText().requestFocus();
                }
            });
        } else {
            if (z17) {
                return;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.KindaPwdInputViewImpl.this.pwdView.getEditText().clearFocus();
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setFocusModalListener(com.tencent.kinda.gen.IUIModal iUIModal) {
        if (iUIModal == null) {
            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.MMKView.TAG, "modal == null.");
            return;
        }
        com.tencent.kinda.gen.IUIModalPlatformFuncDelegate funcDelegate = iUIModal.getFuncDelegate();
        if (funcDelegate instanceof com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl) {
            com.tencent.mm.ui.MMFragment mMFragment = ((com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl) funcDelegate).weakFragment.get();
            if (mMFragment == null) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.MMKView.TAG, "delegateImpl.activity == null.");
                return;
            }
            java.lang.ref.WeakReference<android.content.Context> weakReference = this.mContext;
            if (weakReference == null) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.MMKView.TAG, "mContext == null.");
                return;
            }
            android.content.Context context = weakReference.get();
            if (context == null) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.MMKView.TAG, "tempContext == null.");
                return;
            }
            if (context instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity) {
                com.tencent.kinda.framework.widget.base.BaseFrActivity baseFrActivity = (com.tencent.kinda.framework.widget.base.BaseFrActivity) context;
                baseFrActivity.setEditFocusListener(this.pwdView, 0, false, true, mMFragment, true, this);
                com.tenpay.android.wechat.MyKeyboardWindow keyboard = baseFrActivity.getKeyboard(mMFragment);
                if (keyboard != null) {
                    keyboard.setKeyboardDisabled(this.keyboardDisabled);
                }
            }
        }
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setFocusUIPageListener(com.tencent.kinda.gen.IUIPage iUIPage) {
        if (iUIPage == null) {
            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.MMKView.TAG, "page == null.");
            return;
        }
        java.lang.Object platformFuncDelegate = iUIPage.getPlatformFuncDelegate();
        if (platformFuncDelegate instanceof com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl) {
            com.tencent.mm.ui.MMFragment mMFragment = ((com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl) platformFuncDelegate).weakFragment.get();
            if (mMFragment == null) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.MMKView.TAG, "delegateImpl.activity == null.");
                return;
            }
            java.lang.ref.WeakReference<android.content.Context> weakReference = this.mContext;
            if (weakReference == null) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.MMKView.TAG, "mContext == null.");
                return;
            }
            android.content.Context context = weakReference.get();
            if (context == null) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.MMKView.TAG, "tempContext == null.");
            } else if (context instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity) {
                ((com.tencent.kinda.framework.widget.base.BaseFrActivity) context).setEditFocusListener(this.pwdView, 0, false, true, mMFragment, true, this);
            }
        }
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setHashData(java.lang.String str) {
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setKeepKeyboardOnClearFocus(boolean z17) {
        this.shouldKeepKeyboardOnClearFocus = z17;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setKeyboardDisabled(boolean z17) {
        android.content.Context context;
        com.tenpay.android.wechat.MyKeyboardWindow keyboard;
        this.keyboardDisabled = z17;
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.mContext;
        if (weakReference == null || (context = weakReference.get()) == null || !(context instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity) || (keyboard = ((com.tencent.kinda.framework.widget.base.BaseFrActivity) context).getKeyboard()) == null) {
            return;
        }
        keyboard.setKeyboardDisabled(z17);
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setOnEndEnterPasswordCallback(com.tencent.kinda.gen.KPwdInputViewOnEndEnterPasswordCallback kPwdInputViewOnEndEnterPasswordCallback) {
        if (kPwdInputViewOnEndEnterPasswordCallback != null) {
            this.pwdEndCallback = kPwdInputViewOnEndEnterPasswordCallback;
        }
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setOnPasswordChangeCallback(com.tencent.kinda.gen.KPwdInputViewOnPasswordChangeCallback kPwdInputViewOnPasswordChangeCallback) {
        if (kPwdInputViewOnPasswordChangeCallback != null) {
            this.pwdChangeCallback = kPwdInputViewOnPasswordChangeCallback;
        }
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setPwdEncryptMode(com.tencent.kinda.gen.PwdEncryptMode pwdEncryptMode) {
        this.pwdEncryptMode = pwdEncryptMode;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setPwdNonce(java.lang.String str) {
        this.pwdNonce = str;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setPwdStyle(com.tencent.kinda.gen.PwdViewStyle pwdViewStyle) {
        this.pwdStyle = pwdViewStyle;
        if (pwdViewStyle == com.tencent.kinda.gen.PwdViewStyle.CHECKPWDSTYLE || pwdViewStyle == com.tencent.kinda.gen.PwdViewStyle.HALFPAGECASHIERSTYLE) {
            this.pwdView.d(1);
        } else {
            this.pwdView.d(0);
        }
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setPwdTimestamp(long j17) {
        this.pwdTimestamp = j17;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public void setTextLength(long j17) {
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFrActivity.IEditFocusChangeCallback
    public boolean shouldKeepKeyboardOnEditClearFocus() {
        return this.shouldKeepKeyboardOnClearFocus;
    }

    @Override // com.tencent.kinda.gen.KPwdInputView
    public com.tencent.kinda.gen.Sm2HashType sm2HashType() {
        gm0.j1.i();
        return com.tencent.kinda.gen.Sm2HashType.values()[((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SMCRYPTO_FLAG_TYPE_INT_SYNC, 0)).intValue()];
    }
}
