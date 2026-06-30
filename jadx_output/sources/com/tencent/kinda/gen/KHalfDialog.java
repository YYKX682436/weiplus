package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KHalfDialog {
    void hide();

    boolean isShowing();

    void setDoubleBtnEnable(boolean z17, boolean z18);

    void showImpl(com.tencent.kinda.gen.KView kView, com.tencent.kinda.gen.KView kView2, com.tencent.kinda.gen.HalfDialogButtonStyle halfDialogButtonStyle, java.lang.String str, com.tencent.kinda.gen.VoidCallback voidCallback, java.lang.String str2, com.tencent.kinda.gen.VoidCallback voidCallback2);

    void updateContentView(com.tencent.kinda.gen.KView kView);
}
