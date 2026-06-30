package st2;

/* loaded from: classes3.dex */
public final class f2 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f493821b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f493822c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f493823d;

    /* renamed from: a, reason: collision with root package name */
    public static final st2.f2 f493820a = new st2.f2();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f493824e = jz5.h.b(st2.d2.f493793d);

    public static void d(st2.f2 f2Var, gk2.e eVar, l81.b1 bundle, boolean z17, int i17, java.lang.Object obj) {
        f2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bundle.f398547b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", "[tryToPreRender] fail, appId is empty!");
            return;
        }
        boolean wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).wi(bundle.f398547b, zl2.q4.f555466a.x());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", "[tryToPreRender] hasInstance:" + wi6 + ",appId:" + bundle.f398547b + ",patch:" + bundle.f398555f);
        if (wi6) {
            return;
        }
        f2Var.b(eVar, bundle);
    }

    public final void a(gk2.e eVar) {
        java.util.LinkedList<r45.ue2> m75941xfb821914;
        r45.dv1 dv1Var;
        zl2.r4 r4Var = zl2.r4.f555483a;
        r45.ve2 ve2Var = (eVar == null || (dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).f410571n) == null) ? null : (r45.ve2) dv1Var.m75936x14adae67(5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        if (ve2Var != null && (m75941xfb821914 = ve2Var.m75941xfb821914(1)) != null) {
            for (r45.ue2 ue2Var : m75941xfb821914) {
                l81.b1 b1Var = new l81.b1();
                b1Var.f398547b = ue2Var.m75945x2fec8307(0);
                b1Var.f398555f = ue2Var.m75945x2fec8307(2);
                dk2.ah ahVar = new dk2.ah();
                if (ue2Var.m75933x41a8a7f2(1)) {
                    ahVar.f314755r = 1;
                } else if (ue2Var.m75933x41a8a7f2(3)) {
                    ahVar.f314755r = 2;
                } else if (ue2Var.m75933x41a8a7f2(4)) {
                    ahVar.f314755r = 3;
                }
                ahVar.f314746f = 1;
                b1Var.f398561i = ahVar;
                b1Var.f398565k = zl2.r4.f555483a.w1() ? 1176 : 1177;
                b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, 10, null, false, null, false, null, null, false, ue2Var.m75939xb282bd08(5) == 1, null, null, false, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -516, 2047, null);
                b1Var.f398549c = zl2.q4.f555466a.x();
                arrayList.add(b1Var);
            }
        }
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            l81.b1 b1Var2 = (l81.b1) obj;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var2.f398547b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", "[checkPreRender] index:" + i17 + " fail, appId:" + b1Var2.f398547b);
                return;
            }
            boolean wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).wi(b1Var2.f398547b, zl2.q4.f555466a.x());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", "[checkPreRender] index:" + i17 + " hasInstance:" + wi6 + ",appId:" + b1Var2.f398547b + ",patch:" + b1Var2.f398555f);
            if (!wi6) {
                f493820a.b(eVar, b1Var2);
            }
            i17 = i18;
        }
    }

    public final void b(gk2.e eVar, l81.b1 b1Var) {
        l81.p0 p0Var = b1Var.f398561i;
        dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        java.lang.Integer valueOf = ahVar != null ? java.lang.Integer.valueOf(ahVar.f314755r) : null;
        if (valueOf == null || valueOf.intValue() != 1) {
            if (valueOf != null && valueOf.intValue() == 2) {
                c(b1Var);
                return;
            }
            if (valueOf != null && valueOf.intValue() == 3) {
                c(b1Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", "[prepareEnv]");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Yf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170366x);
                f493821b = true;
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[preRender] performanceLevel:");
        sb6.append(((java.lang.Number) ((jz5.n) f493824e).mo141623x754a37bb()).intValue());
        sb6.append(",appId:");
        sb6.append(b1Var.f398547b);
        sb6.append(",patch:");
        sb6.append(b1Var.f398555f);
        sb6.append(",type:");
        zl2.q4 q4Var = zl2.q4.f555466a;
        sb6.append(q4Var.x());
        sb6.append(",preloadIfFail:false");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f398547b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f398555f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", "[preRender] fail, stack:" + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        } else {
            b1Var.f398549c = q4Var.x();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            f493823d = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).ij(b1Var, new st2.e2(eVar, b1Var, currentTimeMillis, false));
        }
    }

    public final void c(l81.b1 b1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", "[preloadPkg],username:" + b1Var.f398545a + ",appId:" + b1Var.f398547b + ",path:" + b1Var.f398555f);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f398545a) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f398547b)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).z8(b1Var.f398545a, b1Var.f398547b, 4);
            f493822c = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniProgramPreloadHelper", "[preloadPkg] fail, stack:" + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
    }
}
