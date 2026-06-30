package com.tencent.mm.model.newabtest;

/* loaded from: classes8.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f70394a;

    public static void a() {
        gm0.j1.u().c().i(true);
    }

    public static void b(int i17) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ABTEST_UPDATE_TIME_INTERVAL_INT, java.lang.Integer.valueOf(i17 == 0 ? 86400 : (i17 < 3600 || i17 > 129600) ? new java.util.Random().nextInt(126000) + 3600 : 0));
    }

    public static void c() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ABTEST_LAST_UPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
    }

    public static void d() {
        f70394a = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.y83();
        lVar.f70665b = new r45.z83();
        lVar.f70666c = "/cgi-bin/mmux-bin/getabtest";
        lVar.f70667d = 1801;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.y83 y83Var = (r45.y83) a17.f70710a.f70684a;
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_ABTEST_SERVER_TIMESTAMP_INT, null);
        y83Var.f390854d = num == null ? 0 : num.intValue();
        com.tencent.mm.storage.e Ai = com.tencent.mm.model.newabtest.z.Ai();
        Ai.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor all = Ai.getAll();
        if (all != null && all.moveToFirst()) {
            com.tencent.mm.storage.c cVar = new com.tencent.mm.storage.c();
            do {
                cVar.convertFrom(all);
                r45.zl0 zl0Var = new r45.zl0();
                try {
                    zl0Var.f392191d = com.tencent.mm.sdk.platformtools.t8.P(cVar.field_expId, 0);
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ABTestStorage", "expId parse failed, %s", cVar.field_expId);
                }
                zl0Var.f392192e = cVar.field_prioritylevel;
                linkedList.add(zl0Var);
            } while (all.moveToNext());
            all.close();
        }
        y83Var.f390855e = linkedList;
        com.tencent.mm.storage.b wi6 = com.tencent.mm.model.newabtest.z.wi();
        wi6.getClass();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        android.database.Cursor all2 = wi6.getAll();
        if (all2 != null) {
            if (all2.moveToFirst()) {
                com.tencent.mm.storage.a aVar = new com.tencent.mm.storage.a();
                do {
                    aVar.convertFrom(all2);
                    r45.zl0 zl0Var2 = new r45.zl0();
                    try {
                        zl0Var2.f392191d = com.tencent.mm.sdk.platformtools.t8.P(aVar.field_expId, 0);
                    } catch (java.lang.Exception unused2) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ABTestInfoStorage", "expId parse failed, %s", aVar.field_expId);
                    }
                    zl0Var2.f392192e = aVar.field_prioritylevel;
                    linkedList2.add(zl0Var2);
                } while (all2.moveToNext());
                all2.close();
            } else {
                all2.close();
            }
        }
        linkedList.addAll(linkedList2);
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.Iterator it = y83Var.f390855e.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            r45.zl0 zl0Var3 = (r45.zl0) it.next();
            str = str + zl0Var3.f392191d + ":" + zl0Var3.f392192e + "|";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.ABTestUpdater", "update abtest: %s", objArr);
        com.tencent.mm.modelbase.z2.d(a17, new com.tencent.mm.model.newabtest.c(), true);
    }

    public static void e() {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit aborted, Account not ready.");
        } else if (f70394a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, Already Updating");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, before do update");
            d();
        }
    }
}
