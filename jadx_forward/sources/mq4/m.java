package mq4;

/* loaded from: classes12.dex */
public class m extends mq4.e0 {
    public m(int i17, long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.q27();
        lVar.f152198b = new r45.r27();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipgetroominfo";
        lVar.f152200d = 303;
        lVar.f152201e = 119;
        lVar.f152202f = 1000000119;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f412326d = a17;
        r45.q27 q27Var = (r45.q27) a17.f152243a.f152217a;
        q27Var.f465143d = i17;
        q27Var.f465144e = j17;
        q27Var.f465145f = str;
        q27Var.f465146g = 1;
        q27Var.f465147h = java.lang.System.currentTimeMillis();
    }

    @Override // mq4.e0
    public void I(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.GetRoomInfo", "Get RoomInfo error");
            return;
        }
        r45.r27 r27Var = (r45.r27) K();
        if (r27Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.GetRoomInfo", "roomId:%d, roomKey:%s, memberCount:%d, inviteType:%d", java.lang.Integer.valueOf(r27Var.f466022d), java.lang.Long.valueOf(r27Var.f466023e), java.lang.Integer.valueOf(r27Var.f466025g), java.lang.Integer.valueOf(r27Var.f466028m));
        }
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.l(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 303;
    }
}
