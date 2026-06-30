package com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3;

/* loaded from: classes8.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f151927a;

    public static void a() {
        gm0.j1.u().c().i(true);
    }

    public static void b(int i17) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ABTEST_UPDATE_TIME_INTERVAL_INT, java.lang.Integer.valueOf(i17 == 0 ? 86400 : (i17 < 3600 || i17 > 129600) ? new java.util.Random().nextInt(126000) + 3600 : 0));
    }

    public static void c() {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ABTEST_LAST_UPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
    }

    public static void d() {
        f151927a = true;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.y83();
        lVar.f152198b = new r45.z83();
        lVar.f152199c = "/cgi-bin/mmux-bin/getabtest";
        lVar.f152200d = 1801;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.y83 y83Var = (r45.y83) a17.f152243a.f152217a;
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ABTEST_SERVER_TIMESTAMP_INT, null);
        y83Var.f472387d = num == null ? 0 : num.intValue();
        com.p314xaae8f345.mm.p2621x8fb0427b.e Ai = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai();
        Ai.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor mo78085xb5882a6b = Ai.mo78085xb5882a6b();
        if (mo78085xb5882a6b != null && mo78085xb5882a6b.moveToFirst()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.c cVar = new com.p314xaae8f345.mm.p2621x8fb0427b.c();
            do {
                cVar.mo9015xbf5d97fd(mo78085xb5882a6b);
                r45.zl0 zl0Var = new r45.zl0();
                try {
                    zl0Var.f473724d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(cVar.f66191x29106093, 0);
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ABTestStorage", "expId parse failed, %s", cVar.f66191x29106093);
                }
                zl0Var.f473725e = cVar.f66194xac21bddb;
                linkedList.add(zl0Var);
            } while (mo78085xb5882a6b.moveToNext());
            mo78085xb5882a6b.close();
        }
        y83Var.f472388e = linkedList;
        com.p314xaae8f345.mm.p2621x8fb0427b.b wi6 = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.wi();
        wi6.getClass();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        android.database.Cursor mo78085xb5882a6b2 = wi6.mo78085xb5882a6b();
        if (mo78085xb5882a6b2 != null) {
            if (mo78085xb5882a6b2.moveToFirst()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a aVar = new com.p314xaae8f345.mm.p2621x8fb0427b.a();
                do {
                    aVar.mo9015xbf5d97fd(mo78085xb5882a6b2);
                    r45.zl0 zl0Var2 = new r45.zl0();
                    try {
                        zl0Var2.f473724d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(aVar.f66023x29106093, 0);
                    } catch (java.lang.Exception unused2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ABTestInfoStorage", "expId parse failed, %s", aVar.f66023x29106093);
                    }
                    zl0Var2.f473725e = aVar.f66025xac21bddb;
                    linkedList2.add(zl0Var2);
                } while (mo78085xb5882a6b2.moveToNext());
                mo78085xb5882a6b2.close();
            } else {
                mo78085xb5882a6b2.close();
            }
        }
        linkedList.addAll(linkedList2);
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.Iterator it = y83Var.f472388e.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            r45.zl0 zl0Var3 = (r45.zl0) it.next();
            str = str + zl0Var3.f473724d + ":" + zl0Var3.f473725e + "|";
        }
        objArr[0] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ABTestUpdater", "update abtest: %s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.c(), true);
    }

    public static void e() {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit aborted, Account not ready.");
        } else if (f151927a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, Already Updating");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, before do update");
            d();
        }
    }
}
