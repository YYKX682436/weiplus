package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class aa implements c01.yc {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f156970d;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("AppBrandNotify", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x9(null));
        hashMap.put("AppPublicLibraryNotify", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z9(null));
        hashMap.put("mmbizwxaconfig", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v9(null));
        hashMap.put("ForceOpenAppNotify", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c0());
        hashMap.put("AppBrandForceKill", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.b0());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d) {
            hashMap.put("AppBrandTestUpdateWxaUsageListNotify", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.u0());
        }
        f156970d = java.util.Collections.unmodifiableMap(hashMap);
    }

    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (gm0.j1.a()) {
            java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "msg content is null");
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t9(this, g17), "MicroMsg.AppBrand.WxaPkgPushingXmlHandler");
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
