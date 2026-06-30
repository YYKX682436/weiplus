package c13;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f37886d;

    public k(java.util.List list) {
        this.f37886d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onExternalAudioOutputDeviceChanged(this.f37886d, new c13.c("callback onExternalAudioOutputDeviceChanged"));
        }
    }
}
