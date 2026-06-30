package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public final class e0 {

    /* renamed from: g, reason: collision with root package name */
    public static final android.util.SparseArray f87579g = new android.util.SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f87580h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f87581a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f87582b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.utils.f4 f87583c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f87584d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.utils.h4 f87585e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f87586f;

    public e0(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f87581a = "MicroMsg.AppBrand.AppBrandOrientationObservable#" + hashCode();
        this.f87582b = activity.getApplicationContext();
        this.f87583c = com.tencent.mm.plugin.appbrand.utils.f4.NONE;
        this.f87584d = new java.lang.Object();
        this.f87586f = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public static final com.tencent.mm.plugin.appbrand.platform.window.activity.e0 b(android.app.Activity activity) {
        com.tencent.mm.plugin.appbrand.platform.window.activity.e0 e0Var;
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!f87580h.getAndSet(true)) {
            activity.getApplication().registerActivityLifecycleCallbacks(new com.tencent.mm.plugin.appbrand.platform.window.activity.c0());
        }
        int hashCode = activity.hashCode();
        android.util.SparseArray sparseArray = f87579g;
        synchronized (sparseArray) {
            e0Var = (com.tencent.mm.plugin.appbrand.platform.window.activity.e0) sparseArray.get(hashCode);
            if (e0Var == null) {
                e0Var = new com.tencent.mm.plugin.appbrand.platform.window.activity.e0(activity);
                sparseArray.put(hashCode, e0Var);
            }
        }
        return e0Var;
    }

    public final void a(boolean z17) {
        com.tencent.mm.plugin.appbrand.utils.h4 h4Var;
        synchronized (this.f87584d) {
            if (z17) {
                if (this.f87585e == null) {
                    this.f87585e = new com.tencent.mm.plugin.appbrand.utils.h4(this.f87582b, new com.tencent.mm.plugin.appbrand.platform.window.activity.d0(this));
                }
                h4Var = this.f87585e;
                kotlin.jvm.internal.o.d(h4Var);
            } else {
                h4Var = this.f87585e;
            }
            if (h4Var != null) {
                h4Var.enable();
            }
        }
    }
}
