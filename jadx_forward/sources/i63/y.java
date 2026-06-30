package i63;

/* loaded from: classes7.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i63.m0 f370573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i63.b0 f370574e;

    public y(i63.b0 b0Var, i63.m0 m0Var) {
        this.f370574e = b0Var;
        this.f370573d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        i63.b0 b0Var = this.f370574e;
        java.io.ObjectOutputStream objectOutputStream = b0Var.f370505e;
        if (objectOutputStream == null) {
            return;
        }
        try {
            objectOutputStream.writeUnshared(this.f370573d);
            b0Var.f370505e.reset();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameLiveAppbrandAudioMgrService", e17, "io exception, try reconnect", new java.lang.Object[0]);
            b0Var.Bi();
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433717w, null, 0, null, 14, null), p60.q.class, new i63.x(this));
        }
    }
}
