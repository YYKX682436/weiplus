package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class m implements m31.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor f82348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f82349b;

    public m(com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor, m31.p1 p1Var) {
        this.f82348a = getSubscribeMsgListExecutor;
        this.f82349b = p1Var;
    }

    @Override // m31.a0
    public void onDismiss() {
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.e eVar = this.f82348a.f82300i;
        if (eVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q) eVar).b(this.f82349b);
        }
    }
}
