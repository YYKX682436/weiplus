package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.profile.y f87713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.l0 f87714e;

    public x(com.tencent.mm.plugin.appbrand.profile.y yVar, com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var) {
        this.f87713d = yVar;
        this.f87714e = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.profile.y yVar = this.f87713d;
        com.tencent.mm.plugin.appbrand.e9 e9Var = yVar.f87696e;
        sj1.b c17 = sj1.l.c(java.lang.String.valueOf(e9Var != null ? java.lang.Integer.valueOf(e9Var.getComponentId()) : null));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId:$");
        com.tencent.mm.plugin.appbrand.e9 e9Var2 = yVar.f87696e;
        sb6.append(e9Var2 != null ? java.lang.Integer.valueOf(e9Var2.getComponentId()) : null);
        sb6.append(':');
        sb6.append(c17);
        sb6.append(" initTraceBinding v8.isolatePtr:");
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = this.f87714e;
        sb6.append(l0Var.L());
        sb6.append(" v8.contextPtr:");
        sb6.append(l0Var.G());
        com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", sb6.toString());
        if (c17 != null) {
            c17.d(l0Var.L(), l0Var.G());
        }
    }
}
