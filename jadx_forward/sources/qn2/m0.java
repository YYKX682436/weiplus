package qn2;

/* loaded from: classes3.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f446648d;

    public m0(qn2.v0 v0Var) {
        this.f446648d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        r45.mg0 mg0Var;
        r45.y23 y23Var;
        r45.ce0 ce0Var;
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        qn2.v0 v0Var = this.f446648d;
        km2.z zVar = ((on2.z2) v0Var.f446709a.P0(on2.z2.class)).f428625m;
        r45.cz1 cz1Var = zVar != null ? zVar.f390765d : null;
        if (cz1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VisitorLotteryCardDoneWidget", "onClaimClick but lotteryInfo is null!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorLotteryCardDoneWidget", "[onClaimClick] lotteryInfo:" + pm0.b0.g(cz1Var));
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.p4 p4Var = ml2.p4.f409340u;
            on2.l3 l3Var = on2.l3.f428499a;
            r45.yy1 yy1Var = (r45.yy1) cz1Var.m75936x14adae67(13);
            int m75939xb282bd08 = yy1Var != null ? yy1Var.m75939xb282bd08(0) : 0;
            ml2.r0.ek(r0Var, p4Var, m75939xb282bd08 != 1 ? m75939xb282bd08 != 2 ? m75939xb282bd08 != 3 ? "1" : "4" : "3" : "2", null, 0, null, 28, null);
            r45.yy1 yy1Var2 = (r45.yy1) cz1Var.m75936x14adae67(13);
            java.lang.Integer valueOf = yy1Var2 != null ? java.lang.Integer.valueOf(yy1Var2.m75939xb282bd08(0)) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                android.content.Context context = v0Var.f446710b.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                java.lang.String str = ((mm2.c1) v0Var.f446709a.P0(mm2.c1.class)).f410385o;
                r45.j55 j55Var = (r45.j55) cz1Var.m75936x14adae67(11);
                if (j55Var != null) {
                    i17 = 0;
                    i18 = j55Var.m75939xb282bd08(0);
                } else {
                    i17 = 0;
                    i18 = 0;
                }
                java.lang.String m75945x2fec8307 = cz1Var.m75945x2fec8307(i17);
                l3Var.c(context, str, i18, m75945x2fec8307 == null ? "" : m75945x2fec8307, ((mm2.e1) v0Var.f446709a.P0(mm2.e1.class)).f410516m, v0Var.f446709a.f194859h);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                android.content.Context context2 = v0Var.f446710b.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("launch_from_select_addr", true);
                intent.putExtra("enter_scene_address", 3);
                j45.l.o(context2, "address", ".ui.WalletSelectAddrUI", intent, 1001, false);
            } else if (valueOf != null && valueOf.intValue() == 2) {
                android.view.ViewGroup viewGroup = v0Var.f446710b;
                if (viewGroup.getContext() instanceof android.app.Activity) {
                    android.content.Context context3 = viewGroup.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
                    v0Var.f446733y = l3Var.a((android.app.Activity) context3, cz1Var, new qn2.u0(v0Var, cz1Var));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VisitorLotteryCardDoneWidget", "claimByCustomize but context isn't Activity!");
                }
            } else if (valueOf != null && valueOf.intValue() == 3) {
                r45.yy1 yy1Var3 = (r45.yy1) cz1Var.m75936x14adae67(13);
                if (yy1Var3 != null && (m75934xbce7f2f = yy1Var3.m75934xbce7f2f(7)) != null) {
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f398565k = 1205;
                    r45.yy1 yy1Var4 = (r45.yy1) cz1Var.m75936x14adae67(13);
                    if (yy1Var4 != null && yy1Var4.m75939xb282bd08(3) == 0) {
                        r45.y23 y23Var2 = new r45.y23();
                        try {
                            y23Var2.mo11468x92b714fd(m75934xbce7f2f.g());
                            y23Var = y23Var2;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                            y23Var = null;
                        }
                        if (y23Var != null && (ce0Var = (r45.ce0) y23Var.m75936x14adae67(8)) != null) {
                            java.lang.String m75945x2fec83072 = ce0Var.m75945x2fec8307(0);
                            if (m75945x2fec83072 == null) {
                                m75945x2fec83072 = "";
                            }
                            b1Var.f398547b = m75945x2fec83072;
                            java.lang.String m75945x2fec83073 = ce0Var.m75945x2fec8307(1);
                            b1Var.f398555f = m75945x2fec83073 != null ? m75945x2fec83073 : "";
                            b1Var.f398570o = new qn2.l0(v0Var.f446709a);
                            float f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation == 2) {
                                f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
                            }
                            b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, (int) ((ae2.in.f85221a.h0() / 100.0f) * f17), null, false, null, false, null, k91.t2.f387301f, false, false, null, null, true, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -4996, 2047, null);
                            dk2.q4 q4Var = dk2.q4.f315471a;
                            android.content.Context context4 = v0Var.f446710b.getContext();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
                            q4Var.n(context4, v0Var.f446709a.S0(), b1Var, v0Var.f446709a.Y0());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorLotteryCardDoneWidget", "claim prize appid = " + b1Var.f398547b + ", username = " + b1Var.f398545a + ", path = " + b1Var.f398555f);
                        }
                    } else {
                        r45.mg0 mg0Var2 = new r45.mg0();
                        try {
                            mg0Var2.mo11468x92b714fd(m75934xbce7f2f.g());
                            mg0Var = mg0Var2;
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                            mg0Var = null;
                        }
                        if (mg0Var != null) {
                            java.lang.String m75945x2fec83074 = mg0Var.m75945x2fec8307(1);
                            if (m75945x2fec83074 == null) {
                                m75945x2fec83074 = "";
                            }
                            b1Var.f398545a = m75945x2fec83074;
                            java.lang.String m75945x2fec83075 = mg0Var.m75945x2fec8307(2);
                            b1Var.f398555f = m75945x2fec83075 != null ? m75945x2fec83075 : "";
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(v0Var.f446710b.getContext(), b1Var);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorLotteryCardDoneWidget", "claim prize appid = " + b1Var.f398547b + ", username = " + b1Var.f398545a + ", path = " + b1Var.f398555f);
                        }
                    }
                }
            } else if (valueOf != null && valueOf.intValue() == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorLotteryCardDoneWidget", "onClaimClick open gift panel");
                v0Var.f446709a.K0(8);
                r45.zb4 zb4Var = new r45.zb4();
                zb4Var.set(2, v0Var.f446710b.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573096dj5));
                zb4Var.set(4, java.lang.Boolean.TRUE);
                ((mm2.s2) v0Var.f446709a.P0(mm2.s2.class)).f410944p.mo7808x76db6cb1(zb4Var);
            } else if (valueOf != null && valueOf.intValue() == 5) {
                df2.oj ojVar = (df2.oj) v0Var.f446709a.U0(df2.oj.class);
                if (ojVar != null) {
                    ojVar.k7(r45.r84.AfterLottery, null);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VisitorLotteryCardDoneWidget", "onClaimClick but claim type is error!");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
