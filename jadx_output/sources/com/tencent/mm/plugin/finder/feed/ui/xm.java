package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class xm implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI f110743a;

    public xm(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI) {
        this.f110743a = finderTopicFeedUI;
    }

    @Override // com.google.android.material.appbar.e
    public void a(com.google.android.material.appbar.AppBarLayout view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.I;
        com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI = this.f110743a;
        finderTopicFeedUI.getClass();
        float abs = (java.lang.Math.abs(i17) * 1.0f) / view.getTotalScrollRange();
        if (abs == finderTopicFeedUI.H) {
            return;
        }
        finderTopicFeedUI.H = abs;
        if (abs < 0.5f) {
            finderTopicFeedUI.f7();
            finderTopicFeedUI.g7();
            return;
        }
        int color = finderTopicFeedUI.getResources().getColor(com.tencent.mm.R.color.f478491c);
        int i18 = (int) (((abs - 0.5f) / 0.5f) * 255);
        android.widget.RelativeLayout relativeLayout = finderTopicFeedUI.A;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(com.tencent.mm.ui.uk.a(color, i18));
        }
        finderTopicFeedUI.getController().G0(com.tencent.mm.ui.uk.a(color, i18));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = finderTopicFeedUI.C;
        if (weImageView != null) {
            weImageView.setIconColor(finderTopicFeedUI.getResources().getColor(com.tencent.mm.R.color.f478714f5));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = finderTopicFeedUI.B;
        if (weImageView2 != null) {
            weImageView2.setIconColor(finderTopicFeedUI.getResources().getColor(com.tencent.mm.R.color.f478714f5));
        }
        android.widget.TextView textView = finderTopicFeedUI.D;
        if (textView != null) {
            textView.setTextColor(finderTopicFeedUI.getResources().getColor(com.tencent.mm.R.color.f478714f5));
        }
    }
}
