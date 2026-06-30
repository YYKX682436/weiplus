package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class w1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.m9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f204015d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f204016e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f204017f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f204018g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f204016e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.v1(this));
        this.f204017f = m158354x19263085().getIntent().getBooleanExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
        this.f204018g = kz5.c0.i(39, 1, 8, 32, 33, 172);
    }

    public final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 contract, in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7() && this.f204017f) {
            this.f204017f = false;
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = contract instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) contract : null;
            a4Var.W6(pzVar != null ? pzVar.f190289h : null, item, holder, P6());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = item.getFeedObject();
            int m8183xf806b362 = holder.m8183xf806b362();
            int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i18 = b17.x;
            int i19 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z17) {
                i17 = i19 - c17;
            } else {
                if (i19 >= i18) {
                    i18 = i19;
                }
                i17 = i18 - c17;
            }
            T6(feedObject, 1, m8183xf806b362, (int) (i17 * kx2.a.f394811a.a(context)), null);
            m158354x19263085().getIntent().putExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class)).U6(m158354x19263085().getIntent().getExtras());
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 P6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69) this.f204016e.mo141623x754a37bb();
    }

    public final java.util.Map Q6(long j17, r45.vx0 vx0Var, int i17) {
        if (vx0Var != null) {
            return kz5.c1.k(new jz5.l("collection_id", pm0.v.u(vx0Var.m75942xfb822ef2(0))), new jz5.l("feed_location_id", java.lang.Integer.valueOf(i17)), new jz5.l("feed_id", pm0.v.u(j17)));
        }
        return null;
    }

    public final void R6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        r45.vx0 vx0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.dm2 m76806xdef68064 = item.getFeedObject().getFeedObject().m76806xdef68064();
        java.lang.String str = null;
        if ((m76806xdef68064 != null ? (r45.vx0) m76806xdef68064.m75936x14adae67(0) : null) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFeedFocused hit collection jumper expt, collectionName=");
            r45.dm2 m76806xdef680642 = item.getFeedObject().getFeedObject().m76806xdef68064();
            if (m76806xdef680642 != null && (vx0Var = (r45.vx0) m76806xdef680642.m75936x14adae67(0)) != null) {
                str = vx0Var.m75945x2fec8307(1);
            }
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPlayListDrawerUIC", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Cd).mo141623x754a37bb()).l();
        }
    }

    public final void S6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.d2 initParam, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initParam, "initParam");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 P6 = P6();
        if (P6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, P6, "choose_collection_half_view", 0, 0, Q6(initParam.f203814a, initParam.f203818e, i18), null, 44, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 P62 = P6();
        if (P62 != null) {
            P62.w(initParam, i17, i18, i19);
        }
    }

    public final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObj, int i17, int i18, int i19, r45.vx0 vx0Var) {
        r45.vx0 vx0Var2;
        r45.vx0 vx0Var3;
        java.lang.String concat;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1 w1Var;
        r45.vx0 vx0Var4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObj, "feedObj");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 P6 = P6();
        if (P6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
            long m59251x5db1b11 = feedObj.m59251x5db1b11();
            if (vx0Var == null) {
                r45.dm2 m76806xdef68064 = feedObj.getFeedObject().m76806xdef68064();
                if (m76806xdef68064 != null) {
                    vx0Var4 = (r45.vx0) m76806xdef68064.m75936x14adae67(0);
                    w1Var = this;
                } else {
                    w1Var = this;
                    vx0Var4 = null;
                }
            } else {
                w1Var = this;
                vx0Var4 = vx0Var;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, P6, "choose_collection_half_view", 0, 0, w1Var.Q6(m59251x5db1b11, vx0Var4, i18), null, 44, null);
        }
        if (vx0Var == null) {
            r45.dm2 m76806xdef680642 = feedObj.getFeedObject().m76806xdef68064();
            vx0Var2 = m76806xdef680642 != null ? (r45.vx0) m76806xdef680642.m75936x14adae67(0) : null;
        } else {
            vx0Var2 = vx0Var;
        }
        if (vx0Var2 != null) {
            java.lang.String m75945x2fec8307 = vx0Var2.m75945x2fec8307(3);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(feedObj.m59264x7efe73ec());
                java.lang.String str = "";
                if (mb4Var != null) {
                    java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(16);
                    if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                        java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(1);
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (m75945x2fec83073 == null) {
                            m75945x2fec83073 = "";
                        }
                        java.lang.String m75945x2fec83074 = mb4Var.m75945x2fec8307(19);
                        if (m75945x2fec83074 == null) {
                            m75945x2fec83074 = "";
                        }
                        concat = m75945x2fec83073.concat(m75945x2fec83074);
                    } else {
                        java.lang.String m75945x2fec83075 = mb4Var.m75945x2fec8307(16);
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (m75945x2fec83075 == null) {
                            m75945x2fec83075 = "";
                        }
                        java.lang.String m75945x2fec83076 = mb4Var.m75945x2fec8307(20);
                        if (m75945x2fec83076 == null) {
                            m75945x2fec83076 = "";
                        }
                        concat = m75945x2fec83075.concat(m75945x2fec83076);
                    }
                    if (concat != null) {
                        str = concat;
                    }
                }
                vx0Var2.set(3, str);
            }
            vx0Var3 = vx0Var2;
        } else {
            vx0Var3 = null;
        }
        if (vx0Var3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderPlayListDrawerUIC", "%s no collectionInfo", pm0.v.u(feedObj.m59251x5db1b11()));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 P62 = P6();
        if (P62 != null) {
            P62.w(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.d2(feedObj.m59251x5db1b11(), feedObj.m59229xb5af1dd5(), feedObj.m59276x6c285d75(), p3321xbce91901.jvm.p3324x21ffc6bd.o.b(feedObj.m59299x6bf53a6c(), xy2.c.e(m80379x76847179())), vx0Var3, hc2.q.a(feedObj.getFeedObject()), feedObj.m59299x6bf53a6c(), null, 128, null), i17, i18, i19);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 U6() {
        if (this.f204015d) {
            return P6();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 U6 = U6();
        if (!(U6 != null && U6.q())) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 U62 = U6();
        if (U62 != null) {
            U62.u();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 U6 = U6();
        if (U6 != null) {
            U6.b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        U6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f204016e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.v1(this));
        this.f204017f = m158354x19263085().getIntent().getBooleanExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
        this.f204018g = kz5.c0.i(39, 1, 8, 32, 33, 172);
    }
}
