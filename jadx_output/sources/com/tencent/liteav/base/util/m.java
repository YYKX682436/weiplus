package com.tencent.liteav.base.util;

/* loaded from: classes13.dex */
final /* synthetic */ class m implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f46456a;

    private m(java.lang.String str) {
        this.f46456a = str;
    }

    public static java.util.concurrent.ThreadFactory a(java.lang.String str) {
        return new com.tencent.liteav.base.util.m(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, this.f46456a);
    }
}
