package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ym implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f110779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI f110780e;

    public ym(android.view.View view, com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI) {
        this.f110779d = view;
        this.f110780e = finderTopicFeedUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f110779d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI = this.f110780e;
        int h17 = com.tencent.mm.ui.bl.h(finderTopicFeedUI);
        android.widget.RelativeLayout relativeLayout = finderTopicFeedUI.A;
        if (relativeLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height += h17;
            relativeLayout.setLayoutParams(layoutParams);
            relativeLayout.setPadding(0, h17, 0, 0);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) finderTopicFeedUI.getContext().findViewById(com.tencent.mm.R.id.cl7);
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.height += h17;
        imageView.setLayoutParams(layoutParams2);
        return true;
    }
}
