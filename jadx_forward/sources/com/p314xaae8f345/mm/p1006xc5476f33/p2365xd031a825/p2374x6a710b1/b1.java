package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static long f262386a;

    public static java.lang.String a(int i17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("EnterScene", i17);
            return jSONObject.toString();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static void b(android.app.Activity activity, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10932, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
    }

    public static void c(android.app.Activity activity, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05, int i17) {
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() || c19760x34448d56 == null || c19099x8d444f05 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10725, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c19760x34448d56.f273642e), java.lang.Integer.valueOf((int) (c19099x8d444f05.f261211h * 100.0d)), c19099x8d444f05.f261214m);
    }

    public static void d(android.app.Activity activity, android.os.Bundle bundle, int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(activity);
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() || g17 == null || !g17.s()) {
            if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() || bundle == null || !bundle.getBoolean("key_is_bind_reg_process", false)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10932, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bundle.getInt("key_bind_scene", 0)));
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) bundle.getParcelable("key_pay_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) bundle.getParcelable("key_orders");
        if (c19760x34448d56 == null || c19099x8d444f05 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10725, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c19760x34448d56.f273642e), java.lang.Integer.valueOf((int) (c19099x8d444f05.f261211h * 100.0d)), c19099x8d444f05.f261214m);
    }

    public static void e() {
        f262386a = java.lang.System.currentTimeMillis();
    }
}
