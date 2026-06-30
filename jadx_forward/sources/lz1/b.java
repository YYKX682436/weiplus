package lz1;

/* loaded from: classes13.dex */
public class b implements lz1.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f403854a = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f403855b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f403856c = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f403857d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public float f403858e;

    /* renamed from: f, reason: collision with root package name */
    public lz1.c f403859f;

    public final long a() {
        sy1.f fVar = cy1.a.Ui().f306223m;
        if (fVar != null) {
            return fVar.f495390l;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    public void b(long j17, boolean z17, boolean z18) {
        java.lang.Object obj;
        java.util.List list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.StandardEventMonitor", "[onAppIn] time : %d, screenOn : %b, isTaskChange : %b", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        long j18 = 0;
        boolean z19 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            long j19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("data_report_last_app_out_time", 0L);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("in_type", java.lang.Integer.valueOf(z17 ? 2 : 0));
            hashMap.put("in_time", java.lang.Long.valueOf(j17));
            hashMap.put("last_app_out_time", java.lang.Long.valueOf(j19));
            long j27 = j17 - j19;
            if (j27 <= 0) {
                j27 = 0;
            }
            hashMap.put("last_app_out_stay_time", java.lang.Long.valueOf(j27));
            cy1.a.Ui().Ij(j17, "app_in", hashMap);
            oz1.e.a().f(j17, "app_in", null, hashMap);
            try {
                this.f403858e = ph.t.k().c().b() / 100.0f;
            } catch (java.lang.Exception unused) {
            }
            sy1.f fVar = cy1.a.Ui().f306223m;
            if (fVar != null) {
                fVar.f495390l = j17;
            }
        }
        java.util.List list2 = this.f403856c;
        java.util.List list3 = this.f403854a;
        if (z18) {
            this.f403859f = null;
            ((java.util.concurrent.CopyOnWriteArrayList) list3).clear();
            ((java.util.concurrent.ConcurrentHashMap) this.f403855b).clear();
            ((java.util.concurrent.CopyOnWriteArrayList) list2).clear();
            ((java.util.concurrent.ConcurrentHashMap) this.f403857d).clear();
        }
        lz1.c cVar = this.f403859f;
        if (cVar != null) {
            cVar.f403861a = j17;
            cVar.f403862b = 0L;
            cVar.f403864d = false;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("in_type", java.lang.Integer.valueOf(z17 ? 2 : 0));
            hashMap2.put("in_time", java.lang.Long.valueOf(j17));
            hashMap2.put("app_in_time", java.lang.Long.valueOf(a()));
            obj = "app_in_time";
            list = list3;
            cy1.a.Ui().Kj(j17, "biz_in", this.f403859f.f403863c, hashMap2);
            oz1.e.a().f(j17, "biz_in", this.f403859f.f403863c, hashMap2);
        } else {
            obj = "app_in_time";
            list = list3;
        }
        int i17 = 0;
        while (i17 <= ((java.util.concurrent.CopyOnWriteArrayList) list).size() - 1) {
            lz1.c cVar2 = (lz1.c) ((java.util.concurrent.CopyOnWriteArrayList) list).get(i17);
            cVar2.f403861a = j17;
            cVar2.f403862b = 0L;
            cVar2.f403864d = z19;
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("in_type", java.lang.Integer.valueOf((int) (z17 ? 2 : z19)));
            hashMap3.put("in_time", java.lang.Long.valueOf(j17));
            hashMap3.put(obj, java.lang.Long.valueOf(a()));
            cy1.a.Ui().Kj(j17, "session_in", cVar2.f403863c, hashMap3);
            oz1.e.a().f(j17, "session_in", cVar2.f403863c, hashMap3);
            i17++;
            z19 = false;
        }
        int i18 = 0;
        while (i18 <= ((java.util.concurrent.CopyOnWriteArrayList) list2).size() - 1) {
            lz1.c cVar3 = (lz1.c) ((java.util.concurrent.CopyOnWriteArrayList) list2).get(i18);
            if (cVar3 != null) {
                cVar3.f403861a = j17;
                cVar3.f403862b = j18;
                cVar3.f403864d = false;
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put("in_type", java.lang.Integer.valueOf(z17 ? 2 : 0));
                hashMap4.put("in_time", java.lang.Long.valueOf(j17));
                hashMap4.put(obj, java.lang.Long.valueOf(a()));
                cy1.a.Ui().Kj(j17, "page_in", cVar3.f403863c, hashMap4);
                oz1.e.a().f(j17, "page_in", cVar3.f403863c, hashMap4);
            }
            i18++;
            j18 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r23, boolean r25) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lz1.b.c(long, boolean):void");
    }

    public void d(hz1.a aVar, long j17) {
        java.util.Map c17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        if (aVar == null) {
            return;
        }
        lz1.c cVar = this.f403859f;
        if (cVar == null || !aVar.d(cVar.f403863c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.StandardEventMonitor", "[onBizIn] page : " + aVar + ", time : " + j17);
            sy1.f fVar = cy1.a.Ui().f306223m;
            if (fVar != null) {
                fVar.l(aVar, "biz_in");
                int b17 = uy1.a.b(aVar);
                if (b17 > 0) {
                    if (cy1.a.Ui().f306223m != null && (c17 = fVar.c(fVar.f495398t)) != null) {
                        java.util.HashMap hashMap = (java.util.HashMap) c17;
                        if (hashMap.size() > 0) {
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) fVar.f495399u;
                            java.util.Iterator it = concurrentHashMap2.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    concurrentHashMap = null;
                                    break;
                                }
                                hz1.a aVar2 = (hz1.a) it.next();
                                if (aVar.d(aVar2)) {
                                    concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap2.get(aVar2);
                                    break;
                                }
                            }
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                                concurrentHashMap2.put(aVar, concurrentHashMap);
                            }
                            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                                if (entry.getValue() != null) {
                                    concurrentHashMap.put((java.lang.String) entry.getKey(), entry.getValue());
                                }
                            }
                        }
                    }
                    fVar.f495384f = java.lang.String.format("%s_%d", java.lang.Integer.valueOf(b17), java.lang.Long.valueOf(j17));
                    fVar.f495398t = aVar;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageContext", "[bizIn] bizId : " + fVar.f495384f);
                }
            }
            lz1.c cVar2 = new lz1.c(this);
            this.f403859f = cVar2;
            cVar2.f403863c = aVar;
            cVar2.f403861a = j17;
            cVar2.f403862b = 0L;
            cVar2.f403864d = false;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("in_type", 1);
            hashMap2.put("in_time", java.lang.Long.valueOf(j17));
            hashMap2.put("app_in_time", java.lang.Long.valueOf(a()));
            cy1.a.Ui().Kj(j17, "biz_in", aVar, hashMap2);
            oz1.e.a().f(j17, "biz_in", aVar, hashMap2);
        }
    }

    public void e(hz1.a aVar, long j17) {
        lz1.c cVar;
        hz1.a aVar2;
        if (aVar == null || (cVar = this.f403859f) == null || !aVar.d(cVar.f403863c)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.StandardEventMonitor", "[onBizOut] page : " + aVar + ", time : " + j17);
        lz1.c cVar2 = this.f403859f;
        long j18 = cVar2.f403861a;
        long j19 = (j17 <= j18 || j18 <= 0) ? 0L : j17 - j18;
        cVar2.f403862b = j19;
        if (j19 > 0 && !cVar2.f403864d) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("out_type", 1);
            hashMap.put("in_time", java.lang.Long.valueOf(this.f403859f.f403861a));
            hashMap.put("out_time", java.lang.Long.valueOf(j17));
            hashMap.put("stay_time", java.lang.Long.valueOf(this.f403859f.f403862b));
            hashMap.put("app_in_time", java.lang.Long.valueOf(a()));
            cy1.a.Ui().Kj(j17, "biz_out", aVar, hashMap);
            oz1.e.a().f(j17, "biz_out", aVar, hashMap);
        }
        this.f403859f.f403864d = true;
        this.f403859f = null;
        sy1.f fVar = cy1.a.Ui().f306223m;
        if (fVar == null || (aVar2 = fVar.f495398t) == null || !aVar2.d(aVar)) {
            return;
        }
        fVar.f495385g = fVar.f495384f;
        fVar.f495384f = null;
        fVar.f495398t = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageContext", "[bizOut] bizId : null");
    }

    public void f(hz1.a aVar, long j17, boolean z17) {
        hz1.a aVar2;
        java.util.List list;
        if (aVar == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f403857d;
        java.lang.String str = aVar.f367821b;
        if (((lz1.c) concurrentHashMap.get(str)) != null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.StandardEventMonitor", "[onPageIn] page : " + aVar + ", isSubPage : " + z17 + ", time : " + j17);
        sy1.f fVar = cy1.a.Ui().f306223m;
        if (fVar != null) {
            if (!z17) {
                fVar.k(aVar, j17);
            } else if (fVar.f495380b != null) {
                fVar.l(aVar, "page_in");
                vy1.b j18 = uy1.a.j(aVar, true);
                if (j18 != null) {
                    j18.f522970p = j17;
                }
                hz1.a aVar3 = fVar.f495380b;
                if (aVar3 != null) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) fVar.f495381c;
                    java.util.Iterator it = concurrentHashMap2.keySet().iterator();
                    while (true) {
                        aVar2 = null;
                        if (!it.hasNext()) {
                            list = null;
                            break;
                        }
                        hz1.a aVar4 = (hz1.a) it.next();
                        if (aVar3.d(aVar4)) {
                            list = (java.util.List) concurrentHashMap2.get(aVar4);
                            break;
                        }
                    }
                    if (list == null) {
                        list = new java.util.concurrent.CopyOnWriteArrayList();
                        concurrentHashMap2.put(aVar3, list);
                    }
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            list.add(aVar);
                            if (uy1.a.c(aVar, "page_is_full_subpage", false)) {
                                if (uy1.a.k(aVar) > 0) {
                                    java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) fVar.f495382d;
                                    java.util.Iterator it7 = concurrentHashMap3.keySet().iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            break;
                                        }
                                        hz1.a aVar5 = (hz1.a) it7.next();
                                        if (aVar3.d(aVar5)) {
                                            aVar2 = aVar5;
                                            break;
                                        }
                                    }
                                    if (aVar2 != null) {
                                        concurrentHashMap3.put(aVar2, aVar);
                                    } else {
                                        concurrentHashMap3.put(aVar3, aVar);
                                    }
                                }
                            }
                        } else if (((hz1.a) it6.next()).d(aVar)) {
                            break;
                        }
                    }
                }
            }
        }
        lz1.c cVar = new lz1.c(this);
        cVar.f403863c = aVar;
        cVar.f403861a = j17;
        cVar.f403862b = 0L;
        cVar.f403864d = false;
        concurrentHashMap.put(str, cVar);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.f403856c;
        copyOnWriteArrayList.add(cVar);
        int size = copyOnWriteArrayList.size();
        if (pz1.a.a() && size > pz1.a.f440712d) {
            pz1.a.f440712d = size;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("5");
            arrayList.add(java.lang.String.valueOf(size));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.l(24504, arrayList);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("in_type", 1);
        hashMap.put("in_time", java.lang.Long.valueOf(j17));
        hashMap.put("app_in_time", java.lang.Long.valueOf(a()));
        hashMap.put("cur_enter_method", aVar.a());
        hashMap.put("enter_method", cVar.f403863c.b());
        cy1.a.Ui().Kj(j17, "page_in", aVar, hashMap);
        oz1.e.a().f(j17, "page_in", aVar, hashMap);
    }

    public void g(hz1.a aVar, long j17, boolean z17) {
        sy1.f fVar;
        hz1.a aVar2;
        hz1.a aVar3;
        java.util.List list;
        if (aVar == null) {
            return;
        }
        java.util.Map map = this.f403857d;
        java.lang.String str = aVar.f367821b;
        lz1.c cVar = (lz1.c) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (cVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.StandardEventMonitor", "[onPageOut] page : " + aVar + ", isSubPage : " + z17 + ", time : " + j17);
        if (z17 && (fVar = cy1.a.Ui().f306223m) != null && (aVar2 = fVar.f495380b) != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) fVar.f495381c;
            java.util.Iterator it = concurrentHashMap.keySet().iterator();
            while (true) {
                aVar3 = null;
                if (!it.hasNext()) {
                    list = null;
                    break;
                }
                hz1.a aVar4 = (hz1.a) it.next();
                if (aVar2.d(aVar4)) {
                    list = (java.util.List) concurrentHashMap.get(aVar4);
                    break;
                }
            }
            if (list != null && list.size() > 0) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    hz1.a aVar5 = (hz1.a) it6.next();
                    if (aVar.d(aVar5)) {
                        aVar3 = aVar5;
                        break;
                    }
                }
                if (aVar3 != null) {
                    list.remove(aVar3);
                }
            }
        }
        long j18 = cVar.f403861a;
        cVar.f403862b = (j17 <= j18 || j18 <= 0) ? 0L : j17 - j18;
        ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        ((java.util.concurrent.CopyOnWriteArrayList) this.f403856c).remove(cVar);
        if (cVar.f403862b > 0 && !cVar.f403864d) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("out_type", 1);
            hashMap.put("in_time", java.lang.Long.valueOf(cVar.f403861a));
            hashMap.put("out_time", java.lang.Long.valueOf(j17));
            hashMap.put("stay_time", java.lang.Long.valueOf(cVar.f403862b));
            hashMap.put("app_in_time", java.lang.Long.valueOf(a()));
            hashMap.put("cur_enter_method", cVar.f403863c.a());
            hashMap.put("enter_method", cVar.f403863c.b());
            cy1.a.Ui().Kj(j17, "page_out", aVar, hashMap);
            oz1.e.a().f(j17, "page_out", aVar, hashMap);
        }
        cVar.f403864d = true;
    }

    public void h() {
        this.f403859f = null;
        ((java.util.concurrent.CopyOnWriteArrayList) this.f403854a).clear();
        ((java.util.concurrent.ConcurrentHashMap) this.f403855b).clear();
        ((java.util.concurrent.CopyOnWriteArrayList) this.f403856c).clear();
        ((java.util.concurrent.ConcurrentHashMap) this.f403857d).clear();
    }

    public void i(hz1.a aVar, long j17) {
        java.lang.String format;
        if (aVar == null) {
            return;
        }
        if (a() == 0) {
            sy1.f fVar = cy1.a.Ui().f306223m;
            if (fVar != null) {
                fVar.f495390l = j17;
            }
            try {
                this.f403858e = ph.t.k().c().b() / 100.0f;
            } catch (java.lang.Exception unused) {
            }
        }
        java.util.Map map = this.f403855b;
        java.lang.String str = aVar.f367821b;
        if (((lz1.c) ((java.util.concurrent.ConcurrentHashMap) map).get(str)) != null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.StandardEventMonitor", "[onSessionIn] page : " + aVar + ", time : " + j17 + ", isMutilTask : " + aVar.f367832m);
        sy1.f fVar2 = cy1.a.Ui().f306223m;
        if (fVar2 != null) {
            java.lang.String str2 = fVar2.f495389k;
            if (!u46.l.e(str2)) {
                aVar.f367834o = str2;
                aVar.f367833n = str2;
                aVar.f367832m = false;
            }
            fVar2.f495389k = null;
            fVar2.l(aVar, "session_in");
            vy1.b j18 = uy1.a.j(aVar, true);
            if (j18 != null) {
                j18.f522971q = j17;
            }
            java.lang.String str3 = fVar2.f495386h;
            vy1.b j19 = uy1.a.j(aVar, true);
            if (j19 != null || u46.l.e(str3)) {
                j19.f522972r = str3;
            }
            int k17 = uy1.a.k(aVar);
            if (k17 <= 0) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                java.lang.String str4 = aVar.f367822c;
                if (str4 == null) {
                    str4 = "";
                }
                objArr[0] = str4;
                objArr[1] = java.lang.Long.valueOf(j17);
                format = java.lang.String.format("%s_%d", objArr);
            } else {
                format = java.lang.String.format("%d_%d", java.lang.Integer.valueOf(k17), java.lang.Long.valueOf(j17));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[sessionIn] sessionId : ");
            sb6.append(format);
            sb6.append(", sessionIds count : ");
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) fVar2.f495395q;
            sb6.append(copyOnWriteArrayList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageContext", sb6.toString());
            if (cy1.a.Ui().f306223m != null) {
                fVar2.g(aVar, fVar2.d(fVar2.f495379a));
            }
            ((java.util.concurrent.ConcurrentHashMap) fVar2.f495394p).put(aVar, format);
            copyOnWriteArrayList.add(format);
            boolean e17 = u46.l.e(fVar2.f495386h);
            java.util.Map map2 = fVar2.f495393o;
            if (e17) {
                ((java.util.HashMap) map2).put(format, "0-unknown_view_id");
            } else {
                ((java.util.HashMap) map2).put(format, fVar2.f495387i + "-" + fVar2.f495386h);
            }
        }
        lz1.c cVar = new lz1.c(this);
        cVar.f403863c = aVar;
        cVar.f403861a = j17;
        cVar.f403862b = 0L;
        cVar.f403864d = false;
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, cVar);
        java.util.List list = this.f403854a;
        ((java.util.concurrent.CopyOnWriteArrayList) list).add(cVar);
        int size = ((java.util.concurrent.CopyOnWriteArrayList) list).size();
        if (pz1.a.a() && size > pz1.a.f440711c) {
            pz1.a.f440711c = size;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("4");
            arrayList.add(java.lang.String.valueOf(size));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.l(24504, arrayList);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("in_type", 1);
        hashMap.put("in_time", java.lang.Long.valueOf(j17));
        hashMap.put("app_in_time", java.lang.Long.valueOf(a()));
        hashMap.put("cur_enter_method", aVar.a());
        hashMap.put("enter_method", aVar.b());
        cy1.a.Ui().Kj(j17, "session_in", aVar, hashMap);
        oz1.e.a().f(j17, "session_in", aVar, hashMap);
    }

    public void j(final hz1.a aVar, long j17) {
        if (aVar == null) {
            return;
        }
        java.util.Map map = this.f403855b;
        java.lang.String str = aVar.f367821b;
        lz1.c cVar = (lz1.c) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (cVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.StandardEventMonitor", "[onSessionOut] page : " + aVar + ", time : " + j17);
        long j18 = cVar.f403861a;
        cVar.f403862b = (j17 <= j18 || j18 <= 0) ? 0L : j17 - j18;
        ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        ((java.util.concurrent.CopyOnWriteArrayList) this.f403854a).remove(cVar);
        if (cVar.f403862b > 0 && !cVar.f403864d) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("out_type", 1);
            hashMap.put("in_time", java.lang.Long.valueOf(cVar.f403861a));
            hashMap.put("out_time", java.lang.Long.valueOf(j17));
            hashMap.put("stay_time", java.lang.Long.valueOf(cVar.f403862b));
            hashMap.put("app_in_time", java.lang.Long.valueOf(a()));
            hashMap.put("cur_enter_method", cVar.f403863c.a());
            hashMap.put("enter_method", cVar.f403863c.b());
            cy1.a.Ui().Kj(j17, "session_out", aVar, hashMap);
            oz1.e.a().f(j17, "session_out", aVar, hashMap);
        }
        cVar.f403864d = true;
        sy1.f fVar = cy1.a.Ui().f306223m;
        if (fVar != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) fVar.f495394p;
            java.util.Iterator it = concurrentHashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hz1.a aVar2 = (hz1.a) it.next();
                if (aVar.d(aVar2)) {
                    java.lang.String str2 = (java.lang.String) concurrentHashMap.remove(aVar2);
                    if (!u46.l.e(str2)) {
                        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) fVar.f495395q;
                        copyOnWriteArrayList.remove(str2);
                        ((java.util.HashMap) fVar.f495396r).remove(str2);
                        ((java.util.HashMap) fVar.f495393o).remove(str2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageContext", "[sessionOut] sessionId : " + str2 + ", sessionIds count : " + copyOnWriteArrayList.size());
                    }
                }
            }
        }
        sz1.i.c(new java.lang.Runnable() { // from class: lz1.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                jz1.e Di = jz1.e.Di();
                hz1.a aVar3 = hz1.a.this;
                if (aVar3 == null) {
                    Di.getClass();
                } else {
                    uz1.a aVar4 = Di.f384171e;
                    aVar4.iterator();
                    while (aVar4.hasNext()) {
                        android.view.View view = (android.view.View) aVar4.next();
                        android.content.Context g17 = sz1.a.g(view);
                        if ((g17 instanceof android.app.Activity) && g17.hashCode() == aVar3.f367820a) {
                            uy1.a.r(view, "view_exp");
                            uy1.a.r(view, "view_unexp");
                        }
                    }
                }
                kz1.e Bi = kz1.e.Bi();
                if (aVar3 == null) {
                    Bi.getClass();
                    return;
                }
                uz1.a aVar5 = Bi.f395374d;
                aVar5.iterator();
                while (aVar5.hasNext()) {
                    android.view.View view2 = (android.view.View) aVar5.next();
                    android.content.Context g18 = sz1.a.g(view2);
                    if ((g18 instanceof android.app.Activity) && g18.hashCode() == aVar3.f367820a) {
                        uy1.a.r(view2, "view_clk");
                    }
                }
            }
        });
    }

    public void k(java.util.Map map, java.util.List list, long j17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(map);
        cy1.a.Ui().Lj(j17, "view_exp", hashMap, list);
        oz1.e.a().f(j17, "view_exp", null, hashMap);
    }

    public void l(java.util.Map map, java.util.List list, long j17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(map);
        cy1.a.Ui().Lj(j17, "view_unexp", hashMap, list);
        oz1.e.a().f(j17, "view_unexp", null, hashMap);
    }
}
