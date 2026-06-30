package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class r1 extends ir2.o {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.u1 f183477q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.u1 u1Var, ir2.a1 a1Var, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17) {
        super(a1Var, componentCallbacksC1101xa17d4670, null, i17, 4, null);
        this.f183477q = u1Var;
    }

    @Override // ir2.o
    public void d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.u1 u1Var = this.f183477q;
        if (u1Var.a7() == 2) {
            am.ia iaVar = event.f135785g;
            if (iaVar.f88452b == 4) {
                ir2.a1 a1Var = u1Var.f183486p;
                if (a1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newLoader");
                    throw null;
                }
                java.util.Iterator it = ((java.util.ArrayList) a1Var.f375624d).iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59251x5db1b11() == iaVar.f88451a) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i17 != -1) {
                    ir2.o.g(this, i17, 1, new jz5.l(3, 1), null, 8, null);
                }
            }
        }
    }
}
