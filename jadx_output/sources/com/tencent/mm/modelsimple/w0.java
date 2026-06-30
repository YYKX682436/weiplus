package com.tencent.mm.modelsimple;

/* loaded from: classes2.dex */
public class w0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71442d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71443e;

    /* renamed from: f, reason: collision with root package name */
    public int f71444f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f71445g;

    public w0(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ih5();
        lVar.f70665b = new r45.jh5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/queryhaspasswd";
        lVar.f70667d = 255;
        lVar.f70668e = 132;
        lVar.f70669f = 1000000132;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71443e = a17;
        ((r45.ih5) a17.f70710a.f70684a).f377053d = i17;
        this.f71445g = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71442d = u0Var;
        return dispatch(sVar, this.f71443e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 255;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        this.f71442d.onSceneEnd(i18, i19, str, this);
    }
}
