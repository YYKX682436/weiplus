package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class lh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f286014d;

    public lh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105) {
        this.f286014d = c21908xb66fd105;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on header (%s) name click", erVar.f285439b);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(erVar.c().j(), "msg", null);
        java.lang.String str = (java.lang.String) d17.get(".msg.fromusername");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f286014d;
        java.lang.String str2 = c21908xb66fd105.H;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c21908xb66fd105.P);
        java.lang.String str3 = c21908xb66fd105.N;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.Y0(d17));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c21908xb66fd105.W0());
        j31.c cVar = c21908xb66fd105.X;
        java.lang.String str4 = cVar.f378907f;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c21908xb66fd105.F1(cVar.f378908g));
        j31.c cVar2 = c21908xb66fd105.X;
        g0Var.d(11608, str2, str, 66666, valueOf, str3, valueOf2, valueOf3, str4, valueOf4, cVar2.f378909h, cVar2.f378913l, java.lang.Integer.valueOf(c21908xb66fd105.b1()));
        java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.weapp_username");
        java.lang.String str6 = str5 == null ? "" : str5;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
            java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.header_jump_url");
            if (str7 == null) {
                str7 = "";
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str7);
                intent.putExtra("key_enable_teen_mode_check", true);
                intent.putExtra("key_enable_fts_quick", true);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.h(intent, c21908xb66fd105.f284708s.x());
                j45.l.j(c21908xb66fd105.f284708s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
        } else {
            java.lang.String str8 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.weapp_path");
            java.lang.String str9 = str8 == null ? "" : str8;
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.weapp_state"), 0);
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.weapp_version"), 0);
            java.lang.String str10 = (java.lang.String) d17.get(".msg.appmsg.template_id");
            if (str10 == null) {
                str10 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
            c12559xbdae8559.f169324g = erVar.c().I0() + ":" + erVar.f285439b + ":" + c21908xb66fd105.f284708s.x() + ":" + str10;
            c12559xbdae8559.f169323f = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.d0(str10);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(c21908xb66fd105.f284708s.g(), str6, null, P, P2, str9, c12559xbdae8559);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.e0(c21908xb66fd105, erVar, d17);
        c21908xb66fd105.s1(10, c21908xb66fd105.f284708s.x(), str);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
