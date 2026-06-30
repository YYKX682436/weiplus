package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502;

/* loaded from: classes7.dex */
public class p implements com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeAudioPcmCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd f129123a;

    public p(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd) {
        this.f129123a = c3932x19b83abd;
    }

    @Override // com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeAudioPcmCallback
    /* renamed from: onPcmCallback */
    public void mo32202xd3bd43e0(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27) {
        dl3.b bVar;
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        dl3.b bVar2;
        dl3.a aVar;
        dl3.b bVar3;
        java.util.Map map4;
        bVar = this.f129123a.f15696x2ab3b89e;
        if (bVar == null) {
            return;
        }
        map = this.f129123a.f15699xd5db014b;
        synchronized (map) {
            map2 = this.f129123a.f15699xd5db014b;
            if (map2.containsKey(str)) {
                map4 = this.f129123a.f15699xd5db014b;
                aVar = (dl3.a) map4.get(str);
            } else {
                dl3.a aVar2 = new dl3.a(3, "wx_webaudio_mix_audio_buffer_" + str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxAudioNativeInstallHelper", "create new session: %s", str);
                map3 = this.f129123a.f15699xd5db014b;
                map3.put(str, aVar2);
                bVar2 = this.f129123a.f15696x2ab3b89e;
                bVar2.c(aVar2);
                aVar = aVar2;
            }
        }
        bVar3 = this.f129123a.f15696x2ab3b89e;
        bVar3.a(aVar, 1, i18, i19, bArr);
    }
}
