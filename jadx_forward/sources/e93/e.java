package e93;

/* loaded from: classes.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f331894d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f331895e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f331896f;

    public e(java.util.LinkedList linkedList) {
        this.f331896f = new java.util.LinkedList();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ip4();
        lVar.f152198b = new r45.jp4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/modifycontactlabellist";
        lVar.f152200d = 638;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f331894d = lVar.a();
        this.f331896f = linkedList;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f331895e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f331894d;
        r45.ip4 ip4Var = (r45.ip4) oVar.f152243a.f152217a;
        java.util.LinkedList linkedList = this.f331896f;
        ip4Var.f458789e = linkedList;
        ip4Var.f458788d = linkedList.size();
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 638;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f331895e.mo815x76e0bfae(i18, i19, str, this);
    }
}
