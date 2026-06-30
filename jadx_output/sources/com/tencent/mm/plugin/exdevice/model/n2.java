package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes2.dex */
public class n2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f99000d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f99001e;

    public n2(java.lang.String str) {
        this.f99001e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tw5();
        lVar.f70665b = new r45.uw5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/searchharddevice";
        lVar.f70667d = com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f99001e = a17;
        ((r45.tw5) a17.f70710a.f70684a).f386836d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f99000d = u0Var;
        return dispatch(sVar, this.f99001e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneSearchHardDevice", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        this.f99000d.onSceneEnd(i18, i19, str, this);
    }
}
