package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class k1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.l1 f152563d;

    public k1(com.p314xaae8f345.mm.p947xba6de98f.l1 l1Var) {
        this.f152563d = l1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p947xba6de98f.l1 l1Var = this.f152563d;
        int i17 = l1Var.f152579g;
        if (i17 == 0 && l1Var.f152580h == 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportEngine", "CdnDataFlowStat id:%s send:%d recv:%d", l1Var.f152581i, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(l1Var.f152580h));
        c01.s8 s8Var = c01.n8.f118881a;
        if (s8Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportEngine", "getNetStat null");
            return false;
        }
        ((com.p314xaae8f345.mm.p959x883644fd.s0) s8Var).a(l1Var.f152580h, l1Var.f152579g, 0);
        l1Var.f152579g = 0;
        l1Var.f152580h = 0;
        return true;
    }
}
