package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class qt extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.qt f208980d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.qt();

    public qt() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_DISPLAY_AUTO_PLAY_TIPS_TIME_LONG_SYNC, 0L);
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ((cq.k) c17).f302759g.f323818b;
        if (o4Var != null) {
            o4Var.B("KEY_FINDER_ENABLE_AUTO_SCROLL_COUNT", 0L);
        }
        if (activity != null) {
            db5.t7.m123883x26a183b(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f384359a;
    }
}
