package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b2 f206498a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b2();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1 op6) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6545x29fc9cf5 c6545x29fc9cf5 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6545x29fc9cf5();
        int i18 = op6.f206998d;
        c6545x29fc9cf5.f138975d = i18;
        c6545x29fc9cf5.f138976e = c6545x29fc9cf5.b("opDesc", op6.f206999e, true);
        c6545x29fc9cf5.k();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report23850: type = ");
        sb6.append(i18);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        sb6.append("");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskReporter", sb6.toString());
        if (op6 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206992s) {
            long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_BACKGROUND_TIMESTAMP_LONG_SYNC, 0L);
            if (t17 != 0) {
                long c17 = c01.id.c() - t17;
                i95.m c18 = i95.n0.c(zy2.c9.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var = c18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) c18 : null;
                if (l3Var != null) {
                    java.util.Set enterFinderActivity = l3Var.f207666s;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enterFinderActivity, "enterFinderActivity");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : enterFinderActivity) {
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) obj;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activityC0065xcd7aa112);
                        if (l3Var.Di(activityC0065xcd7aa112)) {
                            arrayList.add(obj);
                        }
                    }
                    i17 = arrayList.size();
                } else {
                    i17 = 0;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6501x23a2dd38 c6501x23a2dd38 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6501x23a2dd38();
                c6501x23a2dd38.f138454d = 10L;
                c6501x23a2dd38.f138455e = 10L;
                c6501x23a2dd38.f138458h = c6501x23a2dd38.b("majorData", java.lang.String.valueOf(c17), true);
                cl0.g gVar = new cl0.g();
                gVar.p("exitToReenterMultiTaskTime", c17);
                gVar.o("enterFinderTaskUISize", i17);
                java.lang.String gVar2 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                c6501x23a2dd38.f138456f = c6501x23a2dd38.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, r26.i0.t(gVar2, ",", ";", false), true);
                c6501x23a2dd38.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskReporter", "report21680 reportEnterMultiTask:" + c6501x23a2dd38.n());
            }
        }
        switch (op6.ordinal()) {
            case 0:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 3L);
                return;
            case 1:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 0L);
                return;
            case 2:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 2L);
                return;
            case 3:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 1L);
                return;
            case 4:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 4L);
                return;
            case 5:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 5L);
                return;
            case 6:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 6L);
                return;
            case 7:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 7L);
                return;
            case 8:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 8L);
                return;
            case 9:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 101L);
                return;
            case 10:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 102L);
                return;
            case 11:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 103L);
                return;
            case 12:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 104L);
                return;
            case 13:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 105L);
                return;
            case 14:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1767L, 106L);
                return;
            default:
                return;
        }
    }
}
