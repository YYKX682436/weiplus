package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class tg extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements we5.b {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.dnk);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vg vgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vg();
        vgVar.a(xgVar);
        xgVar.setTag(vgVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean N() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (erVar == null) {
            return false;
        }
        g4Var.c(erVar.d(), 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // we5.b
    public rd5.d b(we5.a aVar) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ug(aVar);
    }

    @Override // we5.b
    public boolean c() {
        return false;
    }

    public final java.lang.String d0(java.util.Map map) {
        try {
            java.lang.String str = (java.lang.String) map.get(".msg.brandecsmsg.version");
            java.lang.String str2 = (java.lang.String) map.get(".msg.brandecsmsg.digest");
            if (str != null) {
                if (str.equals("1")) {
                    if (str2 != null) {
                        try {
                            byte[] decode = android.util.Base64.decode(str2, 2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
                            str2 = new java.lang.String(decode, r26.c.f450398a);
                        } catch (java.lang.Exception unused) {
                        }
                    } else {
                        str2 = "";
                    }
                }
            }
            return str2 != null ? str2 : "";
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemBrandEcsPrivateNoticeMsg", e17, "getFinalDigest failed", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // we5.b
    public void e(final yb5.d dVar, final rd5.d dVar2, java.lang.String str, we5.y0 y0Var) {
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        final java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null);
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.tg$$a
            @Override // we5.t0
            public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                final java.util.Map map = d17;
                final yb5.d dVar3 = dVar;
                final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vg vgVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vg) g0Var;
                final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.tg tgVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.tg.this;
                tgVar.getClass();
                kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
                android.widget.ImageView imageView = vgVar.f287388c;
                final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ni(imageView, f9Var2.Q0());
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er();
                erVar.f285441d = vgVar;
                erVar.f285438a = dVar2;
                erVar.f285439b = f9Var2.Q0();
                vgVar.f287389d.setTag(erVar);
                vgVar.f287389d.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.chatting.viewitems.tg$$c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.tg tgVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.tg.this;
                        tgVar2.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vg vgVar2 = vgVar;
                        arrayList.add(vgVar2);
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = f9Var2;
                        arrayList.add(f9Var3);
                        java.util.Map map2 = map;
                        arrayList.add(map2);
                        yb5.d dVar4 = dVar3;
                        arrayList.add(dVar4);
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBrandEcsPrivateNoticeMsg", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", tgVar2, array);
                        if (map2 != null) {
                            try {
                                com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a aVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b;
                                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y yVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y();
                                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x xVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x();
                                xVar.f300748g = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.w.Click;
                                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                xVar.f300747f = java.lang.System.currentTimeMillis();
                                java.lang.String Q0 = f9Var3.Q0();
                                java.lang.String str2 = "";
                                if (Q0 == null) {
                                    Q0 = "";
                                }
                                xVar.f300746e = Q0;
                                xVar.f300745d = aVar.b();
                                xVar.f300749h = "102_1";
                                xVar.f300750i = "private_message";
                                java.lang.String str3 = (java.lang.String) map2.get(".msg.brandecsmsg.orginmsgsvrid");
                                if (str3 != null) {
                                    str2 = str3;
                                }
                                xVar.f300751m = str2;
                                xVar.f300753o = java.lang.String.valueOf(vgVar2.mo79416xf806b362() + 1);
                                cl0.g h17 = new cl0.g().h("content", tgVar2.d0(map2));
                                h17.p("send_timestamp", f9Var3.mo78012x3fdd41df() / 1000);
                                h17.p("msg_svr_id", f9Var3.I0());
                                xVar.f300755q = h17.toString();
                                yVar.f300787d = xVar;
                                aVar.f(yVar);
                            } catch (cl0.f e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemBrandEcsPrivateNoticeMsg", "json error: %s" + e17);
                            }
                        }
                        if (c01.e2.J(f9Var3.Q0())) {
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("Chat_User", f9Var3.Q0());
                            intent.putExtra("finish_direct", true);
                            intent.putExtra("from_global_search", true);
                            java.util.Map d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var3.j(), "msg", null);
                            if (d18 != null) {
                                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d18.get(".msg.brandecsmsg.orginmsgid"), -1L);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBrandEcsPrivateNoticeMsg", "goChattingUI msgId:%d", java.lang.Long.valueOf(V));
                                intent.putExtra("msg_local_id", V);
                            }
                            intent.setClass(dVar4.g(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(intent);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(dVar4, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBrandEcsPrivateNoticeMsg", "goChattingUI", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            dVar4.a0((android.content.Intent) arrayList2.get(0));
                            yj0.a.f(dVar4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBrandEcsPrivateNoticeMsg", "goChattingUI", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else {
                            android.app.Activity g17 = dVar4.g();
                            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(g17);
                            e4Var.f293309c = dVar4.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mds);
                            e4Var.c();
                        }
                        yj0.a.h(tgVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBrandEcsPrivateNoticeMsg", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                vgVar.f287389d.setOnLongClickListener(tgVar.u(dVar3));
                vgVar.f287389d.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar3.f542241c.a(sb5.z.class))).B1);
                if (map == null) {
                    return;
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0 h0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0) ((sb5.g) dVar3.f542241c.a(sb5.g.class));
                if (h0Var.f280667e.contains(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()))) {
                    return;
                }
                h0Var.f280667e.add(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()));
                try {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a aVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b;
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y yVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y();
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x xVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x();
                    xVar.f300748g = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.w.Expose;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    xVar.f300747f = java.lang.System.currentTimeMillis();
                    java.lang.String Q0 = f9Var2.Q0();
                    java.lang.String str2 = "";
                    if (Q0 == null) {
                        Q0 = "";
                    }
                    xVar.f300746e = Q0;
                    xVar.f300745d = aVar.b();
                    xVar.f300749h = "102_1";
                    xVar.f300750i = "private_message";
                    java.lang.String str3 = (java.lang.String) map.get(".msg.brandecsmsg.orginmsgsvrid");
                    if (str3 != null) {
                        str2 = str3;
                    }
                    xVar.f300751m = str2;
                    xVar.f300753o = java.lang.String.valueOf(vgVar.mo79416xf806b362() + 1);
                    cl0.g h17 = new cl0.g().h("content", tgVar.d0(map));
                    h17.p("send_timestamp", f9Var2.mo78012x3fdd41df() / 1000);
                    h17.p("msg_svr_id", f9Var2.I0());
                    xVar.f300755q = h17.toString();
                    yVar.f300787d = xVar;
                    aVar.f(yVar);
                } catch (cl0.f e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemBrandEcsPrivateNoticeMsg", "json error: %s" + e17);
                }
            }
        });
        if (d17 != null) {
            java.lang.String d07 = d0(d17);
            android.app.Activity g17 = dVar.g();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            final java.lang.String string = g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mdk, c01.a2.b(f9Var.Q0()), d07);
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.tg$$b
                @Override // we5.t0
                public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vg vgVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vg) g0Var;
                    android.widget.TextView textView = vgVar.f287387b;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity g18 = yb5.d.this.g();
                    float textSize = vgVar.f287387b.getTextSize();
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g18, string, textSize));
                }
            });
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        e(dVar, dVar2, str, we5.y0.a((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vg) g0Var));
    }
}
