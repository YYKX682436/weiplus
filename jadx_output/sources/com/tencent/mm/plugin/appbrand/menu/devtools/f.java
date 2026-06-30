package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85897f;

    public f(java.lang.String str, android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f85895d = str;
        this.f85896e = context;
        this.f85897f = n7Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f85897f;
        if (itemId == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SecondaryMenuDelegateAudits", "open Audits auto next time, finish");
            com.tencent.mm.sdk.platformtools.o4 o4Var = k91.d1.f305561a;
            k91.d1.f305561a.putBoolean(this.f85895d + "ENABLE_AUDITS_FLAG", true);
            android.content.Context context = this.f85896e;
            java.lang.String string = context.getString(com.tencent.mm.R.string.gmz);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            pm0.v.X(new com.tencent.mm.plugin.appbrand.menu.devtools.e(context, string, n7Var));
            return;
        }
        if (itemId != 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SecondaryMenuDelegateAudits", "open Audits immediately");
        com.tencent.mm.plugin.appbrand.performance.m.d();
        com.tencent.mm.plugin.appbrand.service.c0 C0 = n7Var.getRuntime().C0();
        if (C0 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EventOnGameAuditsStateChange", "service is null");
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("state", 0);
            od1.b bVar = new od1.b();
            bVar.t(hashMap);
            bVar.u(C0);
            bVar.m();
        }
        n7Var.getRuntime().t3();
    }
}
