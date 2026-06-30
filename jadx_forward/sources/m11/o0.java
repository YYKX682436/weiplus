package m11;

/* loaded from: classes12.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f404297a = new java.util.HashSet();

    public static boolean a(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgService", "remove Run %s", java.lang.Long.valueOf(j17));
        return ((java.util.HashSet) f404297a).remove(java.lang.Long.valueOf(j17));
    }

    public static void b(long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li;
        oi3.d dVar = new oi3.d();
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImgService", "setImgError, %d, stack = %s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(j17));
        if (C1.f404166a <= 0) {
            return;
        }
        m11.b0 z18 = m11.b1.Di().z1(C1.f404166a);
        if (z18 != null) {
            z18.D(-1);
            m11.b1.Di().F4(java.lang.Long.valueOf(z18.f404166a), z18);
            Li = pt0.f0.Li(z18.f404178m, z18.f404180o);
        } else {
            C1.D(-1);
            m11.b1.Di().F4(java.lang.Long.valueOf(j17), C1);
            Li = pt0.f0.Li(C1.f404178m, C1.f404180o);
        }
        if (Li.m124847x74d37ac6() == 0) {
            return;
        }
        long m124847x74d37ac6 = Li.m124847x74d37ac6();
        java.util.Map map = oi3.c.f427147a;
        oi3.c.f427147a.put(java.lang.Long.valueOf(m124847x74d37ac6), dVar);
        Li.r1(5);
        jx3.f.INSTANCE.mo68477x336bdfd8(111L, 31L, 1L, true);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb((int) Li.m124847x74d37ac6(), Li, true);
    }
}
