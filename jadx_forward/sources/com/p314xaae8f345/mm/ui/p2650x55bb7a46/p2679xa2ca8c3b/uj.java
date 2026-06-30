package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class uj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as f287231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f287232e;

    public uj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as asVar) {
        this.f287232e = c21908xb66fd105;
        this.f287231d = asVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) view.getTag(com.p314xaae8f345.mm.R.id.k8v);
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemDyeingTemplate", "on more view click, but msg is null.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null);
        if (d17 == null || d17.size() == 0) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f287232e;
        c21908xb66fd105.c1(c21908xb66fd105.Z);
        tb5.a aVar = tb5.a.f498558a;
        java.lang.String x17 = c21908xb66fd105.f284708s.x();
        java.lang.String str = c21908xb66fd105.Y;
        j31.c cVar = c21908xb66fd105.X;
        aVar.a(4, cVar, x17, str);
        tb5.o0.c(c21908xb66fd105.f284708s, f9Var, d17, 4);
        java.lang.String str2 = (java.lang.String) d17.get(".msg.fromusername");
        if (str2 == null) {
            str2 = "";
        }
        final java.lang.String str3 = str2;
        boolean Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str3);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6351xbeb24369 c6351xbeb24369 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6351xbeb24369();
        c6351xbeb24369.f136990d = 1L;
        c6351xbeb24369.f136991e = java.lang.System.currentTimeMillis();
        c6351xbeb24369.f136992f = c6351xbeb24369.b(dm.i4.f66875xa013b0d5, str3, true);
        c6351xbeb24369.f136993g = c6351xbeb24369.b("templateId", c21908xb66fd105.H, true);
        c6351xbeb24369.f136994h = c6351xbeb24369.b("templateTitle", c21908xb66fd105.N, true);
        c6351xbeb24369.f136995i = c6351xbeb24369.b("templateContent", cVar.f378907f, true);
        c6351xbeb24369.f136997k = c6351xbeb24369.b("objectType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.b(str3), true);
        c6351xbeb24369.k();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(view.getContext(), 1, false);
        c21908xb66fd105.f284714x0 = k0Var;
        k0Var.f293389e = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1() { // from class: com.tencent.mm.ui.chatting.viewitems.uj$$a
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1
            /* renamed from: onShow */
            public final void mo14645xc39f557c() {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.uj ujVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.uj.this;
                ujVar.getClass();
                ujVar.f287232e.s1(17, f9Var.Q0(), str3);
            }
        };
        k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vj(this, f9Var, d17);
        k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wj(this, f9Var, view, d17, str3, Bi);
        k0Var.C = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xj(this, str3, f9Var, d17);
        k0Var.v();
        c21908xb66fd105.s1(4, f9Var.Q0(), str3);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.g0(c21908xb66fd105, 5, f9Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
