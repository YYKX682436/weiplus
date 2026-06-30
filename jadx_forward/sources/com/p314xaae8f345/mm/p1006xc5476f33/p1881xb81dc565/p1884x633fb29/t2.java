package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes5.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t2 f231669a = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t2();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f231670b = "mmkv_multitalk_status_monitor";

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f231670b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return M;
    }

    public final void b() {
        if (a().getInt("mmkv_multitalk_status_notAllowRecovery", 0) == 1) {
            return;
        }
        a().remove("mmkv_multitalk_status");
        a().remove("mmkv_multitalk_status_notAllowRecovery");
        a().remove("mmkv_multitalk_member_list");
    }
}
