package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class s7 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f f243065d;

    public s7(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f) {
        this.f243065d = activityC17414x34d8ac5f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f = this.f243065d;
        android.view.View view = activityC17414x34d8ac5f.f241862e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.View view2 = activityC17414x34d8ac5f.f241862e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        activityC17414x34d8ac5f.f241863f = view2.getMeasuredHeight();
        int i17 = activityC17414x34d8ac5f.f241863f;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f.V6(activityC17414x34d8ac5f)) {
            activityC17414x34d8ac5f.Z6(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f.U6(activityC17414x34d8ac5f);
        }
    }
}
