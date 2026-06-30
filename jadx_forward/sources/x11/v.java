package x11;

/* loaded from: classes12.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x11.t f532944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x11.w f532945e;

    public v(x11.t tVar, x11.w wVar) {
        this.f532944d = tVar;
        this.f532945e = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "postToWorker callback onSceneEnd");
        x11.t tVar = this.f532944d;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = tVar.f532927h;
        x11.w wVar = this.f532945e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(wVar.f532947b, wVar.f532948c, wVar.f532949d, wVar.f532950e);
        }
        wVar.f532946a.c(wVar.f532947b, wVar.f532948c, tVar.f532930n, tVar.f532924e);
        p01.f.f431897a.b();
        t4.a.b("NewInitAll", 10086);
    }
}
