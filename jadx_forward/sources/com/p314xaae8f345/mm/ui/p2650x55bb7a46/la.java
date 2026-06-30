package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class la {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f283465a = "";

    public static boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17;
        return f9Var == null || !f9Var.k2() || (v17 = ot0.q.v(f9Var.j())) == null || v17.f430199i != 40;
    }

    public static boolean b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0 h0Var) {
        org.json.JSONObject jSONObject;
        if (h0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h0Var.f273200d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavMsgHandle", "checkLiteAppCanFav: null");
            return false;
        }
        if (!new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.fav.C20148xa6aa0a27().p()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMsgHandle", "checkLiteAppCanFav: expt skip");
            return false;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(h0Var.f273200d);
            if (jSONObject2.has("favOptions") && (jSONObject = jSONObject2.getJSONObject("favOptions")) != null) {
                int i17 = jSONObject.getInt("bizId");
                if (i17 == 2 || i17 == 1) {
                    return true;
                }
            }
            return false;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FavMsgHandle", e17, "checkLiteAppCanFav err", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.a aVar;
        if (f9Var == null) {
            return true;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(f9Var.Q0()) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(c01.w9.s(f9Var.j()))) {
            return true;
        }
        if (f9Var.k2() || f9Var.n2()) {
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null) {
                return true;
            }
            ez.v0 v0Var = ez.v0.f339310a;
            if (v0Var.k(java.lang.Integer.valueOf(v17.f430199i))) {
                return false;
            }
            if (!v0Var.j(java.lang.Integer.valueOf(v17.f430199i)) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.A)) {
                int i17 = v17.f430199i;
                if (i17 == 19) {
                    java.util.Iterator it = bt3.g2.A(v17.f430196h0).f468998f.iterator();
                    while (it.hasNext()) {
                        r45.gp0 gp0Var = (r45.gp0) it.next();
                        java.lang.String t17 = bt3.g2.t(gp0Var, f9Var.Q0(), f9Var.m124847x74d37ac6(), 1);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456944g2) && !com.p314xaae8f345.mm.vfs.w6.j(t17)) {
                            return false;
                        }
                        java.lang.String H = bt3.g2.H(gp0Var, f9Var.Q0(), f9Var.m124847x74d37ac6(), 1);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456938d2) && !com.p314xaae8f345.mm.vfs.w6.j(H)) {
                            return false;
                        }
                    }
                } else if (i17 == 48 && ((aVar = (ot0.a) v17.y(ot0.a.class)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.G) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.I))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavMsgHandle", "hy: can not fav or retransmit because of not having remote url");
                    return false;
                }
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d o17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.o(f9Var, v17.f430227p);
                if (o17 != null && (!com.p314xaae8f345.mm.vfs.w6.j(o17.f68099xfeae815) || com.p314xaae8f345.mm.vfs.w6.k(o17.f68099xfeae815) != o17.f68113xeb1a61d6)) {
                    return false;
                }
            }
        }
        if (f9Var.J2()) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 b27 = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0());
            int i18 = b27.f404168c;
            int i19 = b27.f404169d;
            if (!(i18 >= i19 && i19 != 0)) {
                return false;
            }
        }
        if (f9Var.m78014x7b98c171() || f9Var.Y2()) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = f9Var.z0();
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(z07);
            if (!(h17 == null || h17.f496544i == 199)) {
                return false;
            }
        }
        return true;
    }

    public final void d(java.lang.Object obj, x72.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.HashSet hashSet) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMsgHandle", "oreh downloadTpUrl msgId:%d, mediaId:%s, path:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str5, str4);
        hashSet.add(str5);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_FavMsgHandle_1";
        mVar.f69592xf1ebe47b = 19;
        mVar.f69582x4e093552 = str3;
        mVar.f69575xf11df5f5 = str2;
        mVar.f323344z = str;
        mVar.f69595x6d25b0d9 = com.p314xaae8f345.mm.vfs.w6.i(str4, false);
        mVar.f69601xaca5bdda = str5;
        mVar.f323320f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ea(this, f9Var, str4, hashSet, obj, bVar);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavMsgHandle", "recv openim record, add task failed");
    }

    public final void e(java.lang.Object obj, x72.b bVar, boolean z17) {
        java.lang.String str = "";
        this.f283465a = "";
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.j(c5303xc75d2f73, bVar.f533968d, z17);
        boolean z18 = obj instanceof com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (z18) {
            c4Var.f87857j = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) obj;
        } else if (obj instanceof android.app.Activity) {
            c4Var.f87856i = (android.app.Activity) obj;
        }
        c4Var.f87860m = 43;
        c5303xc75d2f73.e();
        if (c5303xc75d2f73.f135624h.f87966a == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = bVar.f533968d;
            if (f9Var.k2()) {
                v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
                ot0.u.a(f9Var);
                ((u90.a) vVar).getClass();
                com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
            } else {
                ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
            }
            if (f9Var.k2() || f9Var.t2()) {
                java.lang.String a17 = c01.n2.a("" + f9Var.I0());
                c01.l2 c17 = c01.n2.d().c(a17, true);
                c17.i("prePublishId", "msg_" + f9Var.I0());
                c17.i("preUsername", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.v(f9Var, bVar.f533966b, bVar.f533965a));
                c17.i("preChatName", bVar.f533967c);
                c17.i("preMsgIndex", 0);
                c17.i("sendAppMsgScene", 1);
                ((n34.p4) ((p94.o0) i95.n0.c(p94.o0.class))).wi("adExtStr", c17, f9Var);
                c4Var.f87855h = a17;
            }
            java.lang.String j17 = f9Var.j();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            ot0.q v17 = ot0.q.v(j17);
            if (v17 != null && v17.f430199i == 5 && v17.f430207k != null) {
                long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                try {
                    str = java.net.URLEncoder.encode(v17.f430207k, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                } catch (java.io.UnsupportedEncodingException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FavMsgHandle", e17, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13378, str, java.lang.Long.valueOf(i17), 2, 2, 1);
            }
            x72.a aVar = bVar.f533969e;
            if (aVar != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hh) aVar).f280699a.f280113d.y();
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.c.Fav, com.p314xaae8f345.mm.ui.p2650x55bb7a46.d.Samll, f9Var, 0);
        }
    }
}
