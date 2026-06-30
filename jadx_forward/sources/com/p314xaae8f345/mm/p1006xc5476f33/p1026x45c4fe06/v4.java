package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f172176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w4 f172177e;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w4 w4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f172177e = w4Var;
        this.f172176d = c11510xdd90c2f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2;
        this.f172177e.f172476d.f156343s.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w4 w4Var = this.f172177e;
        w4Var.f172479g.f156372r.remove(w4Var.f172476d);
        if (this.f172177e.f172476d.f156330f.size() >= 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w4 w4Var2 = this.f172177e;
            w4Var2.f172476d.A1(w4Var2.f172479g, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.EnumC11543xdf703d62.f33369xb6e9a90);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w4 w4Var3 = this.f172177e;
            if (!w4Var3.f172479g.f156372r.contains(w4Var3.f172476d)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w4 w4Var4 = this.f172177e;
                w4Var4.f172479g.f156373s.put(w4Var4.f172476d.f156336n, this.f172177e.f172476d);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f172176d;
        if (c11510xdd90c2f22 != null) {
            this.f172177e.f172479g.V(c11510xdd90c2f22, false);
            this.f172177e.f172479g.W(this.f172176d);
        }
        this.f172177e.f172476d.f0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w4 w4Var5 = this.f172177e;
        if (!w4Var5.f172479g.f156372r.contains(w4Var5.f172476d)) {
            this.f172177e.f172476d.d1();
        }
        if (this.f172177e.f172479g.f156376v && (c11510xdd90c2f2 = this.f172176d) != null) {
            c11510xdd90c2f2.i0();
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f172177e.f172476d.f156336n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f23 = this.f172176d;
        objArr[1] = c11510xdd90c2f23 == null ? "null" : c11510xdd90c2f23.f156336n;
        objArr[2] = java.lang.Boolean.valueOf(this.f172177e.f172479g.f156376v);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "close run(), out.appId[%s], willAppear.appId[%s], mIsActivityResumed[%b]", objArr);
        java.lang.Runnable runnable = this.f172177e.f172478f;
        if (runnable != null) {
            runnable.run();
        }
    }
}
