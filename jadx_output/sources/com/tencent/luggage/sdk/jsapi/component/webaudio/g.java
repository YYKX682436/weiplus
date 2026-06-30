package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public class g implements com.tencent.mm.libwxaudio.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper f47574a;

    public g(com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper) {
        this.f47574a = wxAudioNativeInstallHelper;
    }

    @Override // com.tencent.mm.libwxaudio.b
    public void loadLibrary(java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper = this.f47574a;
        try {
            com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "loadLibrary libName:%s", str);
            com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper.class.getClassLoader();
            fp.d0.n(str);
            wxAudioNativeInstallHelper.loadSoResult = true;
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", e17, "load so %s error!!", str);
            wxAudioNativeInstallHelper.loadSoResult = false;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", e18, "load so %s error!!", str);
            wxAudioNativeInstallHelper.loadSoResult = false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WxAudioNativeInstallHelper", th6, "load so %s error!!", str);
            wxAudioNativeInstallHelper.loadSoResult = false;
        }
    }
}
