package com.tencent.mm.modelavatar;

/* loaded from: classes4.dex */
public class t0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f70542d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f70543e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f70544f = null;

    public t0(java.util.LinkedList linkedList) {
        this.f70543e = null;
        this.f70543e = linkedList;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        java.util.LinkedList linkedList = this.f70543e;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchGetHeadImg", fp.k.c() + "doScene ReqSize==0");
            return -1;
        }
        this.f70542d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nf();
        lVar.f70665b = new r45.of();
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchgetheadimg";
        lVar.f70667d = 123;
        lVar.f70668e = 15;
        lVar.f70669f = 1000000015;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.nf nfVar = (r45.nf) a17.f70710a.f70684a;
        nfVar.f381335e = linkedList;
        nfVar.f381334d = linkedList.size();
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 123;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f70544f = ((r45.of) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f382209e;
        this.f70542d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 20;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
