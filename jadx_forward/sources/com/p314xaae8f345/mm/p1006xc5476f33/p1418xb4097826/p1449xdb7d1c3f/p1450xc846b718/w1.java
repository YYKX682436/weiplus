package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

@j95.b
/* loaded from: classes8.dex */
public final class w1 extends i95.w implements zy2.e9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f187476d;

    /* renamed from: e, reason: collision with root package name */
    public int f187477e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f187478f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("Finder.NewDiscoveryRedDotHandler");

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f187479g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.v1.f187449d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f187480h = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u1.f187416d);

    /* renamed from: i, reason: collision with root package name */
    public volatile int f187481i;

    /* renamed from: m, reason: collision with root package name */
    public long f187482m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.C13731x3da2ac42 f187483n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f187484o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f187485p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i1 f187486q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f187487r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f187488s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f187489t;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.extension.reddot.FinderNewDiscoveryRedDotService$chattingExitListener$1] */
    public w1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f187483n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5244x6e685763>(a0Var) { // from class: com.tencent.mm.plugin.finder.extension.reddot.FinderNewDiscoveryRedDotService$chattingExitListener$1
            {
                this.f39173x3fe91575 = 1160513907;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5244x6e685763 c5244x6e685763) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5244x6e685763 event = c5244x6e685763;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exit ChattingUI. ");
                am.h2 h2Var = event.f135576g;
                sb6.append(h2Var.f88340a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewDiscoveryRedDotHandler", sb6.toString());
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 l17 = c01.e2.l(h2Var.f88340a);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 w1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1.this;
                if (l17 == null) {
                    w1Var.f187477e = 999;
                    return false;
                }
                if (l17.m2()) {
                    w1Var.f187477e = 103;
                } else if (l17.k2()) {
                    w1Var.f187477e = 104;
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(h2Var.f88340a)) {
                    w1Var.f187477e = 102;
                } else if (l17.r2()) {
                    w1Var.f187477e = 101;
                }
                w1Var.Ri();
                return false;
            }
        };
        this.f187486q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i1.f187110d;
        this.f187487r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.m1(this));
        this.f187488s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.t1(this));
        this.f187489t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.n1(this));
    }

    public static final r45.xe0 Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 w1Var, com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var) {
        w1Var.getClass();
        r45.xe0 xe0Var = new r45.xe0();
        xe0Var.set(3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.String v17 = gm0.j1.u().c().v(u3Var, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        if (v17.length() > 0) {
            xe0Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17));
        }
        return xe0Var;
    }

    public static boolean hj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 w1Var, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = w1Var.f187481i;
        }
        w1Var.getClass();
        return i17 >= 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0451 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0475  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1 wi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 r32, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1 r33, r45.gl0 r34, java.lang.String r35, yz5.a r36) {
        /*
            Method dump skipped, instructions count: 1519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1.wi(com.tencent.mm.plugin.finder.extension.reddot.w1, com.tencent.mm.plugin.finder.extension.reddot.j1, r45.gl0, java.lang.String, yz5.a):com.tencent.mm.plugin.finder.extension.reddot.j1");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c4 A[LOOP:0: B:41:0x02bc->B:43:0x02c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bi(r45.ky2 r20, ya2.t1 r21) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1.Bi(r45.ky2, ya2.t1):void");
    }

    public final jz5.l Di(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i1.f187110d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[calRedDotInfo] isExpose:" + z17 + ';');
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = aj().L0("Discovery");
        if (L0 == null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("discovery is null(cache discovery id=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f187485p;
            sb7.append(jbVar != null ? jbVar.f65880x11c19d58 : null);
            sb7.append(",discoveryChildRedDotType=");
            sb7.append(this.f187486q);
            sb7.append(");");
            sb6.append(sb7.toString());
        }
        boolean z18 = L0 != null && L0.y0("FinderLiveEntrance");
        boolean z19 = L0 != null && L0.y0("FinderEntrance");
        boolean z27 = (L0 != null && L0.m55856xfb85f7b0() == 35) && z19;
        if (z17) {
            if (z18) {
                r45.xe0 Zi = Zi();
                Zi.set(0, java.lang.Integer.valueOf(Zi.m75939xb282bd08(0) + 1));
                nj(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_DISCOVERY_REDDOT_INFO_STRING, Zi());
            }
            if (z27) {
                r45.xe0 Vi = Vi();
                Vi.set(0, java.lang.Integer.valueOf(Vi.m75939xb282bd08(0) + 1));
                nj(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SOCIAL_HOT_SPOT_DISCOVERY_REDDOT_INFO_STRING, Vi());
            } else if (z19) {
                r45.xe0 Ui = Ui();
                Ui.set(0, java.lang.Integer.valueOf(Ui.m75939xb282bd08(0) + 1));
                nj(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_DISCOVERY_REDDOT_INFO_STRING, Ui());
            }
        } else {
            if (z18) {
                r45.xe0 Zi2 = Zi();
                Zi2.set(1, java.lang.Integer.valueOf(Zi2.m75939xb282bd08(1) + 1));
                nj(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_DISCOVERY_REDDOT_INFO_STRING, Zi());
            }
            if (z27) {
                r45.xe0 Vi2 = Vi();
                Vi2.set(1, java.lang.Integer.valueOf(Vi2.m75939xb282bd08(1) + 1));
                nj(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SOCIAL_HOT_SPOT_DISCOVERY_REDDOT_INFO_STRING, Vi());
            } else if (z19) {
                r45.xe0 Ui2 = Ui();
                Ui2.set(1, java.lang.Integer.valueOf(Ui2.m75939xb282bd08(1) + 1));
                nj(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_DISCOVERY_REDDOT_INFO_STRING, Ui());
            }
        }
        if (z18) {
            i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i1.f187112f;
            sb6.append("liveRedDotInfo=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x1.a(Zi()));
        } else if (z27) {
            i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i1.f187111e;
            sb6.append("finderSocialHotSpotRedDotInfo=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x1.a(Vi()));
        } else if (z19) {
            i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i1.f187113g;
            sb6.append("finderRedDotInfo=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x1.a(Ui()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewDiscoveryRedDotHandler", sb6.toString());
        return new jz5.l(L0, i1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ni(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1.Ni(java.lang.String):boolean");
    }

    public final void Ri() {
        boolean Ni = Ni("discoveryExpose");
        Di(true);
        int i17 = this.f187481i;
        i95.m c17 = i95.n0.c(zy2.t6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        this.f187481i = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78442x336b58a0() != 2 ? 0 : 1;
        r45.gl0 bj6 = bj();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f187478f;
        n3Var.mo50302x6b17ad39(null);
        n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l1(this, Ni, "discoveryExpose", bj6, i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewDiscoveryRedDotHandler", "[discoveryExpose] tempScene=" + i17 + ", finderSyncUserScene=" + this.f187481i);
    }

    public final r45.xe0 Ui() {
        return (r45.xe0) ((jz5.n) this.f187487r).mo141623x754a37bb();
    }

    public final r45.xe0 Vi() {
        return (r45.xe0) ((jz5.n) this.f187489t).mo141623x754a37bb();
    }

    public final r45.xe0 Zi() {
        return (r45.xe0) ((jz5.n) this.f187488s).mo141623x754a37bb();
    }

    public final zy2.fa aj() {
        return (zy2.fa) ((jz5.n) this.f187479g).mo141623x754a37bb();
    }

    public final r45.gl0 bj() {
        r45.gl0 gl0Var = new r45.gl0();
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_DISCOVERY_TAB_EXPOSE_CONFIG_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        if (v17.length() > 0) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(gl0Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17)));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewDiscoveryRedDotHandler", "trigger_scenes=" + gl0Var.m75941xfb821914(10) + "\nenable_ctrl_type=" + gl0Var.m75941xfb821914(11) + "\nchat_limit=" + gl0Var.m75933x41a8a7f2(12) + "\nrefresh_interval=" + gl0Var.m75939xb282bd08(13) + "\nreddot_quota=" + gl0Var.m75939xb282bd08(14) + "\nrate_limit_strategy=" + gl0Var.m75942xfb822ef2(15) + "\ndau_limit=" + gl0Var.m75933x41a8a7f2(17) + "\nreddot_quota=" + gl0Var.m75939xb282bd08(18) + "\nlive_rate_limit_strategy=" + gl0Var.m75939xb282bd08(19) + "\nlive_reddot_refresh_interval=" + gl0Var.m75939xb282bd08(20) + "\ndiscovery_tab_expose_continue_on_empty_quota=" + gl0Var.m75933x41a8a7f2(26));
        return gl0Var;
    }

    public final r45.gl0 cj() {
        r45.gl0 gl0Var = new r45.gl0();
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_DISCOVERY_TAB_EXPOSE_SOCIAL_HOT_SPOT_CONFIG_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        if (v17.length() > 0) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(gl0Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17)));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewDiscoveryRedDotHandler", "[social hot spot]trigger_scenes=" + gl0Var.m75941xfb821914(10) + "\nenable_ctrl_type=" + gl0Var.m75941xfb821914(11) + "\nchat_limit=" + gl0Var.m75933x41a8a7f2(12) + "\nrefresh_interval=" + gl0Var.m75939xb282bd08(13) + "\nreddot_quota=" + gl0Var.m75939xb282bd08(14) + "\nrate_limit_strategy=" + gl0Var.m75942xfb822ef2(15) + "\ndau_limit=" + gl0Var.m75933x41a8a7f2(17) + "\nreddot_quota=" + gl0Var.m75939xb282bd08(18) + "\ndiscovery_tab_expose_fetch_social_hot_spot_begin_hour=" + gl0Var.m75939xb282bd08(24) + "\ndiscovery_tab_expose_revoke_hour_interval=" + gl0Var.m75939xb282bd08(23) + '\n');
        return gl0Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1 fj() {
        if (aj().L0("Discovery") != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1(-6, "当前底部已经有透传红点");
        }
        boolean z17 = false;
        if (hj(this, 0, 1, null)) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1(-5, "当前在发现页");
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1(-1, "青少年模式");
        }
        r45.ls2 ls2Var = (r45.ls2) g92.b.f351302e.k2().d().m75936x14adae67(26);
        if (ls2Var != null && ls2Var.m75939xb282bd08(0) == 1) {
            z17 = true;
        }
        return z17 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1(-3, "us帐号") : mj() ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1(-4, "朋友圈有红点") : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j1(1, "");
    }

    public final boolean ij(long j17) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j17);
        int i17 = calendar.get(1);
        int i18 = calendar.get(2);
        int i19 = calendar.get(5);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        int i27 = calendar2.get(1);
        int i28 = calendar2.get(2);
        int i29 = calendar2.get(5);
        if (i17 < i27) {
            return true;
        }
        if (i17 != i27 || i18 >= i28) {
            return i17 == i27 && i18 == i28 && i19 < i29;
        }
        return true;
    }

    public boolean mj() {
        boolean Di = ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).Di();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1) p94.w0.a()).f() > 0) {
            return true;
        }
        java.lang.String u17 = gm0.j1.u().c().u(68377, "");
        boolean n17 = gm0.j1.u().c().n(589825, false);
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_MEDIA_COLLAPSE_SNS_ID_LONG, 0L);
        boolean wi6 = ((n34.v4) ((p94.s0) i95.n0.c(p94.s0.class))).wi(t17);
        if (Di) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
            if ((u17.length() > 0) || n17) {
                return true;
            }
            if (t17 != 0 && wi6) {
                return true;
            }
        }
        return false;
    }

    public final void nj(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, r45.xe0 xe0Var) {
        gm0.j1.u().c().x(u3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(xe0Var.mo14344x5f01b1f6()));
    }
}
