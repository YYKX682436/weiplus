package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class r0 implements com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 f80094d;

    public r0(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var) {
        this.f80094d = w0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o
    public void a(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f newState) {
        kotlin.jvm.internal.o.g(newState, "newState");
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var = this.f80094d;
        com.tencent.mars.xlog.Log.i(w0Var.f80124e, "onAuthorizeStateChange, newState: " + newState);
        if (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f.f80065f != newState) {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s.n8(w0Var, false, 1, null);
        }
    }
}
