package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class s4 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f284191a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 f284192b;

    public s4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var) {
        this.f284192b = h4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void C() {
        c01.d9.b().p().w(81, java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(h4Var.f283178j.g())) {
            h4Var.A();
        } else {
            p21.i.b(h4Var.f283178j.g(), com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void a() {
        j45.l.j(this.f284192b.f283178j.g(), "subapp", ".ui.openapi.AddAppUI", new android.content.Intent(), null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void b() {
        java.util.HashSet c17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.j0 j0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.j0) ((sb5.h) this.f284192b.f283178j.f542241c.a(sb5.h.class));
        j0Var.getClass();
        android.content.Intent intent = new android.content.Intent(j0Var.f280113d.f542250l.mo7438x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(j0Var.f280113d.x()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(j0Var.f280113d.x())) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288319g, 1, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb));
        } else {
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288319g, 1, 2048, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb));
        }
        intent.putExtra("list_type", 4);
        intent.putExtra("received_card_name", j0Var.f280113d.x());
        ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).getClass();
        if (ih.a.b("clicfg_chatbot_hide_card_list", 0) == 0) {
            c17 = c01.e2.i();
            c17.add(c01.z1.r());
            c17.add("weixin");
        } else {
            c17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.c();
        }
        c17.add(j0Var.f280113d.x());
        intent.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J1(c17, ","));
        intent.putExtra("titile", j0Var.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 16);
        intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
        pf5.j0.a(intent, wb5.i.class);
        pf5.j0.a(intent, aj5.g1.class);
        pf5.j0.a(intent, aj5.i.class);
        pf5.j0.a(intent, cj5.u3.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        pf5.j0.a(intent, k50.g.class);
        intent.putExtra("ForwardParams_ForwardByUIC", true);
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        android.app.Activity context = j0Var.f280113d.f542250l.mo7438x76847179();
        dk5.b0 b0Var2 = (dk5.b0) b0Var;
        b0Var2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        b0Var2.Ai(context, intent);
        context.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void c(int i17) {
        int i18;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        if (i17 == 0) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity g17 = h4Var.f283178j.g();
            ((sb0.f) jVar).getClass();
            boolean a17 = j35.u.a(g17, "android.permission.CAMERA", 20, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkcamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), h4Var.f283178j.g());
            if (a17 && h4Var.z()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10923, 1, "", 3, h4Var.I());
                return;
            }
            return;
        }
        if (i17 != 1) {
            return;
        }
        java.lang.String string = h4Var.f283178j.g().getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getString("gallery", "1");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.a(19);
        boolean equalsIgnoreCase = string.equalsIgnoreCase("0");
        yb5.d dVar = h4Var.f283178j;
        if (equalsIgnoreCase) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = dVar.f542250l;
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.g(abstractC21611x7536149b, 200, 1, 0, 1, "", "", null);
        } else {
            java.lang.String t17 = dVar.t();
            java.lang.String x17 = dVar.x();
            android.content.Intent intent = new android.content.Intent();
            if (dVar.D()) {
                intent.putExtra("gallery_report_tag", 20);
            } else {
                intent.putExtra("gallery_report_tag", 21);
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(x17)) {
                intent.putExtra("album_business_tag", "album_business_byp");
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_c2c_img_use_start_activity_for_result, false)) {
                i18 = 217;
            } else {
                java.lang.String sessionId = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                intent.putExtra("album_query_session_id", sessionId);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk lkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk) ((sb5.w1) dVar.f542241c.a(sb5.w1.class));
                lkVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SendImgComponent", "registerAlbumCallback %s", sessionId);
                o23.b bVar = o23.b.f423944a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
                java.util.HashMap hashMap = o23.b.f423945b;
                hashMap.put(sessionId, new java.lang.ref.WeakReference(lkVar));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumResultDispatcher", "registerCallback: count " + hashMap.size());
                i18 = -1;
            }
            int i19 = i18;
            r15.b m75465xd0d4a36c = h4Var.f283169a.m75465xd0d4a36c();
            if (m75465xd0d4a36c != null) {
                ok5.d.b(intent, "key_quote_extcommon", m75465xd0d4a36c, new ok5.h());
            }
            if (h4Var.f283177i && com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.f283168w) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.O4(x17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(x17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(x17)) {
                    if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20008xbd34347e()) == 1) {
                        pf5.j0.a(intent, i33.h.class);
                    }
                    boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19989xd599637f()) == 1;
                    boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19987xd315d07f()) == 1;
                    if (z18) {
                        intent.putExtra("Gallery_LivePhoto_Need_Query", true);
                        intent.putExtra("Gallery_LivePhoto_Auto_Enable", z19);
                    }
                    vb0.o oVar2 = (vb0.o) i95.n0.c(vb0.o.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b2 = dVar.f542250l;
                    int Ri = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_gallery_select_limit, bm5.h0.RepairerConfig_Media_C2CGallerySelectLimit_Int, 9);
                    ((ub0.r) oVar2).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.g(abstractC21611x7536149b2, i19, Ri, 3, 3, t17, x17, intent);
                } else {
                    intent.putExtra("key_enable_send_as_file", com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(x17));
                    vb0.o oVar3 = (vb0.o) i95.n0.c(vb0.o.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b3 = dVar.f542250l;
                    ((ub0.r) oVar3).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.g(abstractC21611x7536149b3, i19, 9, 3, 3, t17, x17, intent);
                }
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(x17)) {
                vb0.o oVar4 = (vb0.o) i95.n0.c(vb0.o.class);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b4 = dVar.f542250l;
                ((ub0.r) oVar4).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.g(abstractC21611x7536149b4, i19, 9, 12, 1, t17, x17, intent);
            } else {
                vb0.o oVar5 = (vb0.o) i95.n0.c(vb0.o.class);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b5 = dVar.f542250l;
                ((ub0.r) oVar5).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.g(abstractC21611x7536149b5, i19, 9, 3, 1, t17, x17, intent);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13822, 2, 1);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14523, 0);
        this.f284192b.D();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void e() {
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le) ((sb5.x0) this.f284192b.f283178j.f542241c.a(sb5.x0.class))).q0(true);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void f(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        nr4.a aVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f fVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f) ((sb5.b) this.f284192b.f283178j.f542241c.a(sb5.b.class));
        fVar.getClass();
        if (mVar == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "onAppSelected, info is null, %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return;
        }
        l75.e0 e0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m.f270516f2;
        if ("wxce6f23b478a3a2a2".equals(mVar.f67370x28d45f97) && (aVar = fVar.f280528e) != null) {
            aVar.a(2, fVar.f280113d.u().d1());
        }
        if (!mVar.G0()) {
            if (mVar.f67391x10a0fed7 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "onAppSeleted fail, app is in blacklist, packageName = " + mVar.f67386xa1e9e82c);
                return;
            } else {
                if (fVar.f280529f.c(mVar.f67386xa1e9e82c, mVar.f67384x996f3ea) || mVar.f67391x10a0fed7 != 5 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.S)) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", mVar.S);
                j45.l.j(fVar.f280113d.g(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
        }
        if (!mVar.G0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "serviceAppSelect not service app");
            return;
        }
        if (fVar.f280113d.u() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f280113d.u().d1())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "serviceAppSelect talker is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.AppMsgComponent", "serviceApp, jumpType[%d], package[%s], appid[%s]", java.lang.Integer.valueOf(mVar.f319924x1), mVar.f67386xa1e9e82c, mVar.f67370x28d45f97);
        if (mVar.f319924x1 == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f319914p1)) {
            fVar.m0(mVar);
            return;
        }
        int i17 = mVar.f319924x1;
        if (i17 != 3) {
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.AppMsgComponent", "JUMP NATIVE ForwardUrl[%s]", mVar.f319914p1);
                ((com.p314xaae8f345.mm.app.p622xc5476f33.j) o25.z1.a()).c(fVar.f280113d.f542250l.mo7438x76847179(), mVar.f319914p1, false, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e(fVar));
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67384x996f3ea)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ui().b(mVar.f67370x28d45f97);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP fail, openId is null, go get it");
        } else {
            if (fVar.f280529f == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67386xa1e9e82c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP fail");
                fVar.m0(mVar);
                return;
            }
            boolean c17 = fVar.f280529f.c(mVar.f67386xa1e9e82c, mVar.f67384x996f3ea);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP success[%s]", java.lang.Boolean.valueOf(c17));
            if (c17) {
                return;
            }
            fVar.m0(mVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void g() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("enterprise_scene", 4);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        intent.putExtra("enterprise_biz_name", h4Var.I());
        intent.putExtra("biz_chat_chat_id", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) h4Var.f283178j.f542241c.a(sb5.f.class))).w0());
        j45.l.j(h4Var.f283178j.g(), "brandservice", ".ui.EnterpriseBizContactPlainListUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void h(int i17, long j17) {
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        if (mo168058x74219ae7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(h4Var.f283178j.g());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "gotoRoomLiveEntrance");
        ss5.c0 c0Var = (ss5.c0) i95.n0.c(ss5.c0.class);
        android.app.Activity context = h4Var.f283178j.g();
        java.lang.String x17 = h4Var.f283178j.x();
        vd2.u0 u0Var = (vd2.u0) c0Var;
        u0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z17 = u0Var.f517460e;
        java.lang.String str = u0Var.f517459d;
        if (z17 || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14021x37325479.f190927w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startChatroomLive startingLive:" + u0Var.f517460e + ", isPendingPost:" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14021x37325479.f190927w);
            return;
        }
        u0Var.f517460e = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", i17);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", j17);
        intent.putExtra("ENTER_SCENE", 2);
        intent.putExtra("KEY_FROM_CHAT_ROOM_ID", x17);
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_START_ONLY_FROM_CHATROOM_VISIBLE_INT_SYNC, -1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "lastLiveStartOnlyFromChatRoomVisibleTag:" + intValue);
        if (intValue < 0) {
            intent.putExtra("KEY_WHITE_LIST_MODE_UNSELECT", true);
        } else if (intValue > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(x17);
            intent.putExtra("KEY_WHITE_ROOM_LIST", arrayList);
            intent.putExtra("KEY_WHITE_LIST_MODE", 2);
        } else {
            intent.putExtra("KEY_WHITE_LIST_MODE", 0);
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb.H7((c61.yb) c17, context, intent, 0L, null, 0, 0, false, 124, null);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14021x37325479.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/FinderChatroomLiveFeatureService", "startChatroomLive", "(Landroid/content/Context;Ljava/lang/String;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/FinderChatroomLiveFeatureService", "startChatroomLive", "(Landroid/content/Context;Ljava/lang/String;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        u0Var.f517460e = false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void i() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        sb5.f fVar = (sb5.f) h4Var.f283178j.f542241c.a(sb5.f.class);
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.String.valueOf(3));
        if (fVar != null && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar).f280286r) {
            arrayList.add(java.lang.String.valueOf(4));
            arrayList.add(java.lang.String.valueOf(7));
            arrayList.add(java.lang.String.valueOf(21));
            arrayList.add(java.lang.String.valueOf(32));
            arrayList.add(java.lang.String.valueOf(33));
            arrayList.add(java.lang.String.valueOf(9));
            arrayList.add(java.lang.String.valueOf(10));
            arrayList.add(java.lang.String.valueOf(11));
            arrayList.add(java.lang.String.valueOf(12));
            arrayList.add(java.lang.String.valueOf(13));
            arrayList.add(java.lang.String.valueOf(15));
            arrayList.add(java.lang.String.valueOf(16));
            arrayList.add(java.lang.String.valueOf(17));
            arrayList.add(java.lang.String.valueOf(18));
            arrayList.add(java.lang.String.valueOf(19));
            arrayList.add(java.lang.String.valueOf(20));
            arrayList.add(java.lang.String.valueOf(34));
            arrayList.add(java.lang.String.valueOf(24));
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(h4Var.f283172d.d1())) {
            arrayList.add(java.lang.String.valueOf(5));
            arrayList.add(java.lang.String.valueOf(7));
            arrayList.add(java.lang.String.valueOf(14));
            arrayList.add(java.lang.String.valueOf(18));
            arrayList.add(java.lang.String.valueOf(4));
            arrayList.add(java.lang.String.valueOf(9));
            arrayList.add(java.lang.String.valueOf(10));
            arrayList.add(java.lang.String.valueOf(11));
            arrayList.add(java.lang.String.valueOf(12));
            arrayList.add(java.lang.String.valueOf(15));
            arrayList.add(java.lang.String.valueOf(13));
            arrayList.add(java.lang.String.valueOf(16));
            arrayList.add(java.lang.String.valueOf(17));
            arrayList.add(java.lang.String.valueOf(19));
            arrayList.add(java.lang.String.valueOf(20));
        }
        intent.putExtra("key_to_user", h4Var.f283172d.d1());
        intent.putExtra("key_fav_item_id", android.text.TextUtils.join(",", arrayList));
        z30.u uVar = (z30.u) i95.n0.c(z30.u.class);
        android.app.Activity g17 = h4Var.f283178j.g();
        ((y30.q) uVar).getClass();
        o72.x1.L0(g17, ".ui.FavSelectUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14103, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void j() {
        qk.z zVar = new qk.z();
        zVar.f445645h = 17L;
        zVar.f445688a = 13;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingFooterEventImpl", "unable to get emoticon liteapp feature service");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(this.f284192b.f283178j.g(), zVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12065, 4);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void k(int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        if (iq.b.g(h4Var.f283178j.g()) || iq.b.C(h4Var.f283178j.g()) || iq.b.v(h4Var.f283178j.g()) || iq.b.z(h4Var.f283178j.g()) || iq.b.e(h4Var.f283178j.g())) {
            return;
        }
        h4Var.E(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void l(int i17, int i18) {
        boolean z17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yg ygVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yg) ((sb5.c1) this.f284192b.f283178j.f542241c.a(sb5.c1.class));
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(ygVar.f280113d.x()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(ygVar.f280113d.u().d1())) {
            z17 = (((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).bj(ygVar.f280113d.u().Q0(), 0) & 4096) == 0;
        } else {
            z17 = false;
        }
        boolean z18 = c01.e2.E(ygVar.f280113d.u().d1()) && (c01.z1.d() & 8) != 0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) ygVar.f280113d.g(), 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ug(ygVar, i17, i18, z18, z17);
        k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vg(ygVar, i17, i18);
        k0Var.v();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void m() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        if (h4Var.f283175g) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enter_scene", 1);
            intent.putExtra("chatroom_name", h4Var.I());
            j45.l.j(h4Var.f283178j.g(), "aa", ".ui.LaunchAAUI", intent, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void n() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        if (iq.b.v(h4Var.f283178j.g())) {
            return;
        }
        iq.b.s(h4Var.f283178j.g());
        if (iq.b.e(h4Var.f283178j.g())) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        java.lang.String I = h4Var.I();
        am.w00 w00Var = c6229x2bb765fe.f136476g;
        if (I.equals(w00Var.f89781d) || !(w00Var.f89779b || w00Var.f89780c)) {
            h4Var.B();
        } else {
            dp.a.m125853x26a183b(h4Var.f283178j.g(), w00Var.f89778a ? com.p314xaae8f345.mm.R.C30867xcad56011.aqg : com.p314xaae8f345.mm.R.C30867xcad56011.aqh, 0).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "voip is running, can't do this");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x026f, code lost:
    
        if (r6 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e7  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o() {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4.o():void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void p() {
        char c17;
        m53.v2 v2Var;
        m53.x2 x2Var;
        m53.r3 r3Var;
        java.lang.String a17;
        t53.k kVar = (t53.k) i95.n0.c(t53.k.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        android.app.Activity context = h4Var.f283178j.g();
        java.lang.String sessionId = h4Var.I();
        ((t53.m0) kVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.PluginGameLife", "enterSendGift sessionId[%s]", sessionId);
        f63.e eVar = (f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(sessionId);
        y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(eVar.t0());
        y53.m Di2 = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(eVar.v0());
        if (Di != null && Di2 != null) {
            long j17 = Di.f67426x9f600742;
            java.lang.String t07 = Di.t0();
            long j18 = Di2.f67426x9f600742;
            java.lang.String t08 = Di2.t0();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d c6633xea2e527d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d();
            c6633xea2e527d.f139873d = 3L;
            c6633xea2e527d.f139874e = 302L;
            c6633xea2e527d.f139875f = 2L;
            c6633xea2e527d.f139876g = 2L;
            c6633xea2e527d.f139877h = 301L;
            c6633xea2e527d.f139885p = c6633xea2e527d.b("SessionId", sessionId, true);
            c6633xea2e527d.f139880k = j17;
            c6633xea2e527d.f139881l = c6633xea2e527d.b("from_username", t07, true);
            c6633xea2e527d.f139882m = j18;
            c6633xea2e527d.f139883n = c6633xea2e527d.b("to_username", t08, true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ser_name", 4L);
            c6633xea2e527d.p(java.net.URLEncoder.encode(jSONObject.toString()));
            c6633xea2e527d.k();
        }
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        java.lang.String t09 = eVar.t0();
        java.lang.String v07 = eVar.v0();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) l1Var).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "fromUsername:%s, toUsername:%s", t09, v07);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t09) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v07)) {
            m53.l1 i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.i();
            if (i17 != null && (v2Var = i17.f405396h) != null && (x2Var = v2Var.f405657d) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "GiftEntranceType:%d", java.lang.Integer.valueOf(x2Var.f405702d));
                m53.x2 x2Var2 = i17.f405396h.f405657d;
                int i18 = x2Var2.f405702d;
                if (i18 != 1) {
                    if (i18 == 2 && (r3Var = x2Var2.f405704f) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3Var.f405538d)) {
                        java.lang.String str = i17.f405396h.f405657d.f405704f.f405539e;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                            a17 = "?from_username=" + java.net.URLEncoder.encode(t09) + "&to_username=" + java.net.URLEncoder.encode(v07);
                        } else {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put("from_username", t09);
                            hashMap.put("to_username", v07);
                            a17 = r53.f.a(str, hashMap);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "Gift Weapp, AppId:%s, Path:%s", i17.f405396h.f405657d.f405704f.f405538d, a17);
                        m53.r3 r3Var2 = i17.f405396h.f405657d.f405704f;
                        r53.f.w(context, r3Var2.f405538d, a17, r3Var2.f405540f);
                        c17 = 'G';
                    }
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x2Var2.f405703e)) {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("from_username", t09);
                    hashMap2.put("to_username", v07);
                    java.lang.String a18 = r53.f.a(i17.f405396h.f405657d.f405703e, hashMap2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "Gift jumpUrl:%s", a18);
                    r53.f.u(context, a18);
                    c17 = '(';
                }
                if (Di != null || Di2 == null) {
                }
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.d dVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.e.f149727a;
                if (c17 == '(') {
                    dVar.b(sessionId, Di.f67426x9f600742, Di.t0(), Di2.f67426x9f600742, Di2.t0(), 40L, 4L);
                    return;
                } else {
                    dVar.b(sessionId, Di.f67426x9f600742, Di.t0(), Di2.f67426x9f600742, Di2.t0(), 71L, 4L);
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameExternalService", "no Gift info");
        }
        c17 = 65535;
        if (Di != null) {
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void q() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        if (iq.b.C(h4Var.f283178j.g())) {
            return;
        }
        yb5.d dVar = h4Var.f283178j;
        if (iq.b.v(dVar.g()) || iq.b.e(dVar.g())) {
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity g17 = dVar.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.RECORD_AUDIO", 81, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), dVar.g());
        if (a17) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm) ((sb5.j2) dVar.f542241c.a(sb5.j2.class))).o0(false);
            h4Var.f283169a.m75483x4f8b3b49(8);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void r() {
        int r17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(12097, 11, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        g0Var.d(11850, 4, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        sb6.append(h4Var.f283179k);
        sb6.append("_");
        sb6.append(java.lang.System.currentTimeMillis());
        h4Var.f283180l = sb6.toString();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.O(2, 0, h4Var.f283180l);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.b5 b5Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.b5();
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_weishi_hb_config, "", true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
                int i17 = jSONObject.getInt("weishi_hb_sw");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "getWeiShiHbConfig() weishi_hb_sw: %s", java.lang.Integer.valueOf(i17));
                if (i17 == 0) {
                    b5Var.f280019a = false;
                } else {
                    b5Var.f280019a = true;
                }
                b5Var.f280020b = com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.H(jSONObject, "simple_chinese");
                b5Var.f280021c = com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.H(jSONObject, "xg_traditional_chinese");
                b5Var.f280022d = com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.H(jSONObject, "tw_traditional_chinese");
                b5Var.f280023e = com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.H(jSONObject, "english");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingFooterEventImpl", "getWeiShiHbConfig() Exception:%s", e17.getMessage());
            }
        }
        java.lang.String I = h4Var.I();
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
        if (c01.e2.S(I)) {
            gm0.j1.i();
            r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_WEISHI_UNION_SWITCH_INT_SYNC, 0);
        } else {
            gm0.j1.i();
            r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_WEISHI_SWITCH_INT_SYNC, 0);
        }
        boolean z17 = r17 == 1 && b5Var.f280019a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.d(28838, 0, 1, 0, 0, 1);
        yb5.d dVar = h4Var.f283178j;
        if (h4Var.f283175g) {
            g0Var2.d(11701, 1, 0, 0, 2, 2);
            gm0.j1.i();
            boolean z18 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el() && ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).gl() && !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7() && ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_LIVE_SWITCH_INT_SYNC, 0)).intValue() == 1;
            if (!z17 && !z18) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.v(h4Var, uuid);
                g0Var2.d(18890, 4, 0, uuid, "", "");
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) dVar.g(), 1, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.v4(this, z18, z17, b5Var);
            k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.w4(this, uuid);
            k0Var.v();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.x(h4Var);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.O(3, 0, h4Var.f283180l);
            return;
        }
        if (!(r17 == 1 && b5Var.f280019a) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.M(I)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.y(h4Var, uuid);
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.x(h4Var);
            }
            g0Var2.d(18890, 4, 0, uuid, "", "");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) dVar.g(), 1, false);
        k0Var2.f293405n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.x4(this, I, b5Var, r17);
        k0Var2.f293414s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.y4(this, uuid);
        k0Var2.v();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.x(h4Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.O(3, 0, h4Var.f283180l);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void s() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterGroupSolitaire() chatroom:%s", h4Var.f283178j.x());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_group_solitatire_create", true);
        intent.putExtra("key_group_solitatire_scene", 5);
        y63.a aVar = new y63.a();
        aVar.H = h4Var.f283178j.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsk) + "\n";
        java.lang.String o17 = x63.g.o(aVar);
        aVar.f66138x4b6e619a = o17;
        aVar.K = ".";
        aVar.Q = 1;
        intent.putExtra("key_group_solitatire_key", o17);
        intent.putExtra("key_group_solitatire_chatroom_username", h4Var.f283178j.x());
        x63.g.e(h4Var.f283178j.x(), aVar);
        ((t63.e) i95.n0.c(t63.e.class)).wi().k(h4Var.f283178j.x(), aVar);
        j45.l.j(h4Var.f283178j.g(), "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void t() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        intent.putExtra("service_app_talker_user", h4Var.I());
        j45.l.p(h4Var.f283178j.f542250l, "subapp", ".ui.openapi.ServiceAppUI", intent, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u
    public void u(int i17, int i18) {
        boolean z17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = this.f284192b;
        if (iq.b.v(h4Var.f283178j.g())) {
            return;
        }
        iq.b.s(h4Var.f283178j.g());
        if (iq.b.m(h4Var.f283178j.g(), true, null) || iq.b.n(h4Var.f283178j.g(), true) || iq.b.q(h4Var.f283178j.g(), true) || iq.b.e(h4Var.f283178j.g())) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        if (h4Var.I() != null) {
            java.lang.String I = h4Var.I();
            am.w00 w00Var = c6229x2bb765fe.f136476g;
            if (!I.equals(w00Var.f89781d) && (w00Var.f89779b || w00Var.f89780c)) {
                dp.a.m125853x26a183b(h4Var.f283178j.g(), w00Var.f89778a ? com.p314xaae8f345.mm.R.C30867xcad56011.aqg : com.p314xaae8f345.mm.R.C30867xcad56011.aqh, 0).show();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "voip is running, can't do this");
                return;
            }
        }
        boolean z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().i() == 2;
        if (1 != ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableVoiceVoipFromPlugin", 1) || z18) {
            h4Var.C();
        } else {
            java.lang.String I2 = h4Var.I();
            if (!android.text.TextUtils.isEmpty(I2)) {
                ((co5.p) ((jp5.n) i95.n0.c(jp5.n.class))).Ni(I2);
            }
            yb5.d dVar = h4Var.f283178j;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(dVar.u().d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(dVar.u().d1())) {
                z17 = (((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).bj(dVar.u().Q0(), 0) & 8192) == 0;
            } else {
                z17 = false;
            }
            this.f284191a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) dVar.g(), 1, false);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) dVar.f542241c.a(sb5.s0.class))).f280796e;
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f284191a;
            k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.t4(this, hashMap, c19666xfd6e2f33, i17, i18, z17);
            k0Var.f293388d2 = true;
            k0Var.Y1 = true;
            k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.u4(this, hashMap, i17, i18, c19666xfd6e2f33);
            k0Var.v();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11033, 4, 1, 0);
    }
}
