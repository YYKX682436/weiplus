package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 f257872d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var) {
        this.f257872d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62;
        byte[] bArr;
        vq4.d0.c("MicroMsg.Voip.VoipContext", "v2protocal QueryNicWanIp");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = this.f257872d;
        if (g1Var.P != null && (bArr = (c18912x54425f62 = g1Var.f258065x).f258433x1) != null) {
            int m72790x9dde7acb = c18912x54425f62.m72790x9dde7acb(bArr, bArr.length);
            if (m72790x9dde7acb == 0) {
                return;
            }
            vq4.d0.b("MicroMsg.Voip.VoipContext", "query nic wan ip fail ret:" + m72790x9dde7acb);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = g1Var.f258065x;
        if (!(c18912x54425f622.f258402n0 == 0 && c18912x54425f622.f258405o0 == 1) && vq4.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) == 4) {
            g1Var.i();
        }
    }
}
