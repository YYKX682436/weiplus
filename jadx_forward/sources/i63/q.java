package i63;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.a f370552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i63.u f370553e;

    public q(i63.u uVar, dl3.a aVar) {
        this.f370553e = uVar;
        this.f370552d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i63.u uVar = this.f370553e;
        java.util.Map map = uVar.f370569a.f370509i;
        dl3.a aVar = this.f370552d;
        java.lang.Short valueOf = java.lang.Short.valueOf(aVar.f316802a);
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) ((p60.u) i95.n0.c(p60.u.class)).f433733d).mo141623x754a37bb()).booleanValue();
        short s17 = aVar.f316802a;
        ((java.util.HashMap) map).put(valueOf, new ua1.b(s17, booleanValue));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onStart sessionId: " + ((int) s17) + " audioType: " + aVar.f316803b + " audioId: " + aVar.f316804c + " streams: " + ((java.util.HashMap) uVar.f370569a.f370509i).size());
    }
}
