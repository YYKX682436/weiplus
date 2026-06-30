package com.tencent.liteav.base.http;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.base.http.HttpClientAndroid f46377a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.liteav.base.http.HttpClientAndroid.e f46378b;

    private a(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid, com.tencent.liteav.base.http.HttpClientAndroid.e eVar) {
        this.f46377a = httpClientAndroid;
        this.f46378b = eVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid, com.tencent.liteav.base.http.HttpClientAndroid.e eVar) {
        return new com.tencent.liteav.base.http.a(httpClientAndroid, eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46377a.doRequest(this.f46378b);
    }
}
