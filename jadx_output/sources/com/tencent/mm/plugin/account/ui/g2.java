package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.GateWayMobileUI f73873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI) {
        super(0);
        this.f73873d = gateWayMobileUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData getMobileRespData = (com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData) ((jz5.n) this.f73873d.f73278d).getValue();
        return (getMobileRespData == null || (str = getMobileRespData.f73187f) == null) ? "" : str;
    }
}
