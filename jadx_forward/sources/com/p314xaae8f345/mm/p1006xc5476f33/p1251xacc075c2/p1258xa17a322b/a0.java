package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f174096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f174097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174098f;

    public a0(long j17, int i17, java.lang.String str) {
        this.f174096d = j17;
        this.f174097e = i17;
        this.f174098f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nv.v1 v1Var = (nv.v1) i95.n0.c(nv.v1.class);
        long j17 = this.f174096d;
        v1Var.Ri(j17);
        yz5.q qVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174223g;
        if (qVar != null) {
            qVar.mo147xb9724478(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f174097e), java.lang.Boolean.TRUE);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a, this.f174096d, this.f174098f, io1.b.f374991d, this.f174097e);
    }
}
