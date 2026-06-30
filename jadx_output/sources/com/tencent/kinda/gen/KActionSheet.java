package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public interface KActionSheet {
    void addButtonImpl(java.lang.String str, com.tencent.kinda.gen.VoidCallback voidCallback);

    boolean isShowing();

    void setCancelButtonTitle(java.lang.String str);

    void setDestructiveIndex(int i17);

    void setTitle(java.lang.String str);

    void show();
}
