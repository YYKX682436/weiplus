package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd;

/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC */
/* loaded from: classes3.dex */
public class C14385xe1b728f3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f198532d;

    /* renamed from: e, reason: collision with root package name */
    public int f198533e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f198534f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f198535g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f198536h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f198537i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f198538m;

    /* renamed from: n, reason: collision with root package name */
    public vd2.v2 f198539n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f198540o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8 f198541p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f198542q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f198543r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f198544s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14386xc30318a6 f198545t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Runnable f198546u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f198547v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC$sliderBarExtranceExposeListener$1] */
    public C14385xe1b728f3(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f198544s = jz5.h.b(new im2.c7(this));
        final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        this.f198545t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5492x8f1b5f40>(m158354x19263085) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC$sliderBarExtranceExposeListener$1
            {
                this.f39173x3fe91575 = 1622392144;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5492x8f1b5f40 c5492x8f1b5f40) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5492x8f1b5f40 event = c5492x8f1b5f40;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                dk2.ef.f314905a.i0(event.f135825g.f89808a);
                return true;
            }
        };
    }

    public final void O6(java.lang.String str) {
        km2.t c17;
        gk2.e a17;
        km2.n nVar = dk2.ef.H;
        java.util.LinkedList linkedList = (nVar == null || (c17 = nVar.c()) == null || (a17 = c17.a()) == null) ? null : ((mm2.c1) a17.a(mm2.c1.class)).f410440w6;
        if (linkedList != null) {
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, str);
            qa4Var.set(1, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            linkedList.add(qa4Var);
        }
    }

    public final boolean P6() {
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "backAndDismissMiniWindow:  leaveByBack=" + this.f198537i + " swipeBack=" + this.f198543r + " backNeedMiniWindow=" + booleanExtra);
        return (this.f198537i || this.f198543r) && !booleanExtra;
    }

    public final ok2.a Q6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f198540o;
        if (c14167x40aca97c == null || (c14353xe7c1f419 = c14167x40aca97c.f193028t.f517587e) == null) {
            return null;
        }
        return c14353xe7c1f419.m57470xca28dc9f();
    }

    public final android.view.Window R6() {
        return (android.view.Window) ((jz5.n) this.f198544s).mo141623x754a37bb();
    }

    public final void S6(int i17, int i18) {
        java.util.Map l17 = kz5.c1.l(new jz5.l("live_share_type", java.lang.Integer.valueOf(i17)), new jz5.l("live_share_type_count", java.lang.Integer.valueOf(i18)));
        l17.putAll(um2.x5.f510553x1.a());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_room_share_event", null, l17, 25561);
    }

    public final void T6() {
        dk2.ef efVar = dk2.ef.f314905a;
        boolean z17 = false;
        if (!dk2.ef.f314917g) {
            gk2.e eVar = gk2.e.f354004n;
            if (eVar != null && ((mm2.f6) eVar.a(mm2.f6.class)).B) {
                z17 = true;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "tryHideFloatBallWhenEnterPage current shoppingInMiniProgram");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8.f197762v = m158365x9616526c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8 c8Var = this.f198541p;
        if (c8Var != null) {
            c8Var.p0();
        }
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.k0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "tryHideFloatBallWhenEnterPage hideFloatBall");
    }

    public final void U6() {
        gp1.v Bi;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(m158365x9616526c(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8.f197762v)) {
            ml2.m5.f409251a.e();
            return;
        }
        gk2.e eVar = gk2.e.f354004n;
        mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
        if (c1Var == null || c1Var.O1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8 c8Var = this.f198541p;
            if (c8Var != null) {
                c8Var.t0(false);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8 c8Var2 = this.f198541p;
            if (c8Var2 != null) {
                c8Var2.t0(true);
            }
            ml2.m5.f409251a.e();
        }
        dk2.ef efVar = dk2.ef.f314905a;
        if (dk2.ef.f314908b0 && (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) != null) {
            Bi.r0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "tryShowFloatBallWhenExitPage resumeFloatBall, gainFocus: " + dk2.ef.f314908b0);
    }

    public final void V6() {
        r45.nw1 nw1Var;
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "uninitBusiness");
        this.f198536h = true;
        jz5.f0 f0Var = null;
        if (P6()) {
            gk2.e eVar = gk2.e.f354004n;
            mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
            if (c1Var != null) {
                c1Var.O1 = false;
            }
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.e4 e4Var = ml2.e4.f408911g;
            r0Var.Qk(e4Var);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.Ck((ml2.r0) c17, m80379x76847179(), e4Var, null, false, null, 28, null);
            fo0.c cVar = fo0.c.f346331a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fo0.c.f346332b.f346340a).f174665d.f174583h = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f198540o;
        if (c14167x40aca97c != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onUninit " + c14167x40aca97c);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ViewManagerRelease:");
            vd2.z4 z4Var = c14167x40aca97c.f193028t;
            sb6.append(z4Var.f517587e);
            sb6.append(" it.isManualClosed: ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = z4Var.f517587e;
            sb6.append(c14353xe7c1f419 != null ? java.lang.Boolean.valueOf(c14353xe7c1f419.m57702x64ad3b1c()) : null);
            sb6.append(" liveId: ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f4192 = z4Var.f517587e;
            sb6.append((c14353xe7c1f4192 == null || (m57663xfb7e5820 = c14353xe7c1f4192.m57663xfb7e5820()) == null || (c10828x8f239b6e = m57663xfb7e5820.f390662d) == null) ? null : java.lang.Long.valueOf(c10828x8f239b6e.f150070e));
            sb6.append(" activityFinish: ");
            android.app.Activity activity = z4Var.f517583a;
            sb6.append(activity.isFinishing());
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = z4Var.f517585c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
            z4Var.f517586d = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f4193 = z4Var.f517587e;
            if (c14353xe7c1f4193 != null) {
                c14353xe7c1f4193.m57465xab8264f();
                c14353xe7c1f4193.mo46559xed5f7500();
                if (c14353xe7c1f4193.m57702x64ad3b1c()) {
                    co0.b.f125242e2.a();
                } else {
                    gk2.e eVar2 = dk2.ef.I;
                    long m75942xfb822ef2 = (eVar2 == null || (nw1Var = ((mm2.e1) eVar2.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "ViewManagerRelease curService bind liveId: " + m75942xfb822ef2);
                    co0.b.f125242e2.e(m75942xfb822ef2);
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null && activity.isFinishing()) {
                co0.b.f125242e2.a();
            }
        }
        ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).getClass();
        xg4.m.f535979a.b();
    }

    public final void W6() {
        boolean z17;
        kn0.p pVar;
        kn0.p pVar2;
        r45.nw1 nw1Var;
        if (this.f198547v) {
            return;
        }
        V6();
        this.f198547v = true;
        gk2.e eVar = gk2.e.f354004n;
        long m75942xfb822ef2 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
        gk2.e eVar2 = gk2.e.f354004n;
        boolean z18 = eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).f410444x2 : false;
        co0.b c17 = co0.b.f125242e2.c(m75942xfb822ef2);
        boolean f17 = (c17 == null || (pVar2 = c17.D) == null) ? false : pVar2.f();
        boolean k17 = (c17 == null || (pVar = c17.D) == null) ? false : pVar.k();
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(m80379x76847179()) && !f17 && !k17 && !z18) {
            java.util.Set<java.util.Map.Entry> entrySet = co0.b.f125243f2.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
            boolean z19 = false;
            for (java.util.Map.Entry entry : entrySet) {
                if (((co0.b) entry.getValue()).R1.h()) {
                    ((co0.b) entry.getValue()).T0(false);
                    ((co0.b) entry.getValue()).m0();
                    z19 = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPlayCore", "checkPlayerLeak " + z19);
            if (z19) {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onDestroy " + this + " playerLeakAssert:" + z17);
                pm0.z.b(xy2.b.f539688b, "liveCdnPlayerLeak", z17, null, null, false, false, new im2.u6(m75942xfb822ef2), 60, null);
            }
        }
        z17 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onDestroy " + this + " playerLeakAssert:" + z17);
        pm0.z.b(xy2.b.f539688b, "liveCdnPlayerLeak", z17, null, null, false, false, new im2.u6(m75942xfb822ef2), 60, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b1f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x013c, code lost:
    
        if ((r15 != null ? r15.m66744x2a55bdd7().mo162437xc00617a4() : false) == true) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2273x9d4787cb(int r13, int r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.mo2273x9d4787cb(int, int, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f198540o;
        if (c14167x40aca97c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = c14167x40aca97c.f193028t.f517587e;
            r2 = c14353xe7c1f419 != null ? c14353xe7c1f419.mo46549x4ceae47d() : false;
            if (!r2) {
                c14167x40aca97c.f193031w = true;
            }
        }
        if (!r2) {
            this.f198537i = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onBackPressed " + this + ", ret:" + r2 + ", leaveByBack:" + this.f198537i);
        return r2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        super.mo2275x62f76871(intent);
        if (this.f198534f) {
            V6();
        } else {
            this.f198546u = new im2.w6(this);
        }
        this.f198535g = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onConfigurationChanged orientation:" + newConfig.orientation);
        super.mo2276x50e1c15d(newConfig);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f198540o;
        if (c14167x40aca97c == null || (c14353xe7c1f419 = c14167x40aca97c.f193028t.f517587e) == null) {
            return;
        }
        c14353xe7c1f419.onConfigurationChanged(newConfig);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0745 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04d2  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r43) {
        /*
            Method dump skipped, instructions count: 1971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        O6("onDestroy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onDestroy " + this + ' ' + this.f198535g + ' ' + this.f198534f);
        if (!this.f198535g || !this.f198534f) {
            W6();
        }
        vd2.v2 v2Var = this.f198539n;
        if (v2Var != null) {
            v2Var.mo979x3f5eee52();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8 c8Var = this.f198541p;
        if (c8Var != null) {
            c8Var.o0();
        }
        ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).wi();
        dk2.ef.f314905a.i0(false);
        mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419;
        super.mo2280xc944513d(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f198540o;
        if (c14167x40aca97c == null || (c14353xe7c1f419 = c14167x40aca97c.f193028t.f517587e) == null) {
            return;
        }
        c14353xe7c1f419.m57724xc944513d(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onPause " + this + ", " + this.f198546u);
        super.mo2281xb01dfb57();
        O6("onPause");
        this.f198534f = true;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f198538m;
        if (f5Var != null) {
            f5Var.d();
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f198538m;
        if (f5Var2 != null) {
            f5Var2.f291933e = null;
        }
        this.f198538m = null;
        java.lang.Runnable runnable = this.f198546u;
        if (runnable != null) {
            runnable.run();
        }
        this.f198546u = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo2282x953457f1(i17, permissions, grantResults);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f198540o;
        if (c14167x40aca97c == null || (c14353xe7c1f419 = c14167x40aca97c.f193028t.f517587e) == null) {
            return;
        }
        c14353xe7c1f419.m57503x953457f1(i17, permissions, grantResults);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRestoreInstanceState */
    public void mo2283xb949e58d(android.os.Bundle bundle) {
        dk2.x4 x4Var;
        r45.nw1 nw1Var;
        super.mo2283xb949e58d(bundle);
        dk2.w4 w4Var = dk2.x4.C;
        boolean z17 = false;
        if (bundle == null) {
            x4Var = null;
        } else {
            java.lang.String string = bundle.getString("KEY_PARAMS_CONFIG_KEY");
            if (string == null) {
                string = "";
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderLiveBundle", "getFromBundle " + bundle.hashCode() + ", key:" + string, new java.lang.Object[0]);
            x4Var = (dk2.x4) dk2.x4.D.get(string);
        }
        dk2.x4 a17 = w4Var.a(m158359x1e885992());
        gk2.e eVar = gk2.e.f354004n;
        long m75942xfb822ef2 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle] onRestoreInstanceState " + this + " configProvider:" + a17 + " restoreConfigProvider:" + x4Var + " curLiveId:" + m75942xfb822ef2);
        if (a17 == null && m75942xfb822ef2 == 0 && x4Var != null) {
            com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d17 = x4Var.d();
            if (d17 != null && d17.f150070e == 0) {
                z17 = true;
            }
            if (z17) {
                return;
            }
            dk2.ef efVar = dk2.ef.f314905a;
            km2.n nVar = new km2.n();
            nVar.g(x4Var);
            efVar.g0(nVar);
            this.f198539n = new vd2.v2(m80379x76847179());
            android.view.View findViewById = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.fkh);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
            android.view.View findViewById2 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.evz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c(c22801x87cbdc00, findViewById2, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, m158358x197d1fc6(), this.f198539n, false, false, 64, null);
            vd2.v2 v2Var = this.f198539n;
            if (v2Var != null) {
                v2Var.m(c14167x40aca97c);
            }
            this.f198540o = c14167x40aca97c;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        android.view.View decorView;
        km2.t c17;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onResume " + this + ',');
        ml2.b1 b1Var = ml2.b1.f408744a;
        java.lang.String valueOf = java.lang.String.valueOf(m80379x76847179().hashCode());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b18 = b52.b.b();
        if (b18 == null) {
            b18 = "";
        }
        java.lang.String str = b18;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        jSONObject.put("liveid", pm0.v.u((nVar == null || (c17 = nVar.c()) == null || (b17 = c17.b()) == null) ? 0L : b17.f150070e));
        b1Var.b(new ml2.a1(valueOf, "65", "65", str, jSONObject));
        O6("onResume");
        android.app.Activity m80379x76847179 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type android.app.Activity");
        android.view.Window window = m80379x76847179.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new im2.b7(this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "initBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f198540o;
        if (c14167x40aca97c != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onInit " + c14167x40aca97c);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
        super.mo2285xa71a2260(bundle);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LiveLifecycle] onSaveInstanceState ");
        sb6.append(this);
        sb6.append(" curData:");
        gk2.e eVar = gk2.e.f354004n;
        sb6.append(eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", sb6.toString());
        gk2.e eVar2 = gk2.e.f354004n;
        if (eVar2 != null) {
            mm2.e1 e1Var = (mm2.e1) eVar2.a(mm2.e1.class);
            en0.g gVar = new en0.g();
            gVar.f336779a = 1;
            gVar.f336781c = e1Var.f410521r.m75942xfb822ef2(0);
            gVar.f336795q = e1Var.f410525v;
            gVar.f336789k = e1Var.f410516m;
            gVar.f336784f = ((mm2.c1) e1Var.m147920xbba4bfc0(mm2.c1.class)).f410385o;
            gVar.f336790l = ((mm2.c1) e1Var.m147920xbba4bfc0(mm2.c1.class)).V1;
            com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e a17 = gVar.a();
            a17.f150079p0 = e1Var.f410513g;
            dk2.x4 x4Var = new dk2.x4();
            x4Var.f315851l.add(a17);
            dk2.ef efVar = dk2.ef.f314905a;
            km2.n nVar = dk2.ef.H;
            x4Var.B = nVar != null ? nVar.e() : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkstreamparams onSaveInstanceState ");
            r45.ta4 ta4Var = x4Var.B;
            sb7.append(ta4Var != null ? java.lang.Integer.valueOf(ta4Var.hashCode()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", sb7.toString());
            dk2.x4.C.b(bundle, x4Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onStart " + this + ", activateUIKey:" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8.f197762v);
        super.mo2286xb05099c3();
        O6("onStart");
        T6();
        fo0.c cVar = fo0.c.f346331a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fo0.c.f346332b.f346340a).f174665d.f174583h = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onStop " + this + ", activateUIKey:" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8.f197762v);
        super.mo2287xc39f8281();
        ml2.b1.a(ml2.b1.f408744a, java.lang.String.valueOf(m80379x76847179().hashCode()), null, 2, null);
        O6("onStop");
        U6();
    }
}
