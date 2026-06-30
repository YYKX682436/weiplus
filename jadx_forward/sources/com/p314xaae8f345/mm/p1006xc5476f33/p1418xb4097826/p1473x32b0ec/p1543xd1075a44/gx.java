package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class gx implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx f200012d;

    public gx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar) {
        this.f200012d = rxVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.f62 f62Var;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar = this.f200012d;
        if (itemId == rxVar.V) {
            df2.dd ddVar = df2.od.f312485w;
            ddVar.a(rxVar.H.getLiveRoomData(), 2, 4, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            java.util.LinkedList linkedList = rxVar.S;
            if (linkedList != null && (f62Var = (r45.f62) kz5.n0.a0(linkedList, rxVar.f0().f519665e)) != null) {
                ddVar.c(rxVar.H.getLiveRoomData(), ml2.t1.R2, f62Var.m75945x2fec8307(0));
            }
            df2.od odVar = (df2.od) rxVar.H.m56798x25fe639c(df2.od.class);
            if (odVar != null) {
                df2.od.d7(odVar, null, 1, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(rxVar, false, 1, null);
        }
    }
}
