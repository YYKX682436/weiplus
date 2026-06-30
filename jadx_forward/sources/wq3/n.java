package wq3;

/* loaded from: classes2.dex */
public class n extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f530106d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f530107e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f530108f;

    public n(java.lang.String str, java.lang.String str2, r45.d5 d5Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.oh3();
        lVar.f152198b = new r45.ph3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getlastestexpressinfo";
        lVar.f152200d = 578;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f530107e = a17;
        r45.oh3 oh3Var = (r45.oh3) a17.f152243a.f152217a;
        oh3Var.f463799d = str;
        oh3Var.f463800e = str2;
        oh3Var.f463801f = d5Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f530106d = u0Var;
        return mo9409x10f9447a(sVar, this.f530107e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 578;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        r45.ph3 ph3Var = (r45.ph3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0 && ph3Var.f464591f == 0) {
            this.f530108f = ph3Var.f464589d;
        }
        if (i19 == 0 && (i27 = ph3Var.f464591f) != 0) {
            str = ph3Var.f464592g;
            i19 = i27;
        }
        this.f530106d.mo815x76e0bfae(i18, i19, str, this);
    }
}
