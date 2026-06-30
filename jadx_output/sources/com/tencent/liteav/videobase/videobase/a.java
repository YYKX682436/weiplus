package com.tencent.liteav.videobase.videobase;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final android.view.View f46832a;

    /* renamed from: b, reason: collision with root package name */
    private final int f46833b;

    private a(android.view.View view, int i17) {
        this.f46832a = view;
        this.f46833b = i17;
    }

    public static java.lang.Runnable a(android.view.View view, int i17) {
        return new com.tencent.liteav.videobase.videobase.a(view, i17);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videobase.videobase.DisplayTarget.lambda$setVisibility$0(this.f46832a, this.f46833b);
    }
}
