package d05;

/* loaded from: classes2.dex */
public class i extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f307125d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f307126e;

    public i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.vo5();
        lVar.f152198b = new r45.wo5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/removevirtualbankcard";
        lVar.f152200d = 600;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 1;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f307126e = a17;
        r45.vo5 vo5Var = (r45.vo5) a17.f152243a.f152217a;
        vo5Var.f469942e = str;
        vo5Var.f469941d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2, 0);
        vo5Var.f469943f = at4.g0.c();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f307125d = u0Var;
        return mo9409x10f9447a(sVar, this.f307126e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 600;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        if (i18 == 0 && i19 == 0) {
        }
        this.f307125d.mo815x76e0bfae(i18, i19, str, this);
    }
}
