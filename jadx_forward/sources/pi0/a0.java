package pi0;

/* loaded from: classes11.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final pi0.a0 f436047a = new pi0.a0();

    public final pi0.m1 a(java.lang.String plugin, java.lang.String routeName, java.util.Map map, boolean z17, java.lang.String entryPoint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(routeName, "routeName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryPoint, "entryPoint");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = new java.util.HashMap();
        pi0.m1 m1Var = new pi0.m1(plugin, entryPoint, routeName, hashMap);
        pi0.r.f436250a.d(m1Var);
        io.p3284xd2ae381c.Log.i("MicroMsg.FlutterRouteCreator", "setupRouteInfo, cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        if (map != null) {
            hashMap.putAll(map);
        }
        m1Var.f436206i = z17;
        m1Var.f436205h = true;
        return m1Var;
    }
}
