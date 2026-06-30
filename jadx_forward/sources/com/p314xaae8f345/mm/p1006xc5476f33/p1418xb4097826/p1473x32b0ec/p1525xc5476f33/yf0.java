package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yf0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 f196726d;

    public yf0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var) {
        this.f196726d = ag0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.f fVar = (mm2.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = this.f196726d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ag0Var.f193414w, "onVideoPlayStateChange: " + fVar);
        int i17 = fVar == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xf0.f196617a[fVar.ordinal()];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = ag0Var.B;
        if (i17 == 1 || i17 == 2) {
            e30Var.f199754z.setAlpha(1.0f);
            e30Var.f199753y.setAlpha(1.0f);
        } else if (i17 == 3 || i17 == 4) {
            e30Var.f199754z.setAlpha(0.0f);
            e30Var.f199753y.setAlpha(0.0f);
        }
    }
}
