package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
final /* synthetic */ class p implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.j.AnonymousClass1 f46987a;

    private p(com.tencent.liteav.videoconsumer.renderer.j.AnonymousClass1 anonymousClass1) {
        this.f46987a = anonymousClass1;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.j.AnonymousClass1 anonymousClass1) {
        return new com.tencent.liteav.videoconsumer.renderer.p(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoconsumer.renderer.j.m(com.tencent.liteav.videoconsumer.renderer.j.this);
    }
}
