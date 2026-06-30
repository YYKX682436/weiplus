package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public interface KListView extends com.tencent.kinda.gen.KView {
    void addFooter(com.tencent.kinda.gen.KView kView);

    void addHeader(com.tencent.kinda.gen.KView kView);

    boolean getShowScrollBar();

    boolean getVertical();

    void setImpl(com.tencent.kinda.gen.KListViewCallback kListViewCallback);

    void setOnScrollCallback(com.tencent.kinda.gen.KListViewOnScrollCallback kListViewOnScrollCallback);

    void setShowScrollBar(boolean z17);

    void setVertical(boolean z17);
}
