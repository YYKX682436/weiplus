package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f80406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f80407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80408f;

    public l0(com.tencent.mm.plugin.appbrand.e9 e9Var, kotlinx.coroutines.q qVar, java.lang.String str) {
        this.f80406d = e9Var;
        this.f80407e = qVar;
        this.f80408f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f80406d;
        int i17 = e9Var.getRuntime().E0().f305844g;
        int s17 = e9Var.getRuntime().x0().s(false);
        kotlinx.coroutines.q qVar = this.f80407e;
        if (s17 < i17) {
            com.tencent.mm.plugin.appbrand.page.i3 x07 = e9Var.getRuntime().x0();
            x07.getClass();
            x07.c0(new com.tencent.mm.plugin.appbrand.page.k4(x07, this.f80408f, null, null));
            ((kotlinx.coroutines.r) qVar).s(jz5.f0.f302826a, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("Luggage.JsApiOpenChatTool", "page limit exceeded: " + i17);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(new jc1.d(-1, "page limit exceeded: " + i17)))));
    }
}
