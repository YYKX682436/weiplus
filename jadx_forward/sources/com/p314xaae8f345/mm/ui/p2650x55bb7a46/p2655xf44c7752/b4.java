package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class b4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f282344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq.c f282345e;

    public b4(android.view.View view, fq.c cVar) {
        this.f282344d = view;
        this.f282345e = cVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f282344d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        android.widget.FrameLayout frameLayout = this.f282345e.f346932b;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = view.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        return true;
    }
}
