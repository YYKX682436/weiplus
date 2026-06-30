package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.r f90539d = new com.tencent.mm.plugin.appbrand.utils.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_wxa_enable_preload_v8_env, a17);
        }
        return java.lang.Boolean.valueOf(a17);
    }
}
