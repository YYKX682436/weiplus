package com.tencent.mm.game.report;

/* loaded from: classes8.dex */
public class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f68200d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f68201e;

    public h(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new mj0.e();
        lVar.f70665b = new mj0.f();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamereport";
        lVar.f70667d = 1223;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f68201e = a17;
        mj0.e eVar = (mj0.e) a17.f70710a.f70684a;
        eVar.f326992d = str;
        eVar.f326994f = i17;
        eVar.f326995g = i18;
        eVar.f326996h = str2;
        eVar.f326997i = str3;
        eVar.f326993e = (int) (java.lang.System.currentTimeMillis() / 1000);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f68200d = u0Var;
        return dispatch(sVar, this.f68201e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1223;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetGameIndex", "errType = " + i18 + ", errCode = " + i19);
        this.f68200d.onSceneEnd(i18, i19, str, this);
    }
}
