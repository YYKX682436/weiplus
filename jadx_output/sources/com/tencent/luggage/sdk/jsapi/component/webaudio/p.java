package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public class p implements com.tencent.mm.libwxaudio.WxAudioNative.NativeAudioPcmCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper f47590a;

    public p(com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper) {
        this.f47590a = wxAudioNativeInstallHelper;
    }

    @Override // com.tencent.mm.libwxaudio.WxAudioNative.NativeAudioPcmCallback
    public void onPcmCallback(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27) {
        dl3.b bVar;
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        dl3.b bVar2;
        dl3.a aVar;
        dl3.b bVar3;
        java.util.Map map4;
        bVar = this.f47590a.mAudioOutputListener;
        if (bVar == null) {
            return;
        }
        map = this.f47590a.sessionIdMap;
        synchronized (map) {
            map2 = this.f47590a.sessionIdMap;
            if (map2.containsKey(str)) {
                map4 = this.f47590a.sessionIdMap;
                aVar = (dl3.a) map4.get(str);
            } else {
                dl3.a aVar2 = new dl3.a(3, "wx_webaudio_mix_audio_buffer_" + str);
                com.tencent.mars.xlog.Log.i("Luggage.WxAudioNativeInstallHelper", "create new session: %s", str);
                map3 = this.f47590a.sessionIdMap;
                map3.put(str, aVar2);
                bVar2 = this.f47590a.mAudioOutputListener;
                bVar2.c(aVar2);
                aVar = aVar2;
            }
        }
        bVar3 = this.f47590a.mAudioOutputListener;
        bVar3.a(aVar, 1, i18, i19, bArr);
    }
}
