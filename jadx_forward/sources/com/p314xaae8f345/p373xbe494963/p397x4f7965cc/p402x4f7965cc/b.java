package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc;

/* loaded from: classes14.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final android.view.View f128367a;

    private b(android.view.View view) {
        this.f128367a = view;
    }

    public static java.lang.Runnable a(android.view.View view) {
        return new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.b(view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f128367a.requestLayout();
    }
}
