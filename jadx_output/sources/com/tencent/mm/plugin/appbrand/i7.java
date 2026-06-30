package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class i7 implements com.tencent.mm.plugin.appbrand.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78335a;

    public i7(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f78335a = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], GetOnLineInfoInfoResult", this.f78335a.f74803n);
            com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult getOnLineInfoInfoResult = (com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult) obj;
            com.tencent.mm.plugin.appbrand.m6.a(this.f78335a.f74803n).f85723p = getOnLineInfoInfoResult.f77351d;
            com.tencent.mm.plugin.appbrand.m6.a(this.f78335a.f74803n).f85724q = getOnLineInfoInfoResult.f77352e;
            com.tencent.mm.plugin.appbrand.m6.a(this.f78335a.f74803n).f85725r = getOnLineInfoInfoResult.f77353f;
            com.tencent.mm.plugin.appbrand.m6.a(this.f78335a.f74803n).f85726s = getOnLineInfoInfoResult.f77354g;
        }
        if (obj instanceof com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "gamelifeManager ,get event,GameLifeOutputDataWrapper.onCustomDataNotify, appId[%s]", this.f78335a.f74803n);
            com.tencent.mm.plugin.appbrand.service.c0 component = this.f78335a.C0();
            com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper gameLifeOutputDataWrapper = (com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper) obj;
            java.lang.String sessionId = gameLifeOutputDataWrapper.f141984d;
            java.lang.String fromUserName = gameLifeOutputDataWrapper.f141985e;
            java.lang.String toUserName = gameLifeOutputDataWrapper.f141986f;
            nc1.a aVar = nc1.a.f336093i;
            kotlin.jvm.internal.o.g(component, "component");
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            kotlin.jvm.internal.o.g(fromUserName, "fromUserName");
            kotlin.jvm.internal.o.g(toUserName, "toUserName");
            nc1.a aVar2 = nc1.a.f336093i;
            aVar2.u(component);
            aVar2.t(kz5.c1.k(new jz5.l(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, sessionId), new jz5.l("fromUserName", fromUserName), new jz5.l("toUserName", toUserName)));
            aVar2.m();
        }
    }
}
