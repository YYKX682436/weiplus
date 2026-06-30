package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* loaded from: classes14.dex */
public class n extends com.p314xaae8f345.mm.p971x6de15a2e.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.p f224016d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.p pVar) {
        this.f224016d = pVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s0
    /* renamed from: onNetworkChange */
    public void mo8869xde9f63df(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.p pVar;
        r83.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "onNetworkChange, st: %d", java.lang.Integer.valueOf(i17));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406253d) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a;
            if ((i18 == 4 || i18 == 5) && i17 == 4 && (fVar = (pVar = this.f224016d).f224030t) != null) {
                fVar.j(pVar.f224031u);
            }
        }
    }
}
