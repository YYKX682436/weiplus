package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class r5 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f198891m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f198892n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f198893o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.p f198894p;

    /* renamed from: q, reason: collision with root package name */
    public on2.a2 f198895q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl f198896r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f198891m = "FinderLivePostCameraOptPanelUIC";
        this.f198893o = new java.util.ArrayList();
    }

    public static final void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var, r45.q12 q12Var) {
        r5Var.l7(q12Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) r5Var.S6(com.p314xaae8f345.mm.R.id.eqg);
        r5Var.f198892n = c1163xf1deaba4;
        r5Var.f198894p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.i5(r5Var);
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c5(r5Var));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = r5Var.f198892n;
        if (c1163xf1deaba42 != null) {
            final android.content.Context O6 = r5Var.O6();
            c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(O6) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.FinderLivePostCameraOptPanelUIC$initPostLayout$2
                @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
                /* renamed from: canScrollHorizontally */
                public boolean getF180019n() {
                    return false;
                }
            });
        }
        int dimensionPixelSize = r5Var.O6().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = r5Var.f198892n;
        if (c1163xf1deaba43 != null) {
            c1163xf1deaba43.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e5(r5Var, dimensionPixelSize));
        }
    }

    public final boolean a() {
        return ((mm2.m6) m56788xbba4bfc0(mm2.m6.class)).f410781p;
    }

    public final void a7(android.content.Intent intent) {
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198891m, "[checkAutoShow3D]");
        if (intent == null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
            intent = N6 != null ? N6.getIntent() : null;
        }
        int intExtra = intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0;
        if (intExtra == 7) {
            c7();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N62 = N6();
            if (N62 == null || (intent2 = N62.getIntent()) == null) {
                return;
            }
            intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            return;
        }
        if (intExtra == 11) {
            pm0.v.V(1000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.f5(this));
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N63 = N6();
            if (N63 == null || (intent3 = N63.getIntent()) == null) {
                return;
            }
            intent3.putExtra("KEY_PARAMS_DO_ACTION", 0);
            return;
        }
        if (intExtra != 16) {
            return;
        }
        pm0.v.V(1000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g5(this, intent));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N64 = N6();
        if (N64 == null || (intent4 = N64.getIntent()) == null) {
            return;
        }
        intent4.putExtra("KEY_PARAMS_DO_ACTION", 0);
    }

    public final boolean b7(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f198893o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6) obj).f198506a == i17) {
                break;
            }
        }
        return obj != null;
    }

    public final void c7() {
        int i17;
        r45.n73 n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410604i).mo144003x754a37bb();
        r45.z53 z53Var = n73Var != null ? (r45.z53) n73Var.m75936x14adae67(1) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a.o(getStore().getLiveRoomData(), 2, 2 - (z53Var != null ? z53Var.m75939xb282bd08(13) : 0), z53Var != null ? z53Var.m75945x2fec8307(0) : null);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).W2;
        if (c19786x6a1e2862 != null) {
            bf3.x0 x0Var = bf3.x0.f101207a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            int i18 = x0Var.a(context).y;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
            int i19 = i18 - (N6 != null ? com.p314xaae8f345.mm.ui.bk.m(N6).bottom : 0);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 m76505xea668b3e = c19786x6a1e2862.m76505xea668b3e();
            int m77179xa2e3235b = m76505xea668b3e != null ? m76505xea668b3e.m77179xa2e3235b() : 0;
            boolean k17 = com.p314xaae8f345.mm.ui.bk.k(O6());
            if (m77179xa2e3235b > 0) {
                i17 = i65.a.b(O6(), m77179xa2e3235b) + (k17 ? i19 : 0);
            } else {
                i17 = 544;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198891m, "half_page_custom_height=" + m77179xa2e3235b + " navHeight=" + i19 + " isNavigationBarVisibility=" + k17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context O6 = O6();
            r45.l34 l34Var = new r45.l34();
            r45.m34 m34Var = new r45.m34();
            m34Var.set(3, java.lang.Integer.valueOf(i17));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            m34Var.set(0, bool);
            m34Var.set(1, bool);
            m34Var.set(2, java.lang.Boolean.TRUE);
            l34Var.set(2, m34Var);
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534771c = l34Var;
            xc2.y2.i(y2Var, O6, p0Var, 0, null, 8, null);
        }
    }

    public final void d7(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198891m, "clickBeauty");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5.class);
        if (!((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).l7()) {
            if (a5Var != null) {
                a5Var.x1(true, bundle);
                return;
            }
            return;
        }
        if (bundle != null) {
            bundle.putBoolean("PARAM_FINDER_LIVE_CAMERA_ACTION_SHOULD_TRY_OPEN", true);
        } else {
            bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_CAMERA_ACTION_SHOULD_TRY_OPEN", true);
        }
        if (a5Var != null) {
            a5Var.x1(true, bundle);
        }
    }

    public final void e7(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198891m, "clickFlipCamera");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5.class);
        if (!((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).l7()) {
            if (a5Var != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("PARAM_FINDER_LIVE_CAMERA_ACTION_OPEN_SOURCE", i17);
                a5Var.z1(bundle);
                return;
            }
            return;
        }
        if (a5Var != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("PARAM_FINDER_LIVE_CAMERA_ACTION_SHOULD_TRY_OPEN", true);
            bundle2.putInt("PARAM_FINDER_LIVE_CAMERA_ACTION_OPEN_SOURCE", i17);
            a5Var.z1(bundle2);
        }
    }

    public final void f7() {
        sf2.x xVar;
        sf2.x xVar2;
        boolean L = zl2.r4.f555483a.L(getStore().getLiveRoomData());
        boolean a17 = a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "clickMusic enableAnchorMusic=" + L + ", enableNewSongList=" + a() + ", hasNewSingSong=" + a17);
        if (a17 && L) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "clickMusic -> branch1: MUSIC_SELECT_SHOW");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
            if (N6 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) pf5.z.f435481a.a(N6).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class);
                if (b8Var != null) {
                    b8Var.f198479q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d6.f198569f;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) pf5.z.f435481a.a(N6).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class);
                if (b8Var2 != null) {
                    b8Var2.S6();
                }
            }
            if2.b.Y6(this, qo0.b.f446932p2, null, 2, null);
        } else if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "clickMusic -> branch2: showSingSongListPanel");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
            if (ubVar != null && (xVar2 = (sf2.x) ubVar.mo57658x143f1b92(sf2.x.class)) != null) {
                xVar2.s7(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar2 = this.f372632e;
            if (ubVar2 != null && (xVar = (sf2.x) ubVar2.mo57658x143f1b92(sf2.x.class)) != null) {
                xVar.c7();
            }
        } else if (L) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "clickMusic -> branch3: MUSIC_SHOW");
            if2.b.Y6(this, qo0.b.f446915m2, null, 2, null);
        }
        if (((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).d7()) {
            if (!L) {
                if (a()) {
                    ll2.e.d(ll2.e.f400666a, "anchorlive.bottom.newmusic.song", false, false, 6, null);
                } else {
                    ll2.e.f400666a.j("anchorlive.bottom.music.song", false);
                }
                ll2.e.f400666a.j("anchorlive.bottom.music.bgmusic", false);
            }
            if (a()) {
                return;
            }
            ll2.e.b(ll2.e.f400666a, h7(), false, false, 6, null);
        }
    }

    public final jz5.l g7(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (zl2.r4.f555483a.L(getStore().getLiveRoomData())) {
            return new jz5.l(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.due), java.lang.Integer.valueOf(z17 ? com.p314xaae8f345.mm.R.raw.f79547x430fe938 : com.p314xaae8f345.mm.R.raw.f79546x12bbd129));
        }
        return new jz5.l(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5l), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79590x301f7106));
    }

    public final java.lang.String h7() {
        return a() ? "startlive.more.newmusic" : "startlive.bottom.music";
    }

    public final android.view.View i7(r45.d62 type) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        int i18 = -1;
        java.util.ArrayList arrayList = this.f198893o;
        if (ordinal == 4) {
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6) it.next()).f198506a == 7) {
                    i18 = i17;
                    break;
                }
                i17++;
            }
        } else if (ordinal == 15) {
            java.util.Iterator it6 = arrayList.iterator();
            i17 = 0;
            while (it6.hasNext()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6) it6.next()).f198506a == 9) {
                    i18 = i17;
                    break;
                }
                i17++;
            }
        } else if (ordinal == 22) {
            java.util.Iterator it7 = arrayList.iterator();
            i17 = 0;
            while (it7.hasNext()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6) it7.next()).f198506a == 8) {
                    i18 = i17;
                    break;
                }
                i17++;
            }
        } else if (ordinal == 59) {
            java.util.Iterator it8 = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6) it8.next()).f198506a == 4) {
                    i18 = i19;
                    break;
                }
                i19++;
            }
        } else if (ordinal == 60) {
            java.util.Iterator it9 = arrayList.iterator();
            i17 = 0;
            while (it9.hasNext()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6) it9.next()).f198506a == 6) {
                    i18 = i17;
                    break;
                }
                i17++;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : arrayList.size() - 1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f198892n;
        if (c1163xf1deaba4 != null) {
            return n3.u1.a(c1163xf1deaba4, intValue);
        }
        return null;
    }

    public final void l7(r45.q12 q12Var) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "loadOptions exptFilterEnable:" + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).O3 + ", exptBeautyEnable:" + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).N3);
        java.util.ArrayList arrayList = this.f198893o;
        arrayList.clear();
        java.lang.String str = this.f198891m;
        if (q12Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[loadOptions] mode null, return");
            return;
        }
        arrayList.clear();
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.n2(q12Var)) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(13));
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(12));
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(11));
            return;
        }
        if (r4Var.G1(q12Var)) {
            boolean P6 = ((mm2.n0) m56788xbba4bfc0(mm2.n0.class)).P6(xy2.c.e(O6()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[loadOptions] CoLive isInitiator=" + P6);
            if (!P6) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(5));
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(14));
                return;
            } else {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(13));
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(12));
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(11));
                return;
            }
        }
        boolean z18 = true;
        if (r4Var.p2(q12Var)) {
            if (q12Var.m75939xb282bd08(1) == 8) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(4));
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(11));
                return;
            }
            if (r4Var.L(getStore().getLiveRoomData()) || a()) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(6));
                m7();
            }
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(11));
            return;
        }
        if (r4Var.T1(q12Var)) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410338f6.mo3195x754a37bb(), java.lang.Boolean.TRUE)) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(2));
            }
            if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).X2) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(1));
                z17 = true;
            } else {
                z17 = false;
            }
            if (!z17) {
                if (!r4Var.L(getStore().getLiveRoomData()) && !a()) {
                    z18 = false;
                }
                if (z18) {
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(6));
                    m7();
                }
            }
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c6(11));
        }
    }

    public final void m7() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6;
        java.util.List list = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).Z6().f315407c;
        if (!(!list.isEmpty()) || (N6 = N6()) == null) {
            return;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        gk2.e liveRoomData = getStore().getLiveRoomData();
        r45.xl1 xl1Var = new r45.xl1();
        xl1Var.set(1, new java.util.LinkedList(list));
        r4Var.L2(N6, liveRoomData, xl1Var, null);
    }

    public final void n7() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f198892n;
        if (c1163xf1deaba4 == null || (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }

    @Override // if2.e
    /* renamed from: onActivityResult */
    public void mo57866x9d4787cb(int i17, int i18, android.content.Intent intent) {
        mf2.b0 b0Var;
        r45.re2 re2Var;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        r45.re2 re2Var2;
        java.util.LinkedList m75941xfb8219143;
        java.util.LinkedList m75941xfb8219144;
        boolean z17 = false;
        java.lang.String tag = this.f198891m;
        int i19 = -1;
        if (i18 == -1 && i17 == 1004) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "onActivityResult REQUEST_CODE_SELECT_LUCKY_MONEY_ROOM chatroomList:" + stringArrayListExtra);
            ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410336f4.f390582a.clear();
            ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410336f4.f390582a.addAll(stringArrayListExtra);
            mm2.y6 y6Var = (mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb();
            y6Var.getClass();
            if (y6Var.d() || y6Var.f411114e == 0) {
                y6Var.b();
            } else {
                for (java.lang.String str : stringArrayListExtra) {
                    java.util.ArrayList arrayList = y6Var.f411116g;
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                    if (y6Var.f411123n == null) {
                        y6Var.j(new r45.re2());
                    }
                    r45.re2 re2Var3 = y6Var.f411123n;
                    if (((re2Var3 == null || (m75941xfb8219144 = re2Var3.m75941xfb821914(0)) == null || m75941xfb8219144.contains(str)) ? false : true) && (re2Var2 = y6Var.f411123n) != null && (m75941xfb8219143 = re2Var2.m75941xfb821914(0)) != null) {
                        m75941xfb8219143.add(str);
                    }
                    r45.re2 re2Var4 = y6Var.f411123n;
                    if (((re2Var4 == null || (m75941xfb8219142 = re2Var4.m75941xfb821914(2)) == null || m75941xfb8219142.contains(str)) ? false : true) && (re2Var = y6Var.f411123n) != null && (m75941xfb821914 = re2Var.m75941xfb821914(2)) != null) {
                        m75941xfb821914.add(str);
                    }
                }
            }
            if (N6() != null && (b0Var = (if2.b) m56789x25fe639c(yf2.g0.class)) != null && (b0Var instanceof jm2.b)) {
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (i18 == -1 && i17 == 1002) {
            if (intent != null && intent.hasExtra("KEY_PARAMS_LOTTERY_SOURCE")) {
                i19 = intent.getIntExtra("KEY_PARAMS_LOTTERY_SOURCE", -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "onActivityResult source:" + i19 + '!');
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "onActivityResult but KEY_PARAMS_LOTTERY_SOURCE is null!");
            }
            if (i19 == 1) {
                z17 = true;
            }
        }
        if (z17) {
            if (this.f198895q == null) {
                this.f198895q = new on2.a2(O6(), getStore().getLiveRoomData(), 1);
            }
            df2.gq gqVar = (df2.gq) m56789x25fe639c(df2.gq.class);
            if (gqVar != null) {
                gqVar.b7();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.e
    /* renamed from: onNewIntent */
    public void mo57867xc944513d(android.content.Intent intent) {
        a7(intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        a7(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k5(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m5(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.o5(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q5(this, pluginLayout, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        ll2.e eVar = ll2.e.f400666a;
        eVar.e("startlive.bottom.videosetting", false);
        eVar.e("startlive.bottom.audiosetting", false);
        eVar.e("startlive.bottom.link", false);
        eVar.e(h7(), false);
        eVar.e("startlive.bottom.lottery", false);
        eVar.e("startlive.bottom.shopping", false);
        this.f198892n = null;
    }
}
