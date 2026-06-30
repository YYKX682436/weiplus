package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h2 f159718d;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h2 h2Var) {
        this.f159718d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f159718d.f159792d.T = true;
        this.f159718d.f159792d.m1();
        java.util.LinkedList linkedList = new java.util.LinkedList(this.f159718d.f159792d.G);
        this.f159718d.f159792d.G.clear();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e3) it.next()).a();
        }
    }
}
