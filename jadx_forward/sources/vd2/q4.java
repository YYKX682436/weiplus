package vd2;

/* loaded from: classes3.dex */
public final class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f517402e;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
        this.f517401d = c14167x40aca97c;
        this.f517402e = c5445x963cab3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517401d;
        int i17 = c14167x40aca97c.f193028t.f517588f;
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        int size = (nVar == null || (arrayList = nVar.f390686e) == null) ? 0 : arrayList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "restartLive curPos:" + i17 + ",size:" + size + '!');
        if (i17 >= 0 && i17 < size) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 c14329x76e637f1 = c14167x40aca97c.f193026r;
            if (c14329x76e637f1 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1.Y(c14329x76e637f1, false, true, this.f517402e, 1, null);
            }
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            if (e1Var == null || (nw1Var = e1Var.f410521r) == null) {
                return;
            }
            long m75942xfb822ef2 = nw1Var.m75942xfb822ef2(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 y8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a;
            java.lang.String str = "RV_VISITOR_" + m75942xfb822ef2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.e(y8Var, str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184105r.f184073b, null, false, false, false, 60, null);
        }
    }
}
