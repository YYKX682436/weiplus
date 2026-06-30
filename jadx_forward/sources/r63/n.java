package r63;

/* loaded from: classes15.dex */
public final class n extends vp1.c {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f474577c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f474578d;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Boolean f474582h;

    /* renamed from: i, reason: collision with root package name */
    public static int f474583i;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Boolean f474585k;

    /* renamed from: a, reason: collision with root package name */
    public static final r63.n f474575a = new r63.n();

    /* renamed from: b, reason: collision with root package name */
    public static final r63.p f474576b = new r63.p();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f474579e = java.lang.Boolean.TRUE;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f474580f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f474581g = new java.util.LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Map f474584j = new java.util.LinkedHashMap();

    @Override // up1.a
    public void A(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentRecord, "fragmentRecord");
        r63.l lVar = r63.l.f474555a;
        int hashCode = fragmentRecord.hashCode();
        r63.l.f474557c.remove(java.lang.Integer.valueOf(hashCode));
        r63.l.f474558d.remove(java.lang.Integer.valueOf(hashCode));
    }

    @Override // up1.a
    public void C(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        o63.i iVar = o63.i.f424735a;
        java.lang.String a17 = bm5.f1.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getProcessName(...)");
        r45.ld6 b17 = iVar.b(a17);
        if (b17 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17.f460863e.f455618d, activityRecord.f455618d)) {
            java.lang.String a18 = bm5.f1.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getProcessName(...)");
            iVar.c(a18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "stopActivity " + activityRecord.f455619e + " stop process = " + bm5.f1.a() + " remove info");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "onActivityStop " + activityRecord.f455619e + " process = " + bm5.f1.a());
    }

    @Override // up1.a
    public void D(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentRecord, "fragmentRecord");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", activityRecord.f455619e + " : " + fragmentRecord.f456513e + " : " + fragmentRecord.f456518m + " onPause");
        p63.b bVar = p63.b.f433970a;
        int i17 = activityRecord.f455623i;
        int i18 = fragmentRecord.f456515g;
        java.lang.String fragmentSimpleName = fragmentRecord.f456513e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fragmentSimpleName, "fragmentSimpleName");
        bVar.d(i17, i18, fragmentSimpleName, j17);
        switch (activityRecord.f455624m) {
            case 1:
                str = "on_create";
                break;
            case 2:
                str = "on_start";
                break;
            case 3:
                str = "on_resume";
                break;
            case 4:
                str = "on_pause";
                break;
            case 5:
                str = "on_stop";
                break;
            case 6:
                str = "on_destroy";
                break;
            case 7:
                str = "on_new_intent";
                break;
            case 8:
                str = "on_save_state";
                break;
            case 9:
                str = "on_finish";
                break;
            case 10:
                str = "on_move_to_back";
                break;
            default:
                str = null;
                break;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "on_resume")) {
            l(activityRecord, fragmentRecord, j17, false);
        }
    }

    @Override // up1.a
    public void E(java.util.List activityRecordList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecordList, "activityRecordList");
        r63.l lVar = r63.l.f474555a;
        java.util.Iterator it = activityRecordList.iterator();
        while (it.hasNext()) {
            r45.f83 f83Var = (r45.f83) it.next();
            if (!z17) {
                r63.l.f474557c.put(java.lang.Integer.valueOf(f83Var.f455622h), java.lang.Integer.valueOf(f83Var.f455630s));
            } else if (f83Var.f455631t > f83Var.f455632u) {
                r63.l.f474559e.add(java.lang.Integer.valueOf(f83Var.f455622h));
                f83Var.f455631t = 0;
                f83Var.f455632u = 0;
            }
        }
    }

    @Override // up1.a
    public void F(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        r(false, activityRecord, j17);
    }

    public final void a(int i17, java.lang.String pageName, java.lang.String pageSimpleName, int i18, boolean z17, long j17, boolean z18, android.content.Intent intent) {
        p63.b bVar = p63.b.f433970a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageSimpleName, "pageSimpleName");
        if (bVar.c()) {
            java.lang.String b17 = bVar.b(intent, z18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.j a17 = bVar.a();
            if (a17 != null) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k kVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k();
                kVar.f298149d = pageSimpleName;
                kVar.f298151f = i18;
                kVar.f298152g = i17;
                kVar.f298153h = j17;
                kVar.f298154i = com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i.SESSION_OUT;
                kVar.f298155m = b17;
                a17.g(kVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffFinderReport", "onPushStack: taskId: " + i17 + ", pageName: " + pageName + ", pageSimpleName: " + pageSimpleName + ", pageHC: " + i18 + ", isFragment: " + z17 + ", timestamp: " + j17 + ", isInFinderHomeTask: " + z18 + ", intent: " + intent);
        }
        v(z18);
    }

    public final void b(int i17, int i18, java.lang.String targetPageName, java.lang.String targetSimpleName, boolean z17, long j17, android.content.Intent intent) {
        java.lang.String str;
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        r63.n nVar = f474575a;
        if (n17 || f474577c) {
            p63.b bVar = p63.b.f433970a;
            boolean p17 = p();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPageName, "targetPageName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetSimpleName, "targetSimpleName");
            if (bVar.c()) {
                java.lang.String b17 = bVar.b(intent, p17);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.j a17 = bVar.a();
                    if (a17 != null) {
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k kVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k();
                        kVar.f298149d = targetSimpleName;
                        kVar.f298151f = i18;
                        kVar.f298153h = j17;
                        java.util.Map map = o63.h.f424733a;
                        o63.f fVar = (o63.f) o63.h.f424733a.get(targetPageName);
                        kVar.f298154i = fVar != null ? fVar.f424731b : false ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i.PAGE_OUT : com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i.DEFAULT;
                        kVar.f298155m = b17;
                        kVar.f298152g = i17;
                        r63.l lVar = r63.l.f474555a;
                        kVar.f298156n = r63.l.f474566l ? r63.l.f474556b : 0;
                        kVar.f298157o = nVar.p() ? r63.l.f474560f : 0;
                        kVar.f298159q = r63.l.f474562h;
                        kVar.f298158p = nVar.p();
                        a17.d(kVar);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffFinderReport", "onPageAppear: taskId: " + i17 + ", targetPageHC: " + i18 + ", targetPageName: " + targetPageName + ", targetSimpleName: " + targetSimpleName + ", timestamp: " + j17 + ", isInFinderHomeTask: " + p17 + ", intent: " + intent);
                } else {
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    android.os.Bundle bundle = new android.os.Bundle();
                    r45.a6 a6Var = new r45.a6();
                    a6Var.f451281d = targetSimpleName;
                    a6Var.f451288n = targetPageName;
                    a6Var.f451283f = i18;
                    a6Var.f451285h = j17;
                    a6Var.f451286i = b17;
                    a6Var.f451284g = i17;
                    a6Var.f451287m = true;
                    bundle.putByteArray("finderReportAffFinderTask", a6Var.mo14344x5f01b1f6());
                    com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str2, bundle, p63.a.class);
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return;
        }
        r45.co2 co2Var = new r45.co2();
        co2Var.f453218d = targetPageName;
        co2Var.f453225n = i18;
        co2Var.f453219e = j17;
        r63.l lVar2 = r63.l.f474555a;
        co2Var.f453221g = r63.l.f474566l ? r63.l.f474556b : 0;
        co2Var.f453226o = z17;
        o63.g[] gVarArr = o63.g.f424732d;
        co2Var.f453223i = 0;
        if (intent == null || (str = intent.getStringExtra("finder_extraInfo_key")) == null) {
            str = "";
        }
        co2Var.f453228q = str;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b18 = b52.b.b();
        if (b18 == null) {
            b18 = "";
        }
        co2Var.f453229r = b18;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        co2Var.f453230s = c17 != null ? c17 : "";
        co2Var.f453227p = targetSimpleName;
        co2Var.f453231t = nVar.p();
        co2Var.f453232u = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        co2Var.f453233v = v52.c.g().e();
        co2Var.f453234w = false;
        ((java.util.ArrayList) f474580f).add(co2Var);
    }

    @Override // up1.a
    public void d(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        java.lang.String activitySimpleName = activityRecord.f455619e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activitySimpleName, "activitySimpleName");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("FinderHomeAffinityUI", activitySimpleName)) {
            f474583i = activityRecord.f455622h;
        }
        java.util.Map map = o63.h.f424733a;
        java.lang.String activityName = activityRecord.f455618d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityName, "activityName");
        o63.f fVar = (o63.f) o63.h.f424733a.get(activityName);
        if (fVar != null ? fVar.f424730a : false) {
            int i17 = activityRecord.f455623i;
            java.lang.String activityName2 = activityRecord.f455618d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityName2, "activityName");
            java.lang.String activitySimpleName2 = activityRecord.f455619e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activitySimpleName2, "activitySimpleName");
            int i18 = activityRecord.f455622h;
            java.lang.String baseActivityName = activityRecord.f455629r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseActivityName, "baseActivityName");
            java.lang.String activityName3 = activityRecord.f455618d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityName3, "activityName");
            a(i17, activityName2, activitySimpleName2, i18, false, j17, p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", baseActivityName) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", activityName3), intent);
        }
        u(activityRecord.f455622h, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", activityRecord.f455619e + " in stack");
    }

    @Override // up1.a
    public void e(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "onActivityPause " + activityRecord.f455619e + " process = " + bm5.f1.a());
        p63.b bVar = p63.b.f433970a;
        int i17 = activityRecord.f455623i;
        int i18 = activityRecord.f455622h;
        java.lang.String activitySimpleName = activityRecord.f455619e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activitySimpleName, "activitySimpleName");
        bVar.d(i17, i18, activitySimpleName, j17);
    }

    @Override // up1.a
    public void f(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        r63.n nVar;
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentRecord, "fragmentRecord");
        r63.l.f474557c.put(java.lang.Integer.valueOf(fragmentRecord.f456515g), java.lang.Integer.valueOf(fragmentRecord.f456523r));
        java.lang.String str3 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("", fragmentRecord.f456517i) ? fragmentRecord.f456517i : fragmentRecord.f456512d;
        java.lang.String str4 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("", fragmentRecord.f456517i) ? fragmentRecord.f456518m : fragmentRecord.f456513e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", activityRecord.f455619e + " : " + str3 + " : " + str4 + " onResume");
        java.lang.String baseActivityName = activityRecord.f455629r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseActivityName, "baseActivityName");
        java.lang.String activityName = activityRecord.f455618d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityName, "activityName");
        boolean z18 = false;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", baseActivityName) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", activityName)) {
            nVar = this;
            z17 = true;
        } else {
            nVar = this;
            z17 = false;
        }
        nVar.v(z17);
        l(activityRecord, fragmentRecord, j17, true);
        java.util.Map map = o63.h.f424733a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        o63.f fVar = (o63.f) o63.h.f424733a.get(str3);
        if ((fVar != null ? fVar.f424730a : false) && fragmentRecord.f456522q == 0) {
            java.util.Map map2 = f474584j;
            if (!map2.containsKey(java.lang.Integer.valueOf(activityRecord.f455622h))) {
                map2.put(java.lang.Integer.valueOf(activityRecord.f455622h), new java.util.ArrayList());
            }
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map2;
            java.util.List list = (java.util.List) linkedHashMap.get(java.lang.Integer.valueOf(activityRecord.f455622h));
            if (list != null) {
                list.add(fragmentRecord);
            }
            int i17 = activityRecord.f455623i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
            int i18 = fragmentRecord.f456515g;
            java.lang.String baseActivityName2 = activityRecord.f455629r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseActivityName2, "baseActivityName");
            java.lang.String activityName2 = activityRecord.f455618d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityName2, "activityName");
            boolean z19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", baseActivityName2) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", activityName2);
            str = str3;
            str2 = str4;
            a(i17, str3, str4, i18, true, j17, z19, intent);
            java.util.List list2 = (java.util.List) linkedHashMap.get(java.lang.Integer.valueOf(activityRecord.f455622h));
            if (list2 != null && list2.isEmpty()) {
                z18 = true;
            }
            if (z18) {
                map2.remove(java.lang.Integer.valueOf(activityRecord.f455622h));
            }
        } else {
            str = str3;
            str2 = str4;
        }
        int i19 = activityRecord.f455623i;
        int i27 = fragmentRecord.f456515g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        b(i19, i27, str, str2, true, j17, intent);
    }

    @Override // up1.a
    public void g(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            o63.i iVar = o63.i.f424735a;
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMainProcessName(...)");
            f474577c = iVar.b(str) != null;
        }
        java.lang.String baseActivityName = activityRecord.f455629r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseActivityName, "baseActivityName");
        java.lang.String activityName = activityRecord.f455618d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityName, "activityName");
        v(p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", baseActivityName) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", activityName));
        r63.l lVar = r63.l.f474555a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r63.l.f474568n, "")) {
            o63.e[] eVarArr = o63.e.f424729d;
            activityRecord.f455630s = 7;
        }
        r63.l.f474557c.put(java.lang.Integer.valueOf(activityRecord.f455622h), java.lang.Integer.valueOf(activityRecord.f455630s));
        lVar.b(activityRecord.f455622h, activityRecord.f455630s);
        if (activityRecord.f455631t > activityRecord.f455632u) {
            r63.l.f474559e.add(java.lang.Integer.valueOf(activityRecord.f455622h));
            activityRecord.f455631t = 0;
            activityRecord.f455632u = 0;
        }
        r63.n nVar = f474575a;
        if (nVar.p()) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.lang.String str2 = activityRecord.f455619e;
            r63.j jVar = r63.j.f474553a;
            if (((cy1.a) rVar).oj()) {
                sz1.i.b(new cy1.RunnableC28189x2ca3e4(str2, jVar));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "onActivityResume name : " + activityRecord.f455619e + ", taskId =  " + activityRecord.f455623i);
            if (r63.l.f474566l) {
                lVar.b(activityRecord.f455622h, r63.l.f474556b);
            } else {
                java.lang.Boolean bool = r63.l.f474572r;
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
                    java.lang.String str3 = activityRecord.f455618d;
                    o63.e[] eVarArr2 = o63.e.f424729d;
                    r63.l.c(lVar, str3, 8, null, activityRecord.f455622h, 4, null);
                    nVar.u(activityRecord.f455622h, true);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r63.l.f474565k, bool2)) {
                    if (r63.l.f474571q != null) {
                        java.lang.String str4 = activityRecord.f455618d;
                        o63.e[] eVarArr3 = o63.e.f424729d;
                        r63.l.c(lVar, str4, 2, null, activityRecord.f455622h, 4, null);
                    } else {
                        java.lang.String str5 = activityRecord.f455618d;
                        o63.e[] eVarArr4 = o63.e.f424729d;
                        r63.l.c(lVar, str5, 1, null, activityRecord.f455622h, 4, null);
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r63.l.f474565k, java.lang.Boolean.FALSE)) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r63.l.f474563i, bool2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r63.l.f474564j, bool2)) {
                        java.lang.String str6 = activityRecord.f455618d;
                        o63.e[] eVarArr5 = o63.e.f424729d;
                        r63.l.c(lVar, str6, 3, null, activityRecord.f455622h, 4, null);
                    } else {
                        java.lang.String str7 = activityRecord.f455618d;
                        o63.e[] eVarArr6 = o63.e.f424729d;
                        r63.l.c(lVar, str7, 4, null, activityRecord.f455622h, 4, null);
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r63.l.f474563i, bool2)) {
                    java.lang.String str8 = activityRecord.f455618d;
                    o63.e[] eVarArr7 = o63.e.f424729d;
                    r63.l.c(lVar, str8, 5, null, activityRecord.f455622h, 4, null);
                } else {
                    java.lang.String str9 = activityRecord.f455618d;
                    o63.e[] eVarArr8 = o63.e.f424729d;
                    r63.l.c(lVar, str9, 1, null, activityRecord.f455622h, 4, null);
                }
                r63.l.f474563i = null;
                r63.l.f474564j = null;
            }
        } else {
            r63.l.f474566l = false;
            o63.e[] eVarArr9 = o63.e.f424729d;
            r63.l.f474556b = 2;
        }
        java.lang.String activityName2 = activityRecord.f455618d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityName2, "activityName");
        if (!lVar.a(activityName2)) {
            r63.l.f474564j = null;
        }
        r63.l.f474565k = null;
        int i17 = activityRecord.f455623i;
        int i18 = activityRecord.f455622h;
        java.lang.String activityName3 = activityRecord.f455618d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityName3, "activityName");
        java.lang.String activitySimpleName = activityRecord.f455619e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activitySimpleName, "activitySimpleName");
        b(i17, i18, activityName3, activitySimpleName, false, j17, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "onActivityResume " + activityRecord.f455619e + " process = " + bm5.f1.a());
    }

    @Override // up1.a
    public void h(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        r(true, activityRecord, j17);
    }

    public final void i(r45.f83 f83Var, long j17) {
        java.lang.String a17 = bm5.f1.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "onAppIn " + a17 + ' ' + f83Var.f455619e + ' ' + j17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, f83Var.f455628q)) {
            f474579e = java.lang.Boolean.TRUE;
        }
        r63.l lVar = r63.l.f474555a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "onAppIn name : " + f83Var.f455619e + ", taskId =  " + f83Var.f455623i + " isInFinderTask = " + f474575a.p());
        r63.l.f474563i = java.lang.Boolean.TRUE;
        android.os.SystemClock.elapsedRealtime();
        p63.b bVar = p63.b.f433970a;
        if (bVar.c()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.j a18 = bVar.a();
            if (a18 != null) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k kVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k();
                kVar.f298149d = f83Var.f455619e;
                kVar.f298151f = f83Var.f455622h;
                kVar.f298152g = f83Var.f455623i;
                kVar.f298153h = j17;
                a18.b(kVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffFinderReport", "onAppIn: activityRecord: " + f83Var + ", timestamp: " + j17);
        }
    }

    @Override // up1.a
    public void j(r45.f83 f83Var, android.content.Intent intent, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            java.util.Map map = o63.h.f424733a;
            java.lang.String className = component.getClassName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "getClassName(...)");
            if (!o63.h.f424734b.contains(className)) {
                r45.f83 f83Var2 = new r45.f83();
                f83Var2.f455618d = component.getClassName();
                f83Var2.f455619e = component.getShortClassName();
                f83Var2.f455625n = j17;
                java.lang.String a17 = bm5.f1.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getProcessName(...)");
                try {
                    java.lang.String str = a17 + "_finderReportStartActivityKey";
                    int n17 = j62.e.g().n();
                    if (n17 == 0) {
                        M = null;
                    } else {
                        M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(n17 + "_FinderReportInfoMap");
                    }
                    if (M != null) {
                        if (f83Var != null) {
                            r45.ld6 ld6Var = new r45.ld6();
                            ld6Var.f460862d = f83Var;
                            ld6Var.f460863e = f83Var2;
                            ld6Var.f460864f = j17;
                            M.H(str, ld6Var.mo14344x5f01b1f6());
                        } else {
                            M.remove(str);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderReportUtils", "updateStartActivityInfo err " + e17.getMessage());
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f83Var != null ? f83Var.f455619e : null);
        sb6.append(" process = ");
        sb6.append(bm5.f1.a());
        sb6.append(" update info toActivity = ");
        sb6.append(component != null ? component.getShortClassName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", sb6.toString());
    }

    public final void k(r45.f83 f83Var, long j17, java.lang.String str) {
        java.lang.String a17 = bm5.f1.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "appOut " + a17 + ' ' + f83Var.f455619e + ' ' + j17);
        o63.i iVar = o63.i.f424735a;
        if (iVar.b(str) != null) {
            f474579e = null;
            iVar.c(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "app out " + f83Var.f455619e + " process = " + a17 + " remove info");
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, f83Var.f455628q) || f474579e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "report 1 ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            iVar.c(a17);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            f474579e = bool;
            r63.l lVar = r63.l.f474555a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "onAppOut name : " + f83Var.f455619e + ", taskId =  " + f83Var.f455623i + " isInFinderTask = " + f474575a.p());
            r63.l.f474563i = bool;
            r63.l.f474566l = false;
            p63.b bVar = p63.b.f433970a;
            if (bVar.c()) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.j a18 = bVar.a();
                if (a18 != null) {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k kVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k();
                    kVar.f298149d = f83Var.f455619e;
                    kVar.f298151f = f83Var.f455622h;
                    kVar.f298152g = f83Var.f455623i;
                    kVar.f298153h = j17;
                    a18.c(kVar);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffFinderReport", "onAppOut: activityRecord: " + f83Var + ", timestamp: " + j17);
            }
        }
    }

    public final void l(r45.f83 f83Var, r45.g83 g83Var, long j17, boolean z17) {
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) f474584j).get(java.lang.Integer.valueOf(f83Var.f455622h));
        if (list != null) {
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r45.g83 g83Var2 = (r45.g83) listIterator.previous();
                if ((g83Var2.f456515g == g83Var.f456515g && z17) || g83Var2.f456522q < g83Var.f456522q) {
                    return;
                }
                java.lang.String str = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("", g83Var.f456517i) ? g83Var2.f456517i : g83Var2.f456512d;
                p63.b bVar = p63.b.f433970a;
                int i17 = g83Var2.f456515g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                bVar.e(i17, str, f83Var.f455623i, j17, null);
                listIterator.remove();
            }
        }
    }

    @Override // up1.a
    public void m(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        t(activityRecord, j17);
        int i17 = activityRecord.f455622h;
        if (n()) {
            f474581g.remove(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", activityRecord.f455619e + " out stack");
    }

    public final boolean n() {
        if (f474582h == null) {
            f474582h = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_hell_finder_report_open_fix_context_id, false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "isFix19943ContextId: " + f474582h);
        }
        java.lang.Boolean bool = f474582h;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean p() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return f474578d;
        }
        try {
            int n17 = j62.e.g().n();
            if (n17 == 0) {
                M = null;
            } else {
                M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(n17 + "_FinderReportInfoMap");
            }
            if (M != null) {
                return M.h("isInFinderTask");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderReportUtils", "isInFinderTask err " + e17.getMessage());
        }
        return false;
    }

    @Override // up1.a
    public void q(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        r63.l lVar = r63.l.f474555a;
        java.lang.String activityName = activityRecord.f455618d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityName, "activityName");
        if (!lVar.a(activityName)) {
            java.lang.String baseActivityName = activityRecord.f455629r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseActivityName, "baseActivityName");
            if (!lVar.a(baseActivityName)) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "onActivityNewIntent name : " + activityRecord.f455619e + ", taskId =  " + activityRecord.f455623i + " isInFinderTask = " + f474575a.p());
        r63.l.f474564j = java.lang.Boolean.TRUE;
    }

    public final void r(boolean z17, r45.f83 f83Var, long j17) {
        java.lang.String a17 = bm5.f1.a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "on App in : " + z17);
            if (z17) {
                i(f83Var, j17);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                k(f83Var, j17, a17);
                return;
            }
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.v8 v8Var = new r45.v8();
        v8Var.f469510e = f83Var;
        v8Var.f469512g = z17;
        v8Var.f469511f = j17;
        v8Var.f469509d = a17;
        if (!z17) {
            java.util.LinkedList linkedList = v8Var.f469513h;
            java.util.List list = f474580f;
            linkedList.addAll(list);
            ((java.util.ArrayList) list).clear();
        }
        bundle.putByteArray("finderReportAppProcessEvent", v8Var.mo14344x5f01b1f6());
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str, bundle, r63.m.class);
    }

    @Override // up1.a
    public void s(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        t(activityRecord, j17);
        r63.l lVar = r63.l.f474555a;
        int i17 = activityRecord.f455622h;
        r63.l.f474557c.remove(java.lang.Integer.valueOf(i17));
        r63.l.f474558d.remove(java.lang.Integer.valueOf(i17));
        r63.l.f474559e.remove(java.lang.Integer.valueOf(activityRecord.f455622h));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "remove " + activityRecord.f455619e + " lastEnterType " + activityRecord.f455630s);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(activityRecord.f455619e);
        sb6.append(" destroy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", sb6.toString());
    }

    public final void t(r45.f83 f83Var, long j17) {
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) f474584j).get(java.lang.Integer.valueOf(f83Var.f455622h));
        p63.b bVar = p63.b.f433970a;
        if (list != null) {
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r45.g83 g83Var = (r45.g83) listIterator.previous();
                java.lang.String str = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("", g83Var.f456517i) ? g83Var.f456517i : g83Var.f456512d;
                int i17 = g83Var.f456515g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                bVar.e(i17, str, f83Var.f455623i, j17, null);
            }
        }
        int i18 = f83Var.f455622h;
        java.lang.String activityName = f83Var.f455618d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityName, "activityName");
        bVar.e(i18, activityName, f83Var.f455623i, j17, null);
    }

    public final void u(int i17, boolean z17) {
        if (n()) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            if (b17 == null) {
                b17 = "";
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.util.Map map = f474581g;
            map.put(valueOf, b17);
            if (z17) {
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(f474583i);
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                java.lang.String b18 = b52.b.b();
                map.put(valueOf2, b18 != null ? b18 : "");
            }
        }
    }

    public final void v(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || z17 == f474578d) {
            return;
        }
        f474578d = z17;
        try {
            int n17 = j62.e.g().n();
            if (n17 == 0) {
                M = null;
            } else {
                M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(n17 + "_FinderReportInfoMap");
            }
            if (M != null) {
                M.G("isInFinderTask", z17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderReportUtils", "updateInFinderTaskInfo err " + e17.getMessage());
        }
    }

    @Override // up1.a
    public void x(r45.f83 fromActivityRecord, r45.f83 toActivityRecord, boolean z17, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromActivityRecord, "fromActivityRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toActivityRecord, "toActivityRecord");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", fromActivityRecord.f455619e + " -> " + toActivityRecord.f455619e + " isCreateStack = " + z17);
        r63.l lVar = r63.l.f474555a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "onStackChange " + fromActivityRecord.f455619e + " -> " + toActivityRecord.f455619e + " isCreateStack = " + z17);
        r63.l.f474565k = java.lang.Boolean.valueOf(z17);
        p63.b bVar = p63.b.f433970a;
        if (bVar.c()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k kVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k();
            kVar.f298149d = fromActivityRecord.f455619e;
            kVar.f298151f = fromActivityRecord.f455622h;
            kVar.f298152g = fromActivityRecord.f455623i;
            kVar.f298153h = j17;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k kVar2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k();
            kVar2.f298149d = toActivityRecord.f455619e;
            kVar2.f298151f = toActivityRecord.f455622h;
            kVar2.f298152g = toActivityRecord.f455623i;
            kVar2.f298153h = j17;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.j a17 = bVar.a();
            if (a17 != null) {
                a17.a(kVar, kVar2, z17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffFinderReport", "onChangeStack: fromActivityRecord: " + fromActivityRecord + ", toActivityRecord: " + toActivityRecord + ", timestamp: " + j17 + ", isCreateStack: " + z17 + ", intent: null");
        }
    }
}
