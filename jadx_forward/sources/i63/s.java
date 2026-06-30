package i63;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.a f370561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f370562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f370563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f370564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float[] f370565h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i63.u f370566i;

    public s(i63.u uVar, dl3.a aVar, int i17, int i18, int i19, float[] fArr) {
        this.f370566i = uVar;
        this.f370561d = aVar;
        this.f370562e = i17;
        this.f370563f = i18;
        this.f370564g = i19;
        this.f370565h = fArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f370566i.f370569a.f370509i;
        dl3.a aVar = this.f370561d;
        ua1.b bVar = (ua1.b) ((java.util.HashMap) map).get(java.lang.Short.valueOf(aVar.f316802a));
        float[] fArr = this.f370565h;
        int i17 = this.f370564g;
        int i18 = this.f370563f;
        if (bVar != null) {
            bVar.e((short) i18, i17, fArr);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onOutput failed, sessionId: " + ((int) aVar.f316802a) + " audioType: " + aVar.f316803b + " audioId: " + aVar.f316804c + " format: " + this.f370562e + " channel: " + i18 + " samplerate: " + i17 + " size: " + fArr.length);
    }
}
