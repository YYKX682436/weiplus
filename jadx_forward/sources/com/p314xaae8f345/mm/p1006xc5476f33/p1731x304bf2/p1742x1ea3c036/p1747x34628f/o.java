package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f221457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.p f221458e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.p pVar, boolean z17) {
        this.f221458e = pVar;
        this.f221457d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f221457d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.p pVar = this.f221458e;
        if (z17) {
            pVar.f221460a.K.setVisibility(0);
        } else {
            pVar.f221460a.K.setVisibility(8);
        }
    }
}
