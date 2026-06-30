package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaCardNumberEditViewImpl extends com.tencent.kinda.framework.widget.base.MMKView<com.tenpay.android.wechat.TenpaySecureEditText> implements com.tencent.kinda.gen.KCardNumberEditView {
    private com.tencent.kinda.gen.KCardNumberEditViewOnTextChangedCallback m_callback;
    private com.tencent.kinda.gen.KCardNumberEditViewOnTextEndEditingCallback m_endEditingCallback;
    private com.tenpay.android.wechat.TenpaySecureEditText cardNumberView = null;
    private com.tencent.kinda.gen.DynamicColor normalColor = new com.tencent.kinda.gen.DynamicColor(-1, 0);
    private com.tencent.kinda.gen.DynamicColor hintColor = new com.tencent.kinda.gen.DynamicColor(-1, 0);

    public void callbackKindaTextEndEditing() {
        com.tencent.kinda.gen.KCardNumberEditViewOnTextEndEditingCallback kCardNumberEditViewOnTextEndEditingCallback = this.m_endEditingCallback;
        if (kCardNumberEditViewOnTextEndEditingCallback != null) {
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.cardNumberView;
            com.tencent.mm.wallet_core.b.a().g();
            kCardNumberEditViewOnTextEndEditingCallback.onTextEndEditing(tenpaySecureEditText.getEncryptDataWithHash(false, true));
        }
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public boolean getFocus() {
        return this.cardNumberView.isFocused();
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public java.lang.String getHint() {
        return this.cardNumberView.getHint().toString();
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public com.tencent.kinda.gen.DynamicColor getHintColor() {
        return this.hintColor;
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public int getInputTextLength() {
        return this.cardNumberView.getInputLength();
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public com.tencent.kinda.gen.DynamicColor getTextColor() {
        return this.normalColor;
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public java.lang.String getValue() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.cardNumberView;
        com.tencent.mm.wallet_core.b.a().g();
        return tenpaySecureEditText.getEncryptDataWithHash(false, true);
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public boolean isBankCardNumber() {
        return this.cardNumberView.isBankcardNum();
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public void setFocus(boolean z17) {
        if (z17 && this.cardNumberView.isFocused()) {
            this.cardNumberView.clearFocus();
        }
        if (z17) {
            this.cardNumberView.requestFocus();
        } else {
            this.cardNumberView.clearFocus();
            callbackKindaTextEndEditing();
        }
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public void setHint(java.lang.String str) {
        this.cardNumberView.setHint(str);
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public void setHintColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.hintColor) != com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)) {
            this.hintColor = dynamicColor;
        }
        this.cardNumberView.setHintTextColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.hintColor));
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public void setOnTextChangedCallback(com.tencent.kinda.gen.KCardNumberEditViewOnTextChangedCallback kCardNumberEditViewOnTextChangedCallback) {
        this.m_callback = kCardNumberEditViewOnTextChangedCallback;
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public void setOnTextEndEditingCallback(com.tencent.kinda.gen.KCardNumberEditViewOnTextEndEditingCallback kCardNumberEditViewOnTextEndEditingCallback) {
        this.m_endEditingCallback = kCardNumberEditViewOnTextEndEditingCallback;
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public void setText(java.lang.String str) {
        this.cardNumberView.setText(str);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.cardNumberView;
        tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().toString().length());
        this.cardNumberView.clearFocus();
    }

    @Override // com.tencent.kinda.gen.KCardNumberEditView
    public void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.normalColor) != com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)) {
            this.normalColor = dynamicColor;
        }
        this.cardNumberView.setTextColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.normalColor));
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public com.tenpay.android.wechat.TenpaySecureEditText createView(android.content.Context context) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = new com.tenpay.android.wechat.TenpaySecureEditText(context);
        this.cardNumberView = tenpaySecureEditText;
        tenpaySecureEditText.setIsBankcardFormat(true);
        this.cardNumberView.setBackground(null);
        this.cardNumberView.setInputType(131072);
        this.cardNumberView.setSingleLine(false);
        this.cardNumberView.setTextSize(0, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(context, com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(context) * 17.0f));
        this.cardNumberView.setPadding(0, 0, com.tencent.mm.ui.zk.a(context, 4), 0);
        this.cardNumberView.setCursorStyle(com.tencent.mm.R.drawable.afr);
        this.cardNumberView.setregExFilterInput("[^0-9]");
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            this.cardNumberView.setClearBtnDrawableId(com.tencent.kinda.framework.R.raw.kinda_actionbar_icon_light_clear, 0, 16, 16);
        } else {
            this.cardNumberView.setClearBtnDrawableId(com.tencent.kinda.framework.R.raw.kinda_actionbar_icon_dark_clear, 0, 16, 16);
        }
        com.tenpay.android.wechat.TenpaySecureEditText.setSalt(com.tencent.mm.wallet_core.ui.r1.B());
        this.cardNumberView.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(24)});
        this.cardNumberView.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                if (com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl.this.m_callback != null) {
                    com.tencent.kinda.gen.KCardNumberEditViewOnTextChangedCallback kCardNumberEditViewOnTextChangedCallback = com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl.this.m_callback;
                    com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl.this.cardNumberView;
                    com.tencent.mm.wallet_core.b.a().g();
                    kCardNumberEditViewOnTextChangedCallback.onTextChanged(tenpaySecureEditText2.getEncryptDataWithHash(false, true));
                }
            }
        });
        this.cardNumberView.setTag(this);
        if (context instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity) {
            ((com.tencent.kinda.framework.widget.base.BaseFrActivity) context).setEditFocusListener(this.cardNumberView, 0, false);
        }
        this.cardNumberView.setId(com.tencent.kinda.framework.R.id.kinda_bank_card_input);
        this.cardNumberView.setKindaEditTextCallBackListener(new com.tenpay.android.wechat.TenpaySecureEditText.IKindaEditTextCallBackListener() { // from class: com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl.2
            @Override // com.tenpay.android.wechat.TenpaySecureEditText.IKindaEditTextCallBackListener
            public void onCallBackKinda() {
                com.tencent.kinda.gen.KViewOnClickCallback onClickCallback = com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl.this.getOnClickCallback();
                if (onClickCallback != null) {
                    onClickCallback.onClick(com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl.this);
                }
            }
        });
        return this.cardNumberView;
    }
}
