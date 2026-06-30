package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes9.dex */
public class f0 implements r01.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a f280311d;

    public f0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar) {
        this.f280311d = aVar;
    }

    @Override // r01.v
    public void a(r01.u uVar) {
        java.lang.String str;
        if (uVar == null || uVar.f449785a != r01.t.UPDATE || (str = uVar.f449786b) == null || !str.equals(this.f280311d.f280113d.x())) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(uVar.f449786b, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "Get contact from db return null.(username : %s)", uVar.f449786b);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.e0(this, uVar, n17));
        }
    }
}
