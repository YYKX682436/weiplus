package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f47580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface f47581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper f47582f;

    public j(com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface nativeCallBackInterface) {
        this.f47582f = wxAudioNativeInstallHelper;
        this.f47580d = tVar;
        this.f47581e = nativeCallBackInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding InitCallBack ");
        com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper = this.f47582f;
        if (wxAudioNativeInstallHelper.wxAudioNative != null) {
            com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding  udpNative != null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) this.f47580d.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding v8Addon is null");
            return;
        }
        z17 = wxAudioNativeInstallHelper.xLibUVSwitch;
        if (z17) {
            wxAudioNativeInstallHelper.wxAudioNative = new com.tencent.mm.libwxaudio.WxAudioNative(l0Var.L(), l0Var.G(), l0Var.z());
        } else {
            wxAudioNativeInstallHelper.wxAudioNative = new com.tencent.mm.libwxaudio.WxAudioNative(l0Var.L(), l0Var.G(), 0L);
        }
        com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding InitCallBack ret:%d", java.lang.Integer.valueOf(wxAudioNativeInstallHelper.wxAudioNative.InitCallBack(this.f47581e)));
        com.tencent.mm.autogen.events.WxAudioStateEvent wxAudioStateEvent = new com.tencent.mm.autogen.events.WxAudioStateEvent();
        wxAudioStateEvent.f54993g.getClass();
        wxAudioStateEvent.e();
    }
}
