package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class ff implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14047x4c222b89 f191548d;

    public ff(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14047x4c222b89 viewOnClickListenerC14047x4c222b89) {
        this.f191548d = viewOnClickListenerC14047x4c222b89;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14047x4c222b89 viewOnClickListenerC14047x4c222b89 = this.f191548d;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(viewOnClickListenerC14047x4c222b89.mo55332x76847179());
        android.view.View view = viewOnClickListenerC14047x4c222b89.f190985v;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = h17;
        }
        android.view.View view2 = viewOnClickListenerC14047x4c222b89.f190985v;
        android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.updateViewLayout(viewOnClickListenerC14047x4c222b89.f190985v, marginLayoutParams);
        }
    }
}
