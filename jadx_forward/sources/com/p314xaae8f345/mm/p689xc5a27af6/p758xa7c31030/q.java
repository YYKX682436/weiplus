package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

@j95.b
/* loaded from: classes12.dex */
public final class q extends i95.w implements ob0.o2, ob0.c3, ob0.q2, ob0.n2, ob0.y2, ob0.t2, ob0.i3, ob0.r2 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d f149163d = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f149164e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f149165f;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f149164e = jz5.h.a(iVar, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c.f149066d);
        f149165f = jz5.h.a(iVar, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.b.f149057d);
    }

    public static final void wi(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q qVar, long j17, java.lang.String str, java.util.List list, java.util.Map extra) {
        qVar.getClass();
        if (!list.isEmpty()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
            java.lang.Object obj = extra.get("tasks");
            if (obj == null) {
                obj = new java.util.LinkedHashMap();
                extra.put("tasks", obj);
            }
            java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj);
            java.util.List F0 = kz5.n0.F0(list, new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.o());
            java.util.Iterator it = F0.iterator();
            long j18 = 0;
            while (it.hasNext()) {
                java.lang.Number number = ((rh.f) ((rh.o2) it.next()).f477019c).f476910g.f477085a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
                j18 += ((java.lang.Long) number).longValue();
            }
            float f17 = (float) (j17 / 10);
            c17.put(str + "-load", java.lang.Long.valueOf(a06.d.c((((float) j18) * 100.0f) / f17)));
            int i17 = 0;
            for (java.lang.Object obj2 : F0) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                rh.o2 o2Var = (rh.o2) obj2;
                if (i17 < 5) {
                    long c18 = a06.d.c((((rh.f) o2Var.f477019c).f476910g.f477085a.floatValue() * 100.0f) / f17);
                    rh.f fVar = (rh.f) o2Var.f477019c;
                    java.lang.String name = fVar.f476908e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                    c17.put(str + "-top-" + i18, name);
                    c17.put(str + "-top-" + i18 + "-load", java.lang.Long.valueOf(c18));
                    c17.put(str + '-' + fVar.f476908e + "-load", java.lang.Long.valueOf(c18));
                }
                i17 = i18;
            }
        }
    }

    public void Ai(java.lang.String moduleName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        int andIncrement = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f.f149096g.getAndIncrement();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryMonitorService", "beginTrace: " + moduleName + ", id=" + andIncrement);
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d dVar = f149163d;
        if (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.a(dVar) != null) {
            synchronized (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.b(dVar)) {
                java.lang.Runnable runnable = (java.lang.Runnable) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.b(dVar).remove(moduleName);
                if (runnable != null) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f) runnable).f149099f = true;
                    android.os.Handler a17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.a(dVar);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                    a17.removeCallbacks(runnable);
                }
                java.util.Map b17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.b(dVar);
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f fVar = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f(andIncrement, moduleName, false, 4, null);
                android.os.Handler a18 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.a(dVar);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a18);
                a18.postDelayed(fVar, 5000L);
                b17.put(moduleName, fVar);
            }
        }
    }

    public void Bi(java.lang.String moduleName) {
        gi.h1 h1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d dVar = f149163d;
        int i17 = -1;
        if (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.a(dVar) != null) {
            synchronized (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.b(dVar)) {
                java.lang.Runnable runnable = (java.lang.Runnable) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.b(dVar).remove(moduleName);
                if (runnable != null) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f) runnable).f149099f = true;
                    android.os.Handler a17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.a(dVar);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                    a17.removeCallbacks(runnable);
                    i17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f) runnable).f149097d;
                }
                ph.u e17 = gi.d.e();
                if (e17 != null && (h1Var = (gi.h1) e17.f435829h.i(gi.h1.class)) != null) {
                    android.os.Handler a18 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d.a(dVar);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a18);
                    a18.post(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.g(moduleName, h1Var));
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryMonitorService", "endTrace: " + moduleName + ", id=" + i17);
    }

    public int Di() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v;
        int i17 = -1;
        for (java.util.Map.Entry entry : ((java.util.HashMap) ((v40.u) ((c50.t0) i95.n0.c(c50.t0.class))).wi()).entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getKey();
            java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    boolean z17 = false;
                    if (r26.n0.D(str2, ((java.lang.Class) it.next()).getName(), false, 2, null) && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "Finder") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "FinderShare"))) {
                        long j17 = ((v40.u) ((c50.t0) i95.n0.c(c50.t0.class))).f514728d;
                        if ((1 <= j17 && j17 < currentTimeMillis) && currentTimeMillis - j17 <= 5000) {
                            i17 = 100;
                            break;
                        }
                        long j18 = ((v40.u) ((c50.t0) i95.n0.c(c50.t0.class))).f514729e;
                        if (1 <= j18 && j18 < currentTimeMillis) {
                            z17 = true;
                        }
                        if (z17 && currentTimeMillis - j18 <= 5000) {
                            i17 = 101;
                            break;
                        }
                    }
                }
            }
        }
        if (i17 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BatteryMonitorService", "#figureModuleStatus: " + i17);
        }
        return i17;
    }

    public void Ni(java.lang.String type, long j17, java.lang.String fromProcess, java.lang.String toProcess, java.lang.String str) {
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromProcess, "fromProcess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toProcess, "toProcess");
        cr0.k4 k4Var = cr0.k4.f303202a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("key_process_track_starting", false)) {
            java.lang.String g17 = ri.i.g(fromProcess);
            java.lang.String g18 = ri.i.g(toProcess);
            java.lang.Throwable th6 = new java.lang.Throwable();
            java.lang.Throwable th7 = th6;
            while (true) {
                if (th7 == null) {
                    java.io.StringWriter stringWriter = new java.io.StringWriter();
                    java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                    th6.printStackTrace(printWriter);
                    printWriter.flush();
                    java.lang.String stringWriter2 = stringWriter.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringWriter2, "toString(...)");
                    str2 = stringWriter2;
                    break;
                }
                if (th7 instanceof java.net.UnknownHostException) {
                    str2 = "";
                    break;
                }
                th7 = th7.getCause();
            }
            java.lang.String t17 = r26.i0.t(r26.i0.u(str2, '\n', ';', false, 4, null), "\t", "", false);
            int andIncrement = ((java.util.concurrent.atomic.AtomicInteger) cr0.k4.f303204c.mo141623x754a37bb()).getAndIncrement();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g18);
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10873xa9ee8cad c10873xa9ee8cad = new com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10873xa9ee8cad(andIncrement, type, g17, g18, t17, j17, str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessTracker", "#noteProcessCall: " + c10873xa9ee8cad);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("process_call_stats_bin.bin").C(g17 + '-' + j17, c10873xa9ee8cad);
        }
    }

    public void Ri(long j17, rh.o2 delta, java.util.Map extra, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delta, "delta");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        rh.d3 d3Var = delta.f477019c;
        if (!(d3Var instanceof gi.x1)) {
            if (d3Var instanceof com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) {
                int i17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a.f149056m0;
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d3Var);
                Ui(j17, d3Var, extra, lVar);
                return;
            }
        }
        gi.x1 x1Var = (gi.x1) d3Var;
        if (!x1Var.c().isEmpty()) {
            java.lang.Object obj = extra.get("tasks-pool");
            if (obj == null) {
                obj = new java.util.LinkedHashMap();
                extra.put("tasks-pool", obj);
            }
            java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj);
            if (lVar != null) {
                lVar.mo146xb9724478(c17);
            }
            java.lang.Long l17 = (java.lang.Long) x1Var.f389454h.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            c17.put("pid-all-load", java.lang.Integer.valueOf(a06.d.b(x1Var.e(l17.longValue(), j17))));
            java.lang.Number number = x1Var.f389452f.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
            c17.put("pid-cap", number);
            rh.d3 d3Var2 = delta.f477018b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(d3Var2, "null cannot be cast to non-null type com.tencent.matrix.manager.ThreadPoolJiffies.ThreadPoolTaskSnapshot");
            java.lang.Number number2 = ((gi.x1) d3Var2).f389452f.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
            c17.put("pid-cap-end", number2);
            int i18 = 0;
            for (java.lang.Object obj2 : x1Var.c()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                kh.r1 r1Var = (kh.r1) obj2;
                if (i18 < 5) {
                    java.lang.Long l18 = (java.lang.Long) r1Var.f389437f.f477085a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
                    int b17 = a06.d.b(x1Var.e(l18.longValue(), j17));
                    java.lang.String str = r1Var.f389435d;
                    if (i18 == 0) {
                        aj(str, b17, extra);
                    }
                    c17.put("pid-top-" + i19, str);
                    c17.put("pid-top-" + i19 + "-load", java.lang.Integer.valueOf(b17));
                    c17.put("pid-" + str + "-load", java.lang.Integer.valueOf(b17));
                    java.lang.Number number3 = r1Var.f389436e.f477085a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number3, "get(...)");
                    c17.put("pid-" + str + "-count", number3);
                }
                i18 = i19;
            }
        }
    }

    public void Ui(long j17, rh.d3 snapshot, java.util.Map extra, yz5.l lVar) {
        kh.s3 s3Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        kh.f fVar;
        int i17;
        java.lang.String str5;
        java.lang.String str6;
        kh.a0 a0Var;
        java.lang.String str7;
        java.lang.String str8;
        java.util.Iterator it;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        int i18;
        java.lang.Long l17;
        java.lang.Object obj;
        java.lang.String str13;
        long longValue;
        java.lang.String str14;
        java.lang.Object obj2;
        cr0.b0 b0Var;
        rh.x2 x2Var;
        rh.x2 x2Var2;
        cr0.n3 n3Var;
        java.lang.String str15;
        java.lang.Long l18;
        int i19;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.String str16;
        rh.x2 x2Var3;
        rh.x2 x2Var4;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.String str20;
        java.lang.String str21;
        long j18 = j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        java.lang.String str22 = "-count";
        java.lang.String str23 = "-load";
        java.lang.String str24 = "pid-";
        java.lang.String str25 = "pid-top-";
        java.lang.String str26 = "get(...)";
        if (snapshot instanceof cr0.k0) {
            cr0.k0 k0Var = (cr0.k0) snapshot;
            if (!k0Var.b().isEmpty()) {
                java.lang.String str27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                java.util.List b17 = k0Var.b();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj5 : b17) {
                    java.lang.String str28 = ((cr0.r) obj5).f303258d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str27);
                    java.lang.String str29 = str22;
                    java.lang.String str30 = str23;
                    java.lang.String str31 = str24;
                    if (!r26.i0.A(str28, str27, false, 2, null)) {
                        arrayList.add(obj5);
                    }
                    str22 = str29;
                    str24 = str31;
                    str23 = str30;
                }
                java.lang.String str32 = str22;
                java.lang.String str33 = str23;
                java.lang.String str34 = str24;
                java.util.List F0 = kz5.n0.F0(arrayList, new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.j());
                if (!F0.isEmpty()) {
                    java.lang.Object obj6 = extra.get("binders");
                    if (obj6 == null) {
                        obj6 = new java.util.LinkedHashMap();
                        extra.put("binders", obj6);
                    }
                    java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj6);
                    if (lVar != null) {
                        lVar.mo146xb9724478(c17);
                    }
                    float f17 = (float) j18;
                    c17.put("pid-all-load", java.lang.Long.valueOf(a06.d.c((k0Var.f303323g.f477085a.floatValue() * 100.0f) / f17)));
                    java.util.Iterator it6 = F0.iterator();
                    long j19 = 0;
                    while (it6.hasNext()) {
                        java.lang.Number number = ((cr0.r) it6.next()).f303260f.f477085a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
                        j19 += ((java.lang.Long) number).longValue();
                    }
                    c17.put("pid-sys-load", java.lang.Long.valueOf(a06.d.c((((float) j19) * 100.0f) / f17)));
                    int i27 = 0;
                    for (java.lang.Object obj7 : F0) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        cr0.r rVar = (cr0.r) obj7;
                        if (i27 >= 5) {
                            str21 = str32;
                            str20 = str34;
                            str19 = str33;
                        } else {
                            long c18 = a06.d.c((rVar.f303260f.f477085a.floatValue() * 100.0f) / f17);
                            java.lang.String str35 = rVar.f303258d;
                            c17.put("pid-top-" + i28, str35);
                            java.lang.Long valueOf = java.lang.Long.valueOf(c18);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pid-top-");
                            sb6.append(i28);
                            str19 = str33;
                            sb6.append(str19);
                            c17.put(sb6.toString(), valueOf);
                            str20 = str34;
                            c17.put(str20 + str35 + str19, java.lang.Long.valueOf(c18));
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(str20);
                            sb7.append(str35);
                            str21 = str32;
                            sb7.append(str21);
                            java.lang.String sb8 = sb7.toString();
                            java.lang.Number number2 = rVar.f303259e.f477085a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
                            c17.put(sb8, number2);
                        }
                        str32 = str21;
                        str34 = str20;
                        str33 = str19;
                        i27 = i28;
                    }
                }
            }
        } else {
            java.lang.String str36 = "-count";
            java.lang.String str37 = "pid-";
            java.lang.String str38 = "uid-ratio-";
            java.lang.String str39 = "uid-";
            if (snapshot instanceof cr0.j) {
                cr0.j jVar = (cr0.j) snapshot;
                if (!jVar.b().isEmpty()) {
                    java.lang.String str40 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                    java.util.List b18 = jVar.b();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it7 = b18.iterator();
                    while (it7.hasNext()) {
                        java.lang.Object next = it7.next();
                        java.util.Iterator it8 = it7;
                        java.lang.String str41 = ((cr0.r) next).f303258d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str40);
                        java.lang.String str42 = str36;
                        java.lang.String str43 = str38;
                        java.lang.String str44 = str39;
                        if (!r26.i0.A(str41, str40, false, 2, null)) {
                            arrayList2.add(next);
                        }
                        it7 = it8;
                        str39 = str44;
                        str38 = str43;
                        str36 = str42;
                    }
                    java.lang.String str45 = str36;
                    java.lang.String str46 = str38;
                    java.lang.String str47 = str39;
                    int i29 = 0;
                    java.util.List F02 = kz5.n0.F0(arrayList2, new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.k());
                    if (true ^ F02.isEmpty()) {
                        java.lang.Object obj8 = extra.get("binders");
                        if (obj8 == null) {
                            obj8 = new java.util.LinkedHashMap();
                            extra.put("binders", obj8);
                        }
                        java.util.Map c19 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj8);
                        if (lVar != null) {
                            lVar.mo146xb9724478(c19);
                        }
                        float f18 = (float) j18;
                        c19.put("uid-all-load", java.lang.Long.valueOf(a06.d.c((jVar.f303323g.f477085a.floatValue() * 100.0f) / f18)));
                        java.util.Iterator it9 = F02.iterator();
                        long j27 = 0;
                        while (it9.hasNext()) {
                            java.lang.Number number3 = ((cr0.r) it9.next()).f303260f.f477085a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number3, "get(...)");
                            j27 += ((java.lang.Long) number3).longValue();
                        }
                        c19.put("uid-sys-load", java.lang.Long.valueOf(a06.d.c((((float) j27) * 100.0f) / f18)));
                        for (java.lang.Object obj9 : F02) {
                            int i37 = i29 + 1;
                            if (i29 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            cr0.r rVar2 = (cr0.r) obj9;
                            if (i29 >= 5) {
                                str17 = str47;
                                str18 = str45;
                            } else {
                                long c27 = a06.d.c((rVar2.f303260f.f477085a.floatValue() * 100.0f) / f18);
                                java.lang.String str48 = rVar2.f303258d;
                                c19.put("uid-top-" + i37, str48);
                                c19.put("uid-top-" + i37 + "-load", java.lang.Long.valueOf(c27));
                                str17 = str47;
                                c19.put(str17 + str48 + "-load", java.lang.Long.valueOf(c27));
                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder(str17);
                                sb9.append(str48);
                                str18 = str45;
                                sb9.append(str18);
                                java.lang.String sb10 = sb9.toString();
                                java.lang.Number number4 = rVar2.f303259e.f477085a;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number4, "get(...)");
                                c19.put(sb10, number4);
                            }
                            i29 = i37;
                            str45 = str18;
                            str47 = str17;
                        }
                        for (java.util.Map.Entry entry : jVar.d().entrySet()) {
                            c19.put(str46 + ((java.lang.String) entry.getKey()), entry.getValue());
                        }
                    }
                }
            } else {
                boolean z17 = snapshot instanceof cr0.n3;
                cr0.b0 b0Var2 = cr0.h0.f303166k;
                java.lang.String str49 = str36;
                java.lang.String str50 = "-rate-tx";
                java.lang.String str51 = "-load";
                java.lang.String str52 = "-rate-rx";
                java.lang.String str53 = "uid-";
                if (z17) {
                    cr0.n3 n3Var2 = (cr0.n3) snapshot;
                    if (!n3Var2.f303172i.isEmpty()) {
                        java.lang.Object obj10 = extra.get("nets");
                        if (obj10 == null) {
                            obj10 = new java.util.LinkedHashMap();
                            extra.put("nets", obj10);
                        }
                        java.util.Map c28 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj10);
                        if (lVar != null) {
                            lVar.mo146xb9724478(c28);
                        }
                        java.lang.Long l19 = (java.lang.Long) n3Var2.f303173j.f477085a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l19);
                        c28.put("pid-sum-rate", java.lang.Float.valueOf(b0Var2.c(l19.longValue(), j18)));
                        java.lang.Number number5 = n3Var2.f303170g.f477085a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number5, "get(...)");
                        c28.put("pid-sum-rate-rx", java.lang.Float.valueOf(b0Var2.c(number5.longValue(), j18)));
                        java.lang.Number number6 = n3Var2.f303171h.f477085a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number6, "get(...)");
                        c28.put("pid-sum-rate-tx", java.lang.Float.valueOf(b0Var2.c(number6.longValue(), j18)));
                        java.util.Iterator it10 = n3Var2.f303172i.iterator();
                        int i38 = 0;
                        while (it10.hasNext()) {
                            java.lang.Object next2 = it10.next();
                            java.util.Iterator it11 = it10;
                            int i39 = i38 + 1;
                            if (i38 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            cr0.d0 d0Var = (cr0.d0) next2;
                            java.lang.String str54 = str50;
                            if (i38 >= 5) {
                                n3Var = n3Var2;
                                l18 = l19;
                                i19 = i39;
                                str50 = str54;
                                str16 = str25;
                                str15 = str26;
                            } else {
                                java.lang.String str55 = d0Var.f303137d;
                                c28.put(str25 + i39, str55);
                                rh.x2 x2Var5 = d0Var.f303138e;
                                n3Var = n3Var2;
                                java.lang.Number number7 = x2Var5.f477085a;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number7, str26);
                                java.lang.String str56 = str26;
                                c28.put(str25 + i39 + "-rate", java.lang.Float.valueOf(b0Var2.c(number7.longValue(), j18)));
                                java.lang.String str57 = str25;
                                c28.put(str25 + i39 + "-ratio", java.lang.Long.valueOf(a06.d.c((x2Var5.f477085a.floatValue() * 100.0f) / ((float) l19.longValue()))));
                                java.lang.Number number8 = x2Var5.f477085a;
                                str15 = str56;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number8, str15);
                                l18 = l19;
                                i19 = i39;
                                c28.put(str37 + str55 + "-rate", java.lang.Float.valueOf(b0Var2.c(number8.longValue(), j18)));
                                java.lang.String str58 = str37 + str55 + "-rate-rx";
                                java.util.Iterator it12 = n3Var.b().iterator();
                                while (true) {
                                    if (it12.hasNext()) {
                                        obj3 = it12.next();
                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((cr0.d0) obj3).f303137d, str55)) {
                                            break;
                                        }
                                    } else {
                                        obj3 = null;
                                        break;
                                    }
                                }
                                cr0.d0 d0Var2 = (cr0.d0) obj3;
                                java.lang.Long l27 = (d0Var2 == null || (x2Var4 = d0Var2.f303138e) == null) ? null : (java.lang.Long) x2Var4.f477085a;
                                c28.put(str58, java.lang.Float.valueOf(b0Var2.c(l27 == null ? 0L : l27.longValue(), j18)));
                                java.lang.StringBuilder sb11 = new java.lang.StringBuilder(str37);
                                sb11.append(str55);
                                str50 = str54;
                                sb11.append(str50);
                                java.lang.String sb12 = sb11.toString();
                                java.util.Iterator it13 = n3Var.c().iterator();
                                while (true) {
                                    if (it13.hasNext()) {
                                        obj4 = it13.next();
                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((cr0.d0) obj4).f303137d, str55)) {
                                            break;
                                        }
                                    } else {
                                        obj4 = null;
                                        break;
                                    }
                                }
                                cr0.d0 d0Var3 = (cr0.d0) obj4;
                                java.lang.Long l28 = (d0Var3 == null || (x2Var3 = d0Var3.f303138e) == null) ? null : (java.lang.Long) x2Var3.f477085a;
                                float longValue2 = ((float) (l28 == null ? 0L : l28.longValue())) / 1048576.0f;
                                str16 = str57;
                                long j28 = j18 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
                                if (j28 < 1) {
                                    j28 = 1;
                                }
                                c28.put(sb12, java.lang.Float.valueOf(ri.b0.e(longValue2 / ((float) j28), 2)));
                            }
                            it10 = it11;
                            l19 = l18;
                            i38 = i19;
                            str26 = str15;
                            n3Var2 = n3Var;
                            str25 = str16;
                        }
                    }
                } else {
                    java.lang.String str59 = "pid-top-";
                    java.lang.String str60 = "get(...)";
                    if (snapshot instanceof cr0.p) {
                        cr0.p pVar = (cr0.p) snapshot;
                        if (!pVar.f303172i.isEmpty()) {
                            java.lang.Object obj11 = extra.get("nets");
                            if (obj11 == null) {
                                obj11 = new java.util.LinkedHashMap();
                                extra.put("nets", obj11);
                            }
                            java.util.Map c29 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj11);
                            if (lVar != null) {
                                lVar.mo146xb9724478(c29);
                            }
                            java.lang.Long l29 = (java.lang.Long) pVar.f303173j.f477085a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l29);
                            c29.put("uid-sum-rate", java.lang.Float.valueOf(b0Var2.c(l29.longValue(), j18)));
                            java.lang.Number number9 = pVar.f303170g.f477085a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number9, str60);
                            c29.put("uid-sum-rate-rx", java.lang.Float.valueOf(b0Var2.c(number9.longValue(), j18)));
                            java.lang.Number number10 = pVar.f303171h.f477085a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number10, str60);
                            c29.put("uid-sum-rate-tx", java.lang.Float.valueOf(b0Var2.c(number10.longValue(), j18)));
                            java.util.Iterator it14 = pVar.f303172i.iterator();
                            int i47 = 0;
                            while (it14.hasNext()) {
                                java.lang.Object next3 = it14.next();
                                int i48 = i47 + 1;
                                if (i47 < 0) {
                                    kz5.c0.p();
                                    throw null;
                                }
                                cr0.d0 d0Var4 = (cr0.d0) next3;
                                java.util.Iterator it15 = it14;
                                if (i47 >= 5) {
                                    l17 = l29;
                                    i18 = i48;
                                    str14 = str50;
                                    str13 = str52;
                                    str12 = str53;
                                    b0Var = b0Var2;
                                } else {
                                    java.lang.String str61 = d0Var4.f303137d;
                                    c29.put("uid-top-" + i48, str61);
                                    rh.x2 x2Var6 = d0Var4.f303138e;
                                    java.lang.String str62 = str50;
                                    java.lang.Number number11 = x2Var6.f477085a;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number11, str60);
                                    c29.put("uid-top-" + i48 + "-rate", java.lang.Float.valueOf(b0Var2.c(number11.longValue(), j18)));
                                    java.lang.String str63 = str52;
                                    c29.put("uid-top-" + i48 + "-ratio", java.lang.Long.valueOf(a06.d.c((x2Var6.f477085a.floatValue() * 100.0f) / ((float) l29.longValue()))));
                                    str12 = str53;
                                    java.lang.Number number12 = x2Var6.f477085a;
                                    str60 = str60;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number12, str60);
                                    i18 = i48;
                                    c29.put(str12 + str61 + "-rate", java.lang.Float.valueOf(b0Var2.c(number12.longValue(), j18)));
                                    java.lang.String str64 = str12 + str61 + str63;
                                    java.util.Iterator it16 = pVar.b().iterator();
                                    while (true) {
                                        if (!it16.hasNext()) {
                                            l17 = l29;
                                            obj = null;
                                            break;
                                        } else {
                                            obj = it16.next();
                                            l17 = l29;
                                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((cr0.d0) obj).f303137d, str61)) {
                                                break;
                                            } else {
                                                l29 = l17;
                                            }
                                        }
                                    }
                                    cr0.d0 d0Var5 = (cr0.d0) obj;
                                    java.lang.Long l37 = (d0Var5 == null || (x2Var2 = d0Var5.f303138e) == null) ? null : (java.lang.Long) x2Var2.f477085a;
                                    if (l37 == null) {
                                        str13 = str63;
                                        longValue = 0;
                                    } else {
                                        str13 = str63;
                                        longValue = l37.longValue();
                                    }
                                    c29.put(str64, java.lang.Float.valueOf(b0Var2.c(longValue, j18)));
                                    java.lang.StringBuilder sb13 = new java.lang.StringBuilder(str12);
                                    sb13.append(str61);
                                    str14 = str62;
                                    sb13.append(str14);
                                    java.lang.String sb14 = sb13.toString();
                                    java.util.Iterator it17 = pVar.c().iterator();
                                    while (true) {
                                        if (it17.hasNext()) {
                                            obj2 = it17.next();
                                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((cr0.d0) obj2).f303137d, str61)) {
                                                break;
                                            }
                                        } else {
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                    cr0.d0 d0Var6 = (cr0.d0) obj2;
                                    java.lang.Long l38 = (d0Var6 == null || (x2Var = d0Var6.f303138e) == null) ? null : (java.lang.Long) x2Var.f477085a;
                                    float longValue3 = ((float) (l38 == null ? 0L : l38.longValue())) / 1048576.0f;
                                    b0Var = b0Var2;
                                    long j29 = j18 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
                                    if (j29 < 1) {
                                        j29 = 1;
                                    }
                                    c29.put(sb14, java.lang.Float.valueOf(ri.b0.e(longValue3 / ((float) j29), 2)));
                                }
                                it14 = it15;
                                l29 = l17;
                                str53 = str12;
                                b0Var2 = b0Var;
                                str52 = str13;
                                str50 = str14;
                                i47 = i18;
                            }
                            for (java.util.Map.Entry entry2 : pVar.e().entrySet()) {
                                c29.put("uid-ratio-" + ((java.lang.String) entry2.getKey()), entry2.getValue());
                            }
                        }
                    } else if (snapshot instanceof cr0.d3) {
                        cr0.d3 d3Var = (cr0.d3) snapshot;
                        if (!d3Var.b().isEmpty()) {
                            java.lang.Object obj12 = extra.get("nets-cgi");
                            if (obj12 == null) {
                                obj12 = new java.util.LinkedHashMap();
                                extra.put("nets-cgi", obj12);
                            }
                            java.util.Map c37 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj12);
                            if (lVar != null) {
                                lVar.mo146xb9724478(c37);
                            }
                            float f19 = (float) j18;
                            c37.put("pid-all-load", java.lang.Long.valueOf(a06.d.c((d3Var.f303117f.f477085a.floatValue() * 100.0f) / f19)));
                            int i49 = 0;
                            for (java.lang.Object obj13 : d3Var.b()) {
                                int i57 = i49 + 1;
                                if (i49 < 0) {
                                    kz5.c0.p();
                                    throw null;
                                }
                                cr0.w2 w2Var = (cr0.w2) obj13;
                                if (i49 >= 5) {
                                    str11 = str49;
                                    str10 = str51;
                                    str9 = str59;
                                } else {
                                    long c38 = a06.d.c((w2Var.f303332f.f477085a.floatValue() * 100.0f) / f19);
                                    str9 = str59;
                                    java.lang.String str65 = w2Var.f303330d;
                                    c37.put(str9 + i57, str65);
                                    java.lang.Long valueOf2 = java.lang.Long.valueOf(c38);
                                    java.lang.StringBuilder sb15 = new java.lang.StringBuilder(str9);
                                    sb15.append(i57);
                                    str10 = str51;
                                    sb15.append(str10);
                                    c37.put(sb15.toString(), valueOf2);
                                    c37.put(str37 + str65 + str10, java.lang.Long.valueOf(c38));
                                    java.lang.StringBuilder sb16 = new java.lang.StringBuilder(str37);
                                    sb16.append(str65);
                                    str11 = str49;
                                    sb16.append(str11);
                                    java.lang.String sb17 = sb16.toString();
                                    java.lang.Number number13 = w2Var.f303331e.f477085a;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number13, str60);
                                    c37.put(sb17, number13);
                                }
                                i49 = i57;
                                str59 = str9;
                                str49 = str11;
                                str51 = str10;
                            }
                        }
                    } else {
                        java.lang.String str66 = str49;
                        java.lang.String str67 = str51;
                        if (snapshot instanceof kh.w0) {
                            kh.w0 w0Var = (kh.w0) snapshot;
                            if (!w0Var.c().isEmpty()) {
                                java.lang.Object obj14 = extra.get("tasks-looper");
                                if (obj14 == null) {
                                    obj14 = new java.util.LinkedHashMap();
                                    extra.put("tasks-looper", obj14);
                                }
                                java.util.Map c39 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj14);
                                if (lVar != null) {
                                    lVar.mo146xb9724478(c39);
                                }
                                java.lang.Long l39 = (java.lang.Long) w0Var.f389454h.f477085a;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l39);
                                c39.put("pid-all-load", java.lang.Integer.valueOf(a06.d.b(w0Var.e(l39.longValue(), j18))));
                                java.util.Iterator it18 = w0Var.c().iterator();
                                int i58 = 0;
                                while (it18.hasNext()) {
                                    java.lang.Object next4 = it18.next();
                                    int i59 = i58 + 1;
                                    if (i58 < 0) {
                                        kz5.c0.p();
                                        throw null;
                                    }
                                    kh.r1 r1Var = (kh.r1) next4;
                                    if (i58 >= 5) {
                                        it = it18;
                                    } else {
                                        java.lang.Long l47 = (java.lang.Long) r1Var.f389437f.f477085a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l47);
                                        it = it18;
                                        int b19 = a06.d.b(w0Var.e(l47.longValue(), j18));
                                        java.lang.String str68 = r1Var.f389435d;
                                        if (i58 == 0) {
                                            aj(str68, b19, extra);
                                        }
                                        c39.put(str59 + i59, str68);
                                        c39.put(str59 + i59 + str67, java.lang.Integer.valueOf(b19));
                                        c39.put(str37 + str68 + str67, java.lang.Integer.valueOf(b19));
                                        java.lang.String str69 = str37 + str68 + str66;
                                        java.lang.Number number14 = r1Var.f389436e.f477085a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number14, str60);
                                        c39.put(str69, number14);
                                    }
                                    it18 = it;
                                    i58 = i59;
                                }
                                java.lang.Object obj15 = extra.get("tasks-looperAvg");
                                if (obj15 == null) {
                                    obj15 = new java.util.LinkedHashMap();
                                    extra.put("tasks-looperAvg", obj15);
                                }
                                java.util.Map c47 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj15);
                                if (lVar != null) {
                                    lVar.mo146xb9724478(c47);
                                }
                                int i66 = 0;
                                for (java.lang.Object obj16 : kz5.n0.F0(w0Var.c(), new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.n())) {
                                    int i67 = i66 + 1;
                                    if (i66 < 0) {
                                        kz5.c0.p();
                                        throw null;
                                    }
                                    kh.r1 r1Var2 = (kh.r1) obj16;
                                    if (i66 < 5) {
                                        if (i66 == 0) {
                                            extra.put("task-name", r1Var2.f389435d);
                                        }
                                        long longValue4 = r1Var2.f389437f.f477085a.longValue();
                                        java.lang.Number number15 = r1Var2.f389436e.f477085a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number15, str60);
                                        int intValue = number15.intValue();
                                        if (intValue < 1) {
                                            intValue = 1;
                                        }
                                        long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds((longValue4 / intValue) * w0Var.b());
                                        c47.put(str59 + i67, r1Var2.f389435d);
                                        c47.put(str59 + i67 + "-sec", java.lang.Long.valueOf(seconds));
                                    }
                                    i66 = i67;
                                }
                            }
                        } else {
                            java.lang.String str70 = "-time";
                            if (!(snapshot instanceof kh.a0)) {
                                if (snapshot instanceof kh.f) {
                                    kh.f fVar2 = (kh.f) snapshot;
                                    if (!fVar2.c().isEmpty()) {
                                        java.lang.Object obj17 = extra.get("tasks-anime");
                                        if (obj17 == null) {
                                            obj17 = new java.util.LinkedHashMap();
                                            extra.put("tasks-anime", obj17);
                                        }
                                        java.util.Map c48 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj17);
                                        if (lVar != null) {
                                            lVar.mo146xb9724478(c48);
                                        }
                                        java.lang.Long l48 = (java.lang.Long) fVar2.f389454h.f477085a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l48);
                                        java.lang.String str71 = str66;
                                        c48.put("pid-all-load", java.lang.Integer.valueOf(a06.d.b(fVar2.e(l48.longValue(), j18))));
                                        int i68 = 0;
                                        for (java.lang.Object obj18 : fVar2.c()) {
                                            int i69 = i68 + 1;
                                            if (i68 < 0) {
                                                kz5.c0.p();
                                                throw null;
                                            }
                                            kh.r1 r1Var3 = (kh.r1) obj18;
                                            if (i68 >= 5) {
                                                fVar = fVar2;
                                                i17 = i69;
                                                str4 = str70;
                                                str5 = str60;
                                                str6 = str71;
                                            } else {
                                                java.lang.Long l49 = (java.lang.Long) r1Var3.f389437f.f477085a;
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l49);
                                                java.lang.String str72 = str70;
                                                java.lang.String str73 = str60;
                                                int b27 = a06.d.b(fVar2.e(l49.longValue(), j18));
                                                java.lang.String str74 = r1Var3.f389435d;
                                                if (i68 == 0) {
                                                    aj(str74, b27, extra);
                                                }
                                                c48.put(str59 + i69, str74);
                                                c48.put(str59 + i69 + str67, java.lang.Integer.valueOf(b27));
                                                java.lang.StringBuilder sb18 = new java.lang.StringBuilder(str59);
                                                sb18.append(i69);
                                                str4 = str72;
                                                sb18.append(str4);
                                                java.lang.String sb19 = sb18.toString();
                                                fVar = fVar2;
                                                java.lang.Number number16 = r1Var3.f389437f.f477085a;
                                                i17 = i69;
                                                str5 = str73;
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number16, str5);
                                                c48.put(sb19, number16);
                                                c48.put(str37 + str74 + str67, java.lang.Integer.valueOf(b27));
                                                java.lang.StringBuilder sb20 = new java.lang.StringBuilder(str37);
                                                sb20.append(str74);
                                                str6 = str71;
                                                sb20.append(str6);
                                                java.lang.String sb21 = sb20.toString();
                                                java.lang.Number number17 = r1Var3.f389436e.f477085a;
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number17, str5);
                                                c48.put(sb21, number17);
                                            }
                                            fVar2 = fVar;
                                            i68 = i17;
                                            str60 = str5;
                                            str71 = str6;
                                            str70 = str4;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                java.lang.String str75 = "-time";
                                if (snapshot instanceof kh.s3) {
                                    kh.s3 s3Var2 = (kh.s3) snapshot;
                                    if (!s3Var2.c().isEmpty()) {
                                        java.lang.Object obj19 = extra.get("tasks-traversal");
                                        if (obj19 == null) {
                                            obj19 = new java.util.LinkedHashMap();
                                            extra.put("tasks-traversal", obj19);
                                        }
                                        java.util.Map c49 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj19);
                                        if (lVar != null) {
                                            lVar.mo146xb9724478(c49);
                                        }
                                        java.lang.Long l57 = (java.lang.Long) s3Var2.f389454h.f477085a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l57);
                                        java.lang.String str76 = str66;
                                        c49.put("pid-all-load", java.lang.Integer.valueOf(a06.d.b(s3Var2.e(l57.longValue(), j18))));
                                        int i76 = 0;
                                        for (java.lang.Object obj20 : s3Var2.c()) {
                                            int i77 = i76 + 1;
                                            if (i76 < 0) {
                                                kz5.c0.p();
                                                throw null;
                                            }
                                            kh.r1 r1Var4 = (kh.r1) obj20;
                                            if (i76 >= 5) {
                                                s3Var = s3Var2;
                                                str = str67;
                                                str3 = str76;
                                                str2 = str75;
                                            } else {
                                                java.lang.Long l58 = (java.lang.Long) r1Var4.f389437f.f477085a;
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l58);
                                                java.lang.String str77 = str75;
                                                java.lang.String str78 = str67;
                                                int b28 = a06.d.b(s3Var2.e(l58.longValue(), j18));
                                                java.lang.String str79 = r1Var4.f389435d;
                                                if (i76 == 0) {
                                                    aj(str79, b28, extra);
                                                }
                                                c49.put(str59 + i77, str79);
                                                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(b28);
                                                java.lang.StringBuilder sb22 = new java.lang.StringBuilder(str59);
                                                sb22.append(i77);
                                                s3Var = s3Var2;
                                                str = str78;
                                                sb22.append(str);
                                                c49.put(sb22.toString(), valueOf3);
                                                java.lang.StringBuilder sb23 = new java.lang.StringBuilder(str59);
                                                sb23.append(i77);
                                                str2 = str77;
                                                sb23.append(str2);
                                                java.lang.String sb24 = sb23.toString();
                                                java.lang.Number number18 = r1Var4.f389437f.f477085a;
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number18, str60);
                                                c49.put(sb24, number18);
                                                c49.put(str37 + str79 + str, java.lang.Integer.valueOf(b28));
                                                java.lang.StringBuilder sb25 = new java.lang.StringBuilder(str37);
                                                sb25.append(str79);
                                                str3 = str76;
                                                sb25.append(str3);
                                                java.lang.String sb26 = sb25.toString();
                                                java.lang.Number number19 = r1Var4.f389436e.f477085a;
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number19, str60);
                                                c49.put(sb26, number19);
                                            }
                                            str76 = str3;
                                            i76 = i77;
                                            str75 = str2;
                                            j18 = j17;
                                            str67 = str;
                                            s3Var2 = s3Var;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            kh.a0 a0Var2 = (kh.a0) snapshot;
                            if (!a0Var2.c().isEmpty()) {
                                java.lang.Object obj21 = extra.get("tasks-chore");
                                if (obj21 == null) {
                                    obj21 = new java.util.LinkedHashMap();
                                    extra.put("tasks-chore", obj21);
                                }
                                java.util.Map c57 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(obj21);
                                if (lVar != null) {
                                    lVar.mo146xb9724478(c57);
                                }
                                java.lang.Long l59 = (java.lang.Long) a0Var2.f389454h.f477085a;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l59);
                                c57.put("pid-all-load", java.lang.Integer.valueOf(a06.d.b(a0Var2.e(l59.longValue(), j18))));
                                int i78 = 0;
                                for (java.lang.Object obj22 : a0Var2.c()) {
                                    int i79 = i78 + 1;
                                    if (i78 < 0) {
                                        kz5.c0.p();
                                        throw null;
                                    }
                                    kh.r1 r1Var5 = (kh.r1) obj22;
                                    if (i78 >= 5) {
                                        a0Var = a0Var2;
                                        str7 = str37;
                                        str8 = str66;
                                    } else {
                                        java.lang.Long l66 = (java.lang.Long) r1Var5.f389437f.f477085a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l66);
                                        java.lang.String str80 = str37;
                                        java.lang.String str81 = str66;
                                        int b29 = a06.d.b(a0Var2.e(l66.longValue(), j18));
                                        java.lang.String str82 = r1Var5.f389435d;
                                        if (i78 == 0) {
                                            aj(str82, b29, extra);
                                        }
                                        c57.put(str59 + i79, str82);
                                        a0Var = a0Var2;
                                        c57.put(str59 + i79 + str67, java.lang.Integer.valueOf(b29));
                                        java.lang.Number number20 = r1Var5.f389437f.f477085a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number20, str60);
                                        c57.put(str59 + i79 + "-time", number20);
                                        str7 = str80;
                                        c57.put(str7 + str82 + str67, java.lang.Integer.valueOf(b29));
                                        java.lang.StringBuilder sb27 = new java.lang.StringBuilder(str7);
                                        sb27.append(str82);
                                        str8 = str81;
                                        sb27.append(str8);
                                        java.lang.String sb28 = sb27.toString();
                                        java.lang.Number number21 = r1Var5.f389436e.f477085a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number21, str60);
                                        c57.put(sb28, number21);
                                    }
                                    a0Var2 = a0Var;
                                    str66 = str8;
                                    i78 = i79;
                                    str37 = str7;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void Vi(java.lang.String scope, gi.w0 monitors, java.util.Map extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(monitors, "monitors");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        qh.b bVar = monitors.f476863l;
        if (bVar != null) {
            if (!bVar.f444853m) {
                bVar = null;
            }
            if (bVar != null) {
                long j17 = bVar.f444854n;
                dr0.m mVar = (dr0.m) ((lh.l) i95.n0.c(lh.l.class));
                mVar.getClass();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j18 = currentTimeMillis - (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8 + j17);
                if (j18 > currentTimeMillis) {
                    throw new java.lang.IllegalArgumentException("begin(" + j18 + ") > end(" + currentTimeMillis + ')');
                }
                long Ri = mVar.Ri();
                if (j18 <= Ri && Ri <= currentTimeMillis) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryMonitorService", "reportExtended skip, battery reset!");
                    return;
                }
                rh.o2 t17 = monitors.t(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class);
                if (t17 != null) {
                    ob0.r2.H8(this, j17, t17, extra, null, 8, null);
                }
                java.util.Map map = monitors.f476858g;
                java.util.List list = (java.util.List) ((java.util.HashMap) map).get(gi.y1.class);
                if (list != null) {
                    wi(this, j17, "pool", list, extra);
                }
                java.util.List list2 = (java.util.List) ((java.util.HashMap) map).get(gi.g1.class);
                if (list2 != null) {
                    wi(this, j17, "handler", list2, extra);
                }
                java.util.List list3 = (java.util.List) ((java.util.HashMap) map).get(gi.v0.class);
                if (list3 != null) {
                    wi(this, j17, "ipc", list3, extra);
                }
                rh.o2 t18 = monitors.t(gi.x1.class);
                if (t18 != null) {
                    ob0.r2.H8(this, j17, t18, extra, null, 8, null);
                }
                rh.o2 t19 = monitors.t(kh.w0.class);
                if (t19 != null) {
                    ob0.r2.H8(this, j17, t19, extra, null, 8, null);
                }
                rh.o2 t27 = monitors.t(kh.a0.class);
                if (t27 != null) {
                    ob0.r2.H8(this, j17, t27, extra, null, 8, null);
                }
                rh.o2 t28 = monitors.t(kh.f.class);
                if (t28 != null) {
                    ob0.r2.H8(this, j17, t28, extra, null, 8, null);
                }
                rh.o2 t29 = monitors.t(kh.s3.class);
                if (t29 != null) {
                    ob0.r2.H8(this, j17, t29, extra, null, 8, null);
                }
                rh.o2 t37 = monitors.t(cr0.k0.class);
                if (t37 != null) {
                    ob0.r2.H8(this, j17, t37, extra, null, 8, null);
                }
                rh.o2 t38 = monitors.t(cr0.j.class);
                if (t38 != null) {
                    ob0.r2.H8(this, j17, t38, extra, null, 8, null);
                }
                rh.o2 t39 = monitors.t(cr0.n3.class);
                if (t39 != null) {
                    java.lang.Long l17 = (java.lang.Long) ((cr0.n3) t39.f477019c).f303167d.f477085a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                    Ri(l17.longValue(), t39, extra, new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.l(l17, j17));
                }
                rh.o2 t47 = monitors.t(cr0.p.class);
                if (t47 != null) {
                    java.lang.Long l18 = (java.lang.Long) ((cr0.p) t47.f477019c).f303167d.f477085a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
                    Ri(l18.longValue(), t47, extra, new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.m(l18, j17));
                }
                rh.o2 t48 = monitors.t(cr0.d3.class);
                if (t48 != null) {
                    ob0.r2.H8(this, j17, t48, extra, null, 8, null);
                }
            }
        }
    }

    public void Zi(int i17, ph.c state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (mm.o.c()) {
            qh.b b17 = qh.b.b(state.a());
            if (b17.f444853m) {
                long max = java.lang.Math.max(1L, state.a() / 60000);
                int c17 = b17.c();
                int d17 = b17.d();
                java.lang.String f17 = ri.i.f();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#statResUpdateInfo");
                android.util.SparseArray sparseArray = ri.s.f477541a;
                ri.s.b(0, 5, f17, "", c17, d17, "bgResUpdate", i17, "bg", state.e() ? 0L : 1L, "duringMin", max, b17.f444849i, "", b17.f444842b, b17.f444845e, b17.f444850j, "");
            }
        }
    }

    public final void aj(java.lang.String str, int i17, java.util.Map map) {
        if (map.containsKey("task-name")) {
            java.lang.Object obj = map.get("task-ratio");
            if (obj == null) {
                obj = 0;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            if (((java.lang.Integer) obj).intValue() >= i17) {
                return;
            }
        }
        map.put("task-name", str);
        map.put("task-ratio", java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02bd  */
    @Override // i95.w
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8845x3e5a77bb(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q.mo8845x3e5a77bb(android.content.Context):void");
    }
}
