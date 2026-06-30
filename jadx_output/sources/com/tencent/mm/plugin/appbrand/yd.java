package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class yd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ae f92424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(com.tencent.mm.plugin.appbrand.ae aeVar) {
        super(0);
        this.f92424d = aeVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.ae aeVar = this.f92424d;
        boolean z17 = false;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = aeVar.f74952a.S2(false);
        if (S2 != null && !aeVar.f74952a.q2() && java.lang.Boolean.parseBoolean(S2.qe("earlyDispatchSubPkgReady"))) {
            if (java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_appbrand_early_sub_package_ready_dispatch, com.tencent.mm.sdk.platformtools.z.f193112h <= 671097855)).booleanValue()) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
