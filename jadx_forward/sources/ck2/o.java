package ck2;

/* loaded from: classes10.dex */
public final class o extends if2.b implements ak2.a, mf2.n {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f123966m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f123967n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f123968o;

    /* renamed from: p, reason: collision with root package name */
    public zj2.b f123969p;

    /* renamed from: q, reason: collision with root package name */
    public zj2.c f123970q;

    /* renamed from: r, reason: collision with root package name */
    public if2.d0 f123971r;

    /* renamed from: s, reason: collision with root package name */
    public final bk2.c f123972s;

    /* renamed from: t, reason: collision with root package name */
    public mm2.o6 f123973t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f123974u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f123966m = "MilestoneBannerController_" + hashCode();
        this.f123972s = new bk2.c(store, store.getLiveRoomData());
    }

    @Override // mf2.n
    public void S0(mm2.r4 data, boolean z17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        pm0.v.X(new ck2.k(z17, data, this, z18, z19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (zl2.r4.f555483a.I0().getBoolean("milestone_".concat(r0), false) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(r45.f02 r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L79
            int r0 = r9.f455414g
            r1 = 1
            boolean r0 = pm0.v.z(r0, r1)
            r2 = 0
            if (r0 == 0) goto L2a
            java.lang.String r0 = r9.f455411d
            if (r0 != 0) goto L12
            java.lang.String r0 = ""
        L12:
            zl2.q4 r3 = zl2.q4.f555466a
            r3.E()
            zl2.r4 r3 = zl2.r4.f555483a
            com.tencent.mm.sdk.platformtools.o4 r3 = r3.I0()
            java.lang.String r4 = "milestone_"
            java.lang.String r0 = r4.concat(r0)
            boolean r0 = r3.getBoolean(r0, r2)
            if (r0 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r2
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "checkShowLotteryResult hasLottery: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r2 = " ext_flag: "
            r0.append(r2)
            int r2 = r9.f455414g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r8.f123966m
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            if (r1 != 0) goto L79
            int r0 = r9.f455414g
            if (r0 <= 0) goto L79
            mm2.o6 r0 = new mm2.o6
            mm2.p6 r2 = mm2.p6.f410887g
            ck2.b r3 = new ck2.b
            r3.<init>(r8, r9)
            ck2.c r4 = new ck2.c
            r4.<init>(r8)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Class<mm2.w6> r9 = mm2.w6.class
            androidx.lifecycle.c1 r9 = r8.m56788xbba4bfc0(r9)
            mm2.w6 r9 = (mm2.w6) r9
            r9.getClass()
            mm2.r6 r1 = new mm2.r6
            r1.<init>(r9, r0)
            pm0.v.X(r1)
            r8.f123973t = r0
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ck2.o.Z6(r45.f02):void");
    }

    public final zj2.b a7() {
        zj2.b bVar = this.f123969p;
        if (bVar == null) {
            android.view.ViewGroup viewGroup = this.f123967n;
            bVar = viewGroup != null ? new zj2.b(viewGroup, this) : null;
        }
        this.f123969p = bVar;
        return bVar;
    }

    public final zj2.c b7() {
        zj2.c cVar = this.f123970q;
        if (cVar == null) {
            android.view.ViewGroup viewGroup = this.f123967n;
            cVar = viewGroup != null ? new zj2.c(viewGroup, this) : null;
        }
        this.f123970q = cVar;
        return cVar;
    }

    public final boolean c7() {
        android.content.Context context;
        android.view.View view;
        zj2.b bVar = this.f123969p;
        if (bVar == null || (view = bVar.f554820a) == null || (context = view.getContext()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        return com.p314xaae8f345.mm.ui.bk.Q() && (com.p314xaae8f345.mm.ui.bk.P(context) || com.p314xaae8f345.mm.ui.bk.O(context.getContentResolver()));
    }

    public void d7() {
        r45.f02 f02Var;
        mm2.r4 P6 = ((mm2.v4) m56788xbba4bfc0(mm2.v4.class)).P6();
        java.lang.String str = (P6 == null || (f02Var = P6.f410912d) == null) ? null : f02Var.f455411d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f123966m, "onBubbleClick currentLotteryId: " + str);
        if (zl2.r4.f555483a.w1()) {
            f7(null);
        } else {
            f7(str);
        }
    }

    public final void e7(df2.dn dnVar, r45.f02 f02Var, yz5.l lVar) {
        android.view.ViewGroup viewGroup = this.f123968o;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean isDestroyed = activity != null ? activity.isDestroyed() : false;
        java.lang.String str = this.f123966m;
        mm2.w4.a(f02Var, str, "showLotteryResult source: " + dnVar);
        if (isDestroyed) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showLotteryResult page isDestroyed");
            return;
        }
        df2.un unVar = (df2.un) m56789x25fe639c(df2.un.class);
        if (unVar != null) {
            unVar.Z6();
        }
        java.lang.String str2 = f02Var.f455411d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMilestoneUtil", "recordCardOpenLottery lottery: " + str2);
        zl2.r4.f555483a.I0().putBoolean("milestone_" + str2, true);
        if (f02Var.f455414g > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new ck2.m(this, dnVar, f02Var, lVar, null), 3, null);
        }
    }

    public final void f7(java.lang.String str) {
        if (U6() && !c7() && !com.p314xaae8f345.mm.ui.bk.d0()) {
            W6(new ck2.n(this, str));
            return;
        }
        df2.un unVar = (df2.un) m56789x25fe639c(df2.un.class);
        if (unVar != null) {
            unVar.d7(str);
        }
    }

    public final void g7(r45.g02 g02Var) {
        r45.tl4 tl4Var;
        r45.tl4 tl4Var2;
        mm2.r4 P6 = ((mm2.v4) m56788xbba4bfc0(mm2.v4.class)).P6();
        r45.f02 f02Var = P6 != null ? P6.f410912d : null;
        if (g02Var == null && f02Var == null) {
            if2.d0 d0Var = this.f123971r;
            if (d0Var != null) {
                d0Var.d(8);
                return;
            }
            return;
        }
        if ((f02Var == null || (tl4Var2 = f02Var.f455412e) == null || tl4Var2.f468081g != 1) ? false : true) {
            return;
        }
        if (((f02Var == null || (tl4Var = f02Var.f455412e) == null || tl4Var.f468081g != 2) ? false : true) || g02Var == null) {
            return;
        }
        zj2.b a76 = a7();
        if (a76 != null) {
            java.lang.String str = g02Var.f456302e;
            if (str == null) {
                str = "";
            }
            a76.f554823d.setText(str);
        }
        zj2.b a77 = a7();
        if (a77 != null) {
            a77.f554822c.setVisibility(0);
        }
        zj2.c b76 = b7();
        if (b76 != null) {
            b76.f554826f.setVisibility(8);
        }
        if2.d0 d0Var2 = this.f123971r;
        if (d0Var2 != null) {
            d0Var2.d(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new ck2.e(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new ck2.g(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new ck2.i(this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        this.f123972s.b("onDestroy");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        if (this.f123974u) {
            d7();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStartFromWindow */
    public void mo14864x95cdef51() {
        r45.f02 f02Var = (r45.f02) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.v4) m56788xbba4bfc0(mm2.v4.class)).f411012i).mo144003x754a37bb();
        if (f02Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveStartFromWindow status: ");
            r45.tl4 tl4Var = f02Var.f455412e;
            sb6.append(tl4Var != null ? java.lang.Integer.valueOf(tl4Var.f468081g) : null);
            sb6.append(" id: ");
            sb6.append(f02Var.f455411d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f123966m, sb6.toString());
            r45.tl4 tl4Var2 = f02Var.f455412e;
            boolean z17 = false;
            if (tl4Var2 != null && tl4Var2.f468081g == 3) {
                z17 = true;
            }
            if (z17) {
                Z6(f02Var);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        this.f123967n = (android.view.ViewGroup) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.f566265fb3);
        this.f123968o = (android.view.ViewGroup) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.evm);
        android.view.ViewGroup viewGroup = this.f123967n;
        if (viewGroup != null) {
            if2.d0 d0Var = new if2.d0(viewGroup, this);
            this.f123971r = d0Var;
            this.f372636i = new ck2.l(d0Var);
        }
        if2.d0 d0Var2 = this.f123971r;
        if (d0Var2 != null) {
            d0Var2.d(8);
        }
        r45.f02 f02Var = (r45.f02) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.v4) m56788xbba4bfc0(mm2.v4.class)).f411012i).mo144003x754a37bb();
        if (f02Var != null) {
            this.f123972s.a(f02Var);
        }
        r45.g02 g02Var = (r45.g02) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.v4) m56788xbba4bfc0(mm2.v4.class)).f411010g).mo144003x754a37bb();
        if (g02Var != null) {
            g7(g02Var);
        }
        android.view.ViewGroup viewGroup2 = this.f123968o;
        java.lang.Integer num = null;
        android.content.Context context = viewGroup2 != null ? viewGroup2.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            num = java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0));
        }
        if (num != null && num.intValue() == 12) {
            this.f123974u = true;
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        if (this.f123974u) {
            android.view.ViewGroup viewGroup = this.f123968o;
            android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null && (intent = activity.getIntent()) != null) {
                intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            this.f123974u = false;
        }
        this.f123969p = null;
        this.f123970q = null;
        this.f123967n = null;
        this.f123968o = null;
        this.f123971r = null;
    }
}
