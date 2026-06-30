package com.tencent.liteav.audio2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class g implements java.util.concurrent.Executor {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.audio2.e f46266a;

    private g(com.tencent.liteav.audio2.e eVar) {
        this.f46266a = eVar;
    }

    public static java.util.concurrent.Executor a(com.tencent.liteav.audio2.e eVar) {
        return new com.tencent.liteav.audio2.g(eVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f46266a.f46262h.a(runnable);
    }
}
