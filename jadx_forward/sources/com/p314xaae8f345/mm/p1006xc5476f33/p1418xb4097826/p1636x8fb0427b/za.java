package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class za extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.za f209975d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.za();

    public za() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        if (activity != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("次数: ");
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ((cq.k) c17).f302759g.f323818b;
            sb6.append(o4Var != null ? o4Var.q("KEY_FINDER_ENABLE_AUTO_SCROLL_COUNT", 0L) : 0L);
            db5.t7.m123883x26a183b(activity, sb6.toString(), 1).show();
        }
        return jz5.f0.f384359a;
    }
}
