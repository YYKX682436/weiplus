package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaDatePickerView extends com.tencent.kinda.framework.widget.base.MMKView<android.view.View> implements com.tencent.kinda.gen.KDatePickerView {
    private static final java.lang.String TAG = "KindaDatePickerView";
    private com.tencent.mm.framework.app.UIPageFragmentActivity activity;
    private com.tencent.kinda.gen.KDatePickerViewOnSelectCallback callback;
    private com.tencent.mm.ui.widget.picker.o datePicker;
    private java.util.Calendar mCalendar;
    private android.widget.LinearLayout mContainer;
    private com.tenpay.android.wechat.TenpaySecureEditText mEditText;
    private int mYear = -1;
    private int mMonthOfYear = -1;
    private int mDay = -1;
    private java.lang.String mShowResult = "";
    private com.tencent.kinda.gen.DatePickerType mType = com.tencent.kinda.gen.DatePickerType.BIRTH_DAY;
    private boolean isLongTerm = false;

    private java.util.Calendar calendar() {
        if (this.mCalendar == null) {
            this.mCalendar = java.util.Calendar.getInstance();
        }
        return this.mCalendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getEncString() {
        int i17;
        return (this.isLongTerm && (i17 = this.mYear) == 9999) ? this.mEditText.get3DesEncrptData(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.mMonthOfYear), java.lang.Integer.valueOf(this.mDay))) : this.mEditText.get3DesEncrptData(this.mShowResult.replaceAll("/", ""));
    }

    private void initDatePicker() {
        com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity = this.activity;
        if (uIPageFragmentActivity == null) {
            com.tencent.mars.xlog.Log.e(TAG, "activity is null!");
        } else {
            this.datePicker = new com.tencent.mm.ui.widget.picker.o(uIPageFragmentActivity);
        }
    }

    private void initDatePickerData() {
        java.lang.String[] split = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date()).split("-");
        this.mYear = com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0);
        this.mMonthOfYear = com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0);
        this.mDay = com.tencent.mm.sdk.platformtools.t8.D1(split[2], 0);
    }

    private void setMinAndMaxDate(com.tencent.kinda.gen.DatePickerType datePickerType) {
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew;
        com.tencent.mm.ui.widget.picker.o oVar = this.datePicker;
        if (oVar == null) {
            return;
        }
        if (datePickerType == com.tencent.kinda.gen.DatePickerType.BIRTH_DAY) {
            oVar.f(1900, 1, 1);
            java.lang.String[] split = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date()).split("-");
            if (split.length >= 3) {
                this.datePicker.e(com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0), com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0), com.tencent.mm.sdk.platformtools.t8.D1(split[2], 0));
                return;
            }
            return;
        }
        if (datePickerType == com.tencent.kinda.gen.DatePickerType.IDENTITY_VALID_DATE) {
            java.lang.String[] split2 = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date()).split("-");
            if (split2.length >= 3) {
                this.datePicker.f(com.tencent.mm.sdk.platformtools.t8.D1(split2[0], 0), com.tencent.mm.sdk.platformtools.t8.D1(split2[1], 0), com.tencent.mm.sdk.platformtools.t8.D1(split2[2], 0));
                this.datePicker.e(com.tencent.mm.sdk.platformtools.t8.D1(split2[0], 0) + 100, 12, 31);
            }
            if (!this.isLongTerm || (customDatePickerNew = this.datePicker.f212306m) == null) {
                return;
            }
            customDatePickerNew.setLongTermYear(true);
            return;
        }
        if (datePickerType == com.tencent.kinda.gen.DatePickerType.IDENTITY_EFFECT_DATE) {
            java.lang.String[] split3 = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date()).split("-");
            if (split3.length >= 3) {
                this.datePicker.e(com.tencent.mm.sdk.platformtools.t8.D1(split3[0], 0), com.tencent.mm.sdk.platformtools.t8.D1(split3[1], 0), com.tencent.mm.sdk.platformtools.t8.D1(split3[2], 0));
                int D1 = com.tencent.mm.sdk.platformtools.t8.D1(split3[0], 0) - 100;
                if (D1 < 1) {
                    D1 = 1;
                }
                this.datePicker.f(D1, 1, 1);
            }
        }
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public com.tencent.kinda.gen.KDate currentDate() {
        java.util.Calendar calendar = calendar();
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        return new com.tencent.kinda.gen.KDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public boolean getCanBeLongTerm() {
        return this.isLongTerm;
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public com.tencent.kinda.gen.KDate getEndDate() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public com.tencent.kinda.gen.KDate getSelectedDate() {
        return new com.tencent.kinda.gen.KDate(this.mYear, this.mMonthOfYear, this.mDay);
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public com.tencent.kinda.gen.KDate getStartDate() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public com.tencent.kinda.gen.DatePickerType getType() {
        return this.mType;
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public java.lang.String getValue() {
        return getEncString();
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public void setCanBeLongTerm(boolean z17) {
        this.isLongTerm = z17;
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = this.datePicker.f212306m;
        if (customDatePickerNew != null) {
            customDatePickerNew.setLongTermYear(z17);
        }
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public void setEndDate(com.tencent.kinda.gen.KDate kDate) {
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public void setFocus(boolean z17) {
        if (!z17) {
            com.tencent.mm.ui.widget.picker.o oVar = this.datePicker;
            if (oVar != null) {
                oVar.b();
                return;
            }
            return;
        }
        com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity = this.activity;
        if (uIPageFragmentActivity == null) {
            com.tencent.mars.xlog.Log.e(TAG, "activity is null!");
            return;
        }
        uIPageFragmentActivity.hideVKB();
        this.activity.hideTenpayKB();
        this.datePicker = new com.tencent.mm.ui.widget.picker.o(this.activity);
        setMinAndMaxDate(this.mType);
        this.datePicker.g(true, true, true);
        this.datePicker.f212307n = new com.tencent.mm.ui.widget.picker.n() { // from class: com.tencent.kinda.framework.widget.base.KindaDatePickerView.1
            @Override // com.tencent.mm.ui.widget.picker.n
            public void onResult(boolean z18, int i17, int i18, int i19) {
                com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.datePicker.b();
                if (z18) {
                    com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mYear = i17;
                    com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mMonthOfYear = i18;
                    com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mDay = i19;
                    if (com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.isLongTerm && i17 == 1) {
                        com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mYear = 9999;
                        com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mMonthOfYear = 12;
                        com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mDay = 31;
                        com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mShowResult = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.kinda.framework.R.string.wc_pay_realname_input_long_term_hint_text_1);
                    } else {
                        com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mShowResult = java.lang.String.format("%04d/%02d/%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    }
                    com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mEditText.setText(com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mShowResult);
                    com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mContainer.setContentDescription(com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.mShowResult);
                    com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.callback.onSelect(com.tencent.kinda.framework.widget.base.KindaDatePickerView.this.getEncString());
                }
            }
        };
        int i17 = this.mYear;
        if (i17 == 9999) {
            com.tencent.mars.xlog.Log.i(TAG, "init long term");
            this.datePicker.d(1, 1, 1);
        } else {
            this.datePicker.d(i17, this.mMonthOfYear, this.mDay);
        }
        this.datePicker.h();
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public void setHint(java.lang.String str) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.mEditText;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setHint(str);
            if (this.mContainer == null || !com.tencent.mm.sdk.platformtools.t8.J0(this.mEditText.getText())) {
                return;
            }
            this.mContainer.setContentDescription(str);
        }
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public void setOnSelectCallback(com.tencent.kinda.gen.KDatePickerViewOnSelectCallback kDatePickerViewOnSelectCallback) {
        this.callback = kDatePickerViewOnSelectCallback;
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public void setOriginDate(int i17, int i18, int i19) {
        this.mYear = i17;
        this.mMonthOfYear = i18;
        this.mDay = i19;
        if (this.isLongTerm && i17 == 9999) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.kinda.framework.R.string.wc_pay_realname_input_long_term_hint_text_1);
            this.mShowResult = string;
            this.mEditText.setText(string);
        } else {
            java.lang.String format = java.lang.String.format("%04d/%02d/%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            this.mShowResult = format;
            this.mEditText.setText(format);
        }
        this.mContainer.setContentDescription(this.mShowResult);
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public void setStartDate(com.tencent.kinda.gen.KDate kDate) {
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public void setType(com.tencent.kinda.gen.DatePickerType datePickerType) {
        this.mType = datePickerType;
        if (datePickerType == com.tencent.kinda.gen.DatePickerType.BIRTH_DAY) {
            this.mEditText.setHint(com.tencent.mm.R.string.kj6);
            if (com.tencent.mm.sdk.platformtools.t8.J0(this.mEditText.getText())) {
                this.mContainer.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kj6));
            }
        } else if (datePickerType == com.tencent.kinda.gen.DatePickerType.IDENTITY_VALID_DATE) {
            this.mEditText.setHint(com.tencent.mm.R.string.khp);
            if (com.tencent.mm.sdk.platformtools.t8.J0(this.mEditText.getText())) {
                this.mContainer.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.khp));
            }
        }
        setMinAndMaxDate(datePickerType);
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public void setValue(java.lang.String str) {
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public long timeForDate(com.tencent.kinda.gen.KDate kDate) {
        if (kDate == null) {
            return 0L;
        }
        java.util.Calendar calendar = calendar();
        calendar.clear();
        calendar.set(kDate.mYear, kDate.mMonth - 1, kDate.mDay);
        return calendar.getTimeInMillis();
    }

    @Override // com.tencent.kinda.gen.KDatePickerView
    public int yearOfNow() {
        java.util.Calendar calendar = calendar();
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        return calendar.get(1);
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.view.View createView(android.content.Context context) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = new com.tenpay.android.wechat.TenpaySecureEditText(context);
        this.mEditText = tenpaySecureEditText;
        tenpaySecureEditText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground(null);
        this.mEditText.setTextSize(0, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(com.tencent.mm.sdk.platformtools.x2.f193071a, 17.0f));
        this.mEditText.setPadding(0, 0, 0, 0);
        this.mEditText.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a_r));
        if (context instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) {
            this.activity = (com.tencent.mm.framework.app.UIPageFragmentActivity) context;
        }
        initDatePickerData();
        initDatePicker();
        com.tencent.kinda.framework.widget.base.LayoutWrapper layoutWrapper = new com.tencent.kinda.framework.widget.base.LayoutWrapper(context, this.mEditText);
        this.mContainer = layoutWrapper;
        return layoutWrapper;
    }
}
