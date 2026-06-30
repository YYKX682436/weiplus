package com.tencent.liteav.base.system;

/* loaded from: classes13.dex */
final /* synthetic */ class l implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.system.l f46411a = new com.tencent.liteav.base.system.l();

    private l() {
    }

    public static java.util.concurrent.Callable a() {
        return f46411a;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String str;
        str = android.os.Build.MANUFACTURER;
        return str;
    }
}
