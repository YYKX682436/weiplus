package k84;

/* loaded from: classes4.dex */
public final class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f386528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f386529e;

    public d3(k84.d4 d4Var, android.content.Context context) {
        this.f386528d = d4Var;
        this.f386529e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setUIForNoAnim$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdFireworkCheerComponent$setUIForNoAnim$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k84.d4 d4Var = this.f386528d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) d4Var.i();
        java.lang.Object t07 = ca4.z0.t0(c17933xe8d1b226 != null ? c17933xe8d1b226.f68891x29d1292e : 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        i64.b1 b1Var = d4Var.f386537u;
        int i17 = b1Var != null && b1Var.f370628j == 0 ? 1 : 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsid", t07);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) d4Var.i();
        jSONObject.put("uxinfo", c17933xe8d1b2262 != null ? c17933xe8d1b2262.m70375x338a8cc7() : null);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("act_type", 1417);
        jSONObject2.put("act_cnt", 1);
        jSONObject2.put("tag", "clk");
        jSONArray.put(jSONObject2);
        jSONObject.put("ad_trace_msg", jSONArray);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("sns_ad_firework_cheer_btn_clk_report", jSONObject3);
        if (d4Var.T() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdapter", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdapter", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = d4Var.f386539w;
            if (bsVar != null && (l1Var = bsVar.f249569b) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder T = d4Var.T();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdapter", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdapter", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                l1Var.h(T, bsVar.c(d4Var.T().f250795c), new r45.e86());
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("list_attr", 16391);
        intent.putExtra("block_contact", c01.z1.r());
        intent.putExtra("max_limit_num", 1);
        android.content.Context context = this.f386529e;
        intent.putExtra("titile", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j6l));
        j45.l.v(context, ".ui.contact.SelectContactUI", intent, 2333);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdFireworkCheerComponent$setUIForNoAnim$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setUIForNoAnim$1");
    }
}
