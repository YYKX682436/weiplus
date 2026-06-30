package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KProgressDialog {
    void dismiss();

    void showCustomLoading(java.lang.String str, boolean z17);

    void showGoToWPHKProgressLoading(boolean z17);

    void showImpl(java.lang.String str, boolean z17, com.tencent.kinda.gen.VoidCallback voidCallback);

    void showNormalGlobalLoading(boolean z17);

    void showNormalLoading(boolean z17);

    void showPayGlobalLoading(boolean z17);

    void showPayProcessImpl(boolean z17, com.tencent.kinda.gen.VoidCallback voidCallback);

    void showToast(java.lang.String str);

    void showTopLoading(java.lang.String str, boolean z17);

    void showWPHKPayGlobalLoading(boolean z17);

    void showWPHKProgressLoading(boolean z17);
}
