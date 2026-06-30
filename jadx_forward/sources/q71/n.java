package q71;

/* loaded from: classes8.dex */
public class n extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public int f441885d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f441886e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f441887f;

    public n(java.lang.String str, java.lang.String str2, kk.v vVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.wi5();
        lVar.f152198b = new r45.xi5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/rcptinfoimport";
        lVar.f152200d = nd1.k1.f72951x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f441887f = a17;
        r45.wi5 wi5Var = (r45.wi5) a17.f152243a.f152217a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str));
        wi5Var.f470744e = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str2));
        wi5Var.f470745f = cu5Var2;
        wi5Var.f470743d = vVar.f390011d;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f441886e = u0Var;
        return mo9409x10f9447a(sVar, this.f441887f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return nd1.k1.f72951x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.xi5 xi5Var = (r45.xi5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            int i27 = xi5Var.f471685e;
            this.f441885d = i27;
            java.util.LinkedList linkedList = xi5Var.f471684d.f472672e;
            if (linkedList != null && i27 == 0) {
                linkedList.size();
                o71.l.wi();
                o71.l.Bi().j(xi5Var.f471684d.f472672e);
                o71.l.wi();
                o71.l.Bi().i();
            }
        }
        this.f441886e.mo815x76e0bfae(i18, i19, str, this);
    }
}
