package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public interface KTableViewV2 extends com.tencent.kinda.gen.KView {
    java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellManagerV2> getCells();

    void setCells(java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellManagerV2> arrayList);

    void setDragEnabled(boolean z17);

    void setEnableFooterRefreshView(boolean z17);

    void setFooterRefreshViewLoadMoreCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void setOnBeginScrollCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void setSelection(int i17);

    void setSelectionFromTop(int i17, int i18);

    void smoothScrollToPosition(int i17);
}
