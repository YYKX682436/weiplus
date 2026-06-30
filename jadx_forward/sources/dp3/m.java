package dp3;

/* loaded from: classes8.dex */
public class m extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f323754d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f323755e;

    public m(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.w55();
        lVar.f152198b = new r45.x55();
        lVar.f152199c = "/cgi-bin/micromsg-bin/paydeluserroll";
        lVar.f152200d = nd1.p1.f72967x366c91de;
        lVar.f152201e = 187;
        lVar.f152202f = 1000000187;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f323755e = a17;
        r45.w55 w55Var = (r45.w55) a17.f152243a.f152217a;
        w55Var.f470432d = i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            w55Var.f470433e = str;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            w55Var.f470435g = str2;
        }
        w55Var.f470436h = at4.g0.c();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f323754d = u0Var;
        return mo9409x10f9447a(sVar, this.f323755e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return nd1.p1.f72967x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        this.f323754d.mo815x76e0bfae(i18, i19, str, this);
    }
}
