package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class mp {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f286132a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f286133b;

    static {
        android.view.ViewConfiguration.getDoubleTapTimeout();
        f286132a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("voice_continue_play_info");
        f286133b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20058x316ec071()) == 1;
    }

    public static boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        boolean z17;
        if (f9Var.a2()) {
            return true;
        }
        sb5.k2 k2Var = (sb5.k2) dVar.f542241c.a(sb5.k2.class);
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        synchronized (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var)) {
            java.lang.Boolean bool = (java.lang.Boolean) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm.f281783u.get(java.lang.Long.valueOf(m124847x74d37ac6));
            if (bool != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "isShowTransformFlag[%s]:%s", java.lang.Long.valueOf(m124847x74d37ac6), bool);
                z17 = bool.booleanValue();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "isShowTransformFlag[%s]: null", java.lang.Long.valueOf(m124847x74d37ac6));
                z17 = false;
            }
        }
        return z17;
    }

    public static void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5405x3c27d29a c5405x3c27d29a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5405x3c27d29a();
        am.b9 b9Var = c5405x3c27d29a.f135752g;
        b9Var.f87758b = 3;
        b9Var.f87759c = 1;
        b9Var.f87757a = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var);
        c5405x3c27d29a.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.view.View r24, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp r25, yb5.d r26, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r27) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.c(android.view.View, com.tencent.mm.ui.chatting.viewitems.lp, yb5.d, com.tencent.mm.storage.f9):void");
    }

    public static boolean d(int i17, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, sb5.k2 k2Var, boolean z17) {
        if (!k(dVar, f9Var, com.p314xaae8f345.mm.R.C30867xcad56011.f572366az5) && !j(dVar, f9Var, com.p314xaae8f345.mm.R.C30867xcad56011.f572364az3)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm.f281779q = f9Var.m124847x74d37ac6();
            s75.d.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.po(dVar, f9Var), "voice_transform_text_report");
            k2Var.getClass();
            if (z17) {
                w21.x0.q(f9Var);
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var).p0(f9Var, true, i17, 0);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
            com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
        }
        return true;
    }

    public static void e(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "reportTransformTextLongClick type: %d, msgId: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5405x3c27d29a c5405x3c27d29a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5405x3c27d29a();
        am.b9 b9Var = c5405x3c27d29a.f135752g;
        b9Var.f87758b = 2;
        b9Var.f87759c = i17;
        b9Var.f87757a = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var);
        c5405x3c27d29a.e();
    }

    public static void f(int i17, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || !g(dVar, f9Var, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemVoice", "voiceBackPlay: can back play");
            return;
        }
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            o(i17, dVar, f9Var);
            return;
        }
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        android.app.Activity g17 = dVar.g();
        java.lang.String string = dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n6i);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.so soVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.so(i17, dVar, f9Var);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.S6(g17, string, new j35.f0(soVar), true, a17);
    }

    public static boolean g(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        android.app.Activity g17 = dVar.g();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        am.w00 w00Var = c6229x2bb765fe.f136476g;
        if (w00Var.f89780c) {
            java.lang.String G = iq.b.G(g17, w00Var.f89778a);
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(g17);
            e4Var.f293309c = G;
            e4Var.c();
        }
        if (!w00Var.f89780c && !iq.b.q(dVar.g(), true)) {
            iq.b.u(dVar.g(), true);
            if (!iq.b.m(dVar.g(), true, null) && !iq.b.n(dVar.g(), true) && !iq.b.v(dVar.g()) && !iq.b.e(dVar.g())) {
                if (!c01.d9.b().E()) {
                    db5.t7.k(dVar.g(), dVar.f542250l.m78646xc2a54588());
                    return false;
                }
                w21.u0 u0Var = new w21.u0(f9Var.j());
                if (!x51.t1.b(f9Var.j()) && u0Var.f524013b != 0) {
                    return true;
                }
                dp.a.m125853x26a183b(dVar.g(), com.p314xaae8f345.mm.R.C30867xcad56011.b5a, 0).show();
                if (c16565x9bc03d4e != null) {
                    ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ni(ty.p0.f504273i, c16565x9bc03d4e, 0, dVar.x());
                }
            }
        }
        return false;
    }

    public static void h(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        if (dVar != null) {
            dVar.y();
        }
        if (erVar == null || erVar.c() == null || !g(dVar, erVar.c(), c16565x9bc03d4e)) {
            return;
        }
        w21.u0 u0Var = new w21.u0(erVar.c().j());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 p07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) cVar.a(sb5.q2.class))).p0();
        long i17 = i(erVar.c().m124847x74d37ac6(), u0Var.f524013b, true, dVar.x());
        if (i17 > 0) {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.l0.a(dVar.F(), !dVar.D(), 3L, erVar.c().m124847x74d37ac6() + "", u0Var.f524013b, 0L, i17);
        }
        if (cVar.a(sb5.z.class) != null) {
            p(dVar, erVar.c());
            if (!p07.n()) {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).getClass();
            }
            p07.i(erVar.d(), erVar.c());
        }
    }

    public static long i(long j17, long j18, boolean z17, java.lang.String str) {
        long parseLong;
        long currentTimeMillis;
        int g17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f286132a;
        java.lang.String string = o4Var.getString(j17 + "", "0,0");
        if (o4Var.getLong("current_interrupt_msg_id-" + str, 0L) != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "[voice interrupt] %d current voice isn't the latest interrupt one %s", java.lang.Long.valueOf(j17), str);
            return 0L;
        }
        if (string == null) {
            return -1L;
        }
        java.lang.String[] split = string.split(",");
        if (split.length != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "[voice interrupt] interrupt info format error");
            return -1L;
        }
        try {
            parseLong = java.lang.Long.parseLong(split[1]);
            currentTimeMillis = java.lang.System.currentTimeMillis() - parseLong;
            g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Chat_VoiceContinuePlayTimeout_Int, -1);
        } catch (java.lang.NumberFormatException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemVoice", "[voice interrupt] parse data error str: ".concat(string));
        }
        if (currentTimeMillis <= ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_chatting_voice_continue_play_timeout, 86400L) * 1000 && (g17 <= -1 || currentTimeMillis <= g17 * 60 * 1000)) {
            long parseLong2 = java.lang.Long.parseLong(split[0]);
            if (2500 >= parseLong2 || 2500 + parseLong2 >= j18) {
                o4Var.remove(j17 + "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "[voice interrupt] pts out of limit");
                return -1L;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "[voice interrupt] get interrupt time " + parseLong2);
            if (z17) {
                o4Var.remove(j17 + "");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[voice interrupt] return pts and remove info ");
                sb6.append(parseLong2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", sb6.toString());
            }
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_chatting_voice_continue_play, -1) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "[voice interrupt] disable flag");
            if (z18) {
                return -1L;
            }
            return parseLong2;
        }
        o4Var.remove(j17 + "");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[voice interrupt] interrupt info expired, record timestamp: ");
        sb7.append(parseLong);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", sb7.toString());
        return -1L;
    }

    public static boolean j(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (f9Var == null || !f9Var.g3() || f9Var.A0() == 1 || f9Var.P0() != 5) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "handleDownloadFailVoiceMsg show alert!");
        db5.e1.y(dVar.g(), dVar.g().getString(i17), "", dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ro());
        return true;
    }

    public static boolean k(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        boolean z17 = false;
        if (f9Var == null || n(f9Var)) {
            return false;
        }
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).q0(f9Var.m124847x74d37ac6())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "onCreateContextMenu: voice msg is downloading.(1)");
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "handleNoFinishDownloadVoiceMsg show alert!");
            db5.e1.y(dVar.g(), dVar.g().getString(i17), "", dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qo());
        }
        return z17;
    }

    public static void l(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var, wl5.v vVar) {
        android.app.Activity g17 = dVar.g();
        wl5.x xVar = lpVar.f286046k;
        if (xVar != null) {
            xVar.c();
        }
        lpVar.f286043h.m80028xc2a54588().setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.TRUE);
        rl5.r rVar = new rl5.r(g17, lpVar.f286043h.m80028xc2a54588());
        lpVar.f286045j = rVar;
        rVar.L = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.to(dVar, lpVar);
        boolean m60126x74219ae7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7();
        rl5.r rVar2 = lpVar.f286045j;
        rVar2.C = true;
        rVar2.Q = false;
        rVar2.f478888y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.uo(lpVar, dVar, f9Var, g17, m60126x74219ae7);
        rVar2.f478887x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vo(lpVar, f9Var, dVar, g17);
        wl5.o oVar = new wl5.o(lpVar.f286043h.m80028xc2a54588(), lpVar.f286045j, vVar, null, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y(lpVar.f286043h.m80028xc2a54588(), new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(g17)));
        oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.a3y;
        oVar.f528657h = 18;
        oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560393j6;
        wl5.x xVar2 = new wl5.x(oVar);
        lpVar.f286046k = xVar2;
        xVar2.f528692d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wo(lpVar);
        q0Var.f286826h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jo(lpVar);
        xVar2.Y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jp(xVar2);
    }

    public static void m(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var, wl5.v vVar) {
        android.app.Activity g17 = dVar.g();
        wl5.x xVar = lpVar.f286048m;
        if (xVar != null) {
            xVar.c();
        }
        lpVar.f286044i.m80028xc2a54588().setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.TRUE);
        rl5.r rVar = new rl5.r(g17, lpVar.f286044i.m80028xc2a54588());
        lpVar.f286047l = rVar;
        rVar.L = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ko(dVar, lpVar);
        boolean m60126x74219ae7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7();
        rl5.r rVar2 = lpVar.f286047l;
        rVar2.C = true;
        rVar2.Q = false;
        rVar2.f478888y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lo(lpVar, dVar, f9Var, g17, m60126x74219ae7);
        rVar2.f478887x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mo(lpVar, f9Var, dVar, g17);
        wl5.o oVar = new wl5.o(lpVar.f286044i.m80028xc2a54588(), lpVar.f286047l, vVar, qn4.y.g() ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t0() : null, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y(lpVar.f286044i.m80028xc2a54588(), new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(g17)));
        oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.a3y;
        oVar.f528657h = 18;
        oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560393j6;
        wl5.x xVar2 = new wl5.x(oVar);
        lpVar.f286048m = xVar2;
        xVar2.f528692d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.no(lpVar);
        q0Var.f286827i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.oo(lpVar);
        xVar2.Y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jp(xVar2);
    }

    public static boolean n(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27;
        w21.w0 w0Var;
        if (f9Var == null || (f27 = pt0.f0.f2(f9Var.Q0(), f9Var.m124847x74d37ac6())) == null) {
            return false;
        }
        if ((f27.F & 8192) > 0) {
            w21.g1 Di = w21.p0.Di();
            java.lang.String Q0 = f27.Q0();
            long I0 = f27.I0();
            Di.getClass();
            boolean a17 = pt0.p.f439751a1.a("voiceinfo");
            l75.k0 k0Var = Di.f523906d;
            if (a17) {
                android.database.Cursor f17 = k0Var.f(("SELECT Status FROM voiceinfo WHERE MsgId=" + I0) + " AND MsgTalker=" + Q0, null, 2);
                if (f17.moveToFirst()) {
                    w0Var = new w21.w0();
                    w0Var.f524025i = f17.getInt(0);
                } else {
                    w0Var = null;
                }
                f17.close();
            } else {
                android.database.Cursor f18 = k0Var.f("SELECT Status FROM voiceinfo WHERE MsgId=" + I0, null, 2);
                if (f18.moveToFirst()) {
                    w0Var = new w21.w0();
                    w0Var.f524025i = f18.getInt(0);
                } else {
                    w0Var = null;
                }
                f18.close();
            }
            if (w0Var == null) {
                w0Var = w21.p0.Di().D0(f27.m124847x74d37ac6());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "getInfoStatusByMsgId() voiceInfo = null, getInfoByMsgId() voiceInfo = " + w0Var);
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf((f27.F & 8192) > 0);
            objArr[1] = w0Var != null ? java.lang.Integer.valueOf(w0Var.f524025i) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "unfinished download! temp:%s, voiceInfo: %d", objArr);
            if (w0Var == null || w0Var.f524025i < 97) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "isVoicesFinishDownload: false");
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "isVoicesFinishDownload(): true");
        return true;
    }

    public static void o(int i17, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 p07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).p0();
        if (f9Var != null && g(dVar, f9Var, null)) {
            w21.u0 u0Var = new w21.u0(f9Var.j());
            if (!p07.n() || p07.f284299i != f9Var.m124847x74d37ac6()) {
                long i18 = i(f9Var.m124847x74d37ac6(), u0Var.f524013b, true, dVar.x());
                if (i18 > 0) {
                    com.p314xaae8f345.mm.ui.p2731xc84c5534.l0.a(dVar.F(), !dVar.D(), 3L, f9Var.m124847x74d37ac6() + "", u0Var.f524013b, 0L, i18);
                }
                if (dVar.f542241c.a(sb5.z.class) != null) {
                    p(dVar, f9Var);
                }
            }
        }
        p07.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlay", "startBackPlay() called");
        if (p07.f284296f == null || p07.f284299i != f9Var.m124847x74d37ac6()) {
            p07.i(i17, f9Var);
        }
        if (p07.f284296f != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(41, "voice_back_play_" + p07.f284299i, null);
            c12886x91aa2b6d.f174578J = false;
            c12886x91aa2b6d.I = true;
            p07.C(c12886x91aa2b6d);
            p07.v(f9Var);
            p07.E(p07.f284299i);
            p07.o();
        }
    }

    public static void p(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int i17;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).s0(f9Var.m124847x74d37ac6())) {
            return;
        }
        sb5.k2 k2Var = (sb5.k2) dVar.f542241c.a(sb5.k2.class);
        if (f9Var.a2()) {
            i17 = 7;
        } else {
            i17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var).q0(f9Var.m124847x74d37ac6()) ? 6 : 0;
        }
        if (i17 != 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5405x3c27d29a c5405x3c27d29a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5405x3c27d29a();
            am.b9 b9Var = c5405x3c27d29a.f135752g;
            b9Var.f87758b = 1;
            b9Var.f87759c = i17;
            b9Var.f87757a = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var);
            c5405x3c27d29a.e();
        }
    }
}
