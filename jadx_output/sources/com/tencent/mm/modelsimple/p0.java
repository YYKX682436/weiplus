package com.tencent.mm.modelsimple;

/* loaded from: classes11.dex */
public class p0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71389d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f71390e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71391f;

    public p0(java.lang.String str) {
        this.f71390e = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sl3();
        lVar.f70665b = new r45.tl3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getprofile";
        lVar.f70667d = 302;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71389d = a17;
        ((r45.sl3) a17.f70710a.f70684a).f385830d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f71390e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetProfile", "null or empty username");
            return -1;
        }
        this.f71391f = u0Var;
        return dispatch(sVar, this.f71389d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 302;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0500  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r23, int r24, int r25, java.lang.String r26, com.tencent.mm.network.v0 r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 1479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelsimple.p0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
