package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes12.dex */
public class g0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152855d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f152856e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f152857f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f152858g;

    public g0(int i17, java.util.List list, byte[] bArr) {
        this.f152857f = "";
        iz5.a.g(null, (list == null || list.size() <= 0 || bArr == null) ? false : true);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        java.lang.String str = (java.lang.String) list.get(0);
        for (int i18 = 1; i18 < list.size(); i18++) {
            str = str + "," + ((java.lang.String) list.get(i18)).trim();
        }
        com.p314xaae8f345.mm.p957x53236a1b.f0 f0Var = new com.p314xaae8f345.mm.p957x53236a1b.f0();
        this.f152856e = f0Var;
        o45.ih ihVar = (o45.ih) f0Var.mo47979x2d63726f();
        ihVar.f424489a = i17;
        ihVar.f424490b = 0;
        ihVar.f424491c = currentTimeMillis;
        iz5.a.g(null, str != null);
        ihVar.f424492d = str;
        iz5.a.g(null, bArr != null);
        ihVar.f424493e = bArr;
        kk.u.a(bArr, 0);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152855d = u0Var;
        return mo9409x10f9447a(sVar, this.f152856e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f152855d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        return true;
    }

    public g0(o45.ah ahVar) {
        this.f152857f = "";
        o45.jh jhVar = (o45.jh) ahVar;
        this.f152857f = jhVar.f424502a;
        this.f152858g = jhVar.f424503b;
    }
}
