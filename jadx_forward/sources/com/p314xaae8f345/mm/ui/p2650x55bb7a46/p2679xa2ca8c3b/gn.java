package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class gn extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285588s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zn f285589t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f285590u = "";

    /* renamed from: v, reason: collision with root package name */
    public int f285591v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f285592w = -1;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570021ul);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao();
        aoVar.a(xgVar, true);
        xgVar.setTag(aoVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.CharSequence] */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean O(android.view.MenuItem menuItem, final yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar) {
        int t17;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6869x36ad427 c6869x36ad427;
        int t18;
        int t19;
        int t27;
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
        } else {
            if (itemId == 102) {
                java.lang.String q07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).q0(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) erVar).c(), false);
                dVar.f542243e.k0(c17.Q0(), c17.m124847x74d37ac6(), q07);
                menuItem.getGroupId();
                try {
                    if (c01.ia.j(c17) >= 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) erVar).S)) {
                        q07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) erVar).S;
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(q07);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.a(c17, 3, q07.length());
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextFromBase", "clip.setText error ");
                }
                db5.e1.T(dVar.g(), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
                w04.a.INSTANCE.A9(1, c17.I0() + "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o0(q07.toString()));
                try {
                    c6869x36ad427 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6869x36ad427();
                    c6869x36ad427.f141875d = c17.I0();
                    c6869x36ad427.f141877f = q07.length();
                } catch (java.lang.Exception e17) {
                    e = e17;
                }
                try {
                    c6869x36ad427.f141876e = this.f285590u.length();
                    c6869x36ad427.f141878g = c01.ia.i(c17);
                    c6869x36ad427.k();
                } catch (java.lang.Exception e18) {
                    e = e18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextFromBase", "report occur exception! %s", e.getMessage());
                    return true;
                }
                return true;
            }
            if (itemId == 108) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.a(c17, 4, 0);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(c17, dVar.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.gn$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        yb5.d dVar2 = yb5.d.this;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar2.f542241c.a(sb5.l2.class));
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = c17;
                        java.lang.String q08 = ymVar.q0(f9Var, false);
                        android.content.Intent intent = new android.content.Intent(dVar2.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
                        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                        if (f9Var.X2()) {
                            intent.putExtra("Retr_Msg_content", q08);
                            intent.putExtra("Retr_Msg_Type", 6);
                        } else {
                            intent.putExtra("Retr_Msg_content", q08);
                            intent.putExtra("Retr_Msg_Type", 4);
                        }
                        java.lang.String d17 = te5.e2.d(f9Var);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                            intent.putExtra("weAppSourceUserName", d17);
                        }
                        intent.putExtra("scene_from", 17);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        dVar2.a0((android.content.Intent) arrayList.get(0));
                        yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                });
            } else {
                if (itemId == 179) {
                    qn4.y.c(dVar.g(), c17, erVar, dVar);
                    return true;
                }
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
                                if (dVar.D() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280286r && (t18 = c01.w9.t(W02)) != -1) {
                                    W02 = W02.substring(t18 + 1).trim();
                                }
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W02)) {
                                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(W02);
                                }
                                db5.e1.T(dVar.g(), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
                                return true;
                            case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf /* 142 */:
                                android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                                java.lang.String W03 = c17.W0();
                                if (dVar.D() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280286r && (t19 = c01.w9.t(W03)) != -1) {
                                    W03 = W03.substring(t19 + 1).trim();
                                }
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
                                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                dVar.a0((android.content.Intent) arrayList.get(0));
                                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                return true;
                            case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd /* 143 */:
                                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                                java.lang.String W04 = c17.W0();
                                if (dVar.D() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280286r && (t27 = c01.w9.t(W04)) != -1) {
                                    W04 = W04.substring(t27 + 1).trim();
                                }
                                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, W04, 1);
                                am.c4 c4Var = c5303xc75d2f73.f135623g;
                                c4Var.f87857j = dVar.f542250l;
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
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextFromBase", "transform text fav failed");
                                }
                                return true;
                        }
                    }
                }
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).t0(menuItem, c17);
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
        if (!f9Var.b3() && !f9Var.X2() && f9Var.mo78013xfb85f7b0() != 1107296305) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) view.getTag();
        int d17 = goVar.d();
        boolean m60126x74219ae7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7();
        int i18 = goVar.R;
        if (i18 == 1) {
            if (f9Var.b3()) {
                if (x63.g.G(f9Var)) {
                    java.lang.String string = this.f285588s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsr);
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
            j45.l.g("favorite");
            if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 116, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
            }
            if (!this.f285588s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
            if (com.p314xaae8f345.mm.app.p622xc5476f33.k.a() && com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.d(f9Var.j()) && !c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                if (f9Var.i2() && f9Var.b2()) {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572408b46), com.p314xaae8f345.mm.R.raw.f81244x9739f9c3);
                } else {
                    g4Var.c(d17, 124, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4a), com.p314xaae8f345.mm.R.raw.f79939xd3572d36);
                }
            }
            if (c01.ia.A(f9Var) || c01.ia.j(f9Var) == 4) {
                g4Var.clear();
                if (!this.f285588s.F()) {
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
        if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) {
            ge5.d a17 = ge5.d.a();
            java.lang.CharSequence text = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view).getText();
            a17.getClass();
            ge5.d.b(text, f9Var, 1);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean b0() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean c0(yb5.d dVar) {
        return dVar.D();
    }

    public java.lang.String d0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        java.lang.String a17 = c01.n2.a("" + f9Var.I0());
        c01.l2 c17 = c01.n2.d().c(a17, true);
        c17.i("prePublishId", "msg_" + f9Var.I0());
        c17.i("preUsername", A(this.f285588s, f9Var));
        c17.i("preChatName", z(this.f285588s, f9Var));
        return a17;
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        java.lang.String q07;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ja.b(view)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTextFromBase", "onDoubleTap solitaire fold double click");
            return true;
        }
        if (com.p314xaae8f345.mm.ui.tk.f291489c.a()) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent(this.f285588s.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.class);
        intent.addFlags(67108864);
        if (view.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) {
            final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) view.getTag();
            java.lang.Long valueOf = java.lang.Long.valueOf(goVar.c().m124847x74d37ac6());
            intent.putExtra("Chat_Msg_Id", valueOf);
            intent.putExtra("Chat_User", goVar.c().Q0());
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) this.f285588s.f542241c.a(sb5.i2.class))).f280592e == valueOf.longValue() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) this.f285588s.f542241c.a(sb5.i2.class))).f280593f == valueOf.longValue()) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) this.f285588s.f542241c.a(sb5.i2.class))).w0(this.f285588s, true);
            }
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pc) ((sb5.v0) this.f285588s.f542241c.a(sb5.v0.class))).m0(goVar.c())) {
                q07 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view).a().toString();
            } else {
                q07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) this.f285588s.f542241c.a(sb5.l2.class))).q0(goVar.c(), goVar.R == 2);
            }
            intent.putExtra("key_chat_text", q07);
            intent.putExtra("key_chat_from", view.getContext().getClass().getName());
            intent.putExtra("is_group_chat", this.f285588s.D());
            j45.l.q(this.f285588s.f542242d, intent, 1010, new j45.g() { // from class: com.tencent.mm.ui.chatting.viewitems.gn$$b
                @Override // j45.g
                /* renamed from: onActivityResult */
                public final void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent2) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn gnVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn.this;
                    gnVar.getClass();
                    if (i17 == 1010 && i18 == 101) {
                        java.lang.Object a17 = ok5.d.a(intent2, "kPartialQuoteContent");
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) gnVar.f285588s.f542241c.a(sb5.s0.class))).o0(goVar.c(), a17 instanceof r15.g ? (r15.g) a17 : null);
                    }
                }
            });
            db5.f.j(view.getContext());
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(goVar.c().Q0(), 1);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = goVar.c();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(c17.Q0())) {
                ot0.q v17 = ot0.q.v(c17.j());
                int i17 = v17 != null ? v17.f430199i : 0;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("msgid", java.lang.Long.valueOf(c17.I0()));
                hashMap.put("msgtype", java.lang.Integer.valueOf(c17.mo78013xfb85f7b0()));
                hashMap.put("submsgtype", java.lang.Integer.valueOf(i17));
                hashMap.put("chat_name", c17.Q0());
                hashMap.put("enter_sessionid", this.f285588s.f542255q);
                hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(this.f285588s.k())));
                hashMap.put("fromtype", java.lang.Integer.valueOf(c17.A0() == 1 ? 1 : 11));
                hashMap.put("view_id", "yuanbao_msg_details");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un(f9Var);
    }
}
