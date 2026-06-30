package com.tencent.liteav.base.system;

/* loaded from: classes13.dex */
final /* synthetic */ class n implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.system.n f46413a = new com.tencent.liteav.base.system.n();

    private n() {
    }

    public static java.util.concurrent.Callable a() {
        return f46413a;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String str;
        str = android.os.Build.VERSION.RELEASE;
        return str;
    }
}
