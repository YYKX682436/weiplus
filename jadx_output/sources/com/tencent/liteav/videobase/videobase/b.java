package com.tencent.liteav.videobase.videobase;

/* loaded from: classes14.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final android.view.View f46834a;

    private b(android.view.View view) {
        this.f46834a = view;
    }

    public static java.lang.Runnable a(android.view.View view) {
        return new com.tencent.liteav.videobase.videobase.b(view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46834a.requestLayout();
    }
}
