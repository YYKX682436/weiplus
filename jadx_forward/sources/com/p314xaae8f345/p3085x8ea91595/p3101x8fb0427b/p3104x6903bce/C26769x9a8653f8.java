package com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce;

/* renamed from: com.tencent.tmassistantsdk.storage.table.DownloadInfoTable */
/* loaded from: classes13.dex */
public class C26769x9a8653f8 implements com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176 {

    /* renamed from: CREATE_TABLE_SQL */
    public static final java.lang.String f56768xc055b21a = "CREATE TABLE if not exists downloadInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, taskId INTEGER , uId TEXT, taskUrl TEXT, secondaryUrl TEXT, finalUrl TEXT, requestFileSize INTEGER, fileName TEXT, contentType TEXT, redirectCnt INTEGER, retryCnt INTEGER, totalBytes INTEGER,status INTEGER,receivedBytes INTEGER,priority INTEGER,netType TEXT,downloadFailedErrCode INTEGER,downloadFailedTime INTEGER,headerParams TEXT);";

    /* renamed from: QUERY_ALL */
    public static final java.lang.String f56769x3a78b96a = "select * from downloadInfo";

    /* renamed from: QUERY_DOWNLOADINFO_URL */
    public static final java.lang.String f56770x4545257d = "select * from downloadInfo where taskUrl = ?";

    /* renamed from: QUERY_UNFINISHED_TASK */
    public static final java.lang.String f56771x277f89a2 = "select a.taskUrl,a.status,b.clientId from downloadInfo as a left outer join clientinfo as b on a.taskUrl = b.taskUrl where b.clientId is not null and (a.status = 2 or a.status = 1)";

    /* renamed from: TABLE_NAME */
    public static final java.lang.String f56772xc4fe047c = "downloadInfo";
    private static final java.lang.String TAG = "DownloadInfoTable";

    public static void add(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176) {
        if (c26667x4be17176 != null) {
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b().getWritableDatabase();
                if (m105451xce0038c9(c26667x4be17176, writableDatabase) <= 0) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.m104896xf8da4661(contentValues, c26667x4be17176);
                    writableDatabase.insert(f56772xc4fe047c, null, contentValues);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static void del(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        try {
            com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b().getWritableDatabase().delete(f56772xc4fe047c, "taskUrl = ?", new java.lang.String[]{str});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r2.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        r0.add(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.m104894x9e4de1d6(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r2.moveToNext() != false) goto L26;
     */
    /* renamed from: load */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176> m105447x32c4e6() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r1 = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b()
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
            r2 = 0
            java.lang.String r3 = "select * from downloadInfo"
            android.database.Cursor r2 = r1.rawQuery(r3, r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r2 == 0) goto L29
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r1 == 0) goto L29
        L1c:
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r1 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.m104894x9e4de1d6(r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r0.add(r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r1 != 0) goto L1c
        L29:
            if (r2 == 0) goto L2e
            r2.close()
        L2e:
            return r0
        L2f:
            r0 = move-exception
            goto L42
        L31:
            r1 = move-exception
            java.lang.String r3 = "DownloadInfoTable"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r1, r4, r5)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L41
            r2.close()
        L41:
            return r0
        L42:
            if (r2 == 0) goto L47
            r2.close()
        L47:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26769x9a8653f8.m105447x32c4e6():java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r6 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r6 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r6.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* renamed from: query */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 m105448x66f18c8(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L4e
            int r1 = r6.length()
            if (r1 <= 0) goto L4e
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r1 = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.lang.String r2 = "select * from downloadInfo where taskUrl = ?"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            android.database.Cursor r6 = r1.rawQuery(r2, r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            if (r6 == 0) goto L2d
            boolean r1 = r6.moveToFirst()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L47
            if (r1 == 0) goto L2d
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r0 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.m104894x9e4de1d6(r6)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L47
            r6.close()
            return r0
        L2b:
            r1 = move-exception
            goto L37
        L2d:
            if (r6 == 0) goto L4e
            goto L43
        L30:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L48
        L35:
            r1 = move-exception
            r6 = r0
        L37:
            java.lang.String r2 = "DownloadInfoTable"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L47
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L4e
        L43:
            r6.close()
            goto L4e
        L47:
            r0 = move-exception
        L48:
            if (r6 == 0) goto L4d
            r6.close()
        L4d:
            throw r0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26769x9a8653f8.m105448x66f18c8(java.lang.String):com.tencent.tmassistantsdk.downloadservice.DownloadInfo");
    }

    /* renamed from: save */
    public static void m105450x35c17d(java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176> arrayList) {
        if (arrayList != null) {
            android.database.sqlite.SQLiteDatabase writableDatabase = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b().getWritableDatabase();
            try {
                try {
                    writableDatabase.beginTransaction();
                    java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176> it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 next = it.next();
                        if (m105451xce0038c9(next, writableDatabase) <= 0) {
                            android.content.ContentValues contentValues = new android.content.ContentValues();
                            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.m104896xf8da4661(contentValues, next);
                            writableDatabase.insert(f56772xc4fe047c, null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    /* renamed from: update */
    private static int m105451xce0038c9(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (c26667x4be17176 == null) {
            return -1;
        }
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.m104896xf8da4661(contentValues, c26667x4be17176);
            int update = sQLiteDatabase.update(f56772xc4fe047c, contentValues, "taskUrl = ?", new java.lang.String[]{c26667x4be17176.f56118x32d5c2});
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
        return f56768xc055b21a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        r8.setTransactionSuccessful();
        r8.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r7 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r7 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r7.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: dataMovement */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo105427x48ee0a79(android.database.sqlite.SQLiteDatabase r7, android.database.sqlite.SQLiteDatabase r8) {
        /*
            r6 = this;
            java.lang.String r0 = "downloadInfo"
            if (r8 == 0) goto L62
            if (r7 == 0) goto L62
            r8.beginTransaction()
            r1 = 0
            java.lang.String r2 = "select * from downloadInfo"
            android.database.Cursor r7 = r7.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            if (r7 == 0) goto L35
            boolean r2 = r7.moveToFirst()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            if (r2 == 0) goto L35
            java.lang.String r2 = "start move data!"
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(r0, r2)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
        L1d:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            r2.<init>()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r3 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.m104895x12e29228(r7)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.m104896xf8da4661(r2, r3)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            r8.insert(r0, r1, r2)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            boolean r2 = r7.moveToNext()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5a
            if (r2 != 0) goto L1d
            goto L35
        L33:
            r1 = move-exception
            goto L41
        L35:
            if (r7 == 0) goto L53
        L37:
            r7.close()
            goto L53
        L3b:
            r8 = move-exception
            goto L5c
        L3d:
            r7 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
        L41:
            java.lang.String r2 = "DownloadInfoTable"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "move data exception!"
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(r0, r1)     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L53
            goto L37
        L53:
            r8.setTransactionSuccessful()
            r8.endTransaction()
            goto L62
        L5a:
            r8 = move-exception
            r1 = r7
        L5c:
            if (r1 == 0) goto L61
            r1.close()
        L61:
            throw r8
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26769x9a8653f8.mo105427x48ee0a79(android.database.sqlite.SQLiteDatabase, android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: getAlterSQL */
    public java.lang.String[] mo105430xf503bf4e(int i17, int i18) {
        return (i17 == 1 && i18 == 2) ? new java.lang.String[]{"alter table downloadInfo add column headerParams TEXT;"} : new java.lang.String[]{"alter table downloadInfo add column netType TEXT;", "alter table downloadInfo add column downloadFailedErrCode INTEGER;", "alter table downloadInfo add column downloadFailedTime INTEGER;"};
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: getHelper */
    public com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.AbstractC26765x881576fa mo105433x1c5132a4() {
        return com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b();
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: tableName */
    public java.lang.String mo105438x89769379() {
        return f56772xc4fe047c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r2.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        r1 = r2.getString(r2.getColumnIndex(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26));
        r3 = r2.getString(r2.getColumnIndex("taskUrl"));
        r4 = r2.getInt(r2.getColumnIndex("status"));
        r5 = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962(r1, r3);
        r5.f56224xbec81024 = r4;
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r2.moveToNext() != false) goto L25;
     */
    /* renamed from: query */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> m105449x66f18c8() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r1 = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b()
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
            r2 = 0
            java.lang.String r3 = "select a.taskUrl,a.status,b.clientId from downloadInfo as a left outer join clientinfo as b on a.taskUrl = b.taskUrl where b.clientId is not null and (a.status = 2 or a.status = 1)"
            android.database.Cursor r2 = r1.rawQuery(r3, r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            if (r2 == 0) goto L4a
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            if (r1 == 0) goto L4a
        L1c:
            java.lang.String r1 = "clientId"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.lang.String r3 = "taskUrl"
            int r3 = r2.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.lang.String r4 = "status"
            int r4 = r2.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            int r4 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask r5 = new com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r5.f56224xbec81024 = r4     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r0.add(r5)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            if (r1 != 0) goto L1c
        L4a:
            if (r2 == 0) goto L4f
            r2.close()
        L4f:
            return r0
        L50:
            r0 = move-exception
            goto L63
        L52:
            r1 = move-exception
            java.lang.String r3 = "DownloadInfoTable"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L50
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r1, r4, r5)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L62
            r2.close()
        L62:
            return r0
        L63:
            if (r2 == 0) goto L68
            r2.close()
        L68:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26769x9a8653f8.m105449x66f18c8():java.util.ArrayList");
    }
}
