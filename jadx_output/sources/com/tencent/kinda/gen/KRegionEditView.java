package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KRegionEditView extends com.tencent.kinda.gen.KView {
    boolean getAutoLocation();

    java.lang.String getCity();

    java.lang.String getCountry();

    boolean getFocus();

    java.lang.String getProvince();

    boolean getShowDomesticCity();

    boolean getShowSelectedLocation();

    boolean isUSOrCA();

    void setAreaExcludeArray(java.util.ArrayList<java.lang.String> arrayList);

    void setAutoLocation(boolean z17);

    void setFocus(boolean z17);

    void setOnRegionSelectedCallback(com.tencent.kinda.gen.KRegionEditViewOnRegionSelectedCallback kRegionEditViewOnRegionSelectedCallback);

    void setOriginRegion(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    void setShowDomesticCity(boolean z17);

    void setShowSelectedLocation(boolean z17);
}
