package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public class i implements com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f47577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f47578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper f47579c;

    public i(com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper, java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f47579c = wxAudioNativeInstallHelper;
        this.f47577a = weakReference;
        this.f47578b = lVar;
    }

    @Override // com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface
    public java.lang.String getFilePath(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "getFilePath src:%s", str);
        boolean equals = com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface.KEY_GET_FILE_PATH_CACHE_DIR.equals(str);
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f47578b;
        if (equals) {
            te.b bVar = (te.b) lVar.q(te.b.class);
            return bVar != null ? ((te.a) bVar).f417764d : "";
        }
        if (str.startsWith("file://")) {
            java.lang.String substring = str.substring(7);
            com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "filePath:%s", substring);
            return substring;
        }
        if (str.contains("base64") && str.startsWith("data:audio")) {
            java.lang.String b17 = jh1.d.b(str.substring(str.indexOf("base64,") + 7).trim());
            com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "base64 decode filePath:%s", b17);
            return b17;
        }
        if (!str.startsWith("wxblob://")) {
            return (str.startsWith("http://") || str.startsWith("https://")) ? str : jh1.d.a(lVar, str);
        }
        com.tencent.mm.vfs.r6 privateAbsoluteFile = lVar.getFileSystem().getPrivateAbsoluteFile(str);
        if (privateAbsoluteFile != null && privateAbsoluteFile.m()) {
            return privateAbsoluteFile.o();
        }
        com.tencent.mars.xlog.Log.e("Luggage.WxAudioNativeInstallHelper", "wxblob localFile is null");
        return str;
    }

    @Override // com.tencent.mm.libwxaudio.WxAudioNative.NativeCallBackInterface
    public void onCallBack(long j17, java.lang.String str) {
        ((com.tencent.mm.plugin.appbrand.jsruntime.f0) this.f47577a.get()).post(new com.tencent.luggage.sdk.jsapi.component.webaudio.h(this, str, j17));
    }
}
