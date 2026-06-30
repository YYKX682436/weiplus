package mq4;

/* loaded from: classes14.dex */
public class h implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.i f412332d;

    public h(mq4.i iVar) {
        this.f412332d = iVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        vq4.d0.a("MicroMsg.NetSceneVoipCancelInvite", "onSceneEnd type:" + m1Var.mo808xfb85f7b0() + " errType:" + i17 + " errCode:" + i18);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneVoipCancelInvite", "onSceneEnd: error %d %d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        mq4.i iVar = this.f412332d;
        r45.h27 h27Var = (r45.h27) iVar.f412326d.f152243a.f152217a;
        int i19 = iVar.f412333h;
        if (h27Var != null && i19 != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.m(h27Var.f457327e, h27Var.f457328f, h27Var.f457333n);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneVoipCancelInvite", "onSceneEnd: cancel type " + i19);
    }
}
