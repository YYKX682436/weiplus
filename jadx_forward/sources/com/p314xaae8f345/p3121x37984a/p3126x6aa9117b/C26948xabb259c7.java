package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteDatabase */
/* loaded from: classes12.dex */
public final class C26948xabb259c7 extends com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26941x822ab333 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f58209x7118e671 = false;

    /* renamed from: CHECKPOINT_FULL */
    public static final int f58210x60bd46e6 = 1;

    /* renamed from: CHECKPOINT_PASSIVE */
    public static final int f58211x99a1db50 = 0;

    /* renamed from: CHECKPOINT_RESTART */
    public static final int f58212xa420a38 = 2;

    /* renamed from: CHECKPOINT_TRUNCATE */
    public static final int f58213xc088663d = 3;

    /* renamed from: CONFLICT_ABORT */
    public static final int f58214xc4bf0463 = 2;

    /* renamed from: CONFLICT_FAIL */
    public static final int f58215x65aff6b = 3;

    /* renamed from: CONFLICT_IGNORE */
    public static final int f58216xe10e42df = 4;

    /* renamed from: CONFLICT_NONE */
    public static final int f58217x65ed785 = 0;

    /* renamed from: CONFLICT_REPLACE */
    public static final int f58218x19830f27 = 5;

    /* renamed from: CONFLICT_ROLLBACK */
    public static final int f58219x210a30b1 = 1;

    /* renamed from: CONFLICT_VALUES */
    private static final java.lang.String[] f58220xf6e7e22f;

    /* renamed from: CREATE_IF_NECESSARY */
    public static final int f58221xbc3ef8f0 = 268435456;

    /* renamed from: ENABLE_IO_TRACE */
    public static final int f58222x3f028c08 = 256;

    /* renamed from: ENABLE_WRITE_AHEAD_LOGGING */
    public static final int f58223x264a8965 = 536870912;

    /* renamed from: MAX_SQL_CACHE_SIZE */
    public static final int f58224xd9f4164a = 100;

    /* renamed from: NO_LOCALIZED_COLLATORS */
    public static final int f58225x3b98eaef = 16;

    /* renamed from: OPEN_READONLY */
    public static final int f58226x92593497 = 1;

    /* renamed from: OPEN_READWRITE */
    public static final int f58227xb93fe034 = 0;

    /* renamed from: OPEN_READ_MASK */
    private static final int f58228xb9ae3840 = 1;

    /* renamed from: SQLITE_MAX_LIKE_PATTERN_LENGTH */
    public static final int f58229x2fd59d8f = 50000;

    /* renamed from: SYNCHRONOUS_EXTRA */
    public static final int f58230x8fd0b5a = 3;

    /* renamed from: SYNCHRONOUS_FULL */
    public static final int f58231x3a1915e5 = 2;

    /* renamed from: SYNCHRONOUS_NORMAL */
    public static final int f58232x25802ebd = 1;

    /* renamed from: SYNCHRONOUS_OFF */
    public static final int f58233xc8117339 = 0;
    private static final java.lang.String TAG = "WCDB.SQLiteDatabase";

    /* renamed from: sActiveDatabases */
    private static final java.util.WeakHashMap<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7, java.lang.Object> f58234x1d8ca8ff;

    /* renamed from: mConfigurationLocked */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f f58235x9ba091f3;

    /* renamed from: mConnectionPoolLocked */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 f58236x855cbd1;

    /* renamed from: mCursorFactory */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory f58237xd4d57167;

    /* renamed from: mErrorHandler */
    private final com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d f58238xcfad5d2f;

    /* renamed from: mHasAttachedDbsLocked */
    private boolean f58239xb4f5b26e;

    /* renamed from: mThreadSession */
    private final java.lang.ThreadLocal<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca> f58241xd8d615bf = new java.lang.ThreadLocal<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca>() { // from class: com.tencent.wcdb.database.SQLiteDatabase.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca initialValue() {
            return com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.this.m107664xfc37a5fa();
        }
    };

    /* renamed from: mLock */
    private final java.lang.Object f58240x6243b38 = new java.lang.Object();

    /* renamed from: com.tencent.wcdb.database.SQLiteDatabase$CursorFactory */
    /* loaded from: classes12.dex */
    public interface CursorFactory {
        /* renamed from: newCursor */
        com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 mo107385xc13ef116(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a interfaceC26946xca9816a, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 abstractC26965xa5559cb8);

        /* renamed from: newQuery */
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 mo107386x51538308(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab);
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteDatabase$CustomFunction */
    /* loaded from: classes12.dex */
    public interface CustomFunction {
        /* renamed from: callback */
        void m107738xf5bc2045(java.lang.String[] strArr);
    }

    static {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26961x60ffeeef.m107775x141073bf();
        f58234x1d8ca8ff = new java.util.WeakHashMap<>();
        f58220xf6e7e22f = new java.lang.String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }

    private C26948xabb259c7(java.lang.String str, int i17, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        this.f58237xd4d57167 = cursorFactory;
        this.f58238xcfad5d2f = interfaceC26879x4f347d5d == null ? new com.p314xaae8f345.p3121x37984a.C26881xc9b590fe(true) : interfaceC26879x4f347d5d;
        this.f58235x9ba091f3 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f(str, i17);
    }

    /* renamed from: collectDbStats */
    private void m107617x55a55a37(java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.DbStats> arrayList) {
        synchronized (this.f58240x6243b38) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 c26943x5700cb66 = this.f58236x855cbd1;
            if (c26943x5700cb66 != null) {
                c26943x5700cb66.m107583x55a55a37(arrayList);
            }
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107618xaf65a0fc(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory) {
        return m107631xfef9b1e5(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f.f58244x57107208, cursorFactory, 268435456);
    }

    /* renamed from: deleteDatabase */
    public static boolean m107619xf04b2046(java.io.File file) {
        if (file == null) {
            throw new java.lang.IllegalArgumentException("file must not be null");
        }
        boolean delete = file.delete() | new java.io.File(file.getPath() + "-journal").delete() | new java.io.File(file.getPath() + "-shm").delete() | new java.io.File(file.getPath() + "-wal").delete();
        java.io.File parentFile = file.getParentFile();
        if (parentFile != null) {
            final java.lang.String str = file.getName() + "-mj";
            java.io.File[] listFiles = parentFile.listFiles(new java.io.FileFilter() { // from class: com.tencent.wcdb.database.SQLiteDatabase.2
                @Override // java.io.FileFilter
                public boolean accept(java.io.File file2) {
                    return file2.getName().startsWith(str);
                }
            });
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    delete |= file2.delete();
                }
            }
        }
        return delete;
    }

    /* renamed from: dispose */
    private void m107620x63a5261f(boolean z17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 c26943x5700cb66;
        synchronized (this.f58240x6243b38) {
            c26943x5700cb66 = this.f58236x855cbd1;
            this.f58236x855cbd1 = null;
        }
        if (z17) {
            return;
        }
        java.util.WeakHashMap<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7, java.lang.Object> weakHashMap = f58234x1d8ca8ff;
        synchronized (weakHashMap) {
            weakHashMap.remove(this);
        }
        if (c26943x5700cb66 != null) {
            c26943x5700cb66.close();
        }
    }

    /* renamed from: dumpAll */
    public static void m107621x77ca130d(android.util.Printer printer, boolean z17) {
        java.util.Iterator<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7> it = m107625xe8d517bc().iterator();
        while (it.hasNext()) {
            it.next().m107667x2f39f4(printer, z17);
        }
    }

    /* renamed from: dumpAllJSON */
    public static org.json.JSONArray m107622x8f62a975(boolean z17) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7> it = m107625xe8d517bc().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m107668x817c04dc(z17));
        }
        return jSONArray;
    }

    /* renamed from: executeSql */
    private int m107623x20261e19(java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        boolean z17;
        m107403x3e28f15();
        try {
            if (com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106264x37a81591(str) == 3) {
                synchronized (this.f58240x6243b38) {
                    if (this.f58239xb4f5b26e) {
                        z17 = false;
                    } else {
                        z17 = true;
                        this.f58239xb4f5b26e = true;
                    }
                }
                if (z17) {
                    m107666x45be01d5();
                }
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3(this, str, objArr);
            try {
                return c26970x63d6eaa3.m107872x91d1f3e9(c26987xeef691ab);
            } finally {
                c26970x63d6eaa3.close();
            }
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: findEditTable */
    public static java.lang.String m107624x9e9b9e2b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalStateException("Invalid tables");
        }
        int indexOf = str.indexOf(32);
        int indexOf2 = str.indexOf(44);
        return (indexOf <= 0 || (indexOf >= indexOf2 && indexOf2 >= 0)) ? indexOf2 > 0 ? (indexOf2 < indexOf || indexOf < 0) ? str.substring(0, indexOf2) : str : str : str.substring(0, indexOf);
    }

    /* renamed from: getActiveDatabases */
    private static java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7> m107625xe8d517bc() {
        java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7> arrayList = new java.util.ArrayList<>();
        java.util.WeakHashMap<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7, java.lang.Object> weakHashMap = f58234x1d8ca8ff;
        synchronized (weakHashMap) {
            arrayList.addAll(weakHashMap.keySet());
        }
        return arrayList;
    }

    /* renamed from: getDbStats */
    public static java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.DbStats> m107626x93bf228b() {
        java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.DbStats> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7> it = m107625xe8d517bc().iterator();
        while (it.hasNext()) {
            it.next().m107617x55a55a37(arrayList);
        }
        return arrayList;
    }

    /* renamed from: isMainThread */
    private static boolean m107627x9e2d0ded() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        return myLooper != null && myLooper == android.os.Looper.getMainLooper();
    }

    /* renamed from: isReadOnlyLocked */
    private boolean m107628xdca407d6() {
        return (this.f58235x9ba091f3.f58251x5ac7365d & 1) == 1;
    }

    /* renamed from: keySet */
    private java.util.Set<java.lang.String> m107629xbc5e1583(android.content.ContentValues contentValues) {
        return contentValues.keySet();
    }

    /* renamed from: open */
    private void m107630x34264a(byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, int i17) {
        try {
            try {
                m107636x5af2962c(bArr, c26940xf23b9b2, i17);
            } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26950xbda0b8a9 unused) {
                m107703x28043a1a();
                m107636x5af2962c(bArr, c26940xf23b9b2, i17);
            }
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Failed to open database '" + m107679x74bd253e() + "'.", e17);
            close();
            throw e17;
        }
    }

    /* renamed from: openDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107631xfef9b1e5(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, int i17) {
        return m107632xfef9b1e5(str, cursorFactory, i17, null);
    }

    /* renamed from: openInner */
    private void m107636x5af2962c(byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, int i17) {
        synchronized (this.f58240x6243b38) {
            this.f58236x855cbd1 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.m107570x34264a(this, this.f58235x9ba091f3, bArr, c26940xf23b9b2, i17);
        }
        java.util.WeakHashMap<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7, java.lang.Object> weakHashMap = f58234x1d8ca8ff;
        synchronized (weakHashMap) {
            weakHashMap.put(this, null);
        }
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107637xa5e841c4(java.io.File file, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory) {
        return m107642xa5e841c4(file.getPath(), cursorFactory);
    }

    /* renamed from: openOrCreateDatabaseInWalMode */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107649xbd2b395c(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory) {
        return m107635xfef9b1e5(str, null, null, cursorFactory, 805306368, null, 0);
    }

    /* renamed from: openOrCreateMemoryDatabaseInWalMode */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107653xde3b411b(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory) {
        return m107635xfef9b1e5(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f.f58244x57107208, null, null, cursorFactory, 805306368, null, 0);
    }

    /* renamed from: releaseMemory */
    public static int m107654xb0f66fe8() {
        return com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26961x60ffeeef.m107777xb0f66fe8();
    }

    /* renamed from: throwIfNotOpenLocked */
    private void m107655x76d60344() {
        if (this.f58236x855cbd1 != null) {
            return;
        }
        throw new java.lang.IllegalStateException("The database '" + this.f58235x9ba091f3.f58248x61f7ef4 + "' is not open.");
    }

    /* renamed from: yieldIfContendedHelper */
    private boolean m107656xc38409ac(boolean z17, long j17) {
        m107403x3e28f15();
        try {
            return m107686x3b27c976().m107866x1926d111(j17, z17, null);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: acquireNativeConnectionHandle */
    public long m107657x12386953(java.lang.String str, boolean z17, boolean z18) {
        if (str == null) {
            str = "unnamedNative";
        }
        int i17 = z17 ? 1 : 2;
        if (z18) {
            i17 |= 4;
        }
        long m107494xdc4f8f95 = m107686x3b27c976().m107848xf0ab5594(i17).m107494xdc4f8f95(str);
        if (m107494xdc4f8f95 != 0) {
            return m107494xdc4f8f95;
        }
        throw new java.lang.IllegalStateException("SQLiteConnection native handle not initialized.");
    }

    /* renamed from: addExtension */
    public void m107658xd344e89e(com.p314xaae8f345.p3121x37984a.p3127xdb7d1c3f.InterfaceC26975xbb9cdd73 interfaceC26975xbb9cdd73) {
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            if (this.f58235x9ba091f3.f58246x94266c14.add(interfaceC26975xbb9cdd73)) {
                try {
                    this.f58236x855cbd1.m107593x7ede9e13(this.f58235x9ba091f3);
                } catch (java.lang.RuntimeException e17) {
                    this.f58235x9ba091f3.f58246x94266c14.remove(interfaceC26975xbb9cdd73);
                    throw e17;
                }
            }
        }
    }

    /* renamed from: beginTransaction */
    public void m107659xb2c12e75() {
        m107616xb2c12e75(null, true);
    }

    /* renamed from: beginTransactionNonExclusive */
    public void m107660xe1208566() {
        m107616xb2c12e75(null, false);
    }

    /* renamed from: beginTransactionWithListener */
    public void m107661x16a62eaf(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        m107616xb2c12e75(sQLiteTransactionListener, true);
    }

    /* renamed from: beginTransactionWithListenerNonExclusive */
    public void m107662x9f34fea0(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        m107616xb2c12e75(sQLiteTransactionListener, false);
    }

    /* renamed from: compileStatement */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 m107663xac8b87c(java.lang.String str) {
        m107403x3e28f15();
        try {
            return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3(this, str, null);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: createSession */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca m107664xfc37a5fa() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 c26943x5700cb66;
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            c26943x5700cb66 = this.f58236x855cbd1;
        }
        return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca(c26943x5700cb66);
    }

    /* renamed from: delete */
    public int m107665xb06685ab(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        java.lang.String str3;
        m107403x3e28f15();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DELETE FROM ");
            sb6.append(str);
            if (android.text.TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " WHERE " + str2;
            }
            sb6.append(str3);
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3(this, sb6.toString(), strArr);
            try {
                return c26970x63d6eaa3.m107871x91d1f3e9();
            } finally {
                c26970x63d6eaa3.close();
            }
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: disableWriteAheadLogging */
    public void m107666x45be01d5() {
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58235x9ba091f3;
            int i17 = c26949xb6e0a66f.f58251x5ac7365d;
            if ((i17 & f58223x264a8965) == 0) {
                return;
            }
            c26949xb6e0a66f.f58251x5ac7365d = i17 & (-536870913);
            try {
                this.f58236x855cbd1.m107593x7ede9e13(c26949xb6e0a66f);
            } catch (java.lang.RuntimeException e17) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f2 = this.f58235x9ba091f3;
                c26949xb6e0a66f2.f58251x5ac7365d = 536870912 | c26949xb6e0a66f2.f58251x5ac7365d;
                throw e17;
            }
        }
    }

    /* renamed from: dump */
    public void m107667x2f39f4(android.util.Printer printer, boolean z17) {
        synchronized (this.f58240x6243b38) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 c26943x5700cb66 = this.f58236x855cbd1;
            if (c26943x5700cb66 != null) {
                c26943x5700cb66.m107584x2f39f4(printer, z17);
            }
        }
    }

    /* renamed from: dumpJSON */
    public org.json.JSONObject m107668x817c04dc(boolean z17) {
        synchronized (this.f58240x6243b38) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 c26943x5700cb66 = this.f58236x855cbd1;
            if (c26943x5700cb66 != null) {
                return c26943x5700cb66.m107585x817c04dc(z17);
            }
            return new org.json.JSONObject();
        }
    }

    /* renamed from: enableWriteAheadLogging */
    public boolean m107669xbbf289a() {
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            if ((this.f58235x9ba091f3.f58251x5ac7365d & f58223x264a8965) != 0) {
                return true;
            }
            if (m107628xdca407d6()) {
                return false;
            }
            if (this.f58235x9ba091f3.m107739x46d4026e()) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.i(TAG, "can't enable WAL for memory databases.");
                return false;
            }
            if (this.f58239xb4f5b26e) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.i(TAG, "this database: " + this.f58235x9ba091f3.f58248x61f7ef4 + " has attached databases. can't  enable WAL.");
                return false;
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58235x9ba091f3;
            c26949xb6e0a66f.f58251x5ac7365d |= f58223x264a8965;
            try {
                this.f58236x855cbd1.m107593x7ede9e13(c26949xb6e0a66f);
                return true;
            } catch (java.lang.RuntimeException e17) {
                this.f58235x9ba091f3.f58251x5ac7365d &= -536870913;
                throw e17;
            }
        }
    }

    /* renamed from: endTransaction */
    public void m107670x7d3c6b03() {
        m107403x3e28f15();
        try {
            m107686x3b27c976().m107851x7d3c6b03(null);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: execSQL */
    public void m107671xb158737d(java.lang.String str) {
        m107623x20261e19(str, null, null);
    }

    /* renamed from: finalize */
    public void m107674xd764dc1e() {
        try {
            m107620x63a5261f(true);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: getAsyncCheckpointEnabled */
    public boolean m107675x10d98073() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8 m107678xe43133e3 = m107678xe43133e3();
        return m107678xe43133e3 != null && (m107678xe43133e3 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26932x395aea05);
    }

    /* renamed from: getAttachedDbs */
    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> m107676xad58423b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f58240x6243b38) {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = null;
            if (this.f58236x855cbd1 == null) {
                return null;
            }
            if (!this.f58239xb4f5b26e) {
                arrayList.add(new android.util.Pair(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29, this.f58235x9ba091f3.f58252x346425));
                return arrayList;
            }
            m107403x3e28f15();
            try {
                try {
                    interfaceC26872x78faff76 = m107710x1d3f4980("pragma database_list;", null);
                    while (interfaceC26872x78faff76.moveToNext()) {
                        arrayList.add(new android.util.Pair(interfaceC26872x78faff76.getString(1), interfaceC26872x78faff76.getString(2)));
                    }
                    interfaceC26872x78faff76.close();
                    return arrayList;
                } catch (java.lang.Throwable th6) {
                    if (interfaceC26872x78faff76 != null) {
                        interfaceC26872x78faff76.close();
                    }
                    throw th6;
                }
            } finally {
                m107405xb81b4f04();
            }
        }
    }

    /* renamed from: getChangeListener */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26938x4a846bd0 m107677x2dcf597a() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26938x4a846bd0 m107587x2dcf597a;
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            m107587x2dcf597a = this.f58236x855cbd1.m107587x2dcf597a();
        }
        return m107587x2dcf597a;
    }

    /* renamed from: getCheckpointCallback */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8 m107678xe43133e3() {
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            if (!this.f58235x9ba091f3.f58245x9c3ece2d) {
                return null;
            }
            return this.f58236x855cbd1.m107588x3eb1d852();
        }
    }

    /* renamed from: getLabel */
    public java.lang.String m107679x74bd253e() {
        java.lang.String str;
        synchronized (this.f58240x6243b38) {
            str = this.f58235x9ba091f3.f58248x61f7ef4;
        }
        return str;
    }

    /* renamed from: getMaximumSize */
    public long m107680x3e4f410b() {
        return com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106266x8bcd201b(this, "PRAGMA max_page_count;", null) * m107681xaf1414a6();
    }

    /* renamed from: getPageSize */
    public long m107681xaf1414a6() {
        return com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106266x8bcd201b(this, "PRAGMA page_size;", null);
    }

    /* renamed from: getPath */
    public final java.lang.String m107682xfb83cc9b() {
        java.lang.String str;
        synchronized (this.f58240x6243b38) {
            str = this.f58235x9ba091f3.f58252x346425;
        }
        return str;
    }

    @java.lang.Deprecated
    /* renamed from: getSyncedTables */
    public java.util.Map<java.lang.String, java.lang.String> m107683xbe7fe5f5() {
        return new java.util.HashMap(0);
    }

    /* renamed from: getSynchronousMode */
    public int m107684x69c4ee56() {
        int i17;
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            i17 = this.f58235x9ba091f3.f58253x85631c8c;
        }
        return i17;
    }

    /* renamed from: getThreadDefaultConnectionFlags */
    public int m107685x1472aee8(boolean z17) {
        int i17 = z17 ? 1 : 2;
        return m107627x9e2d0ded() ? i17 | 4 : i17;
    }

    /* renamed from: getThreadSession */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca m107686x3b27c976() {
        return this.f58241xd8d615bf.get();
    }

    /* renamed from: getTraceCallback */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 m107687x997f1cf4() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 m107589x997f1cf4;
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            m107589x997f1cf4 = this.f58236x855cbd1.m107589x997f1cf4();
        }
        return m107589x997f1cf4;
    }

    /* renamed from: getVersion */
    public int m107688x52c258a2() {
        return java.lang.Long.valueOf(com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106266x8bcd201b(this, "PRAGMA user_version;", null)).intValue();
    }

    /* renamed from: inTransaction */
    public boolean m107689x51d3479() {
        m107403x3e28f15();
        try {
            return m107686x3b27c976().m107860x799723e4();
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: insert */
    public long m107690xb970c2b9(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return m107692x3462f350(str, str2, contentValues, 0);
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26950xbda0b8a9 e17) {
            throw e17;
        } catch (com.p314xaae8f345.p3121x37984a.C26893xf084b241 e18) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Error inserting %s: %s", contentValues, e18);
            return -1L;
        }
    }

    /* renamed from: insertOrThrow */
    public long m107691x98afe1ca(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return m107692x3462f350(str, str2, contentValues, 0);
    }

    /* renamed from: insertWithOnConflict */
    public long m107692x3462f350(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues, int i17) {
        java.lang.Object[] objArr;
        m107403x3e28f15();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("INSERT");
            sb6.append(f58220xf6e7e22f[i17]);
            sb6.append(" INTO ");
            sb6.append(str);
            sb6.append('(');
            int i18 = 0;
            int size = (contentValues == null || contentValues.size() <= 0) ? 0 : contentValues.size();
            if (size > 0) {
                objArr = new java.lang.Object[size];
                int i19 = 0;
                for (java.lang.String str3 : m107629xbc5e1583(contentValues)) {
                    sb6.append(i19 > 0 ? "," : "");
                    sb6.append(str3);
                    objArr[i19] = contentValues.get(str3);
                    i19++;
                }
                sb6.append(')');
                sb6.append(" VALUES (");
                while (i18 < size) {
                    sb6.append(i18 > 0 ? ",?" : "?");
                    i18++;
                }
            } else {
                sb6.append(str2 + ") VALUES (NULL");
                objArr = null;
            }
            sb6.append(')');
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3(this, sb6.toString(), objArr);
            try {
                return c26970x63d6eaa3.m107869x22927a8e();
            } finally {
                c26970x63d6eaa3.close();
            }
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: isDatabaseIntegrityOk */
    public boolean m107693x2bf79c04() {
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list;
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> m107676xad58423b;
        m107403x3e28f15();
        try {
            try {
                m107676xad58423b = m107676xad58423b();
            } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 unused) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new android.util.Pair(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29, m107682xfb83cc9b()));
                list = arrayList;
            }
            if (m107676xad58423b == null) {
                throw new java.lang.IllegalStateException("databaselist for: " + m107682xfb83cc9b() + " couldn't be retrieved. probably because the database is closed");
            }
            list = m107676xad58423b;
            for (int i17 = 0; i17 < list.size(); i17++) {
                android.util.Pair<java.lang.String, java.lang.String> pair = list.get(i17);
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = null;
                try {
                    c26970x63d6eaa3 = m107663xac8b87c("PRAGMA " + ((java.lang.String) pair.first) + ".integrity_check(1);");
                    java.lang.String m107875xeae4a4 = c26970x63d6eaa3.m107875xeae4a4();
                    if (!com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106268x9b9063de(m107875xeae4a4, "ok")) {
                        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "PRAGMA integrity_check on " + ((java.lang.String) pair.second) + " returned: " + m107875xeae4a4);
                        c26970x63d6eaa3.close();
                        return false;
                    }
                    c26970x63d6eaa3.close();
                } catch (java.lang.Throwable th6) {
                    if (c26970x63d6eaa3 != null) {
                        c26970x63d6eaa3.close();
                    }
                    throw th6;
                }
            }
            m107405xb81b4f04();
            return true;
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: isDbLockedByCurrentThread */
    public boolean m107694x12192afa() {
        m107403x3e28f15();
        try {
            return m107686x3b27c976().m107858xfadcf518();
        } finally {
            m107405xb81b4f04();
        }
    }

    @java.lang.Deprecated
    /* renamed from: isDbLockedByOtherThreads */
    public boolean m107695xe4bb6982() {
        return false;
    }

    /* renamed from: isInMemoryDatabase */
    public boolean m107696xf5c8d36b() {
        boolean m107739x46d4026e;
        synchronized (this.f58240x6243b38) {
            m107739x46d4026e = this.f58235x9ba091f3.m107739x46d4026e();
        }
        return m107739x46d4026e;
    }

    /* renamed from: isOpen */
    public boolean m107697xb9a70294() {
        boolean z17;
        synchronized (this.f58240x6243b38) {
            z17 = this.f58236x855cbd1 != null;
        }
        return z17;
    }

    /* renamed from: isReadOnly */
    public boolean m107698x9cffd9ac() {
        boolean m107628xdca407d6;
        synchronized (this.f58240x6243b38) {
            m107628xdca407d6 = m107628xdca407d6();
        }
        return m107628xdca407d6;
    }

    /* renamed from: isWriteAheadLoggingEnabled */
    public boolean m107699xbf891bee() {
        boolean z17;
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            z17 = (this.f58235x9ba091f3.f58251x5ac7365d & f58223x264a8965) != 0;
        }
        return z17;
    }

    @java.lang.Deprecated
    /* renamed from: markTableSyncable */
    public void m107700x67003a96(java.lang.String str, java.lang.String str2) {
    }

    /* renamed from: needUpgrade */
    public boolean m107702xc3a4f4a6(int i17) {
        return i17 > m107688x52c258a2();
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26941x822ab333
    /* renamed from: onAllReferencesReleased */
    public void mo106213x355542c7() {
        m107620x63a5261f(false);
    }

    /* renamed from: onCorruption */
    public void m107703x28043a1a() {
        this.f58238xcfad5d2f.mo63526x28043a1a(this);
    }

    /* renamed from: query */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107706x66f18c8(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return m107709xe8f38f7c(null, z17, str, strArr, str2, objArr, str3, str4, str5, str6, null);
    }

    /* renamed from: queryWithFactory */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107708xe8f38f7c(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return m107709xe8f38f7c(cursorFactory, z17, str, strArr, str2, objArr, str3, str4, str5, str6, null);
    }

    /* renamed from: rawQuery */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107710x1d3f4980(java.lang.String str, java.lang.Object[] objArr) {
        return m107713x46d43bc4(null, str, objArr, null, null);
    }

    /* renamed from: rawQueryWithFactory */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107712x46d43bc4(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, java.lang.String str, java.lang.Object[] objArr, java.lang.String str2) {
        return m107713x46d43bc4(cursorFactory, str, objArr, str2, null);
    }

    /* renamed from: releaseNativeConnection */
    public void m107714x63db387c(long j17, java.lang.Exception exc) {
        m107686x3b27c976().m107862x401c5783(exc);
    }

    /* renamed from: reopenReadWrite */
    public void m107715xd329e56c() {
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            if (m107628xdca407d6()) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58235x9ba091f3;
                int i17 = c26949xb6e0a66f.f58251x5ac7365d;
                c26949xb6e0a66f.f58251x5ac7365d = (i17 & (-2)) | 0;
                try {
                    this.f58236x855cbd1.m107593x7ede9e13(c26949xb6e0a66f);
                } catch (java.lang.RuntimeException e17) {
                    this.f58235x9ba091f3.f58251x5ac7365d = i17;
                    throw e17;
                }
            }
        }
    }

    /* renamed from: replace */
    public long m107716x413cb2b4(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return m107692x3462f350(str, str2, contentValues, 5);
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26950xbda0b8a9 e17) {
            throw e17;
        } catch (com.p314xaae8f345.p3121x37984a.C26893xf084b241 e18) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Error inserting " + contentValues, e18);
            return -1L;
        }
    }

    /* renamed from: replaceOrThrow */
    public long m107717xd930116f(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return m107692x3462f350(str, str2, contentValues, 5);
    }

    /* renamed from: setAsyncCheckpointEnabled */
    public void m107718x431d1c7f(boolean z17) {
        m107720x7b5cb5ef(z17 ? new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26932x395aea05() : null);
    }

    /* renamed from: setChangeListener */
    public void m107719xf5c5c186(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26938x4a846bd0 interfaceC26938x4a846bd0, boolean z17) {
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            this.f58236x855cbd1.m107595xf5c5c186(interfaceC26938x4a846bd0, z17);
        }
    }

    /* renamed from: setCheckpointCallback */
    public void m107720x7b5cb5ef(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8 interfaceC26939xfb49cfa8) {
        boolean z17 = true;
        boolean z18 = interfaceC26939xfb49cfa8 != null;
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58235x9ba091f3;
            if (c26949xb6e0a66f.f58245x9c3ece2d != z18) {
                c26949xb6e0a66f.f58245x9c3ece2d = z18;
                try {
                    this.f58236x855cbd1.m107593x7ede9e13(c26949xb6e0a66f);
                } catch (java.lang.RuntimeException e17) {
                    com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f2 = this.f58235x9ba091f3;
                    if (z18) {
                        z17 = false;
                    }
                    c26949xb6e0a66f2.f58245x9c3ece2d = z17;
                    throw e17;
                }
            }
            this.f58236x855cbd1.m107596xd5dd5a5e(interfaceC26939xfb49cfa8);
        }
    }

    /* renamed from: setForeignKeyConstraintsEnabled */
    public void m107721x7051f9f8(boolean z17) {
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58235x9ba091f3;
            if (c26949xb6e0a66f.f58247x298db076 == z17) {
                return;
            }
            c26949xb6e0a66f.f58247x298db076 = z17;
            try {
                this.f58236x855cbd1.m107593x7ede9e13(c26949xb6e0a66f);
            } catch (java.lang.RuntimeException e17) {
                this.f58235x9ba091f3.f58247x298db076 = !z17;
                throw e17;
            }
        }
    }

    /* renamed from: setLocale */
    public void m107722x16e2655c(java.util.Locale locale) {
        if (locale == null) {
            throw new java.lang.IllegalArgumentException("locale must not be null.");
        }
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58235x9ba091f3;
            java.util.Locale locale2 = c26949xb6e0a66f.f58249xbe960e5a;
            c26949xb6e0a66f.f58249xbe960e5a = locale;
            try {
                this.f58236x855cbd1.m107593x7ede9e13(c26949xb6e0a66f);
            } catch (java.lang.RuntimeException e17) {
                this.f58235x9ba091f3.f58249xbe960e5a = locale2;
                throw e17;
            }
        }
    }

    @java.lang.Deprecated
    /* renamed from: setLockingEnabled */
    public void m107723x56a1096c(boolean z17) {
    }

    /* renamed from: setMaxSqlCacheSize */
    public void m107724x5d12eb37(int i17) {
        if (i17 > 100 || i17 < 0) {
            throw new java.lang.IllegalStateException("expected value between 0 and 100");
        }
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58235x9ba091f3;
            int i18 = c26949xb6e0a66f.f58250x41da7ff9;
            c26949xb6e0a66f.f58250x41da7ff9 = i17;
            try {
                this.f58236x855cbd1.m107593x7ede9e13(c26949xb6e0a66f);
            } catch (java.lang.RuntimeException e17) {
                this.f58235x9ba091f3.f58250x41da7ff9 = i18;
                throw e17;
            }
        }
    }

    /* renamed from: setMaximumSize */
    public long m107725xd4b4b47f(long j17) {
        long m107681xaf1414a6 = m107681xaf1414a6();
        long j18 = j17 / m107681xaf1414a6;
        if (j17 % m107681xaf1414a6 != 0) {
            j18++;
        }
        return com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106266x8bcd201b(this, "PRAGMA max_page_count = " + j18, null) * m107681xaf1414a6;
    }

    /* renamed from: setPageSize */
    public void m107726xa9cc75b2(long j17) {
        m107671xb158737d("PRAGMA page_size = " + j17);
    }

    /* renamed from: setSynchronousMode */
    public void m107727xa09b87ca(int i17) {
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58235x9ba091f3;
            int i18 = c26949xb6e0a66f.f58253x85631c8c;
            if (i18 != i17) {
                c26949xb6e0a66f.f58253x85631c8c = i17;
                try {
                    this.f58236x855cbd1.m107593x7ede9e13(c26949xb6e0a66f);
                } catch (java.lang.RuntimeException e17) {
                    this.f58235x9ba091f3.f58253x85631c8c = i18;
                    throw e17;
                }
            }
        }
    }

    /* renamed from: setTraceCallback */
    public void m107728x2c558368(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 interfaceC26973xda906c79) {
        synchronized (this.f58240x6243b38) {
            m107655x76d60344();
            this.f58236x855cbd1.m107597x2c558368(interfaceC26973xda906c79);
        }
    }

    /* renamed from: setTransactionSuccessful */
    public void m107729x576b60d6() {
        m107403x3e28f15();
        try {
            m107686x3b27c976().m107864x576b60d6();
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: setVersion */
    public void m107730xc633a616(int i17) {
        m107671xb158737d("PRAGMA user_version = " + i17);
    }

    /* renamed from: toString */
    public java.lang.String m107731x9616526c() {
        return "SQLiteDatabase: " + m107682xfb83cc9b();
    }

    /* renamed from: update */
    public int m107732xce0038c9(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        return m107733x63628d60(str, contentValues, str2, strArr, 0);
    }

    /* renamed from: updateWithOnConflict */
    public int m107733x63628d60(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr, int i17) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new java.lang.IllegalArgumentException("Empty values");
        }
        m107403x3e28f15();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(120);
            sb6.append("UPDATE ");
            sb6.append(f58220xf6e7e22f[i17]);
            sb6.append(str);
            sb6.append(" SET ");
            int size = contentValues.size();
            int length = strArr == null ? size : strArr.length + size;
            java.lang.Object[] objArr = new java.lang.Object[length];
            int i18 = 0;
            for (java.lang.String str3 : m107629xbc5e1583(contentValues)) {
                sb6.append(i18 > 0 ? "," : "");
                sb6.append(str3);
                objArr[i18] = contentValues.get(str3);
                sb6.append("=?");
                i18++;
            }
            if (strArr != null) {
                for (int i19 = size; i19 < length; i19++) {
                    objArr[i19] = strArr[i19 - size];
                }
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                sb6.append(" WHERE ");
                sb6.append(str2);
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3(this, sb6.toString(), objArr);
            try {
                return c26970x63d6eaa3.m107871x91d1f3e9();
            } finally {
                c26970x63d6eaa3.close();
            }
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: walCheckpoint */
    public android.util.Pair<java.lang.Integer, java.lang.Integer> m107734xf28d4a0a(java.lang.String str, int i17) {
        m107403x3e28f15();
        try {
            return m107686x3b27c976().m107865xf28d4a0a(str, i17, i17 > 0 ? 2 : 0);
        } finally {
            m107405xb81b4f04();
        }
    }

    @java.lang.Deprecated
    /* renamed from: yieldIfContended */
    public boolean m107735x5fc44c5e() {
        return m107656xc38409ac(false, -1L);
    }

    /* renamed from: yieldIfContendedSafely */
    public boolean m107736xd60e17d8() {
        return m107656xc38409ac(true, -1L);
    }

    /* renamed from: beginTransaction */
    private void m107616xb2c12e75(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener, boolean z17) {
        m107403x3e28f15();
        try {
            m107686x3b27c976().m107850xb2c12e75(z17 ? 2 : 1, sQLiteTransactionListener, m107685x1472aee8(false), null);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: openDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107635xfef9b1e5(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, int i17, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d, int i18) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7(str, i17, cursorFactory, interfaceC26879x4f347d5d);
        c26948xabb259c7.m107630x34264a(bArr, c26940xf23b9b2, i18);
        return c26948xabb259c7;
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107638xa5e841c4(java.io.File file, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        return m107646xa5e841c4(file.getPath(), bArr, c26940xf23b9b2, cursorFactory, interfaceC26879x4f347d5d, 0);
    }

    /* renamed from: openOrCreateDatabaseInWalMode */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107650xbd2b395c(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, int i17) {
        return m107635xfef9b1e5(str, null, null, cursorFactory, 805306368, null, i17);
    }

    /* renamed from: execSQL */
    public void m107672xb158737d(java.lang.String str, java.lang.Object[] objArr) {
        m107623x20261e19(str, objArr, null);
    }

    @java.lang.Deprecated
    /* renamed from: markTableSyncable */
    public void m107701x67003a96(java.lang.String str, java.lang.String str2, java.lang.String str3) {
    }

    /* renamed from: query */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107707x66f18c8(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        return m107709xe8f38f7c(null, z17, str, strArr, str2, objArr, str3, str4, str5, str6, c26987xeef691ab);
    }

    /* renamed from: queryWithFactory */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107709xe8f38f7c(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        m107403x3e28f15();
        try {
            return m107713x46d43bc4(cursorFactory, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26967xf321bfff.m107818xc800dfab(z17, str, strArr, str2, str3, str4, str5, str6), objArr, m107624x9e9b9e2b(str), c26987xeef691ab);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: rawQuery */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107711x1d3f4980(java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        return m107713x46d43bc4(null, str, objArr, null, c26987xeef691ab);
    }

    /* renamed from: rawQueryWithFactory */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107713x46d43bc4(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, java.lang.String str, java.lang.Object[] objArr, java.lang.String str2, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        m107403x3e28f15();
        try {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26955x8866f2f3 c26955x8866f2f3 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26955x8866f2f3(this, str, str2, c26987xeef691ab);
            if (cursorFactory == null) {
                cursorFactory = this.f58237xd4d57167;
            }
            return c26955x8866f2f3.mo107612x66f18c8(cursorFactory, objArr);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: yieldIfContendedSafely */
    public boolean m107737xd60e17d8(long j17) {
        return m107656xc38409ac(true, j17);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107639xa5e841c4(java.io.File file, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d, int i17) {
        return m107646xa5e841c4(file.getPath(), bArr, c26940xf23b9b2, cursorFactory, interfaceC26879x4f347d5d, i17);
    }

    /* renamed from: openOrCreateDatabaseInWalMode */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107652xbd2b395c(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d, int i17) {
        return m107635xfef9b1e5(str, bArr, c26940xf23b9b2, cursorFactory, 805306368, interfaceC26879x4f347d5d, i17);
    }

    /* renamed from: execSQL */
    public void m107673xb158737d(java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        m107623x20261e19(str, objArr, c26987xeef691ab);
    }

    /* renamed from: query */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107704x66f18c8(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return m107706x66f18c8(false, str, strArr, str2, objArr, str3, str4, str5, null);
    }

    /* renamed from: openDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107634xfef9b1e5(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, int i17, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        return m107635xfef9b1e5(str, bArr, c26940xf23b9b2, cursorFactory, i17, interfaceC26879x4f347d5d, 0);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107640xa5e841c4(java.io.File file, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        return m107646xa5e841c4(file.getPath(), bArr, (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2) null, cursorFactory, interfaceC26879x4f347d5d, 0);
    }

    /* renamed from: openOrCreateDatabaseInWalMode */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107651xbd2b395c(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory) {
        return m107635xfef9b1e5(str, bArr, c26940xf23b9b2, cursorFactory, 805306368, null, 0);
    }

    /* renamed from: query */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107705x66f18c8(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.Object[] objArr, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return m107706x66f18c8(false, str, strArr, str2, objArr, str3, str4, str5, str6);
    }

    /* renamed from: openDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107632xfef9b1e5(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, int i17, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        return m107635xfef9b1e5(str, null, null, cursorFactory, i17, interfaceC26879x4f347d5d, 0);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107641xa5e841c4(java.io.File file, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d, int i17) {
        return m107646xa5e841c4(file.getPath(), bArr, (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2) null, cursorFactory, interfaceC26879x4f347d5d, i17);
    }

    /* renamed from: openDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107633xfef9b1e5(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, int i17, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d, int i18) {
        return m107635xfef9b1e5(str, null, null, cursorFactory, i17, interfaceC26879x4f347d5d, i18);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107643xa5e841c4(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, int i17) {
        return m107635xfef9b1e5(str, null, null, cursorFactory, 268435456, null, i17);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107642xa5e841c4(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory) {
        return m107635xfef9b1e5(str, null, null, cursorFactory, 268435456, null, 0);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107645xa5e841c4(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, boolean z17) {
        return m107635xfef9b1e5(str, null, null, cursorFactory, z17 ? 805306368 : 268435456, null, 0);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107646xa5e841c4(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d, int i17) {
        return m107635xfef9b1e5(str, bArr, c26940xf23b9b2, cursorFactory, 268435456, interfaceC26879x4f347d5d, i17);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107648xa5e841c4(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d, int i17) {
        return m107646xa5e841c4(str, bArr, (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2) null, cursorFactory, interfaceC26879x4f347d5d, i17);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107647xa5e841c4(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        return m107646xa5e841c4(str, bArr, (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2) null, cursorFactory, interfaceC26879x4f347d5d, 0);
    }

    /* renamed from: openOrCreateDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107644xa5e841c4(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        return m107632xfef9b1e5(str, cursorFactory, 268435456, interfaceC26879x4f347d5d);
    }
}
