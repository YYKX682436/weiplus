package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.h f231809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.GridLayout f231810e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.h hVar, android.widget.GridLayout gridLayout) {
        this.f231809d = hVar;
        this.f231810e = gridLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredWidth = this.f231810e.getMeasuredWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.h hVar = this.f231809d;
        hVar.f231821z = measuredWidth;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.h.x(hVar);
    }
}
