package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class r implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t f197191d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar) {
        this.f197191d = tVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t.a(this.f197191d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "ContinuousClickManager Timer callback: clickCnt = " + this.f197191d.f197218g + ", state = " + this.f197191d.f197216e.name() + ", lastClickCnt = " + this.f197191d.f197219h);
        if (this.f197191d.f197219h != this.f197191d.f197218g) {
            int i17 = this.f197191d.f197218g - this.f197191d.f197219h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar = this.f197191d;
            tVar.f197219h = tVar.f197218g;
            if (i17 < 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar2 = this.f197191d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n.f197164d;
                tVar2.e(nVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar3 = this.f197191d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m mVar = tVar3.f197223l;
                if (mVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m.b(mVar, tVar3.f197225n, this.f197191d.f197218g, 0, nVar, this.f197191d.f197217f, false, this.f197191d.f197222k, 32, null);
                }
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar4 = this.f197191d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m mVar2 = tVar4.f197223l;
            if (mVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m.b(mVar2, tVar4.f197225n, this.f197191d.f197218g, i17, this.f197191d.f197216e, this.f197191d.f197217f, false, this.f197191d.f197222k, 32, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.r2 r2Var = this.f197191d.f197226o;
            r2Var.a("onTimerExpired", i17, r2Var.b(true));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar5 = this.f197191d;
        if (!tVar5.f197221j || java.lang.System.currentTimeMillis() - tVar5.f197220i < 3000) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar6 = this.f197191d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n nVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n.f197164d;
        tVar6.e(nVar2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar7 = this.f197191d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m mVar3 = tVar7.f197223l;
        if (mVar3 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m.b(mVar3, tVar7.f197225n, this.f197191d.f197218g, 0, nVar2, this.f197191d.f197217f, false, this.f197191d.f197222k, 32, null);
        return false;
    }
}
