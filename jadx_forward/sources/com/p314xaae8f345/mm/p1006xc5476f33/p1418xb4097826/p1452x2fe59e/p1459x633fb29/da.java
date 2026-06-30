package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class da implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea f189345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f189346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f189347f;

    public da(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea eaVar, long j17, yz5.l lVar) {
        this.f189345d = eaVar;
        this.f189346e = j17;
        this.f189347f = lVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.util.LinkedList m75941xfb821914;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f152244b.f152233a) == null) {
            ot5.g.d("MicroMsg.MegaVideoAutoPlayLoader", "try fetchAutoPlayFeed fail, errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
            return 0;
        }
        java.lang.String str2 = null;
        r45.aa1 aa1Var = fVar instanceof r45.aa1 ? (r45.aa1) fVar : null;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = aa1Var != null ? aa1Var.m75934xbce7f2f(2) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea eaVar = this.f189345d;
        eaVar.f189369a = m75934xbce7f2f;
        eaVar.f189371c.put(java.lang.Long.valueOf(this.f189346e), aa1Var);
        yz5.l lVar = this.f189347f;
        if (lVar != null && aa1Var != null) {
            lVar.mo146xb9724478(aa1Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try fetchAutoPlayFeed ok, ");
        if (aa1Var != null && (m75941xfb821914 = aa1Var.m75941xfb821914(1)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11()));
            }
            str2 = kz5.n0.g0(arrayList, ";", null, null, 0, null, null, 62, null);
        }
        sb6.append(str2);
        ot5.g.c("MicroMsg.MegaVideoAutoPlayLoader", sb6.toString());
        return 0;
    }
}
