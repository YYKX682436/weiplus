package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f134530a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f134531b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public long f134532c;

    public j(long j17, android.os.HandlerThread handlerThread) {
        this.f134530a = new android.os.Handler(handlerThread.getLooper());
        this.f134532c = j17;
    }

    public final void a(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.i iVar, int i17) {
        this.f134530a.postDelayed(new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.g(this, iVar, i17), this.f134532c);
    }
}
