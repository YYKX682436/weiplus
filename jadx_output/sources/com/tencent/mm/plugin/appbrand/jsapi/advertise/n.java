package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes7.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.advertise.n f78767d = new com.tencent.mm.plugin.appbrand.jsapi.advertise.n();

    public n() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            return ((wj.g1) ((wj.m) i95.n0.c(wj.m.class))).Di();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] get navigate strategy failed: " + e17.getMessage());
            return xj.p.f454766f;
        }
    }
}
