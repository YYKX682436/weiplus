package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class p implements fl1.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask f82350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fl1.c2 f82351b;

    public p(com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask jsApiRequestSubscribeMessage$SubscribeMsgTask, fl1.c2 c2Var) {
        this.f82350a = jsApiRequestSubscribeMessage$SubscribeMsgTask;
        this.f82351b = c2Var;
    }

    @Override // fl1.c2
    public void a(fl1.b2 b2Var) {
        ze.n t37;
        fl1.g2 authorizeDialogContainer;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f82350a.f82306h;
        if (yVar != null && (t37 = yVar.t3()) != null && (authorizeDialogContainer = t37.getAuthorizeDialogContainer()) != null) {
            ((fl1.c0) authorizeDialogContainer).b(this);
        }
        this.f82351b.a(b2Var);
    }
}
