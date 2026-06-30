package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKMultiLineEditText extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.LinearLayout> implements com.tencent.kinda.gen.KMultiLineEditText {
    protected android.widget.EditText editText;
    private com.tencent.kinda.gen.VoidBoolCallback focusChangedCallback;
    private java.lang.String hintText;
    private com.tencent.kinda.gen.VoidStringCallback textChangedCallback;
    private com.tencent.kinda.gen.VoidCallback textEndEditingCallback;
    private java.lang.String textFontName;
    private float textSize;
    private com.tencent.kinda.gen.DynamicColor textColor = new com.tencent.kinda.gen.DynamicColor(-1, 0);
    private com.tencent.kinda.gen.DynamicColor hintColor = new com.tencent.kinda.gen.DynamicColor(0, 0);
    private android.widget.LinearLayout dummyFocusView = null;
    private com.tencent.kinda.gen.TextAlign textAlign = com.tencent.kinda.gen.TextAlign.LEFT;
    private int maxLength = -1;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText$2, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$TextAlign;

        static {
            int[] iArr = new int[com.tencent.kinda.gen.TextAlign.values().length];
            $SwitchMap$com$tencent$kinda$gen$TextAlign = iArr;
            try {
                iArr[com.tencent.kinda.gen.TextAlign.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$TextAlign[com.tencent.kinda.gen.TextAlign.CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$TextAlign[com.tencent.kinda.gen.TextAlign.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$1(android.view.View view, boolean z17) {
        com.tencent.kinda.gen.VoidBoolCallback voidBoolCallback = this.focusChangedCallback;
        if (voidBoolCallback != null) {
            voidBoolCallback.call(z17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$2(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.kinda.gen.KViewOnClickCallback onClickCallback;
        if (this.editText.isFocused() || motionEvent.getAction() != 0 || (onClickCallback = getOnClickCallback()) == null) {
            return false;
        }
        onClickCallback.onClick(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFocus$0() {
        this.editText.requestFocus();
        ((android.view.inputmethod.InputMethodManager) this.mContext.getSystemService("input_method")).showSoftInput(this.editText, 0);
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public boolean getEnabled() {
        return this.editText.isEnabled();
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public boolean getFocus() {
        return this.editText.isFocused();
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
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

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public com.tencent.kinda.gen.DynamicColor getHintColor() {
        return this.hintColor;
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public int getMaxLength() {
        return this.maxLength;
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public java.lang.String getText() {
        android.text.Editable text = this.editText.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public com.tencent.kinda.gen.TextAlign getTextAlign() {
        return this.textAlign;
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public com.tencent.kinda.gen.DynamicColor getTextColor() {
        return this.textColor;
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public java.lang.String getTextFont() {
        return this.textFontName;
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public float getTextSize() {
        return this.textSize;
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setEnabled(boolean z17) {
        this.editText.setEnabled(z17);
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setFocus(boolean z17) {
        if (z17) {
            if (this.editText.hasFocus()) {
                this.editText.clearFocus();
            }
            this.editText.postDelayed(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this.lambda$setFocus$0();
                }
            }, 50L);
        } else if (this.editText.hasFocus()) {
            this.editText.clearFocus();
            com.tencent.kinda.gen.VoidCallback voidCallback = this.textEndEditingCallback;
            if (voidCallback != null) {
                voidCallback.call();
            }
            ((android.view.inputmethod.InputMethodManager) this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(this.editText.getWindowToken(), 0);
        }
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setHint(java.lang.String str) {
        this.hintText = str;
        this.editText.setHint(str);
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setHintColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.hintColor = dynamicColor;
        this.editText.setHintTextColor(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)));
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setMaxLength(int i17) {
        if (i17 >= 0) {
            this.maxLength = i17;
            this.editText.setFilters(new android.text.InputFilter[]{new com.tencent.kinda.framework.widget.base.MMKEditTextLengthFilter(i17)});
        }
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setOnFocusChangedImpl(com.tencent.kinda.gen.VoidBoolCallback voidBoolCallback) {
        this.focusChangedCallback = voidBoolCallback;
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setOnTextChangedImpl(com.tencent.kinda.gen.VoidStringCallback voidStringCallback) {
        this.textChangedCallback = voidStringCallback;
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setOnTextEndEditingImpl(com.tencent.kinda.gen.VoidCallback voidCallback) {
        this.textEndEditingCallback = voidCallback;
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setText(java.lang.String str) {
        if (str == null || getText().equals(str)) {
            return;
        }
        this.editText.setText(str);
        android.widget.EditText editText = this.editText;
        editText.setSelection(editText.getText().length());
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setTextAlign(com.tencent.kinda.gen.TextAlign textAlign) {
        android.widget.EditText editText;
        if (textAlign != null) {
            this.textAlign = textAlign;
            int i17 = com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.AnonymousClass2.$SwitchMap$com$tencent$kinda$gen$TextAlign[textAlign.ordinal()];
            if (i17 == 1) {
                getView().setGravity(8388611);
            } else if (i17 == 2) {
                getView().setGravity(1);
            } else if (i17 == 3 && (editText = this.editText) != null) {
                editText.setGravity(8388613);
            }
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.textColor = dynamicColor;
        this.editText.setTextColor(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)));
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
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
            this.textFontName = str;
        }
    }

    @Override // com.tencent.kinda.gen.KMultiLineEditText
    public void setTextSize(float f17) {
        if (f17 > 0.0f) {
            float scaleSize = f17 * (getSupportDynamicSize() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.mm.sdk.platformtools.x2.f193071a) : 1.0f);
            this.textSize = scaleSize;
            this.editText.setTextSize(1, scaleSize);
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.LinearLayout createView(android.content.Context context) {
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
        this.editText.setMaxLines(20);
        this.editText.setBackground(null);
        this.editText.setTextSize(1, com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(context) * 17.0f);
        this.editText.setTag(this);
        this.editText.setPadding(0, 0, 0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        linearLayout.addView(this.editText, layoutParams2);
        this.editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                android.widget.EditText editText;
                android.widget.EditText editText2;
                com.tencent.kinda.gen.TextAlign textAlign = com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this.textAlign;
                com.tencent.kinda.gen.TextAlign textAlign2 = com.tencent.kinda.gen.TextAlign.RIGHT;
                if (textAlign == textAlign2 && (editText2 = com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this.editText) != null) {
                    editText2.setTextDirection(3);
                }
                if (com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this.textChangedCallback != null && editable != null) {
                    com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this.textChangedCallback.call(editable.toString());
                }
                if (editable == null || android.text.TextUtils.isEmpty(editable.toString())) {
                    com.tencent.kinda.framework.widget.base.MMKMultiLineEditText mMKMultiLineEditText = com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this;
                    android.widget.EditText editText3 = mMKMultiLineEditText.editText;
                    if (editText3 != null) {
                        editText3.setHint(mMKMultiLineEditText.hintText);
                    }
                    if (com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this.textAlign == textAlign2 && (editText = com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this.editText) != null) {
                        editText.setTextDirection(4);
                    }
                } else {
                    com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this.editText.setHint("");
                }
                com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this.notifyChanged();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }
        });
        this.editText.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText$$b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z17) {
                com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this.lambda$createView$1(view, z17);
            }
        });
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            this.editText.setHintTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479232tk));
            this.editText.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        }
        this.editText.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText$$c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                boolean lambda$createView$2;
                lambda$createView$2 = com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.this.lambda$createView$2(view, motionEvent);
                return lambda$createView$2;
            }
        });
        this.editText.setId(com.tencent.kinda.framework.R.id.kinda_edit_text_input);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        return linearLayout;
    }
}
