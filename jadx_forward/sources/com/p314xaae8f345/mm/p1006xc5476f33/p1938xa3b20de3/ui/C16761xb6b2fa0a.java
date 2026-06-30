package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* renamed from: com.tencent.mm.plugin.offline.ui.OfflineLogicMgr$1 */
/* loaded from: classes9.dex */
class C16761xb6b2fa0a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f234016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 f234017e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16761xb6b2fa0a(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 a1Var, p012xc85e97e9.p093xedfae76a.y yVar, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56) {
        super(yVar);
        this.f234017e = a1Var;
        this.f234016d = c19760x34448d56;
        this.f39173x3fe91575 = 520089918;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e2 = c6249x2aa12f2e;
        if (c6249x2aa12f2e2.f136498g.f89398e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.OfflineLogicMgr", "WalletPayResultEvent is from kinda, ScanQRCodePay");
            return false;
        }
        mo48814x2efc64();
        int i17 = c6249x2aa12f2e2.f136498g.f89396c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 a1Var = this.f234017e;
        if (i17 != 0) {
            if (i17 != -1) {
                return false;
            }
            to3.q.e();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) a1Var.f234111b).s7();
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f234016d;
        wo3.d dVar = new wo3.d(c19760x34448d56.f273647m, c19760x34448d56.f273642e, c19760x34448d56.f273644g);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(dVar);
        to3.q.e();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) a1Var.f234111b).s7();
        return false;
    }
}
