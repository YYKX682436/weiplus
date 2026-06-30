package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes8.dex */
public class c0 implements com.tencent.mm.plugin.appbrand.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI f78399a;

    public c0(com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI appBrandTaskProxyUI) {
        this.f78399a = appBrandTaskProxyUI;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.miniutil.MiniReaderConstants$MiniQbFloatBallMenuActionBrandEvent) {
            com.tencent.mm.miniutil.MiniReaderConstants$MiniQbFloatBallMenuActionBrandEvent miniReaderConstants$MiniQbFloatBallMenuActionBrandEvent = (com.tencent.mm.miniutil.MiniReaderConstants$MiniQbFloatBallMenuActionBrandEvent) obj;
            if (miniReaderConstants$MiniQbFloatBallMenuActionBrandEvent != null) {
                com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI appBrandTaskProxyUI = this.f78399a;
                if (appBrandTaskProxyUI.f78369q != null) {
                    java.lang.String str = appBrandTaskProxyUI.f78371s;
                    java.lang.String str2 = miniReaderConstants$MiniQbFloatBallMenuActionBrandEvent.f69167e;
                    if (!com.tencent.mm.sdk.platformtools.t8.D0(str2, str)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandTaskProxyUI", "MiniQbFloatBallMenuActionEvent event.filePath:%s filePath:%s", str2, appBrandTaskProxyUI.f78371s);
                        return;
                    }
                    int i17 = miniReaderConstants$MiniQbFloatBallMenuActionBrandEvent.f69166d;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskProxyUI", "MiniQbFloatBallMenuActionEvent event.action:%s", java.lang.Integer.valueOf(i17));
                    if (i17 != 1) {
                        if (i17 == 2) {
                            appBrandTaskProxyUI.f78369q.B(false);
                            if (!appBrandTaskProxyUI.f78377y) {
                                appBrandTaskProxyUI.f78376x = false;
                                uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
                                java.lang.String str3 = appBrandTaskProxyUI.f78373u;
                                java.lang.String str4 = appBrandTaskProxyUI.f78371s;
                                ((th0.u) rVar).getClass();
                                com.tencent.mm.xwebutil.i.a(appBrandTaskProxyUI, str3, str4);
                                uh0.s sVar = (uh0.s) i95.n0.c(uh0.s.class);
                                com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI appBrandTaskProxyUI2 = this.f78399a;
                                ((th0.w) sVar).Ai(false, false, false, false, appBrandTaskProxyUI2, appBrandTaskProxyUI2.f78371s, appBrandTaskProxyUI2.f78374v, appBrandTaskProxyUI2.f78372t, appBrandTaskProxyUI2.f78373u, 10, appBrandTaskProxyUI2.A, appBrandTaskProxyUI2.f78378z, true, appBrandTaskProxyUI2.f78370r, appBrandTaskProxyUI2.f78375w);
                                return;
                            }
                            uh0.s sVar2 = (uh0.s) i95.n0.c(uh0.s.class);
                            com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI appBrandTaskProxyUI3 = this.f78399a;
                            java.lang.String str5 = appBrandTaskProxyUI3.f78371s;
                            java.lang.String str6 = appBrandTaskProxyUI3.f78374v;
                            java.lang.String str7 = appBrandTaskProxyUI3.f78372t;
                            java.lang.String str8 = appBrandTaskProxyUI3.f78373u;
                            android.webkit.ValueCallback valueCallback = appBrandTaskProxyUI3.A;
                            android.webkit.ValueCallback valueCallback2 = appBrandTaskProxyUI3.B;
                            java.lang.String str9 = appBrandTaskProxyUI3.f78370r;
                            ((th0.w) sVar2).getClass();
                            vt0.c.g(false, false, false, appBrandTaskProxyUI3, str5, str6, str7, str8, 10, valueCallback, valueCallback2, true, str9, false);
                            return;
                        }
                        if (i17 == 4) {
                            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                            java.lang.String str10 = appBrandTaskProxyUI.f78371s;
                            com.tencent.mm.plugin.appbrand.ipc.b0 b0Var2 = new com.tencent.mm.plugin.appbrand.ipc.b0(this);
                            ((yb0.g) b0Var).getClass();
                            com.tencent.mm.platformtools.ExportFileUtil.e(appBrandTaskProxyUI, str10, null, b0Var2);
                            return;
                        }
                        if (i17 != 8) {
                            return;
                        }
                    }
                    appBrandTaskProxyUI.f78369q.B(true);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandTaskProxyUI", "MiniQbFloatBallMenuActionEvent fail");
        }
    }
}
