package com.tencent.liteav.base.system;

/* loaded from: classes13.dex */
final /* synthetic */ class g implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.system.g f46406a = new com.tencent.liteav.base.system.g();

    private g() {
    }

    public static java.util.concurrent.Callable a() {
        return f46406a;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String a17;
        a17 = com.tencent.liteav.base.system.q.a(com.tencent.liteav.base.system.LiteavSystemInfo.sAppPackageName.a());
        return a17;
    }
}
