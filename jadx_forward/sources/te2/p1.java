package te2;

/* loaded from: classes3.dex */
public final class p1 implements te2.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f499819d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f499820e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f499821f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f499822g;

    /* renamed from: h, reason: collision with root package name */
    public te2.k0 f499823h;

    /* renamed from: i, reason: collision with root package name */
    public bm2.m f499824i;

    /* renamed from: m, reason: collision with root package name */
    public r45.d22 f499825m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f499826n;

    /* renamed from: o, reason: collision with root package name */
    public final int f499827o;

    /* renamed from: p, reason: collision with root package name */
    public final int f499828p;

    /* renamed from: q, reason: collision with root package name */
    public long f499829q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f499830r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f499831s;

    public p1(android.view.View rootView, gk2.e liveData, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f499819d = rootView;
        this.f499820e = liveData;
        this.f499821f = statusMonitor;
        this.f499822g = basePlugin;
        this.f499827o = 1000;
        this.f499828p = 1001;
        this.f499830r = "";
        this.f499831s = jz5.h.b(new te2.h1(this));
    }

    public static java.lang.Object A(te2.p1 p1Var, int i17, java.lang.Integer num, r45.rm1 rm1Var, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            i18 = ((mm2.c1) p1Var.f499820e.a(mm2.c1.class)).E4;
        }
        return p1Var.z(i17, num, rm1Var, i18, interfaceC29045xdcb5ca57);
    }

    @Override // te2.l0
    public boolean D2(int i17, r45.xg7 xg7Var) {
        gk2.e eVar = this.f499820e;
        int size = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315410f.size();
        return size < ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315409e.size() && i17 >= 0 && i17 >= size + (-25);
    }

    public final dk2.vg c() {
        gk2.e eVar = this.f499820e;
        int i17 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315408d;
        if (i17 < 0 || i17 >= ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315410f.size()) {
            return null;
        }
        return (dk2.vg) ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315410f.get(i17);
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f499831s).mo141623x754a37bb();
    }

    public final boolean g() {
        android.view.View view = this.f499819d;
        if (view.getContext() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13964x5ac9d6b8) {
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1.class)).W6()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return ((mm2.c1) this.f499820e.a(mm2.c1.class)).a8();
    }

    public void i(dk2.vg musicItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
        this.f499825m = null;
        zl2.r4 r4Var = zl2.r4.f555483a;
        gk2.e eVar = this.f499820e;
        if (r4Var.s1(eVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this.f499822g, null, null, new te2.w0(this, musicItem, null), 3, null);
        } else {
            tn0.w0 f17 = dk2.ef.f314905a.f();
            if (f17 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseBgMusic path:");
                com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam = f17.L;
                sb6.append(audioMusicParam != null ? audioMusicParam.f14521x346425 : null);
                sb6.append(", publish:");
                com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam2 = f17.L;
                sb6.append(audioMusicParam2 != null ? java.lang.Boolean.valueOf(audioMusicParam2.f14522xf1f89d0f) : null);
                sb6.append(", loopCount:");
                com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam3 = f17.L;
                sb6.append(audioMusicParam3 != null ? java.lang.Integer.valueOf(audioMusicParam3.f14520x4a5820cb) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", sb6.toString());
                com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam4 = f17.L;
                if (audioMusicParam4 != null) {
                    f17.T().mo30282x5f1b9a9c().mo29050xff20a1fb(audioMusicParam4.f127778id);
                    f17.N = false;
                }
            }
            if (g() && (Y0 = this.f499822g.Y0()) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(Y0, null, null, new te2.x0(this, musicItem, null), 3, null);
            }
        }
        ((mm2.c1) eVar.a(mm2.c1.class)).Z6().i(musicItem, i17);
        te2.d4 d4Var = te2.d4.f499481a;
        boolean a86 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
        ml2.u2[] u2VarArr = ml2.u2.f409642d;
        d4Var.a(a86, 9, ((mm2.c1) eVar.a(mm2.c1.class)).Z6().e(), this.f499830r);
    }

    public void m(dk2.vg musicItem, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
        v();
        r45.d22 d22Var = this.f499825m;
        r45.d22 d22Var2 = musicItem.f315787a;
        boolean z18 = !(d22Var != null && dk2.q.d(d22Var, d22Var2));
        dk2.vg c17 = c();
        if (z18 && c17 != null) {
            te2.d4.f499481a.c(h(), 4, c17, false, true);
        }
        this.f499825m = d22Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playMusic ");
        sb6.append(musicItem);
        sb6.append(", forcePlay:");
        sb6.append(z17);
        sb6.append(", stack:");
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPresenter", sb6.toString());
        if (zl2.r4.f555483a.s1(this.f499820e)) {
            dk2.ef.f314905a.K(musicItem, i17, z17, new te2.b1(this, z18, musicItem));
            return;
        }
        dk2.ef.f314905a.K(musicItem, i17, z17, null);
        if (!g() || (Y0 = this.f499822g.Y0()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(Y0, null, null, new te2.c1(this, z18, musicItem, null), 3, null);
    }

    @Override // fs2.a
    /* renamed from: onAttach */
    public void mo56536x3b13c504(java.lang.Object obj) {
        te2.k0 callback = (te2.k0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPresenter", "onAttach");
        this.f499823h = callback;
        te2.q1 q1Var = (te2.q1) callback;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q1Var.f499882h, "initView");
        android.view.View view = q1Var.f499878d;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gk2.e eVar = q1Var.f499880f;
        te2.j0 j0Var = q1Var.f499881g;
        q1Var.f499883i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7(context, eVar, j0Var, q1Var);
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        q1Var.f499884m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h7(context2, eVar, j0Var);
        bm2.m mVar = new bm2.m(this.f499820e);
        this.f499824i = mVar;
        mVar.f103613q = new te2.s0(this, mVar);
        mVar.f103614r = new te2.t0(this);
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPresenter", "onDetach");
        f().mo50302x6b17ad39(null);
    }

    public void p(dk2.vg musicItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
        v();
        this.f499825m = musicItem.f315787a;
        zl2.r4 r4Var = zl2.r4.f555483a;
        gk2.e eVar = this.f499820e;
        if (r4Var.s1(eVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this.f499822g, null, null, new te2.e1(this, musicItem, null), 3, null);
        } else {
            tn0.w0 f17 = dk2.ef.f314905a.f();
            if (f17 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resumeBgMusic path:");
                com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam = f17.L;
                sb6.append(audioMusicParam != null ? audioMusicParam.f14521x346425 : null);
                sb6.append(", publish:");
                com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam2 = f17.L;
                sb6.append(audioMusicParam2 != null ? java.lang.Boolean.valueOf(audioMusicParam2.f14522xf1f89d0f) : null);
                sb6.append(", loopCount:");
                com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam3 = f17.L;
                sb6.append(audioMusicParam3 != null ? java.lang.Integer.valueOf(audioMusicParam3.f14520x4a5820cb) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", sb6.toString());
                com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam4 = f17.L;
                if (audioMusicParam4 != null) {
                    f17.T().mo30282x5f1b9a9c().mo29052x96288da4(audioMusicParam4.f127778id);
                    f17.N = true;
                }
            }
            if (g() && (Y0 = this.f499822g.Y0()) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(Y0, null, null, new te2.f1(this, musicItem, null), 3, null);
            }
        }
        dk2.p Z6 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6();
        Z6.getClass();
        if (musicItem.f315788b != 1) {
            musicItem.f315788b = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "resumeMusicItem " + musicItem + " songId size:" + Z6.f315409e.size() + ", musicList id size:" + Z6.f315410f.size() + ", pos:" + i17 + ", curPlayPos:" + Z6.f315408d);
    }

    public void q(int i17, boolean z17) {
        boolean s17 = zl2.r4.f555483a.s1(this.f499820e);
        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        if (s17 && z17) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f499826n;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f499826n = p3325xe03a0797.p3326xc267989b.l.d(i2Var, null, null, new te2.j1(this, i17, null), 3, null);
            return;
        }
        if (g() && z17) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f499826n;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            this.f499826n = p3325xe03a0797.p3326xc267989b.l.d(i2Var, null, null, new te2.l1(this, i17, null), 3, null);
        }
        tn0.w0 f17 = dk2.ef.f314905a.f();
        if (f17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "setMusicVolume level:" + i17);
            if (i17 < 0) {
                i17 = 0;
            }
            if (i17 > 100) {
                i17 = 100;
            }
            f17.f502311x0 = i17;
            f17.f502314y0 = true;
            f17.T().mo30282x5f1b9a9c().mo29054xdc5c9640(f17.f502311x0);
        }
    }

    public void s(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var;
        gk2.e eVar = this.f499820e;
        java.util.ArrayList arrayList = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315410f;
        java.util.List list = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315409e;
        this.f499830r = str == null ? "" : str;
        if (list.isEmpty()) {
            te2.k0 k0Var = this.f499823h;
            if (k0Var != null) {
                ((te2.q1) k0Var).d(true);
                return;
            }
            return;
        }
        if (!arrayList.isEmpty()) {
            te2.k0 k0Var2 = this.f499823h;
            if (k0Var2 != null) {
                ((te2.q1) k0Var2).a(arrayList);
            }
            bm2.m mVar = this.f499824i;
            if (mVar != null) {
                mVar.b(true);
                return;
            }
            return;
        }
        te2.l0.A0(this, false, null, new te2.p0(this), 3, null);
        te2.k0 k0Var3 = this.f499823h;
        if (k0Var3 == null || (d7Var = ((te2.q1) k0Var3).f499883i) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(d7Var, null, true, (int) (com.p314xaae8f345.mm.ui.bl.b(d7Var.f199716e).y * 0.75f), 1, null);
        android.view.View view = d7Var.P;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = d7Var.T;
        if (view2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = d7Var.U;
        if (view3 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = d7Var.f199617y0;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = d7Var.f199616x0;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        d7Var.e0(false);
    }

    @Override // te2.l0
    public void u5(boolean z17, r45.xg7 xg7Var, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        gk2.e eVar = this.f499820e;
        java.util.LinkedList g17 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().g(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPresenter", "loadMoreData loadAll:" + z17 + " udpateMusicList:" + g17);
        if (!(g17.isEmpty())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f499822g;
            if (lVar.W0() != null) {
                dk2.xf W0 = lVar.W0();
                if (W0 != null) {
                    long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                    byte[] bArr = ((mm2.e1) eVar.a(mm2.e1.class)).f410518o;
                    android.content.Context context = this.f499819d.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    ((dk2.r4) W0).O(m75942xfb822ef2, bArr, xy2.c.e(context), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, 1, g17, new te2.r0(this, callback));
                    return;
                }
                return;
            }
        }
        callback.mo146xb9724478(0);
    }

    public final void v() {
        mm2.m6 m6Var = (mm2.m6) this.f499820e.a(mm2.m6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f499822g;
        sf2.x xVar = (sf2.x) lVar.U0(sf2.x.class);
        dk2.yg c17 = m6Var.f410774f.c();
        if (c17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPresenter", "stopAllSinging: stopping old song list before bg music");
            if (xVar != null) {
                xVar.t7(c17);
            }
        }
        if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) m6Var.f410784s).mo144003x754a37bb() instanceof mm2.g6) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPresenter", "stopAllSinging: stopping new song list before bg music");
        sf2.e1 e1Var = (sf2.e1) lVar.U0(sf2.e1.class);
        if (e1Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(e1Var.getStore().getLiveRoomData().f354008i, null, null, new sf2.c1(e1Var, null), 3, null);
        }
    }

    public void y() {
        tn0.w0 f17 = dk2.ef.f314905a.f();
        if (f17 != null) {
            f17.F0();
        }
        this.f499825m = null;
        dk2.p Z6 = ((mm2.c1) this.f499820e.a(mm2.c1.class)).Z6();
        dk2.vg d17 = Z6.d();
        int i17 = Z6.f315408d;
        Z6.getClass();
        if (!(d17 != null && d17.f315788b == 3) && d17 != null) {
            d17.f315788b = 3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", "stopMusicItem " + d17 + " songId size:" + Z6.f315409e.size() + ", musicList id size:" + Z6.f315410f.size() + ", pos:" + i17 + ", curPlayPos:" + Z6.f315408d);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(int r24, java.lang.Integer r25, r45.rm1 r26, int r27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.p1.z(int, java.lang.Integer, r45.rm1, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
