package iw3;

/* loaded from: classes.dex */
public final class f implements nw4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final iw3.f f376770b = new iw3.f();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f376771c = new java.util.HashMap();

    @Override // nw4.j
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.Map map = f376771c;
        if (((java.util.HashMap) map).containsKey(msg.f422552i)) {
            java.lang.Object obj = ((java.util.HashMap) map).get(msg.f422552i);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            qw4.a aVar = (qw4.a) obj;
            aVar.b();
            if (aVar.b() == 10004) {
                aVar.a(env, msg);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectTextJsApiPool", "handleMsg access denied func: " + msg.f422552i);
                env.f422396d.e(msg.f422546c, "system:access_denied", null);
            }
        }
        return true;
    }

    @Override // nw4.j
    public boolean b(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return (((java.util.HashMap) f376771c).isEmpty() ^ true) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(env.f422396d.g(), this);
    }

    @Override // nw4.j
    public qw4.a f(java.lang.String funcName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        java.util.Map map = f376771c;
        if (((java.util.HashMap) map).containsKey(funcName)) {
            return (qw4.a) ((java.util.HashMap) map).get(funcName);
        }
        return null;
    }
}
