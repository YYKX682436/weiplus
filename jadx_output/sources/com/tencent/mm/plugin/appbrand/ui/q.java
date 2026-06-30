package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class q implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f89937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f89938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89939f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89940g;

    public q(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference, java.util.LinkedList linkedList, java.lang.String str) {
        this.f89940g = appBrandAuthorizeUI;
        this.f89937d = checkBoxPreference;
        this.f89938e = linkedList;
        this.f89939f = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f89940g;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.X6(appBrandAuthorizeUI);
            db5.t7.makeText(appBrandAuthorizeUI, appBrandAuthorizeUI.getString(com.tencent.mm.R.string.f490500wu), 1).show();
            this.f89937d.O(!r5.N());
            return 0;
        }
        if (((r45.i36) oVar.f70711b.f70700a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeUI", "setReceiveOff failed, response is null!");
        }
        int i19 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f89938e;
            if (i19 >= linkedList.size()) {
                com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.X6(appBrandAuthorizeUI);
                return 0;
            }
            r45.le7 le7Var = (r45.le7) linkedList.get(i19);
            if (le7Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandAuthorizeUI", "scene end, item is null");
            } else {
                com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent updateAppBrandNotifyMessageEvent = new com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent();
                java.lang.String str2 = this.f89939f;
                am.rz rzVar = updateAppBrandNotifyMessageEvent.f54912g;
                rzVar.f7853a = str2;
                rzVar.f7854b = le7Var.f379399e == 0;
                updateAppBrandNotifyMessageEvent.e();
            }
            i19++;
        }
    }
}
