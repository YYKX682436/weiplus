package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f165429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f165430e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, boolean z17) {
        this.f165429d = n7Var;
        this.f165430e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f165429d;
        if (n7Var instanceof pa1.o) {
            return;
        }
        if (this.f165430e) {
            k91.f M1 = n7Var.M1();
            java.util.Objects.requireNonNull(M1);
            xi1.o[] oVarArr = xi1.o.f536243n;
            java.lang.String str = M1.f387257m;
            if (u46.a.b(oVarArr, xi1.o.d(str))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiInsertHTMLWebView", "inflateView enableCustomNavigationForLandscape works for appId:%s, url%s, config:%s", n7Var.mo48798x74292566(), n7Var.X1(), str);
                return;
            }
        }
        ni1.h hVar = (ni1.h) n7Var.B1(ni1.h.class);
        if (hVar != null) {
            hVar.f(true);
            hVar.c(false);
        } else if (n7Var.a0()) {
            iz5.a.h("AppBrandPageViewPullDownExtension is null");
            throw null;
        }
        n7Var.k3();
        al1.b r17 = n7Var.r1();
        r17.E.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.v(this));
        r17.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d.f171933e.mo53086xdac2174d(), r17.m2212xefd74969());
    }
}
