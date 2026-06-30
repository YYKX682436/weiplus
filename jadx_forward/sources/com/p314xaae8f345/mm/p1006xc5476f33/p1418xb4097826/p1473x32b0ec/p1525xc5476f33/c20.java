package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class c20 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e20 f193630d;

    public c20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e20 e20Var) {
        this.f193630d = e20Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e20 e20Var = this.f193630d;
        e20Var.getClass();
        boolean z17 = dk2.ef.f314917g;
        zl2.r4 r4Var = zl2.r4.f555483a;
        boolean M = r4Var.M();
        boolean z18 = ((mm2.m6) e20Var.P0(mm2.m6.class)).f410781p;
        java.lang.Boolean bool = (java.lang.Boolean) ((mm2.m6) e20Var.P0(mm2.m6.class)).f410778m.mo3195x754a37bb();
        boolean h27 = r4Var.h2(e20Var.S0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveOldSongBannerPlugin", "[OldSongBanner] checkNeedShow: isAnchor=" + z17 + ", enableSingSong=" + M + ", isNewVersionSongList=" + z18 + ", showSongList=" + bool + ", isSongListEnabled=" + h27);
        if (!M) {
            e20Var.K0(8);
            return;
        }
        if (z17) {
            if (h27) {
                e20Var.K0(0);
                return;
            } else {
                e20Var.K0(8);
                return;
            }
        }
        if (bool != null) {
            if (bool.booleanValue() && h27) {
                e20Var.K0(0);
            } else {
                e20Var.K0(8);
            }
        }
    }
}
