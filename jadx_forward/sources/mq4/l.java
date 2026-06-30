package mq4;

/* loaded from: classes14.dex */
public class l implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.m f412335d;

    public l(mq4.m mVar) {
        this.f412335d = mVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        vq4.d0.b("MicroMsg.Voip.GetRoomInfo", "Voip onSceneEnd type:" + m1Var.mo808xfb85f7b0() + " errType:" + i17 + " errCode:" + i18);
        if (i17 == 0 && i18 == 0) {
            r45.r27 r27Var = (r45.r27) this.f412335d.K();
            if (r27Var.f76492x92037252.f458492d != 0 || gq4.v.Bi().f258091a.i()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.GetRoomInfo", "doTaskCallin in NetSceneVoipGetRoomInfo, roomid:%d, roomkey:%s, time:%d", java.lang.Integer.valueOf(r27Var.f466022d), java.lang.Long.valueOf(r27Var.f466023e), java.lang.Integer.valueOf(r27Var.f466024f));
            gq4.v.Bi().h(r27Var);
        }
    }
}
