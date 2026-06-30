package com.tencent.liteav.videobase.c;

/* loaded from: classes14.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videobase.c.a f46694a;

    private b(com.tencent.liteav.videobase.c.a aVar) {
        this.f46694a = aVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videobase.c.a aVar) {
        return new com.tencent.liteav.videobase.c.b(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videobase.c.a.a(this.f46694a);
    }
}
