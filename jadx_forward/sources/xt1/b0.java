package xt1;

/* loaded from: classes11.dex */
public class b0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f537983d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f537984e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f537985f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f537986g;

    public b0(java.util.LinkedList linkedList, r45.pd6 pd6Var, int i17) {
        this(linkedList, pd6Var, i17, "");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f537984e = u0Var;
        return mo9409x10f9447a(sVar, this.f537983d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1099;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            this.f537984e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        java.lang.String str2 = ((r45.ef) this.f537983d.f152244b.f152233a).f454915d;
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
            this.f537984e.mo815x76e0bfae(4, -1, null, this);
            return;
        }
        java.util.ArrayList c17 = lu1.t.c(str2);
        if (c17 != null) {
            lu1.a0.J();
            this.f537985f.addAll(c17);
        }
        this.f537984e.mo815x76e0bfae(0, 0, str, this);
    }

    public b0(java.util.LinkedList linkedList, r45.pd6 pd6Var, int i17, java.lang.String str) {
        this.f537985f = new java.util.LinkedList();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.df();
        lVar.f152198b = new r45.ef();
        lVar.f152199c = "/cgi-bin/micromsg-bin/batchgetcarditembytpinfo";
        lVar.f152200d = 1099;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f537983d = a17;
        r45.df dfVar = (r45.df) a17.f152243a.f152217a;
        dfVar.f453902d = linkedList;
        dfVar.f453903e = pd6Var;
        dfVar.f453904f = i17;
        this.f537986g = str;
    }
}
