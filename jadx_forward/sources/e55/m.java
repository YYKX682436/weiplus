package e55;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final e55.m f331214a = new e55.m();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f331215b = jz5.h.b(e55.j.f331211d);

    /* renamed from: c, reason: collision with root package name */
    public static int f331216c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f331217d = jz5.h.b(e55.l.f331213d);

    public static final void a(e55.m mVar, java.lang.String pageName, long j17, int i17) {
        mVar.getClass();
        i55.s sVar = i55.s.f370411a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "on app in : ".concat(pageName));
        g55.g gVar = (g55.g) sVar.d().get(java.lang.Integer.valueOf(i55.s.f370414d));
        if (gVar != null) {
            gVar.a(j17, 1);
        }
        i55.d i18 = f331214a.i(i55.s.f370413c);
        if (i18 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotLogic", i18.f370373a + " onAppIn");
        }
    }

    public static final void b(e55.m mVar, java.lang.String pageName, long j17, int i17) {
        mVar.getClass();
        i55.s sVar = i55.s.f370411a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "on app out : ".concat(pageName));
        i55.m.f370390a.b(j17, "appOut", 1000, null, -1, 0);
        i55.s.f370417g = "appOut";
        i55.s.f370418h = 1000;
        g55.g gVar = (g55.g) sVar.d().get(java.lang.Integer.valueOf(i55.s.f370414d));
        if (gVar != null) {
            gVar.b(j17, 1);
            sVar.e("main_entry_page_app_out", i55.s.f370414d, gVar.c());
        }
        if (i55.s.f370412b) {
            i55.f.f370380a.b(i55.s.f370413c, j17, true);
        }
        i55.d i18 = f331214a.i(i55.s.f370413c);
        if (i18 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotLogic", i18.f370373a + " onAppOut");
        }
    }

    public static final void c(e55.m mVar, long j17, int i17, java.lang.String redDotKey, java.util.Map map) {
        i55.d i18 = mVar.i(i17);
        if (i18 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotKey, "redDotKey");
            g55.e eVar = (g55.e) ((java.util.LinkedHashMap) i18.f370374b).get(redDotKey);
            if (eVar != null) {
                eVar.f350502h = j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotLogic", "redDotKey = " + redDotKey + " is disappear");
                i18.g(j17, redDotKey, map);
                eVar.f350507m = true;
            }
        }
    }

    public static final void d(e55.m mVar, long j17, int i17, java.lang.String redDotKey, long j18, java.util.Map map) {
        i55.d i18 = mVar.i(i17);
        if (i18 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotKey, "redDotKey");
            if (i18.b(redDotKey)) {
                java.util.Map map2 = i18.f370374b;
                g55.e eVar = (g55.e) ((java.util.LinkedHashMap) map2).get(redDotKey);
                if (eVar == null) {
                    eVar = new g55.e(redDotKey);
                    if (map != null) {
                        eVar.d().putAll(map);
                    }
                    map2.put(redDotKey, eVar);
                }
                eVar.f350497c = j18;
                if (!eVar.f350506l) {
                    eVar.e(j17, map);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(j17);
                    sb6.append(' ');
                    sb6.append(redDotKey);
                    sb6.append(" on exp uuid = ");
                    java.lang.Object obj = eVar.d().get("tips_uuid");
                    if (obj == null) {
                        obj = "";
                    }
                    sb6.append(obj);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotLogic", sb6.toString());
                    i18.h(i18.c("red_dot_exp"), eVar);
                }
            }
            java.lang.String a17 = e55.e.f331200a.a(redDotKey);
            if (a17 != null) {
                java.util.Set set = i18.f370376d;
                if (set.contains(a17)) {
                    return;
                }
                set.add(a17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotLogic", i18.f370373a + ' ' + redDotKey + " add");
            }
        }
    }

    public static final void e(e55.m mVar, long j17, int i17, java.lang.String pageName, int i18, boolean z17, int i19) {
        mVar.getClass();
        i55.s sVar = i55.s.f370411a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "fragment pause " + pageName + " hashcode = " + i18);
            i55.d i27 = f331214a.i(i19);
            if (i27 != null) {
                i27.e(j17);
            }
            sVar.a(i55.s.f370414d, j17, i17, pageName);
            if (i19 != -1) {
                sVar.d().remove(java.lang.Integer.valueOf(i19));
                i55.m mVar2 = i55.m.f370390a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageInfoReport", "onPause pageName = " + pageName + " , tabIndex= " + i19);
                mVar2.d(j17, i19);
                i55.m.f370394e = true;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "Activity pause " + pageName + "  hashcode = " + i18);
            if (e55.e.f331200a.m(pageName) && i55.s.f370412b) {
                i55.s.f370414d = i55.s.f370413c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "out launcher 4 tab !");
                i55.s.f370412b = false;
                i55.f.f370380a.b(i55.s.f370413c, j17, false);
                i55.m.f370390a.a(j17, i55.s.f370413c);
            }
            sVar.a(i55.s.f370414d, j17, i17, pageName);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pageName, "LauncherUI")) {
            return;
        }
        i55.s.f370417g = pageName;
        i55.s.f370418h = i17;
    }

    public static final void f(e55.m mVar, long j17, int i17, java.lang.String pageName, int i18, boolean z17, int i19) {
        g55.g gVar;
        mVar.getClass();
        i55.s sVar = i55.s.f370411a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        i55.m mVar2 = i55.m.f370390a;
        ((o63.j) ((q63.e) i95.n0.c(q63.e.class))).getClass();
        java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) r63.l.f474558d).get(java.lang.Integer.valueOf(i18));
        mVar2.b(j17, pageName, i17, null, i19, num != null ? num.intValue() : 0);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "Activity resume " + pageName + "  hashcode = " + i18);
            if (e55.e.f331200a.m(pageName)) {
                return;
            }
            sVar.b(i55.s.f370414d, j17, i17, pageName, i18);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "fragment resume " + pageName + " hashcode = " + i18 + '}');
        if (i19 != -1) {
            i55.s.f370413c = i19;
            i55.s.f370415e.remove(java.lang.Integer.valueOf(i19));
            if (!i55.s.f370412b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "in launcher 4 tab !");
                i55.s.f370412b = true;
                if (!i55.f.f370382c) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomRedDotLogic", "bottom redDot exposure");
                    i55.f.f370382c = true;
                    for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) i55.f.f370381b).entrySet()) {
                        int intValue = ((java.lang.Number) entry.getKey()).intValue();
                        g55.e eVar = (g55.e) entry.getValue();
                        eVar.e(j17, null);
                        g55.g gVar2 = (g55.g) sVar.d().get(java.lang.Integer.valueOf(intValue));
                        if (gVar2 != null) {
                            eVar.g(gVar2);
                        }
                    }
                }
                i55.m mVar3 = i55.m.f370390a;
                int i27 = i55.s.f370418h;
                java.lang.String lastPageName = i55.s.f370417g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastPageName, "lastPageName");
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("in_time", java.lang.Long.valueOf(j17));
                linkedHashMap.put("from_page_id", java.lang.Integer.valueOf(i27));
                linkedHashMap.put("from_page_name", lastPageName);
                linkedHashMap.put("page_name", pageName);
                linkedHashMap.put("page_id", java.lang.Integer.valueOf(i17));
                i55.m.f370393d = linkedHashMap;
            }
        } else if (i55.s.f370412b) {
            i55.s.f370414d = i55.s.f370413c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "out launcher 4 tab !");
            i55.s.f370412b = false;
            i55.f.f370380a.b(i19, j17, false);
            mVar2.a(j17, i19);
        }
        sVar.b(i55.s.f370414d, j17, i17, pageName, i18);
        i55.d i28 = f331214a.i(i19);
        if (i28 != null) {
            i28.f370375c = j17;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i29 = i28.f370373a;
            sb6.append(i29);
            sb6.append(" onPageResume");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotLogic", sb6.toString());
            for (java.util.Map.Entry entry2 : ((java.util.LinkedHashMap) i28.f370374b).entrySet()) {
                g55.e eVar2 = (g55.e) entry2.getValue();
                if ((!eVar2.f350507m && eVar2.f350500f > 0) && (gVar = (g55.g) sVar.d().get(java.lang.Integer.valueOf(i29))) != null) {
                    eVar2.g(gVar);
                }
            }
        }
        if (i19 != -1) {
            i55.m mVar4 = i55.m.f370390a;
            int i37 = i55.s.f370418h;
            java.lang.String lastPageName2 = i55.s.f370417g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastPageName2, "lastPageName");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageInfoReport", "onResume pageName = " + pageName + " , tabIndex= " + i19 + ", lastPageId = " + i37 + ", lastPageName " + lastPageName2);
            i55.m.f370392c = i19;
            i55.m.f370394e = false;
            java.util.Map map = i55.m.f370391b;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
            java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) map;
            java.lang.Object obj = linkedHashMap2.get(valueOf);
            if (obj == null) {
                obj = new java.util.LinkedHashMap();
                linkedHashMap2.put(valueOf, obj);
            }
            java.util.Map map2 = (java.util.Map) obj;
            map2.clear();
            map2.put("in_time", java.lang.Long.valueOf(j17));
            map2.put("from_page_id", java.lang.Integer.valueOf(i37));
            map2.put("from_page_name", lastPageName2);
            if (i55.m.f370396g.contains(java.lang.Integer.valueOf(i19))) {
                map2.put("bottom_red_dot_list", i55.f.f370380a.a());
            }
        }
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) f331217d).mo141623x754a37bb();
    }

    public final java.lang.String h(java.lang.Object obj) {
        java.lang.String aj6 = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).aj(obj);
        if (aj6 == null && (obj instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83)) {
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = ((com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) obj).f292654p;
            aj6 = (abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.getClass() : obj.getClass()).getSimpleName();
        }
        return aj6 == null ? obj.getClass().getSimpleName() : aj6;
    }

    public final i55.d i(int i17) {
        return (i55.d) ((java.util.Map) ((jz5.n) f331215b).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
    }

    public final void j(java.lang.Object page) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        int i17 = f331216c;
        f55.e eVar = f55.e.f341304e;
        if (i17 == 3 && (page instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83)) {
            return;
        }
        int Zi = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Zi(page);
        java.lang.String h17 = h(page);
        int hashCode = page.hashCode();
        int l17 = e55.e.f331200a.l(page);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Boolean bool = page instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 ? java.lang.Boolean.TRUE : page instanceof android.app.Activity ? java.lang.Boolean.FALSE : null;
        if (bool != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                if (bool.booleanValue()) {
                    i55.u.f370422a.c(l17, currentTimeMillis);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g17 = g();
                android.os.Message mo50288x733c63a2 = g().mo50288x733c63a2();
                mo50288x733c63a2.what = 1001;
                mo50288x733c63a2.obj = nm5.j.g(java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(Zi), h17, java.lang.Integer.valueOf(hashCode), bool, java.lang.Integer.valueOf(l17));
                g17.mo50308x2936bf5f(mo50288x733c63a2);
                return;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("page_id", Zi);
            bundle.putString("page_name", h17);
            bundle.putInt("page_hash_code", hashCode);
            bundle.putLong("event_time", currentTimeMillis);
            bundle.putInt("tab_index", l17);
            bundle.putBoolean("is_fragment", bool.booleanValue());
            bundle.putString("page_event", "page_pause");
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, e55.i.class, null);
        }
    }

    public final void k(java.lang.Object page) {
        i55.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        int i17 = f331216c;
        f55.e eVar = f55.e.f341304e;
        boolean z17 = true;
        if (i17 == 3 && (page instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83)) {
            return;
        }
        java.lang.String h17 = h(page);
        if (com.p314xaae8f345.mm.ui.bk.v0()) {
            e55.e eVar2 = e55.e.f331200a;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.ui.EmptyActivity", h17) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("EmptyActivity", h17)) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotReporter", "onPageResume: " + h17 + " is empty activity");
                return;
            }
        }
        int Zi = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Zi(page);
        int hashCode = page.hashCode();
        int l17 = e55.e.f331200a.l(page);
        f331216c = l17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotReporter", "onPageResume: " + Zi + ", " + h17 + ", " + hashCode + ", " + l17 + ", " + currentTimeMillis);
        java.lang.Boolean bool = page instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 ? java.lang.Boolean.TRUE : page instanceof android.app.Activity ? java.lang.Boolean.FALSE : null;
        if (bool != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                if (bool.booleanValue() && (bVar = (i55.b) i55.u.f370422a.b().get(java.lang.Integer.valueOf(l17))) != null) {
                    bVar.c(currentTimeMillis);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g17 = g();
                android.os.Message mo50288x733c63a2 = g().mo50288x733c63a2();
                mo50288x733c63a2.what = 1000;
                mo50288x733c63a2.obj = nm5.j.g(java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(Zi), h17, java.lang.Integer.valueOf(hashCode), bool, java.lang.Integer.valueOf(l17));
                g17.mo50308x2936bf5f(mo50288x733c63a2);
                return;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("page_id", Zi);
            bundle.putString("page_name", h17);
            bundle.putInt("page_hash_code", hashCode);
            bundle.putLong("event_time", currentTimeMillis);
            bundle.putInt("tab_index", l17);
            bundle.putBoolean("is_fragment", bool.booleanValue());
            bundle.putString("page_event", "page_resume");
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, e55.i.class, null);
        }
    }

    public final void l(long j17, int i17, java.lang.String redDotKey, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotKey, "redDotKey");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g17 = g();
        android.os.Message mo50288x733c63a2 = g().mo50288x733c63a2();
        mo50288x733c63a2.what = 1003;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        if (map == null) {
            map = new java.util.LinkedHashMap();
        }
        mo50288x733c63a2.obj = nm5.j.e(valueOf, valueOf2, redDotKey, map);
        g17.mo50308x2936bf5f(mo50288x733c63a2);
    }

    public final void m() {
        for (java.util.Map.Entry entry : i55.u.f370422a.b().entrySet()) {
            ((java.lang.Number) entry.getKey()).intValue();
            ((i55.b) entry.getValue()).a("onStart");
        }
    }

    public final void n() {
        for (java.util.Map.Entry entry : i55.u.f370422a.b().entrySet()) {
            ((java.lang.Number) entry.getKey()).intValue();
            i55.b bVar = (i55.b) entry.getValue();
            p3325xe03a0797.p3326xc267989b.y0 y0Var = bVar.f370370m;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
            }
            bVar.f370370m = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotExposureMonitorLogic", "mMainScope end onStop");
        }
    }
}
