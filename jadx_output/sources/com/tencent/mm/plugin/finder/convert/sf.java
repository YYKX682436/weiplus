package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class sf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f104551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f104552e;

    public sf(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.graphics.Rect rect) {
        this.f104551d = weImageView;
        this.f104552e = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f104551d;
        android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int i17 = weImageView.getContext().getResources().getDisplayMetrics().heightPixels;
        int measuredHeight = weImageView.getMeasuredHeight();
        android.graphics.Rect rect = this.f104552e;
        int min = java.lang.Math.min(rect.bottom, i17 - measuredHeight);
        layoutParams2.topMargin = min;
        layoutParams2.gravity = 8388661;
        weImageView.setLayoutParams(layoutParams2);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "refreshLiveOrientationBtnLayout: btn=" + weImageView.getId() + ", videoRect=" + rect + ", topMargin=" + min);
    }
}
