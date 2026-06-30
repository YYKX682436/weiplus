package com.tencent.liteav.base.system;

/* loaded from: classes13.dex */
final /* synthetic */ class m implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.system.m f46412a = new com.tencent.liteav.base.system.m();

    private m() {
    }

    public static java.util.concurrent.Callable a() {
        return f46412a;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String str;
        str = android.os.Build.HARDWARE;
        return str;
    }
}
