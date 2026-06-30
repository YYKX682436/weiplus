package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f5 f159099d;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f5 f5Var) {
        this.f159099d = f5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl, cleanupOut.run(), appId[%s]", this.f159099d.f159575d.f156336n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f159099d.f159575d;
        if (c11510xdd90c2f2.V) {
            c11510xdd90c2f2.f0();
        }
        this.f159099d.f159575d.d0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f5 f5Var = this.f159099d;
        f5Var.f159576e.f165757h.removeView(f5Var.f159575d.f156343s);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f5 f5Var2 = this.f159099d;
        ((java.util.HashMap) f5Var2.f159576e.f165760n).remove(f5Var2.f159575d.f156336n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f5 f5Var3 = this.f159099d;
        f5Var3.f159576e.f165759m.remove(f5Var3.f159575d);
    }
}
