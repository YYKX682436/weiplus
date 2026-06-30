package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKEditText extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.LinearLayout> implements com.tencent.kinda.gen.KEditText {
    private java.lang.String confirmButtonText;
    private com.tencent.kinda.gen.DynamicColor cursorColor;
    protected com.tenpay.android.wechat.TenpaySecureEditText editText;
    private java.lang.String hintText;
    private float hintTextSize;
    private com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView iconImageView;
    protected com.tencent.kinda.gen.KEditTextOnEditorActionCallback mKEditTextOnEditorActionCallback;
    protected com.tencent.kinda.gen.KEditTextOnFocusChangeCallback mKEditTextOnFocusChangeCallback;
    protected com.tencent.kinda.gen.KEditTextOnTextEndEditingCallback mKEditTextOnTextEndEditingCallback;
    private com.tencent.kinda.gen.EditTextRestrictType mRestriceType;
    protected com.tencent.kinda.gen.KEditTextOnTextBeginChangeCallback onTextBeginChangeCallback;
    protected com.tencent.kinda.gen.KEditTextOnTextChangedCallback onTextChangedCallback;
    private com.tencent.kinda.gen.TextAlign textAlign;
    private java.lang.String textFontName;
    private float textSize;
    private com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard;
    private com.tencent.kinda.gen.DynamicColor textColor = new com.tencent.kinda.gen.DynamicColor(0, 0);
    private com.tencent.kinda.gen.DynamicColor hintColor = new com.tencent.kinda.gen.DynamicColor(0, 0);
    private int maxLength = -1;
    private com.tencent.kinda.gen.KeyboardType keyboardType = com.tencent.kinda.gen.KeyboardType.NORMAL;
    private android.view.View.OnFocusChangeListener initialOnFocusChangeListener = null;
    private com.tencent.kinda.gen.ClearButtonMode clearButtonMode = com.tencent.kinda.gen.ClearButtonMode.WHILEEDITING;
    private android.widget.LinearLayout dummyFocusView = null;
    protected com.tencent.kinda.framework.widget.base.BaseFrActivity mBaseFrActivity = null;
    private int mMoneyRestrictionIntegerLimit = 10;
    private java.lang.String mFixedHeaderText = "";
    private boolean iconHadShow = false;
    private float expandSize = 24.0f;
    private boolean stayFocusWhenEnterClick = false;
    private boolean showFloatButton = false;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKEditText$11, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass11 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$KeyboardType;
        static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$TextAlign;

        static {
            int[] iArr = new int[com.tencent.kinda.gen.KeyboardType.values().length];
            $SwitchMap$com$tencent$kinda$gen$KeyboardType = iArr;
            try {
                iArr[com.tencent.kinda.gen.KeyboardType.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$KeyboardType[com.tencent.kinda.gen.KeyboardType.NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$KeyboardType[com.tencent.kinda.gen.KeyboardType.PASSWORD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$KeyboardType[com.tencent.kinda.gen.KeyboardType.EMAIL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$KeyboardType[com.tencent.kinda.gen.KeyboardType.PHONE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$KeyboardType[com.tencent.kinda.gen.KeyboardType.ID.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$KeyboardType[com.tencent.kinda.gen.KeyboardType.CRETAIL.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$KeyboardType[com.tencent.kinda.gen.KeyboardType.DIGIT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$KeyboardType[com.tencent.kinda.gen.KeyboardType.DIGIT_NOACTION.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[com.tencent.kinda.gen.TextAlign.values().length];
            $SwitchMap$com$tencent$kinda$gen$TextAlign = iArr2;
            try {
                iArr2[com.tencent.kinda.gen.TextAlign.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$TextAlign[com.tencent.kinda.gen.TextAlign.CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$TextAlign[com.tencent.kinda.gen.TextAlign.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeTextSizeIfNeed() {
        if (this.hintTextSize > 0.0f) {
            if (this.editText.getText().length() == 0) {
                this.editText.setTextSize(1, this.hintTextSize * (getSupportDynamicSize() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.mm.sdk.platformtools.x2.f193071a) : 1.0f));
            } else {
                this.editText.setTextSize(1, this.textSize * (getSupportDynamicSize() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.mm.sdk.platformtools.x2.f193071a) : 1.0f));
            }
            notifyChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconVisibility(int i17) {
        this.iconImageView.setVisibility(i17);
        if (this.iconHadShow || i17 != 0) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView walletIconImageView = this.iconImageView;
        float f17 = this.expandSize;
        com.tencent.kinda.framework.widget.tools.MMKViewUtil.setExpandSize(walletIconImageView, f17, f17);
        this.iconHadShow = true;
    }

    public void callBackKindaTextEndEditing() {
        com.tencent.kinda.gen.KEditTextOnTextEndEditingCallback kEditTextOnTextEndEditingCallback = this.mKEditTextOnTextEndEditingCallback;
        if (kEditTextOnTextEndEditingCallback != null) {
            kEditTextOnTextEndEditingCallback.onTextEndEditing(this.editText.getText().toString());
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void enableConfirmBtn(boolean z17) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.wcPayKeyboard;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.e(z17);
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public java.lang.String encryptWith3Des() {
        return new com.tenpay.android.wechat.TenpaySecureEncrypt().desedeVerifyCode(this.editText.getText().toString(), java.lang.Long.toString(c01.id.a() / 1000));
    }

    public com.tencent.kinda.gen.ClearButtonMode getClearButtonMode() {
        return this.clearButtonMode;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public com.tencent.kinda.gen.DynamicColor getConfirmButtonColor() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public java.lang.String getConfirmButtonText() {
        return this.confirmButtonText;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public com.tencent.kinda.gen.DynamicColor getCursorColor() {
        return this.cursorColor;
    }

    public com.tenpay.android.wechat.TenpaySecureEditText getEditText() {
        return this.editText;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public boolean getEnabled() {
        return this.editText.isEnabled();
    }

    @Override // com.tencent.kinda.gen.KEditText
    public java.lang.String getFixedHeaderText() {
        return this.mFixedHeaderText;
    }

    public boolean getFocus() {
        return this.editText.isFocused();
    }

    @Override // com.tencent.kinda.gen.KEditText
    public java.lang.String getHint() {
        java.lang.CharSequence hint = this.editText.getHint();
        if (hint != null) {
            return hint.toString();
        }
        java.lang.String str = this.hintText;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public com.tencent.kinda.gen.DynamicColor getHintColor() {
        return this.hintColor;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public float getHintTextSize() {
        return this.hintTextSize;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public boolean getIsSingleLine() {
        return this.editText.getMaxLines() == 1;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public com.tencent.kinda.gen.KeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public int getMaxLength() {
        return this.maxLength;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public int getMoneyRestrictionIntegerLimit() {
        return this.mMoneyRestrictionIntegerLimit;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public int getMoneyShowBit() {
        return 0;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public com.tencent.kinda.gen.EditTextRestrictType getRestrictType() {
        return this.mRestriceType;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public int getSelection() {
        return this.editText.getSelectionStart();
    }

    @Override // com.tencent.kinda.gen.KEditText
    public boolean getShowFloatButton() {
        return this.showFloatButton;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public boolean getShowInputDot() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public boolean getStayFocusWhenEnter() {
        return this.stayFocusWhenEnterClick;
    }

    public java.lang.String getText() {
        android.text.Editable text = this.editText.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public com.tencent.kinda.gen.TextAlign getTextAlign() {
        return this.textAlign;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public com.tencent.kinda.gen.DynamicColor getTextColor() {
        return this.textColor;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public java.lang.String getTextFont() {
        return this.textFontName;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public float getTextSize() {
        return this.textSize;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public com.tencent.kinda.gen.DynamicColor getTintColor() {
        return null;
    }

    public void invokeInitialOnFocusChangeListener(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.initialOnFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setClearButtonMode(com.tencent.kinda.gen.ClearButtonMode clearButtonMode) {
        this.clearButtonMode = clearButtonMode;
        if (clearButtonMode == com.tencent.kinda.gen.ClearButtonMode.NEVER) {
            setIconVisibility(8);
            return;
        }
        if (clearButtonMode == com.tencent.kinda.gen.ClearButtonMode.WHILEEDITING || clearButtonMode == com.tencent.kinda.gen.ClearButtonMode.UNLESSEDITING) {
            return;
        }
        if (clearButtonMode == com.tencent.kinda.gen.ClearButtonMode.ALWAYS) {
            setIconVisibility(0);
        } else {
            setIconVisibility(4);
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setConfirmButtonColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setConfirmButtonText(java.lang.String str) {
        this.confirmButtonText = str;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setCursorColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.cursorColor = dynamicColor;
        if (fp.h.c(29)) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setSize(i65.a.a(this.mContext, 1.5f), -1);
            gradientDrawable.setColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(dynamicColor));
            this.editText.setCursorStyle(gradientDrawable);
            return;
        }
        if ((dynamicColor == null || dynamicColor.getNormalColor() != 4294951680L) && dynamicColor.getNormalColor() != 4290481664L) {
            com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.widget.base.MMKView.TAG, "can't set cursor color on low version");
        } else {
            this.editText.setCursorStyle(com.tencent.mm.R.drawable.agu);
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setEnabled(boolean z17) {
        this.editText.setEnabled(z17);
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setFixedHeaderText(java.lang.String str) {
        this.mFixedHeaderText = str;
        this.editText.setFixedHeaderText(str);
    }

    public void setFocus(boolean z17) {
        if (z17) {
            if (this.editText.hasFocus()) {
                this.editText.clearFocus();
            }
            this.editText.postDelayed(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.9
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.requestFocus();
                    if (com.tencent.kinda.framework.widget.base.MMKEditText.this.keyboardType == com.tencent.kinda.gen.KeyboardType.ID || com.tencent.kinda.framework.widget.base.MMKEditText.this.keyboardType == com.tencent.kinda.gen.KeyboardType.CRETAIL || com.tencent.kinda.framework.widget.base.MMKEditText.this.keyboardType == com.tencent.kinda.gen.KeyboardType.DIGIT || com.tencent.kinda.framework.widget.base.MMKEditText.this.keyboardType == com.tencent.kinda.gen.KeyboardType.DIGIT_NOACTION) {
                        return;
                    }
                    ((android.view.inputmethod.InputMethodManager) com.tencent.kinda.framework.widget.base.MMKEditText.this.mContext.getSystemService("input_method")).showSoftInput(com.tencent.kinda.framework.widget.base.MMKEditText.this.editText, 0);
                }
            }, 50L);
        } else if (this.editText.hasFocus()) {
            this.editText.clearFocus();
            if (this.keyboardType == com.tencent.kinda.gen.KeyboardType.NORMAL) {
                callBackKindaTextEndEditing();
            }
            com.tencent.kinda.gen.KeyboardType keyboardType = this.keyboardType;
            if (keyboardType == com.tencent.kinda.gen.KeyboardType.ID || keyboardType == com.tencent.kinda.gen.KeyboardType.CRETAIL || keyboardType == com.tencent.kinda.gen.KeyboardType.DIGIT || keyboardType == com.tencent.kinda.gen.KeyboardType.DIGIT_NOACTION) {
                return;
            }
            ((android.view.inputmethod.InputMethodManager) this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(this.editText.getWindowToken(), 0);
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setHint(java.lang.String str) {
        this.hintText = str;
        this.editText.setHint(str);
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setHintColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.hintColor = dynamicColor;
        this.editText.setHintTextColor(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)));
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setHintTextSize(float f17) {
        this.hintTextSize = f17;
        changeTextSizeIfNeed();
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setIsSingleLine(boolean z17) {
        if (z17) {
            this.editText.setMaxLines(1);
        } else {
            this.editText.setMaxLines(2);
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setKeyboardType(com.tencent.kinda.gen.KeyboardType keyboardType) {
        this.keyboardType = keyboardType;
        switch (com.tencent.kinda.framework.widget.base.MMKEditText.AnonymousClass11.$SwitchMap$com$tencent$kinda$gen$KeyboardType[keyboardType.ordinal()]) {
            case 1:
                this.editText.setInputType(0);
                return;
            case 2:
                this.editText.setInputType(2);
                return;
            case 3:
                this.editText.setInputType(128);
                return;
            case 4:
                this.editText.setInputType(32);
                return;
            case 5:
                this.editText.setInputType(3);
                return;
            case 6:
            case 7:
                com.tencent.kinda.framework.widget.base.BaseFrActivity baseFrActivity = this.mBaseFrActivity;
                if (baseFrActivity != null) {
                    baseFrActivity.setEditFocusListener(this.editText, 1, false);
                    this.mBaseFrActivity.setTenpayKBStateListener(new com.tencent.mm.wallet_core.ui.m() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.6
                        @Override // com.tencent.mm.wallet_core.ui.m
                        public void onVisibleStateChange(boolean z17) {
                            if (z17 || !com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.isFocused()) {
                                return;
                            }
                            com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.clearFocus();
                        }
                    });
                    return;
                }
                return;
            case 8:
            case 9:
                this.editText.setImeOptions(6);
                this.editText.setKeyListener(new android.text.method.NumberKeyListener() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.7
                    @Override // android.text.method.NumberKeyListener
                    public char[] getAcceptedChars() {
                        return (com.tencent.kinda.framework.widget.base.MMKEditText.this.mFixedHeaderText + "01234567890.").toCharArray();
                    }

                    @Override // android.text.method.KeyListener
                    public int getInputType() {
                        return 532482;
                    }
                });
                java.lang.String str = this.confirmButtonText;
                if (android.text.TextUtils.isEmpty(str)) {
                    str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490507x1);
                }
                if (this.keyboardType == com.tencent.kinda.gen.KeyboardType.DIGIT_NOACTION) {
                    str = "";
                }
                com.tencent.kinda.framework.widget.base.BaseFrActivity baseFrActivity2 = this.mBaseFrActivity;
                this.wcPayKeyboard = com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr.bind((com.tencent.mm.framework.app.UIPageFragmentActivity) baseFrActivity2, this, str, baseFrActivity2.mTenpayKBStateCallBackListener);
                this.editText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.8
                    @Override // android.widget.TextView.OnEditorActionListener
                    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
                        if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                            if (!com.tencent.kinda.framework.widget.base.MMKEditText.this.stayFocusWhenEnterClick) {
                                com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.clearFocus();
                            }
                            com.tencent.kinda.gen.KEditTextOnEditorActionCallback kEditTextOnEditorActionCallback = com.tencent.kinda.framework.widget.base.MMKEditText.this.mKEditTextOnEditorActionCallback;
                            if (kEditTextOnEditorActionCallback != null) {
                                kEditTextOnEditorActionCallback.onEditorAction(com.tencent.kinda.gen.KeyEvent.ENTER);
                            }
                        }
                        return true;
                    }
                });
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setMaxLength(int i17) {
        if (i17 >= 0) {
            this.maxLength = i17;
            this.editText.setFilters(new android.text.InputFilter[]{new com.tencent.kinda.framework.widget.base.MMKEditTextLengthFilter(i17)});
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setMoneyRestrictionIntegerLimit(int i17) {
        this.mMoneyRestrictionIntegerLimit = i17;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setMoneyShowBit(int i17) {
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setNeedForceDismissFloatButton() {
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setOnEditorActionCallback(com.tencent.kinda.gen.KEditTextOnEditorActionCallback kEditTextOnEditorActionCallback) {
        this.mKEditTextOnEditorActionCallback = kEditTextOnEditorActionCallback;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setOnFocusChangeCallback(com.tencent.kinda.gen.KEditTextOnFocusChangeCallback kEditTextOnFocusChangeCallback) {
        this.mKEditTextOnFocusChangeCallback = kEditTextOnFocusChangeCallback;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setOnTextBeginChangeCallback(com.tencent.kinda.gen.KEditTextOnTextBeginChangeCallback kEditTextOnTextBeginChangeCallback) {
        this.onTextBeginChangeCallback = kEditTextOnTextBeginChangeCallback;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setOnTextChangedCallback(com.tencent.kinda.gen.KEditTextOnTextChangedCallback kEditTextOnTextChangedCallback) {
        this.onTextChangedCallback = kEditTextOnTextChangedCallback;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setOnTextEndEditingCallback(com.tencent.kinda.gen.KEditTextOnTextEndEditingCallback kEditTextOnTextEndEditingCallback) {
        this.mKEditTextOnTextEndEditingCallback = kEditTextOnTextEndEditingCallback;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setRestrictType(com.tencent.kinda.gen.EditTextRestrictType editTextRestrictType) {
        this.mRestriceType = editTextRestrictType;
        if (editTextRestrictType == com.tencent.kinda.gen.EditTextRestrictType.MONEY) {
            this.editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.10
                @Override // android.text.TextWatcher
                public void afterTextChanged(android.text.Editable editable) {
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.removeTextChangedListener(this);
                    if (editable.toString().startsWith(".")) {
                        editable.insert(0, "0");
                    }
                    java.lang.String obj = editable.toString();
                    int indexOf = obj.indexOf(".");
                    int length = obj.length();
                    int i17 = com.tencent.kinda.framework.widget.base.MMKEditText.this.mMoneyRestrictionIntegerLimit;
                    if (indexOf < 0 || length - indexOf <= 3) {
                        int i18 = i17 + 2;
                        if (indexOf > i18) {
                            com.tencent.mm.wallet_core.ui.formview.WalletFormView.i(com.tencent.kinda.framework.widget.base.MMKEditText.this.editText, obj, i18, indexOf);
                        } else if (indexOf == -1 && length > i17) {
                            com.tencent.mm.wallet_core.ui.formview.WalletFormView.i(com.tencent.kinda.framework.widget.base.MMKEditText.this.editText, obj, i17, length);
                        } else if (!com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.isMoneyAmount()) {
                            com.tencent.mm.wallet_core.ui.formview.WalletFormView.i(com.tencent.kinda.framework.widget.base.MMKEditText.this.editText, obj, obj.length() - 1, obj.length());
                        } else if (obj.length() > 1 && obj.startsWith("0") && indexOf == -1) {
                            com.tencent.mm.wallet_core.ui.formview.WalletFormView.i(com.tencent.kinda.framework.widget.base.MMKEditText.this.editText, obj, 0, 1);
                        }
                    } else {
                        com.tencent.mm.wallet_core.ui.formview.WalletFormView.i(com.tencent.kinda.framework.widget.base.MMKEditText.this.editText, obj, indexOf + 3, length);
                    }
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.addTextChangedListener(this);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setSelection(int i17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.editText;
        tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().length());
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setShowFloatButton(boolean z17) {
        com.tencent.kinda.framework.widget.base.BaseFragment baseFragment;
        this.showFloatButton = z17;
        com.tencent.kinda.framework.widget.base.BaseFrActivity baseFrActivity = this.mBaseFrActivity;
        if (baseFrActivity == null || (baseFragment = baseFrActivity.topShowFragment()) == null) {
            return;
        }
        baseFragment.showSingleActionStWcKbWhenHide = z17;
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setShowInputDot(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setStayFocusWhenEnter(boolean z17) {
        this.stayFocusWhenEnterClick = z17;
    }

    public void setText(java.lang.String str) {
        if (str == null || getText().equals(str)) {
            return;
        }
        this.editText.setText(str);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.editText;
        tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().length());
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setTextAlign(com.tencent.kinda.gen.TextAlign textAlign) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText;
        if (textAlign != null) {
            this.textAlign = textAlign;
            int i17 = com.tencent.kinda.framework.widget.base.MMKEditText.AnonymousClass11.$SwitchMap$com$tencent$kinda$gen$TextAlign[textAlign.ordinal()];
            if (i17 == 1) {
                getView().setGravity(3);
            } else if (i17 == 2) {
                com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = this.editText;
                if (tenpaySecureEditText2 != null) {
                    tenpaySecureEditText2.setGravity(1);
                }
            } else if (i17 == 3 && (tenpaySecureEditText = this.editText) != null) {
                tenpaySecureEditText.setGravity(8388613);
            }
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.textColor = dynamicColor;
        this.editText.setTextColor(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)));
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setTextFont(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        int i17 = str.equalsIgnoreCase("WeChat-Sans-SS-Light") ? 2 : str.equalsIgnoreCase("WeChat-Sans-SS-Medium") ? 0 : str.equalsIgnoreCase("WeChat-Sans-SS-Regular") ? 3 : str.equalsIgnoreCase("WeChat-Sans-SS-Bold") ? 1 : str.equalsIgnoreCase("WeChat-Sans-Std-Medium") ? 4 : str.equalsIgnoreCase("WeChat-Sans-Std-Regular") ? 7 : -1;
        if (i17 != -1) {
            try {
                this.editText.setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), com.tencent.mm.wallet_core.ui.r1.E(i17)));
                notifyChanged();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.widget.base.MMKView.TAG, "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                this.editText.setTypeface(null, 0);
            }
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setTextSize(float f17) {
        if (f17 > 0.0f) {
            float scaleSize = f17 * (getSupportDynamicSize() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.mm.sdk.platformtools.x2.f193071a) : 1.0f);
            this.textSize = scaleSize;
            this.editText.setTextSize(1, scaleSize);
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setTintColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public void setViewId(java.lang.String str) {
        super.setViewId(str);
        if (this.iconImageView != null) {
            com.tencent.kinda.framework.widget.tools.MMKViewUtil.setId4KindaImplView(this.mContext, str + "_btn", this.iconImageView);
        }
    }

    public void setVisibleClearIcon(boolean z17) {
        if (!z17 || this.editText.getText().length() <= 0) {
            setIconVisibility(4);
        } else {
            setIconVisibility(0);
        }
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void setupToolBarView(com.tencent.kinda.gen.KView kView) {
        if (this.wcPayKeyboard == null || kView == null) {
            return;
        }
        this.wcPayKeyboard.setToolBarContent(((com.tencent.kinda.framework.widget.base.MMKView) kView).getView());
    }

    @Override // com.tencent.kinda.gen.KEditText
    public void showMoneyBitView() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.LinearLayout createView(android.content.Context context) {
        com.tencent.kinda.framework.widget.base.BaseFragment baseFragment;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setGravity(16);
        this.dummyFocusView = new android.widget.LinearLayout(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
        this.dummyFocusView.setFocusable(true);
        this.dummyFocusView.setFocusableInTouchMode(true);
        linearLayout.addView(this.dummyFocusView, layoutParams);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = new com.tenpay.android.wechat.TenpaySecureEditText(context);
        this.editText = tenpaySecureEditText;
        tenpaySecureEditText.setSingleLine(false);
        this.editText.setMaxLines(2);
        this.editText.setBackground(null);
        this.editText.setTextSize(1, com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(context) * 17.0f);
        this.editText.setTag(this);
        this.editText.setCursorStyle(com.tencent.mm.R.drawable.afr);
        this.editText.setPadding(0, 0, 0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        linearLayout.addView(this.editText, layoutParams2);
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView walletIconImageView = new com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView(context);
        this.iconImageView = walletIconImageView;
        int color = context.getResources().getColor(com.tencent.mm.R.color.f478694eb);
        walletIconImageView.f192041u = com.tencent.mm.R.raw.icons_filled_close2;
        walletIconImageView.f192042v = color;
        this.iconImageView.setToClearState(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.tencent.kinda.framework.widget.base.MMKEditText.this.iconImageView.getVisibility() == 0) {
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.setText("");
                }
            }
        });
        setIconVisibility(8);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(com.tencent.mm.ui.zk.a(context, 16), com.tencent.mm.ui.zk.a(context, 16));
        layoutParams3.setMargins(16, 0, com.tencent.mm.ui.zk.a(context, 4), 0);
        linearLayout.addView(this.iconImageView, layoutParams3);
        linearLayout.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.kinda.framework.widget.base.MMKEditText.this.clearButtonMode != com.tencent.kinda.gen.ClearButtonMode.NEVER) {
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.setIconVisibility(4);
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.notifyChanged();
                }
            }
        });
        if (context instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity) {
            this.mBaseFrActivity = (com.tencent.kinda.framework.widget.base.BaseFrActivity) context;
        }
        this.editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2;
                com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText3;
                com.tencent.kinda.gen.TextAlign textAlign = com.tencent.kinda.framework.widget.base.MMKEditText.this.textAlign;
                com.tencent.kinda.gen.TextAlign textAlign2 = com.tencent.kinda.gen.TextAlign.RIGHT;
                if (textAlign == textAlign2 && (tenpaySecureEditText3 = com.tencent.kinda.framework.widget.base.MMKEditText.this.editText) != null) {
                    tenpaySecureEditText3.setTextDirection(3);
                }
                com.tencent.kinda.gen.KEditTextOnTextChangedCallback kEditTextOnTextChangedCallback = com.tencent.kinda.framework.widget.base.MMKEditText.this.onTextChangedCallback;
                if (kEditTextOnTextChangedCallback != null && editable != null) {
                    kEditTextOnTextChangedCallback.onTextChanged(editable.toString());
                }
                if (editable == null || android.text.TextUtils.isEmpty(editable.toString())) {
                    com.tencent.kinda.framework.widget.base.MMKEditText mMKEditText = com.tencent.kinda.framework.widget.base.MMKEditText.this;
                    mMKEditText.editText.setHint(mMKEditText.hintText);
                    if (com.tencent.kinda.framework.widget.base.MMKEditText.this.textAlign == textAlign2 && (tenpaySecureEditText2 = com.tencent.kinda.framework.widget.base.MMKEditText.this.editText) != null) {
                        tenpaySecureEditText2.setTextDirection(4);
                    }
                } else {
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.setHint("");
                }
                com.tencent.kinda.framework.widget.base.MMKEditText.this.changeTextSizeIfNeed();
                com.tencent.kinda.framework.widget.base.MMKEditText.this.notifyChanged();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                com.tencent.kinda.gen.KEditTextOnTextBeginChangeCallback kEditTextOnTextBeginChangeCallback = com.tencent.kinda.framework.widget.base.MMKEditText.this.onTextBeginChangeCallback;
                if (kEditTextOnTextBeginChangeCallback == null || charSequence == null) {
                    return;
                }
                kEditTextOnTextBeginChangeCallback.onTextBeginChange(charSequence.toString());
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                if (com.tencent.kinda.framework.widget.base.MMKEditText.this.clearButtonMode == com.tencent.kinda.gen.ClearButtonMode.NEVER) {
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.setIconVisibility(8);
                    return;
                }
                if (charSequence == null || charSequence.length() <= 0 || com.tencent.kinda.framework.widget.base.MMKEditText.this.clearButtonMode != com.tencent.kinda.gen.ClearButtonMode.WHILEEDITING || !com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.hasFocus()) {
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.setIconVisibility(4);
                } else {
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.setIconVisibility(0);
                }
            }
        });
        android.view.View.OnFocusChangeListener onFocusChangeListener = new android.view.View.OnFocusChangeListener() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.4
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(android.view.View view, boolean z17) {
                boolean z18 = com.tencent.kinda.framework.widget.base.MMKEditText.this.clearButtonMode == com.tencent.kinda.gen.ClearButtonMode.WHILEEDITING || com.tencent.kinda.framework.widget.base.MMKEditText.this.clearButtonMode == com.tencent.kinda.gen.ClearButtonMode.ALWAYS || com.tencent.kinda.framework.widget.base.MMKEditText.this.clearButtonMode == com.tencent.kinda.gen.ClearButtonMode.UNLESSEDITING;
                if (z17 && com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.getText().length() > 0 && z18) {
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.setIconVisibility(0);
                } else if (com.tencent.kinda.framework.widget.base.MMKEditText.this.clearButtonMode == com.tencent.kinda.gen.ClearButtonMode.NEVER) {
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.setIconVisibility(8);
                } else {
                    com.tencent.kinda.framework.widget.base.MMKEditText.this.setIconVisibility(4);
                }
                com.tencent.kinda.gen.KEditTextOnFocusChangeCallback kEditTextOnFocusChangeCallback = com.tencent.kinda.framework.widget.base.MMKEditText.this.mKEditTextOnFocusChangeCallback;
                if (kEditTextOnFocusChangeCallback != null) {
                    kEditTextOnFocusChangeCallback.onFocusChange(z17);
                }
            }
        };
        this.initialOnFocusChangeListener = onFocusChangeListener;
        this.editText.setOnFocusChangeListener(onFocusChangeListener);
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            this.editText.setHintTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479232tk));
            this.editText.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        }
        this.editText.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.kinda.framework.widget.base.MMKEditText.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                com.tencent.kinda.gen.KViewOnClickCallback onClickCallback;
                if (com.tencent.kinda.framework.widget.base.MMKEditText.this.editText.isFocused() || motionEvent.getAction() != 0 || (onClickCallback = com.tencent.kinda.framework.widget.base.MMKEditText.this.getOnClickCallback()) == null) {
                    return false;
                }
                onClickCallback.onClick(com.tencent.kinda.framework.widget.base.MMKEditText.this);
                return true;
            }
        });
        this.editText.setId(com.tencent.kinda.framework.R.id.kinda_edit_text_input);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        com.tencent.kinda.framework.widget.base.BaseFrActivity baseFrActivity = this.mBaseFrActivity;
        if (baseFrActivity != null && (baseFragment = baseFrActivity.topShowFragment()) != null) {
            baseFragment.showSingleActionStWcKbWhenHide = this.showFloatButton;
        }
        return linearLayout;
    }
}
