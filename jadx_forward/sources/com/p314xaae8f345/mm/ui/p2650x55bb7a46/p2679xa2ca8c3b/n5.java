package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class n5 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f286436s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570092x6);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l5 l5Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l5();
        l5Var.a(xgVar, false);
        xgVar.setTag(l5Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        ot0.q v17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        int itemId = menuItem.getItemId();
        if (itemId == 103) {
            java.lang.String j17 = f9Var.j();
            if (j17 != null && (v17 = ot0.q.v(j17)) != null && v17.f430199i == 16) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5628xba03adfa c5628xba03adfa = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5628xba03adfa();
                java.lang.String str = v17.T0;
                am.yg ygVar = c5628xba03adfa.f135956g;
                ygVar.f89991a = str;
                ygVar.f89992b = f9Var.m124847x74d37ac6();
                ygVar.f89993c = f9Var.Q0();
                c5628xba03adfa.e();
            }
        } else if (itemId == 111) {
            java.lang.String l17 = c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0());
            android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
            intent.putExtra("Retr_Msg_content", l17);
            intent.putExtra("scene_from", 17);
            ot0.q v18 = ot0.q.v(l17);
            if (v18 == null || 16 != v18.f430199i) {
                intent.putExtra("Retr_Msg_Type", 2);
            } else {
                intent.putExtra("Retr_Msg_Type", 14);
            }
            intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCouponCard$ChattingItemAppMsgCouponCardTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            dVar.a0((android.content.Intent) arrayList.get(0));
            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCouponCard$ChattingItemAppMsgCouponCardTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        ot0.q v17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        if (f9Var.j() == null || (v17 = ot0.q.v(c01.w9.l(this.f286436s.D(), f9Var.j(), f9Var.A0()))) == null) {
            return true;
        }
        int i17 = v17.f430199i;
        if (i17 == 16) {
            int i18 = v17.W0;
            if (i18 == 5 || i18 == 6 || i18 == 2) {
                if (i18 != 2) {
                    g4Var.clear();
                }
                g4Var.c(d17, 100, 0, this.f286436s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                g4Var.c(d17, 122, 0, this.f286436s.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3u), com.p314xaae8f345.mm.R.raw.f79818xafe47098);
                return false;
            }
        } else if (i17 == 34) {
            g4Var.clear();
            g4Var.c(d17, 100, 0, this.f286436s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            return false;
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return false;
        }
        int i17 = v17.f430199i;
        if (i17 == 16) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.T0)) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setFlags(65536);
            intent.putExtra("key_card_app_msg", v17.T0);
            intent.putExtra("key_from_scene", v17.W0);
            j45.l.j(dVar.g(), "card", ".ui.CardDetailUI", intent, null);
            return true;
        }
        if (i17 != 34) {
            return false;
        }
        wt1.o a17 = wt1.o.a(v17);
        if (1 < a17.f530851c) {
            java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(v17.f430211l, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
            android.content.pm.PackageInfo j18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.j(dVar.g(), v17.f430179d);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.n(dVar, wi6, wi6, j18 == null ? null : j18.versionName, j18 == null ? 0 : j18.versionCode, v17.f430179d, true, f9Var.m124847x74d37ac6(), f9Var.I0(), f9Var, v17, A(dVar, f9Var));
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_from_user_name", A(dVar, f9Var));
            intent2.putExtra("key_biz_uin", a17.f530849a);
            intent2.putExtra("key_order_id", a17.f530850b);
            if (f9Var.Q0() != null && !f9Var.Q0().equals("") && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
                intent2.putExtra("key_chatroom_name", f9Var.Q0());
            }
            j45.l.j(dVar.g(), "card", ".ui.CardGiftAcceptUI", intent2, null);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f286436s = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l5 l5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l5) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (l5Var != null && v17 != null) {
            l5Var.b(f9Var, dVar.g(), v17, f9Var.z0());
        }
        g0Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), g0Var, null));
        g0Var.f39493x8ad70635.setOnClickListener(w(dVar));
        g0Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
        g0Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
    }
}
