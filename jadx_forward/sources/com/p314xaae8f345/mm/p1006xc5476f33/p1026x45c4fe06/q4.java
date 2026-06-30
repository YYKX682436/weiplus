package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f169262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f169263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f169264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af f169265g;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22, java.lang.Runnable runnable) {
        this.f169265g = c11527x5889d9af;
        this.f169262d = c11510xdd90c2f2;
        this.f169263e = c11510xdd90c2f22;
        this.f169264f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2;
        boolean z17 = (this.f169265g.f156372r.peekFirst() == this.f169262d) || this.f169265g.M(this.f169262d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f169263e;
        if (c11510xdd90c2f22 != null) {
            c11510xdd90c2f22.n1(this.f169262d.u0(), null);
        } else {
            this.f169262d.k0(null);
        }
        this.f169264f.run();
        if (z17 && (c11510xdd90c2f2 = this.f169263e) != null) {
            c11510xdd90c2f2.h0();
            if (this.f169265g.f156376v) {
                this.f169263e.i0();
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f23 = this.f169263e;
        objArr[1] = c11510xdd90c2f23 == null ? "null" : c11510xdd90c2f23.f156336n;
        objArr[2] = java.lang.Boolean.valueOf(this.f169265g.f156376v);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "removeImpl closeTask.run(), outIsTopOfStackBefore[%b], below.appId[%s], mIsActivityResumed[%b]", objArr);
    }
}
