package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public final class a implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.d f91925d;

    public a(com.tencent.mm.plugin.appbrand.widget.recent.d dVar) {
        this.f91925d = dVar;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsAppBrandStorageWithCache", "storage change eventId=" + w0Var.f316974b);
        com.tencent.mm.plugin.appbrand.widget.recent.d dVar = this.f91925d;
        dVar.getClass();
        if (w0Var.f316974b == -1) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.widget.recent.c(dVar, str, w0Var));
    }
}
