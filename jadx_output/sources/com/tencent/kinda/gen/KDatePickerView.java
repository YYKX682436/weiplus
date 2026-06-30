package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KDatePickerView extends com.tencent.kinda.gen.KView {
    com.tencent.kinda.gen.KDate currentDate();

    boolean getCanBeLongTerm();

    com.tencent.kinda.gen.KDate getEndDate();

    boolean getFocus();

    com.tencent.kinda.gen.KDate getSelectedDate();

    com.tencent.kinda.gen.KDate getStartDate();

    com.tencent.kinda.gen.DatePickerType getType();

    java.lang.String getValue();

    void setCanBeLongTerm(boolean z17);

    void setEndDate(com.tencent.kinda.gen.KDate kDate);

    void setFocus(boolean z17);

    void setHint(java.lang.String str);

    void setOnSelectCallback(com.tencent.kinda.gen.KDatePickerViewOnSelectCallback kDatePickerViewOnSelectCallback);

    void setOriginDate(int i17, int i18, int i19);

    void setStartDate(com.tencent.kinda.gen.KDate kDate);

    void setType(com.tencent.kinda.gen.DatePickerType datePickerType);

    void setValue(java.lang.String str);

    long timeForDate(com.tencent.kinda.gen.KDate kDate);

    int yearOfNow();
}
