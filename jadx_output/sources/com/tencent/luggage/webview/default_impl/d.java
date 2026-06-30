package com.tencent.luggage.webview.default_impl;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f47729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.webview.default_impl.f f47730f;

    public d(com.tencent.luggage.webview.default_impl.f fVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f47730f = fVar;
        this.f47728d = str;
        this.f47729e = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f47730f.f47733e.evaluateJavascript(this.f47728d, this.f47729e);
    }
}
