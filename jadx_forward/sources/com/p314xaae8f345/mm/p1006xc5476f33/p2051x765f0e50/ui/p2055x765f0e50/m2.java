package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes3.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e f242842d;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e) {
        this.f242842d = activityC17388xa7b1222e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e = this.f242842d;
        int width = activityC17388xa7b1222e.f241709e.getWidth();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) activityC17388xa7b1222e.f241709e.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = width;
        activityC17388xa7b1222e.f241709e.setLayoutParams(layoutParams);
    }
}
