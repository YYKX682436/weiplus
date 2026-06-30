package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 f176554d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var) {
        this.f176554d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s0 s0Var;
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var = this.f176554d;
        if (id6 == com.p314xaae8f345.mm.R.id.b7e || view.getId() == com.p314xaae8f345.mm.R.id.b76) {
            str = "(Landroid/view/View;)V";
            if (b0Var.E.B()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s0 s0Var2 = b0Var.T;
                if (s0Var2 != null) {
                    int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.S;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5 activityC13047x63b575f5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q) s0Var2).f176657a;
                    activityC13047x63b575f5.d7(true);
                    java.lang.String f17 = activityC13047x63b575f5.B == 6 ? activityC13047x63b575f5.f176298g : !android.text.TextUtils.isEmpty(activityC13047x63b575f5.f176297f.f()) ? activityC13047x63b575f5.f176297f.f() : activityC13047x63b575f5.f176298g;
                    wt1.k kVar = activityC13047x63b575f5.f176296e.H;
                    if (kVar != null) {
                        xt1.b bVar = kVar.f530839e;
                        if (bVar == null ? false : bVar.f537979w) {
                            i18 = 1;
                            r45.pd6 pd6Var = new r45.pd6();
                            java.lang.String str2 = activityC13047x63b575f5.f176309u;
                            pd6Var.f464502d = str2;
                            pd6Var.f464503e = activityC13047x63b575f5.f176310v;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "AcceptItemInfo templateId:%s", str2);
                            gm0.j1.n().f354821b.g(new xt1.w(f17, activityC13047x63b575f5.B, activityC13047x63b575f5.f176299h, activityC13047x63b575f5.f176301m, activityC13047x63b575f5.f176302n, activityC13047x63b575f5.f176303o, activityC13047x63b575f5.C, i18, pd6Var));
                        }
                    }
                    i18 = 0;
                    r45.pd6 pd6Var2 = new r45.pd6();
                    java.lang.String str22 = activityC13047x63b575f5.f176309u;
                    pd6Var2.f464502d = str22;
                    pd6Var2.f464503e = activityC13047x63b575f5.f176310v;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "AcceptItemInfo templateId:%s", str22);
                    gm0.j1.n().f354821b.g(new xt1.w(f17, activityC13047x63b575f5.B, activityC13047x63b575f5.f176299h, activityC13047x63b575f5.f176301m, activityC13047x63b575f5.f176302n, activityC13047x63b575f5.f176303o, activityC13047x63b575f5.C, i18, pd6Var2));
                }
            } else if (b0Var.E.i() && (s0Var = b0Var.T) != null) {
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.S;
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5 activityC13047x63b575f52 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q) s0Var).f176657a;
                activityC13047x63b575f52.d7(true);
                r45.a46 a46Var = new r45.a46();
                if (activityC13047x63b575f52.B == 3) {
                    a46Var.f451251d = activityC13047x63b575f52.f176298g;
                    i17 = 1;
                } else {
                    a46Var.f451252e = activityC13047x63b575f52.f176298g;
                    i17 = 0;
                }
                a46Var.f451253f = activityC13047x63b575f52.f176301m;
                a46Var.f451255h = activityC13047x63b575f52.f176302n;
                a46Var.f451254g = activityC13047x63b575f52.f176303o;
                a46Var.f451256i = activityC13047x63b575f52.C;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(a46Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var2 = activityC13047x63b575f52.f176296e;
                r45.o46 o17 = lu1.a0.o(b0Var2.K, b0Var2.N, b0Var2.P);
                r45.pd6 pd6Var3 = new r45.pd6();
                java.lang.String str3 = activityC13047x63b575f52.f176309u;
                pd6Var3.f464502d = str3;
                pd6Var3.f464503e = activityC13047x63b575f52.f176310v;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "ShareCardItem upload templateId:%s", str3);
                gm0.j1.n().f354821b.g(new fu1.e(i17, linkedList, activityC13047x63b575f52.f176297f.s0().f470081g, activityC13047x63b575f52.f176304p, o17, activityC13047x63b575f52.B, pd6Var3));
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.gf_ || view.getId() == com.p314xaae8f345.mm.R.id.f563872bt) {
            str = "(Landroid/view/View;)V";
            lu1.d.i(b0Var.f176469e, b0Var.U.f176639d);
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.c0m || view.getId() == com.p314xaae8f345.mm.R.id.f565310c06) {
            str = "(Landroid/view/View;)V";
            if (view.getId() == com.p314xaae8f345.mm.R.id.c0m) {
                b0Var.D = false;
            } else if (view.getId() == com.p314xaae8f345.mm.R.id.f565310c06) {
                b0Var.D = true;
            }
            ku1.i iVar = b0Var.f176477p;
            if (iVar instanceof ku1.y) {
                b0Var.C.f176987r = ((ku1.y) iVar).h(lu1.e.CARDCODEREFRESHACTION_DOREFRESH);
            }
            b0Var.C.a(view, b0Var.D);
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.b96 || view.getId() == com.p314xaae8f345.mm.R.id.b8z || view.getId() == com.p314xaae8f345.mm.R.id.b8y || view.getId() == com.p314xaae8f345.mm.R.id.c0u || view.getId() == com.p314xaae8f345.mm.R.id.b8x) {
            str = "(Landroid/view/View;)V";
            if (view.getId() == com.p314xaae8f345.mm.R.id.b96) {
                if (b0Var.E.i()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardConsumedCodeUI", java.lang.Integer.valueOf(b0Var.E.s0().f470083i), b0Var.E.f(), b0Var.E.g(), 0, java.lang.Integer.valueOf(b0Var.U.f176637b), b0Var.U.f176639d, java.lang.Integer.valueOf(b0Var.E.n() ? 1 : 0), "");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s0 s0Var3 = b0Var.T;
                    if (s0Var3 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q) s0Var3).a(true);
                    }
                } else {
                    b0Var.a(true, new wt1.b0(), false);
                }
            } else if (view.getId() == com.p314xaae8f345.mm.R.id.c0u && b0Var.E.s0().f470084l1) {
                yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", str);
                return;
            } else if (b0Var.E.i()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s0 s0Var4 = b0Var.T;
                if (s0Var4 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q) s0Var4).a(false);
                }
            } else {
                b0Var.a(false, new wt1.b0(), false);
            }
        } else {
            if (view.getId() == com.p314xaae8f345.mm.R.id.f564300nh) {
                if (!android.text.TextUtils.isEmpty(b0Var.E.s0().B1)) {
                    lu1.d.f(b0Var.E.s0().B1, b0Var.E.s0().C1, 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 13, b0Var.E.g(), b0Var.E.f(), "", b0Var.E.s0().F);
                } else if (!android.text.TextUtils.isEmpty(b0Var.E.s0().G)) {
                    lu1.d.j(b0Var.f176469e, b0Var.E.s0().G, 3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 13, b0Var.E.g(), b0Var.E.f(), "", b0Var.E.s0().F);
                }
            } else if (view.getId() == com.p314xaae8f345.mm.R.id.bbh) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11582, "OpenShareUserSelectView", 0, java.lang.Integer.valueOf(b0Var.E.s0().f470083i), b0Var.E.f(), b0Var.E.g(), b0Var.U.f176639d);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KLabel_range_index", b0Var.K);
                intent.putExtra("Klabel_name_list", b0Var.L);
                intent.putExtra("Kother_user_name_list", b0Var.M);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = b0Var.f176469e;
                intent.putExtra("k_sns_label_ui_title", abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.av9));
                intent.putExtra("k_sns_label_ui_style", 0);
                intent.putExtra("KLabel_is_filter_private", true);
                j45.l.n(abstractActivityC21394xb3d2c0cf, "sns", ".ui.SnsLabelUI", intent, 2);
                abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(b0Var);
            } else {
                int i28 = 10;
                if (view.getId() == com.p314xaae8f345.mm.R.id.bbw) {
                    if (b0Var.E.i0().f466724q != null) {
                        java.util.LinkedList linkedList2 = b0Var.E.i0().f466724q;
                        int intValue = ((java.lang.Integer) view.getTag()).intValue();
                        r45.w50 w50Var = (r45.w50) linkedList2.get(intValue);
                        java.lang.String g17 = b0Var.E.g();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var = b0Var.U;
                        if (lu1.d.e(g17, w50Var, p0Var.f176637b, p0Var.f176643h)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 19, b0Var.E.g(), b0Var.E.f(), "", w50Var.f470411d);
                        } else if (w50Var != null && !android.text.TextUtils.isEmpty(w50Var.f470414g)) {
                            java.lang.String str4 = w50Var.f470414g;
                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = b0Var.f176469e;
                            lu1.d.j(abstractActivityC21394xb3d2c0cf2, str4, 1);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                            java.lang.Object[] objArr = new java.lang.Object[5];
                            if (intValue == 1) {
                                i28 = 11;
                            } else if (intValue == 2) {
                                i28 = 12;
                            } else if (intValue == 3) {
                                i28 = 16;
                            }
                            objArr[0] = java.lang.Integer.valueOf(i28);
                            objArr[1] = b0Var.E.g();
                            objArr[2] = b0Var.E.f();
                            objArr[3] = "";
                            objArr[4] = w50Var.f470411d;
                            g0Var.d(11941, objArr);
                            if (lu1.a0.C(w50Var, b0Var.E.g())) {
                                lu1.a0.L(b0Var.E.g(), w50Var.f470411d);
                                lu1.d.h(abstractActivityC21394xb3d2c0cf2, b0Var.E.s0().f470085m);
                            }
                        }
                    }
                } else if (view.getId() == com.p314xaae8f345.mm.R.id.bbx) {
                    if (b0Var.E.i0().f466724q != null) {
                        r45.w50 w50Var2 = (r45.w50) b0Var.E.i0().f466724q.get(0);
                        java.lang.String g18 = b0Var.E.g();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var2 = b0Var.U;
                        if (lu1.d.e(g18, w50Var2, p0Var2.f176637b, p0Var2.f176643h)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 19, b0Var.E.g(), b0Var.E.f(), "", w50Var2.f470411d);
                        } else if (w50Var2 != null && !android.text.TextUtils.isEmpty(w50Var2.f470414g)) {
                            java.lang.String str5 = w50Var2.f470414g;
                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = b0Var.f176469e;
                            lu1.d.j(abstractActivityC21394xb3d2c0cf3, str5, 1);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 10, b0Var.E.g(), b0Var.E.f(), "", w50Var2.f470411d);
                            if (lu1.a0.C(w50Var2, b0Var.E.g())) {
                                lu1.a0.L(b0Var.E.g(), w50Var2.f470411d);
                                lu1.d.h(abstractActivityC21394xb3d2c0cf3, b0Var.E.s0().f470085m);
                            }
                        }
                    }
                } else if (view.getId() == com.p314xaae8f345.mm.R.id.bct || view.getId() == com.p314xaae8f345.mm.R.id.bb8) {
                    str = "(Landroid/view/View;)V";
                    if (b0Var.E.i0().f466731x != null) {
                        if (!b0Var.E.h()) {
                            boolean n07 = b0Var.E.n0();
                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf4 = b0Var.f176469e;
                            if (n07) {
                                lu1.d.g(abstractActivityC21394xb3d2c0cf4, 0, null, false, b0Var.E);
                            } else {
                                r45.w50 w50Var3 = b0Var.E.i0().f466731x;
                                java.lang.String g19 = b0Var.E.g();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var3 = b0Var.U;
                                if (lu1.d.e(g19, w50Var3, p0Var3.f176637b, p0Var3.f176643h)) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 20, b0Var.E.g(), b0Var.E.f(), "", w50Var3.f470411d);
                                } else if (w50Var3 != null && !android.text.TextUtils.isEmpty(w50Var3.f470414g)) {
                                    lu1.d.j(abstractActivityC21394xb3d2c0cf4, lu1.a0.k(w50Var3.f470414g, w50Var3.f470415h), 1);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 9, b0Var.E.g(), b0Var.E.f(), "", w50Var3.f470411d);
                                    if (lu1.a0.C(w50Var3, b0Var.E.g())) {
                                        lu1.a0.L(b0Var.E.g(), w50Var3.f470411d);
                                        lu1.d.h(abstractActivityC21394xb3d2c0cf4, b0Var.E.s0().f470085m);
                                    }
                                }
                            }
                        } else if (b0Var.E.i()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s0 s0Var5 = b0Var.T;
                            if (s0Var5 != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q) s0Var5).a(false);
                            }
                        } else {
                            b0Var.a(false, new wt1.b0(), false);
                        }
                    }
                } else if (view.getId() == com.p314xaae8f345.mm.R.id.b9m || view.getId() == com.p314xaae8f345.mm.R.id.b7m) {
                    str = "(Landroid/view/View;)V";
                    r45.de0 de0Var = b0Var.E.s0().M;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardLeftRightIntroduceView", java.lang.Integer.valueOf(b0Var.E.s0().f470083i), b0Var.E.f(), b0Var.E.g(), 0, java.lang.Integer.valueOf(b0Var.U.f176637b), b0Var.U.f176639d, java.lang.Integer.valueOf(b0Var.E.n() ? 1 : 0), "");
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf5 = b0Var.f176469e;
                    if (de0Var == null || android.text.TextUtils.isEmpty(de0Var.f453874e)) {
                        android.content.Intent intent2 = new android.content.Intent();
                        tt1.j jVar = b0Var.E;
                        if (jVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) {
                            intent2.putExtra("key_card_info_data", (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) jVar);
                        } else if (jVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd) {
                            intent2.putExtra("key_card_info_data", (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd) jVar);
                        }
                        intent2.setClass(abstractActivityC21394xb3d2c0cf5, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13046xc6d7135c.class);
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf6 = b0Var.f176469e;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(abstractActivityC21394xb3d2c0cf6, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        abstractActivityC21394xb3d2c0cf6.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(abstractActivityC21394xb3d2c0cf6, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        lu1.d.j(abstractActivityC21394xb3d2c0cf5, de0Var.f453874e, 1);
                    }
                } else if (view.getId() == com.p314xaae8f345.mm.R.id.mtx) {
                    if (eu1.f.d(b0Var.E.f()) <= 1) {
                        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else {
                        b0Var.f176472h = !b0Var.f176472h;
                        b0Var.f();
                    }
                } else if (view.getId() == com.p314xaae8f345.mm.R.id.b7r) {
                    if (b0Var.E.s0().I != null && !android.text.TextUtils.isEmpty(b0Var.E.s0().I.f459638f)) {
                        lu1.d.j(b0Var.f176469e, b0Var.E.s0().I.f459638f, 3);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 3, b0Var.E.g(), b0Var.E.f(), "", b0Var.E.s0().I.f459637e);
                    }
                } else if (view.getId() == com.p314xaae8f345.mm.R.id.b7c) {
                    if (b0Var.E.s0().Q != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b0Var.E.s0().Q.f466908e)) {
                        lu1.d.j(b0Var.f176469e, b0Var.E.s0().Q.f466908e, 1);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 14, b0Var.E.g(), b0Var.E.f(), "", b0Var.E.s0().Q.f466907d);
                    }
                } else if (view.getId() == com.p314xaae8f345.mm.R.id.mu8 || view.getId() == com.p314xaae8f345.mm.R.id.mu9) {
                    if (b0Var.E.s0().f470098x >= 1) {
                        java.util.ArrayList arrayList3 = b0Var.F;
                        if (arrayList3 == null || arrayList3.size() == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                        r45.nu nuVar = (r45.nu) b0Var.F.get(0);
                        lu1.d.c(b0Var.f176469e, nuVar.f463214p, nuVar.f463213o, null, nuVar.f463211m);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var2.d(11324, "UsedStoresView", java.lang.Integer.valueOf(b0Var.E.s0().f470083i), b0Var.E.f(), b0Var.E.g(), 0, java.lang.Integer.valueOf(b0Var.U.f176637b), b0Var.U.f176639d, java.lang.Integer.valueOf(b0Var.E.n() ? 1 : 0), "");
                        g0Var2.d(11941, 5, b0Var.E.g(), b0Var.E.f(), "", nuVar.f463205d);
                        str = "(Landroid/view/View;)V";
                    }
                } else if (view.getId() == com.p314xaae8f345.mm.R.id.o7d) {
                    java.util.ArrayList arrayList4 = b0Var.F;
                    if (arrayList4 == null || arrayList4.size() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    r45.nu nuVar2 = (r45.nu) b0Var.F.get(0);
                    java.lang.String str6 = (java.lang.String) view.getTag();
                    boolean isEmpty = android.text.TextUtils.isEmpty(str6);
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf7 = b0Var.f176469e;
                    if (!isEmpty && str6.equals(abstractActivityC21394xb3d2c0cf7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.arn))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0.b(b0Var);
                        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (!android.text.TextUtils.isEmpty(nuVar2.f463215q)) {
                        lu1.d.j(abstractActivityC21394xb3d2c0cf7, nuVar2.f463215q, 1);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 4, b0Var.E.g(), b0Var.E.f(), "", nuVar2.f463205d);
                    }
                } else if (view.getId() == com.p314xaae8f345.mm.R.id.o79) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0.b(b0Var);
                }
            }
            str = "(Landroid/view/View;)V";
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", str);
    }
}
