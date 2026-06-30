package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.b0 f95021d;

    public h0(com.tencent.mm.plugin.card.ui.b0 b0Var) {
        this.f95021d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.card.ui.s0 s0Var;
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.tencent.mm.plugin.card.ui.b0 b0Var = this.f95021d;
        if (id6 == com.tencent.mm.R.id.b7e || view.getId() == com.tencent.mm.R.id.b76) {
            str = "(Landroid/view/View;)V";
            if (b0Var.E.B()) {
                com.tencent.mm.plugin.card.ui.s0 s0Var2 = b0Var.T;
                if (s0Var2 != null) {
                    int i19 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
                    com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI = ((com.tencent.mm.plugin.card.ui.q) s0Var2).f95124a;
                    cardDetailUI.d7(true);
                    java.lang.String f17 = cardDetailUI.B == 6 ? cardDetailUI.f94765g : !android.text.TextUtils.isEmpty(cardDetailUI.f94764f.f()) ? cardDetailUI.f94764f.f() : cardDetailUI.f94765g;
                    wt1.k kVar = cardDetailUI.f94763e.H;
                    if (kVar != null) {
                        xt1.b bVar = kVar.f449306e;
                        if (bVar == null ? false : bVar.f456446w) {
                            i18 = 1;
                            r45.pd6 pd6Var = new r45.pd6();
                            java.lang.String str2 = cardDetailUI.f94776u;
                            pd6Var.f382969d = str2;
                            pd6Var.f382970e = cardDetailUI.f94777v;
                            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "AcceptItemInfo templateId:%s", str2);
                            gm0.j1.n().f273288b.g(new xt1.w(f17, cardDetailUI.B, cardDetailUI.f94766h, cardDetailUI.f94768m, cardDetailUI.f94769n, cardDetailUI.f94770o, cardDetailUI.C, i18, pd6Var));
                        }
                    }
                    i18 = 0;
                    r45.pd6 pd6Var2 = new r45.pd6();
                    java.lang.String str22 = cardDetailUI.f94776u;
                    pd6Var2.f382969d = str22;
                    pd6Var2.f382970e = cardDetailUI.f94777v;
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "AcceptItemInfo templateId:%s", str22);
                    gm0.j1.n().f273288b.g(new xt1.w(f17, cardDetailUI.B, cardDetailUI.f94766h, cardDetailUI.f94768m, cardDetailUI.f94769n, cardDetailUI.f94770o, cardDetailUI.C, i18, pd6Var2));
                }
            } else if (b0Var.E.i() && (s0Var = b0Var.T) != null) {
                int i27 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
                com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI2 = ((com.tencent.mm.plugin.card.ui.q) s0Var).f95124a;
                cardDetailUI2.d7(true);
                r45.a46 a46Var = new r45.a46();
                if (cardDetailUI2.B == 3) {
                    a46Var.f369718d = cardDetailUI2.f94765g;
                    i17 = 1;
                } else {
                    a46Var.f369719e = cardDetailUI2.f94765g;
                    i17 = 0;
                }
                a46Var.f369720f = cardDetailUI2.f94768m;
                a46Var.f369722h = cardDetailUI2.f94769n;
                a46Var.f369721g = cardDetailUI2.f94770o;
                a46Var.f369723i = cardDetailUI2.C;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(a46Var);
                com.tencent.mm.plugin.card.ui.b0 b0Var2 = cardDetailUI2.f94763e;
                r45.o46 o17 = lu1.a0.o(b0Var2.K, b0Var2.N, b0Var2.P);
                r45.pd6 pd6Var3 = new r45.pd6();
                java.lang.String str3 = cardDetailUI2.f94776u;
                pd6Var3.f382969d = str3;
                pd6Var3.f382970e = cardDetailUI2.f94777v;
                com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "ShareCardItem upload templateId:%s", str3);
                gm0.j1.n().f273288b.g(new fu1.e(i17, linkedList, cardDetailUI2.f94764f.s0().f388548g, cardDetailUI2.f94771p, o17, cardDetailUI2.B, pd6Var3));
            }
        } else if (view.getId() == com.tencent.mm.R.id.gf_ || view.getId() == com.tencent.mm.R.id.f482339bt) {
            str = "(Landroid/view/View;)V";
            lu1.d.i(b0Var.f94936e, b0Var.U.f95106d);
        } else if (view.getId() == com.tencent.mm.R.id.c0m || view.getId() == com.tencent.mm.R.id.f483777c06) {
            str = "(Landroid/view/View;)V";
            if (view.getId() == com.tencent.mm.R.id.c0m) {
                b0Var.D = false;
            } else if (view.getId() == com.tencent.mm.R.id.f483777c06) {
                b0Var.D = true;
            }
            ku1.i iVar = b0Var.f94944p;
            if (iVar instanceof ku1.y) {
                b0Var.C.f95454r = ((ku1.y) iVar).h(lu1.e.CARDCODEREFRESHACTION_DOREFRESH);
            }
            b0Var.C.a(view, b0Var.D);
        } else if (view.getId() == com.tencent.mm.R.id.b96 || view.getId() == com.tencent.mm.R.id.b8z || view.getId() == com.tencent.mm.R.id.b8y || view.getId() == com.tencent.mm.R.id.c0u || view.getId() == com.tencent.mm.R.id.b8x) {
            str = "(Landroid/view/View;)V";
            if (view.getId() == com.tencent.mm.R.id.b96) {
                if (b0Var.E.i()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardConsumedCodeUI", java.lang.Integer.valueOf(b0Var.E.s0().f388550i), b0Var.E.f(), b0Var.E.g(), 0, java.lang.Integer.valueOf(b0Var.U.f95104b), b0Var.U.f95106d, java.lang.Integer.valueOf(b0Var.E.n() ? 1 : 0), "");
                    com.tencent.mm.plugin.card.ui.s0 s0Var3 = b0Var.T;
                    if (s0Var3 != null) {
                        ((com.tencent.mm.plugin.card.ui.q) s0Var3).a(true);
                    }
                } else {
                    b0Var.a(true, new wt1.b0(), false);
                }
            } else if (view.getId() == com.tencent.mm.R.id.c0u && b0Var.E.s0().f388551l1) {
                yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", str);
                return;
            } else if (b0Var.E.i()) {
                com.tencent.mm.plugin.card.ui.s0 s0Var4 = b0Var.T;
                if (s0Var4 != null) {
                    ((com.tencent.mm.plugin.card.ui.q) s0Var4).a(false);
                }
            } else {
                b0Var.a(false, new wt1.b0(), false);
            }
        } else {
            if (view.getId() == com.tencent.mm.R.id.f482767nh) {
                if (!android.text.TextUtils.isEmpty(b0Var.E.s0().B1)) {
                    lu1.d.f(b0Var.E.s0().B1, b0Var.E.s0().C1, 0);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 13, b0Var.E.g(), b0Var.E.f(), "", b0Var.E.s0().F);
                } else if (!android.text.TextUtils.isEmpty(b0Var.E.s0().G)) {
                    lu1.d.j(b0Var.f94936e, b0Var.E.s0().G, 3);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 13, b0Var.E.g(), b0Var.E.f(), "", b0Var.E.s0().F);
                }
            } else if (view.getId() == com.tencent.mm.R.id.bbh) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "OpenShareUserSelectView", 0, java.lang.Integer.valueOf(b0Var.E.s0().f388550i), b0Var.E.f(), b0Var.E.g(), b0Var.U.f95106d);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KLabel_range_index", b0Var.K);
                intent.putExtra("Klabel_name_list", b0Var.L);
                intent.putExtra("Kother_user_name_list", b0Var.M);
                com.tencent.mm.ui.MMActivity mMActivity = b0Var.f94936e;
                intent.putExtra("k_sns_label_ui_title", mMActivity.getString(com.tencent.mm.R.string.av9));
                intent.putExtra("k_sns_label_ui_style", 0);
                intent.putExtra("KLabel_is_filter_private", true);
                j45.l.n(mMActivity, "sns", ".ui.SnsLabelUI", intent, 2);
                mMActivity.mmSetOnActivityResultCallback(b0Var);
            } else {
                int i28 = 10;
                if (view.getId() == com.tencent.mm.R.id.bbw) {
                    if (b0Var.E.i0().f385191q != null) {
                        java.util.LinkedList linkedList2 = b0Var.E.i0().f385191q;
                        int intValue = ((java.lang.Integer) view.getTag()).intValue();
                        r45.w50 w50Var = (r45.w50) linkedList2.get(intValue);
                        java.lang.String g17 = b0Var.E.g();
                        com.tencent.mm.plugin.card.ui.p0 p0Var = b0Var.U;
                        if (lu1.d.e(g17, w50Var, p0Var.f95104b, p0Var.f95110h)) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 19, b0Var.E.g(), b0Var.E.f(), "", w50Var.f388878d);
                        } else if (w50Var != null && !android.text.TextUtils.isEmpty(w50Var.f388881g)) {
                            java.lang.String str4 = w50Var.f388881g;
                            com.tencent.mm.ui.MMActivity mMActivity2 = b0Var.f94936e;
                            lu1.d.j(mMActivity2, str4, 1);
                            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
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
                            objArr[4] = w50Var.f388878d;
                            g0Var.d(11941, objArr);
                            if (lu1.a0.C(w50Var, b0Var.E.g())) {
                                lu1.a0.L(b0Var.E.g(), w50Var.f388878d);
                                lu1.d.h(mMActivity2, b0Var.E.s0().f388552m);
                            }
                        }
                    }
                } else if (view.getId() == com.tencent.mm.R.id.bbx) {
                    if (b0Var.E.i0().f385191q != null) {
                        r45.w50 w50Var2 = (r45.w50) b0Var.E.i0().f385191q.get(0);
                        java.lang.String g18 = b0Var.E.g();
                        com.tencent.mm.plugin.card.ui.p0 p0Var2 = b0Var.U;
                        if (lu1.d.e(g18, w50Var2, p0Var2.f95104b, p0Var2.f95110h)) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 19, b0Var.E.g(), b0Var.E.f(), "", w50Var2.f388878d);
                        } else if (w50Var2 != null && !android.text.TextUtils.isEmpty(w50Var2.f388881g)) {
                            java.lang.String str5 = w50Var2.f388881g;
                            com.tencent.mm.ui.MMActivity mMActivity3 = b0Var.f94936e;
                            lu1.d.j(mMActivity3, str5, 1);
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 10, b0Var.E.g(), b0Var.E.f(), "", w50Var2.f388878d);
                            if (lu1.a0.C(w50Var2, b0Var.E.g())) {
                                lu1.a0.L(b0Var.E.g(), w50Var2.f388878d);
                                lu1.d.h(mMActivity3, b0Var.E.s0().f388552m);
                            }
                        }
                    }
                } else if (view.getId() == com.tencent.mm.R.id.bct || view.getId() == com.tencent.mm.R.id.bb8) {
                    str = "(Landroid/view/View;)V";
                    if (b0Var.E.i0().f385198x != null) {
                        if (!b0Var.E.h()) {
                            boolean n07 = b0Var.E.n0();
                            com.tencent.mm.ui.MMActivity mMActivity4 = b0Var.f94936e;
                            if (n07) {
                                lu1.d.g(mMActivity4, 0, null, false, b0Var.E);
                            } else {
                                r45.w50 w50Var3 = b0Var.E.i0().f385198x;
                                java.lang.String g19 = b0Var.E.g();
                                com.tencent.mm.plugin.card.ui.p0 p0Var3 = b0Var.U;
                                if (lu1.d.e(g19, w50Var3, p0Var3.f95104b, p0Var3.f95110h)) {
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 20, b0Var.E.g(), b0Var.E.f(), "", w50Var3.f388878d);
                                } else if (w50Var3 != null && !android.text.TextUtils.isEmpty(w50Var3.f388881g)) {
                                    lu1.d.j(mMActivity4, lu1.a0.k(w50Var3.f388881g, w50Var3.f388882h), 1);
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 9, b0Var.E.g(), b0Var.E.f(), "", w50Var3.f388878d);
                                    if (lu1.a0.C(w50Var3, b0Var.E.g())) {
                                        lu1.a0.L(b0Var.E.g(), w50Var3.f388878d);
                                        lu1.d.h(mMActivity4, b0Var.E.s0().f388552m);
                                    }
                                }
                            }
                        } else if (b0Var.E.i()) {
                            com.tencent.mm.plugin.card.ui.s0 s0Var5 = b0Var.T;
                            if (s0Var5 != null) {
                                ((com.tencent.mm.plugin.card.ui.q) s0Var5).a(false);
                            }
                        } else {
                            b0Var.a(false, new wt1.b0(), false);
                        }
                    }
                } else if (view.getId() == com.tencent.mm.R.id.b9m || view.getId() == com.tencent.mm.R.id.b7m) {
                    str = "(Landroid/view/View;)V";
                    r45.de0 de0Var = b0Var.E.s0().M;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardLeftRightIntroduceView", java.lang.Integer.valueOf(b0Var.E.s0().f388550i), b0Var.E.f(), b0Var.E.g(), 0, java.lang.Integer.valueOf(b0Var.U.f95104b), b0Var.U.f95106d, java.lang.Integer.valueOf(b0Var.E.n() ? 1 : 0), "");
                    com.tencent.mm.ui.MMActivity mMActivity5 = b0Var.f94936e;
                    if (de0Var == null || android.text.TextUtils.isEmpty(de0Var.f372341e)) {
                        android.content.Intent intent2 = new android.content.Intent();
                        tt1.j jVar = b0Var.E;
                        if (jVar instanceof com.tencent.mm.plugin.card.model.CardInfo) {
                            intent2.putExtra("key_card_info_data", (com.tencent.mm.plugin.card.model.CardInfo) jVar);
                        } else if (jVar instanceof com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) {
                            intent2.putExtra("key_card_info_data", (com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) jVar);
                        }
                        intent2.setClass(mMActivity5, com.tencent.mm.plugin.card.ui.CardDetailPreference.class);
                        com.tencent.mm.ui.MMActivity mMActivity6 = b0Var.f94936e;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(mMActivity6, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mMActivity6.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(mMActivity6, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        lu1.d.j(mMActivity5, de0Var.f372341e, 1);
                    }
                } else if (view.getId() == com.tencent.mm.R.id.mtx) {
                    if (eu1.f.d(b0Var.E.f()) <= 1) {
                        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else {
                        b0Var.f94939h = !b0Var.f94939h;
                        b0Var.f();
                    }
                } else if (view.getId() == com.tencent.mm.R.id.b7r) {
                    if (b0Var.E.s0().I != null && !android.text.TextUtils.isEmpty(b0Var.E.s0().I.f378105f)) {
                        lu1.d.j(b0Var.f94936e, b0Var.E.s0().I.f378105f, 3);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 3, b0Var.E.g(), b0Var.E.f(), "", b0Var.E.s0().I.f378104e);
                    }
                } else if (view.getId() == com.tencent.mm.R.id.b7c) {
                    if (b0Var.E.s0().Q != null && !com.tencent.mm.sdk.platformtools.t8.K0(b0Var.E.s0().Q.f385375e)) {
                        lu1.d.j(b0Var.f94936e, b0Var.E.s0().Q.f385375e, 1);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 14, b0Var.E.g(), b0Var.E.f(), "", b0Var.E.s0().Q.f385374d);
                    }
                } else if (view.getId() == com.tencent.mm.R.id.mu8 || view.getId() == com.tencent.mm.R.id.mu9) {
                    if (b0Var.E.s0().f388565x >= 1) {
                        java.util.ArrayList arrayList3 = b0Var.F;
                        if (arrayList3 == null || arrayList3.size() == 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                        r45.nu nuVar = (r45.nu) b0Var.F.get(0);
                        lu1.d.c(b0Var.f94936e, nuVar.f381681p, nuVar.f381680o, null, nuVar.f381678m);
                        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var2.d(11324, "UsedStoresView", java.lang.Integer.valueOf(b0Var.E.s0().f388550i), b0Var.E.f(), b0Var.E.g(), 0, java.lang.Integer.valueOf(b0Var.U.f95104b), b0Var.U.f95106d, java.lang.Integer.valueOf(b0Var.E.n() ? 1 : 0), "");
                        g0Var2.d(11941, 5, b0Var.E.g(), b0Var.E.f(), "", nuVar.f381672d);
                        str = "(Landroid/view/View;)V";
                    }
                } else if (view.getId() == com.tencent.mm.R.id.o7d) {
                    java.util.ArrayList arrayList4 = b0Var.F;
                    if (arrayList4 == null || arrayList4.size() == 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    r45.nu nuVar2 = (r45.nu) b0Var.F.get(0);
                    java.lang.String str6 = (java.lang.String) view.getTag();
                    boolean isEmpty = android.text.TextUtils.isEmpty(str6);
                    com.tencent.mm.ui.MMActivity mMActivity7 = b0Var.f94936e;
                    if (!isEmpty && str6.equals(mMActivity7.getString(com.tencent.mm.R.string.arn))) {
                        com.tencent.mm.plugin.card.ui.b0.b(b0Var);
                        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (!android.text.TextUtils.isEmpty(nuVar2.f381682q)) {
                        lu1.d.j(mMActivity7, nuVar2.f381682q, 1);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 4, b0Var.E.g(), b0Var.E.f(), "", nuVar2.f381672d);
                    }
                } else if (view.getId() == com.tencent.mm.R.id.o79) {
                    com.tencent.mm.plugin.card.ui.b0.b(b0Var);
                }
            }
            str = "(Landroid/view/View;)V";
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller$6", "android/view/View$OnClickListener", "onClick", str);
    }
}
