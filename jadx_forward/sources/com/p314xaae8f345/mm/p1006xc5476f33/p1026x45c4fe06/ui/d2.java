package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f171189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        super(1);
        this.f171189d = appBrandDebugUI;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe it = (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a.f159126a;
        boolean h17 = it.h();
        aVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a.f159129d.b(aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a.f159127b[1], java.lang.Boolean.valueOf(h17));
        if (it.h()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5 g5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52().edit().putBoolean("com.tencent.mm.plugin.appbrand.launching.isForcedOpenWxaAppForTypedDemo", false).apply();
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f171189d;
            android.preference.Preference c17 = appBrandDebugUI.f301660z.c("pref_key_force_open_wxa_app_for_typed_demo");
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, c17 instanceof com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe ? (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) c17 : null, false);
        }
        return jz5.f0.f384359a;
    }
}
