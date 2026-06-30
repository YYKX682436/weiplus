package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaBankEditViewImpl extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.TextView> implements com.tencent.kinda.gen.KBankEditView {
    private byte _hellAccFlag_;
    private byte[] mBankLiskBuffer;
    private java.lang.String mBankType;
    private byte[] mBankTypeLiskBuffer;
    private com.tencent.kinda.gen.KBankEditViewOnSeletBankCallback mCallBack;
    private android.content.Context mContext;
    private android.widget.TextView mEditText;
    private byte[] mMajorBankLiskBuffer;
    java.lang.String TAG = "KindaBank.KindaBankEditViewImpl";
    private com.tencent.kinda.gen.DynamicColor normalColor = new com.tencent.kinda.gen.DynamicColor(-1, 0);
    private com.tencent.kinda.gen.FontStyle fontStyle = com.tencent.kinda.gen.FontStyle.REGULAR;
    private com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BankEditSelectedEvent> bankEditSelectedEventIListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BankEditSelectedEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl.1
        {
            this.__eventId = -1230036023;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.BankEditSelectedEvent bankEditSelectedEvent) {
            java.lang.String str;
            if (com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.FLAG_ACTIVITY_CLOSE.equals(bankEditSelectedEvent.f53996g.f7286a)) {
                com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl.this.bankEditSelectedEventIListener.dead();
                return false;
            }
            am.m0 m0Var = bankEditSelectedEvent.f53996g;
            if (com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.FLAG_ACTIVITY_BACK.equals(m0Var.f7286a)) {
                com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl.this.mCallBack.onSeletBank("", "");
                return false;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.M0(com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl.this.mBankTypeLiskBuffer)) {
                str = m0Var.f7286a + " " + m0Var.f7288c;
            } else {
                str = m0Var.f7286a;
            }
            com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl.this.mEditText.setText(str);
            if (com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl.this.mCallBack == null) {
                return false;
            }
            com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl.this.mBankType = m0Var.f7287b;
            com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl.this.mCallBack.onSeletBank(str, com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl.this.mBankType);
            return false;
        }
    };

    @Override // com.tencent.kinda.gen.KBankEditView
    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public com.tencent.kinda.gen.FontStyle getFontStyle() {
        return this.fontStyle;
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public java.lang.String getSelectedBankType() {
        return this.mBankType;
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public com.tencent.kinda.gen.DynamicColor getTextColor() {
        return this.normalColor;
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public float getTextSize() {
        return this.mEditText.getTextSize();
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public void openBankSelectView() {
        setFocus(true);
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public void setData(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        this.mBankLiskBuffer = iTransmitKvData.getBinary("bank_list");
        this.mBankTypeLiskBuffer = iTransmitKvData.getBinary("bank_type_list");
        this.mMajorBankLiskBuffer = iTransmitKvData.getBinary("major_bank_list");
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public void setFocus(boolean z17) {
        if (z17) {
            this.bankEditSelectedEventIListener.alive();
            android.content.Context context = this.mContext;
            if (context instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity) {
                ((com.tencent.kinda.framework.widget.base.BaseFrActivity) context).hideTenpayKB();
            }
            android.content.Intent intent = new android.content.Intent(this.mContext, (java.lang.Class<?>) com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.class);
            intent.putExtra("bank_list", this.mBankLiskBuffer);
            intent.putExtra("bank_type_list", this.mBankTypeLiskBuffer);
            intent.putExtra("major_bank_list", this.mMajorBankLiskBuffer);
            android.content.Context context2 = this.mContext;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaBankEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/kinda/framework/widget/base/KindaBankEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public void setFontStyle(com.tencent.kinda.gen.FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        if (fontStyle == com.tencent.kinda.gen.FontStyle.BOLD) {
            this.mEditText.setTypeface(null, 1);
        } else {
            this.mEditText.setTypeface(null, 0);
        }
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public void setOnSeletBankCallback(com.tencent.kinda.gen.KBankEditViewOnSeletBankCallback kBankEditViewOnSeletBankCallback) {
        this.mCallBack = kBankEditViewOnSeletBankCallback;
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public void setSelected(java.lang.String str) {
        this.mEditText.setText(str);
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.normalColor) != com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)) {
            this.normalColor = dynamicColor;
        }
        this.mEditText.setTextColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.normalColor));
    }

    @Override // com.tencent.kinda.gen.KBankEditView
    public void setTextSize(float f17) {
        this.mEditText.setTextSize(0, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.mm.sdk.platformtools.x2.f193071a, f17 * com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.mm.sdk.platformtools.x2.f193071a)));
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.TextView createView(android.content.Context context) {
        android.widget.TextView textView = new android.widget.TextView(context);
        this.mEditText = textView;
        textView.setFocusable(false);
        this.mEditText.setBackground(null);
        this.mEditText.setHint(com.tencent.mm.R.string.f493588kv0);
        this.mEditText.setTextSize(0, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(context, com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(context) * 17.0f));
        android.widget.TextView textView2 = this.mEditText;
        textView2.setPadding(0, textView2.getHeight() / 2, 0, this.mEditText.getHeight() / 2);
        this.mEditText.setGravity(16);
        this.mEditText.setSingleLine(false);
        com.tencent.mm.wallet_core.e eVar = new com.tencent.mm.wallet_core.e();
        eVar.setViewType(com.tencent.kinda.gen.TraitsType.BUTTON);
        this.mEditText.setAccessibilityDelegate(eVar);
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            this.mEditText.setHintTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479232tk));
            this.mEditText.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        }
        this.mContext = context;
        com.tencent.mars.xlog.Log.i(this.TAG, "BankEditSelected callback，注册监听，当前线程：" + java.lang.Thread.currentThread().getId());
        return this.mEditText;
    }
}
