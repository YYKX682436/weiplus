package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.webaudio.m f47584d;

    public l(com.tencent.luggage.sdk.jsapi.component.webaudio.m mVar) {
        this.f47584d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.luggage.sdk.jsapi.component.webaudio.m mVar = this.f47584d;
        if (mVar.f47586e.wxAudioNative != null) {
            com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "app enter fg, resume players if need");
            mVar.f47586e.wxAudioNative.forceResumeAllPlayer(false);
        }
    }
}
