package com.tencent.liteav.base.http;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.base.http.HttpClientAndroid f46385a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.liteav.base.http.HttpClientAndroid.f f46386b;

    /* renamed from: c, reason: collision with root package name */
    private final long f46387c;

    private f(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid, com.tencent.liteav.base.http.HttpClientAndroid.f fVar, long j17) {
        this.f46385a = httpClientAndroid;
        this.f46386b = fVar;
        this.f46387c = j17;
    }

    public static java.lang.Runnable a(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid, com.tencent.liteav.base.http.HttpClientAndroid.f fVar, long j17) {
        return new com.tencent.liteav.base.http.f(httpClientAndroid, fVar, j17);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.base.http.HttpClientAndroid.lambda$doReadData$5(this.f46385a, this.f46386b, this.f46387c);
    }
}
