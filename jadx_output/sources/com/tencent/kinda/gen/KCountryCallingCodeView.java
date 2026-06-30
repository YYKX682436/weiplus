package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KCountryCallingCodeView extends com.tencent.kinda.gen.KView {
    java.lang.String getCountryCode();

    boolean getFocus();

    boolean getHideCode();

    java.lang.String getNationality();

    java.lang.String getPlaceHolder();

    void setCountryCode(java.lang.String str);

    void setFocus(boolean z17);

    void setHideCode(boolean z17);

    void setNationality(java.lang.String str);

    void setNationalityExcludeArray(java.util.ArrayList<java.lang.String> arrayList);

    void setOnSelectCallback(com.tencent.kinda.gen.KCountryCallingCodeViewOnSelectCallback kCountryCallingCodeViewOnSelectCallback);

    void setPlaceHolder(java.lang.String str);
}
