package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.webaudio.m f47583d;

    public k(com.tencent.luggage.sdk.jsapi.component.webaudio.m mVar) {
        this.f47583d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.luggage.sdk.jsapi.component.webaudio.m mVar = this.f47583d;
        if (mVar.f47586e.wxAudioNative != null) {
            com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "app enter suspend, pause all players");
            mVar.f47586e.wxAudioNative.forcePauseAllPlayer(false);
        }
    }
}
