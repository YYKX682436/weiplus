package m91;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final m91.j f406488a = new m91.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f406489b = new java.util.concurrent.ConcurrentSkipListSet(m91.h.f406487d);

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f406490c = {31, 34, 37};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f406491d = {32, 35, 38};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f406492e = {33, 36, 39};

    public final void a(int[] iArr) {
        int i17;
        java.util.ArrayList<com.p314xaae8f345.p542x3306d5.smc.C4582x424c344> arrayList = new java.util.ArrayList();
        arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(365, iArr[0], 1));
        m91.f fVar = m91.f.f406484a;
        java.util.LinkedHashMap linkedHashMap = m91.f.f406486c;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                java.util.Set keySet = linkedHashMap.keySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
                i17 = ((m91.c) kz5.n0.h0(keySet)).f406480h;
            } else {
                i17 = -1;
            }
        }
        if (i17 == 4) {
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(365, iArr[2], 1));
        } else if (i17 >= 0) {
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(365, iArr[1], 1));
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            for (com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 : arrayList) {
                c4582x424c344.m40327x4182ad1();
                c4582x424c344.m40328x7eed3b49();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, false, false);
    }

    public final void b() {
        java.util.Iterator it = f406489b.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.h1) ((m91.g) it.next());
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7040xd8bd499e b17 = h1Var.b();
            b17.f143571m = 1L;
            b17.f143572n = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? 2L : 1L;
            h1Var.c(b17, h1Var.a());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = h1Var.f169732a.x0();
            java.lang.String m52170xad58292c = x07 != null ? x07.m52170xad58292c() : null;
            if (m52170xad58292c == null) {
                m52170xad58292c = "";
            }
            b17.f143579u = b17.b("QualityIssueHappenPagePath", u46.l.t(fp.s0.a(m52170xad58292c), 0, 1024), true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.QualityRuntimeErrorContextReporter", "report 25465 " + b17.n());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.p(25465, b17.m(), true, true, true);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d.f169357a;
                java.lang.String m17 = b17.m();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "toRptValue(...)");
                dVar.c(25465, 1, true, true, true, m17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d.f(true);
            }
        }
    }
}
