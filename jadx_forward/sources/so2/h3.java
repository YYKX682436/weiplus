package so2;

/* loaded from: classes2.dex */
public final class h3 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.h3 f491925d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f491926e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f491927f;

    /* renamed from: g, reason: collision with root package name */
    public static java.util.LinkedList f491928g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f491929h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f491930i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f491931m;

    /* renamed from: n, reason: collision with root package name */
    public static java.util.HashMap f491932n;

    static {
        so2.h3 h3Var = new so2.h3();
        f491925d = h3Var;
        f491926e = jz5.h.b(so2.d3.f491846d);
        f491927f = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d), -18});
        f491928g = new java.util.LinkedList();
        f491929h = jz5.h.b(so2.e3.f491862d);
        if (!h3Var.g()) {
            gm0.j1.d().a(3520, h3Var);
        }
        f491930i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("Finder.FinderMarkReadLogic", so2.g3.f491894d);
        f491931m = new java.util.concurrent.atomic.AtomicInteger(0);
        f491932n = new java.util.HashMap();
    }

    public static final void a(so2.h3 h3Var) {
        h3Var.getClass();
        r45.qf2 qf2Var = new r45.qf2();
        qf2Var.set(2, f491928g);
        byte[] mo14344x5f01b1f6 = qf2Var.mo14344x5f01b1f6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183678n;
        sb6.append(str);
        sb6.append("markread.info");
        java.lang.String sb7 = sb6.toString();
        if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            com.p314xaae8f345.mm.vfs.w6.f(sb7);
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.w6.u(str);
        }
        com.p314xaae8f345.mm.vfs.w6.R(sb7, mo14344x5f01b1f6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "saveToFile " + sb7);
    }

    public static final void b(so2.h3 h3Var) {
        h3Var.getClass();
        int i17 = 0;
        while (i17 < f491928g.size()) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int i18 = i17 + 50;
            if (f491928g.size() > i18) {
                linkedList.addAll(f491928g.subList(i17, i18));
            } else {
                java.util.LinkedList linkedList2 = f491928g;
                linkedList.addAll(linkedList2.subList(i17, linkedList2.size()));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start to send new cgi ");
            sb6.append(h3Var.g());
            sb6.append(' ');
            sb6.append(linkedList.size());
            sb6.append(' ');
            java.util.LinkedList linkedList3 = f491928g;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
            java.util.Iterator it = linkedList3.iterator();
            while (it.hasNext()) {
                arrayList.add(pm0.v.u(((r45.ni4) it.next()).m75942xfb822ef2(0)));
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", sb6.toString());
            if (h3Var.g()) {
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                bq.z0 z0Var = new bq.z0(linkedList, null);
                z0Var.l().q(new so2.f3(z0Var));
            } else {
                db2.h6 h6Var = new db2.h6(linkedList);
                gm0.j1.d().a(3520, h3Var);
                gm0.j1.d().g(h6Var);
            }
            i17 = i18;
        }
    }

    public final void c(java.util.List list, r45.qt2 contextObj, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((fc2.r) it.next()).f342510a);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            fc2.r rVar = (fc2.r) it6.next();
            if (rVar.f342510a.mo2128x1ed62e84() != 0) {
                so2.j5 j5Var = rVar.f342510a;
                if (!(j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
                    if (f491927f.contains(java.lang.Integer.valueOf(j5Var.h()))) {
                    }
                }
                r45.ni4 ni4Var = new r45.ni4();
                ni4Var.set(6, java.lang.Integer.valueOf(rVar.f342511b));
                ni4Var.set(0, java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                ni4Var.set(15, abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.w() : null);
                f491925d.f(ni4Var, contextObj.m75939xb282bd08(5), contextObj.m75939xb282bd08(7));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                ni4Var.set(4, o3Var.ek(mo2128x1ed62e84, abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.w() : null, contextObj.m75939xb282bd08(5)));
                linkedList.add(ni4Var);
            }
        }
        e(linkedList, arrayList, contextObj, i17);
    }

    public final void d(java.util.LinkedList itemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "addMarkReadItemList " + itemList.size());
        android.os.Message mo50289x733c63a2 = f491930i.mo50289x733c63a2(0);
        mo50289x733c63a2.obj = itemList;
        mo50289x733c63a2.sendToTarget();
    }

    public final void e(java.util.LinkedList itemList, java.util.List list, r45.qt2 contextObj, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        d(itemList);
        if (contextObj.m75939xb282bd08(5) == 17 || contextObj.m75939xb282bd08(5) == 18 || contextObj.m75939xb282bd08(5) == 156 || contextObj.m75939xb282bd08(5) == 155 || contextObj.m75939xb282bd08(5) == 171 || contextObj.m75939xb282bd08(5) == 25 || contextObj.m75939xb282bd08(5) == 1 || contextObj.m75939xb282bd08(5) == 120) {
            ((ey2.i2) pf5.u.f435469a.e(c61.l7.class).a(ey2.i2.class)).N6(contextObj.m75939xb282bd08(5), list);
        } else if (contextObj.m75939xb282bd08(5) == 51) {
            ey2.e2 e2Var = (ey2.e2) pf5.u.f435469a.e(c61.l7.class).a(ey2.e2.class);
            e2Var.getClass();
            synchronized (e2Var.f338892g) {
                java.util.Iterator it = itemList.iterator();
                while (it.hasNext()) {
                    r45.ni4 ni4Var = (r45.ni4) it.next();
                    java.util.Iterator it6 = e2Var.f338892g.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i18 = -1;
                            break;
                        } else {
                            if (((r45.ni4) it6.next()).m75942xfb822ef2(0) == ni4Var.m75942xfb822ef2(0)) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                    }
                    if (i18 < 0 && !e2Var.f338893h.contains(java.lang.Long.valueOf(ni4Var.m75942xfb822ef2(0)))) {
                        e2Var.f338892g.add(ni4Var);
                        e2Var.f338893h.add(java.lang.Long.valueOf(ni4Var.m75942xfb822ef2(0)));
                    }
                }
            }
        }
        ey2.i2 i2Var = (ey2.i2) pf5.u.f435469a.e(c61.l7.class).a(ey2.i2.class);
        i2Var.getClass();
        if (list != null && i17 == 39) {
            i2Var.f338931i.b(list);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0032. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0035. Please report as an issue. */
    public final void f(r45.ni4 markReadStat, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(markReadStat, "markReadStat");
        markReadStat.set(3, java.lang.Integer.valueOf(i17));
        if (i17 != 1) {
            if (i17 == 20) {
                markReadStat.set(1, 6);
                markReadStat.set(2, 4);
                return;
            }
            if (i17 != 22) {
                if (i17 != 43) {
                    if (i17 == 76) {
                        markReadStat.set(1, 9);
                        return;
                    }
                    if (i17 == 80) {
                        markReadStat.set(1, 10);
                        return;
                    }
                    if (i17 != 156 && i17 != 171) {
                        switch (i17) {
                            case 4:
                            case 5:
                            case 7:
                                markReadStat.set(1, 2);
                                return;
                            case 6:
                                markReadStat.set(1, 4);
                                return;
                            case 8:
                                break;
                            default:
                                switch (i17) {
                                    case 15:
                                        markReadStat.set(1, 1);
                                        markReadStat.set(2, 3);
                                        return;
                                    case 16:
                                        break;
                                    case 17:
                                        break;
                                    case 18:
                                        markReadStat.set(1, 1);
                                        markReadStat.set(2, 2);
                                        return;
                                    default:
                                        switch (i17) {
                                            case 26:
                                                break;
                                            case 27:
                                                break;
                                            case 28:
                                            case 29:
                                            case 30:
                                            case 31:
                                                markReadStat.set(1, 8);
                                                return;
                                            default:
                                                return;
                                        }
                                }
                            case 9:
                                if (i18 == 34) {
                                    markReadStat.set(1, 8);
                                    return;
                                } else {
                                    markReadStat.set(1, 5);
                                    return;
                                }
                        }
                    }
                    markReadStat.set(1, 1);
                    markReadStat.set(2, 1);
                    return;
                }
                markReadStat.set(1, 7);
                markReadStat.set(2, 4);
                return;
            }
            if (i18 == 34) {
                markReadStat.set(1, 8);
                return;
            }
            return;
        }
        markReadStat.set(1, 3);
    }

    public final boolean g() {
        return ((java.lang.Boolean) f491926e.mo141623x754a37bb()).booleanValue();
    }

    public final java.util.LinkedList h(int i17) {
        r45.ni4 ni4Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209552x7).mo141623x754a37bb()).r()).booleanValue()) {
            return linkedList;
        }
        java.util.HashMap hashMap = (java.util.HashMap) f491932n.get(java.lang.Integer.valueOf(i17 != 1 ? i17 != 3 ? i17 != 4 ? 0 : 20 : 17 : 18));
        if (hashMap != null) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                if (((so2.x5) entry.getValue()).f492233e) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                linkedList2.add(((java.util.Map.Entry) it.next()).getValue());
            }
            kz5.g0.s(linkedList2);
            int i18 = 0;
            for (java.lang.Object obj : linkedList2) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.x5 x5Var = (so2.x5) obj;
                if (i18 < 20 && x5Var != null && (ni4Var = x5Var.f492235g) != null) {
                    linkedList.add(ni4Var);
                }
                i18 = i19;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getStreamMarkReadList: tabType=");
        sb6.append(i17);
        sb6.append(", size=");
        sb6.append(linkedList.size());
        sb6.append(", ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            arrayList.add(pm0.v.u(((r45.ni4) it6.next()).m75942xfb822ef2(0)));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", sb6.toString());
        return linkedList;
    }

    public final void i() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f491930i;
        n3Var.mo50303x856b99f0(1);
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderMarkReadReportIntervalSecond", 60);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "nextSend size: " + f491928g.size() + " delay second: " + b17);
        n3Var.mo50307xb9e94560(1, ((long) b17) * 1000);
    }

    public final void j(int i17, java.util.List feedList) {
        int i18;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        if (i17 == 1) {
            i18 = 18;
        } else if (i17 == 3) {
            i18 = 17;
        } else if (i17 != 4) {
            return;
        } else {
            i18 = 20;
        }
        java.util.HashMap hashMap = (java.util.HashMap) f491932n.get(java.lang.Integer.valueOf(i18));
        int size = hashMap != null ? hashMap.size() : 0;
        java.util.Iterator it = feedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
            java.util.HashMap hashMap2 = (java.util.HashMap) f491932n.get(java.lang.Integer.valueOf(i18));
            jz5.f0 f0Var = null;
            if (hashMap2 != null) {
                so2.x5 x5Var = (so2.x5) hashMap2.get(java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
                jz5.f0 f0Var2 = jz5.f0.f384359a;
                if (x5Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "already in mark read map isRead:" + x5Var.f492233e);
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    hashMap2.put(java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()), new so2.x5(c19792x256d2725.m76784x5db1b11(), false, 0L, null, 14, null));
                }
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                java.util.HashMap hashMap3 = f491932n;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put(java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()), new so2.x5(c19792x256d2725.m76784x5db1b11(), false, 0L, null, 14, null));
                hashMap3.put(valueOf, hashMap4);
            }
        }
        java.util.HashMap hashMap5 = (java.util.HashMap) f491932n.get(java.lang.Integer.valueOf(i18));
        if (hashMap5 == null || hashMap5.size() <= 50) {
            i19 = 0;
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(hashMap5.values());
            kz5.g0.s(linkedList);
            java.util.HashMap hashMap6 = f491932n;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            java.util.HashMap hashMap7 = new java.util.HashMap();
            i19 = 0;
            java.util.List<so2.x5> subList = linkedList.subList(0, 50);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
            for (so2.x5 x5Var2 : subList) {
                hashMap7.put(java.lang.Long.valueOf(x5Var2.f492232d), x5Var2);
            }
            hashMap6.put(valueOf2, hashMap7);
        }
        java.util.HashMap hashMap8 = (java.util.HashMap) f491932n.get(java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "onStreamCgiBack beforeSize:" + size + " afterSize:" + (hashMap8 != null ? hashMap8.size() : i19));
    }

    public final void k(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        android.os.Message mo50289x733c63a2 = f491930i.mo50289x733c63a2(2);
        mo50289x733c63a2.obj = list;
        mo50289x733c63a2.sendToTarget();
    }

    public final void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "start success " + f491931m.incrementAndGet());
        i();
    }

    public final void m() {
        int decrementAndGet = f491931m.decrementAndGet();
        if (decrementAndGet != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "not really stop " + decrementAndGet);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "really stop");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f491930i;
            n3Var.mo50303x856b99f0(1);
            n3Var.mo50305x3d8a09a2(5);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "onSceneEnd errType:" + i17 + " errCode:" + i18);
        if (m1Var == null || !(m1Var instanceof db2.h6)) {
            return;
        }
        so2.h3 h3Var = f491925d;
        if (!h3Var.g() && i17 == 0 && i18 == 0) {
            h3Var.k(((db2.h6) m1Var).f309544g);
        }
    }
}
