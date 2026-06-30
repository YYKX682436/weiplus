package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes5.dex */
public final class lo implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo f228689e;

    public lo(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo moVar) {
        this.f228688d = view;
        this.f228689e = moVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo moVar = this.f228689e;
        android.view.View view = this.f228688d;
        view.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ko(moVar, view), 175L);
    }
}
