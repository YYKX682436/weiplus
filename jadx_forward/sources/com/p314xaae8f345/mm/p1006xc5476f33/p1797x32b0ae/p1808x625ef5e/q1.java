package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class q1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f225578a;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        this.f225578a = abstractC3700xe41a2874;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "handleCheckSumFail check fail!");
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.f225578a;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.ASYNC_CHECK_PACKAGE_UPDATE_FAILED, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "handleCheckSumFail check success!");
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.f225578a;
        if (abstractC3700xe41a2874 == null || c3712x3ed8a441 == null) {
            return;
        }
        abstractC3700xe41a2874.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.ASYNC_CHECK_PACKAGE_UPDATE_SUCCESS, c3712x3ed8a441.f14362x26947355);
    }
}
