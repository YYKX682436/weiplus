package com.tencent.luggage.webview.default_impl;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f47725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.webview.default_impl.f f47727f;

    public c(com.tencent.luggage.webview.default_impl.f fVar, java.lang.Object obj, java.lang.String str) {
        this.f47727f = fVar;
        this.f47725d = obj;
        this.f47726e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f47727f.f47733e.addJavascriptInterface(this.f47725d, this.f47726e);
    }
}
