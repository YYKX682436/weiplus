package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class m7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255630d;

    public m7(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9) {
        this.f255630d = activityC18635xb8188ef9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255630d;
        android.view.ViewGroup viewGroup = activityC18635xb8188ef9.f255072g;
        if (!activityC18635xb8188ef9.c7().y() || viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j6(viewGroup, activityC18635xb8188ef9));
    }
}
