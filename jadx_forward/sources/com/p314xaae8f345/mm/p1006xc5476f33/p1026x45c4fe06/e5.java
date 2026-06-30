package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f159523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f159524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f5 f159525f;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f5 f5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.Runnable runnable) {
        this.f159525f = f5Var;
        this.f159523d = c11510xdd90c2f2;
        this.f159524e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f5 f5Var = this.f159525f;
        boolean z17 = f5Var.f159576e.f165759m.peekFirst() == f5Var.f159575d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f159523d;
        if (c11510xdd90c2f22 != null) {
            c11510xdd90c2f22.n1(this.f159525f.f159575d.u0(), null);
        } else {
            this.f159525f.f159575d.k0(null);
        }
        this.f159524e.run();
        if (z17 && (c11510xdd90c2f2 = this.f159523d) != null) {
            c11510xdd90c2f2.h0();
            if (this.f159525f.f159576e.f165754e) {
                this.f159523d.i0();
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f23 = this.f159523d;
        objArr[1] = c11510xdd90c2f23 == null ? "null" : c11510xdd90c2f23.f156336n;
        objArr[2] = java.lang.Boolean.valueOf(this.f159525f.f159576e.f165754e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl closeTask.run(), outIsTopOfStackBefore[%b], below.appId[%s], mIsActivityResumed[%b]", objArr);
    }
}
