package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.BaseMapView */
/* loaded from: classes13.dex */
public abstract class AbstractC25948x1e7761f0 extends android.widget.FrameLayout {

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.BaseMapView$MapViewProxy */
    /* loaded from: classes13.dex */
    public interface MapViewProxy {
        /* renamed from: getMap */
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 mo36068xb5885626();

        /* renamed from: isOpaque */
        boolean mo36640xebeef5eb();

        /* renamed from: isTouchable */
        boolean mo36641x5bf1ff0f();

        /* renamed from: onCreated */
        void mo36642x8cf48009();

        /* renamed from: onDestroy */
        void mo36643xac79a11b();

        /* renamed from: onPause */
        void mo36644xb01dfb57();

        /* renamed from: onRestart */
        void mo36645x91109f30();

        /* renamed from: onResume */
        void mo36646x57429eec();

        /* renamed from: onSizeChanged */
        void mo36647x6521d014(int i17, int i18, int i19, int i27);

        /* renamed from: onStart */
        void mo36648xb05099c3();

        /* renamed from: onStop */
        void mo36649xc39f8281();

        /* renamed from: onSurfaceChanged */
        void mo36650xd8f18906(java.lang.Object obj, int i17, int i18);

        /* renamed from: onTouchEvent */
        boolean mo37007x667eb1da(android.view.MotionEvent motionEvent);

        /* renamed from: onUpdateOptions */
        void mo36651x8f6b05f6(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7);

        /* renamed from: setOnTop */
        void mo36652x537b3bb4(boolean z17);

        /* renamed from: setOpaque */
        void mo36653x1c0e5b23(boolean z17);
    }

    public AbstractC25948x1e7761f0(android.content.Context context) {
        super(context);
    }

    /* renamed from: getMap */
    public abstract com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 mo99086xb5885626();

    /* renamed from: getMap */
    public abstract com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 mo99087xb5885626(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7);

    /* renamed from: getMapKernel */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7.IMapKernel m99088x275cda03() {
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26054x9f618899.Vector;
    }

    /* renamed from: getViewType */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db mo99089xc321a0f5() {
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db.SurfaceView;
    }

    /* renamed from: onDestroy */
    public abstract void mo99090xac79a11b();

    /* renamed from: onPause */
    public abstract void mo99091xb01dfb57();

    /* renamed from: onRestart */
    public abstract void mo99092x91109f30();

    /* renamed from: onResume */
    public abstract void mo99093x57429eec();

    /* renamed from: onStart */
    public abstract void mo99094xb05099c3();

    /* renamed from: onStop */
    public abstract void mo99095xc39f8281();

    public AbstractC25948x1e7761f0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC25948x1e7761f0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
