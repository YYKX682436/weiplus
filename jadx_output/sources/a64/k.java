package a64;

/* loaded from: classes4.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a64.l f1773d;

    public k(a64.l lVar) {
        this.f1773d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC$refreshView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/ui/uic/AdKefuBottomComponentUIC$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("AdKefuBottomComponentUIC", "do click, jump to kefu page");
        a64.l lVar = this.f1773d;
        int i17 = lVar.P6() ? 1554 : 1555;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doClickReport", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClickReport", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        if (lVar.P6()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 100);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 101);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        int i18 = lVar.f1762h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        int i19 = i18 == 0 ? 1 : 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        java.lang.Object obj = lVar.f1760f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        jSONObject.put("uxinfo", obj);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i19);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("act_type", i17);
        jSONObject2.put("act_cnt", 1);
        jSONObject2.put("tag", "clk");
        jSONArray.put(jSONObject2);
        jSONObject.put("ad_trace_msg", jSONArray);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("sns_ad_customer_service_confirm_click_report", jSONObject3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClickReport", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doClickReport", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        x64.u uVar = x64.u.f452333a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpKefuUrl", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        java.lang.String str = lVar.f1775s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpKefuUrl", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        java.lang.String str2 = lVar.f1760f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        uVar.d(str, str2, lVar.getActivity());
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/ui/uic/AdKefuBottomComponentUIC$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC$refreshView$1");
    }
}
