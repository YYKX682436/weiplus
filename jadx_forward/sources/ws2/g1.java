package ws2;

/* loaded from: classes3.dex */
public final class g1 implements cw2.fb {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f530573d;

    public g1(ws2.k1 k1Var) {
        this.f530573d = k1Var;
    }

    @Override // cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
        ws2.k1 k1Var = this.f530573d;
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        int i17 = jVar != null ? jVar.f303806q : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "onFirstFrameUpdate,prepareCostTime:" + j17 + ",cur offsetL" + i17 + ',' + k1Var.i());
        dt2.b0 b0Var = k1Var.f530606e;
        if (b0Var != null) {
            b0Var.h();
        }
        ws2.k1.c(k1Var, i17);
        java.util.Iterator it = k1Var.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).D(mb4Var, j17);
        }
    }

    @Override // cw2.fb
    public void F(r45.mb4 mb4Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReplay,");
        ws2.u0 u0Var = ws2.k1.f530599r;
        ws2.k1 k1Var = this.f530573d;
        sb6.append(k1Var.i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        java.util.Iterator it = k1Var.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).F(mb4Var);
        }
    }

    @Override // cw2.fb
    public void G(r45.mb4 mb4Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBgPrepared,");
        ws2.u0 u0Var = ws2.k1.f530599r;
        ws2.k1 k1Var = this.f530573d;
        sb6.append(k1Var.i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        java.util.Iterator it = k1Var.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).G(mb4Var);
        }
    }

    @Override // cw2.fb
    public void J(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
        java.util.Iterator it = this.f530573d.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).J(mb4Var, waVar, i17);
        }
    }

    @Override // cw2.fb
    public void b(float f17) {
        java.util.Iterator it = this.f530573d.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).b(f17);
        }
    }

    @Override // cw2.fb
    public void d(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
        java.util.Iterator it = this.f530573d.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).d(mb4Var, waVar, i17);
        }
    }

    @Override // cw2.fb
    public void e(r45.mb4 mb4Var, int i17, int i18, nk4.r rVar) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        ws2.k1 k1Var = this.f530573d;
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        if (jVar != null) {
            jVar.Z6(i17);
            if (i18 > 0) {
                if (i18 != jVar.f303807r) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "play total:" + i18);
                }
                jVar.f303807r = i18;
            }
            java.lang.Object obj = null;
            if ((jVar.f303808s && jVar.f303809t <= 0 && i18 > 0) || ((ct2.j) jVar.m147920xbba4bfc0(ct2.j.class)).f303813x) {
                jVar.a7(i18, null);
            }
            dt2.b0 b0Var = k1Var.f530606e;
            if (b0Var != null) {
                b0Var.e(jVar.f303806q, jVar.f303807r);
            }
            ws2.b bVar = k1Var.f530617p;
            if (bVar != null) {
                int i19 = jVar.f303806q;
                ct2.d dVar = (ct2.d) bVar.a(ct2.d.class);
                if (dVar != null) {
                    int i27 = i19 + dVar.f303783q;
                    dVar.R6(i27, false);
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = dVar.f303779m;
                    if (copyOnWriteArrayList.isEmpty()) {
                        zs2.d dVar2 = dVar.f303778i;
                        if (dVar2 != null) {
                            ((ws2.d) dVar2).a(null);
                        }
                    } else {
                        try {
                            java.util.Iterator it = copyOnWriteArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                java.lang.Object next = it.next();
                                if (((r45.b53) next).m75939xb282bd08(0) == i27) {
                                    obj = next;
                                    break;
                                }
                            }
                            r45.b53 b53Var = (r45.b53) obj;
                            if (b53Var != null) {
                                r45.r71 r71Var = (r45.r71) b53Var.m75936x14adae67(1);
                                if (r71Var != null && (m75941xfb8219142 = r71Var.m75941xfb821914(2)) != null) {
                                    java.util.Iterator it6 = m75941xfb8219142.iterator();
                                    while (it6.hasNext()) {
                                        ((r45.t12) it6.next()).set(17, java.lang.Integer.valueOf(i27));
                                    }
                                }
                                r45.r71 r71Var2 = (r45.r71) b53Var.m75936x14adae67(1);
                                if (r71Var2 != null && (m75941xfb821914 = r71Var2.m75941xfb821914(14)) != null) {
                                    java.util.Iterator it7 = m75941xfb821914.iterator();
                                    while (it7.hasNext()) {
                                        ((r45.ch1) it7.next()).set(17, java.lang.Integer.valueOf(i27));
                                    }
                                }
                                zs2.d dVar3 = dVar.f303778i;
                                if (dVar3 != null) {
                                    ((ws2.d) dVar3).a((r45.r71) b53Var.m75936x14adae67(1));
                                }
                                copyOnWriteArrayList.remove(b53Var);
                                dVar.P6("after updateMessage msg(" + cm2.a.f124861a.f(b53Var) + ')');
                            }
                        } catch (java.util.NoSuchElementException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveMsgOffsetSlice", "updateMessage err: " + e17.getMessage());
                        }
                    }
                }
            }
        }
        java.util.Iterator it8 = k1Var.f530612k.iterator();
        while (it8.hasNext()) {
            cw2.fb.w((xs2.c1) it8.next(), mb4Var, i17, i18, null, 8, null);
        }
    }

    @Override // cw2.fb
    public void g(r45.mb4 mb4Var, nk4.t tVar) {
        java.util.Iterator it = this.f530573d.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).g(mb4Var, tVar);
        }
    }

    @Override // cw2.fb
    public void h(r45.mb4 mb4Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        r45.nw1 m76794xd0557130;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252;
        r45.nw1 m76794xd05571302;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replay_step3-4:playVideo");
        cm2.a aVar = cm2.a.f124861a;
        ws2.k1 k1Var = this.f530573d;
        mm2.c1 c1Var = (mm2.c1) k1Var.e(mm2.c1.class);
        sb6.append(aVar.x(c1Var != null ? c1Var.f410379n : null, -1));
        sb6.append(",url:");
        mm2.c1 c1Var2 = (mm2.c1) k1Var.e(mm2.c1.class);
        sb6.append((c1Var2 == null || (c19792x256d27252 = c1Var2.f410379n) == null || (m76794xd05571302 = c19792x256d27252.m76794xd0557130()) == null) ? null : cm2.a.i(aVar, m76794xd05571302, "FinderLiveReplayService-onPlay", false, 2, null));
        sb6.append(" ,status:");
        mm2.c1 c1Var3 = (mm2.c1) k1Var.e(mm2.c1.class);
        sb6.append((c1Var3 == null || (c19792x256d2725 = c1Var3.f410379n) == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null) ? null : java.lang.Integer.valueOf(m76794xd0557130.m75939xb282bd08(31)));
        sb6.append(",offset:");
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        sb6.append(jVar != null ? java.lang.Integer.valueOf(jVar.f303806q) : null);
        sb6.append(',');
        sb6.append(k1Var.i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        java.util.Iterator it = k1Var.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).h(mb4Var);
        }
    }

    @Override // cw2.fb
    public void n(r45.mb4 mb4Var, nk4.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause,");
        ws2.u0 u0Var = ws2.k1.f530599r;
        ws2.k1 k1Var = this.f530573d;
        sb6.append(k1Var.i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        java.util.Iterator it = k1Var.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).n(mb4Var, aVar);
        }
    }

    @Override // cw2.fb
    public void s(cw2.wa waVar, nk4.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStopPlay,");
        ws2.u0 u0Var = ws2.k1.f530599r;
        ws2.k1 k1Var = this.f530573d;
        sb6.append(k1Var.i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        ws2.k1.b(k1Var, 2);
        java.util.Iterator it = k1Var.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).s(waVar, aVar);
        }
    }

    @Override // cw2.fb
    public void u(r45.mb4 mb4Var, long j17, kz2.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstVideoFrameRendered,");
        ws2.u0 u0Var = ws2.k1.f530599r;
        ws2.k1 k1Var = this.f530573d;
        sb6.append(k1Var.i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        if (jVar != null && (c14227x4262fb44 = jVar.f303800h) != null) {
            c14227x4262fb44.mo7808x76db6cb1(java.lang.Boolean.TRUE);
        }
        java.util.Iterator it = k1Var.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).u(mb4Var, j17, aVar);
        }
    }

    @Override // cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
        java.util.Iterator it = this.f530573d.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).v(mb4Var, j17, j18);
        }
    }

    @Override // cw2.fb
    public void x(r45.mb4 mb4Var, cw2.wa waVar, int i17, nk4.e eVar) {
        java.util.Iterator it = this.f530573d.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).x(mb4Var, waVar, i17, eVar);
        }
    }
}
