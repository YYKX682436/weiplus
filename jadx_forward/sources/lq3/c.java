package lq3;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final kq3.h f401989a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f401990b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f401991c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f401992d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f401993e;

    public c(kq3.h hVar) {
        this.f401989a = hVar;
        if (hVar.e(f(), 0L) != e()) {
            if (hVar.g(d())) {
                hVar.b(d());
            }
            hVar.c(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (chat TEXT, talker TEXT, date INTEGER, dayreceivecount INTEGER, dayclickcount INTEGER, weekreceivecount INTEGER, weekclickcount INTEGER, monthreceivecount INTEGER, monthclickcount INTEGER, dayclickrate FLOAT, weekclickrate FLOAT, monthclickrate FLOAT, PRIMARY KEY(chat, talker, date));", d()));
            hVar.i(f(), e());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgBaseUsageStorage", "Exist Table %s %d", d(), java.lang.Integer.valueOf(hVar.f(d())));
        }
        this.f401990b = hVar.a(java.lang.String.format("INSERT OR REPLACE INTO %s (chat, talker, date, dayreceivecount, dayclickcount, weekreceivecount, weekclickcount, monthreceivecount, monthclickcount, dayclickrate, weekclickrate, monthclickrate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)", d()));
        this.f401991c = hVar.a(java.lang.String.format("UPDATE %s SET dayreceivecount = ?, weekreceivecount = ?, monthreceivecount = ?, dayclickrate = ?, weekclickrate = ?, monthclickrate = ? WHERE chat = ? AND talker = ? AND date = ?", d()));
        this.f401992d = hVar.a(java.lang.String.format("UPDATE %s SET dayclickcount = ?, weekclickcount = ?, monthclickcount = ?, dayclickrate = ?, weekclickrate = ?, monthclickrate = ? WHERE chat = ? AND talker = ? AND date = ?", d()));
        this.f401993e = hVar.a(java.lang.String.format("DELETE FROM %s WHERE chat = ?;", d()));
    }

    public final float a(int i17, int i18) {
        if (i18 == 0 && i17 > 0) {
            return 1.0f;
        }
        if (i18 == 0 && i17 == 0) {
            return 0.0f;
        }
        return java.lang.Math.min(i17 / i18, 1.0f);
    }

    public final r45.rr5 b(android.database.Cursor cursor) {
        r45.rr5 rr5Var = new r45.rr5();
        rr5Var.f466675d = cursor.getString(0);
        rr5Var.f466676e = cursor.getString(1);
        rr5Var.f466677f = cursor.getLong(2);
        rr5Var.f466678g = cursor.getInt(3);
        rr5Var.f466679h = cursor.getInt(4);
        rr5Var.f466680i = cursor.getInt(5);
        rr5Var.f466681m = cursor.getInt(6);
        rr5Var.f466682n = cursor.getInt(7);
        rr5Var.f466683o = cursor.getInt(8);
        rr5Var.f466684p = cursor.getFloat(9);
        rr5Var.f466685q = cursor.getFloat(10);
        rr5Var.f466686r = cursor.getFloat(11);
        return rr5Var;
    }

    public double[] c(java.lang.String str, java.lang.String str2) {
        float f17;
        long a17 = hq3.a.a();
        java.lang.String format = java.lang.String.format("SELECT dayclickrate, weekclickrate, monthclickrate FROM %s WHERE chat = ? AND talker = ? AND date = ?", d());
        java.lang.String[] strArr = {str, str2, java.lang.String.valueOf(a17)};
        kq3.h hVar = this.f401989a;
        android.database.Cursor h17 = hVar.h(format, strArr);
        double[] dArr = new double[3];
        if (h17.moveToNext()) {
            dArr[0] = h17.getDouble(0);
            dArr[1] = h17.getDouble(1);
            dArr[2] = h17.getDouble(2);
        } else {
            h17.close();
            dArr[0] = 0.0d;
            h17 = hVar.h(java.lang.String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= ?", d()), new java.lang.String[]{str, str2, java.lang.String.valueOf(a17 - 518400000)});
            try {
                float f18 = 0.0f;
                if (h17.moveToNext()) {
                    f17 = a(h17.getInt(1), h17.getInt(0));
                } else {
                    h17.close();
                    f17 = 0.0f;
                }
                dArr[1] = f17;
                h17 = hVar.h(java.lang.String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= ?", d()), new java.lang.String[]{str, str2, java.lang.String.valueOf(a17 - 2505600000L)});
                try {
                    if (h17.moveToNext()) {
                        f18 = a(h17.getInt(1), h17.getInt(0));
                    }
                    h17.close();
                    dArr[2] = f18;
                } finally {
                }
            } finally {
            }
        }
        return dArr;
    }

    public abstract java.lang.String d();

    public abstract long e();

    public abstract long f();

    public int g(java.lang.String str, java.lang.String str2) {
        android.database.Cursor h17 = this.f401989a.h(java.lang.String.format("SELECT dayreceivecount FROM %s WHERE chat = ? AND talker = ? AND date = ?", d()), new java.lang.String[]{str, str2, java.lang.String.valueOf(hq3.a.a())});
        int i17 = h17.moveToNext() ? h17.getInt(0) : 0;
        h17.close();
        return i17;
    }

    public java.util.List h(long j17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String format = java.lang.String.format("SELECT chat, MMSumDivision(dayreceivecount, dayclickcount, 0) FROM %s WHERE date = ? AND ((chat like '%%@chatroom' AND talker = '@all') OR (chat = talker)) GROUP BY chat", d());
        java.lang.String[] strArr = {java.lang.String.valueOf(j17)};
        kq3.h hVar = this.f401989a;
        android.database.Cursor h17 = hVar.h(format, strArr);
        while (h17.moveToNext()) {
            hashMap.put(h17.getString(0), java.lang.Double.valueOf(h17.getDouble(1)));
        }
        h17.close();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        android.database.Cursor h18 = hVar.h(java.lang.String.format("SELECT chat, MMSumDivision(dayreceivecount, dayclickcount, 0) FROM %s WHERE date >= ? AND ((chat like '%%@chatroom' AND talker = '@all') OR (chat = talker)) GROUP BY chat", d()), new java.lang.String[]{java.lang.String.valueOf(j17 - 518400000)});
        while (h18.moveToNext()) {
            hashMap2.put(h18.getString(0), java.lang.Double.valueOf(h18.getDouble(1)));
        }
        h18.close();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        android.database.Cursor h19 = hVar.h(java.lang.String.format("SELECT chat, MMSumDivision(dayreceivecount, dayclickcount, 0) FROM %s WHERE date >= ? AND ((chat like '%%@chatroom' AND talker = '@all') OR (chat = talker)) GROUP BY chat", d()), new java.lang.String[]{java.lang.String.valueOf(j17 - 2505600000L)});
        while (h19.moveToNext()) {
            hashMap3.put(h19.getString(0), java.lang.Double.valueOf(h19.getDouble(1)));
        }
        h19.close();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(hashMap3.entrySet());
        java.util.Collections.sort(arrayList, new lq3.b(this));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            double d17 = 0.0d;
            double doubleValue = hashMap.containsKey(entry.getKey()) ? ((java.lang.Double) hashMap.get(entry.getKey())).doubleValue() : 0.0d;
            if (hashMap.containsKey(entry.getKey())) {
                d17 = ((java.lang.Double) hashMap2.get(entry.getKey())).doubleValue();
            }
            arrayList2.add(new android.util.Pair((java.lang.String) entry.getKey(), java.lang.String.format("%.2f,%.2f,%.2f", java.lang.Double.valueOf(doubleValue), java.lang.Double.valueOf(d17), entry.getValue())));
        }
        return arrayList2;
    }

    public int i(java.lang.String str, java.lang.String str2) {
        android.database.Cursor h17 = this.f401989a.h(java.lang.String.format("SELECT sum(dayreceivecount) FROM %s WHERE chat = ? AND talker = ? AND date >= ?", d()), new java.lang.String[]{str, str2, java.lang.String.valueOf(hq3.a.a() - 518400000)});
        int i17 = h17.moveToNext() ? h17.getInt(0) : 0;
        h17.close();
        return i17;
    }

    public final void j(java.lang.String str, java.lang.String str2, long j17, boolean z17) {
        r45.rr5 rr5Var = new r45.rr5();
        rr5Var.f466675d = str;
        rr5Var.f466676e = str2;
        rr5Var.f466677f = j17;
        java.lang.String format = java.lang.String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= ?", d());
        java.lang.String[] strArr = {str, str2, java.lang.String.valueOf(j17 - 2505600000L)};
        kq3.h hVar = this.f401989a;
        android.database.Cursor h17 = hVar.h(format, strArr);
        if (h17.moveToNext()) {
            rr5Var.f466682n = h17.getInt(0);
            rr5Var.f466683o = h17.getInt(1);
        }
        h17.close();
        android.database.Cursor h18 = hVar.h(java.lang.String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= ?", d()), new java.lang.String[]{str, str2, java.lang.String.valueOf(j17 - 518400000)});
        if (h18.moveToNext()) {
            rr5Var.f466680i = h18.getInt(0);
            rr5Var.f466681m = h18.getInt(1);
        }
        h18.close();
        if (z17) {
            rr5Var.f466679h++;
            rr5Var.f466683o++;
            rr5Var.f466681m++;
        } else {
            rr5Var.f466678g++;
            rr5Var.f466682n++;
            rr5Var.f466680i++;
        }
        rr5Var.f466684p = a(rr5Var.f466679h, rr5Var.f466678g);
        rr5Var.f466685q = a(rr5Var.f466681m, rr5Var.f466680i);
        rr5Var.f466686r = a(rr5Var.f466683o, rr5Var.f466682n);
        java.lang.String str3 = rr5Var.f466675d;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f401990b;
        c26970x63d6eaa3.m107801x35198eae(1, str3);
        c26970x63d6eaa3.m107801x35198eae(2, rr5Var.f466676e);
        c26970x63d6eaa3.m107799x37fbf859(3, rr5Var.f466677f);
        c26970x63d6eaa3.m107799x37fbf859(4, rr5Var.f466678g);
        c26970x63d6eaa3.m107799x37fbf859(5, rr5Var.f466679h);
        c26970x63d6eaa3.m107799x37fbf859(6, rr5Var.f466680i);
        c26970x63d6eaa3.m107799x37fbf859(7, rr5Var.f466681m);
        c26970x63d6eaa3.m107799x37fbf859(8, rr5Var.f466682n);
        c26970x63d6eaa3.m107799x37fbf859(9, rr5Var.f466683o);
        c26970x63d6eaa3.m107798x1b3baa6e(10, rr5Var.f466684p);
        c26970x63d6eaa3.m107798x1b3baa6e(11, rr5Var.f466685q);
        c26970x63d6eaa3.m107798x1b3baa6e(12, rr5Var.f466686r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgBaseUsageStorage", "insert %d usage %s %s %s %d %d %d %d %.2f %.2f", java.lang.Long.valueOf(c26970x63d6eaa3.m107869x22927a8e()), str, str2, k35.m1.d("yyyy-MM-dd", j17 / 1000), java.lang.Integer.valueOf(rr5Var.f466680i), java.lang.Integer.valueOf(rr5Var.f466681m), java.lang.Integer.valueOf(rr5Var.f466682n), java.lang.Integer.valueOf(rr5Var.f466683o), java.lang.Float.valueOf(rr5Var.f466685q), java.lang.Float.valueOf(rr5Var.f466686r));
    }

    public void k(java.lang.String str, java.lang.String str2) {
        long a17 = hq3.a.a();
        if (l(str, str2, a17, false)) {
            return;
        }
        j(str, str2, a17, false);
    }

    public final boolean l(java.lang.String str, java.lang.String str2, long j17, boolean z17) {
        r45.rr5 rr5Var;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3;
        android.database.Cursor h17 = this.f401989a.h(java.lang.String.format("SELECT * FROM %s WHERE chat = ? AND talker = ? AND date = ?", d()), new java.lang.String[]{str, str2, java.lang.String.valueOf(j17)});
        try {
            if (h17.moveToNext()) {
                rr5Var = b(h17);
            } else {
                h17.close();
                rr5Var = null;
            }
            if (rr5Var == null) {
                return false;
            }
            if (z17) {
                rr5Var.f466679h++;
                rr5Var.f466681m++;
                rr5Var.f466683o++;
            } else {
                rr5Var.f466678g++;
                rr5Var.f466680i++;
                rr5Var.f466682n++;
            }
            rr5Var.f466684p = a(rr5Var.f466679h, rr5Var.f466678g);
            rr5Var.f466685q = a(rr5Var.f466681m, rr5Var.f466680i);
            rr5Var.f466686r = a(rr5Var.f466683o, rr5Var.f466682n);
            if (z17) {
                long j18 = rr5Var.f466679h;
                c26970x63d6eaa3 = this.f401992d;
                c26970x63d6eaa3.m107799x37fbf859(1, j18);
                c26970x63d6eaa3.m107799x37fbf859(2, rr5Var.f466681m);
                c26970x63d6eaa3.m107799x37fbf859(3, rr5Var.f466683o);
            } else {
                long j19 = rr5Var.f466678g;
                c26970x63d6eaa3 = this.f401991c;
                c26970x63d6eaa3.m107799x37fbf859(1, j19);
                c26970x63d6eaa3.m107799x37fbf859(2, rr5Var.f466680i);
                c26970x63d6eaa3.m107799x37fbf859(3, rr5Var.f466682n);
            }
            c26970x63d6eaa3.m107798x1b3baa6e(4, rr5Var.f466684p);
            c26970x63d6eaa3.m107798x1b3baa6e(5, rr5Var.f466685q);
            c26970x63d6eaa3.m107798x1b3baa6e(6, rr5Var.f466686r);
            c26970x63d6eaa3.m107801x35198eae(7, rr5Var.f466675d);
            c26970x63d6eaa3.m107801x35198eae(8, rr5Var.f466676e);
            c26970x63d6eaa3.m107799x37fbf859(9, rr5Var.f466677f);
            int m107871x91d1f3e9 = c26970x63d6eaa3.m107871x91d1f3e9();
            java.lang.Object[] objArr = new java.lang.Object[14];
            objArr[0] = d();
            objArr[1] = z17 ? "Open" : "Receive";
            objArr[2] = str;
            objArr[3] = str2;
            objArr[4] = java.lang.Integer.valueOf(m107871x91d1f3e9);
            objArr[5] = java.lang.Integer.valueOf(rr5Var.f466679h);
            objArr[6] = java.lang.Integer.valueOf(rr5Var.f466681m);
            objArr[7] = java.lang.Integer.valueOf(rr5Var.f466683o);
            objArr[8] = java.lang.Integer.valueOf(rr5Var.f466678g);
            objArr[9] = java.lang.Integer.valueOf(rr5Var.f466680i);
            objArr[10] = java.lang.Integer.valueOf(rr5Var.f466682n);
            objArr[11] = java.lang.Float.valueOf(rr5Var.f466684p);
            objArr[12] = java.lang.Float.valueOf(rr5Var.f466685q);
            objArr[13] = java.lang.Float.valueOf(rr5Var.f466686r);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgBaseUsageStorage", "%s Update %s Res %s %s %d %d %d %d %d %d %d DayClickRate %.2f WeekClickRate %.2f MonthClickRate %.2f", objArr);
            return m107871x91d1f3e9 > 0;
        } finally {
            h17.close();
        }
    }
}
