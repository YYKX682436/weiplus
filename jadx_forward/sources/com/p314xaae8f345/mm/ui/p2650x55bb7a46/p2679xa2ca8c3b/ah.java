package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ah extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xq f284888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f284889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, int i17, int i18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xq xqVar) {
        super(i17, i18);
        this.f284889e = c21908xb66fd105;
        this.f284888d = xqVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ah ahVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on footer action click, username: %s", erVar.f285439b);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(erVar.c().j(), "msg", null);
        if (d17 == null || d17.size() == 0) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.msg_control_info.footer_action_type"), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on footer action click, footActionType: %d", java.lang.Integer.valueOf(P));
        if (P == 1) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f284889e;
            if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.l0(c21908xb66fd105)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemDyeingTemplate", "onFooterActionClick, checkNetwork no network");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.String str7 = (java.lang.String) d17.get(".msg.fromusername");
            if (str7 == null) {
                str7 = "";
            }
            boolean Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str7);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd1052 = this.f284889e;
            boolean z17 = c21908xb66fd1052.G.f328609b;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xq xqVar = this.f284888d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.m0(c21908xb66fd1052, d17, true, z17, xqVar.f287541d, str7, Bi);
            boolean s07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9) ((sb5.k0) c21908xb66fd105.f284708s.f542241c.a(sb5.k0.class))).s0();
            te5.t1 t1Var = te5.v1.f500290a;
            if (s07) {
                sb5.k0 k0Var = (sb5.k0) c21908xb66fd105.f284708s.f542241c.a(sb5.k0.class);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = erVar.c();
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9) k0Var).getClass();
                str5 = "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan";
                str6 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo, msgId: %d, talker: %s, showFooterWording: %b", java.lang.Long.valueOf(c17.m124847x74d37ac6()), c17.Q0(), java.lang.Boolean.FALSE);
                java.lang.String a17 = t1Var.a(c17.j(), "msg", ".msg.appmsg.mmreader.template_detail.msg_control_info.need_footer", "0");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo, ret is null");
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 M1 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.M1(c17);
                    if (M1 != null) {
                        M1.d1(a17);
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(M1.m124847x74d37ac6(), M1, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo success");
                    }
                }
            } else {
                str5 = "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan";
                str6 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12";
                sb5.g0 g0Var = (sb5.g0) c21908xb66fd105.f284708s.f542241c.a(sb5.g0.class);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 c18 = erVar.c();
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) g0Var).getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo, msgId: %d, talker: %s, showFooterWording: %b", java.lang.Long.valueOf(c18.m124847x74d37ac6()), c18.Q0(), java.lang.Boolean.FALSE);
                java.lang.String a18 = t1Var.a(c18.j(), "msg", ".msg.appmsg.mmreader.template_detail.msg_control_info.need_footer", "0");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo, ret is null");
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 M12 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.M1(c18);
                    if (M12 != null) {
                        M12.d1(a18);
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(M12.m124847x74d37ac6(), M12, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingServiceNotifyComponent", "updateFooterMsgInfo success");
                    }
                }
            }
            c21908xb66fd105.C0(xqVar, c21908xb66fd105.f284708s, erVar.c(), erVar.f285439b);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.String str8 = c21908xb66fd105.H;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c21908xb66fd105.P);
            java.lang.String str9 = c21908xb66fd105.N;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.Y0(d17));
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c21908xb66fd105.W0());
            j31.c cVar = c21908xb66fd105.X;
            java.lang.String str10 = cVar.f378907f;
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c21908xb66fd105.F1(cVar.f378908g));
            j31.c cVar2 = c21908xb66fd105.X;
            g0Var2.d(11608, str8, str7, 888888, valueOf, str9, valueOf2, valueOf3, str10, valueOf4, cVar2.f378909h, cVar2.f378913l, java.lang.Integer.valueOf(c21908xb66fd105.b1()));
            c21908xb66fd105.r1(true, erVar.c(), d17, str7);
            ahVar = this;
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            str3 = str5;
            str4 = str6;
        } else {
            ahVar = this;
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            str3 = "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan";
            str4 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$12";
        }
        yj0.a.h(ahVar, str4, str3, str2, str);
    }
}
