package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z f253359a = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f253360b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.y.f253358d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f253361c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f253362d;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        sb6.append(str);
        sb6.append("stepcounter.cfg");
        f253361c = sb6.toString();
        f253362d = str + "PUSH_stepcounter.cfg";
    }

    public final long a(java.lang.String key, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return c().q(key, j17);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.x b() {
        java.lang.String u17 = c().u("KEY_STEP_DETAIL_INFO", "");
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.x();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
        xVar.a(u17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportKvStorage", "getSportDetailInfo detailInfo:".concat(u17));
        return xVar;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f253360b).mo141623x754a37bb();
    }

    public final void d(java.lang.String key, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        c().B(key, j17);
    }

    public final void e(java.lang.String key, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        c().D(key, value);
    }
}
