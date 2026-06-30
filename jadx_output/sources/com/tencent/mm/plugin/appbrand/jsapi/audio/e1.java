package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class e1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 47;
    public static final java.lang.String NAME = "operateMusicPlayer";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer f79179g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer jsApiOperateMusicPlayer$OperateMusicPlayer;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        this.f79179g = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer(this, c0Var, i17);
        c01.l2 c17 = c01.n2.d().c(c01.n2.a("AppBrandService#" + c0Var.hashCode()), true);
        synchronized (c17) {
            if (((com.tencent.mm.plugin.appbrand.ui.banner.w) c17.c("StickyBannerChangeListener", null)) == null) {
                com.tencent.mm.plugin.appbrand.jsapi.audio.t0 t0Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.t0(this, c17, c0Var);
                com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = c0Var.t3().E0();
                if (E0 != null) {
                    c17.i("pkgType", java.lang.Integer.valueOf(E0.f305852r.f75399d));
                }
                c17.i("StickyBannerChangeListener", t0Var);
                c17.i("appId", c0Var.getAppId());
            }
            if (((com.tencent.mm.plugin.appbrand.v0) c17.c("AppBrandLifeCycle.Listener", null)) == null) {
                com.tencent.mm.plugin.appbrand.jsapi.audio.u0 u0Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.u0(this, c17, c0Var);
                c17.i("AppBrandLifeCycle.Listener", u0Var);
                this.f79179g.f79039g = u0Var;
            }
            jsApiOperateMusicPlayer$OperateMusicPlayer = this.f79179g;
            jsApiOperateMusicPlayer$OperateMusicPlayer.getClass();
            jsApiOperateMusicPlayer$OperateMusicPlayer.f79038f = c17;
        }
        jsApiOperateMusicPlayer$OperateMusicPlayer.f79043n = jSONObject.toString();
        this.f79179g.f79044o = c0Var.getAppId();
        this.f79179g.d();
    }
}
