package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class k7 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282680d;

    public k7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282680d = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282680d;
        viewOnClickListenerC21748xb3d38e6b.T7();
        viewOnClickListenerC21748xb3d38e6b.D1.getViewTreeObserver().removeOnPreDrawListener(this);
        viewOnClickListenerC21748xb3d38e6b.T7();
        int width = viewOnClickListenerC21748xb3d38e6b.D1.getWidth();
        viewOnClickListenerC21748xb3d38e6b.T7();
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.E1.getLayoutParams();
        layoutParams.width = width;
        viewOnClickListenerC21748xb3d38e6b.T7();
        viewOnClickListenerC21748xb3d38e6b.E1.setLayoutParams(layoutParams);
        viewOnClickListenerC21748xb3d38e6b.T7();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.F1.getLayoutParams();
        layoutParams2.width = width;
        viewOnClickListenerC21748xb3d38e6b.T7();
        viewOnClickListenerC21748xb3d38e6b.F1.setLayoutParams(layoutParams2);
        return true;
    }
}
