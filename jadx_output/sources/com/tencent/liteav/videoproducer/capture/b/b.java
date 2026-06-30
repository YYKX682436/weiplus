package com.tencent.liteav.videoproducer.capture.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.capture.b.a f47068a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47069b;

    private b(com.tencent.liteav.videoproducer.capture.b.a aVar, int i17) {
        this.f47068a = aVar;
        this.f47069b = i17;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer.capture.b.a aVar, int i17) {
        return new com.tencent.liteav.videoproducer.capture.b.b(aVar, i17);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoproducer.capture.b.a.a(this.f47068a, this.f47069b);
    }
}
