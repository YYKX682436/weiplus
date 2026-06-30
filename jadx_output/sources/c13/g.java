package c13;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.flutter_voip.AudioRouteInfo f37879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cv.v0 f37880e;

    public g(com.tencent.pigeon.flutter_voip.AudioRouteInfo audioRouteInfo, cv.v0 v0Var) {
        this.f37879d = audioRouteInfo;
        this.f37880e = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onAudioOutputDeviceChanged(this.f37879d, new c13.c("callback onAudioOutputDeviceChanged(" + this.f37880e + ')'));
        }
    }
}
