package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.advertise.i f78754d = new com.tencent.mm.plugin.appbrand.jsapi.advertise.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        try {
            z17 = ((wj.g1) ((wj.m) i95.n0.c(wj.m.class))).Ni();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] get keepAlive expt failed: " + e17.getMessage());
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
