package av4;

/* loaded from: classes.dex */
public final class g0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.g0 f95820d = new av4.g0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.Map map = msg.f422323a;
        if (!map.containsKey("bizName") || !map.containsKey("bizKey")) {
            return false;
        }
        java.lang.Object obj = msg.f422323a.get("bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        zv4.g gVar = zv4.h.f557994a;
        int b18 = gVar.b((java.lang.String) obj);
        java.lang.Object obj2 = msg.f422323a.get("bizKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj2;
        gVar.f(b18, str, env.f422393a);
        if (b18 == 30 && (b17 = env.b()) != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("bizKey", str);
            b17.mo70207xf5bc2045(163, bundle);
        }
        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", new java.util.HashMap());
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "removeMinimizeTask";
    }
}
