package com.tencent.liteav.base.http;

/* loaded from: classes13.dex */
final /* synthetic */ class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.base.http.HttpClientAndroid f46384a;

    private e(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid) {
        this.f46384a = httpClientAndroid;
    }

    public static java.lang.Runnable a(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid) {
        return new com.tencent.liteav.base.http.e(httpClientAndroid);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.base.http.HttpClientAndroid.lambda$destroy$4(this.f46384a);
    }
}
