package yw4;

/* loaded from: classes.dex */
public final class r implements nw4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final yw4.r f548523b = new yw4.r();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f548524c = new java.util.HashMap();

    @Override // nw4.j
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.HashMap hashMap = (java.util.HashMap) f548524c;
        boolean containsKey = hashMap.containsKey(msg.f422552i);
        nw4.g gVar = env.f422396d;
        if (!containsKey) {
            gVar.e(msg.f422546c, "system:function_not_exist", null);
            return false;
        }
        java.lang.Object obj = hashMap.get(msg.f422552i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        qw4.a aVar = (qw4.a) obj;
        int b17 = aVar.b();
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = env.f422394b;
        if (c19775x58fd37b3 != null ? c19775x58fd37b3.f(b17) : false) {
            aVar.a(env, msg);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPrefetcherJsApiPool", "handleMsg access denied func: " + msg.f422552i);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.f422552i, "log")) {
            return true;
        }
        gVar.e(msg.f422546c, "system:access_denied", null);
        return true;
    }

    @Override // nw4.j
    public boolean b(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return (((java.util.HashMap) f548524c).isEmpty() ^ true) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(env.f422396d.g(), this);
    }

    @Override // nw4.j
    public qw4.a f(java.lang.String funcName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        return (qw4.a) ((java.util.HashMap) f548524c).get(funcName);
    }
}
