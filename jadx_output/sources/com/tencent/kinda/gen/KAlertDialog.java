package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KAlertDialog {
    void dismiss();

    boolean isShowing();

    void setContentAlign(com.tencent.kinda.gen.TextAlign textAlign);

    void showImpl(java.lang.String str, com.tencent.kinda.gen.KView kView, java.lang.String str2, java.lang.String str3, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2);

    void showImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.kinda.gen.VoidCallback voidCallback);

    void showImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2);

    void showImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2, com.tencent.kinda.gen.VoidCallback voidCallback3);

    void showInputAlertImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, com.tencent.kinda.gen.VoidStringCallback voidStringCallback, com.tencent.kinda.gen.VoidCallback voidCallback);

    void showTipsImpl(java.lang.String str, com.tencent.kinda.gen.KImage kImage, java.lang.String str2, java.lang.String str3, com.tencent.kinda.gen.VoidCallback voidCallback);

    void showTipsImpl(java.lang.String str, com.tencent.kinda.gen.KImage kImage, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2);

    void showTipsImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.kinda.gen.VoidCallback voidCallback);

    void showTipsImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.kinda.gen.VoidCallback voidCallback);

    void showTipsImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2);

    void showTipsImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2);

    void showTipsImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2, com.tencent.kinda.gen.VoidCallback voidCallback3);

    void showTouchIdAuthViewImpl(java.lang.String str, com.tencent.kinda.gen.VoidStringCallback voidStringCallback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2, com.tencent.kinda.gen.VoidCallback voidCallback3);
}
