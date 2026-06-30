package com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce;

/* renamed from: com.tencent.tmassistantsdk.storage.table.ClientInfoTable */
/* loaded from: classes13.dex */
public class C26768x16959c15 implements com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176 {

    /* renamed from: CREATE_TABLE_SQL */
    public static final java.lang.String f56760xc055b21a = "CREATE TABLE if not exists clientinfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, clientId TEXT , taskId INTEGER, taskUrl TEXT);";

    /* renamed from: QUERY_CLIENTINFO */
    public static final java.lang.String f56761xc80b22f0 = "select * from clientinfo where clientId = ?";

    /* renamed from: QUERY_CLIENTINFO_ALL */
    public static final java.lang.String f56762xb70c57b2 = "select * from clientinfo";

    /* renamed from: TABLE_NAME */
    public static final java.lang.String f56763xc4fe047c = "clientinfo";
    private static final java.lang.String TAG = "ClientInfoTable";

    /* renamed from: com.tencent.tmassistantsdk.storage.table.ClientInfoTable$Columns */
    /* loaded from: classes6.dex */
    public class Columns {

        /* renamed from: CLIENTID */
        public static final java.lang.String f56764x64cb2a26 = "clientId";

        /* renamed from: TASKID */
        public static final java.lang.String f56765x9311e960 = "taskId";

        /* renamed from: TASKURL */
        public static final java.lang.String f56766xcf2b71aa = "taskUrl";

        public Columns() {
        }
    }

    /* renamed from: cursor2object */
    private static com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3103x633fb29.C26766xb882cb39 m105439x6f9bd5db(android.database.Cursor cursor) {
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3103x633fb29.C26766xb882cb39 c26766xb882cb39 = new com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3103x633fb29.C26766xb882cb39();
        c26766xb882cb39.f56755x36253646 = cursor.getString(cursor.getColumnIndex(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26));
        c26766xb882cb39.f56756xcb7ef180 = cursor.getInt(cursor.getColumnIndex("taskId"));
        c26766xb882cb39.f56757xa45f6daa = cursor.getString(cursor.getColumnIndex("taskUrl"));
        return c26766xb882cb39;
    }

    /* renamed from: delete */
    public static void m105440xb06685ab(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b().getWritableDatabase().delete(f56763xc4fe047c, "clientId = ? and taskUrl = ?", new java.lang.String[]{str, str2});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: deleteItemsByURL */
    public static void m105441x5070d1c3(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b().getWritableDatabase().delete(f56763xc4fe047c, "taskUrl = ?", new java.lang.String[]{str});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: fillValues */
    private static void m105442xe1bf1085(android.content.ContentValues contentValues, com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3103x633fb29.C26766xb882cb39 c26766xb882cb39) {
        if (c26766xb882cb39 != null) {
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26, c26766xb882cb39.f56755x36253646);
            contentValues.put("taskId", java.lang.Integer.valueOf(c26766xb882cb39.f56756xcb7ef180));
            contentValues.put("taskUrl", c26766xb882cb39.f56757xa45f6daa);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r6.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        r1.add(m105439x6f9bd5db(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r6.moveToNext() != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* renamed from: query */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3103x633fb29.C26766xb882cb39> m105443x66f18c8(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L56
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r2 = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b()
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()
            java.lang.String r3 = "select * from clientinfo where clientId = ?"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3d
            android.database.Cursor r6 = r2.rawQuery(r3, r6)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3d
            if (r6 == 0) goto L32
            boolean r2 = r6.moveToFirst()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4f
            if (r2 == 0) goto L32
        L22:
            com.tencent.tmassistantsdk.storage.model.ClientInfo r2 = m105439x6f9bd5db(r6)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4f
            r1.add(r2)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4f
            boolean r2 = r6.moveToNext()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4f
            if (r2 != 0) goto L22
            goto L32
        L30:
            r1 = move-exception
            goto L3f
        L32:
            if (r6 == 0) goto L37
            r6.close()
        L37:
            return r1
        L38:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L50
        L3d:
            r1 = move-exception
            r6 = r0
        L3f:
            java.lang.String r2 = "ClientInfoTable"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L56
            r6.close()
            goto L56
        L4f:
            r0 = move-exception
        L50:
            if (r6 == 0) goto L55
            r6.close()
        L55:
            throw r0
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.m105443x66f18c8(java.lang.String):java.util.ArrayList");
    }

    /* renamed from: save */
    public static void m105444x35c17d(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3103x633fb29.C26766xb882cb39 c26766xb882cb39) {
        if (c26766xb882cb39 != null) {
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b().getWritableDatabase();
                if (m105446xce0038c9(c26766xb882cb39, writableDatabase) <= 0) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    m105442xe1bf1085(contentValues, c26766xb882cb39);
                    writableDatabase.insert(f56763xc4fe047c, null, contentValues);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: update */
    private static int m105446xce0038c9(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3103x633fb29.C26766xb882cb39 c26766xb882cb39, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (c26766xb882cb39 == null) {
            return -1;
        }
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            m105442xe1bf1085(contentValues, c26766xb882cb39);
            int update = sQLiteDatabase.update(f56763xc4fe047c, contentValues, "clientId = ? and taskUrl = ?", new java.lang.String[]{c26766xb882cb39.f56755x36253646, c26766xb882cb39.f56757xa45f6daa});
            if (update > 0) {
                return update;
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return -2;
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: createTableSQL */
    public java.lang.String mo105426x19e143c() {
        return f56760xc055b21a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        if (r6.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0016, code lost:
    
        r1 = new android.content.ContentValues();
        m105442xe1bf1085(r1, m105439x6f9bd5db(r6));
        r7.insert(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.f56763xc4fe047c, null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r6.moveToNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r6 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        r7.setTransactionSuccessful();
        r7.endTransaction();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: dataMovement */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo105427x48ee0a79(android.database.sqlite.SQLiteDatabase r6, android.database.sqlite.SQLiteDatabase r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L58
            if (r6 == 0) goto L58
            r7.beginTransaction()
            r0 = 0
            java.lang.String r1 = "select * from clientinfo"
            android.database.Cursor r6 = r6.rawQuery(r1, r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r6 == 0) goto L30
            boolean r1 = r6.moveToFirst()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            if (r1 == 0) goto L30
        L16:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            com.tencent.tmassistantsdk.storage.model.ClientInfo r2 = m105439x6f9bd5db(r6)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            m105442xe1bf1085(r1, r2)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            java.lang.String r2 = "clientinfo"
            r7.insert(r2, r0, r1)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            boolean r1 = r6.moveToNext()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L50
            if (r1 != 0) goto L16
            goto L30
        L2e:
            r0 = move-exception
            goto L3c
        L30:
            if (r6 == 0) goto L49
        L32:
            r6.close()
            goto L49
        L36:
            r7 = move-exception
            goto L52
        L38:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L3c:
            java.lang.String r1 = "ClientInfoTable"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L50
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L49
            goto L32
        L49:
            r7.setTransactionSuccessful()
            r7.endTransaction()
            goto L58
        L50:
            r7 = move-exception
            r0 = r6
        L52:
            if (r0 == 0) goto L57
            r0.close()
        L57:
            throw r7
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.mo105427x48ee0a79(android.database.sqlite.SQLiteDatabase, android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: getAlterSQL */
    public java.lang.String[] mo105430xf503bf4e(int i17, int i18) {
        return null;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: getHelper */
    public com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.AbstractC26765x881576fa mo105433x1c5132a4() {
        return com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b();
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: tableName */
    public java.lang.String mo105438x89769379() {
        return f56763xc4fe047c;
    }

    /* renamed from: save */
    public static void m105445x35c17d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3103x633fb29.C26766xb882cb39 c26766xb882cb39 = new com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3103x633fb29.C26766xb882cb39();
        c26766xb882cb39.f56755x36253646 = str;
        c26766xb882cb39.f56757xa45f6daa = str2;
        m105444x35c17d(c26766xb882cb39);
    }
}
