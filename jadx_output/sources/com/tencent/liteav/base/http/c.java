package com.tencent.liteav.base.http;

/* loaded from: classes13.dex */
final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.base.http.HttpClientAndroid f46380a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.Long f46381b;

    private c(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid, java.lang.Long l17) {
        this.f46380a = httpClientAndroid;
        this.f46381b = l17;
    }

    public static java.lang.Runnable a(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid, java.lang.Long l17) {
        return new com.tencent.liteav.base.http.c(httpClientAndroid, l17);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.base.http.HttpClientAndroid.lambda$resumeRepeatDownload$2(this.f46380a, this.f46381b);
    }
}
