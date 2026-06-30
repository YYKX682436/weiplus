package com.tencent.mm.plugin.appbrand.launching.teenmode;

/* loaded from: classes7.dex */
public final class e implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.teenmode.e f85194d = new com.tencent.mm.plugin.appbrand.launching.teenmode.e();

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = false;
        objArr[0] = str;
        objArr[1] = w0Var != null ? java.lang.Integer.valueOf(w0Var.f316974b) : null;
        objArr[2] = w0Var != null ? w0Var.f316976d : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeReporter", "starAppStorage onNotifyChanged event: %s, eventId: %s, eventData.obj: %s", objArr);
        if (w0Var != null && w0Var.f316974b == 2) {
            java.lang.Object obj = w0Var.f316976d;
            if (obj instanceof com.tencent.mm.plugin.appbrand.appusage.t2) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandStarAppStorage.AppBrandStarAppRecord");
                com.tencent.mm.plugin.appbrand.launching.teenmode.k kVar = com.tencent.mm.plugin.appbrand.launching.teenmode.k.f85200a;
                ((ku5.t0) ku5.t0.f312615d).b(new com.tencent.mm.plugin.appbrand.launching.teenmode.c((com.tencent.mm.plugin.appbrand.appusage.t2) obj), "AppBrandTeenModeReporter");
                return;
            }
            return;
        }
        if (w0Var != null && w0Var.f316974b == 5) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj2 = w0Var.f316976d;
            if (obj2 instanceof com.tencent.mm.plugin.appbrand.appusage.t2) {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandStarAppStorage.AppBrandStarAppRecord");
                com.tencent.mm.plugin.appbrand.launching.teenmode.k kVar2 = com.tencent.mm.plugin.appbrand.launching.teenmode.k.f85200a;
                ((ku5.t0) ku5.t0.f312615d).b(new com.tencent.mm.plugin.appbrand.launching.teenmode.d((com.tencent.mm.plugin.appbrand.appusage.t2) obj2), "AppBrandTeenModeReporter");
            }
        }
    }
}
