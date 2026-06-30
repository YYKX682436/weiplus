package um2;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final um2.m f510406a = new um2.m();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f510407b = jz5.h.b(um2.l.f510393d);

    public final void a(um2.x5 x5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x5Var, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "checkChargeLiveInvalid live info:" + cm2.a.f124861a.y(((mm2.e1) x5Var.c(mm2.e1.class)).f410521r));
        if (((mm2.g0) x5Var.c(mm2.g0.class)).T6()) {
            fm2.c cVar = x5Var.f101139c;
            fm2.c cVar2 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? cVar : null;
            if (cVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(cVar2, null, null, new um2.i(x5Var, null), 3, null);
            }
        }
    }

    public final void b(um2.x5 x5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar;
        android.view.ViewGroup viewGroup;
        df2.j0 j0Var;
        fm2.c cVar;
        df2.j0 j0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x5Var, "<this>");
        java.lang.String str = "checkLiveCharge info:" + cm2.a.f124861a.y(((mm2.e1) x5Var.c(mm2.e1.class)).f410521r);
        java.lang.String str2 = x5Var.f510565f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        jz5.f0 f0Var = null;
        boolean Q6 = mm2.g0.Q6((mm2.g0) x5Var.c(mm2.g0.class), null, 1, null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = x5Var.f101138b;
        if (!Q6) {
            if (((je2.a0) x5Var.c(je2.a0.class)).f380730i) {
                return;
            }
            zl2.r4.f555483a.E(activityC0065xcd7aa112, 8192);
            return;
        }
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.O4).mo141623x754a37bb()).r()).intValue() == 1 || ((je2.a0) x5Var.c(je2.a0.class)).f380730i) {
            zl2.r4.f555483a.X2(activityC0065xcd7aa112, 8192, 8192);
        } else {
            zl2.r4.f555483a.E(activityC0065xcd7aa112, 8192);
        }
        if (((mm2.g0) x5Var.c(mm2.g0.class)).S6() || (((je2.a0) x5Var.c(je2.a0.class)).f380729h && ((je2.a0) x5Var.c(je2.a0.class)).f380728g)) {
            fm2.c cVar2 = x5Var.f101139c;
            if (cVar2 != null) {
                cVar2.m57634x462bc332(0);
            }
            fm2.c cVar3 = x5Var.f101139c;
            if (cVar3 != null && (j0Var = (df2.j0) cVar3.mo57658x143f1b92(df2.j0.class)) != null) {
                j0Var.m124210x41012807();
            }
            fm2.c cVar4 = x5Var.f101139c;
            long j17 = (cVar4 == null || (adVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad) cVar4.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad.class)) == null || (viewGroup = adVar.f446856d) == null || viewGroup.getVisibility() != 0) ? false : true ? 300L : 0L;
            fm2.c cVar5 = x5Var.f101139c;
            if (cVar5 != null) {
                cVar5.postDelayed(new um2.j(x5Var, j17), j17);
                return;
            }
            return;
        }
        fm2.c cVar6 = x5Var.f101139c;
        if (cVar6 != null) {
            cVar6.m57634x462bc332(1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar3 = x5Var.W0;
        if (adVar3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad.z1(adVar3, ne2.l.f418078a.a(((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.g0) x5Var.c(mm2.g0.class)).f410599m), false, false, 6, null);
        }
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Nj().D0(((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0))) {
            zl2.r4.f555483a.f3(activityC0065xcd7aa112, "charge live invalid!");
            fm2.c cVar7 = x5Var.f101139c;
            if (cVar7 == null || (adVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad) cVar7.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad.class)) == null) {
                return;
            }
            adVar2.v1();
            return;
        }
        r45.td2 td2Var = ((mm2.g0) x5Var.c(mm2.g0.class)).f410599m;
        if (td2Var != null && (cVar = x5Var.f101139c) != null && (j0Var2 = (df2.j0) cVar.mo57658x143f1b92(df2.j0.class)) != null) {
            long m75942xfb822ef2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startChargeLiveCountDown liveId:");
            sb6.append(m75942xfb822ef2);
            sb6.append(",t");
            sb6.append("FinderLiveUrlOption:[" + td2Var.m75939xb282bd08(1) + ',' + td2Var.m75939xb282bd08(3) + ']');
            sb6.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j0Var2.f311973m, sb6.toString());
            if (j0Var2.f311974n == null) {
                ne2.k kVar = new ne2.k(1, m75942xfb822ef2, 0, 0, 12, null);
                kVar.f418070d = new df2.h0(j0Var2);
                j0Var2.f311974n = kVar;
            }
            ne2.k kVar2 = j0Var2.f311974n;
            if (kVar2 != null) {
                kVar2.c(td2Var);
            }
            fe2.q qVar = (fe2.q) j0Var2.R6(fe2.q.class);
            if (qVar != null) {
                qVar.w1("startChargeLiveCountDown");
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "checkLiveCharge but trialInfo is null!");
        }
    }

    public final void c(um2.x5 x5Var) {
        jz5.f0 f0Var;
        mn0.b0 b0Var;
        java.util.LinkedList i86;
        mm2.e1 e1Var;
        r45.nw1 nw1Var;
        mm2.e1 e1Var2;
        r45.nw1 nw1Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x5Var, "<this>");
        co0.s E = x5Var.E();
        java.lang.String str = x5Var.f510565f;
        if (E == null || (b0Var = E.R1.f363942a) == null) {
            f0Var = null;
        } else {
            mn0.y yVar = (mn0.y) b0Var;
            mn0.k0 l17 = yVar.l();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "firstFrameReportBackup " + l17);
            if (l17.f411301e && (i86 = ((mm2.c1) x5Var.c(mm2.c1.class)).i8()) != null) {
                ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
                java.lang.String str2 = a52.a.f83117l;
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                fm2.c cVar = x5Var.f101139c;
                java.lang.String valueOf = java.lang.String.valueOf(r0Var.Ri((cVar == null || (e1Var2 = (mm2.e1) cVar.m57635xbba4bfc0(mm2.e1.class)) == null || (nw1Var2 = e1Var2.f410521r) == null) ? 0L : nw1Var2.m75942xfb822ef2(0)));
                zl2.q4 q4Var = zl2.q4.f555466a;
                long e17 = q4Var.e(i86, l17);
                if (e17 > 0) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    yVar.r(str2, valueOf, ((je2.z) x5Var.c(je2.z.class)).f380823g, ((je2.z) x5Var.c(je2.z.class)).f380824h);
                    yVar.h(str2, valueOf, e17);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                fm2.c cVar2 = x5Var.f101139c;
                q4Var.L(str2, (cVar2 == null || (e1Var = (mm2.e1) cVar2.m57635xbba4bfc0(mm2.e1.class)) == null || (nw1Var = e1Var.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0), valueOf, e17, i86, l17, "backup");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "firstFrameReportBackup businessFirstFrame:" + e17);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "firstFrameReportBackup but player is null!");
        }
    }

    public final void d(um2.x5 x5Var) {
        java.lang.String stringExtra;
        dk2.x4 x4Var;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x5Var, "<this>");
        if (((java.lang.Boolean) ((jz5.n) f510407b).mo141623x754a37bb()).booleanValue()) {
            mm2.g0 g0Var = (mm2.g0) x5Var.c(mm2.g0.class);
            if (1 != g0Var.f410595f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveChargeSlice", "cacheLiveMode 1");
            }
            g0Var.f410595f = 1;
            fm2.c cVar = x5Var.f101139c;
            if (cVar != null) {
                zl2.r4.f555483a.l3(x5Var.f101142a, cVar, false);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            long m75942xfb822ef2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            am.ia iaVar = c5445x963cab3.f135785g;
            iaVar.f88451a = m75942xfb822ef2;
            iaVar.f88452b = 14;
            c5445x963cab3.e();
            fm2.c cVar2 = x5Var.f101139c;
            if (cVar2 != null) {
                zl2.r4.f555483a.E2(x5Var.f101142a, cVar2);
            }
            fm2.c cVar3 = x5Var.f101139c;
            if (cVar3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57627xbbf42674(cVar3, false, 1, null);
                return;
            }
            return;
        }
        long m75942xfb822ef22 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = x5Var.f101138b;
        java.lang.String e17 = xy2.c.e(activityC0065xcd7aa112);
        long j17 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410516m;
        java.lang.String str2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410525v;
        java.lang.String str3 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410517n;
        java.lang.String str4 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410526w;
        java.lang.String str5 = ((mm2.c1) x5Var.c(mm2.c1.class)).f410438w4;
        int i17 = ((mm2.c1) x5Var.c(mm2.c1.class)).f410446x4;
        r45.qt2 qt2Var = x5Var.f101141e;
        r45.jc1 jc1Var = ((mm2.c1) x5Var.c(mm2.c1.class)).f410360j5;
        tn0.w0 w0Var = dk2.ef.f314911d;
        java.lang.String str6 = w0Var != null ? w0Var.Z : null;
        km2.n nVar = dk2.ef.H;
        java.lang.String str7 = (nVar == null || (x4Var = nVar.f390688g) == null || (str = x4Var.f315865z) == null) ? "" : str;
        java.lang.String str8 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410528y;
        r45.o72 T = zl2.r4.f555483a.T(activityC0065xcd7aa112, ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0), x5Var.f510565f);
        long j18 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410514h;
        android.content.Intent intent = activityC0065xcd7aa112.getIntent();
        java.lang.String str9 = (intent == null || (stringExtra = intent.getStringExtra("key_enter_live_param_source_web_url")) == null) ? "" : stringExtra;
        km2.n nVar2 = dk2.ef.H;
        ek2.e0 e0Var = new ek2.e0(m75942xfb822ef22, null, e17, j17, 2, str2, str3, str4, str5, i17, qt2Var, 0, jc1Var, str6, str7, 0, str8, T, j18, 0, str9, null, null, false, nVar2 != null ? nVar2.f390694m : 0, 15239168, null);
        pf5.z zVar = pf5.z.f435481a;
        im2.t6 t6Var = (im2.t6) zVar.a(activityC0065xcd7aa112).a(im2.t6.class);
        r45.gc1 gc1Var = e0Var.f334972w;
        t6Var.P6(gc1Var);
        ((im2.t6) zVar.a(activityC0065xcd7aa112).a(im2.t6.class)).Q6(((mm2.e1) x5Var.c(mm2.e1.class)).f410514h, (r45.kv0) gc1Var.m75936x14adae67(1));
        e0Var.l().K(new um2.k(x5Var));
    }

    public final void e(gk2.e eVar, java.lang.String source, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, r45.nw1 respLiveInfo, r45.ma4 respLiveSdkInfo) {
        hn0.r rVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respLiveInfo, "respLiveInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respLiveSdkInfo, "respLiveSdkInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorLivingHelper", "processLiveRoomInfo source: ".concat(source));
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams();
        ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
        java.lang.String w07 = b17 != null ? b17.w0() : "";
        kn0.g gVar = new kn0.g(w07, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), 0, null, 0L, 0L, null, 0, 0, 0, null, 0, 0L, 0, null, null, 0L, 0L, false, 524284, null);
        dk2.r4.f315538h.a(w07, respLiveSdkInfo, respLiveInfo, tRTCParams, gVar, 2, eVar);
        java.lang.String name = activityC0065xcd7aa112 != null ? activityC0065xcd7aa112.getClass().getName() : null;
        java.lang.String str = name != null ? name : "";
        mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
        kn0.i iVar = new kn0.i(tRTCParams, gVar, new kn0.h(str));
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        if (sVar != null && (rVar = sVar.R1) != null) {
            rVar.s(iVar.f391091b, ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(((mm2.e1) eVar.a(mm2.e1.class)).f410521r), zl2.r4.f555483a.d0(source), ((je2.z) eVar.a(je2.z.class)).P6());
        }
        e1Var.o7(iVar);
    }
}
