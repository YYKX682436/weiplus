package aq1;

/* loaded from: classes12.dex */
public final class j0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a25.n f94588d;

    public j0(a25.n nVar) {
        this.f94588d = nVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c data = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.LightPushServiceImpl", "on auto light push mode.");
        com.p314xaae8f345.mm.p642xad8b531f.e eVar = (com.p314xaae8f345.mm.p642xad8b531f.e) this.f94588d;
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "on Success.");
        eVar.f144859b.d(eVar.f144858a);
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void c(java.lang.Exception e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.proc.LightPushServiceImpl", e17, "onAutoLightPushMode onCaughtInvokeException: " + e17.getMessage(), new java.lang.Object[0]);
        com.p314xaae8f345.mm.p642xad8b531f.e eVar = (com.p314xaae8f345.mm.p642xad8b531f.e) this.f94588d;
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "on Failed.");
        eVar.f144859b.d(eVar.f144858a);
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.LightPushServiceImpl", "onAutoLightPushMode onBridgeNotFound");
        com.p314xaae8f345.mm.p642xad8b531f.e eVar = (com.p314xaae8f345.mm.p642xad8b531f.e) this.f94588d;
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "on Failed.");
        eVar.f144859b.d(eVar.f144858a);
    }
}
