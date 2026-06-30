package xb3;

/* loaded from: classes9.dex */
public class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c f534443a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c) {
        this.f534443a = activityC16335x1879211c;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        boolean z17;
        int i17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c = this.f534443a;
        activityC16335x1879211c.f226680u.dismiss();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do receive hb, errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.u43 u43Var = (r45.u43) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do receive hb, retcode: %s, %s", java.lang.Integer.valueOf(u43Var.f468541d), u43Var.f468542e);
            if (u43Var.f468541d == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "jump to h5: %s", java.lang.Boolean.valueOf(u43Var.f468552r));
                if (u43Var.f468552r) {
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC16335x1879211c.mo55332x76847179(), activityC16335x1879211c.getIntent().getStringExtra("key_hk_url"), true);
                } else {
                    at4.k1 k1Var = new at4.k1();
                    k1Var.f66558xf7c5f050 = activityC16335x1879211c.f226683x;
                    k1Var.f66556xfcd83239 = u43Var.f468549o;
                    k1Var.f66555x2592af31 = u43Var.f468547m;
                    k1Var.f66562xd3086e30 = u43Var.f468546i;
                    ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().mo11260x413cb2b4(k1Var);
                    if (u43Var.f468546i == 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do query detail");
                        new wb3.a(activityC16335x1879211c.f226683x, activityC16335x1879211c.f226682w, 11, 0, 1, activityC16335x1879211c.getIntent().getIntExtra("key_hk_scene", 0)).l().h(new xb3.f(activityC16335x1879211c)).f(activityC16335x1879211c);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(activityC16335x1879211c.f226670h, "", u43Var.f468550p);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(activityC16335x1879211c.mo55332x76847179(), activityC16335x1879211c.f226671i, activityC16335x1879211c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.god, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.I(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(u43Var.f468550p), 10)));
                        if (u43Var.f468546i == 1 || (i17 = u43Var.f468547m) == 4 || i17 == 5 || i17 == 1) {
                            activityC16335x1879211c.f226674o.setVisibility(8);
                            activityC16335x1879211c.f226675p.setVisibility(8);
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u43Var.f468548n)) {
                                activityC16335x1879211c.f226673n.setVisibility(8);
                            } else {
                                activityC16335x1879211c.f226673n.setText(u43Var.f468548n);
                                activityC16335x1879211c.f226673n.setVisibility(0);
                                activityC16335x1879211c.f226673n.setSingleLine(false);
                            }
                            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC16335x1879211c.f226676q.getLayoutParams();
                            layoutParams.bottomMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(activityC16335x1879211c.mo55332x76847179(), 30.0f);
                            activityC16335x1879211c.f226676q.setLayoutParams(layoutParams);
                            z17 = true;
                        } else {
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u43Var.f468548n)) {
                                activityC16335x1879211c.f226672m.setText(u43Var.f468548n);
                                activityC16335x1879211c.f226672m.setVisibility(0);
                            }
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u43Var.f468544g)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(activityC16335x1879211c.mo55332x76847179(), activityC16335x1879211c.f226673n, u43Var.f468544g);
                                activityC16335x1879211c.f226673n.setVisibility(0);
                                activityC16335x1879211c.f226672m.setVisibility(8);
                            }
                            activityC16335x1879211c.f226674o.setOnClickListener(new xb3.k(this, new fo3.m(activityC16335x1879211c.f226674o, "ce_open_lm", "<LuckyMoney>"), u43Var));
                            z17 = false;
                        }
                        if (c01.z1.r().equals(null) || (u43Var.f468549o == 1 && z17)) {
                            if (u43Var.f468549o == 1) {
                                activityC16335x1879211c.f226678s.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573949gk1);
                            }
                            android.view.View view = activityC16335x1879211c.f226676q;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            activityC16335x1879211c.f226676q.setOnClickListener(new xb3.l(this));
                            activityC16335x1879211c.f226677r.setVisibility(8);
                        } else {
                            android.view.View view2 = activityC16335x1879211c.f226676q;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            activityC16335x1879211c.f226677r.setVisibility(0);
                        }
                        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) activityC16335x1879211c.f226669g.getLayoutParams();
                        layoutParams2.topMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(activityC16335x1879211c.mo55332x76847179(), 118.0f);
                        activityC16335x1879211c.f226669g.setLayoutParams(layoutParams2);
                        if (com.p314xaae8f345.mm.ui.bk.C()) {
                            activityC16335x1879211c.f226681v.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77651xad7ef2f);
                            com.p314xaae8f345.mm.ui.bk.p0(activityC16335x1879211c, activityC16335x1879211c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77651xad7ef2f));
                        } else {
                            activityC16335x1879211c.f226681v.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560887x8);
                            com.p314xaae8f345.mm.ui.bk.p0(activityC16335x1879211c, activityC16335x1879211c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560887x8));
                        }
                        android.view.View m78513xc2a54588 = activityC16335x1879211c.m78513xc2a54588();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(m78513xc2a54588, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view3 = activityC16335x1879211c.f226679t;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.A(activityC16335x1879211c.f226679t);
                    }
                }
            } else {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c.B;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u43Var.f468542e)) {
                    str = u43Var.f468542e;
                }
                db5.e1.T(activityC16335x1879211c.mo55332x76847179(), str);
                activityC16335x1879211c.finish();
            }
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c.B;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f152150c)) {
                str2 = fVar.f152150c;
            }
            db5.e1.T(activityC16335x1879211c.mo55332x76847179(), str2);
            activityC16335x1879211c.finish();
        }
        return null;
    }
}
