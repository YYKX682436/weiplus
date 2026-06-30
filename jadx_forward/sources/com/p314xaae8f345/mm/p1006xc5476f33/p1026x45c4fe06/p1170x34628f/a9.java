package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class a9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 f167934d;

    public a9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 h9Var) {
        this.f167934d = h9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 h9Var = this.f167934d;
        android.view.ViewGroup.LayoutParams layoutParams = h9Var.f168213e.f434420m.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        android.view.ViewGroup.LayoutParams layoutParams2 = h9Var.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = -com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y8.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9.f168206f);
        h9Var.requestLayout();
    }
}
