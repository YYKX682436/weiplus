package i63;

/* loaded from: classes7.dex */
public class x implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i63.y f370572d;

    public x(i63.y yVar) {
        this.f370572d = yVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        i63.b0 b0Var;
        android.net.LocalSocket accept;
        i63.y yVar = this.f370572d;
        try {
            i63.b0 b0Var2 = yVar.f370574e;
            b0Var = yVar.f370574e;
            b0Var2.f370505e.close();
            b0Var.f370508h.close();
            b0Var.f370508h = new android.net.LocalServerSocket(b0Var.f370521x);
            accept = b0Var.f370508h.accept();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "vira: retry got client");
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameLiveAppbrandAudioMgrService", e17, "io exception again", new java.lang.Object[0]);
        }
        if (b0Var.f370506f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameLiveAppbrandAudioMgrService", "handle is null!");
        } else {
            b0Var.f370505e = new java.io.ObjectOutputStream(accept.getOutputStream());
            yVar.f370574e.Di();
        }
    }
}
