package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f73897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData f73898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.GateWayMobileUI f73899f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData getMobileRespData, com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f73897d = u3Var;
        this.f73898e = getMobileRespData;
        this.f73899f = gateWayMobileUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.account.ui.h2(this.f73897d, this.f73898e, this.f73899f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.account.ui.h2 h2Var = (com.tencent.mm.plugin.account.ui.h2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.fn4 fn4Var;
        com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData getMobileReqData;
        com.tencent.mm.plugin.account.gatewayreg.GateWayRespData gateWayRespData;
        r45.fn4 fn4Var2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f73897d.dismiss();
        java.lang.String str = null;
        com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData getMobileRespData = this.f73898e;
        java.lang.String str2 = (getMobileRespData == null || (fn4Var2 = getMobileRespData.f73186e) == null) ? null : fn4Var2.f374463e;
        boolean z17 = str2 == null || str2.length() == 0;
        com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI = this.f73899f;
        if (!z17) {
            java.lang.String str3 = (getMobileRespData == null || (getMobileReqData = getMobileRespData.f73185d) == null || (gateWayRespData = getMobileReqData.f73183d) == null) ? null : gateWayRespData.f73178g;
            if (!(str3 == null || str3.length() == 0)) {
                if (getMobileRespData != null && (fn4Var = getMobileRespData.f73186e) != null) {
                    str = fn4Var.f374463e;
                }
                if (str == null) {
                    str = "";
                }
                com.tencent.mm.plugin.account.ui.r1 r1Var = com.tencent.mm.plugin.account.ui.GateWayMobileUI.f73277p;
                gateWayMobileUI.V6(str);
                return jz5.f0.f302826a;
            }
        }
        if (getMobileRespData != null && getMobileRespData.f73188g) {
            com.tencent.mm.plugin.account.ui.r1 r1Var2 = com.tencent.mm.plugin.account.ui.GateWayMobileUI.f73277p;
            gateWayMobileUI.getClass();
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(gateWayMobileUI);
            u1Var.j(gateWayMobileUI.getString(com.tencent.mm.R.string.f490347sg));
            u1Var.g(gateWayMobileUI.getString(com.tencent.mm.R.string.mss));
            u1Var.l(new com.tencent.mm.plugin.account.ui.e2(gateWayMobileUI));
            u1Var.n(gateWayMobileUI.getString(com.tencent.mm.R.string.jgd));
            u1Var.q(false);
        } else {
            com.tencent.mm.plugin.account.ui.r1 r1Var3 = com.tencent.mm.plugin.account.ui.GateWayMobileUI.f73277p;
            gateWayMobileUI.getClass();
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(gateWayMobileUI);
            u1Var2.g(gateWayMobileUI.getString(com.tencent.mm.R.string.mst));
            u1Var2.l(new com.tencent.mm.plugin.account.ui.f2(gateWayMobileUI));
            u1Var2.n(gateWayMobileUI.getString(com.tencent.mm.R.string.f490454vi));
            u1Var2.q(false);
        }
        return jz5.f0.f302826a;
    }
}
