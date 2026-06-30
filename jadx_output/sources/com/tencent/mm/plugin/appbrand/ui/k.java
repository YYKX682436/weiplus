package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes4.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f89813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.y0 f89814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89815f;

    public k(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, java.util.List list, com.tencent.mm.plugin.appbrand.ui.y0 y0Var) {
        this.f89815f = appBrandAuthorizeUI;
        this.f89813d = list;
        this.f89814e = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f89815f;
        if (appBrandAuthorizeUI.f89320z) {
            appBrandAuthorizeUI.f89320z = false;
            java.lang.String str = appBrandAuthorizeUI.f89303f;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int k76 = appBrandAuthorizeUI.k7();
            int j76 = appBrandAuthorizeUI.j7();
            for (r45.vb vbVar : appBrandAuthorizeUI.f89301d) {
                if (this.f89813d.contains(vbVar.f388058d)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "setAuthState scope=%s", vbVar.f388058d);
                    if (appBrandAuthorizeUI.E || !appBrandAuthorizeUI.D || !vbVar.f388058d.equals("scope.userLocationBackground") || k76 == 2) {
                        if (appBrandAuthorizeUI.K || !appBrandAuthorizeUI.f89300J || !vbVar.f388058d.equals("scope.bluetoothBackground") || j76 == 2) {
                            r45.hn4 hn4Var = new r45.hn4();
                            if (vbVar.f388058d.equals("scope.userInfo")) {
                                hn4Var.f376315f = appBrandAuthorizeUI.f89318x;
                            }
                            if (vbVar.f388058d.equals("scope.userProfileChange")) {
                                hn4Var.f376315f = appBrandAuthorizeUI.f89319y;
                            }
                            hn4Var.f376313d = vbVar.f388058d;
                            hn4Var.f376314e = vbVar.f388060f;
                            linkedList.add(hn4Var);
                        }
                    }
                }
            }
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.qc7();
            lVar.f70665b = new r45.rc7();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp_modauth";
            lVar.f70667d = 1188;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            r45.qc7 qc7Var = new r45.qc7();
            qc7Var.f383836d = str;
            qc7Var.f383837e = linkedList;
            lVar.f70664a = qc7Var;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.n(appBrandAuthorizeUI));
            com.tencent.mm.modelbase.z2.e(lVar.a(), new com.tencent.mm.plugin.appbrand.ui.p(appBrandAuthorizeUI, this.f89814e), true, appBrandAuthorizeUI);
        }
    }
}
