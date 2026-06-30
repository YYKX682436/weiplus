package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KindaModalManager {
    void addModalView(com.tencent.kinda.gen.IUIModal iUIModal);

    void removeAllModalViews();

    void removeModalViewImpl(com.tencent.kinda.gen.IUIModal iUIModal, com.tencent.kinda.gen.VoidCallback voidCallback);
}
