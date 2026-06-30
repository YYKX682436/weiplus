package com.tencent.mm.minigame;

/* loaded from: classes4.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.minigame.a0 f68996d = new com.tencent.mm.minigame.a0();

    public a0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String a17 = j62.e.g().a("clicfg_appbrand_wva_enable_android", null, false, true);
        com.tencent.mars.xlog.Log.i("WVA.WVAABTest", "WVAABTest getConfig: " + a17);
        if (a17 != null) {
            try {
                cl0.g gVar = new cl0.g(a17);
                java.lang.String optString = gVar.optString("appid_pattern");
                long optLong = gVar.optLong("wvapkg_max_total_size_mb");
                kotlin.jvm.internal.o.d(optString);
                return new com.tencent.mm.minigame.b0(optString, optLong, false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("WVA.WVAABTest", e17, "parse config failed", new java.lang.Object[0]);
            }
        }
        return new com.tencent.mm.minigame.b0("", 0L, true);
    }
}
