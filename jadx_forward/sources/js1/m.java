package js1;

/* loaded from: classes7.dex */
public final class m implements zq1.f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f383025d = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));

    public void a(java.util.HashMap hashMap, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 c12966xaa8af0d6) {
        if (hashMap == null || c12966xaa8af0d6 == null) {
            return;
        }
        hashMap.put("h5auth", java.lang.Integer.valueOf(c12966xaa8af0d6.f175462g ? 1 : 0));
        hashMap.put("retry", java.lang.Integer.valueOf(c12966xaa8af0d6.f175463h ? 1 : 0));
    }

    public java.lang.String b(java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            return null;
        }
        java.lang.String PROCESS_PUSH = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_PUSH, "PROCESS_PUSH");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.f.b(PROCESS_PUSH, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), new js1.d());
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferRequestServiceImpl", "getTransferDebugIPSync key: %s, result: %s", objArr);
        if (c10756x2a5d7b2d != null) {
            return c10756x2a5d7b2d.f149939d;
        }
        return null;
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2, zq1.g0 g0Var) {
        if (c12965xc9712d2 == null) {
            if (g0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 c12966xaa8af0d6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6();
                c12966xaa8af0d6.f175459d = 1;
                c12966xaa8af0d6.f175460e = "invalid requestInfo";
                g0Var.b(c12966xaa8af0d6);
                return;
            }
            return;
        }
        if (g0Var != null && g0Var.a(c12965xc9712d2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TransferRequestServiceImpl", "transferRequest intercepted");
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                p3325xe03a0797.p3326xc267989b.l.d(f383025d, null, null, new js1.h(c12965xc9712d2, g0Var, null), 3, null);
                return;
            }
            java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, c12965xc9712d2, new js1.k(), new js1.l(g0Var));
        }
    }
}
