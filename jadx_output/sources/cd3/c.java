package cd3;

/* loaded from: classes7.dex */
public final class c extends dq0.a0 implements jc3.r {

    /* renamed from: r, reason: collision with root package name */
    public final oe3.c f40657r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dq0.q mbPlugin) {
        super(mbPlugin);
        kotlin.jvm.internal.o.g(mbPlugin, "mbPlugin");
        this.f40657r = new oe3.c();
    }

    @Override // dq0.a0
    public java.util.Map j() {
        return kz5.c1.m(this.f242298q, kz5.c1.k(new jz5.l("testFailed", new cd3.a(this)), new jz5.l("testOk", new cd3.b(this))));
    }

    @Override // dq0.a0
    public void m(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        super.m(binding);
        this.f40657r.destroy();
    }

    @Override // dq0.a0, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        super.onAttachedToEngine(binding);
        this.f40657r.start();
    }

    @Override // dq0.a0
    public hq0.i0 t() {
        return this.f40657r;
    }
}
