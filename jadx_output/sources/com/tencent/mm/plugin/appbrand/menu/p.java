package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class p extends nh1.a {
    public p() {
        super(28);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        java.util.Map map = i81.j.f289592a;
        if (context instanceof com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_Fav", "AppBrandAdUI not support favorite");
        } else if (n7Var.getRuntime().u0().f77292e2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_Fav", "isPluginApp not support");
        } else {
            g4Var.j(this.f337084a, context.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0, n7Var.H1(28).f85995c);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        java.lang.String J1 = n7Var.J1();
        if (com.tencent.mm.sdk.platformtools.t8.K0(J1)) {
            J1 = n7Var.getRuntime().u0().f77279e;
        }
        of1.w1 s37 = n7Var.s3();
        java.lang.String url = s37 == null ? "" : s37.getWebView().getUrl();
        com.tencent.mm.plugin.appbrand.jsapi.n5 oVar = new com.tencent.mm.plugin.appbrand.menu.o();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, J1);
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, n7Var.Y1());
        hashMap.put("webViewUrl", url);
        oVar.t(hashMap);
        n7Var.i(oVar, null);
        com.tencent.mm.plugin.appbrand.report.v0.e(str, n7Var.X1(), 4, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
