package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fe0 f85976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f85980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.n f85981i;

    public l(com.tencent.mm.plugin.appbrand.menu.n nVar, r45.fe0 fe0Var, android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 n7Var, java.lang.String str, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f85981i = nVar;
        this.f85976d = fe0Var;
        this.f85977e = context;
        this.f85978f = n7Var;
        this.f85979g = str;
        this.f85980h = k0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.util.LinkedList linkedList = this.f85976d.f374251e;
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.o06 o06Var = (r45.o06) it.next();
                if (i18 == menuItem.getItemId()) {
                    boolean z17 = o06Var.f381801e;
                    com.tencent.mm.plugin.appbrand.menu.n nVar = this.f85981i;
                    com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f85978f;
                    if (z17) {
                        if (o06Var.f381800d == 2) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_DeveloperService", "do copy url:%s", n7Var.X1());
                            com.tencent.mm.plugin.appbrand.menu.e eVar = com.tencent.mm.plugin.appbrand.menu.n.f85985b;
                            eVar.f85947a = this.f85979g;
                            eVar.f85948b = n7Var.X1();
                            com.tencent.mm.plugin.appbrand.jsapi.vf.f83519a.b(com.tencent.mm.plugin.appbrand.jsapi.d1.f80732e, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, eVar);
                            new com.tencent.mm.plugin.appbrand.jsapi.t0(false).x(n7Var.getComponentId(), n7Var.U1());
                        } else {
                            r45.t06 t06Var = o06Var.f381803g;
                            if (t06Var == null || com.tencent.mm.sdk.platformtools.t8.K0(t06Var.f386050d)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.MenuDelegate_DeveloperService", "wxa_item or appId invalid!!");
                                nVar.d(n7Var, "" + o06Var.f381805i, 2);
                            } else {
                                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                                appBrandStatObject.f87790f = com.tencent.mm.plugin.appbrand.ad.jsapi.r.CTRL_INDEX;
                                appBrandStatObject.f87791g = "" + o06Var.f381800d + ":" + i18;
                                if (com.tencent.mm.sdk.platformtools.t8.K0(o06Var.f381803g.f386051e)) {
                                    str = "";
                                } else {
                                    str = o06Var.f381803g.f386051e + "&target_path=" + android.net.Uri.encode(n7Var.X1());
                                }
                                r45.t06 t06Var2 = o06Var.f381803g;
                                com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_DeveloperService", "appId:%s, versionType:%d, path:%s", t06Var2.f386050d, java.lang.Integer.valueOf(t06Var2.f386052f), str);
                                com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
                                android.content.Context context = this.f85977e;
                                r45.t06 t06Var3 = o06Var.f381803g;
                                ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).aj(context, "", t06Var3.f386050d, t06Var3.f386052f, -1, str, appBrandStatObject);
                            }
                        }
                        nVar.d(n7Var, "" + o06Var.f381805i, 1);
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MenuDelegate_DeveloperService", "has_auth is false");
                        android.content.Context context2 = this.f85977e;
                        dp.a.makeText(context2, context2.getString(com.tencent.mm.R.string.f490642n42), 1).show();
                        nVar.d(n7Var, "" + o06Var.f381805i, 1);
                    }
                } else {
                    i18++;
                }
            }
        }
        this.f85980h.u();
    }
}
