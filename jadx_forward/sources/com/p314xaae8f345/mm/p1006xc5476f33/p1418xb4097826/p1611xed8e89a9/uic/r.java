package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class r implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 f205698e;

    public r(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var) {
        this.f205697d = view;
        this.f205698e = o0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f205697d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var = this.f205698e;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(o0Var.m158354x19263085());
        android.view.ViewGroup.LayoutParams layoutParams = o0Var.W6().getLayoutParams();
        layoutParams.height += h17;
        o0Var.W6().setLayoutParams(layoutParams);
        jz5.g gVar = o0Var.f205562q;
        android.view.ViewGroup.LayoutParams layoutParams2 = ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.topMargin = h17;
        ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setLayoutParams(layoutParams3);
        android.view.ViewGroup.LayoutParams layoutParams4 = o0Var.X6().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams4, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams4;
        ((android.view.ViewGroup.MarginLayoutParams) cVar).topMargin = h17;
        o0Var.X6().setLayoutParams(cVar);
        return true;
    }
}
