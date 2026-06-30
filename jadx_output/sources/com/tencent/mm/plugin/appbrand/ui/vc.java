package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public interface vc {
    void cancelPendingInputEvents();

    android.view.View getView();

    void j(java.lang.String str, java.lang.String str2);

    void k(int i17);

    void n(yz5.a aVar);

    default void setAppServiceType(int i17) {
    }

    default void setCanShowHideAnimation(boolean z17) {
    }

    void setProgress(int i17);
}
