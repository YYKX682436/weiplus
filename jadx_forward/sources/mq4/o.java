package mq4;

/* loaded from: classes8.dex */
public class o extends mq4.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f412337h = "MicroMsg.NetSceneVoipHeartBeat";

    public o(int i17, long j17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.s27();
        lVar.f152198b = new r45.t27();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipheartbeat";
        lVar.f152200d = 178;
        lVar.f152201e = 81;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f412326d = a17;
        r45.s27 s27Var = (r45.s27) a17.f152243a.f152217a;
        s27Var.f466982d = i17;
        s27Var.f466983e = j17;
        s27Var.f466985g = java.lang.System.currentTimeMillis();
        s27Var.f466986h = i18;
        s27Var.f466987i = i19;
        s27Var.f466988m = i27;
        vq4.d0.a("MicroMsg.NetSceneVoipHeartBeat", "send VoipHeartBeatReq audioDeviceOccupiedStatus: " + i19 + " channelSecondsNoData: " + i27);
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.n(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 178;
    }
}
