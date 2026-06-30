package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper f47587d;

    public n(com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper) {
        this.f47587d = wxAudioNativeInstallHelper;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f47587d) {
            if (this.f47587d.wxAudioNative != null) {
                com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "DestroyTask destroy wxAudioNative");
                this.f47587d.wxAudioNative.destroyWebAudioContext();
                this.f47587d.wxAudioNative = null;
            } else {
                com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "DestroyTask wxAudioNative is null");
            }
        }
    }
}
