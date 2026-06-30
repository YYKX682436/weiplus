package i63;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.a f370554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f370555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f370556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f370557g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f370558h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f370559i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i63.u f370560m;

    public r(i63.u uVar, dl3.a aVar, int i17, int i18, int i19, byte[] bArr, long j17) {
        this.f370560m = uVar;
        this.f370554d = aVar;
        this.f370555e = i17;
        this.f370556f = i18;
        this.f370557g = i19;
        this.f370558h = bArr;
        this.f370559i = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f370560m.f370569a.f370509i;
        dl3.a aVar = this.f370554d;
        ua1.b bVar = (ua1.b) ((java.util.HashMap) map).get(java.lang.Short.valueOf(aVar.f316802a));
        int i17 = this.f370556f;
        if (bVar != null) {
            bVar.d((short) i17, this.f370557g, this.f370558h, this.f370559i);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onOutput failed, sessionId: " + ((int) aVar.f316802a) + " audioType: " + aVar.f316803b + " audioId: " + aVar.f316804c + " format: " + this.f370555e + " channel: " + i17 + " samplerate: " + this.f370557g + " size: " + this.f370558h.length);
    }
}
