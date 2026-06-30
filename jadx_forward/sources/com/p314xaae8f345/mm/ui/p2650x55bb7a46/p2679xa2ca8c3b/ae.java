package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ae extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f284881s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f284882t = "";

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570089x1);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od odVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od();
        odVar.a(xgVar, true);
        xgVar.setTag(odVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        int itemId = menuItem.getItemId();
        if (itemId == 102) {
            java.lang.String str = ot0.q.v(f9Var.j()).f430187f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(str);
            w04.a.INSTANCE.A9(1, f9Var.I0() + "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o0(str));
            return false;
        }
        if (itemId != 111) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_content", f9Var.j());
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        java.lang.String d17 = te5.e2.d(f9Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            intent.putExtra("weAppSourceUserName", d17);
        }
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        if (!c01.ia.x(f9Var)) {
            g4Var.c(d17, 102, 0, this.f284881s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
            g4Var.c(d17, 111, 0, this.f284881s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        j45.l.g("favorite");
        g4Var.c(d17, 116, 0, this.f284881s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        if (c01.ia.A(f9Var)) {
            g4Var.clear();
        }
        if (!f9Var.t2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f284881s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()))) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        if (!this.f284881s.F()) {
            g4Var.c(d17, 100, 0, this.f284881s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.k2()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(f9Var);
            c01.w9.f(f9Var.m124847x74d37ac6(), f9Var.Q0());
            dVar.L(true);
        }
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ld.b(this.f284881s, view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        boolean z17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od odVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od) g0Var;
        this.f284881s = dVar;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7) ((sb5.e0) dVar.f542241c.a(sb5.e0.class))).n0(f9Var);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        int i17 = 0;
        if (v17 == null || v17.f430199i != 1) {
            z17 = true;
        } else {
            android.os.Bundle a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.m1.a(dVar.D(), k01.d.a(f9Var.Q0()));
            android.os.Bundle c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.c(f9Var, dVar, str);
            c17.putAll(a17);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = odVar.f286712b.getContext();
            boolean z18 = !com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ld.a(f9Var);
            java.lang.String str3 = v17.f430187f;
            int m84164x40077844 = (int) odVar.f286712b.m84164x40077844();
            le0.r rVar = le0.x.P0;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString k17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.k(context, z18, str3, m84164x40077844, 4, c17, rVar, 0, true);
            odVar.f286712b.c(k17, android.widget.TextView.BufferType.SPANNABLE, null);
            odVar.f286712b.setClickable(true);
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str4 = v17.f430179d;
            ((kt.c) i0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str4);
            java.lang.String str5 = (h17 == null || (str2 = h17.f67372x453d1e07) == null || str2.trim().length() <= 0) ? v17.H : h17.f67372x453d1e07;
            java.lang.String str6 = v17.f430179d;
            if (str6 == null || str6.length() <= 0 || !com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.y(str5)) {
                odVar.f286713c.setVisibility(8);
            } else {
                odVar.f286713c.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572424b65, ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), h17, str5)));
                odVar.f286713c.setVisibility(0);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.r(dVar, odVar.f286713c, v17.f430179d);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.w(dVar, odVar.f286713c, v17.f430179d);
            }
            if (te5.e2.e(v17)) {
                com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e g17 = te5.e2.g(v17);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ca caVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ca();
                caVar.f271779a = g17;
                caVar.f271780b = dVar.x();
                caVar.f271781c = te5.e2.d(f9Var);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.q(dVar, odVar.f286718h, caVar);
                odVar.f286718h.setVisibility(0);
                odVar.f286719i.setText(dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.epp, g17.f152795e));
                odVar.f286720j.setImageResource(com.p314xaae8f345.mm.R.raw.f78484x5341c45);
            } else {
                odVar.f286718h.setVisibility(8);
            }
            Z(odVar, f9Var.P0() < 2, true);
            z17 = true;
            V(odVar, dVar2, dVar.t(), dVar.D(), dVar, this);
            int j17 = c01.ia.j(f9Var);
            boolean z19 = !com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ld.a(f9Var);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = odVar.f286712b;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) c22624x85d69039.getTag();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.p(j17, k17, c22624x85d69039, z19, erVar != null ? erVar.c() : null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.md(dVar, k17));
        }
        odVar.f286712b.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), odVar, null));
        odVar.f286712b.setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.TRUE);
        if (c01.d9.b().E() && v17 != null && v17.f430199i == z17) {
            if (odVar.f286716f == null) {
                android.app.Activity g18 = this.f284881s.g();
                rl5.r rVar2 = new rl5.r(g18, odVar.f286712b);
                odVar.f286716f = rVar2;
                rVar2.L = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xd(this, odVar);
                boolean k18 = ti3.i.k(f9Var);
                boolean m60126x74219ae7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7();
                rl5.r rVar3 = odVar.f286716f;
                rVar3.C = z17;
                rVar3.Q = false;
                rVar3.f478888y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.yd(this, g18, odVar, m60126x74219ae7, k18, f9Var);
                rVar3.f478887x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zd(this, odVar, g18, f9Var);
            }
            if (c01.ia.A(f9Var)) {
                odVar.f286712b.setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.FALSE);
                odVar.f286712b.setOnTouchListener(odVar.b(this.f284881s));
                odVar.f286712b.setOnLongClickListener(u(this.f284881s));
            } else {
                int i18 = c01.ia.i(f9Var);
                if (i18 <= 0 || i18 >= wl5.y.o(odVar.f286712b).length()) {
                    i18 = wl5.y.o(odVar.f286712b).length();
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u17 = u(this.f284881s);
                wl5.v x17 = x(u17);
                wl5.x xVar2 = odVar.f286717g;
                if (xVar2 != null) {
                    xVar2.c();
                }
                int[] iArr = new int[2];
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = odVar.f286712b;
                if (c22624x85d690392 != null) {
                    c22624x85d690392.getLocationInWindow(iArr);
                    i17 = iArr[0];
                    if (i17 == 0) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        odVar.f286712b.getGlobalVisibleRect(rect);
                        i17 = rect.left;
                    }
                }
                wl5.o oVar = new wl5.o(odVar.f286712b, odVar.f286716f, x17, null, odVar.b(this.f284881s));
                oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.a3y;
                oVar.f528657h = 18;
                oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560393j6;
                if (i17 != 0) {
                    oVar.a(i17 + com.p314xaae8f345.mm.ui.zk.e(odVar.f286712b.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
                }
                wl5.x xVar3 = new wl5.x(oVar);
                odVar.f286717g = xVar3;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.be beVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.be(xVar3);
                xVar3.f528692d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vd(this);
                u17.f286826h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wd(this, odVar);
                xVar3.C = i18;
                xVar3.Y = beVar;
            }
            odVar.f286712b.m84180x74caf26a(this);
        }
    }
}
