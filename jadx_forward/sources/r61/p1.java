package r61;

/* loaded from: classes2.dex */
public class p1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474476d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474477e;

    public p1(int[] iArr) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.cz5();
        lVar.f152198b = new r45.dz5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendinviteemail";
        lVar.f152200d = 116;
        lVar.f152201e = 41;
        lVar.f152202f = 1000000041;
        this.f474477e = lVar.a();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 : iArr) {
            linkedList.add(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f474477e.f152243a.f152217a;
        ((r45.cz5) fVar).f453481e = linkedList;
        ((r45.cz5) fVar).f453480d = linkedList.size();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f474476d = u0Var;
        return mo9409x10f9447a(sVar, this.f474477e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 116;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        this.f474476d.mo815x76e0bfae(i18, i19, str, this);
    }
}
