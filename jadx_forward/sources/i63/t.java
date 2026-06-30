package i63;

/* loaded from: classes7.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.a f370567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i63.u f370568e;

    public t(i63.u uVar, dl3.a aVar) {
        this.f370568e = uVar;
        this.f370567d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hilive] AbstractAudioOutputListener onStop sessionId: ");
        dl3.a aVar = this.f370567d;
        sb6.append((int) aVar.f316802a);
        sb6.append(" audioType: ");
        sb6.append(aVar.f316803b);
        sb6.append(" audioId: ");
        sb6.append(aVar.f316804c);
        sb6.append(" streams: ");
        i63.u uVar = this.f370568e;
        sb6.append(((java.util.HashMap) uVar.f370569a.f370509i).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", sb6.toString());
        ua1.b bVar = (ua1.b) ((java.util.HashMap) uVar.f370569a.f370509i).remove(java.lang.Short.valueOf(aVar.f316802a));
        if (bVar != null) {
            bVar.c();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onStop, not found sessionId: " + ((int) aVar.f316802a) + " audioType: " + aVar.f316803b + " audioId: " + aVar.f316804c + " streams: " + ((java.util.HashMap) uVar.f370569a.f370509i).size());
    }
}
