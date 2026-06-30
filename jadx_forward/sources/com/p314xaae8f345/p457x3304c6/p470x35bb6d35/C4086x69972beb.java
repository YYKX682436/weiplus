package com.p314xaae8f345.p457x3304c6.p470x35bb6d35;

/* renamed from: com.tencent.maas.instamovie.MJResourcePreloader */
/* loaded from: classes5.dex */
public class C4086x69972beb {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16047x39e86013;

    public C4086x69972beb(android.os.Handler handler) {
        this.f16047x39e86013 = m33720xfce9a72c(handler);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m33720xfce9a72c(android.os.Handler handler);

    /* renamed from: nativeSetConcurrencyLimit */
    private native void m33721x5c7406d3(int i17);

    /* renamed from: nativeSetPreloadResourceSizeLimit */
    private native void m33722x1e2780ae(long j17);

    /* renamed from: nativeStartPreloading */
    private native void m33723x5847e624();

    /* renamed from: nativeStopPreloading */
    private native void m33724x3f5d72d2();

    /* renamed from: nativeUpdateExpectedResourceUsage */
    private native void m33725x22e5967b(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4087xda134747 c4087xda134747);

    public void a(long j17) {
        m33722x1e2780ae(j17);
    }

    public void b() {
        m33723x5847e624();
    }

    public void c() {
        m33724x3f5d72d2();
    }

    public void d(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4087xda134747 c4087xda134747) {
        m33725x22e5967b(c4087xda134747);
    }
}
