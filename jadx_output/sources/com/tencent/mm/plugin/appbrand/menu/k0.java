package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class k0 extends nh1.a {
    public k0() {
        super(23);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        g4Var.g(this.f337084a, context.getString(com.tencent.mm.R.string.f490059jr), com.tencent.mm.R.raw.appbrand_menu_setting);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r13 == null) goto L11;
     */
    @Override // nh1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.content.Context r11, com.tencent.mm.plugin.appbrand.page.v5 r12, java.lang.String r13, com.tencent.mm.plugin.appbrand.menu.u0 r14) {
        /*
            r10 = this;
            com.tencent.mm.plugin.appbrand.page.n7 r12 = (com.tencent.mm.plugin.appbrand.page.n7) r12
            com.tencent.mm.plugin.appbrand.o6 r14 = r12.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r14 = r14.u0()
            java.lang.String r14 = r14.f47278x
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r14)
            if (r0 == 0) goto L13
            goto L63
        L13:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI> r1 = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.class
            r0.<init>(r11, r1)
            java.lang.String r1 = "key_username"
            android.content.Intent r14 = r0.putExtra(r1, r14)
            java.lang.String r0 = "key_app_authorize_profile"
            r1 = 1
            r14.putExtra(r0, r1)
            com.tencent.mm.plugin.appbrand.o6 r0 = com.tencent.mm.plugin.appbrand.l.b(r13)     // Catch: java.lang.Exception -> L33
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.u0()     // Catch: java.lang.Exception -> L33
            java.lang.String r13 = r0.f47276v     // Catch: java.lang.Exception -> L33
            if (r13 != 0) goto L41
            goto L3f
        L33:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r0}
            java.lang.String r0 = "MicroMsg.AppBrandMenuDelegate_Setting"
            java.lang.String r1 = "openSetting, get runtime by %s, e = %s"
            com.tencent.mars.xlog.Log.e(r0, r1, r13)
        L3f:
            java.lang.String r13 = ""
        L41:
            java.lang.String r0 = "key_app_session_id"
            r14.putExtra(r0, r13)
            java.lang.String r13 = "appbrand"
            java.lang.String r0 = ".ui.AppBrandAuthorizeUI"
            r1 = 0
            j45.l.j(r11, r13, r0, r14, r1)
            java.lang.String r2 = r12.getAppId()
            java.lang.String r3 = r12.X1()
            r4 = 30
            java.lang.String r5 = ""
            long r6 = com.tencent.mm.sdk.platformtools.t8.i1()
            r8 = 1
            r9 = 0
            com.tencent.mm.plugin.appbrand.report.v0.e(r2, r3, r4, r5, r6, r8, r9)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.menu.k0.c(android.content.Context, com.tencent.mm.plugin.appbrand.page.v5, java.lang.String, com.tencent.mm.plugin.appbrand.menu.u0):void");
    }
}
