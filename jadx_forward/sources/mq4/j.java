package mq4;

/* loaded from: classes14.dex */
public class j implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.k f412334d;

    public j(mq4.k kVar) {
        this.f412334d = kVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("double link switch response:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(" status:");
        mq4.k kVar = this.f412334d;
        sb6.append(kVar.f412329g.f258041a);
        vq4.d0.c("MicroMsg.Voip.DoubleLinkSwitch", sb6.toString());
        if (i18 != 0) {
            vq4.d0.b("MicroMsg.Voip.DoubleLinkSwitch", " double link switch  response with error code:" + i18);
            return;
        }
        r45.p27 p27Var = (r45.p27) kVar.K();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = kVar.f412329g;
        int i19 = p27Var.f464224g;
        g1Var.f258059r = i19;
        if (i19 == 0) {
            return;
        }
        if (g1Var.f258065x.m72802x420b767f(p27Var.f464225h) == 0) {
            int i27 = p27Var.f464225h;
            if (1 == i27) {
                kVar.f412329g.f258065x.f258373d1++;
            } else if (2 == i27) {
                kVar.f412329g.f258065x.f258376e1++;
            }
        }
        vq4.d0.c("MicroMsg.Voip.DoubleLinkSwitch", "zhengxue[DOUBLELINK]room " + p27Var.f464221d + " member " + p27Var.f464223f + " key " + p27Var.f464222e + "report flag " + p27Var.f464224g + "switch to link type " + p27Var.f464225h + "doubleLinkSwitchReportStatus " + kVar.f412329g.f258059r + "mDoubleLinkSwitchSucToDirectCnt" + kVar.f412329g.f258065x.f258373d1 + "mDoubleLinkSwitchSucToRelayCnt" + kVar.f412329g.f258065x.f258376e1);
    }
}
