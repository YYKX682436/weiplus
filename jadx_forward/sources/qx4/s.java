package qx4;

/* loaded from: classes8.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx4.d0 f448976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448978f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qx4.d0 d0Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f448976d = d0Var;
        this.f448977e = str;
        this.f448978f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        qx4.b l17 = this.f448976d.l();
        if (l17 != null && (mo9090x86b9ebe3 = l17.mo9090x86b9ebe3()) != null) {
            java.lang.String funcName = this.f448977e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
            java.lang.String params = this.f448978f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", funcName, params);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{funcName, funcName, params}, 3));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f384359a;
    }
}
