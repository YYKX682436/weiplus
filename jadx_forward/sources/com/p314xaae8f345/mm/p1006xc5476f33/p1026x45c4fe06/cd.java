package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class cd implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.gc {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f158708a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f158709b;

    public cd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 updatedConfig, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updatedConfig, "updatedConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        this.f158708a = updatedConfig;
        this.f158709b = rt6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.gc
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        this.f158708a = newConfig;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.gc
    public java.lang.Boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = this.f158709b.N2();
        java.lang.String L1 = N2 != null ? N2.L1() : null;
        java.lang.String str = newConfig.f158816i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f158708a;
        int i17 = c11809xbc286be4.f128802b2.f169323f;
        int i18 = newConfig.f128802b2.f169323f;
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p pVar = c11809xbc286be4.W1;
        if (pVar != com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.PRE_RENDER || pVar == newConfig.W1 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L1, str) || i17 != i18) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreRenderAutoRelaunchLogicInterceptor", "shouldReLaunchOnConfigWillUpdate returns false, appId:" + this.f158709b.f156336n + ", currentOriginRouteUrl:" + L1 + ", newRouteUrl:" + str + ", oldScene:" + i17 + ", newScene:" + i18);
        return java.lang.Boolean.FALSE;
    }
}
