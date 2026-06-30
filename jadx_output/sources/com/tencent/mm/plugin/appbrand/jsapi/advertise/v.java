package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.advertise.v f78776d = new com.tencent.mm.plugin.appbrand.jsapi.advertise.v();

    public v() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        int i17 = 500;
        if (e0Var != null) {
            i17 = ((h62.d) e0Var).Ni(e42.c0.clicfg_mb_reward_ad_log_max_length_android, 500);
        }
        return java.lang.Integer.valueOf(i17);
    }
}
