package com.tencent.luggage.webview.default_impl;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.webview.default_impl.f f47724e;

    public b(com.tencent.luggage.webview.default_impl.f fVar, java.lang.String str) {
        this.f47724e = fVar;
        this.f47723d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f47724e.f47733e.loadUrl(this.f47723d);
    }
}
