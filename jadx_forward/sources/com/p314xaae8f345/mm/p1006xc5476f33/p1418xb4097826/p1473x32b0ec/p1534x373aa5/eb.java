package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class eb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb f197812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f197813e;

    public eb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb gbVar, long j17) {
        this.f197812d = gbVar;
        this.f197813e = j17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        yz5.l lVar;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb gbVar = this.f197812d;
        if (itemId != gbVar.X || (lVar = gbVar.V) == null) {
            return;
        }
        lVar.mo146xb9724478(java.lang.Long.valueOf(this.f197813e));
    }
}
