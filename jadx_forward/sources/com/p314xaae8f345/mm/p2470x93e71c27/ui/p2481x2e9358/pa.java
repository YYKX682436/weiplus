package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class pa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.qa f272099d;

    public pa(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.qa qaVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar) {
        this.f272099d = qaVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.qa qaVar = this.f272099d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar = qaVar.f272125f;
        int m8183xf806b362 = qaVar.m8183xf806b362();
        jr.p pVar = qaVar.f272124e;
        java.util.HashMap c17 = raVar.c();
        raVar.b(c17, pVar, m8183xf806b362);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c17.put("click_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        raVar.e("chat_emo_bubble", "view_clk", c17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.la laVar = qaVar.f272125f.A;
        int m8183xf806b3622 = qaVar.m8183xf806b362();
        jr.p pVar2 = qaVar.f272124e;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar2 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ga) laVar).f271869a;
        if (pVar2 != null && raVar2.f272149g != null && raVar2.f272150h != null) {
            z85.l c18 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = pVar2.f382849a;
            if (c18.u1(c21053xdbf1e5f4.f68671x4b6e68b9) == null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo880xb970c2b9(c21053xdbf1e5f4);
            }
            c21053xdbf1e5f4.K2 = qk.z6.SEND_FROM_SCENE_RECOMMEND_BUBBLE;
            raVar2.f272149g.b(c21053xdbf1e5f4);
            raVar2.f272150h.mo57136x5a5b64d();
            raVar2.f(java.util.Collections.singletonList(pVar2), 0);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6948x597c7cb1 c6948x597c7cb1 = raVar2.f272157o;
            c6948x597c7cb1.f142534g = m8183xf806b3622;
            c6948x597c7cb1.f142531d = 1L;
            c6948x597c7cb1.f142546s = java.lang.System.currentTimeMillis() - raVar2.f272159q;
            c6948x597c7cb1.k();
            c6948x597c7cb1.f142534g = 0L;
        }
        raVar2.f272147e.dismiss();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
