package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class od {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.od f84874a = new com.tencent.mm.plugin.appbrand.launching.od();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f84875b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseIntArray f84876c = new android.util.SparseIntArray();

    public static final void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig, java.lang.String str) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        if (str == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(915, 35);
            com.tencent.mars.xlog.Log.w("MicroMsg.WeAppOpenUICallbackIPCProxy", "beforeStartAppBrandUI: [%s]", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        l81.e1 e1Var = (l81.e1) f84875b.remove(initConfig);
        if (e1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeAppOpenUICallbackIPCProxy", "beforeStartAppBrandUI, assign proxy to initConfig appId:" + initConfig.f77278d + ", instanceId:" + initConfig.f47277w);
            java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(e1Var);
            com.tencent.mm.plugin.appbrand.launching.nd ndVar = new com.tencent.mm.plugin.appbrand.launching.nd(str, atomicReference);
            com.tencent.mm.ipcinvoker.d0.a(str, ndVar);
            com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = new com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy(new com.tencent.luggage.sdk.launching.g(new com.tencent.mm.plugin.appbrand.launching.gd(atomicReference)), new com.tencent.luggage.sdk.launching.g(new com.tencent.mm.plugin.appbrand.launching.id(atomicReference, str, ndVar)), new com.tencent.luggage.sdk.launching.g(new com.tencent.mm.plugin.appbrand.launching.kd(atomicReference)), new com.tencent.luggage.sdk.launching.g(new com.tencent.mm.plugin.appbrand.launching.md(atomicReference)));
            weAppOpenUICallbackIPCProxy.f84480h = (l81.e1) atomicReference.get();
            initConfig.f77313z2 = weAppOpenUICallbackIPCProxy;
        }
    }

    public static final void c(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        kotlin.jvm.internal.o.g(launchParcel, "launchParcel");
        l81.b1 f17 = com.tencent.mm.plugin.appbrand.launching.g5.f84619a.f(launchParcel.Q);
        l81.e1 e1Var = f17 != null ? f17.L : null;
        if (e1Var != null && !f84874a.b(e1Var)) {
            f84875b.put(initConfig, e1Var);
        }
        android.os.Parcelable parcelable = launchParcel.X;
        initConfig.B2 = parcelable instanceof com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData ? (com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData) parcelable : null;
        initConfig.H2 = launchParcel.f84923x1;
        initConfig.A2 = f17 != null ? f17.M : false;
        launchParcel.f84927z = null;
    }

    public final boolean b(l81.e1 e1Var) {
        boolean z17;
        android.util.SparseIntArray sparseIntArray = f84876c;
        synchronized (sparseIntArray) {
            z17 = sparseIntArray.get(e1Var.hashCode(), 0) == 1;
        }
        return z17;
    }
}
