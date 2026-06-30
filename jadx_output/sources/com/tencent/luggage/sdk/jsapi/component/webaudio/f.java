package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface f47573a;

    public f(com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface nativeCallBackInterface, com.tencent.mm.plugin.appbrand.jsruntime.y lifecycleOwner) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f47573a = nativeCallBackInterface;
        lifecycleOwner.r(new com.tencent.luggage.sdk.jsapi.component.webaudio.e(this));
    }

    @Override // com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface
    public java.lang.String getFilePath(java.lang.String str) {
        com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface nativeCallBackInterface = this.f47573a;
        java.lang.String filePath = nativeCallBackInterface != null ? nativeCallBackInterface.getFilePath(str) : null;
        return filePath == null ? str == null ? "" : str : filePath;
    }

    @Override // com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface
    public void onCallBack(long j17, java.lang.String str) {
        com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface nativeCallBackInterface = this.f47573a;
        if (nativeCallBackInterface != null) {
            nativeCallBackInterface.onCallBack(j17, str);
        }
    }
}
