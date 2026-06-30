package df2;

/* loaded from: classes3.dex */
public final class jc extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public boolean f311999m;

    /* renamed from: n, reason: collision with root package name */
    public r45.k74 f312000n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 f312001o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public static final void Z6(df2.jc jcVar, java.lang.String str) {
        jcVar.getClass();
        if (!zl2.r4.f555483a.I1(jcVar.getStore().getLiveRoomData())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAnchorDataPanelController", "checkPollingBannerData: switch is off, source=" + str);
            jcVar.f7();
            return;
        }
        if (!((mm2.c1) jcVar.m56788xbba4bfc0(mm2.c1.class)).a8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAnchorDataPanelController", "checkPollingBannerData: live is not started, source=" + str);
            jcVar.f7();
            return;
        }
        if (jcVar.f311999m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAnchorDataPanelController", "checkPollingBannerData: has started, source=" + str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAnchorDataPanelController", "checkPollingBannerData: start, source=" + str);
            jcVar.f311999m = true;
            dk2.ef.f314925k.e(35, new r45.rb2(), new df2.cc(jcVar, str, r45.qb2.class), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(df2.jc r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.jc.a7(df2.jc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b7() {
        if (zl2.r4.f555483a.y1(getStore().getLiveRoomData())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.ac(this, null), 3, null);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c7() {
        if (this.f312001o == null) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(O6()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dqq, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c14300xaa703dd8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8) inflate;
            this.f312001o = c14300xaa703dd8;
            c14300xaa703dd8.m57242x634f71af(new df2.fc(this));
        }
        return this.f312001o;
    }

    public final void d7(java.lang.String str) {
        e7(false);
        if (zl2.r4.f555483a.y1(getStore().getLiveRoomData())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c76 = c7();
            if (c76 != null) {
                c76.f(str);
            }
            f7();
        }
    }

    public final void e7(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f) S6(com.p314xaae8f345.mm.R.id.ubl);
        if (c14400x1527540f != null) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c76 = c7();
                if (c76 != null) {
                    c14400x1527540f.c(c76);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8 c77 = c7();
                if (c77 != null) {
                    c14400x1527540f.f(c77);
                }
            }
        }
        boolean isShown = c14400x1527540f != null ? c14400x1527540f.isShown() : false;
        android.view.View S6 = S6(com.p314xaae8f345.mm.R.id.egj);
        if (S6 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = S6.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = isShown ? O6().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) : -2;
            }
            S6.requestLayout();
        }
        android.view.View S62 = S6(com.p314xaae8f345.mm.R.id.fj9);
        if (S62 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = S62.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = isShown ? O6().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) : 0;
            }
            S62.requestLayout();
        }
    }

    public final void f7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAnchorDataPanelController", "stopPollingBannerData: startPolling=" + this.f311999m + ", isPanelEnable=" + zl2.r4.f555483a.I1(getStore().getLiveRoomData()));
        this.f311999m = false;
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.ef.f314925k.f(35);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAnchorDataPanelController", "onLiveActivate:");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        super.mo56792x5aa1a970();
        d7("onLiveEnd");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        super.mo14867x5aa1c816(r71Var);
        if (zl2.r4.f555483a.y1(getStore().getLiveRoomData())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.gc(this, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveStart: isAnchorOrAssistant=");
        zl2.r4 r4Var = zl2.r4.f555483a;
        sb6.append(r4Var.y1(getStore().getLiveRoomData()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAnchorDataPanelController", sb6.toString());
        if (r4Var.y1(getStore().getLiveRoomData())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.hc(this, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onViewMount: isAnchorOrAssistant=");
        zl2.r4 r4Var = zl2.r4.f555483a;
        sb6.append(r4Var.y1(getStore().getLiveRoomData()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAnchorDataPanelController", sb6.toString());
        if (r4Var.y1(getStore().getLiveRoomData()) && ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.ic(this, null), 3, null);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        d7("onViewUnmount");
        this.f312001o = null;
    }
}
