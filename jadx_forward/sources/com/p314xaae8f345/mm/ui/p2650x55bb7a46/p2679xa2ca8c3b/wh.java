package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class wh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f287475d;

    public wh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105) {
        this.f287475d = c21908xb66fd105;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(erVar.c().j(), "msg", null);
        boolean z17 = false;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f287475d;
        if (d17 != null && d17.size() != 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), 0);
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.f0(c21908xb66fd105, d17)) {
                z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.block"), false);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) name click, blockProfile: %b", erVar.f285439b, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            view.getContext();
            java.lang.String str = erVar.f285439b;
            c21908xb66fd105.getClass();
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(str);
            if (Bi != null) {
                c21908xb66fd105.u0(1, Bi.f68904x28d45f97, c21908xb66fd105.H);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_username", str);
            intent.putExtra("key_from_scene", 5);
            if (Bi != null) {
                k91.z5 z5Var = new k91.z5();
                z5Var.f387396a = Bi.f68904x28d45f97;
                z5Var.f387405j = 6;
                intent.putExtra("key_scene_exposed_params", z5Var.a());
            }
            j45.l.j(c21908xb66fd105.f284708s.g(), "appbrand", ".ui.AppBrandProfileUI", intent, null);
            c21908xb66fd105.s1(10, c21908xb66fd105.f284708s.x(), erVar.f285439b);
        }
        tb5.a.f498558a.a(5, c21908xb66fd105.X, c21908xb66fd105.f284708s.x(), c21908xb66fd105.Y);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.g0(c21908xb66fd105, 4, erVar.c());
        tb5.o0.c(c21908xb66fd105.f284708s, erVar.c(), d17, 10);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.e0(c21908xb66fd105, erVar, d17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
