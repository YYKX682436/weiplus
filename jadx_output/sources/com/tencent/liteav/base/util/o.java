package com.tencent.liteav.base.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class o implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.base.util.l.a f46459a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.Runnable f46460b;

    private o(com.tencent.liteav.base.util.l.a aVar, java.lang.Runnable runnable) {
        this.f46459a = aVar;
        this.f46460b = runnable;
    }

    public static java.lang.Runnable a(com.tencent.liteav.base.util.l.a aVar, java.lang.Runnable runnable) {
        return new com.tencent.liteav.base.util.o(aVar, runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.base.util.l.a aVar = this.f46459a;
        this.f46460b.run();
        synchronized (com.tencent.liteav.base.util.l.this) {
            com.tencent.liteav.base.util.l.this.f46450c.remove(aVar);
        }
    }
}
