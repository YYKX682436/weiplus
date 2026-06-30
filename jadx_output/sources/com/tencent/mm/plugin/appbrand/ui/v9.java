package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class v9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.v9 f90280a = new com.tencent.mm.plugin.appbrand.ui.v9();

    public static final void b(com.tencent.mm.plugin.appbrand.ui.AppBrandUI activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if ((activity instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI) || com.tencent.mm.ui.bk.w0()) {
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(activity);
        java.lang.String a17 = f90280a.a(activity);
        uk0.a.b(new com.tencent.mm.ipcinvoker.type.IPCString(a17), com.tencent.mm.plugin.appbrand.ui.s9.f90208d, new com.tencent.mm.plugin.appbrand.ui.t9(a17, weakReference));
    }

    public static final void c(com.tencent.mm.plugin.appbrand.ui.AppBrandUI activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (activity instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI) {
            return;
        }
        uk0.a.b(new com.tencent.mm.ipcinvoker.type.IPCString(f90280a.a(activity)), new com.tencent.mm.plugin.appbrand.ui.u9(), null);
    }

    public final java.lang.String a(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI) {
        return appBrandUI.getComponentName().getShortClassName() + '@' + appBrandUI.hashCode();
    }
}
