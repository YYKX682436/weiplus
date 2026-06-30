package com.tencent.liteav.base.system;

/* loaded from: classes13.dex */
final /* synthetic */ class p implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.system.p f46415a = new com.tencent.liteav.base.system.p();

    private p() {
    }

    public static java.util.concurrent.Callable a() {
        return f46415a;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String str;
        str = android.os.Build.BOARD;
        return str;
    }
}
