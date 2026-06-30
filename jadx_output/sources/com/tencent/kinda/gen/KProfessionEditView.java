package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KProfessionEditView extends com.tencent.kinda.gen.KView {
    boolean getFocus();

    java.lang.String getProfessionName();

    int getProfessionType();

    void setData(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    void setDefaultProfession(int i17, java.lang.String str);

    void setFocus(boolean z17);

    void setOnSelectProfessionCallback(com.tencent.kinda.gen.KProfessionEditViewOnSelectProfessionCallback kProfessionEditViewOnSelectProfessionCallback);
}
