package com.tencent.mm.plugin.appbrand.launching.teenmode;

/* loaded from: classes7.dex */
public final class g implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.teenmode.g f85196d = new com.tencent.mm.plugin.appbrand.launching.teenmode.g();

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = false;
        objArr[0] = str;
        objArr[1] = w0Var != null ? java.lang.Integer.valueOf(w0Var.f316974b) : null;
        objArr[2] = w0Var != null ? w0Var.f316976d : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeReporter", "collectionStorage onNotifyChanged event: %s, eventId: %s, eventData.obj: %s", objArr);
        if (w0Var != null && w0Var.f316974b == 3) {
            z17 = true;
        }
        if (z17 && kotlin.jvm.internal.o.b(str, "batch") && w0Var.f316976d == null) {
            com.tencent.mm.plugin.appbrand.launching.teenmode.k kVar = com.tencent.mm.plugin.appbrand.launching.teenmode.k.f85200a;
            ((ku5.t0) ku5.t0.f312615d).b(com.tencent.mm.plugin.appbrand.launching.teenmode.f.f85195d, "AppBrandTeenModeReporter");
        }
    }
}
