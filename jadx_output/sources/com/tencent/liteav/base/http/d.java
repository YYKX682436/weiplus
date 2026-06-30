package com.tencent.liteav.base.http;

/* loaded from: classes13.dex */
final /* synthetic */ class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.base.http.HttpClientAndroid f46382a;

    /* renamed from: b, reason: collision with root package name */
    private final long f46383b;

    private d(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid, long j17) {
        this.f46382a = httpClientAndroid;
        this.f46383b = j17;
    }

    public static java.lang.Runnable a(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid, long j17) {
        return new com.tencent.liteav.base.http.d(httpClientAndroid, j17);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.base.http.HttpClientAndroid.lambda$resumeRepeatDownload$3(this.f46382a, this.f46383b);
    }
}
