package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class t80 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements ya2.x1, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f217526m;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt f217527d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct f217528e;

    /* renamed from: f, reason: collision with root package name */
    public final ey2.t0 f217529f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f217530g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f217531h;

    /* renamed from: i, reason: collision with root package name */
    public int f217532i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f217529f = (ey2.t0) a17;
        this.f217530g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s80(this));
        this.f217532i = -1;
    }

    public final void O6(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530;
        vo2.d player;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd;
        if (getIsUserVisibleFocused()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = this.f217528e;
            if (ctVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m56655x4905e9fa.getLayoutManager();
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = m56655x4905e9fa.p0(((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w());
                in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                long longExtra = intent != null ? intent.getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", -1L) : -1L;
                long longExtra2 = intent != null ? intent.getLongExtra("KEY_CACHE_OBJECT_ID", -1L) : -1L;
                boolean z17 = false;
                if (!(s0Var != null && s0Var.m8185xcdaf1228() == 4)) {
                    if (s0Var != null && s0Var.m8185xcdaf1228() == 2) {
                        z17 = true;
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineUIC", "[checkSeek] photo feedId=" + pm0.v.u(longExtra2) + " seekTime=" + longExtra);
                        if (longExtra <= 0 || (c14493xfdc11530 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530) s0Var.p(com.p314xaae8f345.mm.R.id.agy)) == null || (player = c14493xfdc11530.getPlayer()) == null || (c15188xd8bd4bd = ((vo2.c) player).f520092b) == null) {
                            return;
                        }
                        c15188xd8bd4bd.f0(longExtra, true, 3);
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
                if (c15196x85976f5f != null) {
                    float floatExtra = intent != null ? intent.getFloatExtra("KEY_VIDEO_PLAY_SPEED_RATIO", 1.0f) : 1.0f;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineUIC", "[checkSeek] video feedId=" + pm0.v.u(longExtra2) + " seekTime=" + longExtra + " speedRatio=" + floatExtra);
                    if (longExtra > 0) {
                        java.lang.Object obj = s0Var.f374658i;
                        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                        if (u1Var != null) {
                            ((ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class)).N6(u1Var.mo2128x1ed62e84());
                            u1Var.f492165f = true;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.Z(c15196x85976f5f, longExtra, 3, floatExtra, false, null, 24, null);
                    }
                }
            }
        }
    }

    public final int P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = btVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar : null;
        if (pzVar != null) {
            return pzVar.X0();
        }
        return 0;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 Q6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar == null) {
            return null;
        }
        if (btVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = btVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar : null;
        if (pzVar != null) {
            return pzVar.C;
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt R6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar != null) {
            return btVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 S6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = this.f217528e;
        if (ctVar == null) {
            return null;
        }
        if (ctVar != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    public final int T6() {
        return ((java.lang.Number) this.f217530g.mo141623x754a37bb()).intValue();
    }

    public final cw2.f8 U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar).F;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    public final boolean V6() {
        return this.f217527d != null;
    }

    public final void W6(java.lang.String source) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, source + " init header view tabType " + pzVar.f190295p);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7() || (abstractC15124x7bae6180 = pzVar.f190289h) == null || (ctVar = pzVar.f190292m) == null || (m56655x4905e9fa = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa()) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) pf5.z.f435481a.b(abstractC15124x7bae6180).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class)).R6(m56655x4905e9fa, pzVar.f190307x1, pzVar);
    }

    public final void X6(boolean z17) {
        in5.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = this.f217528e;
        if (ctVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa().getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar2 = this.f217528e;
        if (ctVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar2).m56655x4905e9fa().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2 : null;
        if (c1162x665295de != null) {
            int i17 = !z17 ? 1 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        if (w17 <= -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar3 = this.f217528e;
            if (ctVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar3).m56655x4905e9fa().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m80(c1162x665295de, z17));
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
            if (btVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            so2.j5 W0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar).W0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar4 = this.f217528e;
            if (ctVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar4).m56655x4905e9fa().mo7946xf939df19();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
            if (c22848x6ddd90cf != null) {
                s0Var = (in5.s0) in5.n0.Y(c22848x6ddd90cf, W0 != null ? W0.mo2128x1ed62e84() : 0L, false, 2, null);
            } else {
                s0Var = null;
            }
            int m61474x2d827763 = (s0Var == null || (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k)) == null) ? 0 : c15196x85976f5f.m61474x2d827763();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3.f206511a;
            int T6 = T6();
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2 c17 = c3Var.c(T6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RefreshReporter", "tab_" + T6 + ",开始双击点击刷新（刷新次数：" + c17.f207019c + "）," + c3Var.b(W0) + '}');
            if (c17.f207019c == 0) {
                c17.a(T6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3.f206513c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y2(V6, W0, m61474x2d827763, c17.f207019c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a3.f206476f);
            c17.f207018b = W0;
            c17.f207017a = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar5 = this.f217528e;
            if (ctVar5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct.i(ctVar5, 150L, false, false, null, 12, null);
            if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q0().r()).intValue() == 1) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context2 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                if (nyVar2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).aj(nyVar2.V6(), 5, T6());
                }
            }
        } else if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q0().r()).intValue() == 1) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context3 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar3 = context3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar3 != null) {
                i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18).aj(nyVar3.V6(), 1, 0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar6 = this.f217528e;
        if (ctVar6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) m158358x197d1fc6 : null;
        int i18 = abstractC15124x7bae6180 != null ? abstractC15124x7bae6180.f210798p : 0;
        boolean[] zArr = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.tk.f186167e;
        if (zArr[i18 != 1 ? i18 != 3 ? (char) 2 : (char) 0 : (char) 1]) {
            android.view.View findViewById = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar6).f192381f.findViewById(com.p314xaae8f345.mm.R.id.g3f);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedTipConvert$Companion", "changeToItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderTimelineContract$ViewCallback;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedTipConvert$Companion", "changeToItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderTimelineContract$ViewCallback;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            zArr[i18 != 1 ? i18 != 3 ? (char) 2 : (char) 0 : (char) 1] = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b_a;
    }

    @Override // ya2.x1
    public void j7(r45.hx0 cmdItem, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdItem, "cmdItem");
        if (cmdItem.m75939xb282bd08(0) == 108) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
            if (btVar != null) {
                pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ez((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (getIsUserVisibleFocused() && -1 == i18 && i17 == 101) {
            O6(intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        if (m80381x45f41879()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
            if (btVar != null) {
                return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar).e1();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar2 = this.f217527d;
        if (btVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar2).e1()) {
            return false;
        }
        m158354x19263085().finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        if (newConfig.orientation == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = this.f217528e;
            if (ctVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa().getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            this.f217532i = c1162x665295de != null ? c1162x665295de.t() : -1;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEW_CGI_INT_SYNC, 0);
        if (r17 == 1) {
            db2.u4.f309721a = "/cgi-bin/mmfinder-bin";
        } else if (r17 != 2) {
            db2.u4.f309721a = "/cgi-bin/micromsg-bin";
        } else {
            db2.u4.f309721a = "/cgi-bin/micromsg-bin";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCgiConstants", "config " + r17 + ' ' + db2.u4.f309721a);
        mv2.l lVar = mv2.l.f413130d;
        mv2.l.f413130d.e();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dv.f184735d == T6() ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dv.f184734c : null;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        this.f217527d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz(abstractActivityC21394xb3d2c0cf, m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) m158358x197d1fc6 : null, gVar);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 v00Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00(abstractActivityC21394xb3d2c0cf2, btVar, m80380x71e92c1d(), m158358x197d1fc6());
        this.f217528e = v00Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar2 = this.f217527d;
        if (btVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar2).mo56536x3b13c504(v00Var);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f413094a.c();
        ((c61.l7) i95.n0.c(c61.l7.class)).P.b(104, this);
        ((c61.l7) i95.n0.c(c61.l7.class)).P.b(108, this);
        android.view.View decorView = m158354x19263085().getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n80(decorView, this));
        this.f217531h = m158359x1e885992().getIntExtra("FROM_SCENE_KEY", 2) == 6;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        qt2.u uVar;
        android.os.Bundle bundle2;
        if (!m80381x45f41879()) {
            o25.n1.c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085());
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) m158358x197d1fc6 : null;
        if (((abstractC15124x7bae6180 == null || (bundle2 = abstractC15124x7bae6180.f210801s) == null || !bundle2.getBoolean("IsFirstEnterTab", false)) ? false : true) && m158359x1e885992().getBooleanExtra("KEY_ROUTE_TO_TOPIC", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineUIC", "[onCreateAfter] is go to topic, tabType=" + T6() + " isAutoRefresh=" + this.f217529f.R6(T6()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
            if (btVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar).M0(true, true, 0L);
            ey2.o0 N6 = ((ey2.t0) pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class)).N6(T6());
            N6.f338981h = java.lang.System.currentTimeMillis();
            N6.a(ey2.q0.f339007g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar2 = this.f217527d;
        if (btVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        dw2.c0 c0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar2).F.f305236n;
        if (c0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
            sb6.append(m158358x197d1fc62 != null ? m158358x197d1fc62.getClass().getSimpleName() : null);
            sb6.append("#onViewFocused");
            dw2.c0.h(c0Var, sb6.toString(), true, false, 4, null);
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc63 = m158358x197d1fc6();
        if (m158358x197d1fc63 != null && (uVar = (qt2.u) pf5.z.f435481a.b(m158358x197d1fc63).e(qt2.u.class)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = this.f217528e;
            if (ctVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar3 = this.f217527d;
            if (btVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            uVar.S6(m56655x4905e9fa, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar3).C);
        }
        final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad>(m158354x19263085) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC$onCreateAfter$3
            {
                this.f39173x3fe91575 = 1338237085;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad c5515x11ebd8ad) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad event = c5515x11ebd8ad;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = event.f135846g.f89425a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80 t80Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80.this;
                if (i17 != t80Var.T6()) {
                    return false;
                }
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o80(t80Var));
                return false;
            }
        }.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        if (m80381x45f41879()) {
            return;
        }
        o25.n1.e(m158354x19263085());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineUIC", "onDestroy");
        ((c61.l7) i95.n0.c(c61.l7.class)).P.l(104, this);
        ((c61.l7) i95.n0.c(c61.l7.class)).P.l(108, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar).mo979x3f5eee52();
        kk.l lVar = so2.f0.f491867a;
        so2.f0.f491867a.mo143584x5a5b64d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = this.f217528e;
        if (ctVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa().mo7960x6cab2c8d(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        int T6 = T6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        v1Var.x(T6, nyVar != null ? nyVar.V6() : null);
        v1Var.v(-1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        super.mo2280xc944513d(intent);
        if (intent == null) {
            return;
        }
        O6(intent);
        int intExtra = intent.getIntExtra("KEY_TARGET_TAB_TYPE", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineUIC", "[onNewIntent] tabType:" + T6() + " targetTabType:" + intExtra);
        if (intExtra != T6()) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("KEY_BY_PASS_INFO");
        intent.getIntExtra("KEY_BY_PASS_INFO_TYPE", 0);
        int intExtra2 = intent.getIntExtra("KEY_SOURCE_TYPE", 0);
        long longExtra = intent.getLongExtra("KEY_OBJECT_ID", 0L);
        java.lang.String stringExtra2 = intent.getStringExtra("KEY_OBJECT_NONCE_ID");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        eb2.f0 f0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar).C.f189183f;
        if (stringExtra != null) {
            if (!(!(stringExtra.length() == 0))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                byte[] bytes = stringExtra.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                f0Var.f332277c = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
            }
        }
        f0Var.getClass();
        f0Var.f332280f = intExtra2;
        f0Var.f332278d = longExtra;
        f0Var.f332279e = stringExtra2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar2 = this.f217527d;
        if (btVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt.m0(btVar2, true, true, 0L, 4, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        java.lang.String str;
        r45.cl2 cl2Var;
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 Z0 = pzVar.Z0();
        if (Z0.f()) {
            Z0.f188337i = Z0.d().N6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(Z0.f188334f, "onUIPause hasPermission=" + Z0.f188337i);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        v1Var.c();
        pzVar.f190299r.getClass();
        pzVar.M.mo48814x2efc64();
        if (pzVar.f190295p == 4 && ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).qj()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e2 e2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206772c.get(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b));
            if (e2Var != null) {
                long j17 = e2Var.f206540a;
                if (j17 > 0) {
                    e2Var.f206541b = android.os.SystemClock.elapsedRealtime();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostReportLogic", "[setPostRecommendLeaveTime] startTime=" + j17 + " leaveTime=" + e2Var.f206541b);
                }
            }
        }
        v1Var.v(-1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0 y0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206975a;
        android.app.Activity context = m80379x76847179();
        int T6 = T6();
        int P6 = P6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!y0Var.a() && T6 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206979e) {
            y0Var.f(context, T6, P6);
        }
        android.app.Activity context2 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int m75939xb282bd08 = nyVar != null ? nyVar.W6(T6()).m75939xb282bd08(5) : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m1.f216642d.a();
        a17.a(m75939xb282bd08, "FinderHomeTabPause");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Collection values = a17.f216645a.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1) next).f216323b == m75939xb282bd08) {
                arrayList2.add(next);
            }
        }
        arrayList.addAll(arrayList2);
        if (!arrayList.isEmpty()) {
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1) it6.next();
                if (j1Var.f216332k < j1Var.f216327f) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    int i17 = j1Var.f216327f;
                    if (i17 == 0) {
                        str = "None";
                    } else if (i17 == 1) {
                        str = "Dispatched";
                    } else if (i17 == 2) {
                        str = "Consumed";
                    } else if (i17 == 3) {
                        str = "Focused";
                    } else if (i17 != 4) {
                        str = "Unknown#" + i17;
                    } else {
                        str = "UnFocused";
                    }
                    jSONObject.put("status", str);
                    jSONObject.put("dispatchFeed", j1Var.a());
                    qc2.b bVar = qc2.b.f443042a;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = j1Var.f216322a;
                    long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                    int i18 = j1Var.f216323b;
                    r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
                    long m75942xfb822ef2 = (m76806xdef68064 == null || (cl2Var = (r45.cl2) m76806xdef68064.m75936x14adae67(4)) == null) ? 0L : cl2Var.m75942xfb822ef2(1);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    qc2.b.a(bVar, 6, m76784x5db1b11, i18, m75942xfb822ef2, false, "feed-status", 0, 0, false, jSONObject2, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
                    j1Var.f216332k = j1Var.f216327f;
                }
            }
        }
        this.f217532i = -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo2282x953457f1(i17, permissions, grantResults);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 Z0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar).Z0();
        Z0.getClass();
        if (Z0.f()) {
            java.lang.String str = "onRequestPermissionsResult requestCode:" + i17 + " grantResults[0]:" + grantResults[0];
            java.lang.String str2 = Z0.f188334f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
            if (i17 == 79) {
                int i18 = grantResults[0];
                if (i18 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = Z0.f188331c;
                    if (ctVar != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l().L(true);
                        return;
                    }
                    return;
                }
                if (i18 == -1) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LBS_SAMECITY_HAVE_DENIED_LOCATION_PERMISSION_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onRequestPermissionsResult return for denied.");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onRequestPermissionsResult return for " + grantResults[0] + '.');
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 O6;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 Z0 = pzVar.Z0();
        if (Z0.f()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qz c17 = Z0.c();
            if (c17.h()) {
                Z0.l(-4, c17.i());
            } else if (!Z0.f188337i) {
                boolean N6 = Z0.d().N6();
                java.lang.String str = Z0.f188334f;
                if (N6 && Z0.f188338j) {
                    Z0.f188338j = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPermissionOk auto refresh");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt.m0(Z0.f188330b, true, true, 0L, 4, null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onUIResume permissions=" + N6);
            }
        }
        pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ez(pzVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5.f183935a.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onUIResume] tabType=");
        int i17 = pzVar.f190295p;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, sb6.toString());
        int i18 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).qj() ? 4 : 3;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = pzVar.f190288g;
        if (i17 == i18) {
            long longExtra = abstractActivityC21394xb3d2c0cf.getIntent().getLongExtra("key_finder_post_local_id", -1L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f183625a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = pzVar.C;
            d8Var.a(abstractActivityC21394xb3d2c0cf, c13917xbf9dc158);
            if (longExtra != -1 && i17 == 4) {
                pf5.z zVar = pf5.z.f435481a;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4) zVar.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4.class)).mo55429x74e3dc83(longExtra);
                c13917xbf9dc158.f189195u = longExtra;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = pzVar.f190292m;
                if (ctVar != null && (m56655x4905e9fa2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa()) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(m56655x4905e9fa2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "onUIResume", "()V", "Undefined", "scrollToPosition", "(I)V");
                    m56655x4905e9fa2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(m56655x4905e9fa2, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "onUIResume", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
                pzVar.D1 = 0;
                c13917xbf9dc158.d();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6 u6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6) zVar.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 O62 = u6Var.O6();
                if ((O62 != null && O62.b()) && (O6 = u6Var.O6()) != null) {
                    O6.a();
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v6) zVar.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v6.class)).O6();
            }
        }
        if (i17 == 3) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("KEY_FINDER_JUMP_FOLLOW_TAB", false));
            if (!(valueOf.booleanValue() && pzVar.Y)) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.booleanValue();
                pzVar.P0(null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar2 = pzVar.f190292m;
        if (ctVar2 != null && (m56655x4905e9fa = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar2).m56655x4905e9fa()) != null) {
            m56655x4905e9fa.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xy(pzVar));
        }
        pzVar.M.mo48813x58998cd();
        if (f217526m && T6() == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineUIC", "[onResume] shouldScrollToPostingItem");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar3 = this.f217528e;
            if (ctVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar3).m56655x4905e9fa().getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = c1162x665295de;
                yj0.a.d(c1162x665295de2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1162x665295de.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(c1162x665295de2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            f217526m = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.s(T6());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0 y0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206975a;
        android.app.Activity context = m80379x76847179();
        int T6 = T6();
        int P6 = P6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!y0Var.a()) {
            if (T6 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206979e && !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206977c) {
                y0Var.e(context, T6, P6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206977c = false;
        }
        if (this.f217532i >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar4 = this.f217528e;
            if (ctVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar4).m56655x4905e9fa().getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de3 = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2 : null;
            if (c1162x665295de3 != null) {
                int i19 = this.f217532i;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                arrayList3.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList3);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de4 = c1162x665295de3;
                yj0.a.d(c1162x665295de4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1162x665295de3.P(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue());
                yj0.a.f(c1162x665295de4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            this.f217532i = -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineUIC", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        if (!m158354x19263085().isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.j(T6(), false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        int T6 = T6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        v1Var.x(T6, nyVar != null ? nyVar.V6() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x07ad, code lost:
    
        if (r4.containsKey("ForceScrollPosition") == true) goto L367;
     */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0879  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo58275xd317978f() {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80.mo58275xd317978f():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180;
        super.mo58437xaa858cb6();
        boolean z17 = this.f217531h;
        pf5.u uVar = pf5.u.f435469a;
        if (z17 && T6() == 4) {
            ey2.o0 N6 = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(T6());
            N6.a(ey2.q0.f339008h);
            N6.f338982i = java.lang.System.currentTimeMillis();
        } else {
            ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).T6(T6());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = this.f217527d;
        if (btVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 Z0 = pzVar.Z0();
        if (Z0.f()) {
            Z0.f188339k = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(Z0.f188334f, "onUserVisibleUnFocused poiTask=" + Z0.f188341m);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tz tzVar = Z0.f188341m;
            if (tzVar != null) {
                Z0.e().mo50300x3fa464aa(tzVar);
            }
        }
        int i17 = pzVar.f190295p;
        if (i17 == 1) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = pzVar.f190292m;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa = ctVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa() : null;
            ml2.x1 x1Var = ml2.x1.f409736g;
            ml2.q1 q1Var = ml2.q1.f409345e;
            zy2.zb.Kh(zbVar, m56655x4905e9fa, x1Var, "temp_9", ml2.y.f409774f, 0, 0L, 0, 112, null);
        } else if (i17 == 4 && (abstractC15124x7bae6180 = pzVar.f190289h) != null) {
            so2.a2 a2Var = pzVar.f190307x1;
            a2Var.f491783g.f491878a = -1;
            so2.r4 r4Var = so2.r4.f492108e;
            so2.s4 s4Var = a2Var.f491784h;
            s4Var.getClass();
            s4Var.f492125a = r4Var;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) pf5.z.f435481a.b(abstractC15124x7bae6180).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class)).Q6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        v1Var.v(T6());
        v1Var.j(T6(), true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e1 e1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e1.f206537a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206975a.f(m80379x76847179(), T6(), P6());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f217529f = (ey2.t0) a17;
        this.f217530g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s80(this));
        this.f217532i = -1;
    }
}
