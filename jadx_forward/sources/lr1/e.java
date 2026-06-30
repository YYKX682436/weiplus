package lr1;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final lr1.e f402184a = new lr1.e();

    /* renamed from: b, reason: collision with root package name */
    public static long f402185b;

    /* renamed from: c, reason: collision with root package name */
    public static long f402186c;

    public static final long a(lr1.e eVar) {
        java.util.List list;
        java.lang.String str;
        java.lang.String str2;
        long j17;
        eVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMassSendStorageUtil", "getLatestBizSubscribeContactCreateTime: start");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        java.lang.String b17 = r26.b0.b("\n            SELECT username\n            FROM rcontact\n            WHERE (verifyFlag & 8) != 0\n            AND (type & 1) != 0\n        ");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = gm0.j1.u().f354686f.B(b17, null);
        if (B != null) {
            while (B.moveToNext()) {
                try {
                    java.lang.String string = B.getString(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    arrayList.add(string);
                } finally {
                }
            }
            vz5.b.a(B, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMassSendStorageUtil", "getBizContactUsernames: found " + arrayList.size() + " contacts");
        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis2;
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMassSendStorageUtil", "no biz subscribe contacts");
            return -1L;
        }
        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
        if (arrayList.isEmpty()) {
            list = kz5.p0.f395529d;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            list = arrayList2;
            if (Bi != null) {
                android.database.Cursor B2 = Bi.B(arrayList);
                list = arrayList2;
                if (B2 != null) {
                    while (B2.moveToNext()) {
                        try {
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                            z3Var.mo9015xbf5d97fd(B2);
                            if (z3Var.n2()) {
                                java.lang.String d17 = z3Var.d1();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                                arrayList2.add(d17);
                            }
                        } catch (java.lang.Throwable th6) {
                            try {
                                throw th6;
                            } catch (java.lang.Throwable th7) {
                                vz5.b.a(B2, th6);
                                throw th7;
                            }
                        }
                    }
                    vz5.b.a(B2, null);
                    list = arrayList2;
                }
            }
        }
        long currentTimeMillis5 = java.lang.System.currentTimeMillis() - currentTimeMillis4;
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMassSendStorageUtil", "bizSubscribeUsernames empty, step1 cost: " + currentTimeMillis3 + "ms, step2 cost: " + currentTimeMillis5 + "ms");
            return -1L;
        }
        long currentTimeMillis6 = java.lang.System.currentTimeMillis();
        if (list.isEmpty()) {
            str2 = "ms";
            str = "ms, step2 cost: ";
            j17 = -1;
        } else {
            str = "ms, step2 cost: ";
            str2 = "ms";
            android.database.Cursor B3 = gm0.j1.u().f354686f.B(r26.b0.b("\n            SELECT MAX(createTime) \n            FROM message \n            WHERE talker IN (" + kz5.n0.g0(list, ",", null, null, 0, null, lr1.d.f402181d, 30, null) + ")\n        "), null);
            if (B3 != null) {
                try {
                    j17 = B3.moveToFirst() ? B3.getLong(0) : 0L;
                    vz5.b.a(B3, null);
                } finally {
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMassSendStorageUtil", "getLatestBizSubscribeContactCreateTime: completed, total contacts: " + arrayList.size() + ", biz subscribe contacts: " + list.size() + ", latest message time: " + j17 + ", step1 cost: " + currentTimeMillis3 + str + currentTimeMillis5 + "ms, step3 cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis6) + "ms, total cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + str2);
        return j17;
    }
}
