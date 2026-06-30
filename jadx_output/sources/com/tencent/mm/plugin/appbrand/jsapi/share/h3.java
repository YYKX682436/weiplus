package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class h3 extends com.tencent.mm.sdk.event.n {
    public h3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        ot0.q qVar;
        com.tencent.mm.message.OnAppBrandAppMessageRetransmitEvent event = (com.tencent.mm.message.OnAppBrandAppMessageRetransmitEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.a() || (qVar = event.f68985g) == null) {
            return false;
        }
        java.lang.String str = qVar.f348689n2;
        if (!(str == null || str.length() == 0)) {
            java.lang.String appbrandShareActionId = qVar.f348689n2;
            kotlin.jvm.internal.o.f(appbrandShareActionId, "appbrandShareActionId");
            com.tencent.mm.plugin.appbrand.jsapi.share.q2 q2Var = new com.tencent.mm.plugin.appbrand.jsapi.share.q2();
            if (kz5.z.G(new java.lang.Integer[]{2, 3}, java.lang.Integer.valueOf(qVar.f348681l2))) {
                q2Var.f83214a = 1;
                q2Var.f83215b = qVar.n();
                q2Var.f83216c = qVar.f348669i2;
                ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
                q2Var.f83217d = aVar != null ? aVar.f348368x : null;
            } else {
                q2Var.f83214a = 0;
                q2Var.f83215b = qVar.n();
                q2Var.f83217d = qVar.f348734z;
            }
            com.tencent.mm.plugin.appbrand.jsapi.share.r2.b(appbrandShareActionId, q2Var);
        }
        return true;
    }
}
