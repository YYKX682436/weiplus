package dq0;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dq0.a0 f323872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(dq0.a0 a0Var) {
        super(0);
        this.f323872d = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hq0.k0 k0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onDestroy");
        dq0.a0 a0Var = this.f323872d;
        hq0.i0 t17 = a0Var.t();
        if (t17 != null && (k0Var = t17.f364531m) != null) {
            java.util.Collection values = k0Var.f364561a.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.Iterator it = kz5.n0.S0(values).iterator();
            while (it.hasNext()) {
                a0Var.q((hq0.j0) it.next());
            }
        }
        return jz5.f0.f384359a;
    }
}
