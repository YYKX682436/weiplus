package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class MMKListView extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.ListView> implements com.tencent.kinda.gen.KListView {
    private com.tencent.kinda.framework.widget.base.MMListViewAdapter adapter;
    private com.tencent.kinda.gen.KListViewCallback mListViewCallback;

    private void binding() {
        this.adapter = new com.tencent.kinda.framework.widget.base.MMListViewAdapter(this.mContext, this.mListViewCallback);
        getView().setAdapter((android.widget.ListAdapter) this.adapter);
    }

    @Override // com.tencent.kinda.gen.KListView
    public void addFooter(com.tencent.kinda.gen.KView kView) {
    }

    @Override // com.tencent.kinda.gen.KListView
    public void addHeader(com.tencent.kinda.gen.KView kView) {
    }

    @Override // com.tencent.kinda.gen.KListView
    public boolean getShowScrollBar() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KListView
    public boolean getVertical() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KListView
    public void setImpl(com.tencent.kinda.gen.KListViewCallback kListViewCallback) {
        this.mListViewCallback = kListViewCallback;
        binding();
    }

    @Override // com.tencent.kinda.gen.KListView
    public void setOnScrollCallback(com.tencent.kinda.gen.KListViewOnScrollCallback kListViewOnScrollCallback) {
    }

    @Override // com.tencent.kinda.gen.KListView
    public void setShowScrollBar(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KListView
    public void setVertical(boolean z17) {
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.ListView createView(android.content.Context context) {
        return new android.widget.ListView(context);
    }
}
