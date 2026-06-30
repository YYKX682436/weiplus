package zy3;

/* loaded from: classes4.dex */
public class l extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f559195d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f559196e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f559197f;

    public l(int i17, int i18, java.lang.String str, byte[] bArr, int i19) {
        this.f559196e = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2693;
        r45.ol olVar = new r45.ol();
        olVar.f463866d = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length);
        olVar.f463869g = str;
        olVar.f463868f = i17;
        olVar.f463867e = i18;
        olVar.f463870h = i19;
        lVar.f152197a = olVar;
        lVar.f152199c = "/cgi-bin/mmpay-bin/ocrgetbankcardinfo";
        lVar.f152198b = new r45.pl();
        lVar.f152211o = 2;
        this.f559195d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f559197f = u0Var;
        return mo9409x10f9447a(sVar, this.f559195d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2693;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f559197f.mo815x76e0bfae(i18, i19, str, this);
    }
}
