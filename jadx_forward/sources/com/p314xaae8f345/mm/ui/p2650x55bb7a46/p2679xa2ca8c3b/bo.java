package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class bo {
    public static void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18) {
        int j17;
        if (f9Var != null && (j17 = c01.ia.j(f9Var)) > 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6740x861a3f0 c6740x861a3f0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6740x861a3f0();
            int i19 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(f9Var.Q0())) ? 2 : 1;
            int i27 = f9Var.A0() != 1 ? 0 : 1;
            c6740x861a3f0.f140735f = f9Var.I0();
            c6740x861a3f0.f140733d = i19;
            c6740x861a3f0.f140734e = i27;
            c6740x861a3f0.f140738i = j17;
            c6740x861a3f0.f140736g = i17;
            c6740x861a3f0.f140737h = i18;
            c6740x861a3f0.k();
        }
    }

    public static java.lang.String b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.mo78013xfb85f7b0() == 1107296305) {
            try {
                ot0.q v17 = ot0.q.v(f9Var.U1());
                if (v17 != null) {
                    return ((rt0.d) v17.y(rt0.d.class)).f480908b;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemText", e17, null, new java.lang.Object[0]);
            }
        }
        return f9Var.j();
    }

    public static android.os.Bundle c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar, java.lang.String str) {
        rt0.c cVar;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("msgSvrId", f9Var.I0());
        java.lang.String d17 = te5.e2.d(f9Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            bundle.putBoolean("useChatTool", true);
            bundle.putString("weAppSourceUserName", d17);
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null && (cVar = (rt0.c) v17.y(rt0.c.class)) != null && cVar.f480907b == 3) {
            bundle.putBoolean("shareMiddlePage", true);
        }
        return bundle;
    }

    public static void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, yb5.d dVar) {
        if ((f9Var.r2() || f9Var.y2() || z3Var != null) && z3Var.M1 == f9Var.m124847x74d37ac6()) {
            if (c01.id.c() - f9Var.mo78012x3fdd41df() < rn.e.f479132e.longValue() && c01.e2.Z(dVar.x())) {
                f(aoVar.f284929s, 0);
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.X1());
                aoVar.f284929s.setTag(f9Var);
                aoVar.f284929s.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fn(dVar, aoVar));
                h(K0, aoVar, dVar);
                return;
            }
        }
        f(aoVar.f284929s, 8);
    }

    public static void e(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var, wl5.v vVar) {
        android.app.Activity g17 = dVar.g();
        wl5.x xVar = aoVar.f284924n;
        if (xVar != null) {
            xVar.c();
        }
        aoVar.f284915e.m80028xc2a54588().setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.TRUE);
        rl5.r rVar = new rl5.r(g17, aoVar.f284915e.m80028xc2a54588());
        aoVar.f284923m = rVar;
        rVar.L = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zm(dVar, aoVar);
        boolean m60126x74219ae7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7();
        rl5.r rVar2 = aoVar.f284923m;
        rVar2.C = true;
        rVar2.Q = false;
        rVar2.f478888y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.an(aoVar, dVar, f9Var, g17, m60126x74219ae7);
        rVar2.f478887x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bn(aoVar, dVar, f9Var, g17);
        wl5.o oVar = new wl5.o(aoVar.f284915e.m80028xc2a54588(), aoVar.f284923m, vVar, qn4.y.g() ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t0() : null, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y(aoVar.f284915e.m80028xc2a54588(), new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(g17)));
        oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.a3y;
        oVar.f528657h = 18;
        oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560393j6;
        wl5.x xVar2 = new wl5.x(oVar);
        aoVar.f284924n = xVar2;
        xVar2.f528692d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cn(aoVar);
        q0Var.f286827i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dn(aoVar);
        xVar2.Y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wn(xVar2);
    }

    public static void f(android.view.View view, int i17) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_group_todo_disable, 0) == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static void g(android.content.Context context) {
        if (!fp.e0.g() || android.os.Build.VERSION.SDK_INT <= 32) {
            dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571894st, 0).show();
        }
    }

    public static void h(boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, yb5.d dVar) {
        if (aoVar == null) {
            return;
        }
        android.widget.LinearLayout linearLayout = aoVar.f284929s;
        if (linearLayout != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            aoVar.f284929s.setBackgroundResource(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) dVar.f542241c.a(sb5.e.class))).n0());
            marginLayoutParams.leftMargin = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) dVar.f542241c.a(sb5.e.class))).o0(i65.a.f(dVar.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561089yd));
            aoVar.f284929s.setLayoutParams(marginLayoutParams);
        }
        if (z17) {
            aoVar.f284930t.setTextColor(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
            aoVar.f284930t.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ft_);
        } else {
            aoVar.f284930t.setTextColor(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
            aoVar.f284930t.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ftb);
        }
    }

    public static java.lang.String i(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str2;
        java.lang.String str3;
        if (f9Var.G.contains("notify@all")) {
            str2 = "";
        } else {
            str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i5p) + "\n";
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.J0(), "msg", null);
        if (d17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.xmlpuretext"), 1) != 0) {
            str3 = "";
        } else {
            str3 = "\n\n<a href='weixin://chatroomnotify/detail/" + f9Var.m124847x74d37ac6() + "'>" + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571998vt) + "</a>";
        }
        return "" + ((java.lang.Object) str2) + str + str3;
    }
}
