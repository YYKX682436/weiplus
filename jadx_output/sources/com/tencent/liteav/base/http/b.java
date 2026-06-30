package com.tencent.liteav.base.http;

/* loaded from: classes13.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.base.http.HttpClientAndroid f46379a;

    private b(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid) {
        this.f46379a = httpClientAndroid;
    }

    public static java.lang.Runnable a(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid) {
        return new com.tencent.liteav.base.http.b(httpClientAndroid);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.base.http.HttpClientAndroid.lambda$cancelAll$1(this.f46379a);
    }
}
