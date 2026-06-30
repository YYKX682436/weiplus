package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qw implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sw f195586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f195587e;

    public qw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sw swVar, android.view.ViewGroup viewGroup) {
        this.f195586d = swVar;
        this.f195587e = viewGroup;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.f fVar = (mm2.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoForViewPlugin", "onVideoPlayStateChange: " + fVar);
        int i17 = fVar == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pw.f195467a[fVar.ordinal()];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sw swVar = this.f195586d;
        if (i17 == 1) {
            swVar.K0(swVar.f195850t);
        } else {
            if (i17 != 2) {
                return;
            }
            swVar.f195850t = this.f195587e.getVisibility();
            swVar.K0(8);
        }
    }
}
