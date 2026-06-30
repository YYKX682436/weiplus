package ax;

/* loaded from: classes7.dex */
public final class a extends ax.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dq0.q mbPlugin) {
        super(mbPlugin);
        kotlin.jvm.internal.o.g(mbPlugin, "mbPlugin");
    }

    @Override // ax.t, dq0.a0
    public void m(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        super.m(binding);
        mq0.d1 d1Var = mq0.d1.f330546a;
        mq0.d1.f330550e.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandReporter", "resetInBoxData");
        ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).K6(1);
        this.f14959r = null;
    }

    @Override // dq0.a0
    public void v(fq0.x frameSet) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        mq0.d1 d1Var = mq0.d1.f330546a;
        cx.w0 t17 = t();
        d1Var.d(frameSet, "MagicAdBrandService", t17 != null ? t17.C : false);
    }

    @Override // dq0.a0
    public void w(fq0.x frameSet, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        super.w(frameSet, jSONObject);
        mq0.d1 d1Var = mq0.d1.f330546a;
        cx.w0 t17 = t();
        d1Var.e(frameSet, "MagicAdBrandService", t17 != null ? t17.C : false, yw.x0.f466500a.a(), jSONObject);
    }

    @Override // ax.t
    public bx.t y() {
        i95.m c17 = i95.n0.c(bx.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return (bx.t) c17;
    }
}
