package df2;

/* loaded from: classes3.dex */
public final class hh extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public int f311859m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f311860n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f311861o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f311862p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f311863q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311859m = 30;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveDoubleClickLikeGuideController", "onCleared");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLivePause */
    public void mo14861x3972754b() {
        super.mo14861x3972754b();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311861o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f311862p;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        pm0.v.X(new df2.ch(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        java.lang.String str;
        r45.ic1 ic1Var;
        super.mo14863x39a513b7(hc1Var);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311861o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f311862p;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        if (N6() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveDoubleClickLikeGuideController", "hostActivity is null");
            return;
        }
        ae2.in.f85221a.d0();
        r45.kf0 kf0Var = (hc1Var == null || (ic1Var = (r45.ic1) hc1Var.m75936x14adae67(85)) == null) ? null : (r45.kf0) ic1Var.m75936x14adae67(22);
        this.f311860n = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_DOUBLE_CLICK_GUIDE_SHOWN_BOOLEAN_SYNC, false);
        boolean g86 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).g8();
        boolean O6 = ((mm2.h7) m56788xbba4bfc0(mm2.h7.class)).O6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveStart usedSwipeFun=");
        sb6.append(this.f311860n);
        sb6.append("  isMultiStream=");
        sb6.append(O6);
        sb6.append(" isVrLive=");
        sb6.append(g86);
        sb6.append(' ');
        if (kf0Var != null) {
            str = "time_interval_of_guidance_after_join_live_s=" + kf0Var.m75939xb282bd08(0);
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append('}');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveDoubleClickLikeGuideController", sb6.toString());
        if (this.f311860n || g86 || O6) {
            return;
        }
        this.f311859m = kf0Var != null ? kf0Var.m75939xb282bd08(0) : this.f311859m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveDoubleClickLikeGuideController", "tryToStartGuideTimer");
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = this.f311861o;
        if (r2Var3 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
        }
        this.f311861o = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.gh(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveDoubleClickLikeGuideController", "onViewMount");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311861o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f311862p;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        pm0.v.X(new df2.ch(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveDoubleClickLikeGuideController", "onViewUnmount");
    }
}
