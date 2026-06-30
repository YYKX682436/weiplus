package k14;

/* loaded from: classes8.dex */
public class c0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f384845d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cq3 f384846e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f384847f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f384848g;

    public c0(byte[] bArr) {
        this.f384847f = bArr;
    }

    public byte[] H() {
        r45.cq3 cq3Var = this.f384846e;
        if (cq3Var == null || cq3Var.f453323g != 1) {
            return null;
        }
        return cq3Var.f453322f.g();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f384845d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.bq3 bq3Var = new r45.bq3();
        byte[] bArr = this.f384847f;
        if (bArr != null) {
            bq3Var.f452520d = x51.j1.a(bArr).f453374f;
        }
        bq3Var.f452521e = this.f384848g;
        lVar.f152197a = bq3Var;
        r45.cq3 cq3Var = new r45.cq3();
        this.f384846e = cq3Var;
        lVar.f152198b = cq3Var;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/getuserauthlist";
        lVar.f152200d = 1146;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        return mo9409x10f9447a(sVar, lVar.a(), this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1146;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.cq3 cq3Var = (r45.cq3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f384846e = cq3Var;
        r45.qv6 qv6Var = cq3Var.f453320d;
        if (qv6Var != null) {
            i19 = qv6Var.f465837d;
            str = qv6Var.f465838e;
        }
        this.f384845d.mo815x76e0bfae(i18, i19, str, this);
    }

    public c0(byte[] bArr, boolean z17) {
        this(bArr);
        this.f384848g = z17;
    }
}
