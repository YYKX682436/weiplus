package eh4;

/* loaded from: classes4.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334482d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334483e;

    public g(java.util.LinkedList linkedList, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pk6();
        lVar.f152198b = new r45.qk6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/talkstatreport";
        lVar.f152200d = vb1.g.f77262x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f334483e = a17;
        r45.pk6 pk6Var = (r45.pk6) a17.f152243a.f152217a;
        pk6Var.f464677d = linkedList.size();
        pk6Var.f464678e = linkedList;
        pk6Var.f464679f = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f334482d = u0Var;
        return mo9409x10f9447a(sVar, this.f334483e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return vb1.g.f77262x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f334482d.mo815x76e0bfae(i18, i19, str, this);
        } else {
            this.f334482d.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
