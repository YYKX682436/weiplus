package wq3;

/* loaded from: classes2.dex */
public class s extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f530125d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f530126e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f530127f;

    public s(r45.a76 a76Var, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nh6();
        lVar.f152198b = new r45.oh6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/submitmallorder";
        lVar.f152200d = 556;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f530126e = a17;
        r45.nh6 nh6Var = (r45.nh6) a17.f152243a.f152217a;
        nh6Var.f462936d = a76Var;
        nh6Var.f462937e = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f530125d = u0Var;
        return mo9409x10f9447a(sVar, this.f530126e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 556;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        r45.oh6 oh6Var = (r45.oh6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            this.f530127f = oh6Var.f463805d;
        }
        this.f530125d.mo815x76e0bfae(i18, i19, str, this);
    }
}
