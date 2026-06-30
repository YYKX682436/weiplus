package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.GateWayMobileUI f74206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI) {
        super(0);
        this.f74206d = gateWayMobileUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.fn4 fn4Var;
        com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData getMobileRespData = (com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData) ((jz5.n) this.f74206d.f73278d).getValue();
        java.lang.String str = (getMobileRespData == null || (fn4Var = getMobileRespData.f73186e) == null) ? null : fn4Var.f374463e;
        return str == null ? "" : str;
    }
}
