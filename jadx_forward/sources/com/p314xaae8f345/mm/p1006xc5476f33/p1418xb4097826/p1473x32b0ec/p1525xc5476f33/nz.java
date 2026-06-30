package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nz implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz f195219d;

    public nz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz ozVar) {
        this.f195219d = ozVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamIndicatorPlugin", "onVideoPlayStateChange: " + ((mm2.f) obj));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oz ozVar = this.f195219d;
        boolean O6 = ((mm2.w) ozVar.P0(mm2.w.class)).O6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14288xbc18f594 c14288xbc18f594 = ozVar.f195337p;
        if (O6) {
            c14288xbc18f594.setAlpha(0.0f);
        } else {
            c14288xbc18f594.setAlpha(1.0f);
        }
    }
}
