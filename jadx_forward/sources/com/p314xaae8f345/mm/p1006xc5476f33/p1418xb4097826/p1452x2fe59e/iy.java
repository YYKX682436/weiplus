package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class iy implements i35.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188589d;

    public iy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar) {
        this.f188589d = pzVar;
    }

    @Override // i35.e
    public final void K0(java.lang.String str, int i17, r45.g25 g25Var) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f188589d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, "onDeleteContact: ret = " + i17 + ", oplogErrMsg = " + g25Var + ", bizUsername = " + str);
        if (i17 == 0) {
            java.util.Iterator it = pzVar.C.m56388xcaeb60d0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                so2.j5 j5Var = (so2.j5) obj;
                boolean z17 = false;
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    r45.xk m59211x37f6d02b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59211x37f6d02b();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m59211x37f6d02b != null ? m59211x37f6d02b.m75945x2fec8307(0) : null, str)) {
                        z17 = true;
                    }
                }
                if (z17) {
                    break;
                }
            }
            so2.j5 j5Var2 = (so2.j5) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2 : null;
            if (abstractC14490x69736cb5 != null) {
                java.lang.String str2 = pzVar.U;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDeleteContact: biz nickname = ");
                r45.xk m59211x37f6d02b2 = abstractC14490x69736cb5.getFeedObject().m59211x37f6d02b();
                sb6.append(m59211x37f6d02b2 != null ? m59211x37f6d02b2.m75945x2fec8307(1) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                ((nv2.v) ((nv2.g0) i95.n0.c(nv2.g0.class))).Ai(1, abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c(), true);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz.L0(pzVar, str);
        }
    }
}
