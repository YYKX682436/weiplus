package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class nt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f200734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200735e;

    public nt(android.view.View view, int i17) {
        this.f200734d = view;
        this.f200735e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f200734d;
        view.getLayoutParams().height = this.f200735e;
        view.setLayoutParams(view.getLayoutParams());
    }
}
