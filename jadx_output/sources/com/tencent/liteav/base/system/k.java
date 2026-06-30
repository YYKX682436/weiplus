package com.tencent.liteav.base.system;

/* loaded from: classes13.dex */
final /* synthetic */ class k implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.system.k f46410a = new com.tencent.liteav.base.system.k();

    private k() {
    }

    public static java.util.concurrent.Callable a() {
        return f46410a;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String str;
        str = android.os.Build.BRAND;
        return str;
    }
}
