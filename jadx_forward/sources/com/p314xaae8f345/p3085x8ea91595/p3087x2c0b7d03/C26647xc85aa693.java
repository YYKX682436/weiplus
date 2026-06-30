package com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03;

/* renamed from: com.tencent.tmassistantsdk.channel.DBOption */
/* loaded from: classes13.dex */
public class C26647xc85aa693 {

    /* renamed from: CREATE_TABLE_SQL */
    protected static final java.lang.String f55962xc055b21a = "CREATE TABLE if not exists channeldata( itemId INTEGER PRIMARY KEY AUTOINCREMENT, itemData BLOB);";

    /* renamed from: DATEBASE_VERSION */
    protected static final int f55963xe1fbbff8 = 1;

    /* renamed from: DB_NAME */
    protected static final java.lang.String f55964x8326c1ac = ".SystemConfig.db";

    /* renamed from: QUERY_ALL_SQL */
    protected static final java.lang.String f55965x73766559 = "select * from channeldata";

    /* renamed from: TABLE_NAME */
    protected static final java.lang.String f55966xc4fe047c = "channeldata";

    /* renamed from: DB_PATH */
    protected java.lang.String f55967x8327ab46;

    public C26647xc85aa693() {
        this.f55967x8327ab46 = "";
        java.lang.String str = lp0.b.D() + "/assistant/";
        this.f55967x8327ab46 = str;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            m17.f294799a.r(m17.f294800b);
        }
        this.f55967x8327ab46 += f55964x8326c1ac;
    }

    /* renamed from: checkAndCreateTable */
    private void m104800x1da69d03(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        int version = sQLiteDatabase.getVersion();
        if (version != 1) {
            sQLiteDatabase.beginTransaction();
            if (version == 0) {
                try {
                    sQLiteDatabase.execSQL(f55962xc055b21a);
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            }
            sQLiteDatabase.setVersion(1);
            sQLiteDatabase.setTransactionSuccessful();
        }
    }

    /* renamed from: closeDB */
    private void m104801x33a64876(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        try {
            sQLiteDatabase.close();
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: getReadableDatabase */
    private synchronized android.database.sqlite.SQLiteDatabase m104802x34f12101() {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(this.f55967x8327ab46);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!a17.f294812f.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            return null;
        }
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        for (int i17 = 0; i17 < 20; i17++) {
            try {
                sQLiteDatabase = android.database.sqlite.SQLiteDatabase.openDatabase(com.p314xaae8f345.mm.vfs.w6.i(this.f55967x8327ab46, true), null, 1);
            } catch (android.database.sqlite.SQLiteException unused) {
            }
            if (sQLiteDatabase != null) {
                break;
            }
            android.os.SystemClock.sleep(50L);
        }
        return sQLiteDatabase;
    }

    /* renamed from: getWritableDatabase */
    private android.database.sqlite.SQLiteDatabase m104803x240d90b1() {
        int i17 = 0;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        while (true) {
            if (i17 >= 20) {
                break;
            }
            try {
                sQLiteDatabase = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(com.p314xaae8f345.mm.vfs.w6.i(this.f55967x8327ab46, true), (android.database.sqlite.SQLiteDatabase.CursorFactory) null);
            } catch (android.database.sqlite.SQLiteException unused) {
            }
            if (sQLiteDatabase != null) {
                m104800x1da69d03(sQLiteDatabase);
                break;
            }
            android.os.SystemClock.sleep(50L);
            i17++;
        }
        return sQLiteDatabase;
    }

    /* renamed from: delete */
    public boolean m104804xb06685ab(long j17) {
        android.database.sqlite.SQLiteDatabase m104803x240d90b1 = m104803x240d90b1();
        if (m104803x240d90b1 == null) {
            return false;
        }
        m104803x240d90b1.delete(f55966xc4fe047c, "itemId=?", new java.lang.String[]{j17 + ""});
        m104801x33a64876(m104803x240d90b1);
        return true;
    }

    /* renamed from: insert */
    public long m104805xb970c2b9(com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab c26649x6e73f9ab) {
        byte[] m104811x12f2b736;
        android.database.sqlite.SQLiteDatabase m104803x240d90b1;
        if (c26649x6e73f9ab == null || (m104811x12f2b736 = c26649x6e73f9ab.m104811x12f2b736()) == null || (m104803x240d90b1 = m104803x240d90b1()) == null) {
            return -1L;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("itemData", m104811x12f2b736);
        long insert = m104803x240d90b1.insert(f55966xc4fe047c, "", contentValues);
        m104801x33a64876(m104803x240d90b1);
        return insert;
    }

    /* renamed from: queryAll */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab> m104806xba75d3b9() {
        android.database.sqlite.SQLiteDatabase m104802x34f12101 = m104802x34f12101();
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab> arrayList = null;
        if (m104802x34f12101 != null) {
            android.database.Cursor rawQuery = m104802x34f12101.rawQuery(f55965x73766559, null);
            if (rawQuery != null && rawQuery.moveToFirst()) {
                int columnIndex = rawQuery.getColumnIndex("itemId");
                int columnIndex2 = rawQuery.getColumnIndex("itemData");
                java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab> arrayList2 = new java.util.ArrayList<>();
                do {
                    int i17 = rawQuery.getInt(columnIndex);
                    com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab m104810x6e23a045 = com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab.m104810x6e23a045(rawQuery.getBlob(columnIndex2));
                    if (m104810x6e23a045 != null) {
                        m104810x6e23a045.f55971x7e499b89 = i17;
                        arrayList2.add(m104810x6e23a045);
                    }
                } while (rawQuery.moveToNext());
                m104801x33a64876(m104802x34f12101);
                arrayList = arrayList2;
            }
            rawQuery.close();
            m104801x33a64876(m104802x34f12101);
        }
        return arrayList;
    }
}
