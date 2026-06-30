package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class jd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f86801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ed f86802f;

    public jd(com.tencent.mm.plugin.appbrand.page.ed edVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f86802f = edVar;
        this.f86800d = str;
        this.f86801e = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f86802f.f86927d.evaluateJavascript(this.f86800d, this.f86801e);
    }
}
