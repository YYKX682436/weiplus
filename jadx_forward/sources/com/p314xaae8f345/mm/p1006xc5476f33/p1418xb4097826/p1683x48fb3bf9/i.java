package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f218405d;

    public i(android.view.View view) {
        this.f218405d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f218405d;
        if (view != null) {
            view.requestLayout();
        }
    }
}
