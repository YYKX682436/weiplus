package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class a0 {
    public final void a(com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime, java.util.Map sceneMap) {
        yd.b0 b0Var;
        java.util.Iterator it;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime session = qualitySessionRuntime;
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(sceneMap, "sceneMap");
        if (sceneMap.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameMultiSceneReport", "session or sceneMap null ");
            return;
        }
        yd.b0 h17 = yd.c0.INST.h();
        int w17 = (int) com.tencent.mm.sdk.platformtools.t8.w(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (ph.t.f354283k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f354283k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f354283k;
        kotlin.jvm.internal.o.d(tVar);
        ph.c c17 = tVar.c();
        boolean d17 = c17.d();
        c17.f();
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
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
                java.lang.String extraInfo = ((com.tencent.mm.plugin.appbrand.report.quality.t1) obj).f88351z;
                kotlin.jvm.internal.o.f(extraInfo, "extraInfo");
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
                com.tencent.mm.plugin.appbrand.report.quality.t1 t1Var = new com.tencent.mm.plugin.appbrand.report.quality.t1();
                t1Var.B = intValue;
                t1Var.f88350y = b17;
                t1Var.f88328c = ((com.tencent.mm.plugin.appbrand.report.quality.t1) list2.get(i17)).f88328c;
                t1Var.f88349x = ((com.tencent.mm.plugin.appbrand.report.quality.t1) list2.get(i17)).f88349x;
                t1Var.f88348w = ((com.tencent.mm.plugin.appbrand.report.quality.t1) list2.get(i17)).f88348w;
                t1Var.f88351z = ((com.tencent.mm.plugin.appbrand.report.quality.t1) list2.get(i17)).f88351z;
                t1Var.A = ((com.tencent.mm.plugin.appbrand.report.quality.t1) list2.get(i17)).A;
                java.util.Iterator it7 = list2.iterator();
                int i27 = i17;
                while (it7.hasNext()) {
                    i27 += ((com.tencent.mm.plugin.appbrand.report.quality.t1) it7.next()).f88326a;
                }
                t1Var.f88326a = i27 / list2.size();
                java.util.Iterator it8 = list2.iterator();
                int i28 = i17;
                while (it8.hasNext()) {
                    i28 += ((com.tencent.mm.plugin.appbrand.report.quality.t1) it8.next()).f88340o;
                }
                t1Var.f88340o = i28 / list2.size();
                java.util.Iterator it9 = list2.iterator();
                int i29 = i17;
                while (it9.hasNext()) {
                    i29 += ((com.tencent.mm.plugin.appbrand.report.quality.t1) it9.next()).f88345t;
                }
                t1Var.f88345t = i29;
                java.util.Iterator it10 = list2.iterator();
                int i37 = i17;
                while (it10.hasNext()) {
                    i37 += ((com.tencent.mm.plugin.appbrand.report.quality.t1) it10.next()).f88346u;
                }
                t1Var.f88346u = i37;
                java.util.Iterator it11 = list2.iterator();
                int i38 = i17;
                while (it11.hasNext()) {
                    i38 += ((com.tencent.mm.plugin.appbrand.report.quality.t1) it11.next()).f88347v;
                }
                t1Var.f88347v = i38 / list2.size();
                int i39 = h17.f460918a;
                t1Var.f88334i = i39;
                t1Var.f88335j = i39 - session.f88152x;
                t1Var.C = w17;
                t1Var.D = h17.f460921d;
                java.util.Iterator it12 = list2.iterator();
                int i47 = i17;
                while (it12.hasNext()) {
                    i47 += ((com.tencent.mm.plugin.appbrand.report.quality.t1) it12.next()).E;
                }
                t1Var.E = i47 / list2.size();
                java.util.Iterator it13 = list2.iterator();
                int i48 = i17;
                while (it13.hasNext()) {
                    i48 += ((com.tencent.mm.plugin.appbrand.report.quality.t1) it13.next()).G;
                }
                t1Var.G = i48 / list2.size();
                java.util.Iterator it14 = list2.iterator();
                int i49 = i17;
                while (it14.hasNext()) {
                    i49 += ((com.tencent.mm.plugin.appbrand.report.quality.t1) it14.next()).E;
                }
                t1Var.F = i49 / list2.size();
                t1Var.H = c17.b();
                t1Var.I = (d17 ? 1 : 0) | 0;
                t1Var.f88336k = ((com.tencent.mm.plugin.appbrand.report.quality.t1) list2.get(list2.size() - 1)).f88336k;
                list2.size();
                t1Var.toString();
                com.tencent.mm.plugin.appbrand.report.quality.j jVar = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
                com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b18 = com.tencent.mm.plugin.appbrand.report.quality.e.b(session.f88135e, true);
                if (b18 == null) {
                    b0Var = h17;
                    it = it6;
                } else {
                    com.tencent.mm.autogen.mmdata.rpt.WeAppNewGameQualityRuntimeStruct weAppNewGameQualityRuntimeStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppNewGameQualityRuntimeStruct();
                    weAppNewGameQualityRuntimeStruct.f62290d = weAppNewGameQualityRuntimeStruct.b("AppId", b18.f88135e, true);
                    weAppNewGameQualityRuntimeStruct.f62291e = b18.f88139i;
                    int i57 = b18.f88136f;
                    weAppNewGameQualityRuntimeStruct.f62292f = i57 != 1 ? i57 != 2 ? i57 != 3 ? null : cm.i.demo : cm.i.debug : cm.i.release;
                    weAppNewGameQualityRuntimeStruct.f62293g = weAppNewGameQualityRuntimeStruct.b("InstanceId", b18.f88134d, true);
                    b0Var = h17;
                    weAppNewGameQualityRuntimeStruct.f62294h = b18.f88137g;
                    weAppNewGameQualityRuntimeStruct.f62295i = weAppNewGameQualityRuntimeStruct.b("NetworkType", t1Var.f88350y, true);
                    weAppNewGameQualityRuntimeStruct.f62296j = b18.f88138h;
                    com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = b18.f88144p.S2(false);
                    weAppNewGameQualityRuntimeStruct.f62297k = weAppNewGameQualityRuntimeStruct.b("LibVersion", S2 == null ? "" : S2.W0(), true);
                    it = it6;
                    weAppNewGameQualityRuntimeStruct.f62298l = t1Var.f88348w;
                    if (t1Var.f88328c != null) {
                        weAppNewGameQualityRuntimeStruct.f62299m = r0.ordinal();
                    } else {
                        weAppNewGameQualityRuntimeStruct.f62299m = 0L;
                    }
                    weAppNewGameQualityRuntimeStruct.f62300n = t1Var.B;
                    weAppNewGameQualityRuntimeStruct.f62301o = t1Var.f88336k / 1000;
                    weAppNewGameQualityRuntimeStruct.f62302p = t1Var.f88326a;
                    weAppNewGameQualityRuntimeStruct.f62303q = t1Var.f88340o;
                    weAppNewGameQualityRuntimeStruct.f62304r = t1Var.f88345t;
                    weAppNewGameQualityRuntimeStruct.f62305s = t1Var.f88346u;
                    weAppNewGameQualityRuntimeStruct.f62306t = t1Var.f88347v;
                    weAppNewGameQualityRuntimeStruct.f62307u = t1Var.f88334i;
                    weAppNewGameQualityRuntimeStruct.f62308v = t1Var.f88335j;
                    weAppNewGameQualityRuntimeStruct.f62309w = t1Var.C;
                    weAppNewGameQualityRuntimeStruct.f62310x = t1Var.D;
                    weAppNewGameQualityRuntimeStruct.f62311y = t1Var.E;
                    weAppNewGameQualityRuntimeStruct.f62312z = t1Var.G;
                    weAppNewGameQualityRuntimeStruct.A = t1Var.F;
                    weAppNewGameQualityRuntimeStruct.B = t1Var.H;
                    weAppNewGameQualityRuntimeStruct.C = t1Var.I;
                    weAppNewGameQualityRuntimeStruct.D = weAppNewGameQualityRuntimeStruct.b("ExtraInfo", t1Var.f88351z, true);
                    weAppNewGameQualityRuntimeStruct.F = weAppNewGameQualityRuntimeStruct.b("RuntimePlatformInfo", t1Var.A, true);
                    weAppNewGameQualityRuntimeStruct.n();
                    weAppNewGameQualityRuntimeStruct.k();
                }
                i18++;
                session = qualitySessionRuntime;
                it6 = it;
                h17 = b0Var;
                i17 = 0;
                i19 = 5;
            }
            session = qualitySessionRuntime;
            it6 = it6;
            h17 = h17;
            i17 = 0;
        }
    }
}
