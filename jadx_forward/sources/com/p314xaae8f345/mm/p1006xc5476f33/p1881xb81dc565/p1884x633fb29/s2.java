package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes5.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s2 f231663d = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s2();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t2.f231670b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        java.lang.String string = M.getString("mmkv_multitalk_status", "");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, "")) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t2.f231670b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M2, "getMMKV(...)");
        M2.remove("mmkv_multitalk_status");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t2.f231670b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M3, "getMMKV(...)");
        M3.remove("mmkv_multitalk_status_notAllowRecovery");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t2.f231670b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M4, "getMMKV(...)");
        M4.remove("mmkv_multitalk_member_list");
        org.json.JSONObject jSONObject = new org.json.JSONObject(string);
        java.lang.String optString = jSONObject.optString("wxGroupId");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t2.f231670b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M5, "getMMKV(...)");
        M5.putString("mmkv_last_crash_roomId", jSONObject.optString("roomId"));
        boolean z17 = jSONObject.optInt("mmkv_multitalk_member_list") == 1;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_multitalk_show_exit_reason_tips, true)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.m124850x7650bebc(64);
            f9Var.e1(java.lang.System.currentTimeMillis());
            f9Var.r1(6);
            f9Var.d1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.lrn : com.p314xaae8f345.mm.R.C30867xcad56011.lro));
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
            if (c01.v1.x(optString, false)) {
                f9Var.u1(optString);
                f9Var.d1(f9Var.j());
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
            }
        }
    }
}
