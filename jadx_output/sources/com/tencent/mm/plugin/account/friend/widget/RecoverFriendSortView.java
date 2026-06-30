package com.tencent.mm.plugin.account.friend.widget;

/* loaded from: classes9.dex */
public class RecoverFriendSortView extends com.tencent.mm.ui.base.sortview.BaseSortView {

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f73174s;

    public RecoverFriendSortView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View b() {
        return android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cdg, this);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public boolean c(java.lang.String str, fb5.n nVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public fb5.l getItemViewCreator() {
        return new t61.d(this);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.widget.ListView getListView() {
        return (android.widget.ListView) findViewById(com.tencent.mm.R.id.i3p);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View getNoResultView() {
        return findViewById(com.tencent.mm.R.id.kch);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public com.tencent.mm.ui.base.VerticalScrollBar getScrollBar() {
        return (com.tencent.mm.ui.base.VerticalScrollBar) findViewById(com.tencent.mm.R.id.nds);
    }
}
