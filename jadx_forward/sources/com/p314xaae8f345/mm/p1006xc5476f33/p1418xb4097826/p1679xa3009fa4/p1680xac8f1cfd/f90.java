package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class f90 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k90 f215913e;

    public f90(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k90 k90Var) {
        this.f215912d = view;
        this.f215913e = k90Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f215912d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k90 k90Var = this.f215913e;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(k90Var.m158354x19263085());
        int a17 = com.p314xaae8f345.mm.ui.bl.a(k90Var.m158354x19263085());
        android.view.ViewGroup.LayoutParams layoutParams = k90Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f563961ec).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = a17 + h17;
        return true;
    }
}
