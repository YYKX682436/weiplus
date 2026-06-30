package gr3;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final gr3.k f356422a = new gr3.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f356423b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f356424c = "";

    public final void a(java.lang.String eventId, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        boolean z17 = false;
        if (!(str == null)) {
            if (!(z3Var == null)) {
                z17 = c01.e2.E(str);
            }
        }
        if (z17) {
            b(eventId, str, z3Var);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(i17, eventId, f356423b, 32204);
        }
    }

    public final void b(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (f356424c.length() == 0) {
            f356424c = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        java.util.Map map = f356423b;
        ((java.util.LinkedHashMap) map).clear();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        map.put("relation_sessionid", f356424c);
        java.lang.String d17 = n17.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        map.put("chatroom_username", d17);
        if (z3Var == null || z3Var.d1() == null) {
            return;
        }
        java.lang.String d18 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
        map.put("target_username", d18);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1())) {
            map.put("target_user_role", 2);
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.O4(z3Var.d1())) {
            map.put("target_user_role", 1);
        } else {
            map.put("target_user_role", 0);
        }
    }

    public final void c(java.lang.String eventId, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String viewId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        boolean z17 = false;
        if (!(str == null)) {
            if (!(z3Var == null)) {
                z17 = c01.e2.E(str);
            }
        }
        if (z17) {
            b(eventId, str, z3Var);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, eventId, f356423b, 32204);
        }
    }
}
