package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes7.dex */
public final class g3 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f280609e = "";

    /* renamed from: f, reason: collision with root package name */
    public static long f280610f;

    static {
        new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e3(null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.O4(this.f280113d.x()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.f280113d.x())) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f3(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        f280609e = this.f280113d.x();
        f280610f = c01.id.c() / 1000;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("normsg_last_resume_userinfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        M.putString("last_resume_user_string", f280609e);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("normsg_last_resume_userinfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M2, "getMMKV(...)");
        M2.putLong("last_resume_user_ts_long", f280610f);
    }
}
