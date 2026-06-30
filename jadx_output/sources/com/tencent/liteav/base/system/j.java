package com.tencent.liteav.base.system;

/* loaded from: classes13.dex */
final /* synthetic */ class j implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.system.j f46409a = new com.tencent.liteav.base.system.j();

    private j() {
    }

    public static java.util.concurrent.Callable a() {
        return f46409a;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String str;
        str = android.os.Build.MODEL;
        return str;
    }
}
