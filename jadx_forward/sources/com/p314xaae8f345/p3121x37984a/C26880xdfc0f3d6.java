package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.DatabaseUtils */
/* loaded from: classes12.dex */
public final class C26880xdfc0f3d6 {

    /* renamed from: DEBUG */
    private static final boolean f57761x3de9e33 = false;

    /* renamed from: EX_HAS_REPLY_HEADER */
    private static final int f57763x20af8153 = -128;

    /* renamed from: STATEMENT_ABORT */
    public static final int f57764x8e9c5020 = 6;

    /* renamed from: STATEMENT_ATTACH */
    public static final int f57765x45ed5f35 = 3;

    /* renamed from: STATEMENT_BEGIN */
    public static final int f57766x8eaba599 = 4;

    /* renamed from: STATEMENT_COMMIT */
    public static final int f57767x490d9a27 = 5;

    /* renamed from: STATEMENT_DDL */
    public static final int f57768xd21030dc = 8;

    /* renamed from: STATEMENT_OTHER */
    public static final int f57769x8f69ac00 = 99;

    /* renamed from: STATEMENT_PRAGMA */
    public static final int f57770x5f61562c = 7;

    /* renamed from: STATEMENT_SELECT */
    public static final int f57771x63cda5ec = 1;

    /* renamed from: STATEMENT_UNPREPARED */
    public static final int f57772x48f16ac6 = 9;

    /* renamed from: STATEMENT_UPDATE */
    public static final int f57773x67cea9b9 = 2;
    private static final java.lang.String TAG = "WCDB.DatabaseUtils";

    /* renamed from: DIGITS */
    private static final char[] f57762x782fa0e6 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: mColl */
    private static java.text.Collator f57774x62024f9 = null;

    @java.lang.Deprecated
    /* renamed from: com.tencent.wcdb.DatabaseUtils$InsertHelper */
    /* loaded from: classes12.dex */
    public static class InsertHelper {

        /* renamed from: TABLE_INFO_PRAGMA_COLUMNNAME_INDEX */
        public static final int f57775x21af34d7 = 1;

        /* renamed from: TABLE_INFO_PRAGMA_DEFAULT_INDEX */
        public static final int f57776x87a8c0f1 = 4;

        /* renamed from: mColumns */
        private java.util.HashMap<java.lang.String, java.lang.Integer> f57777xd6b44ab0;
        private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 mDb;

        /* renamed from: mTableName */
        private final java.lang.String f57782x42ddd8c;

        /* renamed from: mInsertSQL */
        private java.lang.String f57778x63cca268 = null;

        /* renamed from: mInsertStatement */
        private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f57779xe033b689 = null;

        /* renamed from: mReplaceStatement */
        private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f57781x57d02ba8 = null;

        /* renamed from: mPreparedStatement */
        private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f57780x9195b0c5 = null;

        public InsertHelper(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str) {
            this.mDb = c26948xabb259c7;
            this.f57782x42ddd8c = str;
        }

        /* renamed from: buildSQL */
        private void m106282xaab9bc80() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
            sb6.append("INSERT INTO ");
            sb6.append(this.f57782x42ddd8c);
            sb6.append(" (");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(128);
            sb7.append("VALUES (");
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = null;
            try {
                interfaceC26872x78faff76 = this.mDb.m107710x1d3f4980("PRAGMA table_info(" + this.f57782x42ddd8c + ")", null);
                this.f57777xd6b44ab0 = new java.util.HashMap<>(interfaceC26872x78faff76.getCount());
                int i17 = 1;
                while (interfaceC26872x78faff76.moveToNext()) {
                    java.lang.String string = interfaceC26872x78faff76.getString(1);
                    java.lang.String string2 = interfaceC26872x78faff76.getString(4);
                    this.f57777xd6b44ab0.put(string, java.lang.Integer.valueOf(i17));
                    sb6.append("'");
                    sb6.append(string);
                    sb6.append("'");
                    if (string2 == null) {
                        sb7.append("?");
                    } else {
                        sb7.append("COALESCE(?, ");
                        sb7.append(string2);
                        sb7.append(")");
                    }
                    sb6.append(i17 == interfaceC26872x78faff76.getCount() ? ") " : ", ");
                    sb7.append(i17 == interfaceC26872x78faff76.getCount() ? ");" : ", ");
                    i17++;
                }
                interfaceC26872x78faff76.close();
                sb6.append((java.lang.CharSequence) sb7);
                this.f57778x63cca268 = sb6.toString();
            } catch (java.lang.Throwable th6) {
                if (interfaceC26872x78faff76 != null) {
                    interfaceC26872x78faff76.close();
                }
                throw th6;
            }
        }

        /* renamed from: getStatement */
        private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 m106283x83249ab9(boolean z17) {
            if (!z17) {
                if (this.f57779xe033b689 == null) {
                    if (this.f57778x63cca268 == null) {
                        m106282xaab9bc80();
                    }
                    this.f57779xe033b689 = this.mDb.m107663xac8b87c(this.f57778x63cca268);
                }
                return this.f57779xe033b689;
            }
            if (this.f57781x57d02ba8 == null) {
                if (this.f57778x63cca268 == null) {
                    m106282xaab9bc80();
                }
                this.f57781x57d02ba8 = this.mDb.m107663xac8b87c("INSERT OR REPLACE" + this.f57778x63cca268.substring(6));
            }
            return this.f57781x57d02ba8;
        }

        /* renamed from: insertInternal */
        private long m106284x70dd2496(android.content.ContentValues contentValues, boolean z17) {
            this.mDb.m107660xe1208566();
            try {
                try {
                    com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 m106283x83249ab9 = m106283x83249ab9(z17);
                    m106283x83249ab9.m107803xc089ffb();
                    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : contentValues.valueSet()) {
                        com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106227x65921d0d(m106283x83249ab9, m106295xa6dc51e6(entry.getKey()), entry.getValue());
                    }
                    long m107869x22927a8e = m106283x83249ab9.m107869x22927a8e();
                    this.mDb.m107729x576b60d6();
                    return m107869x22927a8e;
                } catch (com.p314xaae8f345.p3121x37984a.C26893xf084b241 e17) {
                    com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.TAG, "Error inserting " + contentValues + " into table  " + this.f57782x42ddd8c, e17);
                    this.mDb.m107670x7d3c6b03();
                    return -1L;
                }
            } finally {
                this.mDb.m107670x7d3c6b03();
            }
        }

        /* renamed from: bind */
        public void m106285x2e243d(int i17, double d17) {
            this.f57780x9195b0c5.m107798x1b3baa6e(i17, d17);
        }

        /* renamed from: bindNull */
        public void m106292x37fcf764(int i17) {
            this.f57780x9195b0c5.m107800x37fcf764(i17);
        }

        /* renamed from: close */
        public void m106293x5a5ddf8() {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f57779xe033b689;
            if (c26970x63d6eaa3 != null) {
                c26970x63d6eaa3.close();
                this.f57779xe033b689 = null;
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa32 = this.f57781x57d02ba8;
            if (c26970x63d6eaa32 != null) {
                c26970x63d6eaa32.close();
                this.f57781x57d02ba8 = null;
            }
            this.f57778x63cca268 = null;
            this.f57777xd6b44ab0 = null;
        }

        /* renamed from: execute */
        public long m106294xb158f775() {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f57780x9195b0c5;
            if (c26970x63d6eaa3 == null) {
                throw new java.lang.IllegalStateException("you must prepare this inserter before calling execute");
            }
            try {
                try {
                    return c26970x63d6eaa3.m107869x22927a8e();
                } catch (com.p314xaae8f345.p3121x37984a.C26893xf084b241 e17) {
                    com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.TAG, "Error executing InsertHelper with table " + this.f57782x42ddd8c, e17);
                    this.f57780x9195b0c5 = null;
                    return -1L;
                }
            } finally {
                this.f57780x9195b0c5 = null;
            }
        }

        /* renamed from: getColumnIndex */
        public int m106295xa6dc51e6(java.lang.String str) {
            m106283x83249ab9(false);
            java.lang.Integer num = this.f57777xd6b44ab0.get(str);
            if (num != null) {
                return num.intValue();
            }
            throw new java.lang.IllegalArgumentException("column '" + str + "' is invalid");
        }

        /* renamed from: insert */
        public long m106296xb970c2b9(android.content.ContentValues contentValues) {
            return m106284x70dd2496(contentValues, false);
        }

        /* renamed from: prepareForInsert */
        public void m106297x692f8b9b() {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 m106283x83249ab9 = m106283x83249ab9(false);
            this.f57780x9195b0c5 = m106283x83249ab9;
            m106283x83249ab9.m107803xc089ffb();
        }

        /* renamed from: prepareForReplace */
        public void m106298x89570612() {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 m106283x83249ab9 = m106283x83249ab9(true);
            this.f57780x9195b0c5 = m106283x83249ab9;
            m106283x83249ab9.m107803xc089ffb();
        }

        /* renamed from: replace */
        public long m106299x413cb2b4(android.content.ContentValues contentValues) {
            return m106284x70dd2496(contentValues, true);
        }

        /* renamed from: bind */
        public void m106286x2e243d(int i17, float f17) {
            this.f57780x9195b0c5.m107798x1b3baa6e(i17, f17);
        }

        /* renamed from: bind */
        public void m106288x2e243d(int i17, long j17) {
            this.f57780x9195b0c5.m107799x37fbf859(i17, j17);
        }

        /* renamed from: bind */
        public void m106287x2e243d(int i17, int i18) {
            this.f57780x9195b0c5.m107799x37fbf859(i17, i18);
        }

        /* renamed from: bind */
        public void m106290x2e243d(int i17, boolean z17) {
            this.f57780x9195b0c5.m107799x37fbf859(i17, z17 ? 1L : 0L);
        }

        /* renamed from: bind */
        public void m106291x2e243d(int i17, byte[] bArr) {
            if (bArr == null) {
                this.f57780x9195b0c5.m107800x37fcf764(i17);
            } else {
                this.f57780x9195b0c5.m107797x37f7617a(i17, bArr);
            }
        }

        /* renamed from: bind */
        public void m106289x2e243d(int i17, java.lang.String str) {
            if (str == null) {
                this.f57780x9195b0c5.m107800x37fcf764(i17);
            } else {
                this.f57780x9195b0c5.m107801x35198eae(i17, str);
            }
        }
    }

    /* renamed from: appendEscapedSQLString */
    public static void m106224x939975f6(java.lang.StringBuilder sb6, java.lang.String str) {
        sb6.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i17 = 0; i17 < length; i17++) {
                char charAt = str.charAt(i17);
                if (charAt == '\'') {
                    sb6.append('\'');
                }
                sb6.append(charAt);
            }
        } else {
            sb6.append(str);
        }
        sb6.append('\'');
    }

    /* renamed from: appendSelectionArgs */
    public static java.lang.String[] m106225x7ab54b8f(java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length + strArr2.length];
        java.lang.System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        java.lang.System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    /* renamed from: appendValueToSql */
    public static final void m106226x1aa7311c(java.lang.StringBuilder sb6, java.lang.Object obj) {
        if (obj == null) {
            sb6.append("NULL");
            return;
        }
        if (!(obj instanceof java.lang.Boolean)) {
            m106224x939975f6(sb6, obj.toString());
        } else if (((java.lang.Boolean) obj).booleanValue()) {
            sb6.append('1');
        } else {
            sb6.append('0');
        }
    }

    /* renamed from: bindObjectToProgram */
    public static void m106227x65921d0d(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 abstractC26965xa5559cb8, int i17, java.lang.Object obj) {
        if (obj == null) {
            abstractC26965xa5559cb8.m107800x37fcf764(i17);
            return;
        }
        if ((obj instanceof java.lang.Double) || (obj instanceof java.lang.Float)) {
            abstractC26965xa5559cb8.m107798x1b3baa6e(i17, ((java.lang.Number) obj).doubleValue());
            return;
        }
        if (obj instanceof java.lang.Number) {
            abstractC26965xa5559cb8.m107799x37fbf859(i17, ((java.lang.Number) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                abstractC26965xa5559cb8.m107799x37fbf859(i17, 1L);
                return;
            } else {
                abstractC26965xa5559cb8.m107799x37fbf859(i17, 0L);
                return;
            }
        }
        if (obj instanceof byte[]) {
            abstractC26965xa5559cb8.m107797x37f7617a(i17, (byte[]) obj);
        } else {
            abstractC26965xa5559cb8.m107801x35198eae(i17, obj.toString());
        }
    }

    /* renamed from: concatenateWhere */
    public static java.lang.String m106228xf9cf1f32(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        return "(" + str + ") AND (" + str2 + ")";
    }

    /* renamed from: createDbFromSqlStatements */
    public static void m106230x2639be4e(android.content.Context context, java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, int i17, java.lang.String str2) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m108019xa5e841c4 = com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26988x9befcd8f.m108019xa5e841c4(context, str, bArr, c26940xf23b9b2, 0, null);
        for (java.lang.String str3 : android.text.TextUtils.split(str2, ";\n")) {
            if (!android.text.TextUtils.isEmpty(str3)) {
                m108019xa5e841c4.m107671xb158737d(str3);
            }
        }
        m108019xa5e841c4.m107730xc633a616(i17);
        m108019xa5e841c4.close();
    }

    /* renamed from: cursorDoubleToContentValues */
    public static void m106231xc0104e79(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = interfaceC26872x78faff76.getColumnIndex(str);
        if (interfaceC26872x78faff76.isNull(columnIndex)) {
            contentValues.put(str2, (java.lang.Double) null);
        } else {
            contentValues.put(str2, java.lang.Double.valueOf(interfaceC26872x78faff76.getDouble(columnIndex)));
        }
    }

    /* renamed from: cursorDoubleToContentValuesIfPresent */
    public static void m106232x24998265(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = interfaceC26872x78faff76.getColumnIndex(str);
        if (columnIndex == -1 || interfaceC26872x78faff76.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Double.valueOf(interfaceC26872x78faff76.getDouble(columnIndex)));
    }

    /* renamed from: cursorDoubleToCursorValues */
    public static void m106233xd35bccda(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String str, android.content.ContentValues contentValues) {
        m106231xc0104e79(interfaceC26872x78faff76, str, contentValues, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r3 = r5.getType(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r3 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r3 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r3 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r3 == 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r3 = r5.getString(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r3 = r7.m106218xe4673800(r3, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r3 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r7.m106196xf7144f58();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r5.moveToNext() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r3 = r7.m106217xf2e8cd36(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        r3 = r5.getBlob(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        r3 = r7.m106214xf2e3374c(r3, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        r3 = r7.m106217xf2e8cd36(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        r3 = r7.m106215xca8953c0(r5.getDouble(r2), r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        r3 = r7.m106216xf2e7ce2b(r5.getLong(r2), r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        r3 = r7.m106217xf2e8cd36(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        r5.moveToPosition(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r5.moveToPosition(r6) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r7.m106192x6c08d665() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r2 >= r1) goto L42;
     */
    /* renamed from: cursorFillWindow */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m106234x4e58b49(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 r5, int r6, com.p314xaae8f345.p3121x37984a.C26876xa70fd706 r7) {
        /*
            if (r6 < 0) goto L84
            int r0 = r5.getCount()
            if (r6 < r0) goto La
            goto L84
        La:
            int r0 = r5.getPosition()
            int r1 = r5.getColumnCount()
            r7.m106193x5a5b64d()
            r7.m106220x845c6269(r6)
            r7.m106219xadeea779(r1)
            boolean r2 = r5.moveToPosition(r6)
            if (r2 == 0) goto L81
        L21:
            boolean r2 = r7.m106192x6c08d665()
            if (r2 != 0) goto L28
            goto L81
        L28:
            r2 = 0
        L29:
            if (r2 >= r1) goto L79
            int r3 = r5.getType(r2)
            if (r3 == 0) goto L6c
            r4 = 1
            if (r3 == r4) goto L63
            r4 = 2
            if (r3 == r4) goto L5a
            r4 = 4
            if (r3 == r4) goto L4a
            java.lang.String r3 = r5.getString(r2)
            if (r3 == 0) goto L45
            boolean r3 = r7.m106218xe4673800(r3, r6, r2)
            goto L70
        L45:
            boolean r3 = r7.m106217xf2e8cd36(r6, r2)
            goto L70
        L4a:
            byte[] r3 = r5.getBlob(r2)
            if (r3 == 0) goto L55
            boolean r3 = r7.m106214xf2e3374c(r3, r6, r2)
            goto L70
        L55:
            boolean r3 = r7.m106217xf2e8cd36(r6, r2)
            goto L70
        L5a:
            double r3 = r5.getDouble(r2)
            boolean r3 = r7.m106215xca8953c0(r3, r6, r2)
            goto L70
        L63:
            long r3 = r5.getLong(r2)
            boolean r3 = r7.m106216xf2e7ce2b(r3, r6, r2)
            goto L70
        L6c:
            boolean r3 = r7.m106217xf2e8cd36(r6, r2)
        L70:
            if (r3 != 0) goto L76
            r7.m106196xf7144f58()
            goto L79
        L76:
            int r2 = r2 + 1
            goto L29
        L79:
            int r6 = r6 + 1
            boolean r2 = r5.moveToNext()
            if (r2 != 0) goto L21
        L81:
            r5.moveToPosition(r0)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106234x4e58b49(com.tencent.wcdb.Cursor, int, com.tencent.wcdb.CursorWindow):void");
    }

    /* renamed from: cursorFloatToContentValuesIfPresent */
    public static void m106235xadf53744(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = interfaceC26872x78faff76.getColumnIndex(str);
        if (columnIndex == -1 || interfaceC26872x78faff76.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Float.valueOf(interfaceC26872x78faff76.getFloat(columnIndex)));
    }

    /* renamed from: cursorIntToContentValues */
    public static void m106236x6aa8ca47(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String str, android.content.ContentValues contentValues) {
        m106237x6aa8ca47(interfaceC26872x78faff76, str, contentValues, str);
    }

    /* renamed from: cursorIntToContentValuesIfPresent */
    public static void m106238xc1746e57(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = interfaceC26872x78faff76.getColumnIndex(str);
        if (columnIndex == -1 || interfaceC26872x78faff76.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Integer.valueOf(interfaceC26872x78faff76.getInt(columnIndex)));
    }

    /* renamed from: cursorLongToContentValues */
    public static void m106239x9fda02ee(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String str, android.content.ContentValues contentValues) {
        m106240x9fda02ee(interfaceC26872x78faff76, str, contentValues, str);
    }

    /* renamed from: cursorLongToContentValuesIfPresent */
    public static void m106241x400b0190(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = interfaceC26872x78faff76.getColumnIndex(str);
        if (columnIndex == -1 || interfaceC26872x78faff76.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Long.valueOf(interfaceC26872x78faff76.getLong(columnIndex)));
    }

    /* renamed from: cursorPickFillWindowStartPosition */
    public static int m106242xed291081(int i17, int i18) {
        return java.lang.Math.max(i17 - (i18 / 3), 0);
    }

    /* renamed from: cursorRowToContentValues */
    public static void m106243x492934fc(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, android.content.ContentValues contentValues) {
        com.p314xaae8f345.p3121x37984a.AbstractC26865x49c349a7 abstractC26865x49c349a7 = interfaceC26872x78faff76 instanceof com.p314xaae8f345.p3121x37984a.AbstractC26865x49c349a7 ? (com.p314xaae8f345.p3121x37984a.AbstractC26865x49c349a7) interfaceC26872x78faff76 : null;
        java.lang.String[] columnNames = interfaceC26872x78faff76.getColumnNames();
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (abstractC26865x49c349a7 == null || !abstractC26865x49c349a7.m106135xb9a10be7(i17)) {
                contentValues.put(columnNames[i17], interfaceC26872x78faff76.getString(i17));
            } else {
                contentValues.put(columnNames[i17], interfaceC26872x78faff76.getBlob(i17));
            }
        }
    }

    /* renamed from: cursorShortToContentValuesIfPresent */
    public static void m106244x232e3964(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = interfaceC26872x78faff76.getColumnIndex(str);
        if (columnIndex == -1 || interfaceC26872x78faff76.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, java.lang.Short.valueOf(interfaceC26872x78faff76.getShort(columnIndex)));
    }

    /* renamed from: cursorStringToContentValues */
    public static void m106245x5ea56239(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String str, android.content.ContentValues contentValues) {
        m106246x5ea56239(interfaceC26872x78faff76, str, contentValues, str);
    }

    /* renamed from: cursorStringToContentValuesIfPresent */
    public static void m106247xc81ea6a5(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndex = interfaceC26872x78faff76.getColumnIndex(str);
        if (columnIndex == -1 || interfaceC26872x78faff76.isNull(columnIndex)) {
            return;
        }
        contentValues.put(str, interfaceC26872x78faff76.getString(columnIndex));
    }

    /* renamed from: cursorStringToInsertHelper */
    public static void m106248x462e0cc9(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String str, com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.InsertHelper insertHelper, int i17) {
        insertHelper.m106289x2e243d(i17, interfaceC26872x78faff76.getString(interfaceC26872x78faff76.getColumnIndexOrThrow(str)));
    }

    /* renamed from: dumpCurrentRow */
    public static void m106249xdd1f9ab5(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76) {
        m106250xdd1f9ab5(interfaceC26872x78faff76, java.lang.System.out);
    }

    /* renamed from: dumpCurrentRowToString */
    public static java.lang.String m106252xe738cc41(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        m106251xdd1f9ab5(interfaceC26872x78faff76, sb6);
        return sb6.toString();
    }

    /* renamed from: dumpCursor */
    public static void m106253x88bf26a(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76) {
        m106254x88bf26a(interfaceC26872x78faff76, java.lang.System.out);
    }

    /* renamed from: dumpCursorToString */
    public static java.lang.String m106256xfcc09ef6(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        m106255x88bf26a(interfaceC26872x78faff76, sb6);
        return sb6.toString();
    }

    /* renamed from: encodeHex */
    private static char[] m106257x59e41d25(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i17 = 0;
        for (byte b17 : bArr) {
            int i18 = i17 + 1;
            char[] cArr2 = f57762x782fa0e6;
            cArr[i17] = cArr2[(b17 & 240) >>> 4];
            i17 = i18 + 1;
            cArr[i18] = cArr2[b17 & 15];
        }
        return cArr;
    }

    /* renamed from: extractSqlCode */
    private static int m106258x9a20211a(java.lang.String str) {
        int i17 = 0;
        for (int i18 = 0; i18 < 3; i18++) {
            int charAt = str.charAt(i18);
            if (charAt >= 97 && charAt <= 122) {
                charAt = (charAt - 97) + 65;
            } else if (charAt >= 128) {
                return 0;
            }
            i17 |= (charAt & 127) << (i18 * 8);
        }
        return i17;
    }

    /* renamed from: findRowIdColumnIndex */
    public static int m106259x88d6720(java.lang.String[] strArr) {
        int length = strArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (strArr[i17].equals("_id")) {
                return i17;
            }
        }
        return -1;
    }

    /* renamed from: getCollationKey */
    public static java.lang.String m106260x93caa08c(java.lang.String str) {
        byte[] m106261xd55cb41a = m106261xd55cb41a(str);
        try {
            return new java.lang.String(m106261xd55cb41a, 0, m106263x21751e2c(m106261xd55cb41a), "ISO8859_1");
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    /* renamed from: getCollationKeyInBytes */
    private static byte[] m106261xd55cb41a(java.lang.String str) {
        if (f57774x62024f9 == null) {
            java.text.Collator collator = java.text.Collator.getInstance();
            f57774x62024f9 = collator;
            collator.setStrength(0);
        }
        return f57774x62024f9.getCollationKey(str).toByteArray();
    }

    /* renamed from: getHexCollationKey */
    public static java.lang.String m106262x8c13f69b(java.lang.String str) {
        byte[] m106261xd55cb41a = m106261xd55cb41a(str);
        return new java.lang.String(m106257x59e41d25(m106261xd55cb41a), 0, m106263x21751e2c(m106261xd55cb41a) * 2);
    }

    /* renamed from: getKeyLen */
    private static int m106263x21751e2c(byte[] bArr) {
        return bArr[bArr.length + (-1)] != 0 ? bArr.length : bArr.length - 1;
    }

    /* renamed from: getSqlStatementType */
    public static int m106264x37a81591(java.lang.String str) {
        java.lang.String trim = str.trim();
        if (trim.length() < 3) {
            return 99;
        }
        switch (m106258x9a20211a(trim)) {
            case 4279873:
            case 5522756:
                return 9;
            case 4280912:
                return 7;
            case 4476485:
            case 5066563:
                return 5;
            case 4477013:
            case 4998468:
            case 5260626:
            case 5459529:
                return 2;
            case 4543043:
            case 5198404:
            case 5524545:
                return 8;
            case 4670786:
                return 4;
            case 4998483:
                return 1;
            case 5001042:
                return 6;
            case 5526593:
                return 3;
            default:
                return 99;
        }
    }

    /* renamed from: getTypeOfObject */
    public static int m106265x4b494bc6(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof java.lang.Float) || (obj instanceof java.lang.Double)) {
            return 2;
        }
        return ((obj instanceof java.lang.Long) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Byte)) ? 1 : 3;
    }

    /* renamed from: longForQuery */
    public static long m106266x8bcd201b(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.String[] strArr) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 m107663xac8b87c = c26948xabb259c7.m107663xac8b87c(str);
        try {
            return m106267x8bcd201b(m107663xac8b87c, strArr);
        } finally {
            m107663xac8b87c.close();
        }
    }

    /* renamed from: objectEquals */
    public static boolean m106268x9b9063de(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: queryIsEmpty */
    public static boolean m106269xd0b4c05b(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select exists(select 1 from ");
        sb6.append(str);
        sb6.append(")");
        return m106266x8bcd201b(c26948xabb259c7, sb6.toString(), null) == 0;
    }

    /* renamed from: queryNumEntries */
    public static long m106270x3bff2912(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str) {
        return m106272x3bff2912(c26948xabb259c7, str, null, null);
    }

    /* renamed from: readExceptionCode */
    private static final int m106273x70f7cce6(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != f57763x20af8153) {
            return readInt;
        }
        if (parcel.readInt() != 0) {
            return 0;
        }
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Unexpected zero-sized Parcel reply header.");
        return 0;
    }

    /* renamed from: readExceptionFromParcel */
    public static final void m106274xdf605c8c(android.os.Parcel parcel) {
        int m106273x70f7cce6 = m106273x70f7cce6(parcel);
        if (m106273x70f7cce6 == 0) {
            return;
        }
        m106275xdf605c8c(parcel, parcel.readString(), m106273x70f7cce6);
    }

    /* renamed from: readExceptionWithFileNotFoundExceptionFromParcel */
    public static void m106276x9c743a38(android.os.Parcel parcel) {
        int m106273x70f7cce6 = m106273x70f7cce6(parcel);
        if (m106273x70f7cce6 == 0) {
            return;
        }
        java.lang.String readString = parcel.readString();
        if (m106273x70f7cce6 == 1) {
            throw new java.io.FileNotFoundException(readString);
        }
        m106275xdf605c8c(parcel, readString, m106273x70f7cce6);
    }

    /* renamed from: readExceptionWithOperationApplicationExceptionFromParcel */
    public static void m106277x8640e51a(android.os.Parcel parcel) {
        int m106273x70f7cce6 = m106273x70f7cce6(parcel);
        if (m106273x70f7cce6 == 0) {
            return;
        }
        java.lang.String readString = parcel.readString();
        if (m106273x70f7cce6 == 10) {
            throw new android.content.OperationApplicationException(readString);
        }
        m106275xdf605c8c(parcel, readString, m106273x70f7cce6);
    }

    /* renamed from: sqlEscapeString */
    public static java.lang.String m106278x314374e0(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        m106224x939975f6(sb6, str);
        return sb6.toString();
    }

    /* renamed from: stringForQuery */
    public static java.lang.String m106279xc69b54b0(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.String[] strArr) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 m107663xac8b87c = c26948xabb259c7.m107663xac8b87c(str);
        try {
            return m106280xc69b54b0(m107663xac8b87c, strArr);
        } finally {
            m107663xac8b87c.close();
        }
    }

    /* renamed from: writeExceptionToParcel */
    public static final void m106281x579329b4(android.os.Parcel parcel, java.lang.Exception exc) {
        int i17;
        boolean z17 = false;
        int i18 = 1;
        if (!(exc instanceof java.io.FileNotFoundException)) {
            if (exc instanceof java.lang.IllegalArgumentException) {
                i17 = 2;
            } else if (exc instanceof java.lang.UnsupportedOperationException) {
                i17 = 3;
            } else if (exc instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26930x1366424b) {
                i17 = 4;
            } else if (exc instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26944x3f3ff326) {
                i17 = 5;
            } else if (exc instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26950xbda0b8a9) {
                i17 = 6;
            } else if (exc instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26960x96d245b4) {
                i17 = 7;
            } else if (exc instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26957x1fbb1a40) {
                i17 = 8;
            } else if (exc instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183) {
                i17 = 9;
            } else if (exc instanceof android.content.OperationApplicationException) {
                i17 = 10;
            } else {
                if (!(exc instanceof com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f)) {
                    parcel.writeException(exc);
                    com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Writing exception to parcel", exc);
                    return;
                }
                i18 = 11;
            }
            z17 = true;
            i18 = i17;
        }
        parcel.writeInt(i18);
        parcel.writeString(exc.getMessage());
        if (z17) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Writing exception to parcel", exc);
        }
    }

    /* renamed from: cursorIntToContentValues */
    public static void m106237x6aa8ca47(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = interfaceC26872x78faff76.getColumnIndex(str);
        if (!interfaceC26872x78faff76.isNull(columnIndex)) {
            contentValues.put(str2, java.lang.Integer.valueOf(interfaceC26872x78faff76.getInt(columnIndex)));
        } else {
            contentValues.put(str2, (java.lang.Integer) null);
        }
    }

    /* renamed from: cursorLongToContentValues */
    public static void m106240x9fda02ee(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = interfaceC26872x78faff76.getColumnIndex(str);
        if (!interfaceC26872x78faff76.isNull(columnIndex)) {
            contentValues.put(str2, java.lang.Long.valueOf(interfaceC26872x78faff76.getLong(columnIndex)));
        } else {
            contentValues.put(str2, (java.lang.Long) null);
        }
    }

    /* renamed from: cursorStringToContentValues */
    public static void m106246x5ea56239(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        contentValues.put(str2, interfaceC26872x78faff76.getString(interfaceC26872x78faff76.getColumnIndexOrThrow(str)));
    }

    /* renamed from: dumpCurrentRow */
    public static void m106250xdd1f9ab5(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.io.PrintStream printStream) {
        java.lang.String str;
        java.lang.String[] columnNames = interfaceC26872x78faff76.getColumnNames();
        printStream.println("" + interfaceC26872x78faff76.getPosition() + " {");
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            try {
                str = interfaceC26872x78faff76.getString(i17);
            } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 unused) {
                str = "<unprintable>";
            }
            printStream.println("   " + columnNames[i17] + '=' + str);
        }
        printStream.println("}");
    }

    /* renamed from: dumpCursor */
    public static void m106254x88bf26a(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.io.PrintStream printStream) {
        printStream.println(">>>>> Dumping cursor " + interfaceC26872x78faff76);
        if (interfaceC26872x78faff76 != null) {
            int position = interfaceC26872x78faff76.getPosition();
            interfaceC26872x78faff76.moveToPosition(-1);
            while (interfaceC26872x78faff76.moveToNext()) {
                m106250xdd1f9ab5(interfaceC26872x78faff76, printStream);
            }
            interfaceC26872x78faff76.moveToPosition(position);
        }
        printStream.println("<<<<<");
    }

    /* renamed from: queryNumEntries */
    public static long m106271x3bff2912(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.String str2) {
        return m106272x3bff2912(c26948xabb259c7, str, str2, null);
    }

    /* renamed from: queryNumEntries */
    public static long m106272x3bff2912(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        java.lang.String str3;
        if (android.text.TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " where " + str2;
        }
        return m106266x8bcd201b(c26948xabb259c7, "select count(*) from " + str + str3, strArr);
    }

    /* renamed from: readExceptionFromParcel */
    private static final void m106275xdf605c8c(android.os.Parcel parcel, java.lang.String str, int i17) {
        switch (i17) {
            case 2:
                throw new java.lang.IllegalArgumentException(str);
            case 3:
                throw new java.lang.UnsupportedOperationException(str);
            case 4:
                throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26930x1366424b(str);
            case 5:
                throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26944x3f3ff326(str);
            case 6:
                throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26950xbda0b8a9(str);
            case 7:
                throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26960x96d245b4(str);
            case 8:
                throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26957x1fbb1a40(str);
            case 9:
                throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183(str);
            case 10:
            default:
                parcel.readException(i17, str);
                return;
            case 11:
                throw new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f(str);
        }
    }

    /* renamed from: longForQuery */
    public static long m106267x8bcd201b(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3, java.lang.String[] strArr) {
        c26970x63d6eaa3.m107796x5c03dbcf(strArr);
        return c26970x63d6eaa3.m107873x58f653cf();
    }

    /* renamed from: stringForQuery */
    public static java.lang.String m106280xc69b54b0(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3, java.lang.String[] strArr) {
        c26970x63d6eaa3.m107796x5c03dbcf(strArr);
        return c26970x63d6eaa3.m107875xeae4a4();
    }

    /* renamed from: createDbFromSqlStatements */
    public static void m106229x2639be4e(android.content.Context context, java.lang.String str, int i17, java.lang.String str2) {
        m106230x2639be4e(context, str, null, null, i17, str2);
    }

    /* renamed from: dumpCurrentRow */
    public static void m106251xdd1f9ab5(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.StringBuilder sb6) {
        java.lang.String str;
        java.lang.String[] columnNames = interfaceC26872x78faff76.getColumnNames();
        sb6.append("" + interfaceC26872x78faff76.getPosition() + " {\n");
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            try {
                str = interfaceC26872x78faff76.getString(i17);
            } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 unused) {
                str = "<unprintable>";
            }
            sb6.append("   " + columnNames[i17] + '=' + str + "\n");
        }
        sb6.append("}\n");
    }

    /* renamed from: dumpCursor */
    public static void m106255x88bf26a(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.StringBuilder sb6) {
        sb6.append(">>>>> Dumping cursor " + interfaceC26872x78faff76 + "\n");
        if (interfaceC26872x78faff76 != null) {
            int position = interfaceC26872x78faff76.getPosition();
            interfaceC26872x78faff76.moveToPosition(-1);
            while (interfaceC26872x78faff76.moveToNext()) {
                m106251xdd1f9ab5(interfaceC26872x78faff76, sb6);
            }
            interfaceC26872x78faff76.moveToPosition(position);
        }
        sb6.append("<<<<<\n");
    }
}
