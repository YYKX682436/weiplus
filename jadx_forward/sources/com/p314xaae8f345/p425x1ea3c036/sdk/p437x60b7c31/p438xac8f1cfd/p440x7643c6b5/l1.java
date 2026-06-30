package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n f129002a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f129003b = false;

    /* renamed from: c, reason: collision with root package name */
    public final u65.a f129004c = new u65.a(1, new java.lang.Runnable() { // from class: com.tencent.luggage.sdk.jsapi.component.service.l1$$b
        @Override // java.lang.Runnable
        public final void run() {
            java.util.LinkedList linkedList;
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.l1 l1Var = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.l1.this;
            synchronized (l1Var.f129005d) {
                linkedList = new java.util.LinkedList(l1Var.f129005d);
                l1Var.f129005d.clear();
                l1Var.f129006e = true;
            }
            while (!linkedList.isEmpty()) {
                java.lang.Runnable runnable = (java.lang.Runnable) linkedList.pollFirst();
                java.util.Objects.requireNonNull(runnable);
                runnable.run();
            }
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f129005d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f129006e = false;

    public l1(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n nVar) {
        this.f129002a = nVar;
    }

    public void a() {
        this.f129002a.getClass();
        if (this.f129003b) {
            if (this.f129002a.M0()) {
                this.f129002a.D0().mo14660x738236e6("(function() {\n    if (typeof __wxConfig !== 'undefined') {\n        __wxConfig.exportBaseMethods = true;\n    }\n})();", new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.C3923x608bc7c());
            }
            this.f129004c.b();
        }
    }
}
