package gd4;

/* loaded from: classes4.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd4.c2 f352129d;

    public a1(gd4.c2 c2Var) {
        this.f352129d = c2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/IpInteractScheduleVideoController$startProcessCommandFlow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gd4.c2 c2Var = this.f352129d;
        i64.b1 h17 = c2Var.h();
        int i17 = (h17 != null ? h17.f370628j : 0) == 0 ? 1 : 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsid", ca4.z0.t0(c2Var.i().f68891x29d1292e));
        jSONObject.put("uxinfo", c2Var.i().m70375x338a8cc7());
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
        java.lang.String str = c2Var.i().m70354x74235b3e().f38172xd73c98cc;
        if (str == null) {
            str = "";
        }
        jSONObject.put("adExtInfo", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("IpInteractScheduleVideoController", "sns_ad_ip_interact_tag_click_report:".concat(jSONObject2));
        ca4.m0.a("sns_ad_ip_interact_tag_click_report", jSONObject2);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/IpInteractScheduleVideoController$startProcessCommandFlow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$1");
    }
}
