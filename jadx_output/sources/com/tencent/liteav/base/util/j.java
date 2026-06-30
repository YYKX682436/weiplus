package com.tencent.liteav.base.util;

/* loaded from: classes13.dex */
final /* synthetic */ class j implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.util.j f46441a = new com.tencent.liteav.base.util.j();

    private j() {
    }

    public static java.util.concurrent.Callable a() {
        return f46441a;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.Boolean valueOf;
        valueOf = java.lang.Boolean.valueOf(com.tencent.liteav.base.util.i.a(com.tencent.liteav.base.ContextUtils.getApplicationContext()));
        return valueOf;
    }
}
