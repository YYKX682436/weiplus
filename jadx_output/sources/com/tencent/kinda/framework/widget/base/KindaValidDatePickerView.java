package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaValidDatePickerView extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.EditText> implements com.tencent.kinda.gen.KValidDatePickerView {
    private com.tencent.mm.framework.app.UIPageFragmentActivity activity;
    com.tencent.kinda.gen.KValidDatePickerViewOnSelectCallback callback;
    private com.tencent.mm.ui.widget.picker.o datePicker;
    private com.tenpay.android.wechat.TenpaySecureEditText mEditText;
    private java.lang.String mSelected;
    private int mYear = -1;
    private int mMonthOfYear = -1;

    @Override // com.tencent.kinda.gen.KValidDatePickerView
    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    @Override // com.tencent.kinda.gen.KValidDatePickerView
    public java.lang.String getText() {
        return this.mSelected;
    }

    @Override // com.tencent.kinda.gen.KValidDatePickerView
    public void setFocus(boolean z17) {
        if (!z17) {
            com.tencent.mm.ui.widget.picker.o oVar = this.datePicker;
            if (oVar != null) {
                oVar.b();
                return;
            }
            return;
        }
        this.activity.hideVKB();
        this.activity.hideTenpayKB();
        com.tencent.mm.ui.widget.picker.o oVar2 = new com.tencent.mm.ui.widget.picker.o(this.activity);
        this.datePicker = oVar2;
        oVar2.g(true, true, false);
        this.datePicker.f212307n = new com.tencent.mm.ui.widget.picker.n() { // from class: com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.2
            @Override // com.tencent.mm.ui.widget.picker.n
            public void onResult(boolean z18, int i17, int i18, int i19) {
                com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.datePicker.b();
                if (z18) {
                    java.lang.String a17 = com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.datePicker.a();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                        return;
                    }
                    java.lang.String[] split = a17.split("-");
                    if (split.length < 2) {
                        return;
                    }
                    com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.mYear = com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0);
                    com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.mMonthOfYear = com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0) - 1;
                    int unused = com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.mYear;
                    int unused2 = com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.mMonthOfYear;
                    java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("00", new java.text.DecimalFormatSymbols(java.util.Locale.ENGLISH));
                    com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.mEditText.setText(decimalFormat.format(com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.mMonthOfYear + 1) + decimalFormat.format(com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.mYear).substring(2));
                    com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.mSelected = decimalFormat.format((long) com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.mYear).substring(2) + decimalFormat.format(com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this.mMonthOfYear + 1);
                    com.tencent.kinda.framework.widget.base.KindaValidDatePickerView kindaValidDatePickerView = com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.this;
                    kindaValidDatePickerView.callback.onSelect(kindaValidDatePickerView.mSelected);
                }
            }
        };
        java.lang.String[] split = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date()).split("-");
        if (split.length >= 3) {
            this.datePicker.f(com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0), com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0), com.tencent.mm.sdk.platformtools.t8.D1(split[2], 0));
            this.datePicker.e(com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0) + 30, 12, 31);
        } else {
            this.datePicker.f(com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0), 1, 1);
            this.datePicker.e(com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0) + 30, 12, 31);
        }
        this.datePicker.d(this.mYear, this.mMonthOfYear + 1, 1);
        this.datePicker.h();
    }

    @Override // com.tencent.kinda.gen.KValidDatePickerView
    public void setOnSelectCallback(com.tencent.kinda.gen.KValidDatePickerViewOnSelectCallback kValidDatePickerViewOnSelectCallback) {
        this.callback = kValidDatePickerViewOnSelectCallback;
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.EditText createView(android.content.Context context) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = new com.tenpay.android.wechat.TenpaySecureEditText(context);
        this.mEditText = tenpaySecureEditText;
        tenpaySecureEditText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground(null);
        this.mEditText.setIsValidThru(true);
        this.mEditText.setHint(com.tencent.mm.R.string.khu);
        this.mEditText.setSingleLine(false);
        this.mEditText.setPadding(0, 0, 0, 0);
        this.mEditText.setTextSize(0, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(context, com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(context) * 17.0f));
        this.mEditText.setAccessibilityDelegate(new com.tencent.mm.wallet_core.e() { // from class: com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.1
            @Override // com.tencent.mm.wallet_core.e, android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
            }
        });
        if (context instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) {
            this.activity = (com.tencent.mm.framework.app.UIPageFragmentActivity) context;
        }
        return this.mEditText;
    }
}
