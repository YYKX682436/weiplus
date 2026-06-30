package com.tencent.liteav.base.system;

/* loaded from: classes13.dex */
final /* synthetic */ class h implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.system.h f46407a = new com.tencent.liteav.base.system.h();

    private h() {
    }

    public static java.util.concurrent.Callable a() {
        return f46407a;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String[] strArr;
        strArr = android.os.Build.SUPPORTED_ABIS;
        return strArr;
    }
}
