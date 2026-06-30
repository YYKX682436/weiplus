package com.tencent.liteav.videoproducer.encoder;

/* loaded from: classes14.dex */
final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.encoder.b f47165a;

    private c(com.tencent.liteav.videoproducer.encoder.b bVar) {
        this.f47165a = bVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer.encoder.b bVar) {
        return new com.tencent.liteav.videoproducer.encoder.c(bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoproducer.encoder.b bVar = this.f47165a;
        if (bVar.f47142e != null) {
            com.tencent.liteav.base.util.LiteavLog.w(bVar.f47138a, "onRequestRestart");
            bVar.f47142e.a();
        }
    }
}
