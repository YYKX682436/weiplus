package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public class o0 extends com.tencent.mm.plugin.appbrand.jsruntime.b {
    public o0() {
        super(new com.tencent.mm.appbrand.v8.IJSRuntime$Config(null, null));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.b
    public cl.p u0(com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config) {
        boolean z17 = cl.x.f42817a;
        return new cl.e0(iJSRuntime$Config);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.b
    public cl.q0 v0(cl.p pVar, int i17) {
        cl.e0 e0Var = (cl.e0) pVar;
        if (e0Var.B == null) {
            e0Var.B = new cl.q0(e0Var, e0Var.b(), new cl.d0(e0Var));
        }
        return e0Var.B;
    }
}
