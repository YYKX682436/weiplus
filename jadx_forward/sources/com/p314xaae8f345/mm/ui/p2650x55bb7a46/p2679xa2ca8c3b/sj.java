package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class sj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f287060d;

    public sj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105) {
        this.f287060d = c21908xb66fd105;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(erVar.c().j(), "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "values map is null.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f287060d;
        if (P == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = erVar.c();
            ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).wi(c21908xb66fd105.f284708s.g(), new r01.b2(0, c17.j(), c17.I0(), c17.m124847x74d37ac6(), erVar.f285439b, c21908xb66fd105.f284708s.x()));
            c21908xb66fd105.u0(9, c21908xb66fd105.I, c21908xb66fd105.H);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.String str = c21908xb66fd105.H;
            java.lang.String str2 = erVar.f285439b;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c21908xb66fd105.P);
            java.lang.String str3 = c21908xb66fd105.N;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.Y0(d17));
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c21908xb66fd105.W0());
            j31.c cVar = c21908xb66fd105.X;
            java.lang.String str4 = cVar.f378907f;
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c21908xb66fd105.F1(cVar.f378908g));
            j31.c cVar2 = c21908xb66fd105.X;
            g0Var.d(11608, str, str2, 0, valueOf, str3, valueOf2, valueOf3, str4, valueOf4, cVar2.f378909h, cVar2.f378913l, java.lang.Integer.valueOf(c21908xb66fd105.b1()));
        } else if (P == 2) {
            java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.schedule_username");
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.schedule_messvrid"), -1L);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.i0(c21908xb66fd105, view.getContext(), str5, V);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[onClick] Remind! username:%s svrMsgId:%s", str5, java.lang.Long.valueOf(V));
        }
        c21908xb66fd105.s1(2, c21908xb66fd105.f284708s.x(), erVar.f285439b);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.h0(c21908xb66fd105, 8, erVar.f285439b, P == 1 ? 1 : 2, 0);
        c21908xb66fd105.o1(4, d17, "");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.g0(c21908xb66fd105, 6, erVar.c());
        tb5.a.f498558a.a(2, c21908xb66fd105.X, c21908xb66fd105.f284708s.x(), c21908xb66fd105.Y);
        tb5.o0.c(c21908xb66fd105.f284708s, erVar.c(), d17, 2);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.e0(c21908xb66fd105, erVar, d17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
