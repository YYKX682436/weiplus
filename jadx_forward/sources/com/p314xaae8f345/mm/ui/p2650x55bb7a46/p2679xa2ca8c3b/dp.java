package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class dp extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285352s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View.OnClickListener f285353t;

    public static boolean d0(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        android.widget.RelativeLayout relativeLayout;
        if (f9Var.P0() == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "onItemClick msg(%s) fail", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            return true;
        }
        if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.n(f9Var)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class));
            roVar.f281402i = f9Var.m124847x74d37ac6();
            roVar.f281403m = new java.lang.ref.WeakReference(view);
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).q0(f9Var.m124847x74d37ac6())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "onItemClick: voice msg show download animation");
                return true;
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).f281404n.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Boolean.TRUE);
            if (((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).bj()) {
                ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).Zi(new cg0.a(f9Var.z0(), f9Var.Q0(), f9Var.m124847x74d37ac6(), f9Var.I0(), f9Var.mo78012x3fdd41df()));
            } else {
                w21.p0.Bi().e();
            }
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cp(dVar));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "onItemClick voice msg(%s) no finish download!", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            return true;
        }
        if (erVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "onItemClick tag(%s) is null", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            return true;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class));
        if (roVar2.f281411u == f9Var.m124847x74d37ac6()) {
            roVar2.f281407q.set(true);
            android.view.View O0 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) roVar2.f280113d.f542241c.a(sb5.z.class))).O0(roVar2.f281411u);
            if (O0 != null && (relativeLayout = (android.widget.RelativeLayout) O0.findViewById(com.p314xaae8f345.mm.R.id.blv)) != null) {
                roVar2.f281411u = -1L;
                relativeLayout.setVisibility(8);
            }
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).f281402i = 0L;
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(erVar.c());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.h(dVar, erVar, c16565x9bc03d4e);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) dVar.f542241c.a(sb5.k2.class))).A0(2);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).f281871i = true;
        te5.t.i(dVar, f9Var, 0);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) dVar.f542241c.a(sb5.k2.class))).getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0.s0(f9Var.m124847x74d37ac6(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var)))) {
            e0(4, f9Var);
        }
        return true;
    }

    public static void e0(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        long j17;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "msgInfo is null???");
            return;
        }
        try {
            j17 = new w21.u0(f9Var.j()).f524013b;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemVoice", "get voice duration failed");
            j17 = 0;
        }
        java.lang.String str = "";
        try {
            w21.w0 D0 = w21.p0.Di().D0(f9Var.I0());
            if (D0 != null) {
                java.lang.String str2 = D0.f524020d;
                if (str2 != null) {
                    str = str2;
                }
            }
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemVoice", "get voice clientId failed");
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6794x3956ffd7 c6794x3956ffd7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6794x3956ffd7();
        c6794x3956ffd7.f141259d = i17;
        c6794x3956ffd7.f141260e = c6794x3956ffd7.b("VoiceID", str, true);
        c6794x3956ffd7.f141261f = j17;
        c6794x3956ffd7.n();
        c6794x3956ffd7.k();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570054vv);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp();
        lpVar.b(xgVar, true, false);
        xgVar.setTag(lpVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0051. Please report as an issue. */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) dVar.f542241c.a(sb5.k2.class));
        java.lang.String s07 = xmVar.s0(f9Var.m124847x74d37ac6(), f9Var.z0());
        if (menuItem.getGroupId() == -1) {
            s07 = f9Var.W0();
        }
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
        if (itemId == 100) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) cVar.a(sb5.q2.class));
            roVar.getClass();
            if (f9Var.g3() && (o07 = roVar.o0()) != null && f9Var.m124847x74d37ac6() == o07.f284299i) {
                o07.J(true);
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) cVar.a(sb5.q2.class));
            roVar2.f281412v = true;
            roVar2.x0();
        } else if (itemId != 103) {
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
                                e0(3, f9Var);
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.d(menuItem.getGroupId(), dVar, f9Var, xmVar, true);
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
                                    break;
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
                                    yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    dVar.a0((android.content.Intent) arrayList.get(0));
                                    yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.e(9, f9Var);
                                    break;
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
                                            jq0Var.e(f9Var.Q0());
                                            jq0Var.j(c01.z1.r());
                                            c5303xc75d2f73.e();
                                        }
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemVoice", "transform text fav failed");
                                    }
                                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.e(10, f9Var);
                                    break;
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
        int i19;
        boolean z18;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 localMsg = dVar.f475787d.f526833b;
        yb5.d dVar2 = this.f285352s;
        if (dVar2 != null) {
            java.lang.String x17 = dVar2.x();
            yd5.r rVar = yd5.r.f542680a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localMsg, "localMsg");
            yd5.r.f542680a.b("chat_voice_msg_menu_hover", "view_exp", localMsg, x17);
        }
        if (c01.d9.b().E()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) view.getTag();
            int d17 = goVar.d();
            int i27 = goVar.R;
            if (i27 == 1) {
                if ((new w21.u0(localMsg.j()).f524013b != 0 || localMsg.A0() != 0) && (localMsg.P0() != 1 || localMsg.A0() != 1)) {
                    java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(26, null);
                    if (bool == null) {
                        bool = java.lang.Boolean.FALSE;
                    }
                    if (bool.booleanValue()) {
                        java.lang.String string = view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.az7);
                        i18 = 2;
                        cls = sb5.k2.class;
                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.hjg;
                        g4Var.c(d17, 120, 0, string, com.p314xaae8f345.mm.R.raw.f79947x15bb39c8);
                    } else {
                        cls = sb5.k2.class;
                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.hjg;
                        i18 = 2;
                        g4Var.c(d17, 119, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.az6), com.p314xaae8f345.mm.R.raw.f79714x614cd13e);
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(localMsg.Q0(), true);
                    boolean z19 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(localMsg.Q0()) || c01.e2.D(localMsg.Q0()) || n17 == null || n17.k2()) ? false : true;
                    j45.l.g("favorite");
                    g4Var.c(d17, 116, 0, view.getContext().getString(i17), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
                    boolean z27 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.f286133b;
                    if (z27) {
                        g4Var.c(d17, 165, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7t), com.p314xaae8f345.mm.R.raw.f80348xa3a22067);
                    }
                    if (z19) {
                        if ((r01.q3.cj().u1(i18) > 0) && !this.f285352s.F()) {
                            g4Var.add(d17, 114, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3l));
                        }
                    }
                    sb5.k2 k2Var = (sb5.k2) this.f285352s.f542241c.a(cls);
                    if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.a(localMsg, this.f285352s)) {
                        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var).q0(localMsg.m124847x74d37ac6())) {
                            z17 = false;
                            i19 = -1;
                        }
                        i19 = com.p314xaae8f345.mm.R.C30867xcad56011.b4b;
                        z17 = false;
                    } else if (z27) {
                        yb5.d dVar3 = this.f285352s;
                        if (dVar3 != null) {
                            java.lang.String x18 = dVar3.x();
                            yd5.r rVar2 = yd5.r.f542680a;
                            yd5.r.f542680a.b("hover_win_cancel_convert_text", "view_exp", localMsg, x18);
                        }
                        z17 = true;
                        i19 = com.p314xaae8f345.mm.R.C30867xcad56011.n7u;
                    } else {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var).s0(localMsg.m124847x74d37ac6(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(localMsg)))) {
                            i19 = -1;
                            z17 = false;
                        }
                        i19 = com.p314xaae8f345.mm.R.C30867xcad56011.b4b;
                        z17 = false;
                    }
                    if (!c01.e2.G(localMsg.Q0()) || (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("en")) || i19 == -1)) {
                        z18 = false;
                    } else {
                        g4Var.c(d17, 121, 0, view.getContext().getString(i19), z17 ? com.p314xaae8f345.mm.R.raw.f79937x61b7c919 : com.p314xaae8f345.mm.R.raw.f79936x2dbb88e9);
                        z18 = true;
                    }
                    if (!this.f285352s.F()) {
                        g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3r), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                    }
                    if (!z18 && ((com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("en")) && i19 != -1)) {
                        g4Var.c(d17, 121, 0, view.getContext().getString(i19), z17 ? com.p314xaae8f345.mm.R.raw.f79937x61b7c919 : com.p314xaae8f345.mm.R.raw.f79936x2dbb88e9);
                    }
                }
                return true;
            }
            if (i27 == 2 || i27 == 3) {
                if (i27 == 3) {
                    d17 = -1;
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) this.f285352s.f542241c.a(sb5.k2.class));
                if (xmVar.t0(localMsg.m124847x74d37ac6()) == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transforming) {
                    g4Var.add(d17, 121, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f572407b45);
                    return false;
                }
                java.lang.String s07 = xmVar.s0(localMsg.m124847x74d37ac6(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(localMsg));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s07)) {
                    g4Var.c(d17, 141, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
                    int i28 = d17;
                    g4Var.c(i28, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
                    j45.l.g("favorite");
                    g4Var.c(i28, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
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
    public boolean c0(yb5.d dVar) {
        return dVar.D();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.P0() == 5) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.m124847x74d37ac6());
            Li.l1(Li.F | 8192);
            w21.u0 u0Var = new w21.u0(Li.j());
            u0Var.f524014c = false;
            Li.d1(u0Var.b());
            Li.r1(3);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), Li, true);
            w21.w0 D0 = w21.p0.Di().D0(f9Var.I0());
            if (D0.f524024h == 0) {
                D0.f524025i = 5;
            } else {
                D0.f524025i = 6;
            }
            D0.f524027k = java.lang.System.currentTimeMillis() / 1000;
            D0.f524038v = 1;
            D0.f524017a = 1048896;
            w21.x0.w(D0);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).f281404n.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Boolean.TRUE);
            if (((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).bj()) {
                ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).Zi(new cg0.a(f9Var.z0(), f9Var.Q0(), f9Var.m124847x74d37ac6(), f9Var.I0(), f9Var.mo78012x3fdd41df()));
            } else {
                w21.p0.Bi().e();
            }
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bp(this, dVar));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "onStateBtnClick voice msg(%s) re-download!", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ip.a(f9Var, context, qVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar;
        java.lang.String str2;
        java.lang.String s07;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io t07;
        android.text.SpannableString spannableString;
        java.lang.String str3;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar;
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f285352s = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp) g0Var;
        lpVar.f286040e.m78867x600f4566(true);
        lpVar.f286040e.m78866x5f3d5ab3(dVar.D());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar2 = dVar.f542241c;
        sb5.z zVar = (sb5.z) cVar2.a(sb5.z.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp.e(this, lpVar, dVar2, lpVar, dVar, true, I(zVar, f9Var.m124847x74d37ac6()), u(dVar), this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform;
        sb5.k2 k2Var = (sb5.k2) cVar2.a(sb5.k2.class);
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.a(f9Var, dVar)) {
            s07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var).s0(f9Var.m124847x74d37ac6(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s07)) {
                str2 = s07;
                ioVar = ioVar2;
            } else {
                t07 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transformed;
                str2 = s07;
                ioVar = t07;
            }
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var;
            if (xmVar.q0(f9Var.m124847x74d37ac6())) {
                s07 = xmVar.s0(f9Var.m124847x74d37ac6(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var));
                t07 = xmVar.t0(f9Var.m124847x74d37ac6());
                str2 = s07;
                ioVar = t07;
            } else {
                ioVar = ioVar2;
                str2 = null;
            }
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
            i17 = 8;
            cVar = cVar2;
            str3 = null;
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
            c17.i("preUsername", A(this.f285352s, f9Var));
            c17.i("preChatName", z(this.f285352s, f9Var));
            android.text.SpannableString rj6 = ((ke0.e) xVar).rj(context, str2, m84164x40077844, 1, null, a17);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk jkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) cVar2.a(sb5.u1.class));
            if (jkVar.m0(f9Var.m124847x74d37ac6())) {
                java.util.ArrayList arrayList = jkVar.f280833n;
                p13.g gVar = p13.g.Background;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c.f219557b;
                p13.i a18 = p13.i.a(rj6, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, " "), false, false);
                a18.f432630e = gVar;
                a18.f432631f = i18;
                spannableString = new android.text.SpannableString(o13.q.e(a18).f432638a);
            } else {
                spannableString = rj6;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b54 = lpVar.f286043h;
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var).getClass();
            java.util.ArrayList arrayList2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm.f281784v;
            java.lang.String str4 = str2;
            str3 = null;
            c21917xeb4fc2b54.f(spannableString, ioVar, arrayList2.contains(java.lang.Long.valueOf(m124847x74d37ac6)), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ho.Voice, f9Var.m124847x74d37ac6(), dVar);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannableString) && arrayList2.contains(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) {
                arrayList2.remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u17 = u(dVar);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go(dVar2, dVar.D(), lpVar, null);
            goVar.R = 2;
            lpVar.f286043h.m80028xc2a54588().setTag(goVar);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b55 = lpVar.f286043h;
            if (this.f285353t == null) {
                this.f285353t = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ap(this);
            }
            c21917xeb4fc2b55.setOnClickListener(this.f285353t);
            lpVar.f286043h.setVisibility(0);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                lpVar.f286043h.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1);
                lpVar.f286043h.m80031x74caf26a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xo(this, str4, dVar, f9Var));
                if (lpVar.f286045j == null) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.l(dVar, lpVar, f9Var, u17, x(u17));
                }
            }
            if (com.p314xaae8f345.mm.app.p622xc5476f33.k.a()) {
                java.lang.String W0 = (f9Var.i2() && f9Var.b2()) ? f9Var.W0() : null;
                cVar = cVar2;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io v07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) cVar.a(sb5.l2.class))).v0(f9Var);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = dVar2.f475787d.f526833b;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W0) && v07 == ioVar2) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b56 = lpVar.f286044i;
                    i17 = 8;
                    if (c21917xeb4fc2b56 != null) {
                        c21917xeb4fc2b56.setVisibility(8);
                    }
                } else {
                    i17 = 8;
                    if (lpVar.f286044i == null) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b57 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5) lpVar.f286041f.inflate();
                        lpVar.f286044i = c21917xeb4fc2b57;
                        c21917xeb4fc2b57.c();
                    }
                    lpVar.f286044i.e(W0, v07, f9Var2.m124847x74d37ac6());
                    lpVar.f286044i.m80030x6e632093(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var2.U0()) ? this.f285352s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxn) : f9Var2.U0());
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u18 = u(this.f285352s);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W0)) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar2 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go(dVar2, this.f285352s.D(), lpVar, null);
                        goVar2.R = 3;
                        lpVar.f286044i.m80028xc2a54588().setTag(goVar2);
                        lpVar.f286044i.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f285352s.f542241c.a(sb5.z.class))).B1);
                        lpVar.f286044i.setOnLongClickListener(u18);
                        lpVar.f286044i.setVisibility(0);
                    }
                    if (lpVar.f286047l == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(wl5.y.o(lpVar.f286044i.m80028xc2a54588()))) {
                        yb5.d dVar3 = this.f285352s;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.m(dVar3, lpVar, f9Var2, u18, x(u(dVar3)));
                    }
                }
            } else {
                cVar = cVar2;
                i17 = 8;
            }
        }
        if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) cVar.a(sb5.e.class))).p0()) {
            lpVar.f286061z.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b9l);
            lpVar.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b9l);
        } else if (com.p314xaae8f345.mm.ui.bk.C()) {
            lpVar.f286061z.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_o);
            lpVar.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_o);
        } else {
            lpVar.f286061z.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_p);
            lpVar.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_p);
        }
        lpVar.f286061z.setTextSize(0, i65.a.f(dVar.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        lpVar.B.setTextSize(0, i65.a.f(dVar.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        lpVar.f286039d.setPadding(dVar.g().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), lpVar.f286039d.getPaddingTop(), lpVar.f286039d.getPaddingRight(), lpVar.f286039d.getPaddingBottom());
        lpVar.f286040e.setPadding(dVar.g().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), lpVar.f286040e.getPaddingTop(), lpVar.f286040e.getPaddingRight(), lpVar.f286040e.getPaddingBottom());
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) cVar.a(sb5.q2.class))).f281411u == f9Var.m124847x74d37ac6()) {
            lpVar.f286060y.setVisibility(0);
        } else {
            lpVar.f286060y.setVisibility(i17);
        }
        lpVar.f286060y.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.yo(this, f9Var, lpVar, dVar, k2Var));
        lpVar.A.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zo(this, lpVar, dVar, f9Var));
        long j17 = new w21.u0(f9Var.j()).f524013b;
        if (j17 == 0) {
            lpVar.f39499x8eebed7e.setVisibility(i17);
        } else {
            boolean z17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) cVar.a(sb5.q2.class))).s0(f9Var.m124847x74d37ac6()) || w21.x0.n(f9Var);
            lpVar.f39499x8eebed7e.setVisibility(z17 ? i17 : 0);
            ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
            int m17 = (int) w21.x0.m(j17);
            if (z17) {
                java.lang.CharSequence s08 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2) ((sb5.n) cVar.a(sb5.n.class))).s0(dVar.x());
                la5.b.f399133a.a(lpVar.f286039d, m17, s08 == null ? str3 : s08.toString());
            } else {
                lpVar.f286039d.setContentDescription(java.lang.String.format(dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9h), java.lang.Integer.valueOf(m17)));
            }
        }
        java.lang.String str5 = f9Var.E;
        if (str5 == null || str5.length() == 0) {
            lpVar.f286056u.setVisibility(i17);
        } else {
            lpVar.f286056u.setVisibility(0);
            G(dVar, lpVar.f286056u, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er.a(str5));
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ip ipVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ip) f9Var.f275460g2;
        lf5.f.f400067a.a(dVar, f9Var, lpVar, this, ipVar.f285739d, ipVar.f285740e);
    }
}
