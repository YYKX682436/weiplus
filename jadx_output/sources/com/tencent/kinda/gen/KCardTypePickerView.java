package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KCardTypePickerView extends com.tencent.kinda.gen.KView {
    boolean getEnabled();

    boolean getFocus();

    void select(int i17);

    void setEnabled(boolean z17);

    void setFocus(boolean z17);

    void setHint(java.lang.String str);

    void setOnSelectCallback(com.tencent.kinda.gen.KCardTypePickerViewOnSelectCallback kCardTypePickerViewOnSelectCallback);

    void setOptions(java.util.ArrayList<com.tencent.kinda.gen.Option> arrayList);

    void setTextSize(float f17);
}
