package aq1;

/* loaded from: classes12.dex */
public final class j0 implements com.tencent.mm.ipcinvoker.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a25.n f13055d;

    public j0(a25.n nVar) {
        this.f13055d = nVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean data = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "on auto light push mode.");
        com.tencent.mm.booter.e eVar = (com.tencent.mm.booter.e) this.f13055d;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "on Success.");
        eVar.f63326b.d(eVar.f63325a);
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void c(java.lang.Exception e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.proc.LightPushServiceImpl", e17, "onAutoLightPushMode onCaughtInvokeException: " + e17.getMessage(), new java.lang.Object[0]);
        com.tencent.mm.booter.e eVar = (com.tencent.mm.booter.e) this.f13055d;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "on Failed.");
        eVar.f63326b.d(eVar.f63325a);
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "onAutoLightPushMode onBridgeNotFound");
        com.tencent.mm.booter.e eVar = (com.tencent.mm.booter.e) this.f13055d;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "on Failed.");
        eVar.f63326b.d(eVar.f63325a);
    }
}
