package com.tencent.liteav.base.system;

/* loaded from: classes13.dex */
final /* synthetic */ class o implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.system.o f46414a = new com.tencent.liteav.base.system.o();

    private o() {
    }

    public static java.util.concurrent.Callable a() {
        return f46414a;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.Integer valueOf;
        valueOf = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
        return valueOf;
    }
}
