package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class q00 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f190315a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 f190316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f190317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h00 f190318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f190319e;

    public q00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 v00Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h00 h00Var, int i17) {
        this.f190316b = v00Var;
        this.f190317c = c1163xf1deaba4;
        this.f190318d = h00Var;
        this.f190319e = i17;
    }

    @Override // ym5.q3
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 v00Var = this.f190316b;
        ym5.q3 q3Var = v00Var.f192390r;
        if (q3Var != null) {
            q3Var.a(i17);
        }
        if (!this.f190315a || i17 <= 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = v00Var.f192379d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        fc2.o d76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).d7(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) v00Var.f192380e).f190295p);
        if (d76 != null) {
            new fc2.i(d76).mo481x4d79408f(this.f190317c, 5);
        }
        this.f190315a = false;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 l17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 v00Var = this.f190316b;
        ym5.q3 q3Var = v00Var.f192390r;
        if (q3Var != null) {
            q3Var.b(i17);
        }
        boolean z17 = i17 == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) v00Var.f192380e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = pzVar.C;
        eb2.f0 f0Var = c13917xbf9dc158.f189183f;
        boolean z18 = f0Var != null && f0Var.f332286l;
        java.lang.String str = pzVar.U;
        if (z18 || (!c13917xbf9dc158.f189190p && c13917xbf9dc158.f189191q)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData: wait show unread feed refresh end, unreadForEnter:");
            eb2.f0 f0Var2 = c13917xbf9dc158.f189183f;
            sb6.append(f0Var2 != null ? java.lang.Boolean.valueOf(f0Var2.f332286l) : null);
            sb6.append(", unreadForTop:");
            sb6.append(c13917xbf9dc158.f189191q);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = pzVar.f190292m;
            l17 = ctVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l() : null;
            if (l17 == null) {
                return;
            }
            l17.m82698x62664cef(false);
            return;
        }
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.r1().r()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar2 = pzVar.f190292m;
            if (ctVar2 != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar2).l().isRefreshing) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar3 = pzVar.f190292m;
                l17 = ctVar3 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar3).l() : null;
                if (l17 != null) {
                    l17.m82698x62664cef(false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "loadMoreData return for isRefreshing.");
                return;
            }
            if (!pzVar.b1()) {
                pzVar.j1(null, null, false, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar4 = pzVar.f190292m;
                l17 = ctVar4 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar4).l() : null;
                if (l17 != null) {
                    l17.m82698x62664cef(false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "loadMoreData return for enter pull fail.");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0 y0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206975a;
        int V0 = pzVar.V0();
        boolean z19 = pzVar.B1;
        int X0 = pzVar.X0();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = pzVar.f190288g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!y0Var.a()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onLoadMoreStart] tabType:");
            int i18 = pzVar.f190295p;
            sb7.append(i18);
            sb7.append(" itemCount:");
            sb7.append(V0);
            sb7.append(" isAuto:");
            sb7.append(z19);
            sb7.append(" curPosition:");
            sb7.append(X0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeActionReporter", sb7.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206979e = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w0 c17 = y0Var.c(i18);
            c17.f206946a = V0;
            c17.f206948c = true;
            c17.f206947b = X0;
            y0Var.h(i18, 7, z19);
            y0Var.g(context, i18, new jz5.l(7, 8), false);
        }
        pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zx(pzVar, z17));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 v00Var = this.f190316b;
        ym5.q3 q3Var = v00Var.f192390r;
        if (q3Var != null) {
            q3Var.c(reason);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineViewCallback", "[onLoadMoreEnd] isHasAnyMore=" + reason);
        if (!reason.f545054f) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190317c;
            if (c1163xf1deaba4.getChildCount() > 0) {
                android.view.View childAt = c1163xf1deaba4.getChildAt(c1163xf1deaba4.getChildCount() - 1);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = c1163xf1deaba4.m0(childAt);
                java.lang.Integer valueOf = m07 != null ? java.lang.Integer.valueOf(m07.m8185xcdaf1228()) : null;
                if (childAt.getHeight() > 0 && ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 8))) {
                    int height = v00Var.m130335x893a2f6f().getDisplayMetrics().heightPixels - childAt.getHeight();
                    v00Var.l().m82558x809b0de(height / 3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineViewCallback", "extraOverScrollFooterDx=" + height);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1311L, 2L, 1L);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) v00Var.f192380e;
        pzVar.getClass();
        pzVar.P0(reason);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar2 = pzVar.f190292m;
        if (ctVar2 != null && (m56655x4905e9fa2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar2).m56655x4905e9fa()) != null) {
            m56655x4905e9fa2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.py(pzVar));
        }
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz.O1.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = pzVar.f190295p;
            if (!hasNext) {
                break;
            } else {
                ((ni3.a) it.next()).a(i17, reason.f545056h);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a, i17, false, null, false, 0L, false, 60, null);
        java.lang.String str = "[onLoadMoreEnd] tabType:" + i17 + "  reason=" + reason + " isAutoLoadingMore=" + pzVar.B1;
        java.lang.String str2 = pzVar.U;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (reason.f545057i && reason.f545054f && (ctVar = pzVar.f190292m) != null && (m56655x4905e9fa = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa()) != null) {
            pzVar.l1(m56655x4905e9fa);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0 y0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206975a;
        int V0 = pzVar.V0();
        boolean z17 = pzVar.B1;
        int X0 = pzVar.X0();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = pzVar.f190288g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!y0Var.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeActionReporter", "[onLoadMoreEnd] tabType:" + i17 + " itemCount:" + V0 + " isAuto:" + z17 + " curPosition:" + X0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206979e = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w0 c17 = y0Var.c(i17);
            c17.f206946a = V0;
            c17.f206948c = false;
            c17.f206947b = X0;
            y0Var.h(i17, 8, z17);
            y0Var.g(context, i17, new jz5.l(8, 7), true);
        }
        pzVar.Q0(reason, false);
        pzVar.B1 = false;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6160x53d1b540 c6160x53d1b540 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6160x53d1b540();
        am.uy uyVar = c6160x53d1b540.f136422g;
        uyVar.getClass();
        uyVar.f89676a = 2;
        uyVar.f89677b = reason.f545056h;
        uyVar.f89678c = java.lang.System.currentTimeMillis() - pzVar.C1;
        c6160x53d1b540.e();
        pzVar.D1 = (!reason.f545054f || reason.f545056h <= 0) ? -1 : 1;
        if (i17 == 4 || i17 == 1 || i17 == 3 || i17 == 35) {
            if (pzVar.f190310y1) {
                pzVar.f190310y1 = false;
                boolean b07 = pm0.v.b0(pzVar.C.m56388xcaeb60d0(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qy.f190389d);
                if (b07) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dw) pzVar.G).mo56048x7bb163d5();
                    pzVar.P0(null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "tabType:" + i17 + " delete placeholder hasEnableRecFeed=" + b07);
            } else {
                pzVar.O0("loadMore");
            }
        }
        pzVar.N0();
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 v00Var = this.f190316b;
        ym5.q3 q3Var = v00Var.f192390r;
        if (q3Var != null) {
            q3Var.d(i17, aVar, z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = v00Var.f192380e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar).j1(aVar, null, z17, false);
        if (!v00Var.o()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190317c;
            if (i17 != 2) {
                c1163xf1deaba4.m7964x8d4ad49c(new uw2.n0());
            } else {
                c1163xf1deaba4.m7964x8d4ad49c(null);
            }
        }
        so2.j5 W0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar).W0();
        in5.s0 s0Var = (in5.s0) in5.n0.Y(this.f190318d, W0 != null ? W0.mo2128x1ed62e84() : 0L, false, 2, null);
        int m61474x2d827763 = (s0Var == null || (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k)) == null) ? 0 : c15196x85976f5f.m61474x2d827763();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = v00Var.f192379d;
        int i18 = this.f190319e;
        if (i17 != 1) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3.f206511a;
                boolean z18 = aVar != null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                if (z18) {
                    c3Var.a(i18, V6, W0, m61474x2d827763);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2 c17 = c3Var.c(i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RefreshReporter", "tab_" + i18 + ",自动刷新（刷新次数：" + c17.f207019c + "）,预备上报信息=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3.f206513c);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y2 y2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3.f206513c;
                if (y2Var != null && c17.f207017a) {
                    r45.qt2 qt2Var = y2Var.f207000a;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, V6 != null ? V6.m75945x2fec8307(1) : null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RefreshReporter", "自动刷新命中双击点击刷新！");
                        c3Var.d(y2Var.f207000a, y2Var.f207001b, y2Var.f207002c, y2Var.f207003d, y2Var.f207004e);
                    }
                }
                c17.f207017a = false;
                c17.f207018b = null;
                c17.a(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3.f206513c = null;
                return;
            }
            return;
        }
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q0().r()).intValue() == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            if (nyVar2 != null) {
                i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18).aj(nyVar2.V6(), 3, 0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3 c3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3.f206511a;
        boolean z19 = aVar != null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V62 = nyVar3 != null ? nyVar3.V6() : null;
        if (z19) {
            c3Var2.a(i18, V62, W0, m61474x2d827763);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2 c19 = c3Var2.c(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RefreshReporter", "tab_" + i18 + ",下拉刷新（刷新次数：" + c19.f207019c + "）,playPercent=" + m61474x2d827763 + ',' + c3Var2.b(W0));
        if (c19.f207019c == 0) {
            c19.a(i18);
        }
        c3Var2.d(V62, W0, m61474x2d827763, c19.f207019c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a3.f206475e);
        c19.f207017a = false;
        c19.f207018b = null;
        c19.a(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3.f206513c = null;
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 v00Var = this.f190316b;
        ym5.q3 q3Var = v00Var.f192390r;
        if (q3Var != null) {
            q3Var.e(reason);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt btVar = v00Var.f192380e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar).m56537xb3ee2b3f(reason);
        if (v00Var.o()) {
            v00Var.f192389q = true;
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190317c;
            c1163xf1deaba4.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p00(c1163xf1deaba4, v00Var), 1000L);
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) btVar).f190295p == 1) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f190317c;
            ml2.x1 x1Var = ml2.x1.f409734e;
            ml2.q1 q1Var = ml2.q1.f409345e;
            zy2.zb.Kh(zbVar, c1163xf1deaba42, x1Var, "temp_9", ml2.y.f409775g, 0, 0L, 0, 112, null);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = v00Var.f192379d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.class);
        if (hsVar != null) {
            int i17 = this.f190319e;
            if (i17 == 1) {
                hsVar.f216194q = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "onRefreshEnd friend tab");
            } else if (i17 == 3) {
                hsVar.f216193p = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "onRefreshEnd follow tab");
            } else if (i17 == 4) {
                hsVar.f216195r = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "onRefreshEnd machine tab");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oq oqVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.f216183z;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.B.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.C.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.D.clear();
        }
    }
}
