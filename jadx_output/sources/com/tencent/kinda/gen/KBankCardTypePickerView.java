package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public interface KBankCardTypePickerView extends com.tencent.kinda.gen.KView {
    boolean getFocus();

    java.lang.String getValue();

    void setBankCardType(java.util.ArrayList<com.tencent.kinda.gen.BankCardType> arrayList);

    void setFocus(boolean z17);

    void setOnSelectCallback(com.tencent.kinda.gen.KBankCardTypePickerViewOnSelectCallback kBankCardTypePickerViewOnSelectCallback);

    void setSelectedBankCardType(com.tencent.kinda.gen.BankCardType bankCardType);

    void setValue(java.lang.String str);
}
