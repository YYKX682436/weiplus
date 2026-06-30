package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaSecureEditTextImpl extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.LinearLayout> implements com.tencent.kinda.gen.KSecureEditText {
    private java.lang.String defaultValue;
    private com.tenpay.android.wechat.TenpaySecureEditText editText;
    private com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView iconImageView;
    private com.tencent.kinda.framework.widget.base.BaseFrActivity mContext;
    private com.tencent.kinda.gen.KeyboardType mKeyboardType;
    private com.tencent.kinda.gen.KSecureEditTextOnTextChangedCallback onTextChangedCallback;
    private com.tencent.kinda.gen.ClearButtonMode clearButtonMode = com.tencent.kinda.gen.ClearButtonMode.WHILEEDITING;
    private com.tencent.kinda.gen.SecureCtrlEncryptType encryptType = com.tencent.kinda.gen.SecureCtrlEncryptType.TYPE3DES;
    private int m_maxLength = Integer.MAX_VALUE;
    private boolean iconHadShow = false;
    private float expandSize = 24.0f;

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

    private void setregExFilterInput(com.tencent.kinda.gen.KeyboardType keyboardType) {
        if (keyboardType == com.tencent.kinda.gen.KeyboardType.ID || keyboardType == com.tencent.kinda.gen.KeyboardType.CRETAIL) {
            this.editText.setregExFilterInput("[^a-zA-Z0-9]");
        } else if (keyboardType == com.tencent.kinda.gen.KeyboardType.NUMBER) {
            this.editText.setregExFilterInput("[^0-9]");
        }
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public com.tencent.kinda.gen.ClearButtonMode getClearButtonMode() {
        return this.clearButtonMode;
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public java.lang.String getDefaultValue() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.defaultValue) ? this.defaultValue : "";
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public boolean getEnabled() {
        return this.editText.isEnabled();
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public com.tencent.kinda.gen.SecureCtrlEncryptType getEncryptType() {
        return this.encryptType;
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public boolean getFocus() {
        return this.editText.isFocused();
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public java.lang.String getHint() {
        return this.editText.getHint().toString();
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public boolean getIsCommonText() {
        return this.editText.getEditState() == com.tenpay.android.wechat.TenpaySecureEditText.EditState.COMMON_TEXT;
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public com.tencent.kinda.gen.KeyboardType getKeyboardType() {
        return this.mKeyboardType;
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public int getMaxLength() {
        return this.m_maxLength;
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public java.lang.String getText() {
        if (this.encryptType != com.tencent.kinda.gen.SecureCtrlEncryptType.TYPERSAWITHOUTHASH) {
            return this.editText.get3DesEncrptData();
        }
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.editText;
        com.tencent.mm.wallet_core.b.a().g();
        return tenpaySecureEditText.getEncryptDataWithHash(false, true);
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public com.tencent.kinda.gen.DynamicColor getTextColor() {
        return new com.tencent.kinda.gen.DynamicColor(this.editText.getCurrentTextColor(), 0L);
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public com.tencent.kinda.gen.DynamicColor getTintColor() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public boolean isCardFromatValid(int i17) {
        return this.editText.isAreaIDCardNum(i17);
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
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

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setDefaultValue(java.lang.String str) {
        this.defaultValue = str;
        this.editText.setText(str);
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setEnabled(boolean z17) {
        this.editText.setEnabled(z17);
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setEncryptType(com.tencent.kinda.gen.SecureCtrlEncryptType secureCtrlEncryptType) {
        this.encryptType = secureCtrlEncryptType;
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setFocus(boolean z17) {
        if (z17) {
            this.editText.requestFocus();
        } else {
            this.editText.clearFocus();
        }
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setHint(java.lang.String str) {
        this.editText.setHint(str);
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setIsCommonText(boolean z17) {
        this.editText.setIsCommonTextFormat(z17);
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setKeyboardType(com.tencent.kinda.gen.KeyboardType keyboardType) {
        this.mKeyboardType = keyboardType;
        if (keyboardType == com.tencent.kinda.gen.KeyboardType.ID || keyboardType == com.tencent.kinda.gen.KeyboardType.CRETAIL) {
            this.mContext.setEditFocusListener(this.editText, 1, false);
        } else if (keyboardType == com.tencent.kinda.gen.KeyboardType.NORMAL) {
            this.mContext.setEditFocusListener(this.editText, 0, true);
        }
        setregExFilterInput(keyboardType);
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setMaxLength(int i17) {
        this.m_maxLength = i17;
        this.editText.setFilters(new android.text.InputFilter[]{new com.tencent.mm.ui.tools.v4(i17, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2)});
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setOnTextChangedCallback(com.tencent.kinda.gen.KSecureEditTextOnTextChangedCallback kSecureEditTextOnTextChangedCallback) {
        this.onTextChangedCallback = kSecureEditTextOnTextChangedCallback;
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setText(java.lang.String str) {
        this.editText.setText(str);
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.editText.setTextColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor));
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
    public void setTextSize(float f17) {
        if (f17 > 0.0f) {
            this.editText.setTextSize(1, f17 * (getSupportDynamicSize() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.mm.sdk.platformtools.x2.f193071a) : 1.0f));
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KSecureEditText
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
        if (z17) {
            setIconVisibility(0);
        } else {
            setIconVisibility(4);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.LinearLayout createView(android.content.Context context) {
        final android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setGravity(16);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = new com.tenpay.android.wechat.TenpaySecureEditText(context);
        this.editText = tenpaySecureEditText;
        tenpaySecureEditText.setSingleLine(true);
        this.editText.setBackground(null);
        this.editText.setTextSize(1, com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(context) * 17.0f);
        com.tenpay.android.wechat.TenpaySecureEditText.setSalt(com.tencent.mm.wallet_core.ui.r1.B());
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setCursorStyle(com.tencent.mm.R.drawable.afr);
        if (this.m_maxLength != Integer.MAX_VALUE) {
            this.editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.m_maxLength)});
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.editText, layoutParams);
        linearLayout.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.1
            @Override // java.lang.Runnable
            public void run() {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.this.editText.getLayoutParams();
                layoutParams2.height = linearLayout.getHeight();
                com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.this.editText.setLayoutParams(layoutParams2);
            }
        });
        if (context instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity) {
            com.tencent.kinda.framework.widget.base.BaseFrActivity baseFrActivity = (com.tencent.kinda.framework.widget.base.BaseFrActivity) context;
            this.mContext = baseFrActivity;
            baseFrActivity.setEditFocusListener(this.editText, 0, false);
            this.editText.setTag(this);
        }
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            this.editText.setHintTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479232tk));
            this.editText.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        }
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView walletIconImageView = new com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView(context);
        this.iconImageView = walletIconImageView;
        int color = context.getResources().getColor(com.tencent.mm.R.color.f478694eb);
        walletIconImageView.f192041u = com.tencent.mm.R.raw.icons_filled_close2;
        walletIconImageView.f192042v = color;
        this.iconImageView.setToClearState(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.this.iconImageView.getVisibility() == 0) {
                    com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.this.editText.setText("");
                }
            }
        });
        setIconVisibility(4);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(com.tencent.mm.ui.zk.a(context, 16), com.tencent.mm.ui.zk.a(context, 16));
        layoutParams2.setMargins(0, 0, com.tencent.mm.ui.zk.a(context, 4), 0);
        linearLayout.addView(this.iconImageView, layoutParams2);
        this.editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                if (com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.this.onTextChangedCallback == null || editable == null) {
                    return;
                }
                com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.this.onTextChangedCallback.onTextChanged(editable.toString());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                if (com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.this.clearButtonMode == com.tencent.kinda.gen.ClearButtonMode.NEVER) {
                    return;
                }
                if (charSequence.length() <= 0 || com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.this.clearButtonMode != com.tencent.kinda.gen.ClearButtonMode.WHILEEDITING) {
                    com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.this.setIconVisibility(4);
                } else {
                    com.tencent.kinda.framework.widget.base.KindaSecureEditTextImpl.this.setIconVisibility(0);
                }
            }
        });
        return linearLayout;
    }
}
