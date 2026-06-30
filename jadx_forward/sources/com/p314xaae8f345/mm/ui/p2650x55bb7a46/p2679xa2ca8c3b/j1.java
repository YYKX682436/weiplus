package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class j1 {
    public static void a(java.lang.String str, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar) {
        rj.a aVar;
        int i17;
        w05.h hVar;
        try {
            java.lang.String str2 = null;
            if (qVar.f430199i != 33) {
                aVar = (rj.a) qVar.y(rj.a.class);
                if (aVar == null) {
                    return;
                }
            } else {
                aVar = null;
            }
            java.lang.Integer valueOf = dVar.D() ? java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(dVar.x())) : null;
            java.lang.String str3 = qVar.f430210k2;
            java.lang.String str4 = qVar.f430202i2;
            if (aVar == null || (hVar = aVar.f477665b) == null) {
                i17 = 3;
            } else {
                i17 = hVar.n();
                str2 = aVar.f477665b.k();
            }
            e00.g.e(str, f9Var, dVar.D(), dVar.x(), i17, 0, str3, str4, java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0), str2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemAppMsg", e17, "report error", new java.lang.Object[0]);
        }
    }

    public static void b(java.lang.Runnable runnable) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o3.c()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a.d(runnable);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        }
    }

    public static void c(android.view.View view, int i17, int i18, int i19, int i27) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view == null || (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        marginLayoutParams.setMargins(i17, i18, i19, i27);
        view.setLayoutParams(marginLayoutParams);
    }

    public static java.lang.String d(java.lang.String str) {
        if (str == null || !str.startsWith("wcf://")) {
            str = "file://" + str;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
            return str;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        return "file://" + m11.b1.Di().P0(str);
    }

    public static void e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar, db5.g4 g4Var, int i17, android.view.View view, java.lang.Boolean bool) {
        java.lang.String str = qVar.f430207k;
        ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
        if (bool.booleanValue() && ((qg5.z2) j3Var).nj(f9Var, true)) {
            ((db5.h4) g4Var.c(i17, 174, 0, view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nh7), com.p314xaae8f345.mm.R.raw.f78974xdba97b12)).f309902m = view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nh8);
            ((vh0.p3) ((vh0.o1) i95.n0.c(vh0.o1.class))).aj();
        } else {
            if (bool.booleanValue() || !((qg5.z2) j3Var).oj(f9Var, true)) {
                return;
            }
            ((db5.h4) g4Var.c(i17, ib1.t.f69911x366c91de, 0, view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nh7), com.p314xaae8f345.mm.R.raw.f78557x5e90ad50)).f309902m = view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nh8);
            ((vh0.p3) ((vh0.o1) i95.n0.c(vh0.o1.class))).aj();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(ot0.q r28, android.view.View r29, yb5.d r30, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 r31, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r32) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.f(ot0.q, android.view.View, yb5.d, com.tencent.mm.ui.chatting.viewitems.a0, com.tencent.mm.storage.f9):boolean");
    }

    public static boolean g(yb5.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, android.os.Bundle bundle) {
        android.content.Intent putExtra = new android.content.Intent().putExtra("key_video_url", str);
        putExtra.putExtra("key_video_url", str);
        putExtra.putExtra("key_cover_path", str3);
        putExtra.putExtra("key_auto_save", z17);
        putExtra.putExtra("key_local_file_path", str2);
        putExtra.putExtra("key_ext_data", bundle);
        putExtra.putExtra("key_scene", 1);
        j45.l.j(dVar.g(), "appbrand", ".ui.AppBrandVideoPreviewUI", putExtra, null);
        return true;
    }

    public static void h(ot0.q qVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq qqVar) {
        int i17 = qVar.f430214l2;
        if (i17 == 0 || i17 == 2 || i17 == 3) {
            java.lang.String x17 = dVar.x();
            java.lang.String a17 = qqVar.a(dVar, f9Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.f262526a;
            java.lang.String str = qVar.f430206j2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.q0.f262498e;
            v0Var.a(str, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3(x17, a17, 0, "", "", "", 0L));
        }
    }

    public static void i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        boolean z17;
        com.p314xaae8f345.mm.ui.p2740x696c9db.sd sdVar = com.p314xaae8f345.mm.ui.p2740x696c9db.sd.f292275a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceStateHolder", "open appBrand");
        sdVar.b(false);
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo: msginfo is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.X1())) {
            return;
        }
        rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(f9Var.Q0(), f9Var.X1());
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo stoTodo(%s) == null", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.X1())));
            return;
        }
        boolean e17 = kn.j0.e(z07);
        if (e17) {
            z17 = kn.j0.j(z07);
            if (z17) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe c5759x7ac701fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe();
                am.ql qlVar = c5759x7ac701fe.f136078g;
                qlVar.f89248a = 3;
                qlVar.f89249b = f9Var.Q0();
                qlVar.f89250c = f9Var.X1();
                c5759x7ac701fe.b(android.os.Looper.getMainLooper());
            }
        } else {
            z17 = false;
        }
        kn.k0.a(f9Var.Q0(), 0, 3, f9Var.X1(), kn.j0.c(f9Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo stoTodo(%s) update finish(%s %s)", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.X1())), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(e17));
    }

    public static void j(ot0.q qVar, yb5.d dVar, android.content.Intent intent) {
        rt0.a aVar = (rt0.a) qVar.y(rt0.a.class);
        if (aVar == null || !aVar.f480904b) {
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("jsapiargs");
        if (bundleExtra == null) {
            bundleExtra = new android.os.Bundle();
        }
        bundleExtra.putBoolean("k_is_secret_msg", true);
        r45.l97 l97Var = new r45.l97();
        l97Var.f460792d = (int) (java.lang.System.currentTimeMillis() / 1000);
        l97Var.f460795g = dVar.D() ? 2 : 1;
        l97Var.f460796h = dVar.x();
        l97Var.f460793e = qVar.f430207k;
        l97Var.f460794f = qVar.f430179d;
        try {
            bundleExtra.putByteArray("key_webview_secret_msg_info", l97Var.mo14344x5f01b1f6());
            intent.putExtra("jsapiargs", bundleExtra);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemAppMsg", e17, "fillWebPageSecretMsgInfo exception", new java.lang.Object[0]);
        }
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 k() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a;
        }
        return null;
    }

    public static void l(ot0.q qVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a c5824x69fbb00a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a();
        c5824x69fbb00a.f136132g.f89439c = dVar.g();
        c5824x69fbb00a.f136132g.f89437a = f9Var.m124847x74d37ac6();
        c5824x69fbb00a.f136132g.f89442f = f9Var.Q0();
        c5824x69fbb00a.f136132g.f89440d = dVar.D();
        am.sn snVar = c5824x69fbb00a.f136132g;
        snVar.f89438b = qVar.f430196h0;
        snVar.f89443g = 6;
        snVar.f89445i = c01.ia.q(f9Var);
        c5824x69fbb00a.e();
    }

    public static void m(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar, int i17, r.a aVar) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo: msginfo is null");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("group_to_do").getBoolean("introduce_dialog_first", true)) {
            n(f9Var, dVar, i17, 0, aVar);
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("group_to_do");
        M.getClass();
        M.putBoolean("introduce_dialog_first", false);
        android.app.Activity g17 = dVar.g();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.X1());
        java.lang.String x17 = dVar.x();
        java.lang.String X1 = f9Var.X1();
        java.lang.String c17 = kn.j0.c(f9Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k1 k1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k1(f9Var, dVar, i17, aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) g17, 1, false);
        android.view.View inflate = android.view.View.inflate(g17, com.p314xaae8f345.mm.R.C30864xbddafb2a.d1g, null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oe_);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cgl);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cgm);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c3 c3Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c3(null);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.oed).setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.m1(c3Var, k0Var, k1Var));
        k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.n1(k0Var, inflate);
        k0Var.f293387d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o1(c3Var, x17, 0, K0, X1, c17);
        k0Var.e(true);
        k0Var.v();
    }

    public static void n(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar, int i17, int i18, r.a aVar) {
        java.lang.String X1;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo: msginfo is null");
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.X1());
        android.app.Activity g17 = dVar.g();
        java.lang.String Q0 = f9Var.Q0();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.X1())) {
            X1 = f9Var.X1();
        } else if (f9Var.y2()) {
            X1 = "related_msgid_" + f9Var.I0();
        } else {
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "content is null");
                X1 = "";
            } else {
                ot0.a aVar2 = (ot0.a) v17.y(ot0.a.class);
                if (aVar2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f429897t)) {
                    X1 = "related_msgid_" + f9Var.I0();
                } else {
                    X1 = aVar2.f429897t;
                }
            }
        }
        kn.j0.h(g17, Q0, X1, kn.j0.c(f9Var), K0, 2, i17, i18, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l1(aVar, K0, f9Var));
    }

    public static boolean o(ot0.q qVar) {
        su4.l2 l2Var = (su4.l2) qVar.y(su4.l2.class);
        return (l2Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l2Var.f494516b)) ? false : true;
    }

    public static void p(android.widget.TextView textView, ot0.q qVar) {
        int i17 = qVar.f430270z2;
        if (i17 == 1) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571822qt);
        } else if (i17 != 2) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571648lc);
        } else {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571821qs);
        }
        textView.setVisibility(0);
    }

    public static void q(android.content.Intent intent, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar) {
        intent.putExtra("webpageTitle", qVar.f430187f);
        intent.putExtra("thumbUrl", qVar.f430267z);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        intent.putExtra("thumbPath", m11.b1.Di().D2(f9Var, f9Var.z0(), true));
    }

    public static void r(android.view.View view, int i17) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_group_todo_disable, 0) == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static boolean s(ot0.q qVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var) {
        if (!o(qVar)) {
            return false;
        }
        v1Var.f287282i.setVisibility(0);
        v1Var.f287274e.setVisibility(0);
        v1Var.f287274e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jzt);
        v1Var.f287276f.setVisibility(0);
        v1Var.f287276f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cgn);
        return true;
    }

    public static void t(boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var, yb5.d dVar) {
        if (v1Var == null) {
            return;
        }
        android.widget.LinearLayout linearLayout = v1Var.f287293n0;
        if (linearLayout != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            v1Var.f287293n0.setBackgroundResource(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) dVar.f542241c.a(sb5.e.class))).n0());
            marginLayoutParams.leftMargin = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) dVar.f542241c.a(sb5.e.class))).o0(i65.a.f(dVar.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561089yd));
            v1Var.f287293n0.setLayoutParams(marginLayoutParams);
        }
        if (z17) {
            v1Var.f287295o0.setTextColor(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
            v1Var.f287295o0.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ft_);
        } else {
            v1Var.f287295o0.setTextColor(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
            v1Var.f287295o0.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ftb);
        }
    }
}
