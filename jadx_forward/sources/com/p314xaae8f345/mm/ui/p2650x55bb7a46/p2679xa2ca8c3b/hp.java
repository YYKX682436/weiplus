package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class hp extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285674s;

    public static boolean d0(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        if (f9Var.P0() == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "onItemClick msg(%s) fail", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            return true;
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.n(f9Var)) {
            if (erVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "onItemClick tag(%s) is null", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                return true;
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).f281402i = 0L;
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(erVar.c());
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.h(dVar, erVar, null);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) dVar.f542241c.a(sb5.k2.class))).A0(2);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).f281871i = true;
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
            return true;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class));
        roVar.f281402i = f9Var.m124847x74d37ac6();
        roVar.f281403m = new java.lang.ref.WeakReference(view);
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).q0(f9Var.m124847x74d37ac6())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "onCreateContextMenu: voice msg show download animation");
            return true;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).f281404n.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Boolean.TRUE);
        if (((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).bj()) {
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).Zi(new cg0.a(f9Var.z0(), f9Var.Q0(), f9Var.m124847x74d37ac6(), f9Var.I0(), f9Var.mo78012x3fdd41df()));
        } else {
            w21.p0.Bi().e();
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gp(dVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "onItemClick voice msg(%s) no finish download!", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570096xe);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp();
        lpVar.b(xgVar, false, false);
        xgVar.setTag(lpVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0050. Please report as an issue. */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) dVar.f542241c.a(sb5.k2.class));
        java.lang.String s07 = xmVar.s0(f9Var.m124847x74d37ac6(), f9Var.z0());
        if (menuItem.getGroupId() == -1) {
            s07 = f9Var.W0();
        }
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
        if (itemId != 103) {
            if (itemId != 124) {
                if (itemId == 137) {
                    java.lang.String str = "65_" + c01.id.c();
                    ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(s07);
                    su4.j2 j2Var = new su4.j2();
                    j2Var.f494471a = dVar.g();
                    j2Var.f494472b = 65;
                    j2Var.f494474d = s07;
                    j2Var.f494475e = str;
                    j2Var.f494476f = true;
                    j2Var.f494479i = false;
                    j2Var.f494486p = true;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
                } else if (itemId == 152) {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) cVar.a(sb5.l2.class))).o0(f9Var);
                } else {
                    if (itemId == 179) {
                        qn4.y.c(dVar.g(), f9Var, null, dVar);
                        return true;
                    }
                    switch (itemId) {
                        case 119:
                            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) cVar.a(sb5.q2.class))).w0(true);
                            return true;
                        case 120:
                            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) cVar.a(sb5.q2.class))).w0(false);
                            return true;
                        case 121:
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionSpeech2TextSnd.k(dVar.g(), null)) {
                                return true;
                            }
                            if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.f286133b || !com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.a(f9Var, dVar)) {
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.d(menuItem.getGroupId(), dVar, f9Var, xmVar, false);
                                return true;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "onContextItemSelected: cancel trancform text");
                            java.lang.String x17 = dVar.x();
                            yd5.r rVar = yd5.r.f542680a;
                            yd5.r.f542680a.b("hover_win_cancel_convert_text", "view_clk", f9Var, x17);
                            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) cVar.a(sb5.k2.class))).p0(f9Var, true, menuItem.getGroupId(), 1);
                            return true;
                        default:
                            switch (itemId) {
                                case 141:
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s07)) {
                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(s07);
                                    }
                                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.e(8, f9Var);
                                    return true;
                                case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf /* 142 */:
                                    android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                                    if (f9Var.X2()) {
                                        intent.putExtra("Retr_Msg_content", s07);
                                        intent.putExtra("Retr_Msg_Type", 6);
                                    } else {
                                        intent.putExtra("Retr_Msg_content", s07);
                                        intent.putExtra("Retr_Msg_Type", 4);
                                    }
                                    intent.putExtra("scene_from", 17);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    arrayList.add(intent);
                                    java.util.Collections.reverse(arrayList);
                                    yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    dVar.a0((android.content.Intent) arrayList.get(0));
                                    yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.e(9, f9Var);
                                    return true;
                                case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd /* 143 */:
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, s07, 1);
                                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = dVar.f542250l;
                                    am.c4 c4Var = c5303xc75d2f73.f135623g;
                                    c4Var.f87857j = abstractC21611x7536149b;
                                    c4Var.f87860m = 43;
                                    r45.bq0 bq0Var = c4Var.f87848a;
                                    if (bq0Var != null) {
                                        r45.jq0 jq0Var = bq0Var.f452495d;
                                        if (jq0Var != null) {
                                            jq0Var.e(c01.z1.r());
                                            jq0Var.j(f9Var.Q0());
                                            c5303xc75d2f73.e();
                                        }
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemVoice", "transform text fav failed");
                                    }
                                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.e(10, f9Var);
                                    return true;
                                default:
                                    switch (itemId) {
                                        case 165:
                                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.f(menuItem.getGroupId(), dVar, f9Var);
                                            break;
                                    }
                            }
                    }
                }
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) cVar.a(sb5.l2.class))).t0(menuItem, f9Var);
        } else {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) cVar.a(sb5.q2.class))).m0(f9Var);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        java.lang.Class cls;
        int i17;
        int i18;
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 localMsg = dVar.f475787d.f526833b;
        yb5.d dVar2 = this.f285674s;
        if (dVar2 != null) {
            java.lang.String x17 = dVar2.x();
            yd5.r rVar = yd5.r.f542680a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localMsg, "localMsg");
            yd5.r.f542680a.b("chat_voice_msg_menu_hover", "view_exp", localMsg, x17);
        }
        if (c01.d9.b().E()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) view.getTag();
            int d17 = goVar.d();
            int i19 = goVar.R;
            if (i19 == 1) {
                long j17 = new w21.u0(localMsg.j()).f524013b;
                if ((j17 == 0 && localMsg.A0() == 0) || (localMsg.P0() == 1 && localMsg.A0() == 1)) {
                    cls = sb5.k2.class;
                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.hjg;
                } else if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) this.f285674s.f542241c.a(sb5.q2.class))).f281398e) {
                    java.lang.String string = view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.az7);
                    cls = sb5.k2.class;
                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.hjg;
                    g4Var.c(d17, 120, 0, string, com.p314xaae8f345.mm.R.raw.f79947x15bb39c8);
                } else {
                    cls = sb5.k2.class;
                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.hjg;
                    g4Var.c(d17, 119, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.az6), com.p314xaae8f345.mm.R.raw.f79714x614cd13e);
                }
                if (localMsg.P0() == 5) {
                    g4Var.c(d17, 103, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5i), com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3);
                }
                j45.l.g("favorite");
                g4Var.c(d17, 116, 0, view.getContext().getString(i17), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
                boolean z19 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.f286133b;
                if (z19) {
                    g4Var.c(d17, 165, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7t), com.p314xaae8f345.mm.R.raw.f80348xa3a22067);
                }
                if (!localMsg.t2() && localMsg.g3() && ((localMsg.K1() || localMsg.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(localMsg, this.f285674s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(localMsg.Q0()))) {
                    g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
                }
                sb5.k2 k2Var = (sb5.k2) this.f285674s.f542241c.a(cls);
                if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.a(localMsg, this.f285674s)) {
                    i18 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var).q0(localMsg.m124847x74d37ac6()) ? -1 : com.p314xaae8f345.mm.R.C30867xcad56011.b4b;
                    z17 = false;
                } else if (z19) {
                    yb5.d dVar3 = this.f285674s;
                    if (dVar3 != null) {
                        java.lang.String x18 = dVar3.x();
                        yd5.r rVar2 = yd5.r.f542680a;
                        yd5.r.f542680a.b("hover_win_cancel_convert_text", "view_exp", localMsg, x18);
                    }
                    z17 = true;
                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.n7u;
                } else {
                    boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var).s0(localMsg.m124847x74d37ac6(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(localMsg)));
                    i18 = !K0 ? com.p314xaae8f345.mm.R.C30867xcad56011.n7u : com.p314xaae8f345.mm.R.C30867xcad56011.b4b;
                    z17 = !K0;
                }
                if (!c01.e2.G(localMsg.Q0()) || (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("en")) || i18 == -1)) {
                    z18 = false;
                } else {
                    g4Var.c(d17, 121, 0, view.getContext().getString(i18), z17 ? com.p314xaae8f345.mm.R.raw.f79937x61b7c919 : com.p314xaae8f345.mm.R.raw.f79936x2dbb88e9);
                    z18 = true;
                }
                if ((j17 != 0 || localMsg.A0() != 0) && ((localMsg.P0() != 1 || localMsg.A0() != 1) && !this.f285674s.F())) {
                    g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3r), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                }
                if (!z18 && ((com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("en")) && i18 != -1)) {
                    g4Var.c(d17, 121, 0, view.getContext().getString(i18), z17 ? com.p314xaae8f345.mm.R.raw.f79937x61b7c919 : com.p314xaae8f345.mm.R.raw.f79936x2dbb88e9);
                }
                return true;
            }
            if (i19 == 2 || i19 == 3) {
                if (i19 == 3) {
                    d17 = -1;
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) this.f285674s.f542241c.a(sb5.k2.class));
                if (xmVar.t0(localMsg.m124847x74d37ac6()) == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transforming) {
                    g4Var.add(d17, 121, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f572407b45);
                    return false;
                }
                java.lang.String s07 = xmVar.s0(localMsg.m124847x74d37ac6(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(localMsg));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s07)) {
                    g4Var.c(d17, 141, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
                    int i27 = d17;
                    g4Var.c(i27, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
                    j45.l.g("favorite");
                    g4Var.c(i27, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
                }
                if (goVar.R == 2) {
                    if (com.p314xaae8f345.mm.app.p622xc5476f33.k.a() && com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.d(s07)) {
                        if (localMsg.i2() && localMsg.b2()) {
                            g4Var.c(d17, 163, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572408b46), com.p314xaae8f345.mm.R.raw.f81244x9739f9c3);
                        } else {
                            g4Var.c(d17, 124, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4a), com.p314xaae8f345.mm.R.raw.f79939xd3572d36);
                        }
                    }
                    g4Var.c(d17, 121, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7u), com.p314xaae8f345.mm.R.raw.f79937x61b7c919);
                } else {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572408b46), com.p314xaae8f345.mm.R.raw.f81244x9739f9c3);
                    g4Var.c(d17, 164, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsg), com.p314xaae8f345.mm.R.raw.f80466xfeba7d4f);
                    qn4.y.a(g4Var, d17, view.getContext(), localMsg);
                    g4Var.c(d17, 152, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3s), com.p314xaae8f345.mm.R.raw.f79736xffb29de6);
                }
                g4Var.c(d17, 137, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572406b44), com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca);
                return false;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        d0(view, dVar, f9Var, (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag(), null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean a0() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).m0(f9Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ip.a(f9Var, context, qVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar;
        java.lang.String str2;
        android.text.SpannableString spannableString;
        yb5.d dVar3;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f285674s = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp) g0Var;
        lpVar.f286040e.m78867x600f4566(false);
        lpVar.f286040e.m78866x5f3d5ab3(dVar.D());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
        sb5.z zVar = (sb5.z) cVar.a(sb5.z.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp.e(this, lpVar, dVar2, lpVar, dVar, false, I(zVar, f9Var.m124847x74d37ac6()), u(dVar), this);
        sb5.k2 k2Var = (sb5.k2) cVar.a(sb5.k2.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.a(f9Var, dVar)) {
            java.lang.String s07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var).s0(f9Var.m124847x74d37ac6(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s07)) {
                str2 = s07;
                ioVar = ioVar2;
            } else {
                ioVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transformed;
                str2 = s07;
            }
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var;
            if (xmVar.q0(f9Var.m124847x74d37ac6())) {
                str2 = xmVar.s0(f9Var.m124847x74d37ac6(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var));
                ioVar = xmVar.t0(f9Var.m124847x74d37ac6());
            } else {
                ioVar = ioVar2;
                str2 = null;
            }
        }
        android.widget.TextView textView = lpVar.f286058w;
        if (textView != null) {
            textView.setTag(lpVar.f286039d.getTag());
            lpVar.f286058w.setOnLongClickListener(u(dVar));
            lpVar.f286058w.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) cVar.a(sb5.z.class))).B1);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && ioVar == ioVar2) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5 = lpVar.f286043h;
            if (c21917xeb4fc2b5 != null) {
                c21917xeb4fc2b5.setVisibility(8);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b52 = lpVar.f286044i;
                if (c21917xeb4fc2b52 != null) {
                    c21917xeb4fc2b52.setVisibility(8);
                }
            }
            dVar3 = dVar;
        } else {
            if (lpVar.f286043h == null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b53 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5) lpVar.f286042g.inflate();
                lpVar.f286043h = c21917xeb4fc2b53;
                c21917xeb4fc2b53.setMinimumWidth(lpVar.f286037b - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 5));
                lpVar.f286043h.c();
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = lpVar.f286053r.getContext();
            int m84164x40077844 = (int) lpVar.f286043h.m80028xc2a54588().m84164x40077844();
            java.lang.String a17 = c01.n2.a("" + f9Var.I0());
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("prePublishId", "msg_" + f9Var.I0());
            c17.i("preUsername", A(this.f285674s, f9Var));
            c17.i("preChatName", z(this.f285674s, f9Var));
            android.text.SpannableString rj6 = ((ke0.e) xVar).rj(context, str2, m84164x40077844, 1, null, a17);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk jkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) cVar.a(sb5.u1.class));
            if (jkVar.m0(f9Var.m124847x74d37ac6())) {
                java.util.ArrayList arrayList = jkVar.f280833n;
                p13.g gVar = p13.g.Background;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c.f219557b;
                p13.i a18 = p13.i.a(rj6, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, " "), false, false);
                a18.f432630e = gVar;
                a18.f432631f = i17;
                spannableString = new android.text.SpannableString(o13.q.e(a18).f432638a);
            } else {
                spannableString = rj6;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b54 = lpVar.f286043h;
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var).getClass();
            java.util.ArrayList arrayList2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm.f281784v;
            java.lang.String str3 = str2;
            c21917xeb4fc2b54.f(spannableString, ioVar, arrayList2.contains(java.lang.Long.valueOf(m124847x74d37ac6)), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ho.Voice, f9Var.m124847x74d37ac6(), dVar);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannableString) && arrayList2.contains(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) {
                arrayList2.remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            }
            dVar3 = dVar;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u17 = u(dVar3);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go(dVar2, dVar.D(), lpVar, null);
            goVar.R = 2;
            lpVar.f286043h.m80028xc2a54588().setTag(goVar);
            lpVar.f286043h.setVisibility(0);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                lpVar.f286043h.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1);
                lpVar.f286043h.m80031x74caf26a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ep(this, str3, dVar3, f9Var));
                if (lpVar.f286045j == null) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.l(dVar3, lpVar, f9Var, u17, x(u17));
                }
            }
            if (com.p314xaae8f345.mm.app.p622xc5476f33.k.a()) {
                java.lang.String W0 = (f9Var.i2() && f9Var.b2()) ? f9Var.W0() : null;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io v07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) cVar.a(sb5.l2.class))).v0(f9Var);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = dVar2.f475787d.f526833b;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W0) && v07 == ioVar2) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b55 = lpVar.f286044i;
                    if (c21917xeb4fc2b55 != null) {
                        c21917xeb4fc2b55.setVisibility(8);
                    }
                } else {
                    if (lpVar.f286044i == null) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b56 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5) lpVar.f286041f.inflate();
                        lpVar.f286044i = c21917xeb4fc2b56;
                        c21917xeb4fc2b56.c();
                    }
                    lpVar.f286044i.e(W0, v07, f9Var2.m124847x74d37ac6());
                    lpVar.f286044i.m80030x6e632093(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var2.U0()) ? this.f285674s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxn) : f9Var2.U0());
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u18 = u(this.f285674s);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W0)) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar2 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go(dVar2, this.f285674s.D(), lpVar, null);
                        goVar2.R = 3;
                        lpVar.f286044i.m80028xc2a54588().setTag(goVar2);
                        lpVar.f286044i.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f285674s.f542241c.a(sb5.z.class))).B1);
                        lpVar.f286044i.setVisibility(0);
                    }
                    if (lpVar.f286047l == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(wl5.y.o(lpVar.f286044i.m80028xc2a54588()))) {
                        yb5.d dVar4 = this.f285674s;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.m(dVar4, lpVar, f9Var2, u18, x(u(dVar4)));
                    }
                }
            }
        }
        if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) cVar.a(sb5.e.class))).p0()) {
            lpVar.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b9l);
        } else if (com.p314xaae8f345.mm.ui.bk.C()) {
            lpVar.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_o);
        } else {
            lpVar.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_p);
        }
        lpVar.B.setTextSize(0, i65.a.f(dVar.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        android.widget.TextView textView2 = lpVar.f286039d;
        textView2.setPadding(textView2.getPaddingLeft(), lpVar.f286039d.getPaddingTop(), dVar.g().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), lpVar.f286039d.getPaddingBottom());
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f c21466x35c7836f = lpVar.f286040e;
        c21466x35c7836f.setPadding(c21466x35c7836f.getPaddingLeft(), lpVar.f286040e.getPaddingTop(), dVar.g().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), lpVar.f286040e.getPaddingBottom());
        lpVar.A.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fp(this, lpVar, dVar3, f9Var));
        android.widget.ProgressBar progressBar = lpVar.f286057v;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            if (f9Var.P0() >= 2) {
                lpVar.f286057v.setVisibility(8);
            }
        }
        V(lpVar, dVar2, dVar.t(), dVar.D(), dVar, this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ip ipVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ip) f9Var.f275460g2;
        lf5.f.f400067a.a(dVar, f9Var, lpVar, this, ipVar.f285739d, ipVar.f285740e);
    }
}
