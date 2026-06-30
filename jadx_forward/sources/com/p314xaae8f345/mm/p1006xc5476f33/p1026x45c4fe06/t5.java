package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class t5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f170498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb f170499e;

    public t5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb, boolean z17) {
        this.f170499e = c11529x5d7a34bb;
        this.f170498d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.SparseIntArray sparseIntArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.C;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb = this.f170499e;
        c11529x5d7a34bb.getClass();
        boolean z17 = this.f170498d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "handleWxAssistantInner(%b)", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c2 e07 = c11529x5d7a34bb.e0();
            if (e07.getParent() != null) {
                ((android.view.ViewGroup) e07.getParent()).removeView(e07);
            }
            final java.util.HashSet hashSet = new java.util.HashSet();
            new java.util.LinkedList(c11529x5d7a34bb.f156372r).forEach(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$$c
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    ze.n nVar = (ze.n) obj;
                    android.util.SparseIntArray sparseIntArray2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.C;
                    if (nVar.N0()) {
                        hashSet.add(nVar.u0().f());
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2) nVar.K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class);
                        if (q2Var != null) {
                            q2Var.l1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3.f173671g);
                        }
                    }
                }
            });
            hashSet.forEach(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11533x103ed949());
            return;
        }
        android.view.ViewParent parent = c11529x5d7a34bb.f156371q.getParent();
        if (!(parent instanceof android.view.ViewGroup)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandRuntimeContainerWC", "handleWxAssistant: containerParent:%s isn't ViewGroup", parent);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c2 e08 = c11529x5d7a34bb.e0();
        if (e08.getParent() != null) {
            ((android.view.ViewGroup) e08.getParent()).removeView(e08);
        }
        ((android.view.ViewGroup) parent).addView(c11529x5d7a34bb.e0(), new android.view.ViewGroup.LayoutParams(-1, -1));
    }
}
