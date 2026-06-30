package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public class o extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper f47589e;

    public o(com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper, java.lang.String str) {
        this.f47589e = wxAudioNativeInstallHelper;
        this.f47588d = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void b() {
        com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "onCreate, appId:%s", this.f47588d);
        dl3.i.s().f();
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        java.util.Vector vector;
        java.lang.String str = this.f47588d;
        com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "onDestroy, appId:%s", str);
        vector = com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper.mAppIdList;
        vector.remove(str);
        dl3.i.s().a();
        this.f47589e.removeAudioOutputListener();
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "onPause, appId:%s", this.f47588d);
        this.f47589e.pauseAudio();
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "onResume, appId:%s", this.f47588d);
        this.f47589e.resumeAudio();
    }
}
