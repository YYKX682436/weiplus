package ax;

/* loaded from: classes7.dex */
public final class b extends ax.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dq0.q mbPlugin) {
        super(mbPlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbPlugin, "mbPlugin");
    }

    @Override // ax.t, dq0.a0
    public void m(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        super.m(binding);
        ((cx.t1) ((bx.v) i95.n0.c(bx.v.class))).K6(1);
        this.f96492r = null;
    }

    @Override // dq0.a0
    public void v(fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        mq0.d1 d1Var = mq0.d1.f412079a;
        cx.w0 t17 = t();
        d1Var.d(frameSet, "MagicBrandService", t17 != null ? t17.C : false);
    }

    @Override // dq0.a0
    public void w(fq0.x frameSet, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        super.w(frameSet, jSONObject);
        mq0.d1 d1Var = mq0.d1.f412079a;
        cx.w0 t17 = t();
        d1Var.e(frameSet, "MagicBrandService", t17 != null ? t17.C : false, yw.x0.f548033a.a(), jSONObject);
    }

    @Override // ax.t
    public bx.t y() {
        i95.m c17 = i95.n0.c(bx.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return (bx.t) c17;
    }
}
