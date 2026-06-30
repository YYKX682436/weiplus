package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* loaded from: classes13.dex */
final /* synthetic */ class m implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f127989a;

    private m(java.lang.String str) {
        this.f127989a = str;
    }

    public static java.util.concurrent.ThreadFactory a(java.lang.String str) {
        return new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.m(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, this.f127989a);
    }
}
