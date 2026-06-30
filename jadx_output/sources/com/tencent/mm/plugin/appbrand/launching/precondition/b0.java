package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class b0 implements com.tencent.mm.plugin.appbrand.launching.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.d0 f84942a;

    public b0(com.tencent.mm.plugin.appbrand.launching.precondition.d0 d0Var) {
        this.f84942a = d0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.b1
    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreRenderColdStartService.Loader", "run()-showPrompt, id:" + this.f84942a.f84948d);
    }
}
