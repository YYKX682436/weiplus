package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class c9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15280xb0aa035b f213293e;

    public c9(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15280xb0aa035b c15280xb0aa035b) {
        this.f213292d = view;
        this.f213293e = c15280xb0aa035b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f213292d;
        view.setPadding(0, view.getTop(), 0, view.getBottom() + com.p314xaae8f345.mm.ui.dl.e(this.f213293e.getContext()));
    }
}
