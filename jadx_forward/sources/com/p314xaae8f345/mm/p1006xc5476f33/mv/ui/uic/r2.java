package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class r2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f232933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f232934e;

    public r2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68) {
        this.f232933d = activityC0065xcd7aa112;
        this.f232934e = c16668xffb9dd68;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        r45.cs4 cs4Var;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        r45.yr4 yr4Var;
        r45.yr4 yr4Var2;
        r45.yr4 yr4Var3;
        r45.yr4 yr4Var4;
        r45.pr4 pr4Var;
        fm3.u uVar;
        java.util.LinkedList linkedList;
        r45.es4 es4Var;
        int i19;
        if ((m1Var instanceof hm3.a) && (i19 = ((hm3.a) m1Var).f363755d) != 0 && i19 != this.f232933d.hashCode()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f232934e.f232507d, "not the same page of netscene");
            return;
        }
        pf5.u uVar2 = pf5.u.f435469a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = uVar2.c(this.f232933d).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a17;
        if (m1Var instanceof hm3.p) {
            if (i17 == 0 && i18 == 0 && (es4Var = ((hm3.p) m1Var).f363812o) != null) {
                this.f232934e.W6(es4Var);
            }
            this.f232934e.f232521u = true;
            return;
        }
        int i27 = 6;
        if (m1Var instanceof hm3.q) {
            if (i17 == 0 && i18 == 0) {
                r45.gs4 gs4Var = ((hm3.q) m1Var).f363816o;
                if (gs4Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232934e;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f232933d;
                    java.lang.String str3 = gs4Var.f457046d;
                    if (str3 != null) {
                        if (!((str3.length() > 0) && android.text.TextUtils.isEmpty(n0Var.f232843i.m75945x2fec8307(6)))) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            n0Var.f232843i.set(6, str3);
                        }
                    }
                    java.lang.String str4 = gs4Var.f457047e;
                    if (str4 != null) {
                        if (!(str4.length() > 0)) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            n0Var.f232843i.set(7, str4);
                        }
                    }
                    java.lang.String str5 = gs4Var.f457048f;
                    if (str5 != null) {
                        if (!(str5.length() > 0)) {
                            str5 = null;
                        }
                        if (str5 != null) {
                            n0Var.f232843i.set(8, str5);
                        }
                    }
                    java.lang.String str6 = gs4Var.f457049g;
                    if (str6 != null) {
                        if (!(str6.length() > 0)) {
                            str6 = null;
                        }
                        if (str6 != null) {
                            n0Var.f232843i.set(9, str6);
                        }
                    }
                    java.lang.Long valueOf = java.lang.Long.valueOf(gs4Var.f457051i);
                    if (!(valueOf.longValue() > 0)) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        n0Var.f232843i.set(11, java.lang.Long.valueOf(valueOf.longValue()));
                    }
                    java.lang.String str7 = gs4Var.f457052m;
                    if (str7 != null) {
                        if (!(str7.length() > 0)) {
                            str7 = null;
                        }
                        if (str7 != null) {
                            n0Var.f232843i.set(16, str7);
                        }
                    }
                    t45.n0 n0Var2 = gs4Var.f457053n;
                    if (n0Var2 != null) {
                        n0Var.f232853v = n0Var2;
                    }
                    r45.at4 at4Var = gs4Var.f457054o;
                    if (at4Var != null) {
                        n0Var.f232855x = at4Var;
                    }
                    java.lang.String str8 = c16668xffb9dd68.f232507d;
                    jm3.h1.f381855a.c(n0Var.f232843i);
                    java.lang.String str9 = c16668xffb9dd68.f232507d;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resp.musician finder_username:");
                    r45.at4 at4Var2 = gs4Var.f457054o;
                    sb6.append(at4Var2 != null ? at4Var2.f451788d : null);
                    sb6.append(" jumpType:");
                    r45.at4 at4Var3 = gs4Var.f457054o;
                    sb6.append(at4Var3 != null ? java.lang.Integer.valueOf(at4Var3.f451790f) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str9, sb6.toString());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232508e, "get lyric from SongStatus " + gs4Var.f457046d);
                    n0Var.S6();
                    ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1) uVar2.c(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.class)).V6(n0Var.f232843i, n0Var.f232844m, false);
                    n0Var.T6();
                    ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.p2(activityC0065xcd7aa112, gs4Var));
                }
                fm3.j0.f345611a.i(this.f232933d, n0Var.f232843i, n0Var.f232842h, n0Var.Q6(), n0Var.O6(), n0Var.P6());
                return;
            }
            return;
        }
        if (m1Var instanceof hm3.m) {
            if (i17 == 0 && i18 == 0) {
                hm3.m mVar = (hm3.m) m1Var;
                r45.h51 h51Var = mVar.f363802r;
                if (h51Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.P6(this.f232934e, h51Var, mVar.f363798n);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd682 = this.f232934e;
            java.util.Iterator it = c16668xffb9dd682.f232510g.iterator();
            int i28 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                lm3.e eVar = (lm3.e) next;
                if (eVar.f401015d.hashCode() == ((hm3.m) m1Var).f363798n) {
                    fm3.u mv6 = eVar.f401015d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mv6, "mv");
                    mv6.f345671r = true;
                    mv6.f345663j = null;
                    mv6.f345662i = null;
                    mv6.f345660g.clear();
                    mv6.f345664k = 0;
                    mv6.f345665l = 0;
                    mv6.f345666m = 0;
                    mv6.f345667n = false;
                    mv6.f345670q = null;
                    mv6.f345673t = null;
                    mv6.f345674u.clear();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd682.f232507d, "notifyItemChanged5:" + i28);
                    c16668xffb9dd682.T6().m8148xed6e4d18(i28, "NetSceneMusicMvGetFinderFeedDetail_fail");
                    c16668xffb9dd682.a7(eVar.f401015d);
                }
                i28 = i29;
            }
            return;
        }
        if (m1Var instanceof hm3.j) {
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd683 = this.f232934e;
                c16668xffb9dd683.f232520t = true;
                java.lang.String str10 = c16668xffb9dd683.f232507d;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onSceneEnd MusicLiveGetBeatTrack songId:");
                hm3.j jVar = (hm3.j) m1Var;
                sb7.append(jVar.f363784i.m75945x2fec8307(5));
                sb7.append(" trackPoint:");
                r45.tr4 tr4Var = jVar.f363789q;
                sb7.append(tr4Var != null ? tr4Var.f468278d : null);
                sb7.append(" flexSize:");
                r45.tr4 tr4Var2 = jVar.f363789q;
                sb7.append((tr4Var2 == null || (linkedList = tr4Var2.f468279e) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str10, sb7.toString());
                int i37 = jVar.f363785m;
                r45.tr4 tr4Var3 = jVar.f363789q;
                if (tr4Var3 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd684 = this.f232934e;
                    n0Var.f232852u = tr4Var3.f468279e.size();
                    java.util.Iterator it6 = c16668xffb9dd684.f232510g.iterator();
                    int i38 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i38 = -1;
                            uVar = null;
                            break;
                        }
                        java.lang.Object next2 = it6.next();
                        int i39 = i38 + 1;
                        if (i38 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        lm3.e eVar2 = (lm3.e) next2;
                        if (eVar2.f401015d.hashCode() == jVar.f363786n) {
                            uVar = eVar2.f401015d;
                            break;
                        }
                        i38 = i39;
                    }
                    if (uVar != null) {
                        if (!(i38 >= 0 && uVar.f345660g.isEmpty())) {
                            uVar = null;
                        }
                        if (uVar != null) {
                            java.util.LinkedList<java.lang.Integer> break_point_ms = tr4Var3.f468278d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(break_point_ms, "break_point_ms");
                            int i47 = 0;
                            for (java.lang.Integer num : break_point_ms) {
                                r45.jf2 jf2Var = new r45.jf2();
                                jf2Var.set(2, 0L);
                                jf2Var.set(3, "");
                                jf2Var.set(0, java.lang.Long.valueOf(i47));
                                jf2Var.set(1, java.lang.Integer.valueOf(num.intValue() - i47));
                                jf2Var.set(4, 0L);
                                uVar.f345660g.add(jf2Var);
                                i47 = num.intValue();
                            }
                            if (i47 < i37) {
                                r45.jf2 jf2Var2 = new r45.jf2();
                                jf2Var2.set(2, 0L);
                                jf2Var2.set(3, "");
                                jf2Var2.set(0, java.lang.Long.valueOf(i47));
                                jf2Var2.set(1, java.lang.Integer.valueOf(i37 - i47));
                                jf2Var2.set(4, 0L);
                                uVar.f345660g.add(jf2Var2);
                            }
                        }
                    }
                    if (c16668xffb9dd684.f232521u) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd684.f232507d, "get beat track notify");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd684.f232507d, "notifyItemChanged6:" + i38);
                        c16668xffb9dd684.T6().m8148xed6e4d18(i38, "NetSceneMusicMvGetBeatTrack");
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (m1Var instanceof hm3.g) {
            if (i17 == 0 && i18 == 0 && (pr4Var = ((hm3.g) m1Var).f363778o) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd685 = this.f232934e;
                n0Var.f232846o = pr4Var.f464861d;
                n0Var.f232843i.set(5, pr4Var.f464863f);
                n0Var.f232847p = pr4Var.f464862e;
                java.lang.String str11 = pr4Var.f464864g;
                if (str11 == null) {
                    str11 = "";
                }
                n0Var.A = str11;
                java.lang.String str12 = pr4Var.f464865h;
                n0Var.B = str12 != null ? str12 : "";
                c16668xffb9dd685.F = true;
                c16668xffb9dd685.V6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd685.f232507d, "NetSceneMusicMvCheckPermission songId:" + pr4Var.f464863f + " mvPostPermissionBit:" + pr4Var.f464861d + " statusVerifyInfo:" + pr4Var.f464862e);
                return;
            }
            return;
        }
        boolean z17 = m1Var instanceof hm3.o;
        if (z17) {
            if (i17 == 0 && i18 == 0) {
                hm3.o oVar = z17 ? (hm3.o) m1Var : null;
                java.lang.String str13 = (oVar == null || (yr4Var4 = oVar.f363808n) == null) ? null : yr4Var4.f472857d;
                hm3.o oVar2 = z17 ? (hm3.o) m1Var : null;
                java.lang.String str14 = (oVar2 == null || (yr4Var3 = oVar2.f363808n) == null) ? null : yr4Var3.f472858e;
                hm3.o oVar3 = z17 ? (hm3.o) m1Var : null;
                java.lang.String str15 = (oVar3 == null || (yr4Var2 = oVar3.f363808n) == null) ? null : yr4Var2.f472859f;
                hm3.o oVar4 = z17 ? (hm3.o) m1Var : null;
                java.lang.String str16 = (oVar4 == null || (yr4Var = oVar4.f363808n) == null) ? null : yr4Var.f472860g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f232934e.f232507d, "get ticket token:%s, scheme:%s, description:%s, confirmText:%s", str13, str14, str15, str16);
                p012xc85e97e9.p093xedfae76a.c1 a18 = uVar2.c(this.f232933d).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a18;
                p012xc85e97e9.p093xedfae76a.c1 a19 = uVar2.c(this.f232933d).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e c16677x5944b67e = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e) a19;
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd686 = this.f232934e;
                lm3.e eVar3 = (lm3.e) kz5.n0.a0(c16668xffb9dd686.f232510g, c16668xffb9dd686.f232515o);
                fm3.u uVar3 = eVar3 != null ? eVar3.f401015d : null;
                ka0.q0 q0Var = (ka0.q0) i95.n0.c(ka0.q0.class);
                android.app.Activity m80379x76847179 = this.f232934e.m80379x76847179();
                b21.r b17 = b21.m.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMusicWrapper(...)");
                ((ja0.m0) q0Var).wi(m80379x76847179, str13, str14, str15, str16, b17, c16677x5944b67e.f232532d, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q2(c16677x5944b67e, uVar3, this.f232934e, n0Var3));
                return;
            }
            return;
        }
        if (m1Var instanceof hm3.f) {
            if (i17 == 0 && i18 == 0) {
                b21.r b18 = b21.m.b();
                com.p314xaae8f345.mm.p944x882e457a.o oVar5 = ((hm3.f) m1Var).f363774e;
                java.util.LinkedList linkedList2 = (oVar5 == null || (fVar = oVar5.f152244b.f152233a) == null) ? null : ((r45.bs4) fVar).f452557d;
                p012xc85e97e9.p093xedfae76a.c1 a27 = uVar2.c(this.f232933d).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a27, "get(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e c16677x5944b67e2 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e) a27;
                p012xc85e97e9.p093xedfae76a.c1 a28 = uVar2.c(this.f232933d).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a28, "get(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a28;
                if (linkedList2 == null || (cs4Var = (r45.cs4) linkedList2.get(0)) == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd687 = this.f232934e;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = this.f232933d;
                if (cs4Var.f453341d != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c16668xffb9dd687.f232507d, "errCode:" + cs4Var.f453341d + ", errMsg:" + cs4Var.f453342e);
                    return;
                }
                if (cs4Var.f453343f != null) {
                    if (cs4Var.f453345h == 1 && c16677x5944b67e2.f232535g) {
                        ((ja0.i0) ((ka0.o0) i95.n0.c(ka0.o0.class))).getClass();
                        ml3.c.f409932a.a(linkedList2);
                        n0Var4.f232843i.set(6, cs4Var.f453347m);
                        b18.Q = cs4Var.f453344g;
                        b21.m.i(b18);
                        n0Var4.S6();
                        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1) uVar2.c(activityC0065xcd7aa1122).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.class)).V6(n0Var4.f232843i, n0Var4.f232844m, false);
                        android.view.View view = c16677x5944b67e2.f232536h;
                        if (view != null) {
                            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.ojy);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "hideTryListenIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "hideTryListenIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        c16677x5944b67e2.f232535g = false;
                    }
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c16668xffb9dd687.f232507d, "linkInfo.info is null");
                    return;
                }
                return;
            }
            return;
        }
        if (m1Var instanceof hm3.e) {
            if (i17 == 0 && i18 == 0) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1123 = this.f232933d;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = ((hm3.e) m1Var).f363771m.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetInteractionInfoResp");
                r45.vr4 vr4Var = (r45.vr4) fVar2;
                p012xc85e97e9.p093xedfae76a.c1 a29 = uVar2.c(activityC0065xcd7aa1123).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a29, "get(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var5 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a29;
                n0Var5.C = vr4Var.f469997d;
                n0Var5.D = vr4Var.f470000g;
                this.f232934e.T6().m8148xed6e4d18(0, "UniComponent");
                return;
            }
            return;
        }
        if (m1Var instanceof hm3.d) {
            if (i17 == 0 && i18 == 0) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1124 = this.f232933d;
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd688 = this.f232934e;
                hm3.d dVar = (hm3.d) m1Var;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = dVar.f363769f.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenItemResponse");
                s45.f fVar4 = (s45.f) fVar3;
                p012xc85e97e9.p093xedfae76a.c1 a37 = uVar2.c(activityC0065xcd7aa1124).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a37, "get(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var6 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a37;
                n0Var6.F.clear();
                n0Var6.G.clear();
                java.util.LinkedList linkedList3 = fVar4.f484512d;
                if (linkedList3 == null || linkedList3.size() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c16668xffb9dd688.f232507d, "NetSceneMMListenItem music results is empty");
                    return;
                }
                java.util.LinkedList<s45.h> results = fVar4.f484512d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(results, "results");
                for (s45.h hVar : results) {
                    if (hVar != null && (str2 = hVar.f484533d) != null) {
                        n0Var6.F.add(str2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd688.f232507d, "NetSceneMMListenItem tingIds:" + hVar.f484533d);
                    }
                }
                if (n0Var6.F.size() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c16668xffb9dd688.f232507d, "NetSceneMMListenItem tingIds is empty, don't getMusicStory");
                    return;
                }
                java.util.LinkedList linkedList4 = n0Var6.F;
                java.lang.String str17 = dVar.f363767d;
                c16668xffb9dd688.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd688.f232507d, "getMusicStory ids size:", java.lang.Integer.valueOf(linkedList4.size()));
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c16668xffb9dd688.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                p012xc85e97e9.p093xedfae76a.c1 a38 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a38, "get(...)");
                gm0.j1.d().g(new hm3.c(linkedList4, 1, ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a38).f232843i.m75945x2fec8307(18), str17));
                return;
            }
            return;
        }
        if ((m1Var instanceof hm3.c) && i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd689 = this.f232934e;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = this.f232933d;
            hm3.c cVar = (hm3.c) m1Var;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar5 = cVar.f363765f.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenGetLyricResponse");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd689.f232507d, "NetSceneMMListenGetLyric get music listen lyric callback");
            java.util.LinkedList linkedList5 = ((s45.d) fVar5).f484507d;
            if (linkedList5 != null) {
                int i48 = 0;
                for (java.lang.Object obj : linkedList5) {
                    int i49 = i48 + 1;
                    if (i48 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    s45.a aVar = (s45.a) obj;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd689.f232507d, "getLyricRespItem.lyric:%s", aVar.f484498d);
                    if (aVar.f484498d != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                        pf5.z zVar = pf5.z.f435481a;
                        p012xc85e97e9.p093xedfae76a.c1 a39 = zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a39, "get(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var7 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a39;
                        n0Var7.f232843i.set(i27, aVar.f484498d);
                        n0Var7.S6();
                        n0Var7.f232845n = false;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.class)).V6(n0Var7.f232843i, n0Var7.f232844m, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd689.f232507d, "putLyricsCache cacheKey:%s", cVar.f363763d);
                        fm3.y yVar = fm3.y.f345694a;
                        java.lang.String key = cVar.f363763d;
                        java.lang.String str18 = aVar.f484498d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvCgiRetCache", "putLyricsCache, key:" + key + ", timestamp:" + elapsedRealtime);
                        fm3.y.f345697d.put(new fm3.d0(key), new fm3.c0(str18, elapsedRealtime));
                        yVar.a(elapsedRealtime);
                    }
                    i48 = i49;
                    i27 = 6;
                }
            }
        }
    }
}
