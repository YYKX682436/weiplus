package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public final class a0 {
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321, java.util.Map sceneMap) {
        yd.b0 b0Var;
        java.util.Iterator it;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 session = c12567x34ba321;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneMap, "sceneMap");
        if (sceneMap.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMultiSceneReport", "session or sceneMap null ");
            return;
        }
        yd.b0 h17 = yd.c0.INST.h();
        int w17 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (ph.t.f435816k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f435816k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f435816k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
        ph.c c17 = tVar.c();
        boolean d17 = c17.d();
        c17.f();
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.util.Iterator it6 = sceneMap.entrySet().iterator();
        int i17 = 0;
        int i18 = 0;
        while (it6.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            java.util.List list = (java.util.List) entry.getValue();
            int i19 = 5;
            if (i18 >= 5) {
                return;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : list) {
                java.lang.String extraInfo = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) obj).f169884z;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extraInfo, "extraInfo");
                java.lang.Object obj2 = linkedHashMap.get(extraInfo);
                if (obj2 == null) {
                    obj2 = new java.util.ArrayList();
                    linkedHashMap.put(extraInfo, obj2);
                }
                ((java.util.List) obj2).add(obj);
            }
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.util.List list2 = (java.util.List) entry2.getValue();
                if (i18 >= i19) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1 t1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1();
                t1Var.B = intValue;
                t1Var.f169883y = b17;
                t1Var.f169861c = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) list2.get(i17)).f169861c;
                t1Var.f169882x = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) list2.get(i17)).f169882x;
                t1Var.f169881w = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) list2.get(i17)).f169881w;
                t1Var.f169884z = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) list2.get(i17)).f169884z;
                t1Var.A = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) list2.get(i17)).A;
                java.util.Iterator it7 = list2.iterator();
                int i27 = i17;
                while (it7.hasNext()) {
                    i27 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) it7.next()).f169859a;
                }
                t1Var.f169859a = i27 / list2.size();
                java.util.Iterator it8 = list2.iterator();
                int i28 = i17;
                while (it8.hasNext()) {
                    i28 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) it8.next()).f169873o;
                }
                t1Var.f169873o = i28 / list2.size();
                java.util.Iterator it9 = list2.iterator();
                int i29 = i17;
                while (it9.hasNext()) {
                    i29 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) it9.next()).f169878t;
                }
                t1Var.f169878t = i29;
                java.util.Iterator it10 = list2.iterator();
                int i37 = i17;
                while (it10.hasNext()) {
                    i37 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) it10.next()).f169879u;
                }
                t1Var.f169879u = i37;
                java.util.Iterator it11 = list2.iterator();
                int i38 = i17;
                while (it11.hasNext()) {
                    i38 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) it11.next()).f169880v;
                }
                t1Var.f169880v = i38 / list2.size();
                int i39 = h17.f542451a;
                t1Var.f169867i = i39;
                t1Var.f169868j = i39 - session.f169685x;
                t1Var.C = w17;
                t1Var.D = h17.f542454d;
                java.util.Iterator it12 = list2.iterator();
                int i47 = i17;
                while (it12.hasNext()) {
                    i47 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) it12.next()).E;
                }
                t1Var.E = i47 / list2.size();
                java.util.Iterator it13 = list2.iterator();
                int i48 = i17;
                while (it13.hasNext()) {
                    i48 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) it13.next()).G;
                }
                t1Var.G = i48 / list2.size();
                java.util.Iterator it14 = list2.iterator();
                int i49 = i17;
                while (it14.hasNext()) {
                    i49 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) it14.next()).E;
                }
                t1Var.F = i49 / list2.size();
                t1Var.H = c17.b();
                t1Var.I = (d17 ? 1 : 0) | 0;
                t1Var.f169869k = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1) list2.get(list2.size() - 1)).f169869k;
                list2.size();
                t1Var.m52470x9616526c();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(session.f169668e, true);
                if (b18 == null) {
                    b0Var = h17;
                    it = it6;
                } else {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7075xe4b1af8d c7075xe4b1af8d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7075xe4b1af8d();
                    c7075xe4b1af8d.f143823d = c7075xe4b1af8d.b("AppId", b18.f169668e, true);
                    c7075xe4b1af8d.f143824e = b18.f169672i;
                    int i57 = b18.f169669f;
                    c7075xe4b1af8d.f143825f = i57 != 1 ? i57 != 2 ? i57 != 3 ? null : cm.i.demo : cm.i.debug : cm.i.release;
                    c7075xe4b1af8d.f143826g = c7075xe4b1af8d.b("InstanceId", b18.f169667d, true);
                    b0Var = h17;
                    c7075xe4b1af8d.f143827h = b18.f169670g;
                    c7075xe4b1af8d.f143828i = c7075xe4b1af8d.b("NetworkType", t1Var.f169883y, true);
                    c7075xe4b1af8d.f143829j = b18.f169671h;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 S2 = b18.f169677p.S2(false);
                    c7075xe4b1af8d.f143830k = c7075xe4b1af8d.b("LibVersion", S2 == null ? "" : S2.W0(), true);
                    it = it6;
                    c7075xe4b1af8d.f143831l = t1Var.f169881w;
                    if (t1Var.f169861c != null) {
                        c7075xe4b1af8d.f143832m = r0.ordinal();
                    } else {
                        c7075xe4b1af8d.f143832m = 0L;
                    }
                    c7075xe4b1af8d.f143833n = t1Var.B;
                    c7075xe4b1af8d.f143834o = t1Var.f169869k / 1000;
                    c7075xe4b1af8d.f143835p = t1Var.f169859a;
                    c7075xe4b1af8d.f143836q = t1Var.f169873o;
                    c7075xe4b1af8d.f143837r = t1Var.f169878t;
                    c7075xe4b1af8d.f143838s = t1Var.f169879u;
                    c7075xe4b1af8d.f143839t = t1Var.f169880v;
                    c7075xe4b1af8d.f143840u = t1Var.f169867i;
                    c7075xe4b1af8d.f143841v = t1Var.f169868j;
                    c7075xe4b1af8d.f143842w = t1Var.C;
                    c7075xe4b1af8d.f143843x = t1Var.D;
                    c7075xe4b1af8d.f143844y = t1Var.E;
                    c7075xe4b1af8d.f143845z = t1Var.G;
                    c7075xe4b1af8d.A = t1Var.F;
                    c7075xe4b1af8d.B = t1Var.H;
                    c7075xe4b1af8d.C = t1Var.I;
                    c7075xe4b1af8d.D = c7075xe4b1af8d.b("ExtraInfo", t1Var.f169884z, true);
                    c7075xe4b1af8d.F = c7075xe4b1af8d.b("RuntimePlatformInfo", t1Var.A, true);
                    c7075xe4b1af8d.n();
                    c7075xe4b1af8d.k();
                }
                i18++;
                session = c12567x34ba321;
                it6 = it;
                h17 = b0Var;
                i17 = 0;
                i19 = 5;
            }
            session = c12567x34ba321;
            it6 = it6;
            h17 = h17;
            i17 = 0;
        }
    }
}
