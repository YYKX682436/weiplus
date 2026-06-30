package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class u4 extends xt2.m6 implements jf2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f201471d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f201472e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f201473f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f201474g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f201475h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f201476i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f201477m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.y f201478n;

    public u4(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f201471d = root;
        this.f201472e = statusMonitor;
        this.f201473f = basePlugin;
        this.f201474g = "Finder.FinderLiveAnchoMusicEntranceWidget";
        this.f201475h = true;
        this.f201476i = root.findViewById(com.p314xaae8f345.mm.R.id.jzu);
        java.lang.Object context = root.getContext();
        this.f201478n = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        root.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t4(this));
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f201471d;
        if (viewGroup.getVisibility() != 0 || this.f201475h) {
            this.f201475h = false;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.R, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        }
        viewGroup.setVisibility(0);
        java.lang.String str = "checkAndSwitchRedDotPath: registeredMusicPath=" + this.f201477m + ", currentMusicPath=anchorlive.bottom.newmusic";
        java.lang.String str2 = this.f201474g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201477m, "anchorlive.bottom.newmusic")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "music path changed: " + this.f201477m + " -> anchorlive.bottom.newmusic");
            java.lang.String str3 = this.f201477m;
            if (str3 != null) {
                ll2.e.f400666a.o(this.f201478n, str3, true);
            }
            ll2.e.f400666a.k(this.f201478n, "anchorlive.bottom.newmusic", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r4(this));
            this.f201477m = "anchorlive.bottom.newmusic";
        }
        l();
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80699x4a9ebf82), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.due));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f201471d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f201471d.findViewById(com.p314xaae8f345.mm.R.id.jyy);
    }

    @Override // jf2.h
    public void g() {
        this.f201471d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f201471d;
    }

    @Override // jf2.h
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f201473f;
        if (zl2.r4.F1(lVar.S0()) || ((mm2.e1) lVar.P0(mm2.e1.class)).b7()) {
            return false;
        }
        boolean z17 = ((mm2.c1) lVar.P0(mm2.c1.class)).f410311a5;
        boolean z18 = sn0.b.f491497e2 != null;
        boolean o17 = ((mm2.e1) lVar.P0(mm2.e1.class)).a7() ? ((mm2.o2) lVar.P0(mm2.o2.class)).f410841q : gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC, false);
        boolean z19 = ((java.lang.Number) ae2.in.f85221a.M().r()).intValue() == 1;
        boolean z27 = o17 || z19;
        zl2.r4 r4Var = zl2.r4.f555483a;
        boolean z28 = r4Var.L(lVar.S0()) && r4Var.w1();
        if ((z18 && z27 && !z17) || !z28) {
            android.view.ViewGroup viewGroup = this.f201471d;
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.fcq)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(viewGroup.getContext(), com.p314xaae8f345.mm.R.raw.f79590x301f7106, viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f201474g, "checkVisible enableSingSongListFromBack: " + o17 + ", enableSwitch: " + z19 + ", isGameLive: " + z17 + ", isSecond: " + z18);
        if (z18) {
            if ((!z17 || (!z28 && !z27)) && !z27) {
                return false;
            }
        } else if (!z28 && !z27) {
            return false;
        }
        return true;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f201471d.findViewById(com.p314xaae8f345.mm.R.id.fcq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f201473f;
        if (ll2.e.f400666a.h("anchorlive.bottom.newmusic") && ((((mm2.e1) lVar.P0(mm2.e1.class)).a7() ? ((mm2.o2) lVar.P0(mm2.o2.class)).f410841q : gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC, false)) || (((java.lang.Number) ae2.in.f85221a.M().r()).intValue() == 1))) {
            android.view.View view = this.f201476i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget", "updateRedDotVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget", "updateRedDotVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f201476i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget", "updateRedDotVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget", "updateRedDotVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // jf2.h
    /* renamed from: type */
    public int mo58036x368f3a() {
        return 8;
    }
}
