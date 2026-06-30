package wq3;

/* loaded from: classes2.dex */
public class m extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f530104d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f530105e;

    public m(java.util.LinkedList linkedList, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ct();
        lVar.f152198b = new r45.dt();
        lVar.f152199c = "/cgi-bin/micromsg-bin/cancelpreorder";
        lVar.f152200d = uc1.s1.f76912x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f530105e = a17;
        r45.ct ctVar = (r45.ct) a17.f152243a.f152217a;
        ctVar.f453351e = linkedList;
        ctVar.f453350d = linkedList != null ? linkedList.size() : 0;
        ctVar.f453352f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f530104d = u0Var;
        return mo9409x10f9447a(sVar, this.f530105e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return uc1.s1.f76912x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        r45.dt dtVar = (r45.dt) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i19 == 0 && (i27 = dtVar.f454271d) != 0) {
            str = dtVar.f454272e;
            i19 = i27;
        }
        this.f530104d.mo815x76e0bfae(i18, i19, str, this);
    }
}
