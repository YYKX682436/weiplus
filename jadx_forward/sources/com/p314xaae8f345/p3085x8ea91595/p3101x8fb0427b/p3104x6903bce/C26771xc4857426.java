package com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce;

/* renamed from: com.tencent.tmassistantsdk.storage.table.DownloadSettingTable */
/* loaded from: classes13.dex */
public class C26771xc4857426 implements com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176 {

    /* renamed from: CREATE_TABLE_SQL */
    public static final java.lang.String f56777xc055b21a = "CREATE TABLE if not exists settingInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, settingField TEXT , value TEXT,type TEXT);";

    /* renamed from: QUERY_SQL */
    public static final java.lang.String f56778x3a78fd97 = "select * from settingInfo";

    /* renamed from: TABLE_NAME */
    public static final java.lang.String f56779xc4fe047c = "settingInfo";
    private static final java.lang.String TAG = "DownloadSettingTable";

    /* renamed from: com.tencent.tmassistantsdk.storage.table.DownloadSettingTable$Columns */
    /* loaded from: classes6.dex */
    public class Columns {

        /* renamed from: SETTINGFIELD */
        public static final java.lang.String f56780xa94aecaa = "settingField";

        /* renamed from: TYPE */
        public static final java.lang.String f56781x27873a = "type";

        /* renamed from: VALUE */
        public static final java.lang.String f56782x4da9951 = "value";

        public Columns() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r1 == null) goto L19;
     */
    /* renamed from: query */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap<java.lang.String, java.lang.String> m105453x66f18c8() {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r2 = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r3 = "select * from settingInfo"
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            if (r1 == 0) goto L3d
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            if (r2 == 0) goto L3d
        L1c:
            java.lang.String r2 = "settingField"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r3 = "value"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            if (r2 != 0) goto L1c
            r1.close()
            return r0
        L3d:
            if (r1 == 0) goto L53
        L3f:
            r1.close()
            goto L53
        L43:
            r0 = move-exception
            goto L54
        L45:
            r2 = move-exception
            java.lang.String r3 = "DownloadSettingTable"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L43
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r2, r4, r5)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L53
            goto L3f
        L53:
            return r0
        L54:
            if (r1 == 0) goto L59
            r1.close()
        L59:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26771xc4857426.m105453x66f18c8():java.util.HashMap");
    }

    /* renamed from: save */
    public static void m105454x35c17d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b().getWritableDatabase();
            if (m105455xce0038c9(str, str2, str3, writableDatabase) <= 0) {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26771xc4857426.Columns.f56780xa94aecaa, str);
                contentValues.put("value", str2);
                contentValues.put("type", str3);
                writableDatabase.insert(f56779xc4fe047c, null, contentValues);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: update */
    private static int m105455xce0038c9(java.lang.String str, java.lang.String str2, java.lang.String str3, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (str == null || str2 == null) {
            return -1;
        }
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26771xc4857426.Columns.f56780xa94aecaa, str);
            contentValues.put("value", str2);
            contentValues.put("type", str3);
            int update = sQLiteDatabase.update(f56779xc4fe047c, contentValues, "settingField = ?", new java.lang.String[]{str});
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
        return f56777xc055b21a;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: dataMovement */
    public void mo105427x48ee0a79(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteDatabase sQLiteDatabase2) {
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
        return f56779xc4fe047c;
    }
}
