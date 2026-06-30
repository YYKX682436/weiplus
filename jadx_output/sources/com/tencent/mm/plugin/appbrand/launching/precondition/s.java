package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class s extends com.tencent.mm.plugin.appbrand.launching.precondition.a {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Map f85021o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f85022i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f85023m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.precondition.v f85024n;

    public s(android.content.Context context, java.lang.String str, boolean z17) {
        this.f85022i = str;
        this.f85023m = new java.lang.ref.WeakReference(context);
        this.f84936f = z17;
        ((java.util.concurrent.ConcurrentHashMap) f85021o).put(str, this);
        com.tencent.mm.plugin.appbrand.launching.precondition.u uVar = new com.tencent.mm.plugin.appbrand.launching.precondition.u(str);
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(300L);
        uVar.c(millis, millis);
    }

    public static com.tencent.mm.plugin.appbrand.launching.precondition.s l(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return (com.tencent.mm.plugin.appbrand.launching.precondition.s) ((java.util.concurrent.ConcurrentHashMap) f85021o).remove(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.a
    public void e(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        super.e(appBrandInitConfigWC, appBrandStatObject);
        com.tencent.mm.plugin.appbrand.launching.precondition.v vVar = this.f85024n;
        if (vVar != null) {
            com.tencent.mm.plugin.appbrand.launching.precondition.f0 f0Var = (com.tencent.mm.plugin.appbrand.launching.precondition.f0) vVar;
            if (f0Var.f84983a.a()) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = f0Var.f84984b;
                java.lang.String str = launchParcel.f84901d;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                java.lang.String str2 = launchParcel.f84902e;
                objArr[1] = str2 != null ? str2 : "";
                objArr[2] = f0Var.f84985c;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "LaunchProxyUIDelegate.cancelDeferredStartActivityRequest, username:%s, appId:%s, instanceId:%s", objArr);
            }
            com.tencent.mm.sdk.platformtools.u3.l(f0Var.f84986d);
        }
        if (appBrandInitConfigWC != null) {
            com.tencent.mm.plugin.appbrand.report.b3.f87812a.c(appBrandInitConfigWC);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.s$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.launching.precondition.s sVar = com.tencent.mm.plugin.appbrand.launching.precondition.s.this;
                com.tencent.mm.plugin.appbrand.launching.precondition.s.l(sVar.f85022i);
                sVar.d();
            }
        });
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.a
    public android.content.Context h() {
        return (android.content.Context) this.f85023m.get();
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.a
    public void i() {
        com.tencent.mm.plugin.appbrand.launching.precondition.v vVar = this.f85024n;
        if (vVar != null) {
            com.tencent.mm.plugin.appbrand.launching.precondition.f0 f0Var = (com.tencent.mm.plugin.appbrand.launching.precondition.f0) vVar;
            if (f0Var.f84983a.b()) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = f0Var.f84984b;
                java.lang.String str = launchParcel.f84901d;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                java.lang.String str2 = launchParcel.f84902e;
                objArr[1] = str2 != null ? str2 : "";
                objArr[2] = f0Var.f84985c;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "LaunchProxyUIDelegate.fireStartActivityRequestImmediately, username:%s, appId:%s, instanceId:%s", objArr);
            }
        }
    }
}
