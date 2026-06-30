package c13;

/* loaded from: classes11.dex */
public final class a implements com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f119390d;

    public a(java.lang.String engineId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineId, "engineId");
        this.f119390d = engineId;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void I(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClearFlutterEngineOnShutdown", "onShutDown: " + z17 + ", engineId=" + this.f119390d);
        c13.b0.f119393d.c();
    }
}
