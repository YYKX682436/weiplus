package n44;

/* loaded from: classes4.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.r f416555d;

    public q(n44.r rVar) {
        this.f416555d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper$createHalfScreen$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenKefuConfirmHelper$createHalfScreen$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenKefuConfirmHelper", "do click, jump to kefu page");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doClickReport", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        n44.r rVar = this.f416555d;
        rVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClickReport", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2040, 100);
        i64.z g17 = rVar.g();
        if (g17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            i17 = g17.f370901f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        } else {
            i17 = 0;
        }
        int i18 = i17 == 0 ? 1 : 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        i64.z g18 = rVar.g();
        if (g18 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            obj = g18.f370899d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        } else {
            obj = null;
        }
        jSONObject.put("uxinfo", obj);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i18);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("act_type", 1554);
        jSONObject2.put("act_cnt", 1);
        jSONObject2.put("tag", "clk");
        jSONArray.put(jSONObject2);
        jSONObject.put("ad_trace_msg", jSONArray);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("sns_ad_customer_service_confirm_click_report", jSONObject3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClickReport", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doClickReport", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        x64.u uVar = x64.u.f533866a;
        i64.z g19 = rVar.g();
        if (g19 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJumpKefuUrl", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            str = g19.f370914s;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJumpKefuUrl", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        } else {
            str = null;
        }
        i64.z g27 = rVar.g();
        if (g27 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            str2 = g27.f370899d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        } else {
            str2 = null;
        }
        android.view.View h17 = rVar.h();
        uVar.d(str, str2, h17 != null ? h17.getContext() : null);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenKefuConfirmHelper$createHalfScreen$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper$createHalfScreen$1");
    }
}
