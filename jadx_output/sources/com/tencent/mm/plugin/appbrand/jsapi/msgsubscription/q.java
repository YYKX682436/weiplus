package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class q implements com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask f82352a;

    public q(com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask jsApiRequestSubscribeMessage$SubscribeMsgTask) {
        this.f82352a = jsApiRequestSubscribeMessage$SubscribeMsgTask;
    }

    public void a(java.lang.String username, java.util.List items, com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(items, "items");
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask jsApiRequestSubscribeMessage$SubscribeMsgTask = this.f82352a;
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor subscribeMsgExecutor = jsApiRequestSubscribeMessage$SubscribeMsgTask.f82310o;
        if (subscribeMsgExecutor != null) {
            java.util.List V0 = kz5.n0.V0(items);
            java.util.ArrayList arrayList = (java.util.ArrayList) subscribeMsgExecutor.f82316h;
            arrayList.clear();
            arrayList.addAll(V0);
        }
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor subscribeMsgExecutor2 = jsApiRequestSubscribeMessage$SubscribeMsgTask.f82310o;
        if (subscribeMsgExecutor2 != null) {
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = jsApiRequestSubscribeMessage$SubscribeMsgTask.f82305g;
            subscribeMsgExecutor2.f82315g = subscribeMsgRequestResult != null ? subscribeMsgRequestResult.f71792r : null;
        }
        if (subscribeMsgExecutor2 != null) {
            subscribeMsgExecutor2.f82313e = subscribeMsgRequestDialogUiData;
        }
        jsApiRequestSubscribeMessage$SubscribeMsgTask.f82304f = 1;
        jsApiRequestSubscribeMessage$SubscribeMsgTask.b();
    }

    public void b(fl1.b2 dialog) {
        ze.n t37;
        fl1.g2 authorizeDialogContainer;
        xi1.g windowAndroid;
        kotlin.jvm.internal.o.g(dialog, "dialog");
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask jsApiRequestSubscribeMessage$SubscribeMsgTask = this.f82352a;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = jsApiRequestSubscribeMessage$SubscribeMsgTask.f82306h;
        boolean z17 = false;
        if (yVar != null && (windowAndroid = yVar.getWindowAndroid()) != null && windowAndroid.isLargeScreenWindow()) {
            z17 = true;
        }
        if (z17) {
            m31.p1 p1Var = dialog instanceof m31.p1 ? (m31.p1) dialog : null;
            if (p1Var != null) {
                p1Var.i(1);
            }
        }
        com.tencent.luggage.sdk.jsapi.component.service.y yVar2 = jsApiRequestSubscribeMessage$SubscribeMsgTask.f82306h;
        if (yVar2 == null || (t37 = yVar2.t3()) == null || (authorizeDialogContainer = t37.getAuthorizeDialogContainer()) == null) {
            return;
        }
        ((fl1.c0) authorizeDialogContainer).c(dialog);
    }
}
