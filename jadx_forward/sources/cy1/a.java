package cy1;

@j95.b
/* loaded from: classes13.dex */
public class a extends i95.w implements dy1.r {

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.Integer f306216r;

    /* renamed from: f, reason: collision with root package name */
    public sy1.c f306219f;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f306226p;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f306217d = java.lang.Boolean.TRUE;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f306218e = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f306220g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f306221h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f306222i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final sy1.f f306223m = new sy1.f();

    /* renamed from: n, reason: collision with root package name */
    public int f306224n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f306225o = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final ly1.b f306227q = new sy1.d();

    public static int Ri() {
        if (f306216r == null) {
            f306216r = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_data_report_dynamic_params_storage_type, 0));
        }
        return f306216r.intValue();
    }

    public static cy1.a Ui() {
        return (cy1.a) i95.n0.c(cy1.a.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dy1.r Ai(java.lang.Object r6, ly1.a r7) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy1.a.Ai(java.lang.Object, ly1.a):dy1.r");
    }

    public void Aj(int i17, java.lang.String str, java.util.Map map, int i18, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap(map);
        hashMap.put("page_id", java.lang.Integer.valueOf(i17));
        yj(str, null, hashMap, i18, z17);
    }

    public boolean Bi(java.lang.String str) {
        if (!a.b.c().f81577a || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        ry5.c f17 = ry5.c.f();
        f17.getClass();
        if (android.text.TextUtils.isEmpty(str) || !str.contains("sentinel:")) {
            return true;
        }
        java.lang.String str2 = "[bindSessionId] isMainProcess ： " + a.b.c().f81580d;
        if (xy5.b.f539695a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("enricwu.SentinelService", str2);
        }
        f17.f483236a = str;
        f17.f483237b.f483230c = str;
        f17.a(1);
        return true;
    }

    public void Bj(java.lang.String str, java.lang.String str2, java.util.Map map, int i17, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap(map);
        hashMap.put("view_id", str);
        yj(str2, null, hashMap, i17, z17);
    }

    public void Cj(java.lang.String str, java.lang.Object obj, java.util.Map map, int i17) {
        if (oj()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(java.lang.Integer.valueOf(i17));
            if (oj()) {
                Dj(str, obj, map, 0, arrayList, false, false, false);
            }
        }
    }

    public void D2(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null || !oj()) {
            return;
        }
        gz1.d dVar = gz1.d.f359247d;
        if (gz1.d.f359256p) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = gz1.d.f359250g;
            gz1.b bVar = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
            if (bVar == null) {
                bVar = new gz1.b(new java.lang.ref.WeakReference(componentCallbacksC1101xa17d4670), true);
                concurrentHashMap.put(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()), bVar);
            }
            bVar.f359246l = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210 = componentCallbacksC1101xa17d4670.m7453x12a9d210(); m7453x12a9d210 != null; m7453x12a9d210 = m7453x12a9d210.m7453x12a9d210()) {
                arrayList.add(m7453x12a9d210);
            }
            if (!arrayList.isEmpty()) {
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    dVar.s((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) arrayList.get(size));
                }
            }
            dVar.u(componentCallbacksC1101xa17d4670, false);
            dVar.s(componentCallbacksC1101xa17d4670);
            dVar.d(componentCallbacksC1101xa17d4670);
        }
    }

    public final void Di() {
        int h17 = gm0.j1.a() ? gm0.j1.b().h() : gm0.m.i();
        if (new kk.v(h17).longValue() <= 0) {
            sz1.i.d(new java.lang.Runnable() { // from class: cy1.a$$d
                @Override // java.lang.Runnable
                public final void run() {
                    cy1.a.this.Di();
                }
            }, 5000L);
            return;
        }
        java.lang.String str = new kk.v(h17).longValue() + "";
        a.b c17 = a.b.c();
        c17.getClass();
        if (android.text.TextUtils.isEmpty(str) || c17.f81581e == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_id_amoeba_default").putString("amoeba_distinct_id", str);
    }

    public void Dj(java.lang.String str, java.lang.Object obj, java.util.Map map, int i17, java.util.List list, boolean z17, boolean z18, boolean z19) {
        if (oj()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                ky1.d dVar = new ky1.d();
                dVar.f395032a = i17;
                dVar.f395033b = num.intValue();
                dVar.f395034c = z17;
                dVar.f395035d = z19;
                arrayList.add(dVar);
            }
            ky1.b a17 = ky1.c.a();
            a17.f395020a = java.lang.System.currentTimeMillis();
            a17.f395021b = obj;
            a17.f395022c = str;
            a17.b(sz1.f.b(map));
            a17.c(arrayList);
            a17.f395025f = z18;
            Fj(a17.a());
        }
    }

    public void Ej(java.lang.String str, java.util.Map map, int i17) {
        if (oj()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(java.lang.Integer.valueOf(i17));
            if (oj() && oj()) {
                Dj(str, null, map, 0, arrayList, false, false, false);
            }
        }
    }

    public void Fj(final ky1.c cVar) {
        if (cVar != null) {
            java.lang.String str = cVar.f395028c;
            if (u46.l.e(str) || !oj()) {
                return;
            }
            java.lang.Object obj = cVar.f395027b;
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            long j17 = cVar.f395026a;
            final long currentTimeMillis = j17 > 0 ? j17 : java.lang.System.currentTimeMillis();
            final java.util.List b17 = ry1.b.b(str, obj);
            final hz1.a c17 = sz1.a.c(obj);
            final boolean m17 = sz1.a.m(obj);
            final java.util.List list = cVar.f395030e;
            if (list == null) {
                list = ij(obj, str);
            }
            sz1.i.b(new java.lang.Runnable() { // from class: cy1.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    cy1.a aVar = cy1.a.this;
                    aVar.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reportCustomEvent] eventData : ");
                    ky1.c cVar2 = cVar;
                    sb6.append(cVar2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.DataReportService", sb6.toString());
                    boolean c18 = u46.l.c(cVar2.f395028c, "view_clk");
                    java.util.Map map = cVar2.f395029d;
                    long j18 = currentTimeMillis;
                    sy1.f fVar = aVar.f306223m;
                    if (c18 && map != null) {
                        java.lang.Object obj2 = ((java.util.concurrent.ConcurrentHashMap) map).get("view_id");
                        if (obj2 == null || !(obj2 instanceof java.lang.String)) {
                            fVar.f495386h = "";
                            fVar.f495387i = j18;
                        } else {
                            fVar.f495386h = (java.lang.String) obj2;
                            fVar.f495387i = j18;
                        }
                    }
                    if (map != null) {
                        ((java.util.concurrent.ConcurrentHashMap) map).put("app_in_time", java.lang.Long.valueOf(fVar.f495390l));
                    }
                    bz1.a aVar2 = new bz1.a();
                    java.lang.String str2 = cVar2.f395028c;
                    aVar2.f118296a = str2;
                    yy1.b bVar = aVar.f306219f.f495370c;
                    if (bVar != null) {
                        hz1.a aVar3 = c17;
                        java.util.List list2 = b17;
                        if (aVar3 == null && cVar2.f395031f) {
                            aVar2.a(((yy1.a) bVar).a(list2, ry1.b.a(str2, ry1.b.c(fVar.f495380b)), map, str2));
                        } else if (m17) {
                            aVar2.a(((yy1.a) bVar).a(list2, ry1.b.a(str2, aVar3), map, str2));
                        } else {
                            aVar2.a(((yy1.a) bVar).a(list2, ry1.b.a(str2, ry1.b.c(aVar3)), map, str2));
                        }
                    }
                    aVar.nj(j18, aVar2, list);
                }
            });
        }
    }

    public void Gj(int i17, java.lang.String str, java.util.Map map, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap(map);
        hashMap.put("page_id", java.lang.Integer.valueOf(i17));
        Ej(str, hashMap, i18);
    }

    public void Hj(java.lang.String str, java.lang.String str2, java.util.Map map, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap(map);
        hashMap.put("view_id", str);
        Ej(str2, hashMap, i17);
    }

    public void Ij(long j17, java.lang.String str, java.util.Map map) {
        if (oj()) {
            ky1.b a17 = ky1.c.a();
            a17.f395020a = j17;
            a17.f395022c = str;
            a17.b(map);
            a17.c((java.util.List) ((java.util.concurrent.ConcurrentHashMap) this.f306221h).get(str));
            Jj(a17.a());
        }
    }

    public void Jj(ky1.c cVar) {
        if (cVar == null || !oj()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.DataReportService", "[reportStandardEvent] eventData : " + cVar);
        bz1.a aVar = new bz1.a();
        java.lang.String str = cVar.f395028c;
        aVar.f118296a = str;
        boolean c17 = u46.l.c(str, "cgi_req");
        java.util.Map map = cVar.f395029d;
        if (c17 || u46.l.c(str, "cgi_resp")) {
            yy1.b bVar = this.f306219f.f495370c;
            if (bVar != null) {
                aVar.a(((yy1.a) bVar).a(null, ry1.b.a(str, ry1.b.c(this.f306223m.f495380b)), map, str));
            }
        } else {
            aVar.a(map);
        }
        nj(cVar.f395026a, aVar, cVar.f395030e);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Kj(long r8, java.lang.String r10, java.lang.Object r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy1.a.Kj(long, java.lang.String, java.lang.Object, java.util.Map):void");
    }

    public void Lj(long j17, java.lang.String str, java.util.Map map, java.util.List list) {
        if (oj()) {
            ky1.b a17 = ky1.c.a();
            a17.f395020a = j17;
            a17.f395022c = str;
            a17.b(map);
            a17.c(list);
            Jj(a17.a());
        }
    }

    public dy1.r Mj(java.lang.Object obj) {
        vy1.a h17;
        if (obj != null && oj()) {
            if (!sz1.a.m(obj) && !sz1.a.n(obj) && !sz1.a.i(obj)) {
                vy1.c b17 = uy1.b.b(obj, false);
                if (b17 != null) {
                    b17.a();
                }
                vy1.b a17 = uy1.b.a(obj, false);
                if (a17 != null) {
                    a17.a();
                }
            }
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (sz1.a.n(obj)) {
                vy1.c l17 = uy1.a.l(obj, false);
                if (l17 != null) {
                    l17.a();
                }
                if (obj instanceof android.view.View) {
                    android.view.View view = (android.view.View) obj;
                    jz1.e.Di().aj(view);
                    kz1.e.Bi().Ni(view);
                }
            } else if (sz1.a.m(obj)) {
                vy1.b j17 = uy1.a.j(obj, false);
                if (j17 != null) {
                    j17.a();
                }
            } else if (sz1.a.i(obj) && (h17 = uy1.a.h(obj, false)) != null) {
                ((java.util.concurrent.ConcurrentHashMap) h17.f522949a).clear();
                ((java.util.concurrent.ConcurrentHashMap) h17.f522950b).clear();
                ((java.util.concurrent.CopyOnWriteArrayList) h17.f522951c).clear();
                ((java.util.concurrent.ConcurrentHashMap) h17.f522952d).clear();
                ((java.util.concurrent.ConcurrentHashMap) h17.f522953e).clear();
                ((java.util.concurrent.ConcurrentHashMap) h17.f522954f).clear();
            }
        }
        return this;
    }

    public void Ni(final int i17) {
        cz1.b bVar = cz1.a.a().f306511d;
        if (bVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a) {
            final com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a) bVar;
            if (i17 == 2) {
                aVar.t(null);
            } else {
                aVar.getClass();
                sz1.i.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$h
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a.this.f178285x = i17;
                    }
                });
            }
        }
    }

    public dy1.r Nj(java.lang.Object obj) {
        if (obj != null && oj()) {
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (!sz1.a.m(obj)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[resetSessionParams] target is not a page!!!");
                return this;
            }
            hz1.a aVar = new hz1.a(obj);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f306223m.f495397s;
            java.util.Iterator it = concurrentHashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hz1.a aVar2 = (hz1.a) it.next();
                if (aVar.d(aVar2)) {
                    java.util.Map map = (java.util.Map) concurrentHashMap.get(aVar2);
                    if (map != null && map.size() > 0) {
                        map.clear();
                    }
                }
            }
        }
        return this;
    }

    public dy1.r Oj(java.lang.Object obj) {
        Mj(obj);
        return this;
    }

    public void Pj(long j17, java.lang.String str, java.util.Map map, int i17, boolean z17) {
        if (u46.l.e(str) || map == null || i17 <= 0 || !oj()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(i17));
        Qj(j17, str, map, arrayList, z17);
    }

    public void Qj(long j17, java.lang.String str, java.util.Map map, java.util.List list, boolean z17) {
        if (u46.l.e(str) || map == null || list == null || list.size() <= 0 || !oj()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.DataReportService", "[routeEvent] eventId : " + str + ", params : " + map + ", routeRules : " + list + ", isRtReport : " + z17);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (num.intValue() > 0) {
                ky1.d dVar = new ky1.d();
                dVar.f395032a = 0;
                dVar.f395033b = num.intValue();
                dVar.f395034c = z17;
                synchronized (this.f306222i) {
                    java.util.Iterator it6 = ((java.util.ArrayList) this.f306222i).iterator();
                    while (it6.hasNext()) {
                        gy1.a aVar = (gy1.a) it6.next();
                        if (aVar.b() == dVar.f395032a && aVar.a(j17, str, map, dVar)) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public dy1.r Rj(java.lang.Object obj, iy1.a aVar) {
        vy1.b j17;
        vy1.b a17;
        if (obj != null && aVar != null && oj()) {
            boolean m17 = sz1.a.m(obj);
            int i17 = aVar.f377280d;
            if (!m17) {
                java.util.Map map = uy1.b.f513447a;
                if (i17 > 0 && (a17 = uy1.b.a(obj, true)) != null) {
                    a17.f522958d = i17;
                }
            }
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (sz1.a.m(obj) && (j17 = uy1.a.j(obj, true)) != null && i17 > 0) {
                j17.f522958d = i17;
            }
        }
        return this;
    }

    public dy1.r Sj(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        if (obj != null && !u46.l.e(str) && obj2 != null && oj()) {
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (!sz1.a.m(obj)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[setBizParam] target is not a page!!!");
                return this;
            }
            hz1.a aVar = new hz1.a(obj);
            sy1.f fVar = this.f306223m;
            fVar.getClass();
            if (!u46.l.e(str)) {
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
                concurrentHashMap.put(str, obj2);
            }
        }
        return this;
    }

    public dy1.r Tj(java.lang.Object obj, int i17, int i18, boolean z17) {
        jk(obj, i17, 1, i18, false, z17);
        return this;
    }

    public void Uj(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.DataReportService", "[setEnterMethod] enterMethod : " + str);
        this.f306223m.f495389k = str;
    }

    public long Vi(java.lang.Object obj, java.lang.String str) {
        vy1.a h17;
        java.lang.Object obj2;
        vy1.b j17;
        java.lang.Object obj3;
        vy1.c l17;
        java.lang.Object obj4;
        if (obj == null || u46.l.e(str)) {
            return 0L;
        }
        if (sz1.a.n(obj)) {
            int i17 = uy1.a.f513440a;
            if (u46.l.e(str) || (l17 = uy1.a.l(obj, false)) == null || (obj4 = ((java.util.concurrent.ConcurrentHashMap) l17.f522986k).get(str)) == null || !(obj4 instanceof java.lang.Long)) {
                return 0L;
            }
            return ((java.lang.Long) obj4).longValue();
        }
        if (sz1.a.m(obj)) {
            int i18 = uy1.a.f513440a;
            if (u46.l.e(str) || (j17 = uy1.a.j(obj, false)) == null || (obj3 = ((java.util.concurrent.ConcurrentHashMap) j17.f522968n).get(str)) == null || !(obj3 instanceof java.lang.Long)) {
                return 0L;
            }
            return ((java.lang.Long) obj3).longValue();
        }
        if (sz1.a.i(obj)) {
            int i19 = uy1.a.f513440a;
            if (u46.l.e(str) || (h17 = uy1.a.h(obj, false)) == null || (obj2 = ((java.util.concurrent.ConcurrentHashMap) h17.f522954f).get(str)) == null || !(obj2 instanceof java.lang.Long)) {
                return 0L;
            }
            return ((java.lang.Long) obj2).longValue();
        }
        if (!sz1.a.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[getLastReportTime] param target is not a right type, please cheak!!!");
            return 0L;
        }
        throw new java.lang.RuntimeException("[getLastReportTime] param target is " + obj + ", type of target is error, please cheak !!!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dy1.r Vj(java.lang.Object r10, int r11, gy1.b r12) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy1.a.Vj(java.lang.Object, int, gy1.b):dy1.r");
    }

    public dy1.r Wj(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2) {
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        if (obj == null || u46.l.e(str) || u46.l.e(str2) || obj2 == null || !oj()) {
            return this;
        }
        java.lang.Object cj6 = cj(obj);
        if (cj6 != null) {
            obj = cj6;
        }
        if (sz1.a.n(obj)) {
            vy1.c l17 = uy1.a.l(obj, true);
            if (l17 == null || (map3 = l17.f522979d) == null) {
                return this;
            }
            java.util.Map map4 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map3).get(str);
            if (map4 == null) {
                map4 = new java.util.concurrent.ConcurrentHashMap();
                ((java.util.concurrent.ConcurrentHashMap) map3).put(str, map4);
            }
            map4.put(str2, obj2);
        } else if (sz1.a.m(obj)) {
            vy1.b j17 = uy1.a.j(obj, true);
            if (j17 == null || (map2 = j17.f522962h) == null) {
                return this;
            }
            java.util.Map map5 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map2).get(str);
            if (map5 == null) {
                map5 = new java.util.concurrent.ConcurrentHashMap();
                ((java.util.concurrent.ConcurrentHashMap) map2).put(str, map5);
            }
            map5.put(str2, obj2);
        } else if (sz1.a.i(obj)) {
            vy1.a h17 = uy1.a.h(obj, true);
            if (h17 == null || (map = h17.f522950b) == null) {
                return this;
            }
            java.util.Map map6 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
            if (map6 == null) {
                map6 = new java.util.concurrent.ConcurrentHashMap();
                ((java.util.concurrent.ConcurrentHashMap) map).put(str, map6);
            }
            map6.put(str2, obj2);
        } else {
            if (sz1.a.j()) {
                throw new java.lang.RuntimeException("[setEventParam] param target is " + obj + ", type of target is error, please cheak !!!");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[setEventParam] param target is not a right type, please cheak!!!");
        }
        return this;
    }

    public dy1.r Xj(java.lang.Object obj, java.lang.String str, java.util.Map map) {
        java.util.Map map2;
        java.util.Map map3;
        java.util.Map map4;
        if (obj == null || u46.l.e(str) || map == null || map.size() <= 0 || !oj()) {
            return this;
        }
        java.lang.Object cj6 = cj(obj);
        if (cj6 != null) {
            obj = cj6;
        }
        if (sz1.a.n(obj)) {
            vy1.c l17 = uy1.a.l(obj, true);
            if (l17 == null || (map4 = l17.f522979d) == null) {
                return this;
            }
            java.util.Map map5 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map4).get(str);
            if (map5 == null) {
                map5 = new java.util.concurrent.ConcurrentHashMap();
                ((java.util.concurrent.ConcurrentHashMap) map4).put(str, map5);
            }
            map5.putAll(map);
        } else if (sz1.a.m(obj)) {
            vy1.b j17 = uy1.a.j(obj, true);
            if (j17 == null || (map3 = j17.f522962h) == null) {
                return this;
            }
            java.util.Map map6 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map3).get(str);
            if (map6 == null) {
                map6 = new java.util.concurrent.ConcurrentHashMap();
                ((java.util.concurrent.ConcurrentHashMap) map3).put(str, map6);
            }
            map6.putAll(map);
        } else if (sz1.a.i(obj)) {
            vy1.a h17 = uy1.a.h(obj, true);
            if (h17 == null || (map2 = h17.f522950b) == null) {
                return this;
            }
            java.util.Map map7 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map2).get(str);
            if (map7 == null) {
                map7 = new java.util.concurrent.ConcurrentHashMap();
                ((java.util.concurrent.ConcurrentHashMap) map2).put(str, map7);
            }
            map7.putAll(map);
        } else {
            if (sz1.a.j()) {
                throw new java.lang.RuntimeException("[setEventParams] param target is " + obj + ", type of target is error, please cheak !!!");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[setEventParams] param target is not a right type, please cheak!!!");
        }
        return this;
    }

    public void Yj(java.lang.Object obj, java.lang.String str, long j17) {
        vy1.a h17;
        vy1.b j18;
        if (obj == null || j17 < 0) {
            return;
        }
        if (sz1.a.n(obj)) {
            uy1.a.u(obj, str, j17);
            return;
        }
        if (sz1.a.m(obj)) {
            int i17 = uy1.a.f513440a;
            if (u46.l.e(str) || j17 < 0 || (j18 = uy1.a.j(obj, true)) == null) {
                return;
            }
            ((java.util.concurrent.ConcurrentHashMap) j18.f522968n).put(str, java.lang.Long.valueOf(j17));
            return;
        }
        if (sz1.a.i(obj)) {
            int i18 = uy1.a.f513440a;
            if (u46.l.e(str) || j17 < 0 || (h17 = uy1.a.h(obj, true)) == null) {
                return;
            }
            ((java.util.concurrent.ConcurrentHashMap) h17.f522954f).put(str, java.lang.Long.valueOf(j17));
            return;
        }
        if (!sz1.a.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[setLastReportTime] param target is not a right type, please cheak!!!");
            return;
        }
        throw new java.lang.RuntimeException("[setLastReportTime] param target is " + obj + ", type of target is error, please cheak !!!");
    }

    public int Zi(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        if (sz1.a.m(obj)) {
            return uy1.a.k(obj);
        }
        vy1.b a17 = uy1.b.a(obj, false);
        if (a17 == null) {
            return 0;
        }
        return a17.f522955a;
    }

    public dy1.r Zj(java.lang.Object obj, int i17) {
        vy1.b j17;
        vy1.b a17;
        if (obj != null && i17 >= 0 && oj()) {
            if (!sz1.a.m(obj)) {
                java.util.Map map = uy1.b.f513447a;
                if (i17 > 0 && (a17 = uy1.b.a(obj, true)) != null) {
                    a17.f522955a = i17;
                }
            }
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (sz1.a.m(obj) && (j17 = uy1.a.j(obj, true)) != null && i17 > 0) {
                j17.f522955a = i17;
            }
        }
        return this;
    }

    public java.lang.String aj(java.lang.Object obj) {
        vy1.b j17;
        if (obj == null) {
            return null;
        }
        if (!sz1.a.m(obj)) {
            vy1.b a17 = uy1.b.a(obj, false);
            if (a17 == null) {
                return null;
            }
            return a17.f522956b;
        }
        java.lang.Object cj6 = cj(obj);
        if (cj6 != null) {
            obj = cj6;
        }
        if (!sz1.a.m(obj) || (j17 = uy1.a.j(obj, false)) == null) {
            return null;
        }
        return j17.f522956b;
    }

    public dy1.r ak(java.lang.Object obj, iy1.c cVar) {
        if (obj != null && cVar != null && oj()) {
            Zj(obj, cVar.f377392d);
        }
        return this;
    }

    public java.util.Map bj(java.lang.Object obj) {
        java.util.Map map;
        if (obj == null) {
            return null;
        }
        if (sz1.a.n(obj)) {
            vy1.c l17 = uy1.a.l(obj, false);
            if (l17 == null || (map = l17.f522978c) == null) {
                return null;
            }
            return map;
        }
        if (sz1.a.m(obj)) {
            vy1.b j17 = uy1.a.j(obj, false);
            if (j17 == null) {
                return null;
            }
            return j17.f522959e;
        }
        if (sz1.a.i(obj)) {
            vy1.a h17 = uy1.a.h(obj, false);
            if (h17 == null) {
                return null;
            }
            return h17.f522949a;
        }
        vy1.c b17 = uy1.b.b(obj, false);
        if (b17 != null) {
            return b17.f522978c;
        }
        vy1.b a17 = uy1.b.a(obj, false);
        if (a17 != null) {
            return a17.f522959e;
        }
        return null;
    }

    public dy1.r bk(java.lang.Object obj, boolean z17) {
        if (obj != null && oj()) {
            if (!sz1.a.m(obj)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[setPageIsFilterFlag] target is not a page!!!");
                return this;
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            vy1.b j17 = uy1.a.j(obj, true);
            if (j17 != null && !u46.l.e("page_is_filter")) {
                ((java.util.concurrent.ConcurrentHashMap) j17.f522965k).put("page_is_filter", valueOf);
            }
        }
        return this;
    }

    public java.lang.Object cj(java.lang.Object obj) {
        java.lang.ref.WeakReference weakReference;
        if (obj == null || (weakReference = (java.lang.ref.WeakReference) ((java.util.WeakHashMap) uy1.b.f513449c).get(obj)) == null || weakReference.get() == null) {
            return null;
        }
        return weakReference.get();
    }

    public dy1.r ck(java.lang.Object obj, boolean z17) {
        if (obj != null && oj()) {
            if (!sz1.a.m(obj)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[setPageIsFullSubPage] target is not a page!!!");
                return this;
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            vy1.b j17 = uy1.a.j(obj, true);
            if (j17 != null && !u46.l.e("page_is_full_subpage")) {
                ((java.util.concurrent.ConcurrentHashMap) j17.f522965k).put("page_is_full_subpage", valueOf);
            }
        }
        return this;
    }

    public dy1.r dk(java.lang.Object obj, java.lang.String str) {
        vy1.b j17;
        vy1.b a17;
        if (obj != null && !u46.l.e(str) && oj()) {
            if (!sz1.a.m(obj)) {
                java.util.Map map = uy1.b.f513447a;
                if (!u46.l.e(str) && (a17 = uy1.b.a(obj, true)) != null) {
                    a17.f522956b = str;
                }
            }
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (sz1.a.m(obj) && (j17 = uy1.a.j(obj, true)) != null && !u46.l.e(str)) {
                j17.f522956b = str;
            }
        }
        return this;
    }

    public dy1.r ek(java.lang.Object obj, int i17, int i18) {
        return ik(obj, i17, i18);
    }

    public long fj(java.lang.Object obj, java.lang.String str) {
        vy1.a h17;
        java.lang.Object obj2;
        vy1.b j17;
        java.lang.Object obj3;
        vy1.c l17;
        java.lang.Object obj4;
        if (obj == null || u46.l.e(str)) {
            return 0L;
        }
        java.lang.Object cj6 = cj(obj);
        if (cj6 != null) {
            obj = cj6;
        }
        if (sz1.a.n(obj)) {
            int i17 = uy1.a.f513440a;
            if (u46.l.e(str) || (l17 = uy1.a.l(obj, false)) == null || (obj4 = ((java.util.concurrent.ConcurrentHashMap) l17.f522985j).get(str)) == null || !(obj4 instanceof java.lang.Long)) {
                return 0L;
            }
            return ((java.lang.Long) obj4).longValue();
        }
        if (sz1.a.m(obj)) {
            int i18 = uy1.a.f513440a;
            if (u46.l.e(str) || (j17 = uy1.a.j(obj, false)) == null || (obj3 = ((java.util.concurrent.ConcurrentHashMap) j17.f522967m).get(str)) == null || !(obj3 instanceof java.lang.Long)) {
                return 0L;
            }
            return ((java.lang.Long) obj3).longValue();
        }
        if (sz1.a.i(obj)) {
            int i19 = uy1.a.f513440a;
            if (u46.l.e(str) || (h17 = uy1.a.h(obj, false)) == null || (obj2 = ((java.util.concurrent.ConcurrentHashMap) h17.f522953e).get(str)) == null || !(obj2 instanceof java.lang.Long)) {
                return 0L;
            }
            return ((java.lang.Long) obj2).longValue();
        }
        if (!sz1.a.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[getReportInterval] param target is not a right type, please cheak!!!");
            return 0L;
        }
        throw new java.lang.RuntimeException("[getReportInterval] param target is " + obj + ", type of target is error, please cheak !!!");
    }

    public dy1.r fk(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        vy1.a h17;
        if (obj != null && !u46.l.e(str) && obj2 != null && oj()) {
            if (!sz1.a.m(obj) && !sz1.a.n(obj) && !sz1.a.i(obj)) {
                java.util.Map map = uy1.b.f513447a;
                if (!u46.l.e(str) && !u46.l.e(str)) {
                    vy1.c b17 = uy1.b.b(obj, true);
                    if (b17 != null) {
                        ((java.util.concurrent.ConcurrentHashMap) b17.f522978c).put(str, obj2);
                    }
                    vy1.b a17 = uy1.b.a(obj, true);
                    if (a17 != null) {
                        ((java.util.concurrent.ConcurrentHashMap) a17.f522959e).put(str, obj2);
                    }
                }
            }
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (sz1.a.n(obj)) {
                vy1.c l17 = uy1.a.l(obj, true);
                if (l17 != null && !u46.l.e(str)) {
                    ((java.util.concurrent.ConcurrentHashMap) l17.f522978c).put(str, obj2);
                }
            } else if (sz1.a.m(obj)) {
                vy1.b j17 = uy1.a.j(obj, true);
                if (j17 != null && !u46.l.e(str)) {
                    ((java.util.concurrent.ConcurrentHashMap) j17.f522959e).put(str, obj2);
                }
            } else if (sz1.a.i(obj)) {
                int i17 = uy1.a.f513440a;
                if (!u46.l.e(str) && (h17 = uy1.a.h(obj, true)) != null) {
                    ((java.util.concurrent.ConcurrentHashMap) h17.f522949a).put(str, obj2);
                }
            }
        }
        return this;
    }

    public dy1.r gk(java.lang.Object obj, java.util.Map map) {
        vy1.a h17;
        java.lang.Object obj2;
        java.lang.Object obj3;
        if (obj != null && map != null && map.size() > 0 && oj()) {
            if (!sz1.a.m(obj) && !sz1.a.n(obj) && !sz1.a.i(obj)) {
                java.util.Map map2 = uy1.b.f513447a;
                if (map.size() > 0) {
                    vy1.c b17 = uy1.b.b(obj, true);
                    if (b17 != null) {
                        for (java.lang.String str : map.keySet()) {
                            if (!u46.l.e(str) && (obj3 = map.get(str)) != null) {
                                ((java.util.concurrent.ConcurrentHashMap) b17.f522978c).put(str, obj3);
                            }
                        }
                    }
                    vy1.b a17 = uy1.b.a(obj, true);
                    if (a17 != null) {
                        for (java.lang.String str2 : map.keySet()) {
                            if (!u46.l.e(str2) && (obj2 = map.get(str2)) != null) {
                                ((java.util.concurrent.ConcurrentHashMap) a17.f522959e).put(str2, obj2);
                            }
                        }
                    }
                }
            }
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (sz1.a.n(obj)) {
                vy1.c l17 = uy1.a.l(obj, true);
                if (l17 != null) {
                    java.util.Map map3 = l17.f522978c;
                    if (map.size() <= 0) {
                        ((java.util.concurrent.ConcurrentHashMap) map3).clear();
                    } else {
                        for (java.lang.String str3 : map.keySet()) {
                            if (!u46.l.e(str3)) {
                                java.lang.Object obj4 = map.get(str3);
                                if (obj4 != null) {
                                    ((java.util.concurrent.ConcurrentHashMap) map3).put(str3, obj4);
                                } else {
                                    ((java.util.concurrent.ConcurrentHashMap) map3).remove(str3);
                                }
                            }
                        }
                    }
                }
            } else if (sz1.a.m(obj)) {
                uy1.a.s(obj, map);
            } else if (sz1.a.i(obj)) {
                int i17 = uy1.a.f513440a;
                if (map.size() > 0 && (h17 = uy1.a.h(obj, true)) != null) {
                    ((java.util.concurrent.ConcurrentHashMap) h17.f522949a).putAll(map);
                }
            }
        }
        return this;
    }

    public int hj(java.lang.Object obj) {
        int i17 = 0;
        if (obj == null) {
            return 0;
        }
        if (sz1.a.n(obj)) {
            return uy1.a.n(obj);
        }
        if (sz1.a.m(obj)) {
            vy1.b j17 = uy1.a.j(obj, false);
            if (j17 != null) {
                java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) j17.f522966l).keySet().iterator();
                while (it.hasNext()) {
                    i17 |= ((java.lang.Integer) it.next()).intValue();
                }
            }
            return i17;
        }
        if (sz1.a.i(obj)) {
            vy1.a h17 = uy1.a.h(obj, false);
            if (h17 != null) {
                java.util.Iterator it6 = ((java.util.concurrent.ConcurrentHashMap) h17.f522952d).keySet().iterator();
                while (it6.hasNext()) {
                    i17 |= ((java.lang.Integer) it6.next()).intValue();
                }
            }
            return i17;
        }
        vy1.c b17 = uy1.b.b(obj, false);
        if (b17 != null) {
            java.util.Iterator it7 = ((java.util.concurrent.ConcurrentHashMap) b17.f522984i).keySet().iterator();
            while (it7.hasNext()) {
                i17 |= ((java.lang.Integer) it7.next()).intValue();
            }
        } else {
            vy1.b a17 = uy1.b.a(obj, false);
            if (a17 != null) {
                java.util.Iterator it8 = ((java.util.concurrent.ConcurrentHashMap) a17.f522966l).keySet().iterator();
                while (it8.hasNext()) {
                    i17 |= ((java.lang.Integer) it8.next()).intValue();
                }
            }
        }
        return i17;
    }

    public dy1.r hk(java.lang.String str, java.lang.Object obj) {
        if (u46.l.e(str) || obj == null || !oj()) {
            return this;
        }
        synchronized (this.f306220g) {
            ((java.util.HashMap) this.f306220g).put(str, obj);
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List ij(java.lang.Object r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy1.a.ij(java.lang.Object, java.lang.String):java.util.List");
    }

    public dy1.r ik(java.lang.Object obj, int i17, int i18) {
        if (obj != null && oj()) {
            kk(obj, i17, i18, false);
        }
        return this;
    }

    public dy1.r jk(java.lang.Object obj, int i17, int i18, int i19, boolean z17, boolean z18) {
        vy1.a h17;
        boolean z19;
        java.util.List e17;
        boolean z27;
        java.util.List b17;
        boolean z28;
        java.util.List e18;
        boolean z29;
        if (obj != null && oj()) {
            if (!sz1.a.m(obj) && !sz1.a.n(obj) && !sz1.a.i(obj)) {
                vy1.c b18 = uy1.b.b(obj, true);
                if (b18 != null && (e18 = sz1.g.e(i17)) != null) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) e18;
                    if (arrayList.size() > 0) {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int intValue = ((java.lang.Integer) it.next()).intValue();
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) b18.f522984i;
                            java.util.List list = (java.util.List) concurrentHashMap.get(java.lang.Integer.valueOf(intValue));
                            if (list == null) {
                                list = new java.util.ArrayList();
                                concurrentHashMap.put(java.lang.Integer.valueOf(intValue), list);
                            }
                            java.util.Iterator it6 = list.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    z29 = false;
                                    break;
                                }
                                ky1.d dVar = (ky1.d) it6.next();
                                if (dVar.f395032a == i18 && dVar.f395033b == i19 && dVar.f395034c == z17 && dVar.f395035d == z18) {
                                    z29 = true;
                                    break;
                                }
                            }
                            if (!z29) {
                                ky1.d dVar2 = new ky1.d();
                                dVar2.f395032a = i18;
                                dVar2.f395033b = i19;
                                dVar2.f395034c = z17;
                                dVar2.f395035d = z18;
                                list.add(dVar2);
                            }
                        }
                    }
                }
                vy1.b a17 = uy1.b.a(obj, true);
                if (a17 != null && (b17 = sz1.g.b(i17)) != null) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) b17;
                    if (arrayList2.size() > 0) {
                        java.util.Iterator it7 = arrayList2.iterator();
                        while (it7.hasNext()) {
                            int intValue2 = ((java.lang.Integer) it7.next()).intValue();
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) a17.f522966l;
                            java.util.List list2 = (java.util.List) concurrentHashMap2.get(java.lang.Integer.valueOf(intValue2));
                            if (list2 == null) {
                                list2 = new java.util.ArrayList();
                                concurrentHashMap2.put(java.lang.Integer.valueOf(intValue2), list2);
                            }
                            java.util.Iterator it8 = list2.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    z28 = false;
                                    break;
                                }
                                ky1.d dVar3 = (ky1.d) it8.next();
                                if (dVar3.f395033b == i19 && dVar3.f395034c == z17) {
                                    z28 = true;
                                    break;
                                }
                            }
                            if (!z28) {
                                ky1.d dVar4 = new ky1.d();
                                dVar4.f395033b = i19;
                                dVar4.f395034c = z17;
                                list2.add(dVar4);
                            }
                        }
                    }
                }
            }
            java.lang.Object cj6 = cj(obj);
            java.lang.Object obj2 = cj6 != null ? cj6 : obj;
            if (sz1.a.n(obj2)) {
                vy1.c l17 = uy1.a.l(obj2, true);
                if (l17 != null && (e17 = sz1.g.e(i17)) != null) {
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) e17;
                    if (arrayList3.size() > 0) {
                        java.util.Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            int intValue3 = ((java.lang.Integer) it9.next()).intValue();
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) l17.f522984i;
                            java.util.List list3 = (java.util.List) concurrentHashMap3.get(java.lang.Integer.valueOf(intValue3));
                            if (list3 == null) {
                                list3 = new java.util.ArrayList();
                                concurrentHashMap3.put(java.lang.Integer.valueOf(intValue3), list3);
                            }
                            java.util.Iterator it10 = list3.iterator();
                            while (true) {
                                if (!it10.hasNext()) {
                                    z27 = false;
                                    break;
                                }
                                ky1.d dVar5 = (ky1.d) it10.next();
                                if (dVar5.f395032a == i18 && dVar5.f395033b == i19 && dVar5.f395034c == z17 && dVar5.f395035d == z18) {
                                    z27 = true;
                                    break;
                                }
                            }
                            if (!z27) {
                                ky1.d dVar6 = new ky1.d();
                                dVar6.f395032a = i18;
                                dVar6.f395033b = i19;
                                dVar6.f395034c = z17;
                                dVar6.f395035d = z18;
                                list3.add(dVar6);
                            }
                        }
                    }
                }
                java.util.List c17 = sz1.g.c(uy1.a.n(obj2));
                if (c17 == null || ((java.util.ArrayList) c17).size() <= 0) {
                    if (obj2 instanceof android.view.View) {
                        jz1.e.Di().aj((android.view.View) obj2);
                    }
                } else if (obj2 instanceof android.view.View) {
                    jz1.e.Di().Ai((android.view.View) obj2);
                }
                java.util.List d17 = sz1.g.d(uy1.a.n(obj2));
                if (d17 == null || ((java.util.ArrayList) d17).size() <= 0) {
                    if (obj2 instanceof android.view.View) {
                        kz1.e.Bi().Ni((android.view.View) obj2);
                    }
                } else if (obj2 instanceof android.view.View) {
                    kz1.e Bi = kz1.e.Bi();
                    android.view.View view = (android.view.View) obj2;
                    Bi.getClass();
                    if (kz1.e.Di()) {
                        sz1.i.c(new kz1.RunnableC29056x2e755d(Bi, view));
                    }
                }
            } else if (sz1.a.m(obj2)) {
                uy1.a.t(obj2, i17, i18, i19, z17, z18);
            } else if (sz1.a.i(obj2) && (h17 = uy1.a.h(obj2, true)) != null) {
                java.util.ArrayList arrayList4 = (java.util.ArrayList) sz1.g.a(i17);
                if (arrayList4.size() > 0) {
                    java.util.Iterator it11 = arrayList4.iterator();
                    while (it11.hasNext()) {
                        int intValue4 = ((java.lang.Integer) it11.next()).intValue();
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap4 = (java.util.concurrent.ConcurrentHashMap) h17.f522952d;
                        java.util.List list4 = (java.util.List) concurrentHashMap4.get(java.lang.Integer.valueOf(intValue4));
                        if (list4 == null) {
                            list4 = new java.util.ArrayList();
                            concurrentHashMap4.put(java.lang.Integer.valueOf(intValue4), list4);
                        }
                        java.util.Iterator it12 = list4.iterator();
                        while (true) {
                            if (!it12.hasNext()) {
                                z19 = false;
                                break;
                            }
                            ky1.d dVar7 = (ky1.d) it12.next();
                            if (dVar7.f395032a == i18 && dVar7.f395033b == i19 && dVar7.f395034c == z17 && dVar7.f395035d == z18) {
                                z19 = true;
                                break;
                            }
                        }
                        if (!z19) {
                            ky1.d dVar8 = new ky1.d();
                            dVar8.f395032a = i18;
                            dVar8.f395033b = i19;
                            dVar8.f395034c = z17;
                            dVar8.f395035d = z18;
                            list4.add(dVar8);
                        }
                    }
                }
            }
        }
        return this;
    }

    public dy1.r kk(java.lang.Object obj, int i17, int i18, boolean z17) {
        jk(obj, i17, 0, i18, z17, false);
        return this;
    }

    public dy1.r lk(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        if (obj != null && !u46.l.e(str) && obj2 != null && oj()) {
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (!sz1.a.m(obj)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[setSessionParam] target is not a page!!!");
                return this;
            }
            hz1.a aVar = new hz1.a(obj);
            sy1.f fVar = this.f306223m;
            fVar.getClass();
            if (!u46.l.e(str)) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) fVar.f495397s;
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
                concurrentHashMap.put(str, obj2);
            }
        }
        return this;
    }

    public java.lang.String mj(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (sz1.a.n(obj)) {
            return uy1.a.m(obj);
        }
        vy1.c b17 = uy1.b.b(obj, false);
        if (b17 == null) {
            return null;
        }
        return b17.f522976a;
    }

    public dy1.r mk(java.lang.Object obj, java.util.Map map) {
        if (obj != null && map != null && map.size() > 0 && oj()) {
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (!sz1.a.m(obj)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[setSessionParams] target is not a page!!!");
                return this;
            }
            this.f306223m.g(new hz1.a(obj), map);
        }
        return this;
    }

    public final void nj(long j17, bz1.a aVar, java.util.List list) {
        java.util.HashMap hashMap;
        if (aVar == null || list == null || list.size() <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.DataReportService", "[handleReportData] reportData : " + aVar + ", routeRules : " + list);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        synchronized (this.f306220g) {
            for (java.lang.String str : ((java.util.HashMap) this.f306220g).keySet()) {
                hashMap3.put(str, ((java.util.HashMap) this.f306220g).get(str));
            }
        }
        if (hashMap3.size() > 0) {
            hashMap2.putAll(hashMap3);
        }
        java.util.HashMap hashMap4 = new java.util.HashMap();
        wi(aVar.f118296a, hashMap4);
        this.f306223m.f495388j = aVar.f118296a;
        java.util.Map map = aVar.f118297b;
        if (map != null && ((java.util.HashMap) map).size() > 0) {
            hashMap4.putAll(map);
        }
        ly1.b bVar = this.f306219f.f495369b;
        if (bVar != null) {
            ((sy1.d) bVar).a(hashMap2);
        }
        java.lang.String str2 = aVar.f118296a;
        if (!u46.l.e(str2)) {
            hashMap2.put("report_seq", java.lang.Integer.valueOf(this.f306224n));
            this.f306224n++;
            java.util.HashMap hashMap5 = (java.util.HashMap) this.f306225o;
            int intValue = hashMap5.containsKey(str2) ? ((java.lang.Integer) hashMap5.get(str2)).intValue() : 0;
            hashMap2.put("event_seq", java.lang.Integer.valueOf(intValue));
            hashMap5.put(str2, java.lang.Integer.valueOf(intValue + 1));
        }
        if (this.f306219f.f495370c != null) {
            if (u46.l.e(aVar.f118296a)) {
                hashMap = null;
            } else {
                java.util.HashMap hashMap6 = new java.util.HashMap();
                if (hashMap2.size() > 0) {
                    hashMap6.putAll(hashMap2);
                }
                if (hashMap4.size() > 0) {
                    hashMap6.put("udf_kv", hashMap4);
                }
                hashMap = hashMap6;
            }
            if (hashMap == null || hashMap.size() <= 0) {
                return;
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ky1.d dVar = (ky1.d) it.next();
                synchronized (this.f306222i) {
                    java.util.Iterator it6 = ((java.util.ArrayList) this.f306222i).iterator();
                    while (it6.hasNext()) {
                        gy1.a aVar2 = (gy1.a) it6.next();
                        if (aVar2.b() == dVar.f395032a && aVar2.a(j17, aVar.f118296a, hashMap, dVar)) {
                            break;
                        }
                    }
                }
                java.lang.String str3 = aVar.f118296a;
                int i17 = dVar.f395032a;
                int i18 = dVar.f395033b;
                if (a.b.c().f81577a) {
                    ry5.c.f().d(hashMap, str3, j17, i17, i18);
                }
            }
        }
    }

    public dy1.r nk(java.lang.Object obj, double d17) {
        vy1.c b17;
        if (obj != null && d17 > 0.0d && d17 <= 1.0d && oj()) {
            if (!sz1.a.n(obj)) {
                java.util.Map map = uy1.b.f513447a;
                if (d17 > 0.0d && d17 <= 1.0d && (b17 = uy1.b.b(obj, true)) != null) {
                    ((java.util.concurrent.ConcurrentHashMap) b17.f522983h).put("view_exp_min_rate", java.lang.Double.valueOf(d17));
                }
            }
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (sz1.a.n(obj)) {
                xy1.b.c(uy1.a.l(obj, true), "view_exp_min_rate", java.lang.Double.valueOf(d17));
            }
        }
        return this;
    }

    public boolean oj() {
        if (!this.f306217d.booleanValue()) {
            return false;
        }
        if (this.f306218e == null) {
            this.f306218e = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_data_report_cloud_switch, true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.DataReportService", "[isOpenSwitch] cloudSwitch : " + this.f306218e);
        }
        return this.f306218e.booleanValue();
    }

    public dy1.r ok(java.lang.Object obj, long j17) {
        vy1.c b17;
        if (obj != null && j17 > 0 && oj()) {
            if (!sz1.a.n(obj)) {
                java.util.Map map = uy1.b.f513447a;
                if (j17 > 0 && (b17 = uy1.b.b(obj, true)) != null) {
                    ((java.util.concurrent.ConcurrentHashMap) b17.f522983h).put("view_exp_min_time", java.lang.Long.valueOf(j17));
                }
            }
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (sz1.a.n(obj)) {
                xy1.b.c(uy1.a.l(obj, true), "view_exp_min_time", java.lang.Long.valueOf(j17));
            }
        }
        return this;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        if (oj()) {
            mz1.b.b().getClass();
            if (context != null && (context instanceof android.app.Application)) {
                ((android.app.Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(mz1.b.b());
            }
            if (nz1.a.f423075c == null) {
                synchronized (nz1.a.class) {
                    if (nz1.a.f423075c == null) {
                        nz1.a.f423075c = new nz1.a();
                    }
                }
            }
            nz1.a aVar = nz1.a.f423075c;
            aVar.getClass();
            xj0.a.h().f536306a = aVar;
            nz1.a.f423074b = true;
            oz1.d c17 = oz1.d.c();
            c17.getClass();
            ez1.g gVar = ez1.g.f339373i;
            gVar.P(c17);
            gz1.d dVar = gz1.d.f359247d;
            dVar.t(c17);
            mz1.b.b().a(c17);
            cz1.a a17 = cz1.a.a();
            lz1.b bVar = new lz1.b();
            cz1.b bVar2 = a17.f306511d;
            if (bVar2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a) bVar2).f178276o = bVar;
            }
            cz1.b bVar3 = a17.f306512e;
            if (bVar3 != null) {
                ((iz1.a) bVar3).f377578i = bVar;
            }
            cz1.b bVar4 = a17.f306513f;
            if (bVar4 != null) {
                ((fz1.a) bVar4).f348820d = bVar;
            }
            cz1.a a18 = cz1.a.a();
            cz1.b bVar5 = a18.f306511d;
            if (bVar5 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a aVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a) bVar5;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageEventMonitor", "[startMonitor]");
                mz1.b.b().a(aVar2);
                rk5.b.f478674d.c(dVar);
                gz1.d.f359256p = true;
                if (nz1.a.f423075c == null) {
                    synchronized (nz1.a.class) {
                        if (nz1.a.f423075c == null) {
                            nz1.a.f423075c = new nz1.a();
                        }
                    }
                }
                nz1.a.f423075c.getClass();
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) nz1.a.f423073a;
                if (!copyOnWriteArrayList.contains(dVar)) {
                    copyOnWriteArrayList.add(dVar);
                }
                xj0.a.h().l(gz1.d.f359253m, gz1.d.f359260t);
                dVar.t(aVar2);
                ((a52.f) ((e42.k0) gm0.j1.s(e42.k0.class))).b(aVar2);
                ez1.g.f339374m = h62.d.vj().Ni(e42.c0.clicfg_data_report_app_event_monitor_type, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.AppEventMonitor", "[startMonitor] mAppEventMonitorType : " + ez1.g.f339374m);
                mz1.b.b().a(gVar);
                ez1.g.f339387z.m43071x58998cd();
                sz1.i.d(ez1.f.f339372d, 300L);
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(ez1.g.f339386y, intentFilter);
                gVar.P(aVar2);
                aVar2.C.mo48813x58998cd();
                aVar2.B.mo48813x58998cd();
            }
            cz1.b bVar6 = a18.f306512e;
            if (bVar6 != null) {
                iz1.a aVar3 = (iz1.a) bVar6;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.ViewEventMonitor", "[startMonitor]");
                e42.k0 k0Var = (e42.k0) gm0.j1.s(e42.k0.class);
                if (k0Var != null) {
                    ((a52.f) k0Var).b(aVar3);
                }
                jz1.e Di = jz1.e.Di();
                Di.getClass();
                xj0.a.h().j(jz1.e.D, Di.B);
                xj0.a.h().l(jz1.e.E, Di.C);
                ((java.util.ArrayList) jz1.e.Di().f384184u).add(aVar3);
                kz1.e Bi = kz1.e.Bi();
                Bi.getClass();
                if (kz1.e.Di()) {
                    xj0.a.h().l(kz1.e.f395371o, Bi.f395381n);
                }
                kz1.e Bi2 = kz1.e.Bi();
                Bi2.getClass();
                if (kz1.e.Di()) {
                    ((java.util.ArrayList) Bi2.f395375e).add(aVar3);
                }
            }
            cz1.b bVar7 = a18.f306513f;
            if (bVar7 != null) {
                fz1.a aVar4 = (fz1.a) bVar7;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.MultiEventMonitor", "[startMonitor]");
                java.util.List list = c01.na.f118883a;
                synchronized (list) {
                    ((java.util.ArrayList) list).add(aVar4);
                }
            }
            sy1.b bVar8 = new sy1.b(null);
            ((java.util.ArrayList) bVar8.f495365a).add(new qz1.c());
            ((java.util.ArrayList) bVar8.f495365a).add(new qz1.a());
            ((java.util.ArrayList) bVar8.f495365a).add(new qz1.b());
            bVar8.f495366b = this.f306227q;
            bVar8.f495367c = new yy1.a();
            sy1.c cVar = new sy1.c(bVar8, null);
            this.f306219f = cVar;
            java.util.List list2 = cVar.f495368a;
            if (list2 != null && ((java.util.ArrayList) list2).size() > 0) {
                synchronized (this.f306222i) {
                    ((java.util.ArrayList) this.f306222i).addAll(list2);
                }
            }
            hk("sdk_version", "3.1.1");
            hk("process_id", java.lang.Integer.valueOf(android.os.Process.myPid()));
            hk("process_name", ((km0.c) gm0.j1.p().a()).f390520a);
            hk(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.c());
            a.b.c().f81577a = sz1.a.j();
            a.b.c().f81582f = new my1.c();
            a.b.c().f81581e = new my1.b();
            xy5.b.f539695a = new my1.a();
            a.b.c().f81583g = new my1.j();
            boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
            a.b c18 = a.b.c();
            if (context == null) {
                c18.getClass();
            } else {
                c18.f81580d = n17;
                q5.b.a().getClass();
                if (context instanceof android.app.Application) {
                    ((android.app.Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(q5.b.a());
                }
                q5.b a19 = q5.b.a();
                a.a aVar5 = new a.a(c18, n17);
                a19.getClass();
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = q5.b.f441667d;
                if (!copyOnWriteArrayList2.contains(aVar5)) {
                    copyOnWriteArrayList2.add(aVar5);
                }
                if (c18.f81581e != null && n17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_id_amoeba_default").putString("sentinel_main_start", "");
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && sz1.a.j()) {
                Di();
            }
        }
    }

    public boolean pj(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("eventId") : null;
        if (optString == null) {
            return false;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String optString2 = jSONObject.optString("params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        if (optString2.length() > 0) {
            linkedHashMap.putAll(my1.r.f414249a.a(new org.json.JSONObject(optString2)));
        }
        java.lang.String optString3 = jSONObject.optString("viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
        if (optString3.length() > 0) {
            linkedHashMap.put("view_id", optString3);
        }
        int optInt = jSONObject.optInt("pageId");
        if (optInt > 0) {
            linkedHashMap.put("page_id", java.lang.Integer.valueOf(optInt));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(optString, null, linkedHashMap, jSONObject.optInt("routeRule"), jSONObject.optBoolean("isBatchReport"));
        return true;
    }

    public dy1.r pk(java.lang.Object obj, java.lang.String str) {
        vy1.c l17;
        vy1.c b17;
        if (obj != null && !u46.l.e(str) && oj()) {
            if (!sz1.a.n(obj)) {
                java.util.Map map = uy1.b.f513447a;
                if (!u46.l.e(str) && (b17 = uy1.b.b(obj, true)) != null) {
                    b17.f522976a = str;
                }
            }
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (sz1.a.n(obj) && (l17 = uy1.a.l(obj, true)) != null) {
                l17.f522976a = str;
            }
        }
        return this;
    }

    public boolean qj(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("eventId") : null;
        if (optString == null) {
            return false;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String optString2 = jSONObject.optString("params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        if (optString2.length() > 0) {
            linkedHashMap.putAll(my1.r.f414249a.a(new org.json.JSONObject(optString2)));
        }
        java.lang.String optString3 = jSONObject.optString("viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
        if (optString3.length() > 0) {
            linkedHashMap.put("view_id", optString3);
        }
        int optInt = jSONObject.optInt("pageId");
        if (optInt > 0) {
            linkedHashMap.put("page_id", java.lang.Integer.valueOf(optInt));
        }
        int optInt2 = jSONObject.optInt("routeRule");
        boolean optBoolean = jSONObject.optBoolean("isRtReport");
        boolean optBoolean2 = jSONObject.optBoolean("isBringPageInfo");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Dj(optString, null, linkedHashMap, 0, kz5.z.B0(new int[]{optInt2}), optBoolean, jSONObject.optBoolean("isBatchReport"), optBoolean2);
        return true;
    }

    public dy1.r qk(android.view.View view, android.view.View view2) {
        if (view != null && view2 != null && oj()) {
            if (!sz1.a.n(view)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[setViewLogicParent] target is not a view!!!");
                return this;
            }
            vy1.c l17 = uy1.a.l(view, true);
            if (l17 != null) {
                l17.f522980e = new java.lang.ref.WeakReference(view2);
            }
        }
        return this;
    }

    public dy1.r rj(android.view.View view) {
        if (view != null && oj()) {
            if (this.f306226p == null) {
                try {
                    java.util.ArrayList arrayList = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.f278359y;
                    java.lang.reflect.Method declaredMethod = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class.getDeclaredMethod("getInstance", new java.lang.Class[0]);
                    declaredMethod.setAccessible(true);
                    p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) declaredMethod.invoke(null, new java.lang.Object[0]);
                    if (activityC1102x9ee2d9f != null) {
                        this.f306226p = new java.lang.ref.WeakReference(activityC1102x9ee2d9f.getWindow());
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            java.lang.ref.WeakReference weakReference = this.f306226p;
            if (weakReference != null && weakReference.get() != null) {
                qk(view, ((android.view.Window) this.f306226p.get()).getDecorView());
            }
        }
        return this;
    }

    public dy1.r rk(java.lang.Object obj, java.util.Map map) {
        gk(obj, map);
        return this;
    }

    public boolean sj(int i17, java.util.Map map, int i18) {
        boolean z17;
        if (kk.m.b(gm0.j1.b().h(), 1000) <= i18) {
            map.put("uin_sample", 1);
            z17 = true;
        } else {
            z17 = false;
        }
        int i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if ((i19 == 788529167 || i19 == 788529166) || z65.c.a()) {
            map.put("uin_inner", 1);
            z17 = true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.v8.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h)) {
            map.put("uin_alpha", 1);
            z17 = true;
        }
        if (j62.e.g().i(java.lang.String.format("clicfg_report_sampling_%s", java.lang.Integer.valueOf(i17)), 0, true, true) != 1) {
            return z17;
        }
        map.put("uin_x", 1);
        return true;
    }

    public dy1.r sk(java.lang.Object obj, int i17, int i18) {
        return ik(obj, i17, i18);
    }

    public void tj(final java.lang.String str, final gy1.d dVar) {
        if (dVar == null || !oj()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.DataReportService", "[obtainAllCommonInfo]");
        sz1.i.b(new java.lang.Runnable() { // from class: cy1.a$$g
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Map map;
                cy1.a aVar = cy1.a.this;
                aVar.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.String str2 = str;
                aVar.wi(str2, hashMap);
                ry1.a a17 = ry1.b.a(str2, ry1.b.c(aVar.f306223m.f495380b));
                if (a17 != null && (map = a17.f482896b) != null && ((java.util.HashMap) map).size() > 0) {
                    hashMap.put("cur_page", map);
                }
                if (hashMap.size() > 0) {
                    dVar.a(hashMap);
                }
            }
        });
    }

    public dy1.r tk(android.view.View view, java.lang.String str) {
        if (view != null && !u46.l.e(str) && oj()) {
            if (!sz1.a.n(view)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataReportService", "[setViewUniqueId] target is not a view!!!");
                return this;
            }
            vy1.c l17 = uy1.a.l(view, true);
            if (l17 != null) {
                l17.f522977b = str;
            }
        }
        return this;
    }

    public void uj(java.lang.String str, int i17, int i18, int i19) {
        cz1.b bVar = cz1.a.a().f306511d;
        if (bVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a) bVar).a0(java.lang.System.currentTimeMillis(), str, i17, i18, i19, 0);
        }
    }

    public void uk(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        intent.setClass(context, com.tencent.mm.plugin.datareport.sample.SampleUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/datareport/DataReportService", "showReportSDKSampleUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/datareport/DataReportService", "showReportSDKSampleUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void vj(java.lang.String str, int i17, int i18, int i19) {
        cz1.b bVar = cz1.a.a().f306511d;
        if (bVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a) bVar).b0(java.lang.System.currentTimeMillis(), str, i17, i18, i19, 0);
        }
    }

    public void vk() {
        java.lang.ref.WeakReference weakReference;
        android.view.Window window;
        cz1.b bVar = cz1.a.a().f306511d;
        if (!(bVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a) || (weakReference = this.f306226p) == null || (window = (android.view.Window) weakReference.get()) == null || !(window.getContext() instanceof android.app.Activity)) {
            return;
        }
        ((lz1.b) ((com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1353x49b0bd5a.p1354xbb6ca34f.p1355x34628f.a) bVar).f178276o).c(java.lang.System.currentTimeMillis(), false);
    }

    public void w8(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null || !oj()) {
            return;
        }
        gz1.d.f359247d.q(componentCallbacksC1101xa17d4670, false);
    }

    public void wi(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        if (u46.l.e(str) || map == null) {
            return;
        }
        sy1.f fVar = this.f306223m;
        fVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) fVar.f495399u;
        java.util.Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            hz1.a aVar = (hz1.a) it.next();
            if (aVar.d(fVar.f495398t)) {
                java.util.Map map2 = (java.util.Map) concurrentHashMap.get(aVar);
                if (map2 != null && map2.size() > 0) {
                    hashMap.putAll(map2);
                }
            }
        }
        if (hashMap.size() > 0) {
            map.putAll(hashMap);
        }
        fVar.getClass();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (hz1.a aVar2 : ((java.util.concurrent.ConcurrentHashMap) fVar.f495394p).keySet()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) fVar.f495397s;
            java.util.Iterator it6 = concurrentHashMap2.keySet().iterator();
            while (true) {
                if (it6.hasNext()) {
                    hz1.a aVar3 = (hz1.a) it6.next();
                    if (aVar3.d(aVar2)) {
                        java.util.Map map3 = (java.util.Map) concurrentHashMap2.get(aVar3);
                        if (map3 != null && map3.size() > 0) {
                            hashMap2.putAll(map3);
                        }
                    }
                }
            }
        }
        if (hashMap2.size() > 0) {
            map.putAll(hashMap2);
        }
        fVar.getClass();
        int i17 = 0;
        try {
            java.util.List e17 = fVar.e();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) e17;
            str2 = "";
            if (arrayList2.size() > 0) {
                arrayList.add((java.lang.String) arrayList2.get(0));
            } else {
                arrayList.add("");
            }
            if (arrayList2.size() > 1) {
                arrayList.add((java.lang.String) arrayList2.get(1));
            } else {
                arrayList.add("");
            }
            if (arrayList2.size() > 2) {
                arrayList.add((java.lang.String) arrayList2.get(arrayList2.size() - 3));
            } else {
                arrayList.add("");
            }
            if (arrayList2.size() > 1) {
                arrayList.add((java.lang.String) arrayList2.get(arrayList2.size() - 2));
            } else {
                arrayList.add("");
            }
            if (arrayList2.size() > 0) {
                arrayList.add((java.lang.String) arrayList2.get(arrayList2.size() - 1));
            } else {
                arrayList.add("");
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (arrayList.size() > 0) {
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    sb6.append((java.lang.String) arrayList.get(i18));
                    if (i18 != arrayList.size() - 1) {
                        sb6.append("&");
                    }
                }
            }
            if (!u46.l.c(sb6.toString(), "&&&&")) {
                str2 = sb6.toString();
            }
        } catch (java.lang.Exception unused) {
            str2 = null;
        }
        if (!u46.l.e(str2)) {
            map.put("session_id", str2);
        }
        java.lang.String str3 = fVar.f495386h;
        if (!u46.l.e(str3)) {
            map.put("last_click_view_id", str3);
        }
        java.lang.String str4 = fVar.f495388j;
        if (!u46.l.e(str4)) {
            map.put("last_report_event_id", str4);
        }
        java.lang.String str5 = fVar.f495384f;
        if (!u46.l.e(str5)) {
            map.put("biz_id", str5);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.util.Iterator it7 = ((java.util.HashMap) fVar.f495391m).keySet().iterator();
        while (it7.hasNext()) {
            java.lang.String b17 = fVar.b(((java.lang.Integer) it7.next()).intValue(), 1);
            if (!u46.l.e(b17)) {
                sb7.append(b17);
                if (i17 != r3.size() - 1) {
                    sb7.append("|");
                }
            }
            i17++;
        }
        java.lang.String sb8 = sb7.toString();
        if (!u46.l.e(sb8)) {
            map.put("context_id", sb8);
        }
        java.lang.String str6 = fVar.f495385g;
        if (u46.l.e(str6)) {
            return;
        }
        map.put("last_biz_id", str6);
    }

    public dy1.r wj(java.lang.Object obj, java.lang.String str) {
        vy1.a h17;
        if (obj != null && !u46.l.e(str) && oj()) {
            if (!sz1.a.m(obj) && !sz1.a.n(obj) && !sz1.a.i(obj)) {
                java.util.Map map = uy1.b.f513447a;
                if (!u46.l.e(str)) {
                    vy1.c b17 = uy1.b.b(obj, false);
                    if (b17 != null) {
                        ((java.util.concurrent.ConcurrentHashMap) b17.f522978c).remove(str);
                    }
                    vy1.b a17 = uy1.b.a(obj, false);
                    if (a17 != null) {
                        ((java.util.concurrent.ConcurrentHashMap) a17.f522959e).remove(str);
                    }
                }
            }
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (sz1.a.n(obj)) {
                vy1.c l17 = uy1.a.l(obj, false);
                if (l17 != null && !u46.l.e(str)) {
                    ((java.util.concurrent.ConcurrentHashMap) l17.f522978c).remove(str);
                }
            } else if (sz1.a.m(obj)) {
                vy1.b j17 = uy1.a.j(obj, false);
                if (j17 != null && !u46.l.e(str)) {
                    ((java.util.concurrent.ConcurrentHashMap) j17.f522959e).remove(str);
                }
            } else if (sz1.a.i(obj)) {
                int i17 = uy1.a.f513440a;
                if (!u46.l.e(str) && (h17 = uy1.a.h(obj, false)) != null) {
                    ((java.util.concurrent.ConcurrentHashMap) h17.f522949a).remove(str);
                }
            }
        }
        return this;
    }

    public dy1.r xj(java.lang.Object obj) {
        vy1.a h17;
        if (obj != null && oj()) {
            if (!sz1.a.m(obj) && !sz1.a.n(obj) && !sz1.a.i(obj)) {
                vy1.c b17 = uy1.b.b(obj, false);
                if (b17 != null) {
                    ((java.util.concurrent.ConcurrentHashMap) b17.f522978c).clear();
                }
                vy1.b a17 = uy1.b.a(obj, false);
                if (a17 != null) {
                    ((java.util.concurrent.ConcurrentHashMap) a17.f522959e).clear();
                }
            }
            java.lang.Object cj6 = cj(obj);
            if (cj6 != null) {
                obj = cj6;
            }
            if (sz1.a.n(obj)) {
                vy1.c l17 = uy1.a.l(obj, false);
                if (l17 != null) {
                    ((java.util.concurrent.ConcurrentHashMap) l17.f522978c).clear();
                }
            } else if (sz1.a.m(obj)) {
                vy1.b j17 = uy1.a.j(obj, false);
                if (j17 != null) {
                    ((java.util.concurrent.ConcurrentHashMap) j17.f522959e).clear();
                }
            } else if (sz1.a.i(obj) && (h17 = uy1.a.h(obj, false)) != null) {
                ((java.util.concurrent.ConcurrentHashMap) h17.f522949a).clear();
            }
        }
        return this;
    }

    public void yj(java.lang.String str, java.lang.Object obj, java.util.Map map, int i17, boolean z17) {
        zj(str, obj, map, i17, z17, true);
    }

    public void zj(java.lang.String str, java.lang.Object obj, java.util.Map map, int i17, boolean z17, boolean z18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(i17));
        Dj(str, obj, map, 1, arrayList, true, z18, z17);
    }
}
