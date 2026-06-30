package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class o implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.base.util.l.a f127992a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.Runnable f127993b;

    private o(com.tencent.liteav.base.util.l.a aVar, java.lang.Runnable runnable) {
        this.f127992a = aVar;
        this.f127993b = runnable;
    }

    public static java.lang.Runnable a(com.tencent.liteav.base.util.l.a aVar, java.lang.Runnable runnable) {
        return new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.o(aVar, runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.base.util.l.a aVar = this.f127992a;
        this.f127993b.run();
        synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l.this) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l.this.f127983c.remove(aVar);
        }
    }
}
