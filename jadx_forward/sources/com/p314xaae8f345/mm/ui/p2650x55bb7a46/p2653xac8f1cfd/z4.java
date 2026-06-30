package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public abstract class z4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f281893a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a5();

    public static void a(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Intent intent) {
        if (dVar == null || f9Var == null || intent == null) {
            return;
        }
        java.lang.String x17 = dVar.x();
        java.lang.String d17 = dVar.u().d1();
        boolean z17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280286r;
        if (dVar.C() || z17) {
            if (dVar.C()) {
                java.lang.String s17 = c01.w9.s(f9Var.j());
                if (d17 != null && s17 != null && s17.length() > 0) {
                    d17 = s17;
                }
            } else {
                d17 = f9Var.u0();
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (dVar.C()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(f9Var.I0()));
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", d17);
        intent.putExtra("_stat_obj", bundle);
    }

    public static boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String j17 = f9Var.j();
        m11.b0 b0Var = null;
        ot0.q v17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17) ? ot0.q.v(j17) : null;
        if (f9Var.J2()) {
            if (f9Var.m124847x74d37ac6() > 0) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                b0Var = m11.b1.Di().T1(f9Var.Q0(), f9Var.m124847x74d37ac6());
            }
            if ((b0Var == null || b0Var.f404166a <= 0) && f9Var.I0() > 0) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                b0Var = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0());
            }
            if (b0Var == null) {
                return false;
            }
            boolean f17 = f(f9Var, m11.c0.c(f9Var, b0Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkFavMsgExpired image:" + f17);
            return f17;
        }
        if (f9Var.m78014x7b98c171() || f9Var.Y2()) {
            boolean f18 = f(f9Var, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104104s, f9Var.z0(), false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkFavMsgExpired video:" + f18);
            return f18;
        }
        if (f9Var.k2() && v17 != null && v17.f430199i == 6) {
            boolean c17 = ez.v0.f339310a.c(f9Var, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkFavMsgExpired file:" + c17);
            return c17;
        }
        if (f9Var.k2() && v17 != null && v17.f430199i == 24) {
            boolean g17 = g(f9Var, v17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkFavMsgExpired note:" + g17);
            return g17;
        }
        if (!f9Var.k2() || v17 == null || v17.f430199i != 19) {
            return false;
        }
        boolean g18 = g(f9Var, v17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkFavMsgExpired record:" + g18);
        return g18;
    }

    public static boolean c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        return !f9Var.n2() ? f(f9Var, str) : d(f9Var, str, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21739x6cf62a8());
    }

    public static boolean d(java.lang.Object obj, java.lang.String str, java.util.function.Function function) {
        java.lang.Long valueOf;
        java.lang.String m75945x2fec8307;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return false;
        }
        long a17 = c01.id.a();
        boolean z17 = obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.f9;
        if (z17) {
            valueOf = java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).mo78012x3fdd41df());
        } else {
            if (!(obj instanceof oi3.g)) {
                throw new java.lang.IllegalArgumentException("Unsupported message type");
            }
            oi3.g gVar = (oi3.g) obj;
            valueOf = java.lang.Long.valueOf(gVar.m75942xfb822ef2(gVar.f427150d + 2));
        }
        long longValue = valueOf.longValue();
        long j17 = a17 - longValue;
        l15.c cVar = new l15.c();
        if (z17) {
            m75945x2fec8307 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).j();
        } else {
            if (!(obj instanceof oi3.g)) {
                throw new java.lang.IllegalArgumentException("Unsupported message type");
            }
            oi3.g gVar2 = (oi3.g) obj;
            m75945x2fec8307 = gVar2.m75945x2fec8307(gVar2.f427150d + 13);
        }
        cVar.m126728xdc93280d(m75945x2fec8307);
        return (cVar.l() == null || cVar.l().l() <= longValue / 1000) ? j17 > ((java.lang.Long) function.apply(obj)).longValue() : a17 / 1000 > cVar.l().l();
    }

    public static boolean e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return c01.id.a() - f9Var.mo78012x3fdd41df() > h(f9Var);
    }

    public static boolean f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        long a17 = c01.id.a();
        long mo78012x3fdd41df = f9Var.mo78012x3fdd41df();
        if (a17 - mo78012x3fdd41df <= h(f9Var)) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingLogic", "cur time: %s, msg time: %s, path: %s.", java.lang.Long.valueOf(a17), java.lang.Long.valueOf(mo78012x3fdd41df), str);
        return true;
    }

    public static boolean g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar) {
        java.lang.String str;
        boolean f17 = f(f9Var, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkRecordOrNoteExpired msgTimeExpired:" + f17);
        if (f17 && (str = qVar.f430196h0) != null) {
            r45.ul5 c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.x1.c(str);
            java.lang.String Q0 = f9Var.Q0();
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            if (c17 != null) {
                java.util.Iterator it = c17.f468998f.iterator();
                while (it.hasNext()) {
                    r45.gp0 dataItem = (r45.gp0) it.next();
                    ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
                    java.lang.String H = bt3.g2.H(dataItem, Q0, m124847x74d37ac6, 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(H, "getThumbPath(...)");
                    ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
                    java.lang.String t17 = bt3.g2.t(dataItem, Q0, m124847x74d37ac6, 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "getDataPath(...)");
                    boolean z17 = dataItem.f456951l1 == 0;
                    boolean z18 = dataItem.R == 0;
                    int i17 = dataItem.I;
                    if (i17 == 2 || i17 == 4 || i17 == 15) {
                        z18 = false;
                    }
                    if (!z18 && !com.p314xaae8f345.mm.vfs.w6.j(t17)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkData not exist, dataId:");
                        java.lang.String str2 = dataItem.T;
                        sb6.append(str2 != null ? str2 : "");
                        sb6.append(", orgnPath:");
                        sb6.append(t17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingLogic", sb6.toString());
                        return true;
                    }
                    if (!z17 && !com.p314xaae8f345.mm.vfs.w6.j(H)) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkThumb not exist, dataId:");
                        java.lang.String str3 = dataItem.T;
                        sb7.append(str3 != null ? str3 : "");
                        sb7.append(", orgnThumbPath:");
                        sb7.append(H);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingLogic", sb7.toString());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static long h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return i(f9Var, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21740x6cf62a9());
    }

    public static long i(java.lang.Object obj, java.util.function.Function function) {
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.ChattingLogic", "getMsgExpireIntervalTime, msg is null.");
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MsgCommonMediaExpiredInterval", 1209600) * 1000;
        }
        java.lang.String str = (java.lang.String) function.apply(obj);
        long b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b(r7, 1209600) * 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingLogic", "getMsgExpireIntervalTime, type=%s, configKey=%s, interval=%d", str, (java.lang.String) ((java.util.HashMap) f281893a).getOrDefault(str, "MsgCommonMediaExpiredInterval"), java.lang.Long.valueOf(b17));
        return b17;
    }

    public static android.view.ViewStub j(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, int i17) {
        android.view.ViewStub viewStub = (android.view.ViewStub) abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26077x4ff8c0f0(i17);
        if (viewStub != null) {
            viewStub.inflate();
        }
        return viewStub;
    }

    public static boolean k(java.lang.String str) {
        int i17;
        if (!c01.e2.J(str)) {
            if ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.O4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) && !c01.z1.J(str)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
                if (n17 != null) {
                    int m124896xfb85f7b0 = n17.m124896xfb85f7b0();
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(n17.J0(), true);
                    i17 = n18 != null ? n18.m124896xfb85f7b0() : -1;
                    r1 = m124896xfb85f7b0;
                } else {
                    i17 = -1;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingLogic", "isStranger:%s type:%d etype:%d", str, java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(i17));
                return true;
            }
        }
        return false;
    }
}
