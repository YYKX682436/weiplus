package com.tencent.liteav.base.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class c implements android.os.MessageQueue.IdleHandler {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.base.util.CustomHandler f46431a;

    private c(com.tencent.liteav.base.util.CustomHandler customHandler) {
        this.f46431a = customHandler;
    }

    public static android.os.MessageQueue.IdleHandler a(com.tencent.liteav.base.util.CustomHandler customHandler) {
        return new com.tencent.liteav.base.util.c(customHandler);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        return com.tencent.liteav.base.util.CustomHandler.lambda$quitLooper$2(this.f46431a);
    }
}
