package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.n f47469a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f47470b = false;

    /* renamed from: c, reason: collision with root package name */
    public final u65.a f47471c = new u65.a(1, new java.lang.Runnable() { // from class: com.tencent.luggage.sdk.jsapi.component.service.l1$$b
        @Override // java.lang.Runnable
        public final void run() {
            java.util.LinkedList linkedList;
            com.tencent.luggage.sdk.jsapi.component.service.l1 l1Var = com.tencent.luggage.sdk.jsapi.component.service.l1.this;
            synchronized (l1Var.f47472d) {
                linkedList = new java.util.LinkedList(l1Var.f47472d);
                l1Var.f47472d.clear();
                l1Var.f47473e = true;
            }
            while (!linkedList.isEmpty()) {
                java.lang.Runnable runnable = (java.lang.Runnable) linkedList.pollFirst();
                java.util.Objects.requireNonNull(runnable);
                runnable.run();
            }
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f47472d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f47473e = false;

    public l1(com.tencent.luggage.sdk.jsapi.component.service.n nVar) {
        this.f47469a = nVar;
    }

    public void a() {
        this.f47469a.getClass();
        if (this.f47470b) {
            if (this.f47469a.M0()) {
                this.f47469a.D0().evaluateJavascript("(function() {\n    if (typeof __wxConfig !== 'undefined') {\n        __wxConfig.exportBaseMethods = true;\n    }\n})();", new com.tencent.luggage.sdk.jsapi.component.service.l1$$a());
            }
            this.f47471c.b();
        }
    }
}
