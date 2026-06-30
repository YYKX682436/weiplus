package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ma0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f195011p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f195012q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195011p = rootView;
        this.f195012q = statusMonitor;
        int i17 = com.p314xaae8f345.mm.R.id.mxt;
        if (((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mxt)) != null) {
            i17 = com.p314xaae8f345.mm.R.id.mxu;
            if (((android.widget.FrameLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mxu)) != null) {
                i17 = com.p314xaae8f345.mm.R.id.f568473my3;
                if (((com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f568473my3)) != null) {
                    i17 = com.p314xaae8f345.mm.R.id.f568475my4;
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14363xcdb31e8e) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f568475my4)) != null) {
                        K0(8);
                        rootView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ha0(this));
                        ym5.a1.h(rootView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ia0(this));
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        boolean b76 = ((mm2.e1) P0(mm2.e1.class)).b7();
        boolean F1 = zl2.r4.F1(S0());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[SingSongBanner] setVisible: visible=");
        sb6.append(i17 == 0 ? "VISIBLE" : "GONE");
        sb6.append(", isKTV=");
        sb6.append(b76);
        sb6.append(", isCoLive=");
        sb6.append(F1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", sb6.toString());
        if (b76) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveWishBannerPlugin", "[SingSongBanner] setVisible: BLOCKED - isKTVRoomLive=true, force GONE");
            super.K0(8);
        } else if (!F1) {
            super.K0(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveWishBannerPlugin", "[SingSongBanner] setVisible: BLOCKED - isCoLiveLive=true, force GONE");
            super.K0(8);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 7) {
            if (ordinal != 124) {
                return;
            }
            java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("PARAM_FINDER_LIVE_SUB_MODE")) : null;
            boolean g76 = ((mm2.e1) P0(mm2.e1.class)).g7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] statusChange: LIVE_MODE_CHANGE, subMode=" + valueOf + ", isVoiceRoom=" + g76);
            if (g76) {
                if (valueOf != null && valueOf.intValue() == 0) {
                    return;
                }
                if (valueOf == null || valueOf.intValue() != 8) {
                    t1();
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveWishBannerPlugin", "[SingSongBanner] statusChange: VoiceRoom KTV mode, force GONE");
                    K0(8);
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] statusChange: START_LIVE received, calling initPlugin()");
        boolean z17 = dk2.ef.f314917g;
        boolean z18 = ((mm2.m6) P0(mm2.m6.class)).f410781p;
        boolean b76 = ((mm2.e1) P0(mm2.e1.class)).b7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] ========== initPlugin START ==========");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] initPlugin: isAnchor=" + z17 + ", isNewVersionSongList=" + z18 + ", isKTV=" + b76);
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] initPlugin: isNewVersionSongList=false, skip");
            return;
        }
        if (z17) {
            ((mm2.m6) P0(mm2.m6.class)).f410779n.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ja0(this));
        } else {
            ((mm2.m6) P0(mm2.m6.class)).f410779n.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ka0(this));
        }
        ((mm2.m6) P0(mm2.m6.class)).f410775g.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.la0(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] ========== initPlugin END ==========");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        int i17 = ((mm2.c1) P0(mm2.c1.class)).f410334f2;
        boolean z17 = i17 != 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] visibleInCurrentLiveMode: liveScene=" + i17 + ", visible=" + z17);
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        dk2.ef efVar = dk2.ef.f314905a;
        boolean z17 = dk2.ef.f314917g;
        boolean z18 = ((mm2.m6) P0(mm2.m6.class)).f410781p;
        java.lang.Boolean bool = (java.lang.Boolean) ((mm2.m6) P0(mm2.m6.class)).f410779n.mo3195x754a37bb();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] checkNeedShow: isAnchor=" + z17 + ", isNewVersionSongList=" + z18 + ", hasNewSongList=" + booleanValue);
        if (!z18) {
            K0(8);
            return;
        }
        if (z17) {
            if (booleanValue) {
                K0(0);
                return;
            } else {
                K0(8);
                return;
            }
        }
        if (booleanValue) {
            K0(0);
        } else {
            K0(8);
        }
    }
}
