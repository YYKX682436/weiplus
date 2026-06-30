package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public abstract class z0 implements com.tencent.mm.plugin.downloader.model.h1 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f97211b = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader.model.l0 f97212a;

    public z0(com.tencent.mm.plugin.downloader.model.l0 l0Var) {
        this.f97212a = l0Var;
    }

    public static java.lang.String f(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        sb6.append("_");
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append("_");
        sb6.append(f97211b.addAndGet(1));
        return sb6.toString();
    }
}
