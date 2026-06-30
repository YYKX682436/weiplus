package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public interface f {
    java.lang.Object currentValue();

    android.view.View getView();

    void onAttach(tl1.v vVar);

    void onDetach(tl1.v vVar);

    void onHide(tl1.v vVar);

    void onShow(tl1.v vVar);

    default void stopSmoothScrollingAndCalibrateSelectedData() {
    }
}
