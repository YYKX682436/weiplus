package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class z6 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14335x54feb80e f198387d;

    public z6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14335x54feb80e c14335x54feb80e) {
        this.f198387d = c14335x54feb80e;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        dk2.xf k17;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14335x54feb80e c14335x54feb80e = this.f198387d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14335x54feb80e.getTAG(), "switch audio only mode to " + booleanValue + " from mini window");
        c14335x54feb80e.f197572n.setImageResource(booleanValue ? com.p314xaae8f345.mm.R.raw.f79618xc8de7bea : com.p314xaae8f345.mm.R.raw.f79811x33f313a3);
        gk2.e eVar = gk2.e.f354004n;
        if (eVar != null && (k17 = dk2.ef.f314905a.k(eVar)) != null) {
            if (((dk2.r4) k17).t(booleanValue, true)) {
                c14335x54feb80e.b(booleanValue, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c14335x54feb80e.getTAG(), "cdn switch audio only to " + booleanValue + " failed. Could because cdn failure or that the user is already in the target mode");
            }
        }
        return jz5.f0.f384359a;
    }
}
