package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class nn extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f, com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f286468s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zn f286469t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f286470u = "";

    /* renamed from: v, reason: collision with root package name */
    public int f286471v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f286472w = -1;

    private void g0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        sb5.s sVar = (sb5.s) this.f286468s.f542241c.a(sb5.s.class);
        if (sVar.u()) {
            sVar.D(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C22119x640a621(this, f9Var));
        } else {
            h0(f9Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570066w7);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao();
        aoVar.a(xgVar, false);
        xgVar.setTag(aoVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean O(android.view.MenuItem menuItem, final yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar) {
        int t17;
        if (erVar == null) {
            return false;
        }
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = erVar.c();
        int itemId = menuItem.getItemId();
        if (itemId == 4) {
            java.lang.String str = "65_" + c01.id.c();
            java.lang.String W0 = c17.W0();
            if (dVar.D() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280286r && (t17 = c01.w9.t(W0)) != -1) {
                W0 = W0.substring(t17 + 1).trim();
            }
            ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(W0);
            su4.j2 j2Var = new su4.j2();
            j2Var.f494471a = dVar.g();
            j2Var.f494472b = 65;
            j2Var.f494474d = W0;
            j2Var.f494475e = str;
            j2Var.f494476f = true;
            j2Var.f494479i = false;
            j2Var.f494486p = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        } else if (itemId == 108) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.a(c17, 4, 0);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(c17, dVar.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.nn$$c
                @Override // java.lang.Runnable
                public final void run() {
                    yb5.d dVar2 = yb5.d.this;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar2.f542241c.a(sb5.l2.class));
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = c17;
                    ymVar.q0(f9Var, false);
                    ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) dVar2.g();
                    n13.r rVar = new n13.r();
                    rVar.f415650a = true;
                    rVar.f415653d.f415672a = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.b(f9Var.Q0());
                    rVar.f415660k = 1;
                    ne5.a aVar = new ne5.a();
                    java.lang.String Q0 = f9Var.Q0();
                    int i17 = aVar.f125235d;
                    aVar.set(i17 + 1, Q0);
                    aVar.set(i17 + 0, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                    aVar.n(f9Var.U1());
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(te5.e2.d(f9Var));
                    ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activityC0065xcd7aa112, aVar, rVar);
                }
            });
        } else {
            if (itemId == 179) {
                qn4.y.c(dVar.g(), c17, erVar, dVar);
                return true;
            }
            if (itemId == 102) {
                java.lang.CharSequence q07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).q0(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) erVar).c(), false);
                dVar.f542243e.k0(c17.Q0(), c17.m124847x74d37ac6(), q07);
                menuItem.getGroupId();
                try {
                    if (c01.ia.j(c17) >= 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) erVar).S)) {
                        q07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) erVar).S;
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(q07);
                    w04.a.INSTANCE.A9(1, c17.I0() + "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o0(q07.toString()));
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.a(erVar.c(), 3, q07.length());
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextToBase", "clip.setText error ");
                }
                try {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6869x36ad427 c6869x36ad427 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6869x36ad427();
                    c6869x36ad427.f141875d = c17.I0();
                    c6869x36ad427.f141877f = q07.length();
                    c6869x36ad427.f141876e = this.f286470u.length();
                    c6869x36ad427.f141878g = c01.ia.i(c17);
                    c6869x36ad427.k();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextToBase", "report occur exception! %s", e17.getMessage());
                }
                db5.e1.T(dVar.g(), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
                return true;
            }
            if (itemId != 103) {
                if (itemId != 124 && itemId != 125) {
                    if (itemId == 151) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.m(dVar, c17.Q0(), c17.m124847x74d37ac6(), 2);
                        return false;
                    }
                    if (itemId == 152) {
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).o0(c17);
                    } else if (itemId != 163 && itemId != 164) {
                        switch (itemId) {
                            case 141:
                                java.lang.String W02 = c17.W0();
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W02)) {
                                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(W02);
                                }
                                db5.e1.T(dVar.g(), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
                                return true;
                            case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf /* 142 */:
                                android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                                intent.putExtra("Retr_Msg_Id", c17.m124847x74d37ac6());
                                intent.putExtra("Retr_MsgTalker", c17.Q0());
                                java.lang.String W03 = c17.W0();
                                if (c17.X2()) {
                                    intent.putExtra("Retr_Msg_content", W03);
                                    intent.putExtra("Retr_Msg_Type", 6);
                                } else {
                                    intent.putExtra("Retr_Msg_content", W03);
                                    intent.putExtra("Retr_Msg_Type", 4);
                                }
                                intent.putExtra("scene_from", 17);
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(intent);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextToBase", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                dVar.a0((android.content.Intent) arrayList.get(0));
                                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextToBase", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                return true;
                            case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd /* 143 */:
                                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, c17.W0(), 1);
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = dVar.f542250l;
                                am.c4 c4Var = c5303xc75d2f73.f135623g;
                                c4Var.f87857j = abstractC21611x7536149b;
                                c4Var.f87860m = 43;
                                r45.bq0 bq0Var = c4Var.f87848a;
                                if (bq0Var != null) {
                                    r45.jq0 jq0Var = bq0Var.f452495d;
                                    if (jq0Var != null) {
                                        jq0Var.e(c17.Q0());
                                        jq0Var.j(c01.z1.r());
                                        c5303xc75d2f73.e();
                                    }
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextToBase", "transform text fav failed");
                                }
                                return true;
                        }
                    }
                }
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).t0(menuItem, c17);
            } else {
                g0(c17);
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        java.lang.String str = f9Var.G;
        if (str != null) {
            str.contains("announcement@all");
        }
        boolean m60126x74219ae7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7();
        if (!f9Var.b3() && !f9Var.X2() && f9Var.mo78013xfb85f7b0() != 1107296305) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) view.getTag();
        int d17 = goVar.d();
        int i18 = goVar.R;
        if (i18 == 1) {
            if (f9Var.b3()) {
                if (x63.g.G(f9Var)) {
                    java.lang.String string = this.f286468s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsr);
                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.b3m;
                    g4Var.c(d17, 151, 0, string, com.p314xaae8f345.mm.R.raw.f79691x8cdb2c3e);
                } else {
                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.b3m;
                }
                if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                    g4Var.c(d17, 102, 0, view.getContext().getString(i17), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
                }
            }
            if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 108, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
            if (f9Var.P0() == 5) {
                g4Var.c(d17, 103, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5i), com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3);
            }
            j45.l.g("favorite");
            if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 116, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
            }
            if (!f9Var.t2() && f9Var.b3() && ((f9Var.K1() || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f286468s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !this.f286468s.A())) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
            }
            if (com.p314xaae8f345.mm.app.p622xc5476f33.k.a() && com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.d(f9Var.j()) && !c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                if (f9Var.i2() && f9Var.b2()) {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572408b46), com.p314xaae8f345.mm.R.raw.f81244x9739f9c3);
                } else {
                    g4Var.c(d17, 124, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4a), com.p314xaae8f345.mm.R.raw.f79939xd3572d36);
                }
            }
            if (!this.f286468s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
            if (c01.ia.A(f9Var) || c01.ia.j(f9Var) == 4) {
                g4Var.clear();
                if (!this.f286468s.F()) {
                    g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                }
            }
        } else if (i18 == 2) {
            g4Var.c(d17, 141, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
            g4Var.c(d17, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            j45.l.g("favorite");
            g4Var.c(d17, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
            if (com.p314xaae8f345.mm.app.p622xc5476f33.k.a() && f9Var.i2() && f9Var.b2()) {
                g4Var.c(d17, 163, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572408b46), com.p314xaae8f345.mm.R.raw.f81244x9739f9c3);
                g4Var.c(d17, 164, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsg), com.p314xaae8f345.mm.R.raw.f80466xfeba7d4f);
                qn4.y.a(g4Var, d17, view.getContext(), f9Var);
                g4Var.c(d17, 152, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3s), com.p314xaae8f345.mm.R.raw.f79736xffb29de6);
            }
            if (m60126x74219ae7) {
                return false;
            }
            g4Var.c(d17, 4, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572406b44), com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca);
            return false;
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        f9Var.m78015x9dfe85a();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
        if (f9Var.b3() && f9Var.A0() == 1) {
            g0(f9Var);
        }
    }

    public java.lang.String d0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        java.lang.String a17 = c01.n2.a("" + f9Var.I0());
        c01.l2 c17 = c01.n2.d().c(a17, true);
        c17.i("prePublishId", "msg_" + f9Var.I0());
        c17.i("preUsername", A(this.f286468s, f9Var));
        c17.i("preChatName", z(this.f286468s, f9Var));
        return a17;
    }

    public void e0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, boolean z18, boolean z19) {
        if (z17 || z18 || z19) {
            aoVar.f284912b.setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.FALSE);
            aoVar.f284912b.setOnTouchListener(aoVar.f284920j);
            aoVar.f284912b.setOnLongClickListener(u(this.f286468s));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = aoVar.f284912b;
            if (this.f286469t == null) {
                this.f286469t = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zn(this.f286468s);
            }
            c22624x85d69039.setOnClickListener(this.f286469t);
        } else {
            int i17 = c01.ia.i(f9Var);
            int i18 = 0;
            if (i17 <= 0 || i17 >= wl5.y.o(aoVar.f284912b).length()) {
                i17 = 0;
            }
            wl5.x xVar = aoVar.f284919i;
            if (xVar != null) {
                xVar.c();
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u17 = u(this.f286468s);
            wl5.v x17 = x(u(this.f286468s));
            int[] iArr = new int[2];
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = aoVar.f284912b;
            if (c22624x85d690392 != null) {
                c22624x85d690392.getLocationInWindow(iArr);
                i18 = iArr[0];
                if (i18 == 0) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    aoVar.f284912b.getGlobalVisibleRect(rect);
                    i18 = rect.left;
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = aoVar.f284912b;
            rl5.r rVar = aoVar.f284918h;
            if (this.f286469t == null) {
                this.f286469t = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zn(this.f286468s);
            }
            wl5.o oVar = new wl5.o(c22624x85d690393, rVar, x17, this.f286469t, aoVar.f284920j);
            oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.f560343hv;
            oVar.f528657h = 18;
            oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560341ht;
            if (i18 != 0) {
                oVar.a(i18 + com.p314xaae8f345.mm.ui.zk.e(aoVar.f284912b.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
            }
            wl5.x xVar2 = new wl5.x(oVar);
            aoVar.f284919i = xVar2;
            aoVar.f284921k = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wn(xVar2);
            xVar2.f528692d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.on(this);
            java.util.ArrayList arrayList = aoVar.f284922l;
            if (arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = aoVar.f284919i.f528705q;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pn pnVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pn(this, aoVar);
            wl5.x xVar3 = aoVar.f284919i;
            xVar3.C = i17;
            u17.f286826h = pnVar;
            xVar3.Y = aoVar.f284921k;
        }
        aoVar.f284912b.m84180x74caf26a(this);
        aoVar.f284912b.m81372xd77b7e83(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qn(this, aoVar));
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        java.lang.String q07;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ja.b(view)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTextToBase", "onDoubleTap solitaire fold double click");
            return true;
        }
        if (com.p314xaae8f345.mm.ui.tk.f291489c.a()) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent(this.f286468s.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.class);
        intent.addFlags(67108864);
        if (view.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) {
            final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) view.getTag();
            long m124847x74d37ac6 = goVar.c().m124847x74d37ac6();
            intent.putExtra("Chat_Msg_Id", m124847x74d37ac6);
            intent.putExtra("Chat_User", goVar.c().Q0());
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) this.f286468s.f542241c.a(sb5.i2.class))).f280592e == m124847x74d37ac6 || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) this.f286468s.f542241c.a(sb5.i2.class))).f280593f == m124847x74d37ac6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTextToBase", "speechPlaying stop!!");
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) this.f286468s.f542241c.a(sb5.i2.class))).w0(this.f286468s, true);
            }
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pc) ((sb5.v0) this.f286468s.f542241c.a(sb5.v0.class))).m0(goVar.c())) {
                q07 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view).a().toString();
            } else {
                q07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) this.f286468s.f542241c.a(sb5.l2.class))).q0(goVar.c(), goVar.R == 2);
            }
            intent.putExtra("key_chat_text", q07);
            intent.putExtra("key_chat_from", view.getContext().getClass().getName());
            intent.putExtra("is_group_chat", this.f286468s.D());
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(goVar.c().Q0(), 1);
            j45.l.q(this.f286468s.f542242d, intent, 1010, new j45.g() { // from class: com.tencent.mm.ui.chatting.viewitems.nn$$b
                @Override // j45.g
                /* renamed from: onActivityResult */
                public final void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent2) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nn nnVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nn.this;
                    nnVar.getClass();
                    if (i17 == 1010 && i18 == 101) {
                        java.lang.Object a17 = ok5.d.a(intent2, "kPartialQuoteContent");
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) nnVar.f286468s.f542241c.a(sb5.s0.class))).o0(goVar.c(), a17 instanceof r15.g ? (r15.g) a17 : null);
                    }
                }
            });
            db5.f.j(view.getContext());
        }
        return true;
    }

    public void f0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, rd5.d dVar, android.os.Bundle bundle, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && ioVar == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5 = aoVar.f284915e;
            if (c21917xeb4fc2b5 != null) {
                c21917xeb4fc2b5.setVisibility(8);
                return;
            }
            return;
        }
        if (aoVar.f284915e == null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b52 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5) aoVar.f284914d.inflate();
            aoVar.f284915e = c21917xeb4fc2b52;
            c21917xeb4fc2b52.c();
        }
        aoVar.f284915e.e(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).rj(aoVar.f284912b.getContext(), str, (int) aoVar.f284912b.m84164x40077844(), 1, bundle, d0(f9Var)), ioVar, f9Var.m124847x74d37ac6());
        aoVar.f284915e.m80030x6e632093(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.U0()) ? this.f286468s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxn) : f9Var.U0());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u17 = u(this.f286468s);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go(dVar, this.f286468s.D(), aoVar, null);
            goVar.R = 2;
            aoVar.f284915e.m80028xc2a54588().setTag(goVar);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b53 = aoVar.f284915e;
            if (this.f286469t == null) {
                this.f286469t = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zn(this.f286468s);
            }
            c21917xeb4fc2b53.setOnClickListener(this.f286469t);
            aoVar.f284915e.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f286468s.f542241c.a(sb5.z.class))).B1);
            aoVar.f284915e.m80031x74caf26a(this);
            aoVar.f284915e.setVisibility(0);
        }
        if (aoVar.f284923m != null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(wl5.y.o(aoVar.f284915e.m80028xc2a54588()))) {
            return;
        }
        yb5.d dVar2 = this.f286468s;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.e(dVar2, aoVar, f9Var, u17, x(u(dVar2)));
    }

    public final void h0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (!this.f286468s.x().equals("medianote")) {
            ((e21.z0) c01.d9.b().w()).c(new e21.n(f9Var.Q0(), f9Var.I0()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendMsgLogic", "resendTextMsg, msgId:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.g(f9Var);
        this.f286468s.L(true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un(f9Var);
    }
}
