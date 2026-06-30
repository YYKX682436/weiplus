package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class hx implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx f200135a;

    public hx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar) {
        this.f200135a = rxVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1
    /* renamed from: onShow */
    public final void mo14645xc39f557c() {
        r45.f62 f62Var;
        df2.dd ddVar = df2.od.f312485w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar = this.f200135a;
        ddVar.a(rxVar.H.getLiveRoomData(), 1, 4, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        java.util.LinkedList linkedList = rxVar.S;
        if (linkedList == null || (f62Var = (r45.f62) kz5.n0.a0(linkedList, rxVar.f0().f519665e)) == null) {
            return;
        }
        ddVar.d(rxVar.H.getLiveRoomData(), ml2.u1.O2, f62Var.m75945x2fec8307(0));
    }
}
