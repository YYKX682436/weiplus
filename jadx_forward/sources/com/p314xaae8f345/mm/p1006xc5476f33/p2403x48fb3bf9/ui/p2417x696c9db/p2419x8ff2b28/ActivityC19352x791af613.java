package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/BrowserChooseUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ljx4/a;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI */
/* loaded from: classes8.dex */
public final class ActivityC19352x791af613 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements jx4.a {

    /* renamed from: d, reason: collision with root package name */
    public final hx4.p f265532d = new hx4.p(this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f265533e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.List<android.content.pm.ResolveInfo> b17;
        android.content.res.Resources resources;
        android.content.pm.ActivityInfo activityInfo;
        super.onCreate(bundle);
        hx4.p pVar = this.f265532d;
        pVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        pVar.f367216b = currentTimeMillis;
        java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis);
        jx4.a aVar = pVar.f367215a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseController", "onCreate uiModel: %s, sessionId: %s", aVar, valueOf);
        java.util.ArrayList arrayList = (java.util.ArrayList) pVar.f367217c;
        arrayList.clear();
        java.lang.String str = "";
        try {
            java.lang.Object l17 = gm0.j1.u().c().l(274528, "");
            if (l17 instanceof java.lang.String) {
                str = (java.lang.String) l17;
            }
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.ActivityC19352x791af613 activityC19352x791af613 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.ActivityC19352x791af613) aVar;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19352x791af613.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo55332x76847179);
        android.content.Intent intent = (android.content.Intent) activityC19352x791af613.getIntent().getParcelableExtra("targetintent");
        if (intent == null) {
            b17 = new java.util.ArrayList();
        } else {
            intent.addCategory("android.intent.category.BROWSABLE");
            hx4.r rVar = hx4.r.f367224a;
            android.content.Intent f17 = rVar.f(intent);
            android.content.pm.PackageManager packageManager = mo55332x76847179.getPackageManager();
            java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager != null ? packageManager.queryIntentActivities(f17, 131072) : null;
            if (queryIntentActivities == null) {
                queryIntentActivities = new java.util.ArrayList<>();
            }
            b17 = rVar.b(queryIntentActivities);
        }
        int i17 = 0;
        for (android.content.pm.ResolveInfo resolveInfo : b17) {
            if (resolveInfo != null) {
                hx4.x xVar = new hx4.x(1);
                xVar.f367234b = resolveInfo;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC19352x791af613.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo55332x768471792);
                java.lang.String c17 = hx4.r.c(mo55332x768471792, xVar.f367234b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "<set-?>");
                xVar.f367236d = c17;
                android.content.pm.ResolveInfo resolveInfo2 = xVar.f367234b;
                if (r26.i0.p(str, (resolveInfo2 == null || (activityInfo = resolveInfo2.activityInfo) == null) ? null : activityInfo.packageName, false)) {
                    pVar.f367219e = i17;
                }
                arrayList.add(xVar);
                i17++;
            }
        }
        pVar.f367218d = arrayList.size();
        b17.size();
        arrayList.size();
        if (arrayList.isEmpty()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = activityC19352x791af613.mo55332x76847179();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471794 = activityC19352x791af613.mo55332x76847179();
            dp.a.m125854x26a183b(mo55332x768471793, (mo55332x768471794 == null || (resources = mo55332x768471794.getResources()) == null) ? null : resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5e), 0).show();
            pVar.b(1, null);
        }
        mo78514x143f1b92().G0(com.p314xaae8f345.mm.ui.uk.a(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), 0));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f265533e) {
            return;
        }
        this.f265533e = true;
        ku5.u0 u0Var = ku5.t0.f394148d;
        hx4.t tVar = new hx4.t(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(tVar, 50L, false);
    }
}
