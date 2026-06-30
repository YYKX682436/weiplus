package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f159792d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f159792d = c11510xdd90c2f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f2 f2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f2(this);
        if (!this.f159792d.R1(f2Var)) {
            f2Var.run();
        }
        cf.i.b("onReady", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g2(this));
    }
}
