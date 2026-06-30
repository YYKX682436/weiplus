package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class bk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as f285027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285028e;

    public bk(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lh lhVar) {
        this.f285028e = c21908xb66fd105;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p2621x8fb0427b.f9)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, tag not msg.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) view.getTag();
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, msg null.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null);
        if (d17 == null || d17.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, values null.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".msg.fromusername");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285028e;
        e31.j jVar = c21908xb66fd105.G;
        boolean z18 = jVar.f328609b;
        boolean z19 = jVar.f328608a;
        boolean z27 = P != 0;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6351xbeb24369 c6351xbeb24369 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6351xbeb24369();
        c6351xbeb24369.f136990d = 1L;
        c6351xbeb24369.f136991e = java.lang.System.currentTimeMillis();
        c6351xbeb24369.f136992f = c6351xbeb24369.b(dm.i4.f66875xa013b0d5, str2, true);
        c6351xbeb24369.f136993g = c6351xbeb24369.b("templateId", c21908xb66fd105.H, true);
        c6351xbeb24369.f136994h = c6351xbeb24369.b("templateTitle", c21908xb66fd105.N, true);
        c6351xbeb24369.f136995i = c6351xbeb24369.b("templateContent", c21908xb66fd105.X.f378907f, true);
        c6351xbeb24369.f136997k = c6351xbeb24369.b("objectType", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.b(str2), true);
        c6351xbeb24369.k();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.a(c21908xb66fd105, 4, d17, str2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(view.getContext(), 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zj(this, d17, z19, z18, view, str2, z27);
        k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ak(this, view, f9Var, d17, str2, z27, z18);
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0) ((sb5.g) c21908xb66fd105.f284708s.f542241c.a(sb5.g.class))).n0()) {
            k0Var.s(c21908xb66fd105.y0(str2), false);
        }
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
