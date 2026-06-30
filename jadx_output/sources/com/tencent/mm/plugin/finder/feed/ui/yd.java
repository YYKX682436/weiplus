package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class yd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI f110766d;

    public yd(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI) {
        this.f110766d = finderLiveVisitorWhiteListUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI = this.f110766d;
        int h17 = com.tencent.mm.ui.bl.h(finderLiveVisitorWhiteListUI.getContext());
        android.view.View view = finderLiveVisitorWhiteListUI.titleGroup;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (!lk5.s.b(finderLiveVisitorWhiteListUI) && marginLayoutParams != null) {
            marginLayoutParams.topMargin = h17;
        }
        android.view.View view2 = finderLiveVisitorWhiteListUI.titleGroup;
        android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.updateViewLayout(finderLiveVisitorWhiteListUI.titleGroup, marginLayoutParams);
        }
    }
}
