package sl;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl.i f490558d;

    public h(sl.i iVar) {
        this.f490558d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sl.i iVar = this.f490558d;
        try {
            if (wo.v1.f529356c.f529140j == 1) {
                java.lang.Thread.sleep(300L);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion, intOnCompletion: %s, shouldPlayComplete: %s", iVar.f490559a.f490576p, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new sl.g(this));
            tl.h hVar = iVar.f490559a.f490561a;
            if (hVar != null) {
                hVar.b(null);
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoicePlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }
}
