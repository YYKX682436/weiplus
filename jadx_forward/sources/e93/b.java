package e93;

/* loaded from: classes2.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f331885d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f331886e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f331887f;

    public b(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f331887f = linkedList;
        new java.util.ArrayList();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ah();
        lVar.f152198b = new r45.bh();
        lVar.f152199c = "/cgi-bin/micromsg-bin/batchupdatecontactlabelwithseq";
        lVar.f152200d = 5882;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f331885d = lVar.a();
        linkedList.addAll(list);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f331886e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f331885d;
        r45.ah ahVar = (r45.ah) oVar.f152243a.f152217a;
        java.util.LinkedList linkedList = this.f331887f;
        if (linkedList != null && linkedList.size() > 0) {
            ahVar.f451538d = linkedList;
            return mo9409x10f9447a(sVar, oVar, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Label.NetSceneBatchUpdateContactLabelList", "[doScene] label id list is null.");
        u0Var.mo815x76e0bfae(3, -1, "[doScene]empty label is list.", this);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5882;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f331886e.mo815x76e0bfae(i18, i19, str, this);
    }
}
