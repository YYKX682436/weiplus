package gc0;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final gc0.f0 f351700a = new gc0.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f351701b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(20);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f351702c = jz5.h.b(gc0.d0.f351655d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f351703d = jz5.h.b(gc0.e0.f351673d);

    public final r45.nl5 a(java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.lang.Object mo141623x754a37bb = ((jz5.n) f351702c).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        byte[] j17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).j(talker);
        r45.nl5 nl5Var = new r45.nl5();
        try {
            nl5Var.mo11468x92b714fd(j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RecommendRemarkCache", th6, "getChattingRecommendRemarkSysTipsData err", new java.lang.Object[0]);
        }
        return nl5Var;
    }

    public final r45.ml5 b(java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20638x1ed56714());
        if (h17 == 1) {
            r45.ml5 ml5Var = new r45.ml5();
            ml5Var.set(3, java.lang.Long.valueOf((c01.id.c() - ((j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20632x7f01de68()) * 60) * 1000)) + 10000));
            ml5Var.set(1, new java.util.LinkedList());
            ml5Var.set(0, new java.util.LinkedList());
            ml5Var.set(2, null);
            return ml5Var;
        }
        byte[] j17 = c().j(talker);
        r45.ml5 ml5Var2 = new r45.ml5();
        try {
            ml5Var2.m75932x347fbd55(j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RecommendRemarkCache", th6, "getShownData err", new java.lang.Object[0]);
        }
        if (h17 == 2) {
            ml5Var2.set(3, java.lang.Long.valueOf((c01.id.c() - ((j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20632x7f01de68()) * 60) * 1000)) + 10000));
        }
        return ml5Var2;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f351703d).mo141623x754a37bb();
    }

    public final void d(java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.lang.Object mo141623x754a37bb = ((jz5.n) f351702c).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).remove(talker);
    }

    public final void e(java.lang.String talker, long j17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        r45.ml5 b17 = b(talker);
        b17.set(3, java.lang.Long.valueOf(j17));
        b17.m75941xfb821914(1).clear();
        b17.m75941xfb821914(5).clear();
        b17.m75941xfb821914(0).clear();
        b17.m75941xfb821914(4).clear();
        b17.set(2, "");
        if (list != null) {
            b17.m75941xfb821914(6).addAll(list);
        }
        c().H(talker, b17.mo14344x5f01b1f6());
    }
}
