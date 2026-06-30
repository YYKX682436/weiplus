package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class pl implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 f242982d;

    public pl(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7) {
        this.f242982d = activityC17458xf546b9e7;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7 = this.f242982d;
        activityC17458xf546b9e7.f242169f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        i65.a.B(activityC17458xf546b9e7);
        int min = java.lang.Math.min(java.lang.Math.max(activityC17458xf546b9e7.f242169f.getMeasuredHeight(), 0), i65.a.k(activityC17458xf546b9e7));
        activityC17458xf546b9e7.f242169f.getMeasuredHeight();
        android.widget.TextView textView = activityC17458xf546b9e7.f242171h;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (min * 0.3f);
                activityC17458xf546b9e7.f242171h.setLayoutParams(layoutParams);
            }
        }
        android.widget.ProgressBar progressBar = activityC17458xf546b9e7.f242172i;
        if (progressBar != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = progressBar.getLayoutParams();
            if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) (min * 0.3f);
                activityC17458xf546b9e7.f242172i.setLayoutParams(layoutParams2);
            }
        }
    }
}
