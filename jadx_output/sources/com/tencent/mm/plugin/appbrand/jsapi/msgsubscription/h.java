package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor f82334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f82335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        super(3);
        this.f82334d = getSubscribeMsgListExecutor;
        this.f82335e = subscribeMsgRequestResult;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.List items = (java.util.List) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(items, "items");
        com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData a17 = com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.f71773g.a(intValue, items, booleanValue);
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f82334d;
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.e eVar = getSubscribeMsgListExecutor.f82300i;
        if (eVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q) eVar).a(getSubscribeMsgListExecutor.f82295d, this.f82335e.f71785h, a17);
        }
        return jz5.f0.f302826a;
    }
}
