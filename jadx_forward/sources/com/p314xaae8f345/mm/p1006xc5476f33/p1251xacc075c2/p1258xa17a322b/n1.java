package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 f174196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174197e;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var, java.lang.String str) {
        this.f174196d = p1Var;
        this.f174197e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.l lVar = (jz5.l) this.f174196d.f174207e.remove(this.f174197e);
        if (lVar != null) {
            nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.m1(lVar));
        }
    }
}
