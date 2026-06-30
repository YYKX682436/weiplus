package av4;

/* loaded from: classes8.dex */
public final class l extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.l f95832d = new av4.l();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.Map map = msg.f422323a;
        if (!map.containsKey("bizName") || !map.containsKey("bizKey")) {
            return false;
        }
        java.lang.Object obj = msg.f422323a.get("bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj;
        int i17 = (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "k1kVideo") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ya.a.f77450x918d59a8)) ? 30 : 27;
        java.lang.Object obj2 = msg.f422323a.get("bizKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str2 = msg.f422546c;
        java.lang.String str3 = msg.f422552i + ":ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        c16601x7ed0e40c.f66791xc8a07680 = (java.lang.String) obj2;
        c16601x7ed0e40c.f66793x2262335f = i17;
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).Ri(c16601x7ed0e40c) ? 1 : 0));
        env.f422396d.e(str2, str3, hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "isTaskMinimized";
    }
}
