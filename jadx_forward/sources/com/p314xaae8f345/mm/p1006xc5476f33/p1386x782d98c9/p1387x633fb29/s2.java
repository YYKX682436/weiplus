package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes4.dex */
public class s2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180591d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f180592e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f180593f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f180594g;

    /* renamed from: h, reason: collision with root package name */
    public final int f180595h;

    public s2(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f180594g = str3;
        this.f180592e = str;
        this.f180593f = str2;
        this.f180595h = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180591d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.hs6();
        lVar.f152198b = new r45.is6();
        lVar.f152199c = "/cgi-bin/mmoc-bin/hardware/updatemydeviceattr";
        lVar.f152200d = 1263;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.hs6 hs6Var = (r45.hs6) a17.f152243a.f152217a;
        hs6Var.f457972f = this.f180594g;
        hs6Var.f457971e = this.f180592e;
        hs6Var.f457970d = this.f180593f;
        hs6Var.f457973g = this.f180595h;
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1263;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f180591d.mo815x76e0bfae(i18, i19, str, this);
    }
}
