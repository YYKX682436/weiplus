package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public interface KTableView extends com.tencent.kinda.gen.KView {
    void setCells(java.util.ArrayList<com.tencent.kinda.gen.KTableViewCellManager> arrayList);

    void setEnableFooterRefreshView(boolean z17);

    void setFooterRefreshViewLoadMoreCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void setOnBeginScrollCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void setSelection(int i17);

    void setSelectionFromTop(int i17, int i18);

    void smoothScrollToPosition(int i17);
}
