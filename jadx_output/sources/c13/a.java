package c13;

/* loaded from: classes11.dex */
public final class a implements com.tencent.mm.plugin.voip.model.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f37857d;

    public a(java.lang.String engineId) {
        kotlin.jvm.internal.o.g(engineId, "engineId");
        this.f37857d = engineId;
    }

    @Override // com.tencent.mm.plugin.voip.model.k3
    public void I(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ClearFlutterEngineOnShutdown", "onShutDown: " + z17 + ", engineId=" + this.f37857d);
        c13.b0.f37860d.c();
    }
}
