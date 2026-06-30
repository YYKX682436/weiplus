package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
final /* synthetic */ class m implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.j f46983a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f46984b;

    private m(com.tencent.liteav.videoconsumer.renderer.j jVar, boolean z17) {
        this.f46983a = jVar;
        this.f46984b = z17;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.j jVar, boolean z17) {
        return new com.tencent.liteav.videoconsumer.renderer.m(jVar, z17);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoconsumer.renderer.j.a(this.f46983a, this.f46984b);
    }
}
