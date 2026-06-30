package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public interface IExtendUI {
    void hideTenpayKB();

    void scrollTo(android.view.View view, int i17, int i18);

    void scrollToFormEditPosAfterShowTenPay(android.view.View view, android.view.View view2, int i17);

    void setEditFocusListener(android.view.View view, int i17, boolean z17);

    void setEditFocusListener(android.view.View view, int i17, boolean z17, boolean z18);

    void setTenpayKBStateListener(com.tencent.mm.wallet_core.ui.m mVar);

    void showTenpayKB();

    void showVKB();
}
