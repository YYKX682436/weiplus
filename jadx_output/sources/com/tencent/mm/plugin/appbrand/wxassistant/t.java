package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class t implements com.tencent.mm.plugin.appbrand.launching.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f92308a;

    public t(kotlinx.coroutines.q qVar) {
        this.f92308a = qVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.o0
    public final void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantRuntimeWidgetImpl", "run()-OnPreLaunchResultListener.onResult, config:" + appBrandInitConfigWC);
        kotlinx.coroutines.q qVar = this.f92308a;
        if (appBrandInitConfigWC != null) {
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(appBrandInitConfigWC, appBrandStatObject)));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("config is null"))));
        }
    }
}
