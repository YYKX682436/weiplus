package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 f257854d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var) {
        this.f257854d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = this.f257854d;
        int i17 = g1Var.f258041a;
        if (i17 != 4 && i17 != 5 && i17 != 6) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "startConnectDirect status fail, status:" + g1Var.f258041a);
            return;
        }
        if (g1Var.f258045d) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "can not startConnectDirect again");
            return;
        }
        g1Var.f258045d = true;
        vq4.d0.c("MicroMsg.Voip.VoipContext", "v2protocal StartConnectChannel direct");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
        byte[] bArr = c18912x54425f62.f258430w1;
        if (bArr == null) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "direct conns buf null");
            return;
        }
        int m72776x30b8c57f = c18912x54425f62.m72776x30b8c57f(bArr, bArr.length, 0);
        if (m72776x30b8c57f >= 0) {
            g1Var.o();
            return;
        }
        vq4.d0.b("MicroMsg.Voip.VoipContext", "v2protocal connectToPeerDirect failed, ret:" + m72776x30b8c57f);
    }
}
