package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.media.e f81777d = new com.tencent.mm.plugin.appbrand.jsapi.media.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        boolean z17 = true;
        if (e0Var != null) {
            z17 = ((h62.d) e0Var).fj(e42.d0.clicfg_appbrand_android_use_audio_focus_service, true);
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAudioFocusServiceFactory", "useAudioFocusService#get, " + valueOf.booleanValue());
        return valueOf;
    }
}
