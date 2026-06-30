package vy3;

/* loaded from: classes.dex */
public final class x implements nw4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final vy3.x f523025b = new vy3.x();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f523026c;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f523026c = hashMap;
        jz5.g gVar = wy3.b.f532179a;
        java.util.Map jsApiList = (java.util.Map) ((jz5.n) wy3.b.f532179a).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiList, "jsApiList");
        hashMap.clear();
        hashMap.putAll(jsApiList);
    }

    @Override // nw4.j
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.Map map = f523026c;
        if (((java.util.HashMap) map).containsKey(msg.f422552i)) {
            java.lang.Object obj = ((java.util.HashMap) map).get(msg.f422552i);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            qw4.a aVar = (qw4.a) obj;
            if (aVar.b() == 10007) {
                aVar.a(env, msg);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanWebViewJsApiPool", "handleMsg access denied func: " + msg.f422552i);
                env.f422396d.e(msg.f422546c, "system:access_denied", null);
            }
        }
        return true;
    }

    @Override // nw4.j
    public boolean b(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return (((java.util.HashMap) f523026c).isEmpty() ^ true) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(env.f422396d.g(), this);
    }

    @Override // nw4.j
    public qw4.a f(java.lang.String funcName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        java.util.Map map = f523026c;
        if (((java.util.HashMap) map).containsKey(funcName)) {
            return (qw4.a) ((java.util.HashMap) map).get(funcName);
        }
        return null;
    }
}
