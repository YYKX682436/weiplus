package mq4;

/* loaded from: classes14.dex */
public class x implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.y f412343d;

    public x(mq4.y yVar) {
        this.f412343d = yVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        mq4.y yVar = this.f412343d;
        vq4.d0.a("MicroMsg.NetSceneVoipSpeedTest", "onSceneEnd type:" + m1Var.mo808xfb85f7b0() + " errType:" + i17 + " errCode:" + i18);
        try {
            r45.r37 r37Var = (r45.r37) yVar.K();
            if (r37Var.f466045d != 0 && r37Var.f466047f != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = yVar.f412329g;
                if (g1Var.f258054m != 1) {
                    vq4.d0.b("MicroMsg.NetSceneVoipSpeedTest", "onVoipSpeedTestResp: no need to do speed test, for mSpeedTestStatus = " + yVar.f412329g.f258054m);
                    return;
                } else {
                    g1Var.f258054m = 2;
                    g1Var.f258056o = r37Var.f466046e;
                    g1Var.f258065x.d(r37Var);
                    return;
                }
            }
            vq4.d0.b("MicroMsg.NetSceneVoipSpeedTest", "onVoipSpeedTestResp: no need to do speed test, svrCount = " + r37Var.f466047f);
        } catch (java.lang.Exception unused) {
            yVar.f412329g.f258054m = 0;
        }
    }
}
