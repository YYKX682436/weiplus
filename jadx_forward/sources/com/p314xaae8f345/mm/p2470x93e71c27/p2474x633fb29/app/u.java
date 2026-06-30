package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes4.dex */
public class u implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v f270622a;

    public u(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v vVar) {
        this.f270622a = vVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        boolean z18;
        ca4.c a17;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v vVar = this.f270622a;
        java.lang.String g17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.g(vVar.f270629c);
        if (g17 != null) {
            ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            java.util.ArrayList arrayList = l44.z.f397961a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: adReportParams is ".concat(g17));
                a17 = l44.z.a("reportLaunchApplicationConfirmDialogOk", g17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: exp is " + th6);
            }
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: adCommonData is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            } else {
                org.json.JSONObject jSONObject = a17.f121378b;
                org.json.JSONObject jSONObject2 = a17.f121379c;
                if (jSONObject != null && jSONObject2 != null) {
                    ca4.f fVar = new ca4.f();
                    fVar.o(a17.f121377a);
                    fVar.p(a17.f121380d);
                    fVar.n(a17.f121381e);
                    fVar.q(a17.f121382f);
                    fVar.d(g17);
                    if (jSONObject.has("wxad")) {
                        if (jSONObject2.optInt(ya.b.f77502x92235c1b) == 4) {
                            fVar.m(4001002);
                            fVar.k(1);
                            a84.t0.a(fVar.a());
                        } else if (jSONObject2.opt(ya.b.f77502x92235c1b) != null) {
                            fVar.m(4002009);
                            fVar.h(1);
                            fVar.i(1);
                            a84.t0.a(fVar.a());
                        }
                    } else if (jSONObject.has("xjad") && jSONObject2.opt(ya.b.f77502x92235c1b) != null) {
                        fVar.m(4002009);
                        fVar.h(3);
                        fVar.i(1);
                        a84.t0.a(fVar.a());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: sourceParams or sourceJsonObj is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        }
        try {
            android.content.Context context = vVar.f270628b;
            android.content.Intent intent = vVar.f270632f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/pluginsdk/model/app/AppInfoLogic$7$2", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/model/app/AppInfoLogic$7$2", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.y(vVar.f270629c);
            z18 = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", e17.getMessage());
            z18 = false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.a(vVar.f270629c, 0, 1, "", z18 ? 1 : 0, vVar.f270630d);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.A(vVar.f270630d, true);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.b(vVar.f270630d, true, vVar.f270632f);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var = vVar.f270633g;
        if (a5Var != null) {
            a5Var.a(z18, false);
        }
    }
}
