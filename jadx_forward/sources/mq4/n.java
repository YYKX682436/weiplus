package mq4;

/* loaded from: classes14.dex */
public class n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.o f412336d;

    public n(mq4.o oVar) {
        this.f412336d = oVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        mq4.o oVar = this.f412336d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var = oVar.f412329g.f258065x.M1;
        l1Var.getClass();
        l1Var.g((int) (java.lang.System.currentTimeMillis() - l1Var.P));
        l1Var.P = 0L;
        if (i17 != 0) {
            if (i18 == 231 || i18 == 212 || i18 == 247) {
                vq4.d0.b(oVar.f412337h, "Voip heartbeat Failed, type:" + m1Var.mo808xfb85f7b0() + " errType:" + i17 + " errCode:" + i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = oVar.f412329g;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var2 = g1Var.f258065x.M1;
                l1Var2.f258246a = 111;
                l1Var2.f258248b = i18;
                l1Var2.f258265s = 2;
                g1Var.v(1, -9004, "", -1);
            }
        }
    }
}
