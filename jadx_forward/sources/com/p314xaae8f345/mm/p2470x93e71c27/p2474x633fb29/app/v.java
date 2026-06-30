package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes4.dex */
public class v implements ru5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f270628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f270629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f270632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 f270633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e5 f270634h;

    public v(java.lang.String str, android.content.Context context, android.os.Bundle bundle, java.lang.String str2, java.lang.String str3, android.content.Intent intent, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e5 e5Var) {
        this.f270627a = str;
        this.f270628b = context;
        this.f270629c = bundle;
        this.f270630d = str2;
        this.f270631e = str3;
        this.f270632f = intent;
        this.f270633g = a5Var;
        this.f270634h = e5Var;
    }

    @Override // ru5.a
    public java.lang.Object a(java.lang.Object obj) {
        xj.l lVar;
        ca4.c a17;
        java.lang.String str = this.f270627a;
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        android.content.Context context = this.f270628b;
        java.lang.String string = !isEmpty ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_7, str) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_6);
        java.lang.String g17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.g(this.f270629c);
        if (g17 != null) {
            ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportLaunchApplicationShowDialog", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            java.util.ArrayList arrayList = l44.z.f397961a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: adReportParams is ".concat(g17));
                a17 = l44.z.a("reportLaunchApplicationShowDialog", g17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: exp is " + th6);
            }
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: adCommonData is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
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
                            fVar.m(4001018);
                            fVar.k(1);
                            a84.t0.a(fVar.a());
                        } else if (jSONObject2.opt(ya.b.f77502x92235c1b) != null) {
                            fVar.m(4002007);
                            fVar.h(1);
                            fVar.i(1);
                            a84.t0.a(fVar.a());
                        }
                    } else if (jSONObject.has("xjad") && jSONObject2.opt(ya.b.f77502x92235c1b) != null) {
                        fVar.m(4002007);
                        fVar.h(3);
                        fVar.i(1);
                        a84.t0.a(fVar.a());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: sourceParams or sourceJsonObj is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLaunchApplicationShowDialog", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.B(this.f270630d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(string);
        java.lang.String str2 = this.f270631e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_4);
        }
        u1Var.n(str2);
        u1Var.j(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.l(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u(this));
        u1Var.i(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t(this));
        u1Var.q(false);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e5 e5Var = this.f270634h;
        if (e5Var != null && (lVar = ((wj.c0) e5Var).f527915a) != null) {
            lVar.mo25336x6332c618();
        }
        return java.lang.Boolean.TRUE;
    }
}
