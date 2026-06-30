package mq4;

/* loaded from: classes14.dex */
public class v implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.w f412342d;

    public v(mq4.w wVar) {
        this.f412342d = wVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        vq4.d0.c("MicroMsg.NetSceneVoipSpeedResult", "VoipContext onVoipSpeedResultResp errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        this.f412342d.f412329g.h();
    }
}
