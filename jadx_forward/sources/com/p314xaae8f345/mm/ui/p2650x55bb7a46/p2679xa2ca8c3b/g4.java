package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class g4 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f285547a;

    public static com.p314xaae8f345.mm.p2621x8fb0427b.a9 a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        java.lang.String U1 = f9Var.U1();
        ot0.q v17 = U1 != null ? ot0.q.v(U1) : null;
        if (v17 == null) {
            return null;
        }
        boolean equals = "1001".equals(v17.f430233q1);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f c6254x6dec987f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430237r1) || equals) {
            return null;
        }
        c6254x6dec987f.f136502g.f89786a = v17.f430237r1;
        c6254x6dec987f.e();
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f4(c6254x6dec987f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0216, code lost:
    
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zg) ((sb5.d1) r42.f542241c.a(sb5.d1.class))).o0(0, r36.f284808s) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02c8, code lost:
    
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zg) ((sb5.d1) r42.f542241c.a(sb5.d1.class))).o0(9, r36.f284808s) != false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 r36, ot0.c r37, boolean r38, int r39, java.lang.String r40, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r41, yb5.d r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g4.b(com.tencent.mm.ui.chatting.viewitems.a4, ot0.c, boolean, int, java.lang.String, com.tencent.mm.storage.f9, yb5.d, boolean):void");
    }

    public static void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var, ot0.c cVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, ot0.q qVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f c6254x6dec987f) {
        java.lang.String str2 = qVar.f430245t1;
        int i17 = f9Var.A0() == 1 ? 1 : 2;
        ot0.j jVar = cVar.I;
        java.lang.String str3 = jVar != null ? jVar.f430072k : "";
        am.x10 x10Var = c6254x6dec987f.f136503h;
        int i18 = x10Var.f89869b;
        int i19 = ((i18 == 4 || (i18 == 3 && x10Var.f89870c == 2)) ? 0 : 1) ^ 1;
        int i27 = (i18 != 5 ? 1 : 0) ^ 1;
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        java.lang.String str4 = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyMsgActionReport", "doReportBubbleRender：order_id %s, send_recv: %s  hb_scene:%s cover_id:%s has_open :%s is_valid：%s", str2, java.lang.Integer.valueOf(i17), str, str4, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28839, str2, java.lang.Integer.valueOf(i17), str, str4, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static void d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (f285547a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2C", "handleHKHongbaoRouteInfo: usecase is running, ignore click");
            return;
        }
        byte[] mo24791x3ecda1c7 = ((h45.q) i95.n0.c(h45.q.class)).mo24791x3ecda1c7(str, str2);
        if (mo24791x3ecda1c7 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2C", "handleHKHongbaoRouteInfo routeInfoData size:%s", java.lang.Integer.valueOf(mo24791x3ecda1c7.length));
            f285547a = true;
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc.mo27555xc6c7e3f0("route_info", mo24791x3ecda1c7);
            ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("commonRoute", m27539xaf65a0fc, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s3());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2C", "handleHKHongbaoRouteInfo routeInfoData is null, use content.url");
        f285547a = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 e() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a;
        }
        return null;
    }

    public static boolean f() {
        float q17 = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        return com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) || com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
    }

    public static void g(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var, ot0.c cVar, boolean z17, yb5.d dVar) {
        if (a4Var == null || a4Var.f39493x8ad70635 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgC2C", "renderEnvelopeResource holder or click area is null");
            return;
        }
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgC2C", "renderEnvelopeResource piece is null");
            return;
        }
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgC2C", "renderEnvelopeResource ui is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2C", "renderEnvelopeResource start");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.u3 u3Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.u3(a4Var, cVar, z17, dVar);
        if (!a4Var.f39493x8ad70635.isAttachedToWindow() && com.p314xaae8f345.mm.sdk.p2603x2137b148.o3.c()) {
            a4Var.f39493x8ad70635.addOnAttachStateChangeListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v3(a4Var, u3Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2C", "post runnable %s", u3Var);
            a4Var.f39493x8ad70635.post(u3Var);
        }
    }

    public static void h(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var, ot0.c cVar) {
        a4Var.f284812w.n();
        a4Var.f284812w.i(a4Var.C);
        a4Var.C = null;
        android.view.View view = a4Var.f284813x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagAll", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;Lcom/tencent/mm/message/AppContentC2cMsgPiece;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagAll", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;Lcom/tencent/mm/message/AppContentC2cMsgPiece;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a4Var.f284814y.setImageBitmap(null);
        a4Var.f284814y.setVisibility(8);
        a4Var.E = true;
        a4Var.B = cVar.f429953m;
        a4Var.f284815z = cVar.f429963w;
        a4Var.A = cVar.f429965y;
        a4Var.I.n();
        a4Var.I.i(a4Var.f284790J);
        a4Var.f284790J = null;
        a4Var.G.setVisibility(8);
        a4Var.K = true;
        a4Var.B = cVar.f429953m;
        a4Var.F = cVar.E;
    }

    public static void i(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var) {
        a4Var.f284812w.n();
        android.view.View view = a4Var.f284813x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagStatus", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagStatus", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a4Var.f284814y.setVisibility(8);
    }

    public static void j(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var, int i17, boolean z17) {
        float f17;
        if (!z17) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) a4Var.f284801l.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) a4Var.f39493x8ad70635.getLayoutParams();
            if (i17 != 0) {
                layoutParams.topMargin = i17 - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6);
                layoutParams2.topMargin = i17;
                android.view.View view = a4Var.f284803n;
                if (view != null) {
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
                    layoutParams3.topMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6);
                    layoutParams3.bottomMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6);
                    a4Var.f284803n.setLayoutParams(layoutParams3);
                }
            } else {
                layoutParams.topMargin = i17;
                layoutParams2.topMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6);
                android.view.View view2 = a4Var.f284803n;
                if (view2 != null) {
                    android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
                    layoutParams4.topMargin = 0;
                    layoutParams4.bottomMargin = 0;
                    a4Var.f284803n.setLayoutParams(layoutParams4);
                }
            }
            a4Var.f284801l.setLayoutParams(layoutParams);
            a4Var.f39493x8ad70635.setLayoutParams(layoutParams2);
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) a4Var.f284801l.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) a4Var.f39493x8ad70635.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) a4Var.f284800k.getLayoutParams();
        layoutParams7.topMargin = 0;
        android.widget.TextView textView = a4Var.f39502xce2b2f8d;
        if (textView == null || textView.getVisibility() != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a4Var.f39502xce2b2f8d.getText().toString())) {
            layoutParams5.topMargin = i17;
            layoutParams6.removeRule(3);
            layoutParams6.topMargin = i17;
        } else {
            android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) a4Var.f39502xce2b2f8d.getLayoutParams();
            layoutParams6.addRule(3, com.p314xaae8f345.mm.R.id.brc);
            layoutParams6.topMargin = 0;
            if (i17 != 0) {
                int height = (i17 - a4Var.f39502xce2b2f8d.getHeight()) - layoutParams8.bottomMargin;
                if (height != 0 && height != -1 && height != 1) {
                    if (height > 0) {
                        layoutParams5.topMargin = height;
                        layoutParams8.topMargin = height;
                        layoutParams6.topMargin = 0;
                    } else {
                        layoutParams5.topMargin = 0;
                        layoutParams8.topMargin = 0;
                        layoutParams6.topMargin = 0;
                        if (f()) {
                            float q17 = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                            if (com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a))) {
                                f17 = i65.a.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                            } else if (com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a))) {
                                f17 = i65.a.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                            }
                            layoutParams7.topMargin = java.lang.Math.abs((int) (height / f17));
                        }
                        f17 = 1.0f;
                        layoutParams7.topMargin = java.lang.Math.abs((int) (height / f17));
                    }
                }
            } else {
                layoutParams5.topMargin = 0;
                layoutParams8.topMargin = 0;
                layoutParams6.topMargin = 0;
            }
            a4Var.f39502xce2b2f8d.setLayoutParams(layoutParams8);
            int i18 = a4Var.f284811v;
            android.widget.TextView textView2 = a4Var.f39502xce2b2f8d;
            if (textView2 != null && textView2.getVisibility() == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a4Var.f39502xce2b2f8d.getText().toString())) {
                int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 7);
                android.widget.RelativeLayout.LayoutParams layoutParams9 = (android.widget.RelativeLayout.LayoutParams) a4Var.f39502xce2b2f8d.getLayoutParams();
                layoutParams9.bottomMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 3) / 2;
                if (f()) {
                    a4Var.f39502xce2b2f8d.setIncludeFontPadding(false);
                } else {
                    a4Var.f39502xce2b2f8d.setIncludeFontPadding(true);
                }
                android.widget.ImageView imageView = a4Var.f284800k;
                if (imageView == null || imageView.getVisibility() != 0) {
                    layoutParams9.width = -2;
                    a4Var.f39502xce2b2f8d.setLayoutParams(layoutParams9);
                    a4Var.f39502xce2b2f8d.setPadding(b17, 0, b17, 0);
                } else {
                    if (i18 != 0) {
                        layoutParams9.width = i18;
                    }
                    a4Var.f39502xce2b2f8d.setLayoutParams(layoutParams9);
                    a4Var.f39502xce2b2f8d.setEllipsize(android.text.TextUtils.TruncateAt.END);
                    a4Var.f39502xce2b2f8d.setPadding(b17, 0, 0, 0);
                }
            }
        }
        a4Var.f284801l.setLayoutParams(layoutParams5);
        a4Var.f39493x8ad70635.setLayoutParams(layoutParams6);
        a4Var.f284800k.setLayoutParams(layoutParams7);
    }
}
