package com.p314xaae8f345.p3121x37984a.p3124xaf3f3382;

/* renamed from: com.tencent.wcdb.compat.SQLiteDatabase */
/* loaded from: classes12.dex */
public final class C26914xabb259c7 {

    /* renamed from: CONFLICT_ABORT */
    public static final int f57978xc4bf0463 = 2;

    /* renamed from: CONFLICT_FAIL */
    public static final int f57979x65aff6b = 3;

    /* renamed from: CONFLICT_IGNORE */
    public static final int f57980xe10e42df = 4;

    /* renamed from: CONFLICT_NONE */
    public static final int f57981x65ed785 = 0;

    /* renamed from: CONFLICT_REPLACE */
    public static final int f57982x19830f27 = 5;

    /* renamed from: CONFLICT_ROLLBACK */
    public static final int f57983x210a30b1 = 1;

    /* renamed from: CONFLICT_VALUES */
    private static final java.lang.String[] f57984xf6e7e22f = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: kCipherVersionMapping */
    private static final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CipherVersion[] f57985x2ff84cc = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CipherVersion.m106715xcee59d22();

    /* renamed from: sDefaultErrorHandler */
    private static final com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.InterfaceC26911x4f347d5d f57986x88922990 = new com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.InterfaceC26911x4f347d5d() { // from class: com.tencent.wcdb.compat.SQLiteDatabase.3
        @Override // com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.InterfaceC26911x4f347d5d
        /* renamed from: onCorruption */
        public void mo106461x28043a1a(com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 c26914xabb259c7) {
            c26914xabb259c7.m106493xb22e551e().m106685xed1b8453();
        }
    };
    private final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b mDB;

    /* renamed from: mTransactionStack */
    private final java.lang.ThreadLocal<com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7.Transaction> f57987x43c5e4d7 = new java.lang.ThreadLocal<>();

    /* renamed from: com.tencent.wcdb.compat.SQLiteDatabase$Transaction */
    /* loaded from: classes12.dex */
    public static final class Transaction {

        /* renamed from: childFailed */
        boolean f57992x9c423079;

        /* renamed from: listener */
        android.database.sqlite.SQLiteTransactionListener f57993x503cc4b4;

        /* renamed from: markedSuccessful */
        boolean f57994xda49d3e6;

        /* renamed from: parent */
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7.Transaction f57995xc4ab08aa;

        private Transaction() {
        }
    }

    public C26914xabb259c7(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b) {
        this.mDB = c26918x6e83759b;
    }

    /* renamed from: openDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 m106474xfef9b1e5(java.lang.String str) {
        return m106477xfef9b1e5(str, null, null, null);
    }

    /* renamed from: releaseMemory */
    public static int m106478xb0f66fe8() {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.m106613x681f8cf6();
        return 0;
    }

    /* renamed from: throwIfNoTransaction */
    private static void m106479x62e5bc7a(com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7.Transaction transaction) {
        if (transaction == null) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    /* renamed from: throwIfTransactionMarkedSuccessful */
    private static void m106480x9cc0ba41(com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7.Transaction transaction) {
        if (transaction != null && transaction.f57994xda49d3e6) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    /* renamed from: wrap */
    public static com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 m106481x37d04a(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b) {
        return new com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7(c26918x6e83759b);
    }

    /* renamed from: beginTransaction */
    public void m106482xb2c12e75() {
        m106484x16a62eaf(null);
    }

    /* renamed from: beginTransactionNonExclusive */
    public void m106483xe1208566() {
        m106484x16a62eaf(null);
    }

    /* renamed from: beginTransactionWithListener */
    public void m106484x16a62eaf(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7.Transaction transaction = this.f57987x43c5e4d7.get();
        m106480x9cc0ba41(transaction);
        if (transaction == null) {
            this.mDB.m106853xb2c12e75();
        }
        if (sQLiteTransactionListener != null) {
            try {
                sQLiteTransactionListener.onBegin();
            } catch (java.lang.RuntimeException e17) {
                if (transaction == null) {
                    this.mDB.m106960x5452055a();
                }
                throw e17;
            }
        }
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7.Transaction transaction2 = new com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7.Transaction();
        transaction2.f57993x503cc4b4 = sQLiteTransactionListener;
        transaction2.f57995xc4ab08aa = transaction;
        this.f57987x43c5e4d7.set(transaction2);
    }

    /* renamed from: beginTransactionWithListenerNonExclusive */
    public void m106485x9f34fea0(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        m106484x16a62eaf(sQLiteTransactionListener);
    }

    /* renamed from: close */
    public void m106486x5a5ddf8() {
        this.mDB.m106656x5a5ddf8();
    }

    /* renamed from: compileStatement */
    public com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 m106487xac8b87c(java.lang.String str) {
        return new com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3(this.mDB, str, null);
    }

    /* renamed from: delete */
    public int m106488xb06685ab(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        java.lang.String str3;
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DELETE FROM ");
        sb6.append(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " WHERE " + str2;
        }
        sb6.append(str3);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = this.mDB.mo106671x1c19911e(true);
        try {
            try {
                c26923xdf786992 = mo106671x1c19911e.m106781x1b7421d3(sb7);
                if (strArr != null) {
                    int i17 = 0;
                    while (i17 < strArr.length) {
                        try {
                            java.lang.String str4 = strArr[i17];
                            i17++;
                            c26923xdf786992.m107047x37ff770a(str4, i17);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            if (c26923xdf786992 != null) {
                                c26923xdf786992.m107051xf2172ef1();
                            }
                            throw th;
                        }
                    }
                }
                do {
                    c26923xdf786992.m107085x3606cc();
                } while (!c26923xdf786992.m107080xb9a1ffcc());
                int m106771x69d89e8d = mo106671x1c19911e.m106771x69d89e8d();
                c26923xdf786992.m107051xf2172ef1();
                mo106671x1c19911e.close();
                return m106771x69d89e8d;
            } catch (java.lang.Throwable th7) {
                th = th7;
                c26923xdf786992 = null;
            }
        } catch (java.lang.Throwable th8) {
            if (mo106671x1c19911e != null) {
                try {
                    mo106671x1c19911e.close();
                } catch (java.lang.Throwable th9) {
                    th8.addSuppressed(th9);
                }
            }
            throw th8;
        }
    }

    /* renamed from: endTransaction */
    public void m106489x7d3c6b03() {
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7.Transaction transaction = this.f57987x43c5e4d7.get();
        m106479x62e5bc7a(transaction);
        boolean z17 = false;
        boolean z18 = transaction.f57994xda49d3e6 && !transaction.f57992x9c423079;
        android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener = transaction.f57993x503cc4b4;
        if (sQLiteTransactionListener != null) {
            try {
                if (z18) {
                    sQLiteTransactionListener.onCommit();
                } else {
                    sQLiteTransactionListener.onRollback();
                }
            } catch (java.lang.RuntimeException e17) {
                e = e17;
            }
        }
        z17 = z18;
        e = null;
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7.Transaction transaction2 = transaction.f57995xc4ab08aa;
        this.f57987x43c5e4d7.set(transaction2);
        if (transaction2 != null) {
            if (!z17) {
                transaction2.f57992x9c423079 = true;
            }
        } else if (z17) {
            this.mDB.m106854xa1123927();
        } else {
            this.mDB.m106960x5452055a();
        }
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: execSQL */
    public void m106492xb158737d(java.lang.String str) {
        m106490xb158737d(str, null);
    }

    /* renamed from: getInnerDB */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b m106493xb22e551e() {
        return this.mDB;
    }

    /* renamed from: getMaximumSize */
    public long m106494x3e4f410b() {
        return this.mDB.m106951x65615989("PRAGMA max_page_count").m106361xfb822ef2() * m106495xaf1414a6();
    }

    /* renamed from: getPageSize */
    public long m106495xaf1414a6() {
        return this.mDB.m106951x65615989("PRAGMA page_size").m106361xfb822ef2();
    }

    /* renamed from: getPath */
    public java.lang.String m106496xfb83cc9b() {
        return this.mDB.m106673xfb83cc9b();
    }

    /* renamed from: getVersion */
    public int m106497x52c258a2() {
        return this.mDB.m106951x65615989("PRAGMA user_version").m106360xb58848b9();
    }

    /* renamed from: inTransaction */
    public boolean m106498x51d3479() {
        return this.mDB.m106959x865c8b6f();
    }

    /* renamed from: insert */
    public long m106499xb970c2b9(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return m106501x3462f350(str, str2, contentValues, 0);
        } catch (com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 unused) {
            return -1L;
        }
    }

    /* renamed from: insertOrThrow */
    public long m106500x98afe1ca(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return m106501x3462f350(str, str2, contentValues, 0);
    }

    /* renamed from: insertWithOnConflict */
    public long m106501x3462f350(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues, int i17) {
        java.lang.String[] strArr;
        java.lang.Object[] objArr;
        int i18 = 0;
        int size = (contentValues == null || contentValues.size() <= 0) ? 0 : contentValues.size();
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = null;
        if (size > 0) {
            objArr = new java.lang.Object[size];
            strArr = new java.lang.String[size];
            int i19 = 0;
            for (java.lang.String str3 : contentValues.keySet()) {
                strArr[i19] = str3;
                objArr[i19] = contentValues.get(str3);
                i19++;
            }
        } else {
            strArr = new java.lang.String[]{str2};
            objArr = new java.lang.Object[]{null};
        }
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8 m108723x399198b9 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27042xb53080e8().m108723x399198b9(str);
        if (i17 == 1) {
            m108723x399198b9.m108728xe6b0dde7();
        } else if (i17 == 2) {
            m108723x399198b9.m108724xb61e5b0d();
        } else if (i17 == 3) {
            m108723x399198b9.m108725xc3d1afa1();
        } else if (i17 == 4) {
            m108723x399198b9.m108726x1b99c195();
        } else if (i17 == 5) {
            m108723x399198b9.m108727x30676751();
        }
        m108723x399198b9.m108721x389b97dd(strArr).m108732x4175192f(objArr.length);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = this.mDB.mo106671x1c19911e(true);
        try {
            try {
                c26923xdf786992 = mo106671x1c19911e.m106780x1b7421d3(m108723x399198b9);
                while (i18 < objArr.length) {
                    com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 c26901x4e9a151 = new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(objArr[i18]);
                    i18++;
                    c26923xdf786992.m107048xc8099b34(c26901x4e9a151, i18);
                }
                do {
                    c26923xdf786992.m107085x3606cc();
                } while (!c26923xdf786992.m107080xb9a1ffcc());
                long m106773xc54eb6b1 = mo106671x1c19911e.m106773xc54eb6b1();
                c26923xdf786992.m107051xf2172ef1();
                mo106671x1c19911e.close();
                return m106773xc54eb6b1;
            } catch (java.lang.Throwable th6) {
                if (c26923xdf786992 != null) {
                    c26923xdf786992.m107051xf2172ef1();
                }
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            if (mo106671x1c19911e != null) {
                try {
                    mo106671x1c19911e.close();
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                }
            }
            throw th7;
        }
    }

    /* renamed from: isOpen */
    public boolean m106502xb9a70294() {
        return this.mDB.m106680xebf0ba33();
    }

    /* renamed from: query */
    public android.database.Cursor m106505x66f18c8(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return m106506x66f18c8(z17, str, strArr, str2, strArr2, str3, str4, str5, str6, null);
    }

    /* renamed from: rawQuery */
    public android.database.Cursor m106507x1d3f4980(java.lang.String str, java.lang.Object[] objArr) {
        return m106508x1d3f4980(str, objArr, null);
    }

    /* renamed from: replace */
    public long m106509x413cb2b4(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return m106501x3462f350(str, str2, contentValues, 5);
        } catch (android.database.SQLException unused) {
            return -1L;
        }
    }

    /* renamed from: replaceOrThrow */
    public long m106510xd930116f(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return m106501x3462f350(str, str2, contentValues, 5);
    }

    /* renamed from: setMaximumSize */
    public long m106511xd4b4b47f(long j17) {
        long m106495xaf1414a6 = m106495xaf1414a6();
        long j18 = j17 / m106495xaf1414a6;
        if (j17 % m106495xaf1414a6 != 0) {
            j18++;
        }
        return this.mDB.m106951x65615989("PRAGMA max_page_count = " + j18).m106361xfb822ef2() * m106495xaf1414a6;
    }

    /* renamed from: setPageSize */
    public void m106512xa9cc75b2(long j17) {
        this.mDB.m106862xb158f775("PRAGMA page_size = " + j17);
    }

    /* renamed from: setTransactionSuccessful */
    public void m106513x576b60d6() {
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7.Transaction transaction = this.f57987x43c5e4d7.get();
        m106479x62e5bc7a(transaction);
        m106480x9cc0ba41(transaction);
        transaction.f57994xda49d3e6 = true;
    }

    /* renamed from: setVersion */
    public void m106514xc633a616(int i17) {
        this.mDB.m106862xb158f775("PRAGMA user_version = " + i17);
    }

    /* renamed from: toString */
    public java.lang.String m106515x9616526c() {
        return "SQLiteDatabase: " + m106496xfb83cc9b();
    }

    /* renamed from: update */
    public int m106516xce0038c9(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        return m106517x63628d60(str, contentValues, str2, strArr, 0);
    }

    /* renamed from: updateWithOnConflict */
    public int m106517x63628d60(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(120);
        sb6.append("UPDATE ");
        sb6.append(f57984xf6e7e22f[i17]);
        sb6.append(str);
        sb6.append(" SET ");
        int size = contentValues.size();
        int length = strArr == null ? size : strArr.length + size;
        java.lang.Object[] objArr = new java.lang.Object[length];
        int i18 = 0;
        int i19 = 0;
        for (java.lang.String str3 : contentValues.keySet()) {
            sb6.append(i19 > 0 ? "," : "");
            sb6.append(str3);
            objArr[i19] = contentValues.get(str3);
            sb6.append("=?");
            i19++;
        }
        if (strArr != null) {
            for (int i27 = size; i27 < length; i27++) {
                objArr[i27] = strArr[i27 - size];
            }
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            sb6.append(" WHERE ");
            sb6.append(str2);
        }
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = this.mDB.mo106671x1c19911e(true);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = null;
        try {
            try {
                c26923xdf786992 = mo106671x1c19911e.m106781x1b7421d3(sb6.toString());
                while (i18 < length) {
                    com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 c26901x4e9a151 = new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(objArr[i18]);
                    i18++;
                    c26923xdf786992.m107048xc8099b34(c26901x4e9a151, i18);
                }
                do {
                    c26923xdf786992.m107085x3606cc();
                } while (!c26923xdf786992.m107080xb9a1ffcc());
                int m106771x69d89e8d = mo106671x1c19911e.m106771x69d89e8d();
                c26923xdf786992.m107051xf2172ef1();
                mo106671x1c19911e.close();
                return m106771x69d89e8d;
            } catch (java.lang.Throwable th6) {
                if (c26923xdf786992 != null) {
                    c26923xdf786992.m107051xf2172ef1();
                }
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            if (mo106671x1c19911e != null) {
                try {
                    mo106671x1c19911e.close();
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                }
            }
            throw th7;
        }
    }

    /* renamed from: openDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 m106475xfef9b1e5(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.InterfaceC26911x4f347d5d interfaceC26911x4f347d5d) {
        return m106477xfef9b1e5(str, null, null, interfaceC26911x4f347d5d);
    }

    /* renamed from: execSQL */
    public int m106490xb158737d(java.lang.String str, java.lang.Object[] objArr) {
        return m106491xb158737d(str, objArr, null);
    }

    /* renamed from: query */
    public android.database.Cursor m106506x66f18c8(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.os.CancellationSignal cancellationSignal) {
        return m106508x1d3f4980(android.database.sqlite.SQLiteQueryBuilder.buildQueryString(z17, str, strArr, str2, str3, str4, str5, str6), strArr2, cancellationSignal);
    }

    /* renamed from: rawQuery */
    public android.database.Cursor m106508x1d3f4980(java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992;
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = this.mDB.mo106671x1c19911e(false);
            try {
                com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26912xdfc0f3d6.m106462x76fd00a8(mo106671x1c19911e, cancellationSignal);
                try {
                    c26923xdf786992 = mo106671x1c19911e.m106781x1b7421d3(str);
                    if (objArr != null) {
                        try {
                            int length = objArr.length;
                            int i17 = 0;
                            while (i17 < length) {
                                com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 c26901x4e9a151 = new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(objArr[i17]);
                                i17++;
                                c26923xdf786992.m107048xc8099b34(c26901x4e9a151, i17);
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            if (c26923xdf786992 != null) {
                                c26923xdf786992.m107051xf2172ef1();
                            }
                            throw th;
                        }
                    }
                    int m107057xa6887a23 = c26923xdf786992.m107057xa6887a23();
                    java.lang.String[] strArr = new java.lang.String[m107057xa6887a23];
                    for (int i18 = 0; i18 < m107057xa6887a23; i18++) {
                        strArr[i18] = c26923xdf786992.m107058x70bedef7(i18);
                    }
                    com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26916xf340a007 c26916xf340a007 = new com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26916xf340a007(c26923xdf786992.m107065xb77bf7fc(), strArr);
                    c26923xdf786992.m107051xf2172ef1();
                    mo106671x1c19911e.close();
                    return c26916xf340a007;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    c26923xdf786992 = null;
                }
            } finally {
            }
        } catch (com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26904xe509cf16 e17) {
            throw ((android.os.OperationCanceledException) new android.os.OperationCanceledException().initCause(e17));
        }
    }

    /* renamed from: openDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 m106476xfef9b1e5(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2 c26913xf23b9b2) {
        return m106477xfef9b1e5(str, bArr, c26913xf23b9b2, null);
    }

    /* renamed from: execSQL */
    public int m106491xb158737d(java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = new com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3(this.mDB, str, objArr);
        try {
            int m106531xb158f775 = c26915x63d6eaa3.m106531xb158f775(cancellationSignal);
            c26915x63d6eaa3.close();
            return m106531xb158f775;
        } catch (java.lang.Throwable th6) {
            try {
                c26915x63d6eaa3.close();
            } catch (java.lang.Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    /* renamed from: openDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 m106477xfef9b1e5(java.lang.String str, byte[] bArr, final com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2 c26913xf23b9b2, com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.InterfaceC26911x4f347d5d interfaceC26911x4f347d5d) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b(str);
        if (bArr != null) {
            if (c26913xf23b9b2 == null) {
                c26918x6e83759b.m106689x2989b212(bArr);
            } else {
                int i17 = c26913xf23b9b2.f57972xffdffc4d;
                if (i17 >= 0) {
                    c26918x6e83759b.m106691x2989b212(bArr, c26913xf23b9b2.f57977x3339d730, f57985x2ff84cc[i17]);
                } else {
                    c26918x6e83759b.m106690x2989b212(bArr, c26913xf23b9b2.f57977x3339d730);
                    c26918x6e83759b.m106695x78bda44("com.Tencent.WCDB.Config.CipherSpecCompat", new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Config() { // from class: com.tencent.wcdb.compat.SQLiteDatabase.1
                        @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Config
                        /* renamed from: onInvocation */
                        public void mo106518x2ebfd7cf(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48) {
                            c26919x80675a48.m106862xb158f775("PRAGMA cipher_use_hmac = " + com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2.this.f57974xdd78555a);
                            if (com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2.this.f57976xb6501330 != 0) {
                                c26919x80675a48.m106862xb158f775("PRAGMA kdf_iter = " + com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2.this.f57976xb6501330);
                            }
                            if (com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2.this.f57973x93cf5c48 != -1) {
                                c26919x80675a48.m106862xb158f775("PRAGMA cipher_hmac_algorithm = " + com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2.f57966x8bcb501a[com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2.this.f57973x93cf5c48]);
                            }
                            if (com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2.this.f57975x3abbd8c2 != -1) {
                                c26919x80675a48.m106862xb158f775("PRAGMA cipher_kdf_algorithm = " + com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2.f57971x4411a54a[com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26913xf23b9b2.this.f57975x3abbd8c2]);
                            }
                        }
                    }, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ConfigPriority.highest);
                }
            }
        }
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 c26914xabb259c7 = new com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7(c26918x6e83759b);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CorruptionNotification corruptionNotification = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CorruptionNotification(c26914xabb259c7) { // from class: com.tencent.wcdb.compat.SQLiteDatabase.2

            /* renamed from: mHandler */
            private final com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.InterfaceC26911x4f347d5d f57989xc7640a1d;

            /* renamed from: val$dbObj */
            final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 f57990x481b9056;

            {
                this.f57990x481b9056 = c26914xabb259c7;
                this.f57989xc7640a1d = com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.InterfaceC26911x4f347d5d.this == null ? com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7.f57986x88922990 : com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.InterfaceC26911x4f347d5d.this;
            }

            @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CorruptionNotification
            /* renamed from: onCorrupted */
            public void mo106519xb6f7e04d(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b2) {
                this.f57989xc7640a1d.mo106461x28043a1a(this.f57990x481b9056);
            }
        };
        c26918x6e83759b.m106698x2c87cbe5(corruptionNotification);
        if (!c26918x6e83759b.m106653x20c2b23a()) {
            corruptionNotification.mo106519xb6f7e04d(c26918x6e83759b);
            c26918x6e83759b.m106670x1c19911e().m106777x92d0313b();
        }
        return c26914xabb259c7;
    }

    /* renamed from: query */
    public android.database.Cursor m106503x66f18c8(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return m106505x66f18c8(false, str, strArr, str2, strArr2, str3, str4, str5, null);
    }

    /* renamed from: query */
    public android.database.Cursor m106504x66f18c8(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return m106505x66f18c8(false, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }
}
