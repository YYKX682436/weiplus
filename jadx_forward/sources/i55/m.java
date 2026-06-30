package i55;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static java.util.Map f370393d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f370394e;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f370396g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f370397h;

    /* renamed from: a, reason: collision with root package name */
    public static final i55.m f370390a = new i55.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f370391b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f370392c = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f370395f = new java.util.concurrent.ConcurrentHashMap();

    static {
        f55.e eVar = f55.e.f341304e;
        f370396g = kz5.o1.c(3);
        f55.e eVar2 = f55.e.f341304e;
        f370397h = kz5.c1.k(new jz5.l(2, 32024), new jz5.l(3, 37181));
    }

    public final void a(long j17, int i17) {
        java.util.Map map = f370393d;
        if (map != null) {
            map.put("out_time", java.lang.Long.valueOf(j17));
            java.lang.Object obj = map.get("in_time");
            java.lang.Long l17 = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
            if (l17 != null) {
                long longValue = l17.longValue();
                boolean z17 = false;
                if (1 <= longValue && longValue < j17) {
                    z17 = true;
                }
                if (z17) {
                    map.put("stay_time", java.lang.Long.valueOf(j17 - longValue));
                }
            }
            map.put("bottom_red_dot_list", i55.f.f370380a.a());
        }
    }

    public final void b(long j17, java.lang.String curPageName, int i17, java.util.Map map, int i18, int i19) {
        java.util.Map map2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curPageName, "curPageName");
        int i27 = f370392c;
        if (i27 != -1) {
            f55.e eVar = f55.e.f341304e;
            java.lang.String str = i27 == 0 ? "main_ui_page_pause" : i27 == 1 ? "mvvmAddress_ui_page_pause" : i27 == 2 ? "find_more_page_pause" : i27 == 3 ? "more_tab_page_pause" : "unknown_page_pause";
            if (!f370394e) {
                if (com.p314xaae8f345.mm.ui.bk.v0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageInfoReport", "report supportMagicWindow  tab event curPageName " + curPageName + " report event = " + str);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PageInfoReport", "page not pause! " + i17 + ", " + curPageName);
                d(j17, f370392c);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageInfoReport", "report tab event curPageName " + curPageName + " report event = " + str);
            java.util.Map map3 = (java.util.Map) ((java.util.LinkedHashMap) f370391b).get(java.lang.Integer.valueOf(f370392c));
            if (map3 != null) {
                if (map != null) {
                    map3.putAll(map);
                }
                map3.put("to_page_name", curPageName);
                map3.put("to_page_id", java.lang.Integer.valueOf(i17));
                map3.put("to_page_enter_type", java.lang.Integer.valueOf(i19));
                java.util.Set set = (java.util.Set) f370395f.get(java.lang.Integer.valueOf(f370392c));
                if (set != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(set);
                    map3.put("show_preference_list", arrayList);
                }
                java.lang.Integer num = (java.lang.Integer) f370397h.get(java.lang.Integer.valueOf(f370392c));
                if (num != null) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, map3, num.intValue());
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, map3, 33666);
            }
            f370392c = -1;
        }
        if (i18 != -1 || (map2 = f370393d) == null) {
            return;
        }
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("to_page_name", curPageName);
        map2.put("to_page_id", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("launcher_ui_pause", f370393d, 33666);
        f370393d = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageInfoReport", "report launcher ui pause!");
    }

    public final void c(int i17, long j17, java.util.Map map) {
        java.lang.String str;
        java.lang.String a17;
        i55.d i18 = e55.m.f331214a.i(i17);
        if (i18 != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) i18.f370374b).entrySet()) {
                g55.e eVar = (g55.e) entry.getValue();
                if (eVar.f350499e > 0 && eVar.f350497c == i18.f370375c && (a17 = e55.e.f331200a.a(eVar.f350495a)) != null) {
                    java.lang.Object obj = linkedHashMap2.get(a17);
                    if (obj == null) {
                        obj = new java.util.ArrayList();
                        linkedHashMap2.put(a17, obj);
                    }
                    java.util.List list = (java.util.List) obj;
                    int e17 = kz5.c0.e(list, 0, list.size(), new i55.c(java.lang.Long.valueOf(eVar.f350500f)));
                    if (e17 < 0) {
                        e17 = (-e17) - 1;
                    }
                    if (list.size() < 4) {
                        list.add(e17, eVar);
                    } else if (e17 <= list.size()) {
                        list.add(e17, eVar);
                        list.remove(0);
                    }
                }
            }
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry2.getKey();
                java.util.List list2 = (java.util.List) entry2.getValue();
                java.lang.Object obj2 = linkedHashMap.get(str2);
                if (obj2 == null) {
                    obj2 = new java.util.ArrayList();
                    linkedHashMap.put(str2, obj2);
                }
                java.util.List list3 = (java.util.List) obj2;
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    list3.add(g55.e.c((g55.e) it.next(), null, 0L, 2, null));
                }
            }
            map.put("cur_page_red_dot_list", linkedHashMap);
            java.util.Map d17 = i18.d();
            if (d17 != null) {
                map.putAll(d17);
            }
            i55.s sVar = i55.s.f370411a;
            jz5.l lVar = (jz5.l) ((java.util.LinkedHashMap) i55.s.f370415e).get(java.lang.Integer.valueOf(i17));
            if (lVar == null || (str = (java.lang.String) lVar.f384366d) == null) {
                str = "";
            }
            map.put("click_entry_key", str);
        }
    }

    public final void d(long j17, int i17) {
        java.util.Map map = (java.util.Map) ((java.util.LinkedHashMap) f370391b).get(java.lang.Integer.valueOf(i17));
        if (map != null) {
            map.putAll(e55.e.f331200a.j());
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            cl0.g gVar = new cl0.g();
            gVar.o("battery_level", z71.a.b());
            c81.b wi6 = c81.b.wi();
            wi6.m134976x2690a4ac();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = wi6.f121189d.a();
            boolean z17 = false;
            gVar.o("m7_step", a17 == null ? 0 : a17.getInt("last_m7_step_count", 0));
            c81.b wi7 = c81.b.wi();
            wi7.m134976x2690a4ac();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = wi7.f121189d.a();
            gVar.o("hk_step", a18 == null ? 0 : a18.getInt("last_hk_step_count", 0));
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6295xdee69c3 c6295xdee69c3 = z71.m.wi().f552068f;
            if (c6295xdee69c3 != null) {
                gVar.p("last_gps_time", c6295xdee69c3.f136561e);
                gVar.h("longitude", c6295xdee69c3.f136563g);
                gVar.h("latitude", c6295xdee69c3.f136564h);
            }
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            byte[] bytes = gVar2.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            linkedHashMap.put("extra_info", android.util.Base64.encodeToString(bytes, 2));
            map.putAll(linkedHashMap);
            map.put("out_time", java.lang.Long.valueOf(j17));
            java.lang.Object obj = map.get("in_time");
            java.lang.Long l17 = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
            if (l17 != null) {
                long longValue = l17.longValue();
                if (1 <= longValue && longValue < j17) {
                    z17 = true;
                }
                if (z17) {
                    map.put("stay_time", java.lang.Long.valueOf(j17 - longValue));
                }
            }
            i55.m mVar = f370390a;
            if (!f370396g.contains(java.lang.Integer.valueOf(i17))) {
                map.put("bottom_red_dot_list", i55.f.f370380a.a());
            }
            f55.e eVar = f55.e.f341304e;
            if (i17 == 0 || i17 == 1) {
                return;
            }
            if (i17 == 2) {
                mVar.c(i17, j17, map);
            } else if (i17 == 3) {
                mVar.c(i17, j17, map);
            }
        }
    }
}
