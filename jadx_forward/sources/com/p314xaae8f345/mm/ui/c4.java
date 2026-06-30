package com.p314xaae8f345.mm.ui;

/* loaded from: classes4.dex */
public final class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21356x182ee98c f279607d;

    public c4(com.p314xaae8f345.mm.ui.C21356x182ee98c c21356x182ee98c) {
        this.f279607d = c21356x182ee98c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.C21356x182ee98c c21356x182ee98c = this.f279607d;
        android.view.ViewGroup.LayoutParams layoutParams = c21356x182ee98c.f278179e.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = c21356x182ee98c.f278178d.getHeight() + i65.a.f(c21356x182ee98c.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        c21356x182ee98c.f278179e.setLayoutParams(layoutParams2);
        c21356x182ee98c.f278179e.setVisibility(0);
    }
}
