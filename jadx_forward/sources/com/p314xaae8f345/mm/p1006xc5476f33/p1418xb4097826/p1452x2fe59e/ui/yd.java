package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class yd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14041xe266c5df f192299d;

    public yd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14041xe266c5df viewOnClickListenerC14041xe266c5df) {
        this.f192299d = viewOnClickListenerC14041xe266c5df;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14041xe266c5df viewOnClickListenerC14041xe266c5df = this.f192299d;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(viewOnClickListenerC14041xe266c5df.mo55332x76847179());
        android.view.View view = viewOnClickListenerC14041xe266c5df.titleGroup;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (!lk5.s.b(viewOnClickListenerC14041xe266c5df) && marginLayoutParams != null) {
            marginLayoutParams.topMargin = h17;
        }
        android.view.View view2 = viewOnClickListenerC14041xe266c5df.titleGroup;
        android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.updateViewLayout(viewOnClickListenerC14041xe266c5df.titleGroup, marginLayoutParams);
        }
    }
}
