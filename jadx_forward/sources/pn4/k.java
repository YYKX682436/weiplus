package pn4;

/* loaded from: classes4.dex */
public class k extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f438661d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f438662e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f438663f;

    public k(java.util.LinkedList linkedList, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.jp3();
        lVar.f152198b = new r45.kp3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/gettranstext";
        lVar.f152200d = 631;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f438661d = a17;
        r45.jp3 jp3Var = (r45.jp3) a17.f152243a.f152217a;
        jp3Var.f459540e = linkedList;
        jp3Var.f459539d = linkedList.size();
        jp3Var.f459541f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f438662e = u0Var;
        return mo9409x10f9447a(sVar, this.f438661d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 631;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f438661d;
        this.f438663f = ((r45.kp3) oVar.f152244b.f152233a).f460424e;
        this.f438662e.mo815x76e0bfae(i18, i19, str, this);
    }
}
