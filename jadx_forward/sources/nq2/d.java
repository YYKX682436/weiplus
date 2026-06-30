package nq2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static pq2.h f420514b;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Runnable f420520h;

    /* renamed from: a, reason: collision with root package name */
    public static final nq2.d f420513a = new nq2.d();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f420515c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f420516d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f420517e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final android.util.SparseArray f420518f = new android.util.SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f420519g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    public final int a(int i17) {
        java.lang.Integer num = (java.lang.Integer) f420518f.get(i17);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final boolean b() {
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85323k1).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public final pq2.e c(r45.dd2 tabInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabInfo, "tabInfo");
        return (pq2.e) f420515c.get(java.lang.Integer.valueOf(tabInfo.m75939xb282bd08(0)));
    }

    public final pq2.e d(int i17, int i18, int i19) {
        r45.dd2 dd2Var = new r45.dd2();
        dd2Var.set(0, java.lang.Integer.valueOf(i18));
        pq2.e c17 = c(dd2Var);
        if (c17 == null || c17.f439121o != i17 || c17.f439123q != i19) {
            r45.dd2 dd2Var2 = new r45.dd2();
            dd2Var2.set(0, java.lang.Integer.valueOf(i18));
            return new pq2.e(i17, dd2Var2, i19);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "getTargetNearbyLiveSquareTabPagePreload return map cache tabId: " + i18);
        return c17;
    }

    public final boolean e() {
        ae2.b2 b2Var = ae2.b2.f84994a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.I).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public final void f(r45.qt2 contextObj, r45.dd2 dd2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstPageRender tab:[");
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)) : null);
        sb6.append(", ");
        sb6.append(dd2Var != null ? dd2Var.m75945x2fec8307(1) : null);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", sb6.toString());
        if (!b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", "onFirstPageRender return for enableNearbyLivePagesPreload:" + b());
            return;
        }
        if (dd2Var != null) {
            java.util.LinkedList linkedList = f420517e;
            if (linkedList.size() == 0) {
                java.util.LinkedList linkedList2 = f420516d;
                java.lang.Runnable runnable = f420520h;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f420519g;
                if (runnable != null) {
                    n3Var.mo50300x3fa464aa(runnable);
                    f420520h = null;
                }
                nq2.a aVar = new nq2.a(contextObj, linkedList2);
                f420520h = aVar;
                n3Var.mo50297x7c4d7ca2(aVar, 700L);
            }
            java.util.Iterator it = linkedList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((r45.dd2) it.next()).m75939xb282bd08(0) == dd2Var.m75939xb282bd08(0)) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (i17 == -1) {
                linkedList.add(dd2Var);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", "onFirstPageRender return for tab page rendered tab:[" + dd2Var.m75939xb282bd08(0) + ", " + dd2Var.m75945x2fec8307(1) + ']');
        }
    }

    public final void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "release");
        f420519g.mo50300x3fa464aa(f420520h);
        f420520h = null;
        pq2.h hVar = f420514b;
        if (hVar != null) {
            hVar.i();
        }
        java.util.HashMap hashMap = f420515c;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((pq2.e) ((java.util.Map.Entry) it.next()).getValue()).i();
        }
        hashMap.clear();
        f420517e.clear();
        f420516d.clear();
    }

    public final void h(android.content.Intent intent, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        int i19 = 9400000 + i17;
        pq2.e d17 = d(i19, i17, i18);
        d17.k();
        r45.qt2 qt2Var = new r45.qt2();
        d17.f439124r = qt2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        wo2.n0 n0Var = wo2.n0.f529638a;
        sb6.append(n0Var.d());
        sb6.append('-');
        sb6.append(c01.id.c());
        qt2Var.set(2, sb6.toString());
        r45.qt2 qt2Var2 = d17.f439124r;
        if (qt2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        qt2Var2.set(5, java.lang.Integer.valueOf(n0Var.a()));
        r45.qt2 qt2Var3 = d17.f439124r;
        if (qt2Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nk();
        }
        qt2Var3.set(1, stringExtra);
        r45.qt2 qt2Var4 = d17.f439124r;
        if (qt2Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        qt2Var4.set(0, Ri);
        r45.qt2 qt2Var5 = d17.f439124r;
        if (qt2Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        qt2Var5.set(9, "");
        r45.qt2 qt2Var6 = d17.f439124r;
        if (qt2Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        qt2Var6.set(11, "");
        r45.qt2 qt2Var7 = d17.f439124r;
        if (qt2Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        qt2Var7.set(12, "");
        d17.h();
        f420515c.put(java.lang.Integer.valueOf(i17), d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "startRedDot preload PagePreloadMap commentScene: " + i19 + " TabId: " + i17 + " memoryType: " + (i17 + 1005000 + a(i17)));
    }

    public final void i(r45.qt2 contextObj, r45.dd2 dd2Var, int i17, java.lang.String str) {
        jz5.f0 f0Var;
        if (dd2Var != null) {
            nq2.d dVar = f420513a;
            int a17 = dVar.a(dd2Var.m75939xb282bd08(0));
            pq2.e d17 = dVar.d(a17, dd2Var.m75939xb282bd08(0), i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
            d17.k();
            d17.f439124r = contextObj;
            d17.h();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startLiveSquareTabPagePreload PagePreloadMap commentScene ");
            sb6.append(a17);
            sb6.append(" TabId: ");
            sb6.append(dd2Var.m75939xb282bd08(0));
            sb6.append(" Tabname: ");
            sb6.append(dd2Var.m75945x2fec8307(1));
            sb6.append(" memoryType: ");
            int m75939xb282bd08 = dd2Var.m75939xb282bd08(0);
            sb6.append(m75939xb282bd08 + 1005000 + dVar.a(m75939xb282bd08));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", sb6.toString());
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", "startLiveSquareTabPagePreload " + str + " return for null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(android.content.Intent intent) {
        int i17;
        int i18;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.V4;
        int i19 = 0;
        if ((((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == 1) != true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreloadForFindPageRedDot return for enableRedHotStartPreload:");
            sb6.append(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", sb6.toString());
            return;
        }
        g();
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        java.lang.String str = c92.g.f121271a.b() ? "FinderLiveEntrance" : "NearbyEntrance";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0(str);
        long j17 = 0;
        if (L0 == null || L0.I0(str) == null || L0.m55856xfb85f7b0() != 16) {
            i17 = 0;
            i18 = 0;
        } else {
            nk6.a0(L0);
            r45.xs2 xs2Var = L0.N;
            int m75939xb282bd08 = xs2Var.m75939xb282bd08(12);
            i17 = xs2Var.m75939xb282bd08(17);
            i18 = xs2Var.m75939xb282bd08(13);
            long m75942xfb822ef2 = xs2Var.m75942xfb822ef2(3);
            int i27 = m75939xb282bd08 == 0 ? 88890 : m75939xb282bd08;
            wo2.n0.f529641d.remove(94);
            pf5.u uVar = pf5.u.f435469a;
            p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.e(c61.l7.class).a(ey2.c3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            int Di = ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).Di(94, i27);
            int i28 = 1005000 + i27 + Di;
            ey2.x2 O6 = ((ey2.c3) uVar.e(c61.l7.class).a(ey2.c3.class)).O6(i28);
            O6.f339106f = ey2.z2.f339132e;
            O6.f339105e = 0L;
            O6.f339109i = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadCacheManager", "resetFirstPage memoryCacheFlag:" + i28);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "resetTargetTabCache tabId:" + i27 + " commentScene: " + Di + " memoryCacheFlag: " + i28);
            i19 = m75939xb282bd08;
            j17 = m75942xfb822ef2;
        }
        if (i19 != 0 && i17 != 0) {
            k(intent);
            h(intent, i19, 11);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "startPreloadForFindPageRedDot preLoad:" + i17 + " targetTabId:" + i19);
        }
        if (i18 == 1) {
            dp2.e.f323725a.c(null, j17, "", false, 94, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "startPreloadForFindPageRedDot checkEnterTargetLiveRoom enterLiveAction:" + i18 + " targetObjectId:" + j17);
    }

    public final void k(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.W4;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == 1)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreloadSquareTabs return for enableNearbySquareTabsPreload:");
            sb6.append(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", sb6.toString());
            return;
        }
        nq2.c cVar = new nq2.c(intent);
        pq2.h hVar = f420514b;
        if (hVar != null) {
            int ordinal = hVar.f439118n.ordinal();
            if (ordinal == 1) {
                hVar.f(new nq2.b(cVar));
                return;
            } else if (ordinal == 5 && hVar.e() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "startPreloadSquareTabs hit requestCache");
                return;
            }
        }
        cVar.mo146xb9724478(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
    }

    public final void l(android.content.Intent intent, int i17, int i18, java.lang.String tabName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabName, "tabName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "startSquareTabPagePreloadFromClick isEnableClickPreload: " + e());
        if (e()) {
            rq2.s.f480412a.d(i18, i17 + 1001, tabName);
            h(intent, i17, i18);
        }
    }
}
