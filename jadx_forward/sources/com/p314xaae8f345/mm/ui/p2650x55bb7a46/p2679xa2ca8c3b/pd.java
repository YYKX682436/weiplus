package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class pd extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f286784s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f286785t = "";

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570045vg);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od odVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od();
        odVar.a(xgVar, true);
        xgVar.setTag(odVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, final yb5.d dVar, rd5.d dVar2) {
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        int itemId = menuItem.getItemId();
        if (itemId != 102) {
            if (itemId != 111) {
                return false;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(f9Var, dVar.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.pd$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yb5.d dVar3 = yb5.d.this;
                    android.content.Intent intent = new android.content.Intent(dVar3.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                    boolean D = dVar3.D();
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                    intent.putExtra("Retr_Msg_content", c01.w9.l(D, f9Var2.j(), f9Var2.A0()));
                    intent.putExtra("Retr_Msg_Type", 2);
                    intent.putExtra("Retr_Msg_Id", f9Var2.m124847x74d37ac6());
                    intent.putExtra("Retr_MsgTalker", f9Var2.Q0());
                    java.lang.String d17 = te5.e2.d(f9Var2);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                        intent.putExtra("weAppSourceUserName", d17);
                    }
                    intent.putExtra("scene_from", 17);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(dVar3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextFrom", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    dVar3.a0((android.content.Intent) arrayList.get(0));
                    yj0.a.f(dVar3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextFrom", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            });
            return false;
        }
        java.lang.String str = ot0.q.v(c01.w9.l(dVar.C(), f9Var.j(), f9Var.A0())).f430187f;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(str);
        w04.a.INSTANCE.A9(1, f9Var.I0() + "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o0(str));
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        if (!c01.ia.x(f9Var)) {
            g4Var.c(d17, 102, 0, this.f286784s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
            g4Var.c(d17, 111, 0, this.f286784s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        j45.l.g("favorite");
        g4Var.c(d17, 116, 0, this.f286784s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        if (c01.ia.A(f9Var)) {
            g4Var.clear();
        }
        if (this.f286784s.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, this.f286784s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ld.b(this.f286784s, view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, final yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        int i17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] z0VarArr;
        java.lang.String str2;
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f286784s = dVar;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7) ((sb5.e0) dVar.f542241c.a(sb5.e0.class))).n0(f9Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od odVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        int i18 = 0;
        if (v17 != null && v17.f430199i == 1) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str3 = v17.f430179d;
            ((kt.c) i0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str3);
            java.lang.String str4 = (h17 == null || (str2 = h17.f67372x453d1e07) == null || str2.trim().length() <= 0) ? v17.H : h17.f67372x453d1e07;
            java.lang.String str5 = v17.f430179d;
            if (str5 == null || str5.length() <= 0 || !com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.y(str4)) {
                odVar.f286713c.setVisibility(8);
            } else {
                odVar.f286713c.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572424b65, ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), h17, str4)));
                odVar.f286713c.setVisibility(0);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.r(dVar, odVar.f286713c, v17.f430179d);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.w(dVar, odVar.f286713c, v17.f430179d);
                android.widget.TextView textView = odVar.f286713c;
                android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getDrawable(com.p314xaae8f345.mm.R.raw.f81129x78cf11fc) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getDrawable(com.p314xaae8f345.mm.R.raw.f81128xd0eae9f9);
                if (drawable != null) {
                    int dimension = (int) dVar.s().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
                    drawable.setBounds(0, 0, dimension, dimension);
                    textView.setCompoundDrawables(drawable, null, null, null);
                }
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
            java.lang.String str6 = v17.f430263y;
            if (str6 == null || str6.length() <= 0) {
                odVar.f286714d.setVisibility(8);
            } else {
                G(dVar, odVar.f286714d, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er.a(v17.f430263y));
                odVar.f286714d.setVisibility(0);
            }
            odVar.f286712b.setClickable(true);
            android.os.Bundle a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.m1.a(dVar.D(), k01.d.a(f9Var.Q0()));
            android.os.Bundle c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.c(f9Var, dVar, str);
            c17.putAll(a17);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = odVar.f286712b.getContext();
            boolean z17 = !com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ld.a(f9Var);
            java.lang.String str7 = v17.f430187f;
            int m84164x40077844 = (int) odVar.f286712b.m84164x40077844();
            le0.r rVar = le0.x.P0;
            int i19 = 10;
            int i27 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(f9Var.y0()) ? 10 : 0;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString k17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.k(context, z17, str7, m84164x40077844, 1, c17, rVar, i27, true);
            odVar.f286712b.c(k17, android.widget.TextView.BufferType.SPANNABLE, null);
            final java.lang.String str8 = "yuanbao_text_link";
            final dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            final java.util.ArrayList arrayList = new java.util.ArrayList(4);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(dVar.x()) && !android.text.TextUtils.isEmpty(k17) && (z0VarArr = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) k17.getSpans(0, k17.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class)) != null && z0VarArr.length != 0) {
                int length = z0VarArr.length;
                while (i18 < length) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var = z0VarArr[i18];
                    if (z0Var.m75727xeff487ef().f450738n == i19) {
                        java.lang.String e17 = z0Var.m75727xeff487ef().e();
                        if (e17.startsWith("weixin://chatbot/")) {
                            android.net.Uri parse = android.net.Uri.parse(e17);
                            if ("/SetRedEnvelopeCover".equals(parse.getPath())) {
                                arrayList.add(parse);
                            }
                        }
                    }
                    i18++;
                    i19 = 10;
                }
            }
            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.ld$$a
                @Override // java.lang.Runnable
                public final void run() {
                    for (android.net.Uri uri : arrayList) {
                        java.util.HashMap hashMap = new java.util.HashMap(16);
                        m3.d[] dVarArr = new m3.d[4];
                        yb5.d dVar3 = dVar;
                        dVarArr[0] = new m3.d("chat_name", dVar3.x());
                        dVarArr[1] = new m3.d("enter_sessionid", dVar3.f542255q);
                        dVarArr[2] = new m3.d("enter_type", java.lang.Integer.valueOf(vh0.l2.a(dVar3.k())));
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                        dVarArr[3] = new m3.d("msgid", java.lang.Long.valueOf(f9Var2 != null ? f9Var2.I0() : 0L));
                        ((cy1.a) rVar2).Hj(str8, "view_exp", bm5.i0.a(hashMap, dVarArr), 34004);
                    }
                }
            }, "yb_txt_link_exp_rpt");
            int j17 = c01.ia.j(f9Var);
            boolean z18 = !com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ld.a(f9Var);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = odVar.f286712b;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) c22624x85d69039.getTag();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.p(j17, k17, c22624x85d69039, z18, erVar != null ? erVar.c() : null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.md(dVar, k17));
        }
        odVar.f286712b.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), odVar, null));
        odVar.f286712b.setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.TRUE);
        if (c01.d9.b().E() && v17 != null && v17.f430199i == 1) {
            if (odVar.f286716f == null) {
                android.app.Activity g18 = this.f286784s.g();
                rl5.r rVar3 = new rl5.r(g18, odVar.f286712b);
                odVar.f286716f = rVar3;
                rVar3.L = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sd(this, odVar);
                boolean k18 = ti3.i.k(f9Var);
                boolean m60126x74219ae7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7();
                rl5.r rVar4 = odVar.f286716f;
                rVar4.C = true;
                rVar4.Q = false;
                rVar4.f478888y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.td(this, g18, odVar, m60126x74219ae7, k18, f9Var);
                rVar4.f478887x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ud(this, odVar, g18, f9Var);
            }
            if (c01.ia.A(f9Var)) {
                odVar.f286712b.setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.FALSE);
                odVar.f286712b.setOnTouchListener(odVar.b(this.f286784s));
                odVar.f286712b.setOnLongClickListener(u(this.f286784s));
            } else {
                int i28 = c01.ia.i(f9Var);
                if (i28 <= 0 || i28 >= wl5.y.o(odVar.f286712b).length()) {
                    i28 = wl5.y.o(odVar.f286712b).length();
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u17 = u(this.f286784s);
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
                } else {
                    i17 = 0;
                }
                wl5.o oVar = new wl5.o(odVar.f286712b, odVar.f286716f, x17, null, odVar.b(this.f286784s));
                oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.a3y;
                oVar.f528657h = 18;
                oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560393j6;
                if (i17 != 0) {
                    oVar.a(i17 + com.p314xaae8f345.mm.ui.zk.e(odVar.f286712b.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
                }
                wl5.x xVar3 = new wl5.x(oVar);
                odVar.f286717g = xVar3;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.be beVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.be(xVar3);
                xVar3.f528692d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qd(this);
                u17.f286826h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rd(this, odVar);
                xVar3.C = i28;
                xVar3.Y = beVar;
            }
            odVar.f286712b.m84180x74caf26a(this);
        }
    }
}
