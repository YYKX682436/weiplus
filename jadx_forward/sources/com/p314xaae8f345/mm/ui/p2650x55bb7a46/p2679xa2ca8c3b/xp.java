package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class xp extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f287537s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f287538t;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public java.lang.String A(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return dVar.x();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570103xl);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cs csVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cs();
        csVar.a(xgVar, true);
        xgVar.setTag(csVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_content", c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        int r17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.r(c01.w9.l(this.f287537s.D(), f9Var.j(), f9Var.A0()));
        long j17 = ot0.q.v(c01.w9.l(this.f287537s.D(), f9Var.j(), f9Var.A0())).f430215m;
        if (j17 <= 0 || (j17 > 0 && r17 >= 100)) {
            g4Var.c(d17, 111, 0, this.f287537s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        if (this.f287537s.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, this.f287537s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean c0(yb5.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cs csVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cs) g0Var;
        this.f287537s = dVar;
        java.lang.String U1 = f9Var.U1();
        ot0.q v17 = ot0.q.v(U1);
        zf4.o a17 = zf4.o.a(U1);
        if (a17 != null && a17.f554215a != 0) {
            try {
                java.lang.String h17 = k35.m1.h(dVar.g(), a17.f554215a);
                if (h17 == null || h17.length() <= 0) {
                    str3 = "";
                } else {
                    java.lang.String[] split = h17.split(";");
                    str3 = "" + split[0].replace(" ", "");
                    if (split.length > 1) {
                        str3 = str3 + split[1];
                    }
                }
                if (v17 != null && v17.f430191g != null) {
                    str3 = str3 + " " + v17.f430191g;
                }
                csVar.f285282b.setText(str3);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemVoiceRemindRemind", e17, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(f9Var.j());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.z0()) && a17.f554219e > 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).o2(f9Var.Q0(), a17.f554219e);
            if (o27 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o27.z0())) {
                java.lang.String y07 = zf4.b0.y0(c01.z1.r());
                if (com.p314xaae8f345.mm.vfs.w6.d(zf4.r.b(o27.z0(), false), zf4.r.b(y07, false), false) >= 0) {
                    f9Var.i1(y07);
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.z0()) && a17 != null && (str2 = a17.f554220f) != null && str2.length() > 0 && a17.f554221g > 0 && this.f287538t == null) {
            java.lang.String y08 = zf4.b0.y0(c01.z1.r());
            java.lang.String b17 = zf4.r.b(y08, false);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.z0())) {
                f9Var.i1(y08);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
                java.lang.String str4 = v17.f430227p;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d i17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.i(b17, f9Var.m124847x74d37ac6(), f9Var.Q0(), v17.f430183e, v17.f430179d, v17.f430227p, v17.f430215m, false);
                if (i17.f68105x2c1f0acb != null) {
                    com.p314xaae8f345.mm.p944x882e457a.r1 e18 = c01.d9.e();
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vp vpVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vp(this);
                    this.f287538t = vpVar;
                    e18.a(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, vpVar);
                    c01.d9.e().g(new bt3.l0(i17, true));
                }
            }
        }
        csVar.f285283c.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wp(this, f9Var, csVar));
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).s0(f9Var.m124847x74d37ac6())) {
            csVar.f285283c.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.as6);
        } else {
            csVar.f285283c.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.as8);
        }
        csVar.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), csVar, null));
        if (c01.d9.b().E()) {
            csVar.f39493x8ad70635.setOnLongClickListener(u(dVar));
        }
    }
}
