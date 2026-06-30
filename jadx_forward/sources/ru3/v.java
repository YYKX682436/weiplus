package ru3;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f481307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f481308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.GestureDetectorOnGestureListenerC17036x2d3a1200 f481309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f481310g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f481311h;

    public v(int i17, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.GestureDetectorOnGestureListenerC17036x2d3a1200 gestureDetectorOnGestureListenerC17036x2d3a1200, float f17, android.view.View view2) {
        this.f481307d = i17;
        this.f481308e = view;
        this.f481309f = gestureDetectorOnGestureListenerC17036x2d3a1200;
        this.f481310g = f17;
        this.f481311h = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ru3.m[] mVarArr = ru3.m.f481295d;
        float f17 = this.f481310g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.GestureDetectorOnGestureListenerC17036x2d3a1200 gestureDetectorOnGestureListenerC17036x2d3a1200 = this.f481309f;
        android.view.View view = this.f481308e;
        int i17 = this.f481307d;
        if (i17 == 0) {
            view.setTranslationY(gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().top + f17);
            view.setTranslationX(gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().left + f17);
            return;
        }
        ru3.m[] mVarArr2 = ru3.m.f481295d;
        if (i17 == 1) {
            view.setTranslationY(gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().top + f17);
            view.setTranslationX((gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().right - f17) - view.getWidth());
            return;
        }
        ru3.m[] mVarArr3 = ru3.m.f481295d;
        android.view.View view2 = this.f481311h;
        if (i17 == 2) {
            view.setTranslationY((gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().bottom - f17) - view2.getHeight());
            view.setTranslationX(gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().left + f17);
            return;
        }
        ru3.m[] mVarArr4 = ru3.m.f481295d;
        if (i17 == 3) {
            view.setTranslationY((gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().bottom - f17) - view2.getHeight());
            view.setTranslationX((gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().right - f17) - view.getWidth());
            return;
        }
        ru3.m[] mVarArr5 = ru3.m.f481295d;
        if (i17 == 4) {
            view.setTranslationY((gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().top - f17) - view2.getHeight());
            view.setTranslationX(gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().left + f17);
            return;
        }
        ru3.m[] mVarArr6 = ru3.m.f481295d;
        if (i17 == 5) {
            view.setTranslationY((gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().top - f17) - view2.getHeight());
            view.setTranslationX((gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().right - f17) - view.getWidth());
            return;
        }
        ru3.m[] mVarArr7 = ru3.m.f481295d;
        if (i17 == 6) {
            view.setTranslationY(gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().bottom + f17);
            view.setTranslationX(gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().left + f17);
            return;
        }
        ru3.m[] mVarArr8 = ru3.m.f481295d;
        if (i17 == 7) {
            view.setTranslationY(gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().bottom + f17);
            view.setTranslationX((gestureDetectorOnGestureListenerC17036x2d3a1200.getBoxRect().right - f17) - view.getWidth());
        }
    }
}
