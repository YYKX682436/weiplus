package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteSession */
/* loaded from: classes12.dex */
public final class C26969x2e1700ca {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f58335x7118e671 = false;

    /* renamed from: TRANSACTION_MODE_DEFERRED */
    public static final int f58336xcfdfb33a = 0;

    /* renamed from: TRANSACTION_MODE_EXCLUSIVE */
    public static final int f58337xe37b7e83 = 2;

    /* renamed from: TRANSACTION_MODE_IMMEDIATE */
    public static final int f58338xc1f87796 = 1;

    /* renamed from: mConnection */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a f58339xadf6772b;

    /* renamed from: mConnectionFlags */
    private int f58340xf9e94a1c;

    /* renamed from: mConnectionPool */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 f58341x5266f5e7;

    /* renamed from: mConnectionUseCount */
    private int f58342x7c7813;

    /* renamed from: mTransactionPool */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction f58343x1af46fed;

    /* renamed from: mTransactionStack */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction f58344x43c5e4d7;

    /* renamed from: com.tencent.wcdb.database.SQLiteSession$Transaction */
    /* loaded from: classes12.dex */
    public static final class Transaction {

        /* renamed from: mChildFailed */
        public boolean f58345x464f41cc;

        /* renamed from: mListener */
        public android.database.sqlite.SQLiteTransactionListener f58346x753a6c41;

        /* renamed from: mMarkedSuccessful */
        public boolean f58347x619e73;

        /* renamed from: mMode */
        public int f58348x624afb0;

        /* renamed from: mParent */
        public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction f58349x14172f77;

        private Transaction() {
        }
    }

    public C26969x2e1700ca(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 c26943x5700cb66) {
        if (c26943x5700cb66 == null) {
            throw new java.lang.IllegalArgumentException("connectionPool must not be null");
        }
        this.f58341x5266f5e7 = c26943x5700cb66;
    }

    /* renamed from: acquireConnection */
    private void m107837xf7a72854(java.lang.String str, int i17, boolean z17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (this.f58339xadf6772b == null) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107582xf7a72854 = this.f58341x5266f5e7.m107582xf7a72854(str, i17, c26987xeef691ab);
            this.f58339xadf6772b = m107582xf7a72854;
            this.f58340xf9e94a1c = i17;
            m107582xf7a72854.m107500xf022f186(true, z17);
        }
        this.f58342x7c7813++;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: beginTransactionUnchecked */
    private void m107838xb7fc37f9(int i17, android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener, int i18, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108011xf4ed245c();
        }
        if (this.f58344x43c5e4d7 == null) {
            m107837xf7a72854(null, i18, true, c26987xeef691ab);
        }
        try {
            if (this.f58344x43c5e4d7 == null) {
                if (i17 == 1) {
                    this.f58339xadf6772b.m107486xb158f775("BEGIN IMMEDIATE;", null, c26987xeef691ab);
                } else if (i17 != 2) {
                    this.f58339xadf6772b.m107486xb158f775("BEGIN;", null, c26987xeef691ab);
                } else {
                    this.f58339xadf6772b.m107486xb158f775("BEGIN EXCLUSIVE;", null, c26987xeef691ab);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.onBegin();
                } catch (java.lang.RuntimeException e17) {
                    if (this.f58344x43c5e4d7 == null) {
                        this.f58339xadf6772b.m107486xb158f775("ROLLBACK;", null, c26987xeef691ab);
                    }
                    throw e17;
                }
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction m107841xa510f0f9 = m107841xa510f0f9(i17, sQLiteTransactionListener);
            m107841xa510f0f9.f58349x14172f77 = this.f58344x43c5e4d7;
            this.f58344x43c5e4d7 = m107841xa510f0f9;
        } catch (java.lang.Throwable th6) {
            if (this.f58344x43c5e4d7 == null) {
                m107843xca866645();
            }
            throw th6;
        }
    }

    /* renamed from: endTransactionUnchecked */
    private void m107839x3f213b2b(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, boolean z17) {
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108011xf4ed245c();
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction transaction = this.f58344x43c5e4d7;
        boolean z18 = false;
        boolean z19 = (transaction.f58347x619e73 || z17) && !transaction.f58345x464f41cc;
        android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener = transaction.f58346x753a6c41;
        if (sQLiteTransactionListener != null) {
            try {
                if (z19) {
                    sQLiteTransactionListener.onCommit();
                } else {
                    sQLiteTransactionListener.onRollback();
                }
            } catch (java.lang.RuntimeException e17) {
                e = e17;
            }
        }
        z18 = z19;
        e = null;
        this.f58344x43c5e4d7 = transaction.f58349x14172f77;
        m107842xf445be4b(transaction);
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction transaction2 = this.f58344x43c5e4d7;
        if (transaction2 == null) {
            try {
                if (z18) {
                    this.f58339xadf6772b.m107486xb158f775("COMMIT;", null, c26987xeef691ab);
                } else {
                    this.f58339xadf6772b.m107486xb158f775("ROLLBACK;", null, c26987xeef691ab);
                }
            } finally {
                m107843xca866645();
            }
        } else if (!z18) {
            transaction2.f58345x464f41cc = true;
        }
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: executeSpecial */
    private boolean m107840x435e8384(java.lang.String str, java.lang.Object[] objArr, int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108011xf4ed245c();
        }
        int m106264x37a81591 = com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106264x37a81591(str);
        if (m106264x37a81591 == 4) {
            m107850xb2c12e75(2, null, i17, c26987xeef691ab);
            return true;
        }
        if (m106264x37a81591 == 5) {
            m107864x576b60d6();
            m107851x7d3c6b03(c26987xeef691ab);
            return true;
        }
        if (m106264x37a81591 != 6) {
            return false;
        }
        m107851x7d3c6b03(c26987xeef691ab);
        return true;
    }

    /* renamed from: obtainTransaction */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction m107841xa510f0f9(int i17, android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction transaction = this.f58343x1af46fed;
        if (transaction != null) {
            this.f58343x1af46fed = transaction.f58349x14172f77;
            transaction.f58349x14172f77 = null;
            transaction.f58347x619e73 = false;
            transaction.f58345x464f41cc = false;
        } else {
            transaction = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction();
        }
        transaction.f58348x624afb0 = i17;
        transaction.f58346x753a6c41 = sQLiteTransactionListener;
        return transaction;
    }

    /* renamed from: recycleTransaction */
    private void m107842xf445be4b(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction transaction) {
        transaction.f58349x14172f77 = this.f58343x1af46fed;
        transaction.f58346x753a6c41 = null;
        this.f58343x1af46fed = transaction;
    }

    /* renamed from: releaseConnection */
    private void m107843xca866645() {
        int i17 = this.f58342x7c7813 - 1;
        this.f58342x7c7813 = i17;
        if (i17 == 0) {
            try {
                this.f58339xadf6772b.m107500xf022f186(false, false);
                this.f58341x5266f5e7.m107594xca866645(this.f58339xadf6772b);
            } finally {
                this.f58339xadf6772b = null;
            }
        }
    }

    /* renamed from: throwIfNestedTransaction */
    private void m107844x9d2a1504() {
        if (m107859x9b559ded()) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because a nested transaction is in progress.");
        }
    }

    /* renamed from: throwIfNoTransaction */
    private void m107845x62e5bc7a() {
        if (this.f58344x43c5e4d7 == null) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    /* renamed from: throwIfTransactionMarkedSuccessful */
    private void m107846x9cc0ba41() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction transaction = this.f58344x43c5e4d7;
        if (transaction != null && transaction.f58347x619e73) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    /* renamed from: yieldTransactionUnchecked */
    private boolean m107847x98dc4dd(long j17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108011xf4ed245c();
        }
        if (!this.f58341x5266f5e7.m107598x96759418(this.f58339xadf6772b, this.f58340xf9e94a1c)) {
            return false;
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction transaction = this.f58344x43c5e4d7;
        int i17 = transaction.f58348x624afb0;
        android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener = transaction.f58346x753a6c41;
        int i18 = this.f58340xf9e94a1c;
        m107839x3f213b2b(c26987xeef691ab, true);
        if (j17 > 0) {
            try {
                java.lang.Thread.sleep(j17);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        m107838xb7fc37f9(i17, sQLiteTransactionListener, i18, c26987xeef691ab);
        return true;
    }

    /* renamed from: acquireConnectionForNativeHandle */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107848xf0ab5594(int i17) {
        m107837xf7a72854(null, i17, true, null);
        return this.f58339xadf6772b;
    }

    /* renamed from: acquirePreparedStatement */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement m107849x54fc0f7c(java.lang.String str, int i17, boolean z17) {
        m107837xf7a72854(str, i17, z17, null);
        return this.f58339xadf6772b.m107477x54fc0f7c(str);
    }

    /* renamed from: beginTransaction */
    public void m107850xb2c12e75(int i17, android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener, int i18, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        m107846x9cc0ba41();
        m107838xb7fc37f9(i17, sQLiteTransactionListener, i18, c26987xeef691ab);
    }

    /* renamed from: endTransaction */
    public void m107851x7d3c6b03(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        m107845x62e5bc7a();
        m107839x3f213b2b(c26987xeef691ab, false);
    }

    /* renamed from: execute */
    public void m107852xb158f775(java.lang.String str, java.lang.Object[] objArr, int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (m107840x435e8384(str, objArr, i17, c26987xeef691ab)) {
            return;
        }
        m107837xf7a72854(str, i17, false, c26987xeef691ab);
        try {
            this.f58339xadf6772b.m107486xb158f775(str, objArr, c26987xeef691ab);
        } finally {
            m107843xca866645();
        }
    }

    /* renamed from: executeForChangedRowCount */
    public int m107853xc82b1275(java.lang.String str, java.lang.Object[] objArr, int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (m107840x435e8384(str, objArr, i17, c26987xeef691ab)) {
            return 0;
        }
        m107837xf7a72854(str, i17, false, c26987xeef691ab);
        try {
            return this.f58339xadf6772b.m107487xc82b1275(str, objArr, c26987xeef691ab);
        } finally {
            m107843xca866645();
        }
    }

    /* renamed from: executeForCursorWindow */
    public int m107854xa6f6c61a(java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706, int i17, int i18, boolean z17, int i19, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (c26876xa70fd706 == null) {
            throw new java.lang.IllegalArgumentException("window must not be null.");
        }
        if (m107840x435e8384(str, objArr, i19, c26987xeef691ab)) {
            c26876xa70fd706.m106193x5a5b64d();
            return 0;
        }
        m107837xf7a72854(str, i19, false, c26987xeef691ab);
        try {
            return this.f58339xadf6772b.m107488xa6f6c61a(str, objArr, c26876xa70fd706, i17, i18, z17, c26987xeef691ab);
        } finally {
            m107843xca866645();
        }
    }

    /* renamed from: executeForLastInsertedRowId */
    public long m107855x5515ccb3(java.lang.String str, java.lang.Object[] objArr, int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (m107840x435e8384(str, objArr, i17, c26987xeef691ab)) {
            return 0L;
        }
        m107837xf7a72854(str, i17, false, c26987xeef691ab);
        try {
            return this.f58339xadf6772b.m107489x5515ccb3(str, objArr, c26987xeef691ab);
        } finally {
            m107843xca866645();
        }
    }

    /* renamed from: executeForLong */
    public long m107856x92a57db0(java.lang.String str, java.lang.Object[] objArr, int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (m107840x435e8384(str, objArr, i17, c26987xeef691ab)) {
            return 0L;
        }
        m107837xf7a72854(str, i17, false, c26987xeef691ab);
        try {
            return this.f58339xadf6772b.m107490x92a57db0(str, objArr, c26987xeef691ab);
        } finally {
            m107843xca866645();
        }
    }

    /* renamed from: executeForString */
    public java.lang.String m107857x8b771a45(java.lang.String str, java.lang.Object[] objArr, int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (m107840x435e8384(str, objArr, i17, c26987xeef691ab)) {
            return null;
        }
        m107837xf7a72854(str, i17, false, c26987xeef691ab);
        try {
            return this.f58339xadf6772b.m107491x8b771a45(str, objArr, c26987xeef691ab);
        } finally {
            m107843xca866645();
        }
    }

    /* renamed from: hasConnection */
    public boolean m107858xfadcf518() {
        return this.f58339xadf6772b != null;
    }

    /* renamed from: hasNestedTransaction */
    public boolean m107859x9b559ded() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction transaction = this.f58344x43c5e4d7;
        return (transaction == null || transaction.f58349x14172f77 == null) ? false : true;
    }

    /* renamed from: hasTransaction */
    public boolean m107860x799723e4() {
        return this.f58344x43c5e4d7 != null;
    }

    /* renamed from: prepare */
    public void m107861xed060d07(java.lang.String str, int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26971x736db9f1 c26971x736db9f1) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108011xf4ed245c();
        }
        m107837xf7a72854(str, i17, false, c26987xeef691ab);
        try {
            this.f58339xadf6772b.m107497xed060d07(str, c26971x736db9f1);
        } finally {
            m107843xca866645();
        }
    }

    /* renamed from: releaseConnectionForNativeHandle */
    public void m107862x401c5783(java.lang.Exception exc) {
        try {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58339xadf6772b;
            if (c26942xf59ce42a != null) {
                c26942xf59ce42a.m107484x3134699a(exc);
            }
        } finally {
            m107843xca866645();
        }
    }

    /* renamed from: releasePreparedStatement */
    public void m107863xcbe9706b(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58339xadf6772b;
        if (c26942xf59ce42a != null) {
            c26942xf59ce42a.m107499xcbe9706b(preparedStatement);
            m107843xca866645();
        }
    }

    /* renamed from: setTransactionSuccessful */
    public void m107864x576b60d6() {
        m107845x62e5bc7a();
        m107846x9cc0ba41();
        this.f58344x43c5e4d7.f58347x619e73 = true;
    }

    /* renamed from: walCheckpoint */
    public android.util.Pair<java.lang.Integer, java.lang.Integer> m107865xf28d4a0a(java.lang.String str, int i17, int i18) {
        m107837xf7a72854(null, i18, false, null);
        try {
            return this.f58339xadf6772b.m107505xf28d4a0a(str, i17);
        } finally {
            m107843xca866645();
        }
    }

    /* renamed from: yieldTransaction */
    public boolean m107866x1926d111(long j17, boolean z17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (z17) {
            m107845x62e5bc7a();
            m107846x9cc0ba41();
            m107844x9d2a1504();
        } else {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca.Transaction transaction = this.f58344x43c5e4d7;
            if (transaction == null || transaction.f58347x619e73 || transaction.f58349x14172f77 != null) {
                return false;
            }
        }
        if (this.f58344x43c5e4d7.f58345x464f41cc) {
            return false;
        }
        return m107847x98dc4dd(j17, c26987xeef691ab);
    }
}
