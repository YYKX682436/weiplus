package vd2;

/* loaded from: classes3.dex */
public final class f4 implements gc2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6 f517264b;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6 c14343x44b0b6f6) {
        this.f517263a = c14167x40aca97c;
        this.f517264b = c14343x44b0b6f6;
    }

    @Override // gc2.c
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517263a;
        if (c14167x40aca97c.L) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "selectItemView onPageSelected position:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206788a, false, c14167x40aca97c.E, 1, null);
        mn0.i0.H.b("LiveOnPageSelected", android.os.SystemClock.elapsedRealtime());
        c14167x40aca97c.G = false;
        c14167x40aca97c.E = false;
    }

    @Override // gc2.c
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        km2.m E;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517263a;
        if (c14167x40aca97c.L) {
            return;
        }
        if (c14167x40aca97c.f193017f.isFinishing() || c14167x40aca97c.f193031w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "onPageScrollStateChanged return with activity finish");
            pm0.z.b(xy2.b.f539688b, "onPageScrollStateChangedWhenActivityFinish", false, null, null, false, false, null, 124, null);
            return;
        }
        if (i17 == 1) {
            c14167x40aca97c.f193014J = true;
            ae2.in inVar = ae2.in.f85221a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85470z4).mo141623x754a37bb()).r()).intValue() == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206795h = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d;
                if (p1Var != null) {
                    p1Var.f206769g = android.os.SystemClock.elapsedRealtime();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 2L;
            }
        }
        if (i17 == 0) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85470z4).mo141623x754a37bb()).r()).intValue() == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 c14329x76e637f1 = c14167x40aca97c.f193026r;
                int w17 = c14329x76e637f1 != null ? c14329x76e637f1.w() : -1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 c14329x76e637f12 = c14167x40aca97c.f193026r;
                int y17 = c14329x76e637f12 != null ? c14329x76e637f12.y() : -1;
                if (c14167x40aca97c.G) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "firstVisiblePos:" + w17 + " lastVisiblePos:" + y17 + " lastPlayPos: " + c14167x40aca97c.F);
                    if (w17 == y17 && w17 != (i18 = c14167x40aca97c.F)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.s(c14167x40aca97c, i18);
                    }
                }
                if (w17 == y17) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c14167x40aca97c.f193025q.mo7946xf939df19();
                    if ((mo7946xf939df19 instanceof vd2.s1) && (E = ((vd2.s1) mo7946xf939df19).E(w17)) != null) {
                        co0.a aVar = co0.b.f125242e2;
                        long j17 = E.f390662d.f150070e;
                        java.util.Set<java.util.Map.Entry> entrySet = co0.b.f125243f2.entrySet();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
                        int i19 = 0;
                        for (java.util.Map.Entry entry : entrySet) {
                            if (((co0.b) entry.getValue()).R1.h()) {
                                i19++;
                                java.lang.Long l17 = (java.lang.Long) entry.getKey();
                                if (l17 == null || l17.longValue() != j17) {
                                    ((co0.b) entry.getValue()).T0(false);
                                }
                            }
                        }
                        if (i19 > 1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "playingCount more thran one playingCount:" + i19 + " liveId:" + E.f390662d.f150070e);
                            pm0.z.b(xy2.b.f539688b, "LivePlayingCountMoreThanOne", false, null, null, false, false, new vd2.r4(i19, E), 60, null);
                        }
                    }
                }
            }
        }
    }

    @Override // gc2.c
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, float f17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517263a;
        if (c14167x40aca97c.L) {
            return;
        }
        if (c14167x40aca97c.f193017f.isFinishing() || c14167x40aca97c.f193031w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "ViewCallback onPageScrolled return with activity finish");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 c14329x76e637f1 = c14167x40aca97c.f193026r;
        if (c14329x76e637f1 != null) {
            int w17 = c14329x76e637f1.w();
            int y17 = c14329x76e637f1.y();
            zl2.r4 r4Var = zl2.r4.f555483a;
            boolean z17 = true;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85470z4).mo141623x754a37bb()).r()).intValue() == 1) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.N != 0 && !c14167x40aca97c.f193014J) {
                    z17 = false;
                }
                if (z17) {
                    if (w17 != y17) {
                        int i19 = c14167x40aca97c.H;
                        if (w17 < i19) {
                            int i27 = c14167x40aca97c.I;
                            if (y17 < i27) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.s(c14167x40aca97c, i27);
                            }
                            c14167x40aca97c.F = w17;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.l(c14167x40aca97c, w17);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.o(c14167x40aca97c, c14167x40aca97c.F);
                        } else if (y17 > c14167x40aca97c.I) {
                            if (w17 > i19) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.s(c14167x40aca97c, i19);
                            }
                            c14167x40aca97c.F = y17;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.l(c14167x40aca97c, y17);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.o(c14167x40aca97c, c14167x40aca97c.F);
                        }
                    } else if (c14167x40aca97c.H == -1 && w17 == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.o(c14167x40aca97c, 0);
                    }
                }
            }
            if (w17 != y17 && (w17 < c14167x40aca97c.H || y17 > c14167x40aca97c.I)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "notifyNewItemScroll firstVisiblePos:" + w17 + ",lastVisiblePos:" + y17);
                android.content.Context context = c14167x40aca97c.f193016e.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (!((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f) {
                    float dimensionPixelOffset = this.f517264b.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 c14329x76e637f12 = c14167x40aca97c.f193026r;
                    android.view.View mo7935xa188593e = c14329x76e637f12 != null ? c14329x76e637f12.mo7935xa188593e(w17) : null;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = mo7935xa188593e instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) mo7935xa188593e : null;
                    if (c22645x24069159 != null) {
                        c22645x24069159.c(0.0f, 0.0f, dimensionPixelOffset, dimensionPixelOffset);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 c14329x76e637f13 = c14167x40aca97c.f193026r;
                    android.view.KeyEvent.Callback mo7935xa188593e2 = c14329x76e637f13 != null ? c14329x76e637f13.mo7935xa188593e(y17) : null;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x240691592 = mo7935xa188593e2 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) mo7935xa188593e2 : null;
                    if (c22645x240691592 != null) {
                        c22645x240691592.c(dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f);
                    }
                }
            }
            c14167x40aca97c.H = w17;
            c14167x40aca97c.I = y17;
        }
    }
}
