package com.tencent.liteav.base.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.base.util.CustomHandler f46432a;

    /* renamed from: b, reason: collision with root package name */
    private final android.os.MessageQueue.IdleHandler f46433b;

    private d(com.tencent.liteav.base.util.CustomHandler customHandler, android.os.MessageQueue.IdleHandler idleHandler) {
        this.f46432a = customHandler;
        this.f46433b = idleHandler;
    }

    public static java.lang.Runnable a(com.tencent.liteav.base.util.CustomHandler customHandler, android.os.MessageQueue.IdleHandler idleHandler) {
        return new com.tencent.liteav.base.util.d(customHandler, idleHandler);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.base.util.CustomHandler.lambda$quitLooper$3(this.f46432a, this.f46433b);
    }
}
