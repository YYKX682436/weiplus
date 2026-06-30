package xj0;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static xj0.a f536305c;

    /* renamed from: a, reason: collision with root package name */
    public xj0.d f536306a = null;

    /* renamed from: b, reason: collision with root package name */
    public xj0.c f536307b = null;

    public static xj0.a h() {
        if (f536305c == null) {
            synchronized (xj0.a.class) {
                if (f536305c == null) {
                    f536305c = new xj0.a();
                }
            }
        }
        return f536305c;
    }

    public void a(java.lang.Object obj, int i17) {
        if ((obj instanceof android.content.Context) && (obj instanceof android.app.Activity)) {
            if (i17 == 0) {
                xj0.c cVar = this.f536307b;
                if (cVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onCreate: %s, %d", obj.getClass().getName(), java.lang.Integer.valueOf(obj.hashCode()));
                    g52.h hVar = ((g52.e) cVar).f350428a;
                    if (hVar.f350431a != null) {
                        android.app.Activity activity = (android.app.Activity) obj;
                        if (k95.b.a(activity)) {
                            android.content.Intent intent = activity.getIntent();
                            g52.b bVar = (g52.b) hVar.f350431a;
                            r45.sy4 a17 = bVar.f350425c.a(intent, activity);
                            r45.bn6 bn6Var = a17.f467549d;
                            long j17 = bn6Var.f452435f;
                            java.util.HashMap hashMap = p52.k.f433576a;
                            p52.k.c(bn6Var.f452433d);
                            d52.d.a().d(200, a17);
                            e62.q.a().d(6, a17.f467549d.f452433d, activity);
                            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) bVar.f350423a).iterator();
                            while (it.hasNext()) {
                                ((e42.j0) it.next()).s(intent, activity);
                            }
                        }
                    }
                    if (obj instanceof android.app.Activity) {
                        android.app.Activity activity2 = (android.app.Activity) obj;
                        if (k95.b.a(activity2)) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5783xc3394bf0 c5783xc3394bf0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5783xc3394bf0();
                            c5783xc3394bf0.f136094g.f88315a = activity2;
                            java.lang.System.currentTimeMillis();
                            c5783xc3394bf0.e();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            switch (i17) {
                case 2:
                    xj0.c cVar2 = this.f536307b;
                    if (cVar2 != null) {
                        ((g52.e) cVar2).c(obj);
                        return;
                    }
                    return;
                case 3:
                    xj0.c cVar3 = this.f536307b;
                    if (cVar3 != null) {
                        ((g52.e) cVar3).a(obj);
                        return;
                    }
                    return;
                case 4:
                    xj0.c cVar4 = this.f536307b;
                    if (cVar4 != null) {
                        ((g52.e) cVar4).d(obj);
                        return;
                    }
                    return;
                case 5:
                    xj0.c cVar5 = this.f536307b;
                    if (cVar5 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onDestroy: %s, %d", obj.getClass().getName(), java.lang.Integer.valueOf(obj.hashCode()));
                        g52.h hVar2 = ((g52.e) cVar5).f350428a;
                        if (hVar2.f350431a != null) {
                            android.app.Activity activity3 = (android.app.Activity) obj;
                            if (k95.b.a(activity3)) {
                                g52.b bVar2 = (g52.b) hVar2.f350431a;
                                bVar2.f350425c.getClass();
                                r45.bn6 bn6Var2 = new r45.bn6();
                                bn6Var2.f452433d = activity3.getClass().getCanonicalName();
                                bn6Var2.f452434e = activity3.hashCode();
                                bn6Var2.f452435f = java.lang.System.currentTimeMillis();
                                d52.d.a().d(207, bn6Var2);
                                e62.q.a().d(2, bn6Var2.f452433d, activity3);
                                java.util.HashMap hashMap2 = p52.k.f433576a;
                                java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArrayList) bVar2.f350423a).iterator();
                                while (it6.hasNext()) {
                                    ((e42.j0) it6.next()).d(activity3);
                                }
                            }
                        }
                        if (obj instanceof android.app.Activity) {
                            android.app.Activity activity4 = (android.app.Activity) obj;
                            if (k95.b.a(activity4)) {
                                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5784x106a400e c5784x106a400e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5784x106a400e();
                                c5784x106a400e.f136095g.f88376a = activity4;
                                java.lang.System.currentTimeMillis();
                                c5784x106a400e.e();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 6:
                    xj0.c cVar6 = this.f536307b;
                    if (cVar6 != null) {
                        ((g52.e) cVar6).b(obj);
                        return;
                    }
                    return;
                case 7:
                    xj0.c cVar7 = this.f536307b;
                    if (cVar7 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onUserLeaveHint: %s, %d", obj.getClass().getName(), java.lang.Integer.valueOf(obj.hashCode()));
                        g52.h hVar3 = ((g52.e) cVar7).f350428a;
                        if (hVar3.f350431a != null) {
                            android.app.Activity activity5 = (android.app.Activity) obj;
                            if (k95.b.a(activity5)) {
                                java.util.Iterator it7 = ((java.util.concurrent.CopyOnWriteArrayList) ((g52.b) hVar3.f350431a).f350423a).iterator();
                                while (it7.hasNext()) {
                                    ((e42.j0) it7.next()).t(activity5);
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void b(java.lang.Object obj) {
        xj0.c cVar;
        if (!(obj instanceof android.app.Activity) || (cVar = this.f536307b) == null) {
            return;
        }
        android.app.Activity activity = (android.app.Activity) obj;
        g52.e eVar = (g52.e) cVar;
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, finish: %s, %d", activity.getClass().getName(), java.lang.Integer.valueOf(activity.hashCode()));
        g52.h hVar = eVar.f350428a;
        if (hVar.f350431a != null && k95.b.a(activity)) {
            g52.b bVar = (g52.b) hVar.f350431a;
            bVar.f350425c.getClass();
            r45.bn6 bn6Var = new r45.bn6();
            bn6Var.f452433d = activity.getClass().getCanonicalName();
            bn6Var.f452434e = activity.hashCode();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            bn6Var.f452435f = currentTimeMillis;
            p52.k.b(activity, currentTimeMillis);
            p52.c cVar2 = p52.h.f433549a;
            d52.d.a().d(101, bn6Var);
            v52.c.g().a(activity, 2);
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) bVar.f350423a).iterator();
            while (it.hasNext()) {
                ((e42.j0) it.next()).J(activity);
            }
        }
        if (k95.b.a(activity)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5785x30fc06b9 c5785x30fc06b9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5785x30fc06b9();
            am.im imVar = c5785x30fc06b9.f136096g;
            imVar.f88493a = activity;
            imVar.f88494b = java.lang.System.currentTimeMillis();
            c5785x30fc06b9.e();
        }
    }

    public void c(java.lang.Object obj, int i17) {
        xj0.d dVar;
        if (obj instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) {
            if (i17 == 7) {
                xj0.d dVar2 = this.f536306a;
                if (dVar2 != null) {
                    ((nz1.a) dVar2).getClass();
                    if (obj != null && (obj instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) && nz1.a.f423074b) {
                        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nz1.a.f423073a).iterator();
                        while (it.hasNext()) {
                            try {
                                ((nz1.b) it.next()).j((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj);
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.FragmentLifecycleTracker", e17.getMessage());
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i17 == 8) {
                xj0.d dVar3 = this.f536306a;
                if (dVar3 != null) {
                    ((nz1.a) dVar3).getClass();
                    if (obj != null && (obj instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) && nz1.a.f423074b) {
                        java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArrayList) nz1.a.f423073a).iterator();
                        while (it6.hasNext()) {
                            try {
                                ((nz1.b) it6.next()).N((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj);
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.FragmentLifecycleTracker", e18.getMessage());
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i17 == 9) {
                xj0.d dVar4 = this.f536306a;
                if (dVar4 != null) {
                    ((nz1.a) dVar4).getClass();
                    if (obj != null && (obj instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) && nz1.a.f423074b) {
                        java.util.Iterator it7 = ((java.util.concurrent.CopyOnWriteArrayList) nz1.a.f423073a).iterator();
                        while (it7.hasNext()) {
                            try {
                                ((nz1.b) it7.next()).c((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj);
                            } catch (java.lang.Exception e19) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.FragmentLifecycleTracker", e19.getMessage());
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i17 != 12) {
                if (i17 == 13 && (dVar = this.f536306a) != null) {
                    ((nz1.a) dVar).getClass();
                    if (obj != null && (obj instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) && nz1.a.f423074b) {
                        java.util.Iterator it8 = ((java.util.concurrent.CopyOnWriteArrayList) nz1.a.f423073a).iterator();
                        while (it8.hasNext()) {
                            try {
                                ((nz1.b) it8.next()).L((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj);
                            } catch (java.lang.Exception e27) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.FragmentLifecycleTracker", e27.getMessage());
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            xj0.d dVar5 = this.f536306a;
            if (dVar5 != null) {
                ((nz1.a) dVar5).getClass();
                if (obj != null && (obj instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) && nz1.a.f423074b) {
                    java.util.Iterator it9 = ((java.util.concurrent.CopyOnWriteArrayList) nz1.a.f423073a).iterator();
                    while (it9.hasNext()) {
                        try {
                            ((nz1.b) it9.next()).m((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj);
                        } catch (java.lang.Exception e28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.FragmentLifecycleTracker", e28.getMessage());
                        }
                    }
                }
            }
        }
    }

    public java.lang.Object d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Object obj, java.lang.Object[] objArr) {
        yj0.c cVar;
        java.util.Map map = yj0.a.f544172a;
        yj0.e eVar = (yj0.e) ((java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a).get(str4 + "__HOOK__|" + str5 + "|" + str6);
        if (eVar == null || (cVar = eVar.f544175c) == null) {
            return null;
        }
        return cVar.a(str, str2, str3, str5, str6, obj, objArr);
    }

    public void e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Object obj, java.lang.Object[] objArr) {
        java.util.List list;
        java.util.List list2;
        if (str2 == null && str3 == null) {
            java.util.Map map = yj0.a.f544172a;
            yj0.e eVar = (yj0.e) ((java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a).get(str4 + "|" + str5 + "|" + str6);
            if (eVar == null || (list2 = eVar.f544173a) == null) {
                return;
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list2;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                yj0.d dVar = (yj0.d) it.next();
                if (dVar != null) {
                    dVar.b(str, str5, str6, obj, objArr);
                }
            }
            return;
        }
        java.util.Map map2 = yj0.a.f544172a;
        yj0.e eVar2 = (yj0.e) ((java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a).get(str4 + "|" + str5 + "|" + str6);
        if (eVar2 == null || (list = eVar2.f544174b) == null) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) list;
        if (copyOnWriteArrayList2.isEmpty()) {
            return;
        }
        java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
        while (it6.hasNext()) {
            yj0.b bVar = (yj0.b) it6.next();
            if (bVar != null) {
                bVar.b(str, str2, str3, str5, str6, obj, objArr);
            }
        }
    }

    public void f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Object obj, java.lang.Object obj2) {
        java.util.List list;
        java.util.List list2;
        if (str2 == null && str3 == null) {
            java.util.Map map = yj0.a.f544172a;
            yj0.e eVar = (yj0.e) ((java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a).get(str4 + "|" + str5 + "|" + str6);
            if (eVar == null || (list2 = eVar.f544173a) == null) {
                return;
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list2;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                yj0.d dVar = (yj0.d) it.next();
                if (dVar != null) {
                    dVar.a(str, str5, str6, obj, obj2);
                }
            }
            return;
        }
        java.util.Map map2 = yj0.a.f544172a;
        yj0.e eVar2 = (yj0.e) ((java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a).get(str4 + "|" + str5 + "|" + str6);
        if (eVar2 == null || (list = eVar2.f544174b) == null) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) list;
        if (copyOnWriteArrayList2.isEmpty()) {
            return;
        }
        java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
        while (it6.hasNext()) {
            yj0.b bVar = (yj0.b) it6.next();
            if (bVar != null) {
                bVar.a(str, str2, str3, str5, str6, obj, obj2);
            }
        }
    }

    public void g(java.lang.Object obj, android.content.Intent intent) {
        xj0.c cVar;
        if (xj0.b.a(obj) && (cVar = this.f536307b) != null) {
            g52.e eVar = (g52.e) cVar;
            eVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, startActivity: %s, %d", obj.getClass().getName(), java.lang.Integer.valueOf(obj.hashCode()));
            g52.h hVar = eVar.f350428a;
            g52.i iVar = hVar.f350431a;
            if (iVar != null) {
                if (obj instanceof android.app.Activity) {
                    android.app.Activity activity = (android.app.Activity) obj;
                    if (k95.b.a(activity)) {
                        ((g52.b) hVar.f350431a).a(activity, intent);
                    }
                } else {
                    ((g52.b) iVar).a(null, intent);
                }
            }
            g52.h.a(hVar, obj, intent);
        }
    }

    public void i(java.util.List list, yj0.b bVar) {
        java.util.Map map = yj0.a.f544172a;
        if (list == null || list.isEmpty() || bVar == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            java.lang.String str = "Undefined|" + ((java.lang.String) pair.first) + "|" + ((java.lang.String) pair.second);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a;
            if (concurrentHashMap.containsKey(str)) {
                yj0.e eVar = (yj0.e) concurrentHashMap.get(str);
                if (eVar == null) {
                    eVar = new yj0.e();
                }
                if (!((java.util.concurrent.CopyOnWriteArrayList) eVar.f544174b).contains(bVar)) {
                    ((java.util.concurrent.CopyOnWriteArrayList) eVar.f544174b).add(bVar);
                    concurrentHashMap.put(str, eVar);
                }
            } else {
                yj0.e eVar2 = new yj0.e();
                ((java.util.concurrent.CopyOnWriteArrayList) eVar2.f544174b).add(bVar);
                concurrentHashMap.put(str, eVar2);
            }
        }
    }

    public void j(java.util.Map map, yj0.b bVar) {
        java.util.Map map2 = yj0.a.f544172a;
        if (map == null || map.isEmpty() || bVar == null) {
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List<android.util.Pair> list = (java.util.List) entry.getValue();
            if (list != null) {
                for (android.util.Pair pair : list) {
                    java.lang.String str2 = str + "_EXEC_|" + ((java.lang.String) pair.first) + "|" + ((java.lang.String) pair.second);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a;
                    if (concurrentHashMap.containsKey(str2)) {
                        yj0.e eVar = (yj0.e) concurrentHashMap.get(str2);
                        if (eVar == null) {
                            eVar = new yj0.e();
                        }
                        if (!((java.util.concurrent.CopyOnWriteArrayList) eVar.f544174b).contains(bVar)) {
                            ((java.util.concurrent.CopyOnWriteArrayList) eVar.f544174b).add(bVar);
                            concurrentHashMap.put(str2, eVar);
                        }
                    } else {
                        yj0.e eVar2 = new yj0.e();
                        ((java.util.concurrent.CopyOnWriteArrayList) eVar2.f544174b).add(bVar);
                        concurrentHashMap.put(str2, eVar2);
                    }
                }
            }
        }
    }

    public void k(java.util.Map map, yj0.c cVar) {
        java.util.Map map2 = yj0.a.f544172a;
        if (map == null || map.isEmpty() || cVar == null) {
            throw new java.lang.NullPointerException("HABBYGE-MALI.hellhound, registerHookCallback, exception:register arguments mayby is null !");
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List<android.util.Pair> list = (java.util.List) entry.getValue();
            if (list != null) {
                for (android.util.Pair pair : list) {
                    java.lang.String str2 = str + "__HOOK__|" + ((java.lang.String) pair.first) + "|" + ((java.lang.String) pair.second);
                    yj0.e eVar = new yj0.e();
                    eVar.f544175c = cVar;
                    ((java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a).put(str2, eVar);
                }
            }
        }
    }

    public void l(java.util.Map map, yj0.d dVar) {
        java.util.Map map2 = yj0.a.f544172a;
        if (map == null || map.isEmpty() || dVar == null) {
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List<android.util.Pair> list = (java.util.List) entry.getValue();
            if (list != null) {
                for (android.util.Pair pair : list) {
                    java.lang.String str2 = str + "|" + ((java.lang.String) pair.first) + "|" + ((java.lang.String) pair.second);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a;
                    if (concurrentHashMap.containsKey(str2)) {
                        yj0.e eVar = (yj0.e) concurrentHashMap.get(str2);
                        if (eVar == null) {
                            eVar = new yj0.e();
                        }
                        if (!((java.util.concurrent.CopyOnWriteArrayList) eVar.f544173a).contains(dVar)) {
                            ((java.util.concurrent.CopyOnWriteArrayList) eVar.f544173a).add(dVar);
                            concurrentHashMap.put(str2, eVar);
                        }
                    } else {
                        yj0.e eVar2 = new yj0.e();
                        ((java.util.concurrent.CopyOnWriteArrayList) eVar2.f544173a).add(dVar);
                        concurrentHashMap.put(str2, eVar2);
                    }
                }
            }
        }
    }

    public void m(java.util.Map map, yj0.d dVar) {
        java.util.Map map2 = yj0.a.f544172a;
        if (map == null || map.isEmpty() || dVar == null) {
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.util.Pair pair = (android.util.Pair) entry.getValue();
            if (pair != null) {
                for (android.util.Pair pair2 : (java.util.List) pair.second) {
                    java.lang.String str2 = str + ((java.lang.String) pair.first) + "|" + ((java.lang.String) pair2.first) + "|" + ((java.lang.String) pair2.second);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a;
                    if (concurrentHashMap.containsKey(str2)) {
                        yj0.e eVar = (yj0.e) concurrentHashMap.get(str2);
                        if (eVar == null) {
                            eVar = new yj0.e();
                        }
                        if (!((java.util.concurrent.CopyOnWriteArrayList) eVar.f544173a).contains(dVar)) {
                            ((java.util.concurrent.CopyOnWriteArrayList) eVar.f544173a).add(dVar);
                            concurrentHashMap.put(str2, eVar);
                        }
                    } else {
                        yj0.e eVar2 = new yj0.e();
                        ((java.util.concurrent.CopyOnWriteArrayList) eVar2.f544173a).add(dVar);
                        concurrentHashMap.put(str2, eVar2);
                    }
                }
            }
        }
    }

    public void n(java.util.Map map, yj0.d dVar) {
        java.util.Map map2 = yj0.a.f544172a;
        if (map == null || map.isEmpty() || dVar == null) {
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Map map3 = (java.util.Map) entry.getValue();
            if (map3 != null) {
                for (java.util.Map.Entry entry2 : map3.entrySet()) {
                    java.lang.String str2 = (java.lang.String) entry2.getKey();
                    for (android.util.Pair pair : (java.util.List) entry2.getValue()) {
                        java.lang.String str3 = str + str2 + "|" + ((java.lang.String) pair.first) + "|" + ((java.lang.String) pair.second);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a;
                        if (concurrentHashMap.containsKey(str3)) {
                            yj0.e eVar = (yj0.e) concurrentHashMap.get(str3);
                            if (eVar == null) {
                                eVar = new yj0.e();
                            }
                            if (!((java.util.concurrent.CopyOnWriteArrayList) eVar.f544173a).contains(dVar)) {
                                ((java.util.concurrent.CopyOnWriteArrayList) eVar.f544173a).add(dVar);
                                concurrentHashMap.put(str3, eVar);
                            }
                        } else {
                            yj0.e eVar2 = new yj0.e();
                            ((java.util.concurrent.CopyOnWriteArrayList) eVar2.f544173a).add(dVar);
                            concurrentHashMap.put(str3, eVar2);
                        }
                    }
                }
            }
        }
    }

    public void o(java.util.Map map, yj0.d dVar) {
        java.util.List list;
        java.util.Map map2 = yj0.a.f544172a;
        if (map == null || dVar == null) {
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List<android.util.Pair> list2 = (java.util.List) entry.getValue();
            if (list2 != null) {
                for (android.util.Pair pair : list2) {
                    java.lang.String str2 = str + "|" + ((java.lang.String) pair.first) + "|" + ((java.lang.String) pair.second);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a;
                    yj0.e eVar = (yj0.e) concurrentHashMap.get(str2);
                    if (eVar != null && (list = eVar.f544173a) != null) {
                        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
                        if (!copyOnWriteArrayList.isEmpty() && copyOnWriteArrayList.contains(dVar)) {
                            copyOnWriteArrayList.remove(dVar);
                            if (copyOnWriteArrayList.isEmpty() && ((java.util.concurrent.CopyOnWriteArrayList) eVar.f544174b).isEmpty()) {
                                concurrentHashMap.remove(str2);
                            }
                        }
                    }
                }
            }
        }
    }

    public void p(java.util.Map map, yj0.d dVar) {
        java.util.List list;
        java.util.Map map2 = yj0.a.f544172a;
        if (map == null) {
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.util.Pair pair = (android.util.Pair) entry.getValue();
            if (pair != null) {
                for (android.util.Pair pair2 : (java.util.List) pair.second) {
                    java.lang.String str2 = str + ((java.lang.String) pair.first) + "|" + ((java.lang.String) pair2.first) + "|" + ((java.lang.String) pair2.second);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a;
                    yj0.e eVar = (yj0.e) concurrentHashMap.get(str2);
                    if (eVar != null && (list = eVar.f544173a) != null) {
                        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
                        if (!copyOnWriteArrayList.isEmpty() && copyOnWriteArrayList.contains(dVar)) {
                            copyOnWriteArrayList.remove(dVar);
                            if (copyOnWriteArrayList.isEmpty() && ((java.util.concurrent.CopyOnWriteArrayList) eVar.f544174b).isEmpty()) {
                                concurrentHashMap.remove(str2);
                            }
                        }
                    }
                }
            }
        }
    }

    public void q(java.util.Map map, yj0.d dVar) {
        java.util.List list;
        java.util.Map map2 = yj0.a.f544172a;
        if (map == null) {
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Map map3 = (java.util.Map) entry.getValue();
            if (map3 != null) {
                for (java.util.Map.Entry entry2 : map3.entrySet()) {
                    java.lang.String str2 = (java.lang.String) entry2.getKey();
                    for (android.util.Pair pair : (java.util.List) entry2.getValue()) {
                        java.lang.String str3 = str + str2 + "|" + ((java.lang.String) pair.first) + "|" + ((java.lang.String) pair.second);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a;
                        yj0.e eVar = (yj0.e) concurrentHashMap.get(str3);
                        if (eVar != null && (list = eVar.f544173a) != null) {
                            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
                            if (!copyOnWriteArrayList.isEmpty() && copyOnWriteArrayList.contains(dVar)) {
                                copyOnWriteArrayList.remove(dVar);
                                if (copyOnWriteArrayList.isEmpty() && ((java.util.concurrent.CopyOnWriteArrayList) eVar.f544174b).isEmpty()) {
                                    concurrentHashMap.remove(str3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
