package qi4;

/* loaded from: classes11.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final qi4.t f445320d = new qi4.t();

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = 1;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.p2572x26f8a610.C20728x821a7628()) != 1) {
            qi4.v vVar = qi4.v.f445321a;
            synchronized (vVar) {
                qi4.q qVar = qi4.v.f445324d;
                qi4.q qVar2 = qi4.q.f445315e;
                if (qVar != qVar2) {
                    java.lang.String str = qi4.v.f445324d.f445319d;
                } else {
                    qi4.v.f445324d = qi4.q.f445316f;
                    vVar.b();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] start");
                    long c17 = c01.id.c() - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    bw5.um0 m117490x103247b8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117490x103247b8("", 0, -1, c17);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    if (m117490x103247b8 == null || !m117490x103247b8.f115517d) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] failed, cost = " + currentTimeMillis2);
                        synchronized (vVar) {
                            qi4.v.f445324d = qVar2;
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] load aff db with all users success, size = " + m117490x103247b8.f115520g.size() + " cost = " + currentTimeMillis2);
                        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator it = m117490x103247b8.f115520g.iterator();
                        while (it.hasNext()) {
                            bw5.sm0 sm0Var = (bw5.sm0) it.next();
                            ai4.f fVar = ai4.f.f86672a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sm0Var);
                            arrayList.add(ai4.f.e(fVar, sm0Var, null, 2, null));
                        }
                        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] transform textStatusInfo success, size = " + m117490x103247b8.f115520g.size() + " cost = " + (currentTimeMillis4 - currentTimeMillis3));
                        synchronized (vVar) {
                            java.util.Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                mj4.k kVar = (mj4.k) ((mj4.h) it6.next());
                                qi4.v.f445322b.put(kVar.o(), kVar);
                            }
                            qi4.v.f445324d = qi4.q.f445317g;
                        }
                        long currentTimeMillis5 = java.lang.System.currentTimeMillis();
                        qi4.v.f445325e.countDown();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] finish, update cache cost: " + (currentTimeMillis5 - currentTimeMillis4));
                    }
                }
            }
            return;
        }
        qi4.v vVar2 = qi4.v.f445321a;
        synchronized (vVar2) {
            if (qi4.v.f445324d != qi4.q.f445315e) {
                java.lang.String str2 = qi4.v.f445324d.f445319d;
            } else {
                qi4.v.f445324d = qi4.q.f445316f;
                vVar2.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDayWithEachUsers] start");
                long c18 = c01.id.c() - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c;
                long currentTimeMillis6 = java.lang.System.currentTimeMillis();
                java.util.HashSet hashSet = new java.util.HashSet();
                boolean a17 = com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a();
                p75.d dVar = dm.e2.T1;
                l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
                int i18 = 0;
                p75.m c19 = dVar.g(1, 1).c(new p75.o0("type", 32, 0)).c(new p75.o0("type", 8, 0));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
                p75.m c27 = c19.c(new p75.o0("verifyFlag", 8, 0)).c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
                p75.i0 g17 = dm.e2.N1.g(kz5.b0.c(dm.e2.P1));
                g17.f434189c = "StatusJVMCacheStorage";
                g17.f434190d = c27;
                p75.l0 a18 = g17.a();
                l75.k0 k0Var = gm0.j1.u().f354686f;
                if (!k0Var.mo123783xb9a70294()) {
                    k0Var = null;
                }
                java.util.Iterator it7 = ((java.util.ArrayList) a18.l(k0Var)).iterator();
                while (it7.hasNext()) {
                    hashSet.add((java.lang.String) it7.next());
                }
                long currentTimeMillis7 = java.lang.System.currentTimeMillis() - currentTimeMillis6;
                int size = hashSet.size();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDayWithEachUsers] read contacts with all users success(opt), size = " + size + " cost = " + currentTimeMillis7);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it8 = hashSet.iterator();
                while (it8.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it8.next();
                    if ((str3.length() > 0 ? i17 : i18) != 0) {
                        int i19 = i18;
                        java.util.ArrayList arrayList3 = arrayList2;
                        bw5.um0 m117490x103247b82 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117490x103247b8(str3, 0, 1, c18);
                        if (m117490x103247b82 != null && m117490x103247b82.f115517d && m117490x103247b82.f115520g.size() > 0) {
                            ai4.f fVar2 = ai4.f.f86672a;
                            java.lang.Object obj = m117490x103247b82.f115520g.get(i19);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                            arrayList3.add(ai4.f.e(fVar2, (bw5.sm0) obj, null, 2, null));
                        }
                        i18 = i19;
                        arrayList2 = arrayList3;
                        i17 = 1;
                    }
                }
                java.util.ArrayList arrayList4 = arrayList2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDayWithEachUsers] load aff db with all users success, size = " + arrayList4.size() + '/' + size + " cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis6));
                long currentTimeMillis8 = java.lang.System.currentTimeMillis();
                long currentTimeMillis9 = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDayWithEachUsers] transform textStatusInfo success, size = " + arrayList4.size() + " cost = " + (currentTimeMillis9 - currentTimeMillis8));
                synchronized (vVar2) {
                    java.util.Iterator it9 = arrayList4.iterator();
                    while (it9.hasNext()) {
                        mj4.k kVar2 = (mj4.k) ((mj4.h) it9.next());
                        qi4.v.f445322b.put(kVar2.o(), kVar2);
                    }
                    qi4.v.f445324d = qi4.q.f445317g;
                }
                long currentTimeMillis10 = java.lang.System.currentTimeMillis();
                qi4.v.f445325e.countDown();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[loadAllCacheInRecentlyOneDay] finish, update cache cost: " + (currentTimeMillis10 - currentTimeMillis9));
            }
        }
    }
}
