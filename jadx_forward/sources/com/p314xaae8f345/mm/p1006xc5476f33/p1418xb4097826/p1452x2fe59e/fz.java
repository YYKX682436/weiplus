package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class fz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f188323e;

    public fz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar, long j17) {
        this.f188322d = pzVar;
        this.f188323e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Collection m56392xfc5c33e5 = this.f188322d.C.m56392xfc5c33e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class);
        java.util.LinkedList<jz5.l> linkedList = new java.util.LinkedList();
        long j17 = this.f188323e;
        synchronized (m56392xfc5c33e5) {
            int i17 = 0;
            for (java.lang.Object obj : m56392xfc5c33e5) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
                if ((abstractC14490x69736cb5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && abstractC14490x69736cb5.getFeedObject().m59251x5db1b11() == j17) {
                    linkedList.add(0, new jz5.l(java.lang.Integer.valueOf(i17), abstractC14490x69736cb5));
                }
                i17 = i18;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f188322d;
        for (jz5.l lVar : linkedList) {
            pzVar.C.m56388xcaeb60d0().remove(lVar.f384367e);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dw) pzVar.G).mo56053xb9568715(((java.lang.Number) lVar.f384366d).intValue(), 1);
        }
    }
}
