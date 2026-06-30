package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class s0 implements com.tencent.mm.plugin.appbrand.backgroundrunning.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 f80095a;

    public s0(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var) {
        this.f80095a = w0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.t0
    public final void a(com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel opParcel) {
        kotlin.jvm.internal.o.g(opParcel, "opParcel");
        com.tencent.mars.xlog.Log.i(this.f80095a.f80124e, "onBackgroundRunningOperationReceived, opParcel: " + opParcel);
        if (kotlin.jvm.internal.o.b(opParcel.f76945d, this.f80095a.f80123d.f74803n) && com.tencent.mm.plugin.appbrand.backgroundrunning.w.b(opParcel.f76946e, 32) && opParcel.f76947f == 2) {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s.n8(this.f80095a, false, 1, null);
        }
    }
}
