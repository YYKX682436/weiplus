package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class ff implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveWhiteListUI f110015d;

    public ff(com.tencent.mm.plugin.finder.feed.ui.FinderLiveWhiteListUI finderLiveWhiteListUI) {
        this.f110015d = finderLiveWhiteListUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveWhiteListUI finderLiveWhiteListUI = this.f110015d;
        int h17 = com.tencent.mm.ui.bl.h(finderLiveWhiteListUI.getContext());
        android.view.View view = finderLiveWhiteListUI.f109452v;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = h17;
        }
        android.view.View view2 = finderLiveWhiteListUI.f109452v;
        android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.updateViewLayout(finderLiveWhiteListUI.f109452v, marginLayoutParams);
        }
    }
}
