package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class sf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f186084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f186085e;

    public sf(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.graphics.Rect rect) {
        this.f186084d = c22699x3dcdb352;
        this.f186085e = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f186084d;
        android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int i17 = c22699x3dcdb352.getContext().getResources().getDisplayMetrics().heightPixels;
        int measuredHeight = c22699x3dcdb352.getMeasuredHeight();
        android.graphics.Rect rect = this.f186085e;
        int min = java.lang.Math.min(rect.bottom, i17 - measuredHeight);
        layoutParams2.topMargin = min;
        layoutParams2.gravity = 8388661;
        c22699x3dcdb352.setLayoutParams(layoutParams2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "refreshLiveOrientationBtnLayout: btn=" + c22699x3dcdb352.getId() + ", videoRect=" + rect + ", topMargin=" + min);
    }
}
