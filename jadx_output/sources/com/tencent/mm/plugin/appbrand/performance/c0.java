package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public class c0 implements com.tencent.mm.plugin.appbrand.performance.v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f87333a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.n7 f87334b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f87335c;

    /* renamed from: d, reason: collision with root package name */
    public int f87336d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f87337e;

    public c0(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f87333a = n7Var.getAppId();
        this.f87334b = n7Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.performance.v
    @android.webkit.JavascriptInterface
    public void notifyLongTask(long j17) {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.performance.b0(this, j17), "PageLongTaskReporter");
    }
}
