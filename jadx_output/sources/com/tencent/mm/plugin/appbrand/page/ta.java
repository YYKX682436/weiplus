package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class ta implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f87124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wa f87125f;

    public ta(com.tencent.mm.plugin.appbrand.page.wa waVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f87125f = waVar;
        this.f87123d = str;
        this.f87124e = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*android.webkit.WebView*/.evaluateJavascript(this.f87123d, this.f87124e);
    }
}
