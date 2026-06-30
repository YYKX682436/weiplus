package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29;

/* loaded from: classes13.dex */
public class p implements com.p314xaae8f345.mm.p944x882e457a.u0, va0.n {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f233916f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f233917g = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f233918d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.n f233919e = null;

    public static void f(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k) it.next();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f67133x5c52593f)) {
                rn3.i.Di().n(kVar.f67143x2260084a);
            } else {
                rn3.i.Di().o(kVar.f67133x5c52593f);
            }
        }
    }

    public static void g(vn3.c cVar) {
        if (cVar == null) {
            return;
        }
        if (cVar.f519966c) {
            rn3.i.Di().o(cVar.f519964a);
        } else {
            rn3.i.Di().n(cVar.f519965b);
        }
    }

    public static void l(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar) {
        try {
            if (kVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTips.NewTipsManager", "reportDismissNewTips, newTipsInfo is null !!");
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(kVar.f67148x29dcef91);
            objArr[1] = kVar.f67151xc35ee71;
            objArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f67133x5c52593f) ? com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.d(kVar.f67143x2260084a) : kVar.f67133x5c52593f;
            java.lang.String format = java.lang.String.format("newtips_dismiss_%d-%s-%s", objArr);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).getBoolean(format, false)) {
                return;
            }
            int i17 = kVar.f67148x29dcef91;
            int i18 = kVar.f67149x2664ac30;
            long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).getLong("newtips_gettipstime", 0L);
            long j18 = kVar.f67131x8fbc34ae;
            long j19 = kVar.f67141xcd55f7c8;
            long j27 = kVar.f67132x1a23a28b;
            long j28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).getLong("newtips_realshow_time", 0L);
            long j29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).getLong("newtips_makeread_time", 0L);
            long j37 = j29 - j28;
            int i19 = kVar.f67146x991217c;
            java.lang.String str = kVar.f67150x29dd02d3;
            java.lang.String str2 = kVar.f67137xf1cc564e;
            java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f67133x5c52593f) ? com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.d(kVar.f67143x2260084a) : kVar.f67133x5c52593f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "newtipsreport:%d, id:%s_%s_%s", 2, java.lang.Integer.valueOf(i17), kVar.f67151xc35ee71, d17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14995, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37), 4, java.lang.Integer.valueOf(i19), str, str2, d17, "", 2, 0L, kVar.f67151xc35ee71);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).edit().putBoolean(format, true).commit();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NewTips.NewTipsManager", e17, null, new java.lang.Object[0]);
        }
    }

    public void a(int i17) {
        b(new vn3.c(i17));
    }

    public final void b(vn3.c cVar) {
        java.util.LinkedList linkedList;
        java.util.List b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.e.b(rn3.i.Bi().J0(cVar));
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k) it.next();
            kVar.f67147x29d3a50c = 1;
            l(kVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "clickNewTip(%s) clickNewTip tipsInfos state to NEW_TIPS_STATE_DISAPPEAR. ret: %s", cVar, java.lang.Integer.valueOf(rn3.i.Bi().P0(b17)));
        g(cVar);
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            r45.sm6 sm6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k) it6.next()).f67142x4548bac4;
            if (sm6Var != null && (linkedList = sm6Var.f467382d) != null) {
                java.util.Iterator it7 = linkedList.iterator();
                while (it7.hasNext()) {
                    java.lang.String str = (java.lang.String) it7.next();
                    int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.c(str);
                    vn3.c cVar2 = c17 == 0 ? new vn3.c(str) : new vn3.c(c17);
                    java.util.List J0 = rn3.i.Bi().J0(cVar2);
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) J0;
                    java.util.Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k) it8.next();
                        kVar2.f67147x29d3a50c = 1;
                        l(kVar2);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "clickNewTip() clickNewTip parentTipsInfos(%s) state to NEW_TIPS_STATE_DISAPPEAR. ret: %s", str, java.lang.Integer.valueOf(rn3.i.Bi().P0(J0)));
                    g(cVar2);
                    java.util.Iterator it9 = arrayList2.iterator();
                    while (it9.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k) it9.next();
                        d(rn3.i.Bi().D0(kVar3.f67151xc35ee71), kVar3, 1);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair c(vn3.c r15) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p.c(vn3.c):android.util.Pair");
    }

    public final void d(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar, int i17) {
        java.util.LinkedList linkedList;
        if (i17 >= 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTips.NewTipsManager", "logicDisappearParent() disappear fail!!!!!");
            return;
        }
        r45.sm6 sm6Var = kVar.f67142x4548bac4;
        if (sm6Var == null || (linkedList = sm6Var.f467382d) == null) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.c(str);
            vn3.c cVar = c17 == 0 ? new vn3.c(str) : new vn3.c(c17);
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k) it6.next();
                if (cVar.f519966c) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(kVar2.f67133x5c52593f, cVar.f519964a)) {
                        kVar2.f67147x29d3a50c = 1;
                        arrayList.add(kVar2);
                        d(list, kVar2, i17 + 1);
                        l(kVar2);
                    }
                } else if (kVar2.f67143x2260084a == cVar.f519965b) {
                    kVar2.f67147x29d3a50c = 1;
                    arrayList.add(kVar2);
                    d(list, kVar2, i17 + 1);
                    l(kVar2);
                }
            }
            rn3.i.Bi().P0(arrayList);
            g(cVar);
        }
    }

    public void e(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d y07 = rn3.i.wi().y0(i17);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTips.NewTipsManager", "newTipsInfo is null , makeRead failed!!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "dancy new tips tipsId:%s, make read: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (y07.f67243x2664ac30 == 0) {
            y07.f67237x9d48d07c = z17;
            rn3.i.wi().mo9952xce0038c9(y07, new java.lang.String[0]);
        }
        if (y07.f67243x2664ac30 == 1) {
            y07.f67237x9d48d07c = z17;
            rn3.i.wi().mo9952xce0038c9(y07, new java.lang.String[0]);
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).edit().putLong("newtips_makeread_time", java.lang.System.currentTimeMillis()).commit();
    }

    public final void h(int i17, int i18, int i19, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d y07 = rn3.i.wi().y0(i17);
        if (y07 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d();
            dVar.f67242x29dcef91 = i17;
            dVar.f67244x25315422 = i18;
            dVar.f67245x11c182c9 = str;
            dVar.f67243x2664ac30 = i19;
            if (dVar.f67246x4fa9bc8 == null) {
                dVar.f67246x4fa9bc8 = new r45.rm6();
            }
            dVar.f67246x4fa9bc8.f466553g = str2;
            rn3.i.wi().mo880xb970c2b9(dVar);
            if (i19 == 0) {
                if (dVar.f67238xff75c44d && i18 == dVar.f67244x25315422) {
                    return;
                }
                gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.b(i17, i18, str));
                return;
            }
            return;
        }
        if (i19 == 0 && (!y07.f67238xff75c44d || i18 != y07.f67244x25315422)) {
            gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.b(i17, i18, str));
        }
        if ((i19 != 0 || i18 == y07.f67244x25315422) && (i19 != 1 || i18 <= y07.f67244x25315422)) {
            return;
        }
        y07.f67242x29dcef91 = i17;
        y07.f67244x25315422 = i18;
        y07.f67245x11c182c9 = str;
        y07.f67243x2664ac30 = i19;
        y07.f67238xff75c44d = false;
        if (y07.f67246x4fa9bc8 == null) {
            y07.f67246x4fa9bc8 = new r45.rm6();
        }
        y07.f67246x4fa9bc8.f466553g = str2;
        rn3.i.wi().mo9952xce0038c9(y07, new java.lang.String[0]);
    }

    public void i(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            j(str, null);
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.o.class, null);
        }
    }

    public void j(java.lang.String str, rn3.l lVar) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("new_tips_" + gm0.m.i()).getBoolean(str == null ? "null" : str, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "registerLocalNewTips() uniqueId(%s) isReject(%s)", str, java.lang.Boolean.valueOf(z18));
        if (z18) {
            return;
        }
        if (lVar != null) {
            rn3.m.f479493a.put(str, lVar);
        }
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.c(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "registerLocalNewTips() uniqueId:%s", str);
    }

    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a aVar) {
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "registerNewTips() iNewTipsView is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.mo54844xfb83cc9b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "registerNewTips() iNewTipsView.getPath() is null");
            return;
        }
        if (aVar.W5()) {
            java.lang.String mo54844xfb83cc9b = aVar.mo54844xfb83cc9b();
            java.util.HashMap hashMap = f233917g;
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(mo54844xfb83cc9b);
            if (weakReference != null && aVar.equals((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a) weakReference.get())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "registerNewTips(%s) iNewTipsView had registed!", mo54844xfb83cc9b);
                o(mo54844xfb83cc9b);
                return;
            } else {
                hashMap.put(mo54844xfb83cc9b, new java.lang.ref.WeakReference(aVar));
                o(mo54844xfb83cc9b);
            }
        } else {
            int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.c(aVar.mo54844xfb83cc9b());
            java.util.HashMap hashMap2 = f233916f;
            java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) hashMap2.get(java.lang.Integer.valueOf(c17));
            if (weakReference2 != null && aVar.equals((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a) weakReference2.get())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "registerNewTips(%s) iNewTipsView had registed!", aVar.mo54844xfb83cc9b());
                n(c17);
                return;
            } else {
                hashMap2.put(java.lang.Integer.valueOf(c17), new java.lang.ref.WeakReference(aVar));
                n(c17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "registerNewTips() register %s (%s) [%s] (%s)", aVar.mo54844xfb83cc9b(), java.lang.Boolean.valueOf(aVar.W5()), aVar.toString(), aVar.getClass().getName() + "@" + java.lang.Integer.toHexString(aVar.hashCode()));
    }

    public void m(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d y07 = rn3.i.wi().y0(i17);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTips.NewTipsManager", "setPageStayTime fail! newTipsInfo is null!!");
        } else {
            y07.f67241xebf7975a = j17;
            rn3.i.wi().mo9952xce0038c9(y07, new java.lang.String[0]);
        }
    }

    public void n(int i17) {
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "showNewTip() path == 0");
        } else {
            p((java.lang.ref.WeakReference) f233916f.get(java.lang.Integer.valueOf(i17)), new vn3.c(i17));
        }
    }

    public void o(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "showNewTip() dynamicPath is null");
        } else {
            p((java.lang.ref.WeakReference) f233917g.get(str), new vn3.c(str));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.mo808xfb85f7b0() == 597 && i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.b) m1Var;
            boolean z17 = bVar.f233900f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d y07 = rn3.i.wi().y0(bVar.f233901g);
            if (y07 != null) {
                y07.f67239xe396f0e = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "Newtips push is reject: %s", java.lang.Boolean.valueOf(z17));
                rn3.i.wi().mo9952xce0038c9(y07, new java.lang.String[0]);
            }
        }
    }

    public final void p(java.lang.ref.WeakReference weakReference, vn3.c cVar) {
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "showNewTip() weakReference(%s) is null", cVar);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a) weakReference.get();
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "showNewTip() curNewTip(%s) is null", cVar);
        } else {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.h(aVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "showNewTip() curNewTip(%s) is show old new tip", cVar);
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.l(this, cVar, aVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public void q(java.lang.String str) {
        java.util.Iterator it;
        if (str != null) {
            java.util.Map map = this.f233918d;
            if (((java.util.HashMap) map).containsKey(str)) {
                java.util.List list = (java.util.List) ((java.util.HashMap) map).remove(str);
                java.lang.String str2 = "_newtips_report";
                ?? r47 = 0;
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                            java.util.Iterator it6 = list.iterator();
                            while (it6.hasNext()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k) it6.next();
                                java.lang.Object[] objArr = new java.lang.Object[3];
                                objArr[r47] = java.lang.Integer.valueOf(kVar.f67148x29dcef91);
                                objArr[1] = kVar.f67151xc35ee71;
                                objArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f67133x5c52593f) ? com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.d(kVar.f67143x2260084a) : kVar.f67133x5c52593f;
                                java.lang.String format = java.lang.String.format("newtips_show_%d-%s-%s", objArr);
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + str2, r47).getBoolean(format, r47)) {
                                    it = it6;
                                } else {
                                    int i17 = kVar.f67148x29dcef91;
                                    int i18 = kVar.f67149x2664ac30;
                                    long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + str2, r47).getLong("newtips_gettipstime", 0L);
                                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + str2, 0).edit().putLong("newtips_realshow_time", currentTimeMillis).commit();
                                    int i19 = kVar.f67146x991217c;
                                    java.lang.String str3 = kVar.f67150x29dd02d3;
                                    java.lang.String str4 = kVar.f67137xf1cc564e;
                                    it = it6;
                                    java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f67133x5c52593f) ? com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.d(kVar.f67143x2260084a) : kVar.f67133x5c52593f;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "newtipsreport:%d, id:%s_%s_%s", 1, java.lang.Integer.valueOf(i17), kVar.f67151xc35ee71, d17);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14995, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), "", "", "", java.lang.Long.valueOf(currentTimeMillis), "", "", "", java.lang.Integer.valueOf(i19), str3, str4, d17, "", 1, 0, kVar.f67151xc35ee71);
                                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e());
                                    str2 = str2;
                                    sb6.append(str2);
                                    context.getSharedPreferences(sb6.toString(), 0).edit().putBoolean(format, true).commit();
                                }
                                it6 = it;
                                r47 = 0;
                            }
                            return;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NewTips.NewTipsManager", e17, null, new java.lang.Object[0]);
                        return;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTips.NewTipsManager", "reportShowNewTips, newTipsInfo is null !!");
            }
        }
    }

    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a aVar) {
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "unRegisterNewTips() iNewTipsView is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.mo54844xfb83cc9b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "unRegisterNewTips() iNewTipsView.getPath() is null");
            return;
        }
        if (aVar.W5()) {
            java.lang.String mo54844xfb83cc9b = aVar.mo54844xfb83cc9b();
            java.util.HashMap hashMap = f233917g;
            if (((java.lang.ref.WeakReference) hashMap.get(mo54844xfb83cc9b)) != null) {
                hashMap.remove(mo54844xfb83cc9b);
            }
        } else {
            int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.c(aVar.mo54844xfb83cc9b());
            java.util.HashMap hashMap2 = f233916f;
            if (((java.lang.ref.WeakReference) hashMap2.get(java.lang.Integer.valueOf(c17))) != null) {
                hashMap2.remove(java.lang.Integer.valueOf(c17));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "unRegisterNewTips %s %s", aVar.mo54844xfb83cc9b(), java.lang.Boolean.valueOf(aVar.W5()));
    }
}
