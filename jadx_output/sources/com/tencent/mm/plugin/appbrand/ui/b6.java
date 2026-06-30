package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public class b6 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI f89575a;

    public b6(com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI appBrandOpenWeRunSettingUI) {
        this.f89575a = appBrandOpenWeRunSettingUI;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenWeRunSettingUI", "getContactCallBack, suc = %b,user %s", java.lang.Boolean.valueOf(z17), str);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_43f2581f6fd6", true);
        com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI appBrandOpenWeRunSettingUI = this.f89575a;
        appBrandOpenWeRunSettingUI.f89375i = n17;
        appBrandOpenWeRunSettingUI.T6();
        appBrandOpenWeRunSettingUI.f89376m.dismiss();
    }
}
