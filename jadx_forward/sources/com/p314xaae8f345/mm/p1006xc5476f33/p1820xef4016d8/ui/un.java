package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class un implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm f229049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co f229050e;

    public un(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar) {
        this.f229050e = coVar;
        this.f229049d = zmVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar = this.f229050e;
        android.content.Intent intent = new android.content.Intent(coVar.M.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16389xdab6e25f.class);
        int m8186xceeefb69 = coVar.m8186xceeefb69();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d.V6(coVar.M, m8186xceeefb69);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click normalVh thumb item , realPos : %s ， mSelectPos：%s", java.lang.Integer.valueOf(m8186xceeefb69), java.lang.Integer.valueOf(coVar.M.f228067v));
        intent.putExtra("key_source_click_thumb_detail_need_close_dynamic", coVar.M.f228050e);
        intent.putExtra("key_source_click_thumb_detail_need_close_atmosphere_dynamic", coVar.M.f228051f);
        intent.putExtra("key_source_click_thumb_detail_resp", false);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_CLICK_THUNB_ITEM_SNAPSHOT_STRING_SYNC;
        c17.x(u3Var, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar = this.f229049d;
        r45.wv3 wv3Var = zmVar.f229326b;
        if (wv3Var != null) {
            try {
                gm0.j1.u().c().x(u3Var, new java.lang.String(wv3Var.mo14344x5f01b1f6(), s46.a.f484534a));
                intent.putExtra("key_source_click_thumb_detail_resp", true);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "itemView parse error: %s", e17.toString());
            }
            intent.putExtra("key_source_is_illegal", coVar.M.f7(zmVar.f229326b.f471033f));
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = coVar.M;
            int i17 = activityC16390x60cac25d.f228067v;
            if (i17 >= 0 && i17 < ((java.util.ArrayList) activityC16390x60cac25d.f228065t).size()) {
                intent.putExtra("key_source_select_pos", coVar.M.f228067v);
            }
            intent.putExtra("key_source_is_select_create_Envelope", coVar.M.h7());
            intent.putExtra("key_source_is_select_biz_Envelope", coVar.M.g7());
        }
        intent.putExtra("key_source_original_pos", coVar.M.f228068w);
        intent.putExtra("key_source_original_coverid", coVar.M.K);
        intent.putExtra("key_source_sessionid", coVar.M.f228048J);
        intent.putExtra("key_source_cover_count", coVar.M.f228057n.mo1894x7e414b06() - 1);
        coVar.M.startActivityForResult(intent, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
