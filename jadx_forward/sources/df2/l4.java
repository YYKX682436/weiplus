package df2;

/* loaded from: classes3.dex */
public final class l4 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public int f312162m;

    /* renamed from: n, reason: collision with root package name */
    public int f312163n;

    /* renamed from: o, reason: collision with root package name */
    public int f312164o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f312165p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f312166q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f312167r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312162m = -1;
        this.f312163n = -1;
        this.f312164o = -1;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "onCleared");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "onLiveDeactivate!");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLivePause */
    public void mo14861x3972754b() {
        super.mo14861x3972754b();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f312165p;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f312166q;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        pm0.v.X(new df2.e4(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.ic1 ic1Var;
        super.mo14863x39a513b7(hc1Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f312165p;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f312166q;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        if (N6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveSlideToCloseGuideController", "hostActivity is null");
            return;
        }
        boolean z17 = true;
        boolean booleanExtra = N6.getIntent().getBooleanExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideToCloseLiveHelper", "curLiveRoomSwipeToClosed backNeedMiniWindow=" + booleanExtra);
        boolean z18 = booleanExtra ^ true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "onLiveStart swipeToClosed=" + z18);
        if (z18) {
            java.lang.String str = null;
            r45.s94 s94Var = (hc1Var == null || (ic1Var = (r45.ic1) hc1Var.m75936x14adae67(85)) == null) ? null : (r45.s94) ic1Var.m75936x14adae67(16);
            boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_FUN_USED_BOOLEAN_SYNC, false);
            ae2.in inVar = ae2.in.f85221a;
            boolean z19 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C7).mo141623x754a37bb()).r()).intValue() == 1;
            boolean g86 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).g8();
            boolean O6 = ((mm2.h7) m56788xbba4bfc0(mm2.h7.class)).O6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveStart usedSwipeFun=");
            sb6.append(o17);
            sb6.append(" slideToCloseFunEnable=");
            sb6.append(z19);
            sb6.append(" isMultiStream=");
            sb6.append(O6);
            sb6.append(" isVrLive=");
            sb6.append(g86);
            sb6.append(' ');
            if (s94Var != null) {
                str = "tipTimes=" + s94Var.m75939xb282bd08(1) + " enterLiveTimeSecond=" + s94Var.m75939xb282bd08(0) + " days_between_tip=" + s94Var.m75939xb282bd08(2);
            }
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", sb6.toString());
            if (!z19 || o17 || g86 || O6) {
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_LIMIT_TIMES_INT_SYNC;
            this.f312162m = c17.r(u3Var, -1);
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_ENTER_LIVE_SECOND_INT_SYNC;
            this.f312163n = c18.r(u3Var2, -1);
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_INTERVAL_DAYS_BETWEEN_TIP_INT_SYNC;
            this.f312164o = c19.r(u3Var3, -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "tryToUpdateConfig old maxLimitTimes=" + this.f312162m + " enterLiveSecondCanTip=" + this.f312163n + " tipIntervalDays=" + this.f312164o);
            if (!(s94Var != null && s94Var.m75939xb282bd08(1) == this.f312162m)) {
                this.f312162m = s94Var != null ? s94Var.m75939xb282bd08(1) : -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "Update maxLimitTimes=" + this.f312162m);
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(this.f312162m));
            }
            if (!(s94Var != null && s94Var.m75939xb282bd08(0) == this.f312163n)) {
                this.f312163n = s94Var != null ? s94Var.m75939xb282bd08(0) : -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "Update enterLiveSecondCanTip=" + this.f312163n);
                gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(this.f312163n));
            }
            if (!(s94Var != null && s94Var.m75939xb282bd08(2) == this.f312164o)) {
                this.f312164o = s94Var != null ? s94Var.m75939xb282bd08(2) : -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "Update tipIntervalDays=" + this.f312164o);
                gm0.j1.u().c().x(u3Var3, java.lang.Integer.valueOf(this.f312164o));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "tryToUpdateConfig new maxLimitTimes=" + this.f312162m + " enterLiveSecondCanTip=" + this.f312163n + " tipIntervalDays=" + this.f312164o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "tryToStartGuideTimer");
            if (this.f312162m <= 0 || this.f312163n <= 0 || this.f312164o <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveSlideToCloseGuideController", "tryToStartGuideTimer configParamsInvalid");
                return;
            }
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_SHOWN_TIMES_INT_SYNC, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "limitOfTimes shownTimes=" + r17 + " maxLimitTimes=" + this.f312162m);
            if (r17 >= this.f312162m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveSlideToCloseGuideController", "tryToStartGuideTimer limitOfTimes");
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_LAST_SHOWN_MS_LONG_SYNC, 0L);
            if (currentTimeMillis > this.f312164o * 86400000 && currentTimeMillis >= 1800000) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveSlideToCloseGuideController", "tryToStartGuideTimer tipIntervalNotMet");
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = this.f312165p;
            if (b4Var3 != null) {
                b4Var3.d();
            }
            int i17 = this.f312163n;
            df2.k4 k4Var = new df2.k4(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "startShowGuideTimer delaySecond=" + i17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var4 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("ShownSlideToClose::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new df2.j4(k4Var), false);
            long j17 = ((long) i17) * 1000;
            b4Var4.c(j17, j17);
            this.f312165p = b4Var4;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "onViewMount");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f312165p;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f312166q;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        pm0.v.X(new df2.e4(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSlideToCloseGuideController", "onViewUnmount");
    }
}
