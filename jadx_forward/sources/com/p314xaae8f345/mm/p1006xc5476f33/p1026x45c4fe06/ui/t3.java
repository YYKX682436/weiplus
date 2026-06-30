package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class t3 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f171756a;

    public t3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        this.f171756a = appBrandDebugUI;
    }

    @Override // db5.a1
    /* renamed from: onFinish */
    public final boolean mo26039x42fe6352(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52().edit().putLong("AppBrandDebugUI.PAGE_CONTAINER_NAVIGATION_PUSH_TIMEOUT", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(charSequence.toString(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.d())).apply();
        int i17 = com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.E;
        com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f171756a;
        appBrandDebugUI.X6();
        ex5.g gVar = appBrandDebugUI.f301660z;
        if (gVar == null) {
            return true;
        }
        gVar.notifyDataSetChanged();
        return true;
    }
}
