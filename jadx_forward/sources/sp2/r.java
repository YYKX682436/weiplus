package sp2;

/* loaded from: classes2.dex */
public final class r extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public sp2.o2 f492725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c6i;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2275x62f76871(android.content.Intent r29) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.r.mo2275x62f76871(android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        sp2.o2 o2Var = this.f492725d;
        if (o2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
            throw null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onConfigurationChanged orientation: ");
        sb6.append(newConfig.orientation);
        sb6.append(" rv: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = o2Var.f492672j;
        if (c14595xffb7e034 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        sb6.append(c14595xffb7e034.getWidth());
        sb6.append(" ui: ");
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i18 = a17.f278668a;
        if (!z17 && i18 > (i17 = a17.f278669b)) {
            i18 = i17;
        }
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e0342 = o2Var.f492672j;
        if (c14595xffb7e0342 != null) {
            c14595xffb7e0342.post(new sp2.q1(newConfig, o2Var));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b5, code lost:
    
        if (r13 > (r3 + sp2.b.f492509e)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b7, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01b9, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x01e7, code lost:
    
        if (r4 > (((sp2.a) r10).f492491e + sp2.b.f492509e)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0b87  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0cb0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0845 A[LOOP:2: B:289:0x0819->B:297:0x0845, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x084e A[EDGE_INSN: B:298:0x084e->B:299:0x084e BREAK  A[LOOP:2: B:289:0x0819->B:297:0x0845], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02aa  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r58) {
        /*
            Method dump skipped, instructions count: 3317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.r.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabUIC", "onDestroy() tab:null");
        sp2.o2 o2Var = this.f492725d;
        if (o2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "onDestroy: ");
        o2Var.f492677l0.mo48814x2efc64();
        o2Var.f492671i0.mo48814x2efc64();
        o2Var.f492669h0.mo48814x2efc64();
        o2Var.Z.mo48814x2efc64();
        o2Var.f492679m0.mo48814x2efc64();
        o2Var.f492681n0.mo48814x2efc64();
        java.util.ArrayList arrayList = (java.util.ArrayList) o2Var.f492680n;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Runnable runnable = (java.lang.Runnable) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = o2Var.f492672j;
            if (c14595xffb7e034 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c14595xffb7e034.removeCallbacks(runnable);
        }
        arrayList.clear();
        p3325xe03a0797.p3326xc267989b.z0.e(o2Var.f492662e, null, 1, null);
        p3325xe03a0797.p3326xc267989b.z0.e(o2Var.f492664f, null, 1, null);
        android.content.Intent intent = o2Var.f492654a.getIntent();
        boolean z17 = (intent != null ? (android.content.Intent) intent.getParcelableExtra("KEY_ENTER_LIVE_PARAM_INTENT_DATA") : null) != null;
        java.lang.String cacheBusinessKey = o2Var.V;
        if (!(z17 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cacheBusinessKey, "closeGuidePreload") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cacheBusinessKey, "liveEndPage"))) {
            sp2.b bVar = sp2.b.f492505a;
            r45.dk2 dk2Var = o2Var.A;
            r45.bk2 bk2Var = dk2Var != null ? (r45.bk2) dk2Var.m75936x14adae67(16) : null;
            if (zl2.q4.f555466a.E()) {
                ae2.b2 b2Var = ae2.b2.f84994a;
                jz5.g gVar = ae2.b2.f85006g;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() != -1 && bk2Var != null) {
                    bk2Var.set(2, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue()));
                }
                jz5.g gVar2 = ae2.b2.f85007h;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue() != -1 && bk2Var != null) {
                    bk2Var.set(3, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue()));
                }
                jz5.g gVar3 = ae2.b2.f85008i;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue() != -1 && bk2Var != null) {
                    bk2Var.set(4, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue()));
                }
                jz5.g gVar4 = ae2.b2.f85009j;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue() != -1 && bk2Var != null) {
                    bk2Var.set(5, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue()));
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateExitEntranceDataInterval client_max_cache_time: ");
            sb6.append(bk2Var != null ? java.lang.Integer.valueOf(bk2Var.m75939xb282bd08(2)) : null);
            sb6.append(" client_samll_refresh_max_time: ");
            sb6.append(bk2Var != null ? java.lang.Integer.valueOf(bk2Var.m75939xb282bd08(3)) : null);
            sb6.append(" reddot_to_square_client_samll_refresh_max_time: ");
            sb6.append(bk2Var != null ? java.lang.Integer.valueOf(bk2Var.m75939xb282bd08(4)) : null);
            sb6.append(" reddot_to_live_client_samll_refresh_max_time: ");
            sb6.append(bk2Var != null ? java.lang.Integer.valueOf(bk2Var.m75939xb282bd08(5)) : null);
            sb6.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CacheUtils", sb6.toString());
            if (bk2Var != null) {
                sp2.b.f492509e = bk2Var.m75939xb282bd08(2) > 0 ? bk2Var.m75939xb282bd08(2) * 1000 : ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P1().r()).intValue();
            }
            o2Var.H(o2Var.t());
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o2Var.t(), "7312+0+messageNotify+0") && r26.n0.D(o2Var.t(), "7312+0+messageNotify+0", false, 2, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "onDestroy: duplicate update message notify cache, preloadKey=" + o2Var.t());
                o2Var.H("7312+0+messageNotify+0");
            }
        }
        sp2.d3 d3Var = o2Var.D;
        if (d3Var != null) {
            p3325xe03a0797.p3326xc267989b.f1 f1Var = d3Var.f492546g;
            if (f1Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(f1Var, null, 1, null);
            }
            d3Var.f492546g = null;
            az2.f fVar = d3Var.f492548i;
            if (fVar != null) {
                fVar.b();
            }
            d3Var.f492548i = null;
            if (d3Var.f492547h != null) {
                d3Var.b(null);
            }
            d3Var.f492549j = false;
        }
        gp2.l0 l0Var = o2Var.f492695x;
        if (l0Var != null) {
            l0Var.o();
        }
        o2Var.I = null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheBusinessKey, "cacheBusinessKey");
        by1.d a17 = by1.c.f117886b.a().a("7312+0+" + cacheBusinessKey + "+0");
        aq2.k kVar = a17 instanceof aq2.k ? (aq2.k) a17 : null;
        if (kVar != null) {
            kVar.g();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        java.lang.String str;
        super.mo2281xb01dfb57();
        sp2.o2 o2Var = this.f492725d;
        if (o2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
            throw null;
        }
        gp2.l0 l0Var = o2Var.f492695x;
        if (l0Var != null) {
            l0Var.m();
        }
        gp2.l0 l0Var2 = o2Var.f492695x;
        if (l0Var2 != null) {
            c50.m0.c(l0Var2, null, 1, null);
        }
        sp2.z3.f492834b = null;
        o2Var.I = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).cj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "recordCurNoticeStatus lastNoticeSnapshot:" + o2Var.I);
        zy2.d8 d8Var = (zy2.d8) i95.n0.c(zy2.d8.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o2Var.f492654a;
        int hashCode = abstractActivityC21394xb3d2c0cf.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) abstractActivityC21394xb3d2c0cf : null;
        if (abstractActivityC15087xee12defa == null || (str = java.lang.Integer.valueOf(abstractActivityC15087xee12defa.getD()).toString()) == null) {
            str = "";
        }
        ((b92.d2) d8Var).Ai(hashCode, "LiveSquare", str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        java.lang.String str;
        up2.h hVar;
        sp2.o2 o2Var = this.f492725d;
        if (o2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
            throw null;
        }
        gp2.l0 l0Var = o2Var.f492695x;
        if (l0Var != null) {
            l0Var.g();
        }
        java.lang.String str2 = o2Var.I;
        if (str2 != null) {
            java.lang.String cj6 = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).cj();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, cj6) && (hVar = o2Var.f492684p) != null) {
                hVar.m8146xced61ae5();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "checkNoticeStatus lastNoticeSnapshot:" + str2 + " newSnapshot:" + cj6);
        }
        i95.m c17 = i95.n0.c(zy2.d8.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.d8 d8Var = (zy2.d8) c17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o2Var.f492654a;
        int hashCode = abstractActivityC21394xb3d2c0cf.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) abstractActivityC21394xb3d2c0cf : null;
        if (abstractActivityC15087xee12defa == null || (str = java.lang.Integer.valueOf(abstractActivityC15087xee12defa.getD()).toString()) == null) {
            str = "";
        }
        android.view.Window window = abstractActivityC21394xb3d2c0cf.getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
        ((b92.d2) d8Var).wi(hashCode, "LiveSquare", str, abstractActivityC21394xb3d2c0cf, window, 0L, 0L);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        if (this.f492725d != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        if (this.f492725d != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
        throw null;
    }
}
