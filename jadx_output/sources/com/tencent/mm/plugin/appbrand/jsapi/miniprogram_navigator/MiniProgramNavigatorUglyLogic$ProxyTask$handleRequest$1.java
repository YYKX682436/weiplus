package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

@kotlin.Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/MiniProgramNavigatorUglyLogic$ProxyTask$handleRequest$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/plugin/appbrand/service/AppBrandUIEnterAnimationCompleteEvent;", "Landroidx/lifecycle/f;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MiniProgramNavigatorUglyLogic$ProxyTask$handleRequest$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent> implements androidx.lifecycle.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyTask f82187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f82188e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProgramNavigatorUglyLogic$ProxyTask$handleRequest$1(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyTask miniProgramNavigatorUglyLogic$ProxyTask, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        com.tencent.mm.ui.MMActivity activityContext;
        this.f82187d = miniProgramNavigatorUglyLogic$ProxyTask;
        this.f82188e = appBrandInitConfigWC;
        activityContext = miniProgramNavigatorUglyLogic$ProxyTask.getActivityContext();
        activityContext.mo133getLifecycle().a(this);
        this.__eventId = 551436157;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent) {
        com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent event = appBrandUIEnterAnimationCompleteEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("proxy in mm, after start ");
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f82188e;
        sb6.append(appBrandInitConfigWC.f77278d);
        sb6.append('(');
        sb6.append(appBrandInitConfigWC.f47277w);
        sb6.append("), appBrandUiName:");
        sb6.append(event.f88602g.f88692a);
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniProgramNavigatorUglyLogic", sb6.toString());
        dead();
        this.f82187d.finishProcess(null);
        return false;
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onDestroy(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        dead();
    }
}
