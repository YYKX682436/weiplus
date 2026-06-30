package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.g0 f170016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.h0 f170017e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.g0 g0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.h0 h0Var) {
        this.f170016d = g0Var;
        this.f170017e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f170016d.f170019d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.h0 h0Var = this.f170017e;
        if (copyOnWriteArraySet.remove(h0Var)) {
            h0Var.getClass();
            h0Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j1.a("", h0Var.f170023b));
        }
    }
}
