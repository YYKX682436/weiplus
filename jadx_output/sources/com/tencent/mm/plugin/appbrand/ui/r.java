package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class r implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89969d;

    public r(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f89969d = appBrandAuthorizeUI;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI;
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList linkedList = ((r45.zs3) oVar.f70711b.f70700a).f392348e;
            if (linkedList == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeUI", "wxa_msg_config_list not exist");
                return 0;
            }
            java.util.Iterator it = linkedList.iterator();
            r45.le7 le7Var = null;
            while (true) {
                boolean hasNext = it.hasNext();
                appBrandAuthorizeUI = this.f89969d;
                if (!hasNext) {
                    break;
                }
                r45.le7 le7Var2 = (r45.le7) it.next();
                if (le7Var2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandAuthorizeUI", "scene end, item is null");
                } else {
                    if (appBrandAuthorizeUI.f89303f.equals(le7Var2.f379398d)) {
                        le7Var = le7Var2;
                    }
                    com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent updateAppBrandNotifyMessageEvent = new com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent();
                    java.lang.String str2 = le7Var2.f379398d;
                    am.rz rzVar = updateAppBrandNotifyMessageEvent.f54912g;
                    rzVar.f7853a = str2;
                    rzVar.f7854b = le7Var2.f379399e == 0;
                    updateAppBrandNotifyMessageEvent.e();
                }
            }
            if (le7Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeUI", "currentConfigItem not found, appId: %s", appBrandAuthorizeUI.f89303f);
                return 0;
            }
            appBrandAuthorizeUI.U = true;
            appBrandAuthorizeUI.T = le7Var.f379399e == 0;
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.V6(appBrandAuthorizeUI, appBrandAuthorizeUI.f89301d, appBrandAuthorizeUI.N, appBrandAuthorizeUI.f89302e);
        }
        return 0;
    }
}
