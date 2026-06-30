package com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce;

/* renamed from: com.tencent.tmassistantsdk.storage.table.BaseLogTable */
/* loaded from: classes13.dex */
public abstract class AbstractC26767x1daf70fb implements com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176 {
    private static final java.lang.String TAG = "BaseLogTable";

    /* renamed from: com.tencent.tmassistantsdk.storage.table.BaseLogTable$DataWrapper */
    /* loaded from: classes13.dex */
    public static class DataWrapper {

        /* renamed from: dataList */
        public java.util.List<byte[]> f56758x6a9f2f68;

        /* renamed from: idList */
        public java.util.List<java.lang.Long> f56759xb8d22c59;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: createTableSQL */
    public java.lang.String mo105426x19e143c() {
        return mo105431xf035e132();
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: dataMovement */
    public void mo105427x48ee0a79(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteDatabase sQLiteDatabase2) {
    }

    /* renamed from: delete */
    public boolean m105428xb06685ab(java.util.List<java.lang.Long> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("(");
        java.util.Iterator<java.lang.Long> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            stringBuffer.append(",");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        stringBuffer.append(")");
        mo105433x1c5132a4().getWritableDatabase().delete(mo105435x88e404c3(), "_id in " + ((java.lang.Object) stringBuffer), null);
        return true;
    }

    /* renamed from: getAlterSQL */
    public abstract java.lang.String[] mo105429xf503bf4e(int i17);

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: getAlterSQL */
    public java.lang.String[] mo105430xf503bf4e(int i17, int i18) {
        return mo105429xf503bf4e(i18);
    }

    /* renamed from: getCreateTableSQL */
    public abstract java.lang.String mo105431xf035e132();

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r12.moveToFirst() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r0.f56759xb8d22c59.add(java.lang.Long.valueOf(r12.getLong(r12.getColumnIndex("_id"))));
        r0.f56758x6a9f2f68.add(r12.getBlob(r12.getColumnIndex("logData")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (r12.moveToNext() != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* renamed from: getDatas */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb.DataWrapper m105432x744cac53(int r12) {
        /*
            r11 = this;
            com.tencent.tmassistantsdk.storage.table.BaseLogTable$DataWrapper r0 = new com.tencent.tmassistantsdk.storage.table.BaseLogTable$DataWrapper
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f56759xb8d22c59 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f56758x6a9f2f68 = r1
            r1 = 0
            if (r12 <= 0) goto L26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "0,"
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r10 = r12
            goto L27
        L26:
            r10 = r1
        L27:
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r12 = r11.mo105433x1c5132a4()
            android.database.sqlite.SQLiteDatabase r2 = r12.getReadableDatabase()
            java.lang.String r3 = r11.mo105435x88e404c3()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "_id asc"
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            if (r12 == 0) goto L71
            boolean r2 = r12.moveToFirst()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8b
            if (r2 == 0) goto L71
        L46:
            java.lang.String r2 = "_id"
            int r2 = r12.getColumnIndex(r2)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8b
            long r2 = r12.getLong(r2)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8b
            java.util.List<java.lang.Long> r4 = r0.f56759xb8d22c59     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8b
            r4.add(r2)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8b
            java.lang.String r2 = "logData"
            int r2 = r12.getColumnIndex(r2)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8b
            byte[] r2 = r12.getBlob(r2)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8b
            java.util.List<byte[]> r3 = r0.f56758x6a9f2f68     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8b
            r3.add(r2)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8b
            boolean r2 = r12.moveToNext()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L8b
            if (r2 != 0) goto L46
            goto L71
        L6f:
            r0 = move-exception
            goto L7b
        L71:
            if (r12 == 0) goto L76
            r12.close()
        L76:
            return r0
        L77:
            r0 = move-exception
            goto L8d
        L79:
            r0 = move-exception
            r12 = r1
        L7b:
            java.lang.String r2 = "BaseLogTable"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L8b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L8b
            if (r12 == 0) goto L8a
            r12.close()
        L8a:
            return r1
        L8b:
            r0 = move-exception
            r1 = r12
        L8d:
            if (r1 == 0) goto L92
            r1.close()
        L92:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb.m105432x744cac53(int):com.tencent.tmassistantsdk.storage.table.BaseLogTable$DataWrapper");
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: getHelper */
    public com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.AbstractC26765x881576fa mo105433x1c5132a4() {
        return com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3102xb73a0fae.C26763xaa9e9877.m105423x9cf0d20b();
    }

    /* renamed from: getInsertSQL */
    public abstract java.lang.String mo105434xe882c99f();

    /* renamed from: getTableName */
    public abstract java.lang.String mo105435x88e404c3();

    /* renamed from: save */
    public boolean m105437x35c17d(byte[] bArr) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("logData", bArr);
        return mo105433x1c5132a4().getWritableDatabase().insert(mo105435x88e404c3(), null, contentValues) > 0;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.InterfaceC26772xa9d48176
    /* renamed from: tableName */
    public java.lang.String mo105438x89769379() {
        return mo105435x88e404c3();
    }

    /* renamed from: save */
    public boolean m105436x35c17d(java.util.List<byte[]> list) {
        android.database.sqlite.SQLiteDatabase writableDatabase = mo105433x1c5132a4().getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            android.database.sqlite.SQLiteStatement compileStatement = writableDatabase.compileStatement(mo105434xe882c99f());
            java.util.Iterator<byte[]> it = list.iterator();
            while (it.hasNext()) {
                compileStatement.bindBlob(1, it.next());
                compileStatement.executeInsert();
            }
            writableDatabase.setTransactionSuccessful();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return false;
        } finally {
            writableDatabase.endTransaction();
        }
    }
}
