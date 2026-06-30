package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteConnectionPool */
/* loaded from: classes12.dex */
public final class C26943x5700cb66 implements java.io.Closeable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f58152x7118e671 = false;

    /* renamed from: CONNECTION_FLAG_INTERACTIVE */
    public static final int f58153xf41645b0 = 4;

    /* renamed from: CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY */
    public static final int f58154xfc54e27a = 2;

    /* renamed from: CONNECTION_FLAG_READ_ONLY */
    public static final int f58155x582ad323 = 1;

    /* renamed from: CONNECTION_POOL_BUSY_MILLIS */
    private static final long f58156xbd9bbaea = 3000;

    /* renamed from: OPEN_FLAG_REOPEN_MASK */
    private static final int f58157xcad8abf0 = 268435473;
    private static final java.lang.String TAG = "WCDB.SQLiteConnectionPool";

    /* renamed from: mAvailablePrimaryConnection */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a f58160x608f8d04;

    /* renamed from: mChangeListener */
    private volatile com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26938x4a846bd0 f58161x45ea9651;

    /* renamed from: mCheckpointListener */
    private volatile com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8 f58162x2aa4d1a9;

    /* renamed from: mCipher */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 f58163xfe580cd8;

    /* renamed from: mConfiguration */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f f58164xce417d89;

    /* renamed from: mConnectionWaiterPool */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter f58166xfd4f79a9;

    /* renamed from: mConnectionWaiterQueue */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter f58167xacb06924;
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7> mDB;

    /* renamed from: mIsOpen */
    private boolean f58168x9132961;

    /* renamed from: mMaxConnectionPoolSize */
    private int f58170xe459b952;

    /* renamed from: mNextConnectionId */
    private int f58171xf6171db9;

    /* renamed from: mPassword */
    private byte[] f58172x6d876228;

    /* renamed from: mTraceCallback */
    private volatile com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 f58173x372d693d;

    /* renamed from: mLock */
    private final java.lang.Object f58169x6243b38 = new java.lang.Object();

    /* renamed from: mConnectionLeaked */
    private final java.util.concurrent.atomic.AtomicBoolean f58165x4d1a764d = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: mAvailableNonPrimaryConnections */
    private final java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a> f58159x93870c24 = new java.util.ArrayList<>();

    /* renamed from: mAcquiredConnections */
    private final java.util.WeakHashMap<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus> f58158xe4487c7a = new java.util.WeakHashMap<>();

    /* renamed from: com.tencent.wcdb.database.SQLiteConnectionPool$AcquiredConnectionStatus */
    /* loaded from: classes6.dex */
    public enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionPoolBusyInfo */
    /* loaded from: classes12.dex */
    public static class ConnectionPoolBusyInfo {

        /* renamed from: activeConnections */
        int f58181xeada066f;

        /* renamed from: activeOperationDescriptions */
        java.util.ArrayList<java.lang.String> f58182x824ad398;

        /* renamed from: activeSql */
        java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo<java.lang.String>> f58183xc3020e8;

        /* renamed from: activeTransactions */
        java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo<java.lang.StackTraceElement[]>> f58184x7240037b;

        /* renamed from: availableConnections */
        int f58185x40f412cc;

        /* renamed from: idleConnections */
        int f58186x883358e1;

        /* renamed from: label */
        java.lang.String f58187x61f7ef4;

        private ConnectionPoolBusyInfo() {
            this.f58182x824ad398 = new java.util.ArrayList<>();
            this.f58183xc3020e8 = new java.util.ArrayList<>();
            this.f58184x7240037b = new java.util.ArrayList<>();
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteConnectionPool$ConnectionWaiter */
    /* loaded from: classes12.dex */
    public static final class ConnectionWaiter {

        /* renamed from: mAssignedConnection */
        public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a f58188xbdf55a99;

        /* renamed from: mConnectionFlags */
        public int f58189xf9e94a1c;

        /* renamed from: mException */
        public java.lang.RuntimeException f58190xd3071a62;

        /* renamed from: mNext */
        public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter f58191x6250100;

        /* renamed from: mNonce */
        public int f58192xbe7f8382;

        /* renamed from: mPriority */
        public int f58193xdf862131;

        /* renamed from: mSql */
        public java.lang.String f58194x32d221;

        /* renamed from: mStartTime */
        public long f58195xfbccd462;

        /* renamed from: mThread */
        public java.lang.Thread f58196x1b4d34d7;

        /* renamed from: mWantPrimaryConnection */
        public boolean f58197xe87623e3;

        private ConnectionWaiter() {
        }
    }

    private C26943x5700cb66(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f, int i17) {
        this.mDB = new java.lang.ref.WeakReference<>(c26948xabb259c7);
        this.f58164xce417d89 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f(c26949xb6e0a66f);
        m107576x87f285e7(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelConnectionWaiterLocked */
    public void m107555xc5875ba4(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter connectionWaiter) {
        if (connectionWaiter.f58188xbdf55a99 == null && connectionWaiter.f58190xd3071a62 == null) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter connectionWaiter2 = null;
            for (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter connectionWaiter3 = this.f58167xacb06924; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.f58191x6250100) {
                connectionWaiter2 = connectionWaiter3;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.f58191x6250100 = connectionWaiter.f58191x6250100;
            } else {
                this.f58167xacb06924 = connectionWaiter.f58191x6250100;
            }
            connectionWaiter.f58190xd3071a62 = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f();
            java.util.concurrent.locks.LockSupport.unpark(connectionWaiter.f58196x1b4d34d7);
            m107581xbb87bdb9();
        }
    }

    /* renamed from: closeAvailableConnectionsAndLogExceptionsLocked */
    private void m107556x2502003f() {
        m107557x95b2618a();
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58160x608f8d04;
        if (c26942xf59ce42a != null) {
            m107558xe11ff0d1(c26942xf59ce42a);
            this.f58160x608f8d04 = null;
        }
    }

    /* renamed from: closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked */
    private void m107557x95b2618a() {
        int size = this.f58159x93870c24.size();
        for (int i17 = 0; i17 < size; i17++) {
            m107558xe11ff0d1(this.f58159x93870c24.get(i17));
        }
        this.f58159x93870c24.clear();
    }

    /* renamed from: closeConnectionAndLogExceptionsLocked */
    private void m107558xe11ff0d1(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a) {
        try {
            c26942xf59ce42a.m107478x5a5ddf8();
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Failed to close connection, its fate is now in the hands of the merciful GC: " + c26942xf59ce42a + e17.getMessage());
        }
    }

    /* renamed from: closeExcessConnectionsAndLogExceptionsLocked */
    private void m107559x84df39e3() {
        int size = this.f58159x93870c24.size();
        while (true) {
            int i17 = size - 1;
            if (size <= this.f58170xe459b952 - 1) {
                return;
            }
            m107558xe11ff0d1(this.f58159x93870c24.remove(i17));
            size = i17;
        }
    }

    /* renamed from: discardAcquiredConnectionsLocked */
    private void m107560x9321b913() {
        m107567x294dbdc4(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus.DISCARD);
    }

    /* renamed from: dispose */
    private void m107561x63a5261f(boolean z17) {
        if (z17) {
            return;
        }
        synchronized (this.f58169x6243b38) {
            m107577x841e45d9();
            this.f58168x9132961 = false;
            m107556x2502003f();
            int size = this.f58158xe4487c7a.size();
            if (size != 0) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.i(TAG, "The connection pool for " + this.f58164xce417d89.f58248x61f7ef4 + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
            }
            m107581xbb87bdb9();
        }
    }

    /* renamed from: finishAcquireConnectionLocked */
    private void m107562x55da8e6b(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a, int i17) {
        try {
            c26942xf59ce42a.m107501xa7cda809((i17 & 1) != 0);
            this.f58158xe4487c7a.put(c26942xf59ce42a, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus.NORMAL);
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Failed to prepare acquired connection for session, closing it: " + c26942xf59ce42a + ", connectionFlags=" + i17);
            m107558xe11ff0d1(c26942xf59ce42a);
            throw e17;
        }
    }

    /* renamed from: gatherConnectionPoolBusyInfoLocked */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionPoolBusyInfo m107563x130c1286() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionPoolBusyInfo connectionPoolBusyInfo = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionPoolBusyInfo();
        connectionPoolBusyInfo.f58181xeada066f = 0;
        connectionPoolBusyInfo.f58186x883358e1 = 0;
        if (!this.f58158xe4487c7a.isEmpty()) {
            for (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a : this.f58158xe4487c7a.keySet()) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo<java.lang.StackTraceElement[]> m107504x6bc27684 = c26942xf59ce42a.m107504x6bc27684();
                if (m107504x6bc27684 != null) {
                    connectionPoolBusyInfo.f58184x7240037b.add(m107504x6bc27684);
                }
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo<java.lang.String> m107503x16e416d9 = c26942xf59ce42a.m107503x16e416d9();
                if (m107503x16e416d9 != null) {
                    connectionPoolBusyInfo.f58183xc3020e8.add(m107503x16e416d9);
                    java.lang.String m107481x2be153df = c26942xf59ce42a.m107481x2be153df();
                    if (m107481x2be153df != null) {
                        connectionPoolBusyInfo.f58182x824ad398.add(m107481x2be153df);
                    }
                    connectionPoolBusyInfo.f58181xeada066f++;
                } else {
                    connectionPoolBusyInfo.f58186x883358e1++;
                }
            }
        }
        int size = this.f58159x93870c24.size();
        connectionPoolBusyInfo.f58185x40f412cc = size;
        if (this.f58160x608f8d04 != null) {
            connectionPoolBusyInfo.f58185x40f412cc = size + 1;
        }
        return connectionPoolBusyInfo;
    }

    /* renamed from: getPriority */
    private static int m107564x3662b71a(int i17) {
        return (i17 & 4) != 0 ? 1 : 0;
    }

    /* renamed from: isSessionBlockingImportantConnectionWaitersLocked */
    private boolean m107565x131c7fc(boolean z17, int i17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter connectionWaiter = this.f58167xacb06924;
        if (connectionWaiter == null) {
            return false;
        }
        int m107564x3662b71a = m107564x3662b71a(i17);
        while (m107564x3662b71a <= connectionWaiter.f58193xdf862131) {
            if (z17 || !connectionWaiter.f58197xe87623e3) {
                return true;
            }
            connectionWaiter = connectionWaiter.f58191x6250100;
            if (connectionWaiter == null) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: logConnectionPoolBusy */
    private void m107566x2670ab97(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionPoolBusyInfo connectionPoolBusyInfo, long j17, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (j17 != 0) {
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            sb6.append("The connection pool for database '");
            sb6.append(connectionPoolBusyInfo.f58187x61f7ef4);
            sb6.append("' has been unable to grant a connection to thread ");
            sb6.append(currentThread.getId());
            sb6.append(" (");
            sb6.append(currentThread.getName());
            sb6.append(") with flags 0x");
            sb6.append(java.lang.Integer.toHexString(i17));
            sb6.append(" for ");
            sb6.append(((float) j17) * 0.001f);
            sb6.append(" seconds.\n");
        }
        sb6.append("Connections: ");
        sb6.append(connectionPoolBusyInfo.f58181xeada066f);
        sb6.append(" active, ");
        sb6.append(connectionPoolBusyInfo.f58186x883358e1);
        sb6.append(" idle, ");
        sb6.append(connectionPoolBusyInfo.f58185x40f412cc);
        sb6.append(" available.\n");
        if (!connectionPoolBusyInfo.f58182x824ad398.isEmpty()) {
            sb6.append("\nRequests in progress:\n");
            java.util.Iterator<java.lang.String> it = connectionPoolBusyInfo.f58182x824ad398.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                sb6.append("  ");
                sb6.append(next);
                sb6.append("\n");
            }
        }
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w(TAG, sb6.toString());
    }

    /* renamed from: markAcquiredConnectionsLocked */
    private void m107567x294dbdc4(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus acquiredConnectionStatus) {
        if (this.f58158xe4487c7a.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f58158xe4487c7a.size());
        for (java.util.Map.Entry<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus> entry : this.f58158xe4487c7a.entrySet()) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus value = entry.getValue();
            if (acquiredConnectionStatus != value && value != com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus.DISCARD) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.f58158xe4487c7a.put((com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a) arrayList.get(i17), acquiredConnectionStatus);
        }
    }

    /* renamed from: obtainConnectionWaiterLocked */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter m107568xcfc58b8f(java.lang.Thread thread, long j17, int i17, boolean z17, java.lang.String str, int i18) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter connectionWaiter = this.f58166xfd4f79a9;
        if (connectionWaiter != null) {
            this.f58166xfd4f79a9 = connectionWaiter.f58191x6250100;
            connectionWaiter.f58191x6250100 = null;
        } else {
            connectionWaiter = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter();
        }
        connectionWaiter.f58196x1b4d34d7 = thread;
        connectionWaiter.f58195xfbccd462 = j17;
        connectionWaiter.f58193xdf862131 = i17;
        connectionWaiter.f58197xe87623e3 = z17;
        connectionWaiter.f58194x32d221 = str;
        connectionWaiter.f58189xf9e94a1c = i18;
        return connectionWaiter;
    }

    /* renamed from: open */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 m107569x34264a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2) {
        return m107570x34264a(c26948xabb259c7, c26949xb6e0a66f, bArr, c26940xf23b9b2, 1);
    }

    /* renamed from: openConnectionLocked */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107572x959715f2(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f, boolean z17) {
        int i17 = this.f58171xf6171db9;
        this.f58171xf6171db9 = i17 + 1;
        return com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.m107460x34264a(this, c26949xb6e0a66f, i17, z17, this.f58172x6d876228, this.f58163xfe580cd8);
    }

    /* renamed from: reconfigureAllConnectionsLocked */
    private void m107573xc5848fd1() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58160x608f8d04;
        if (c26942xf59ce42a != null) {
            try {
                c26942xf59ce42a.m107498x7ede9e13(this.f58164xce417d89);
            } catch (java.lang.RuntimeException e17) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Failed to reconfigure available primary connection, closing it: " + this.f58160x608f8d04, e17);
                m107558xe11ff0d1(this.f58160x608f8d04);
                this.f58160x608f8d04 = null;
            }
        }
        int size = this.f58159x93870c24.size();
        int i17 = 0;
        while (i17 < size) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a2 = this.f58159x93870c24.get(i17);
            try {
                c26942xf59ce42a2.m107498x7ede9e13(this.f58164xce417d89);
            } catch (java.lang.RuntimeException e18) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Failed to reconfigure available non-primary connection, closing it: " + c26942xf59ce42a2, e18);
                m107558xe11ff0d1(c26942xf59ce42a2);
                this.f58159x93870c24.remove(i17);
                size--;
                i17--;
            }
            i17++;
        }
        m107567x294dbdc4(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus.RECONFIGURE);
    }

    /* renamed from: recycleConnectionLocked */
    private boolean m107574xb646b03b(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus.RECONFIGURE) {
            try {
                c26942xf59ce42a.m107498x7ede9e13(this.f58164xce417d89);
            } catch (java.lang.RuntimeException e17) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Failed to reconfigure released connection, closing it: " + c26942xf59ce42a, e17);
                acquiredConnectionStatus = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        m107558xe11ff0d1(c26942xf59ce42a);
        return false;
    }

    /* renamed from: recycleConnectionWaiterLocked */
    private void m107575x706596fd(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter connectionWaiter) {
        connectionWaiter.f58191x6250100 = this.f58166xfd4f79a9;
        connectionWaiter.f58196x1b4d34d7 = null;
        connectionWaiter.f58194x32d221 = null;
        connectionWaiter.f58188xbdf55a99 = null;
        connectionWaiter.f58190xd3071a62 = null;
        connectionWaiter.f58192xbe7f8382++;
        this.f58166xfd4f79a9 = connectionWaiter;
    }

    /* renamed from: setMaxConnectionPoolSizeLocked */
    private void m107576x87f285e7(int i17) {
        if (i17 <= 0) {
            i17 = (this.f58164xce417d89.f58251x5ac7365d & com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965) != 0 ? 4 : 1;
        }
        this.f58170xe459b952 = i17;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.i(TAG, "Max connection pool size is %d.", java.lang.Integer.valueOf(i17));
    }

    /* renamed from: throwIfClosedLocked */
    private void m107577x841e45d9() {
        if (!this.f58168x9132961) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    /* renamed from: tryAcquireNonPrimaryConnectionLocked */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107578xe8c90318(java.lang.String str, int i17) {
        int size = this.f58159x93870c24.size();
        if (size > 1 && str != null) {
            for (int i18 = 0; i18 < size; i18++) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58159x93870c24.get(i18);
                if (c26942xf59ce42a.m107495xdc6a7695(str)) {
                    this.f58159x93870c24.remove(i18);
                    m107562x55da8e6b(c26942xf59ce42a, i17);
                    return c26942xf59ce42a;
                }
            }
        }
        if (size > 0) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a remove = this.f58159x93870c24.remove(size - 1);
            m107562x55da8e6b(remove, i17);
            return remove;
        }
        int size2 = this.f58158xe4487c7a.size();
        if (this.f58160x608f8d04 != null) {
            size2++;
        }
        if (size2 >= this.f58170xe459b952) {
            return null;
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107572x959715f2 = m107572x959715f2(this.f58164xce417d89, false);
        m107562x55da8e6b(m107572x959715f2, i17);
        return m107572x959715f2;
    }

    /* renamed from: tryAcquirePrimaryConnectionLocked */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107579xab6b488f(int i17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58160x608f8d04;
        if (c26942xf59ce42a != null) {
            this.f58160x608f8d04 = null;
            m107562x55da8e6b(c26942xf59ce42a, i17);
            return c26942xf59ce42a;
        }
        java.util.Iterator<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a> it = this.f58158xe4487c7a.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().m107496xcc523a76()) {
                return null;
            }
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107572x959715f2 = m107572x959715f2(this.f58164xce417d89, true);
        m107562x55da8e6b(m107572x959715f2, i17);
        return m107572x959715f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00be, code lost:
    
        if (r2 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
    
        r8 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c0, code lost:
    
        r6 = r7 - r1.f58195xfbccd462;
        m107566x2670ab97(r2, r6, r29);
        r14 = r27.mDB.get();
        r13 = r27.f58173x372d693d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d2, code lost:
    
        if (r14 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
    
        if (r13 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        r8 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        r13.mo8836x7591c572(r14, r28, r6, r21, r2.f58183xc3020e8, r2.f58184x7240037b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ed, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0114, code lost:
    
        r30.m108009x57c2e18f(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00eb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ec, code lost:
    
        r8 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0103  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.tencent.wcdb.support.CancellationSignal$OnCancelListener] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.tencent.wcdb.support.CancellationSignal$OnCancelListener] */
    /* JADX WARN: Type inference failed for: r2v8, types: [long] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.tencent.wcdb.support.CancellationSignal] */
    /* renamed from: waitForConnection */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107580x4f01a512(java.lang.String r28, int r29, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r30) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.m107580x4f01a512(java.lang.String, int, com.tencent.wcdb.support.CancellationSignal):com.tencent.wcdb.database.SQLiteConnection");
    }

    /* renamed from: wakeConnectionWaitersLocked */
    private void m107581xbb87bdb9() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter connectionWaiter = this.f58167xacb06924;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter connectionWaiter2 = null;
        boolean z17 = false;
        boolean z18 = false;
        while (connectionWaiter != null) {
            boolean z19 = true;
            if (this.f58168x9132961) {
                try {
                    if (connectionWaiter.f58197xe87623e3 || z17) {
                        c26942xf59ce42a = null;
                    } else {
                        c26942xf59ce42a = m107578xe8c90318(connectionWaiter.f58194x32d221, connectionWaiter.f58189xf9e94a1c);
                        if (c26942xf59ce42a == null) {
                            z17 = true;
                        }
                    }
                    if (c26942xf59ce42a == null && !z18 && (c26942xf59ce42a = m107579xab6b488f(connectionWaiter.f58189xf9e94a1c)) == null) {
                        z18 = true;
                    }
                    if (c26942xf59ce42a != null) {
                        connectionWaiter.f58188xbdf55a99 = c26942xf59ce42a;
                    } else if (z17 && z18) {
                        return;
                    } else {
                        z19 = false;
                    }
                } catch (java.lang.RuntimeException e17) {
                    connectionWaiter.f58190xd3071a62 = e17;
                }
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter connectionWaiter3 = connectionWaiter.f58191x6250100;
            if (z19) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.f58191x6250100 = connectionWaiter3;
                } else {
                    this.f58167xacb06924 = connectionWaiter3;
                }
                connectionWaiter.f58191x6250100 = null;
                java.util.concurrent.locks.LockSupport.unpark(connectionWaiter.f58196x1b4d34d7);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    /* renamed from: acquireConnection */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107582xf7a72854(java.lang.String str, int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107580x4f01a512 = m107580x4f01a512(str, i17, c26987xeef691ab);
        m107580x4f01a512.m107485xb5fee7a8();
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 interfaceC26973xda906c79 = this.f58173x372d693d;
        if (interfaceC26973xda906c79 != null) {
            long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.mDB.get();
            if (c26948xabb259c7 != null) {
                interfaceC26973xda906c79.mo8835x65fe6d41(c26948xabb259c7, str, uptimeMillis2, (i17 & 2) != 0);
            }
        }
        return m107580x4f01a512;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m107561x63a5261f(false);
    }

    /* renamed from: collectDbStats */
    public void m107583x55a55a37(java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.DbStats> arrayList) {
        synchronized (this.f58169x6243b38) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58160x608f8d04;
            if (c26942xf59ce42a != null) {
                c26942xf59ce42a.m107479x55a55a37(arrayList);
            }
            java.util.Iterator<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a> it = this.f58159x93870c24.iterator();
            while (it.hasNext()) {
                it.next().m107479x55a55a37(arrayList);
            }
            java.util.Iterator<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a> it6 = this.f58158xe4487c7a.keySet().iterator();
            while (it6.hasNext()) {
                it6.next().m107480xab805abd(arrayList);
            }
        }
    }

    /* renamed from: dump */
    public void m107584x2f39f4(android.util.Printer printer, boolean z17) {
        android.util.Printer m108047xaf65a0fc = com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26994xdba03508.m108047xaf65a0fc(printer, "    ");
        synchronized (this.f58169x6243b38) {
            printer.println("Connection pool for " + this.f58164xce417d89.f58252x346425 + ":");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("  Open: ");
            sb6.append(this.f58168x9132961);
            printer.println(sb6.toString());
            printer.println("  Max connections: " + this.f58170xe459b952);
            printer.println("  Available primary connection:");
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58160x608f8d04;
            if (c26942xf59ce42a != null) {
                c26942xf59ce42a.m107482x2f39f4(m108047xaf65a0fc, z17);
            } else {
                m108047xaf65a0fc.println("<none>");
            }
            printer.println("  Available non-primary connections:");
            int i17 = 0;
            if (this.f58159x93870c24.isEmpty()) {
                m108047xaf65a0fc.println("<none>");
            } else {
                int size = this.f58159x93870c24.size();
                for (int i18 = 0; i18 < size; i18++) {
                    this.f58159x93870c24.get(i18).m107482x2f39f4(m108047xaf65a0fc, z17);
                }
            }
            printer.println("  Acquired connections:");
            if (this.f58158xe4487c7a.isEmpty()) {
                m108047xaf65a0fc.println("<none>");
            } else {
                for (java.util.Map.Entry<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus> entry : this.f58158xe4487c7a.entrySet()) {
                    entry.getKey().m107482x2f39f4(m108047xaf65a0fc, z17);
                    m108047xaf65a0fc.println("  Status: " + entry.getValue());
                }
            }
            printer.println("  Connection waiters:");
            if (this.f58167xacb06924 != null) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter connectionWaiter = this.f58167xacb06924;
                while (connectionWaiter != null) {
                    m108047xaf65a0fc.println(i17 + ": waited for " + (uptimeMillis - connectionWaiter.f58195xfbccd462) + " ms - thread=" + connectionWaiter.f58196x1b4d34d7 + ", priority=" + connectionWaiter.f58193xdf862131 + ", sql='" + connectionWaiter.f58194x32d221 + "'");
                    connectionWaiter = connectionWaiter.f58191x6250100;
                    i17++;
                }
            } else {
                m108047xaf65a0fc.println("<none>");
            }
        }
    }

    /* renamed from: dumpJSON */
    public org.json.JSONObject m107585x817c04dc(boolean z17) {
        org.json.JSONObject put;
        synchronized (this.f58169x6243b38) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            org.json.JSONObject put2 = new org.json.JSONObject().put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f58164xce417d89.f58252x346425).put("open", this.f58168x9132961).put("maxConn", this.f58170xe459b952);
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a = this.f58160x608f8d04;
            put = put2.put("availablePrimary", (java.lang.Object) null).put("availableNonPrimary", jSONArray).put("acquired", jSONArray2).put("waiters", jSONArray3);
            java.util.Iterator<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a> it = this.f58159x93870c24.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m107483x817c04dc(z17));
            }
            for (java.util.Map.Entry<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus> entry : this.f58158xe4487c7a.entrySet()) {
                jSONArray2.put(entry.getKey().m107483x817c04dc(z17).put("status", entry.getValue().toString()));
            }
            for (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.ConnectionWaiter connectionWaiter = this.f58167xacb06924; connectionWaiter != null; connectionWaiter = connectionWaiter.f58191x6250100) {
                jSONArray3.put(new org.json.JSONObject().put("duration", android.os.SystemClock.uptimeMillis() - connectionWaiter.f58195xfbccd462).put("thread", connectionWaiter.f58196x1b4d34d7.toString()).put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4, connectionWaiter.f58193xdf862131).put("sql", connectionWaiter.f58194x32d221));
            }
        }
        return put;
    }

    /* renamed from: finalize */
    public void m107586xd764dc1e() {
        try {
            m107561x63a5261f(true);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: getChangeListener */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26938x4a846bd0 m107587x2dcf597a() {
        return this.f58161x45ea9651;
    }

    /* renamed from: getCheckpointListener */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8 m107588x3eb1d852() {
        return this.f58162x2aa4d1a9;
    }

    /* renamed from: getTraceCallback */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 m107589x997f1cf4() {
        return this.f58173x372d693d;
    }

    /* renamed from: notifyChanges */
    public void m107590x380a4f3a(java.lang.String str, java.lang.String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.mDB.get();
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26938x4a846bd0 interfaceC26938x4a846bd0 = this.f58161x45ea9651;
        if (interfaceC26938x4a846bd0 == null || c26948xabb259c7 == null) {
            return;
        }
        interfaceC26938x4a846bd0.m107396x3dcbea6f(c26948xabb259c7, str, str2, jArr, jArr2, jArr3);
    }

    /* renamed from: notifyCheckpoint */
    public void m107591xd8c801b1(java.lang.String str, int i17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.mDB.get();
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8 interfaceC26939xfb49cfa8 = this.f58162x2aa4d1a9;
        if (interfaceC26939xfb49cfa8 == null || c26948xabb259c7 == null) {
            return;
        }
        interfaceC26939xfb49cfa8.mo107375x7723e79a(c26948xabb259c7, str, i17);
    }

    /* renamed from: onConnectionLeaked */
    public void m107592xd9055fbf() {
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w(TAG, "A SQLiteConnection object for database '" + this.f58164xce417d89.f58248x61f7ef4 + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        this.f58165x4d1a764d.set(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        m107556x2502003f();
     */
    /* renamed from: reconfigure */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m107593x7ede9e13(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f r8) {
        /*
            r7 = this;
            if (r8 == 0) goto La4
            java.lang.Object r0 = r7.f58169x6243b38
            monitor-enter(r0)
            r7.m107577x841e45d9()     // Catch: java.lang.Throwable -> La1
            int r1 = r8.f58251x5ac7365d     // Catch: java.lang.Throwable -> La1
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r2 = r7.f58164xce417d89     // Catch: java.lang.Throwable -> La1
            int r2 = r2.f58251x5ac7365d     // Catch: java.lang.Throwable -> La1
            r1 = r1 ^ r2
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 == 0) goto L2f
            java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.SQLiteConnectionPool$AcquiredConnectionStatus> r4 = r7.f58158xe4487c7a     // Catch: java.lang.Throwable -> La1
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L27
            r7.m107557x95b2618a()     // Catch: java.lang.Throwable -> La1
            goto L2f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first."
            r8.<init>(r1)     // Catch: java.lang.Throwable -> La1
            throw r8     // Catch: java.lang.Throwable -> La1
        L2f:
            boolean r4 = r8.f58247x298db076     // Catch: java.lang.Throwable -> La1
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r5 = r7.f58164xce417d89     // Catch: java.lang.Throwable -> La1
            boolean r5 = r5.f58247x298db076     // Catch: java.lang.Throwable -> La1
            if (r4 == r5) goto L39
            r4 = r2
            goto L3a
        L39:
            r4 = r3
        L3a:
            if (r4 == 0) goto L4d
            java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.SQLiteConnectionPool$AcquiredConnectionStatus> r4 = r7.f58158xe4487c7a     // Catch: java.lang.Throwable -> La1
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L45
            goto L4d
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first."
            r8.<init>(r1)     // Catch: java.lang.Throwable -> La1
            throw r8     // Catch: java.lang.Throwable -> La1
        L4d:
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r4 = r7.f58164xce417d89     // Catch: java.lang.Throwable -> La1
            int r5 = r4.f58251x5ac7365d     // Catch: java.lang.Throwable -> La1
            int r6 = r8.f58251x5ac7365d     // Catch: java.lang.Throwable -> La1
            r5 = r5 ^ r6
            r6 = 268435473(0x10000011, float:2.52436E-29)
            r5 = r5 & r6
            if (r5 != 0) goto L80
            java.lang.String r4 = r4.f58256x16a71cee     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r8.f58256x16a71cee     // Catch: java.lang.Throwable -> La1
            boolean r4 = com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106268x9b9063de(r4, r5)     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L80
            java.util.LinkedHashSet<com.tencent.wcdb.extension.SQLiteExtension> r4 = r8.f58246x94266c14     // Catch: java.lang.Throwable -> La1
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r5 = r7.f58164xce417d89     // Catch: java.lang.Throwable -> La1
            java.util.LinkedHashSet<com.tencent.wcdb.extension.SQLiteExtension> r5 = r5.f58246x94266c14     // Catch: java.lang.Throwable -> La1
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> La1
            if (r4 != 0) goto L71
            goto L80
        L71:
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r1 = r7.f58164xce417d89     // Catch: java.lang.Throwable -> La1
            r1.m107740xe35db9dd(r8)     // Catch: java.lang.Throwable -> La1
            r7.m107576x87f285e7(r3)     // Catch: java.lang.Throwable -> La1
            r7.m107559x84df39e3()     // Catch: java.lang.Throwable -> La1
            r7.m107573xc5848fd1()     // Catch: java.lang.Throwable -> La1
            goto L9c
        L80:
            if (r1 == 0) goto L85
            r7.m107556x2502003f()     // Catch: java.lang.Throwable -> La1
        L85:
            com.tencent.wcdb.database.SQLiteConnection r1 = r7.m107572x959715f2(r8, r2)     // Catch: java.lang.Throwable -> La1
            r1.m107485xb5fee7a8()     // Catch: java.lang.Throwable -> La1
            r7.m107556x2502003f()     // Catch: java.lang.Throwable -> La1
            r7.m107560x9321b913()     // Catch: java.lang.Throwable -> La1
            r7.f58160x608f8d04 = r1     // Catch: java.lang.Throwable -> La1
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r1 = r7.f58164xce417d89     // Catch: java.lang.Throwable -> La1
            r1.m107740xe35db9dd(r8)     // Catch: java.lang.Throwable -> La1
            r7.m107576x87f285e7(r3)     // Catch: java.lang.Throwable -> La1
        L9c:
            r7.m107581xbb87bdb9()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            return
        La1:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            throw r8
        La4:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "configuration must not be null."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.m107593x7ede9e13(com.tencent.wcdb.database.SQLiteDatabaseConfiguration):void");
    }

    /* renamed from: releaseConnection */
    public void m107594xca866645(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a) {
        synchronized (this.f58169x6243b38) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66.AcquiredConnectionStatus remove = this.f58158xe4487c7a.remove(c26942xf59ce42a);
            if (remove == null) {
                throw new java.lang.IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            }
            if (!this.f58168x9132961) {
                m107558xe11ff0d1(c26942xf59ce42a);
            } else if (c26942xf59ce42a.m107496xcc523a76()) {
                if (m107574xb646b03b(c26942xf59ce42a, remove)) {
                    this.f58160x608f8d04 = c26942xf59ce42a;
                }
                m107581xbb87bdb9();
            } else if (this.f58159x93870c24.size() >= this.f58170xe459b952 - 1) {
                m107558xe11ff0d1(c26942xf59ce42a);
            } else {
                if (m107574xb646b03b(c26942xf59ce42a, remove)) {
                    this.f58159x93870c24.add(c26942xf59ce42a);
                }
                m107581xbb87bdb9();
            }
        }
    }

    /* renamed from: setChangeListener */
    public void m107595xf5c5c186(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26938x4a846bd0 interfaceC26938x4a846bd0, boolean z17) {
        boolean z18 = interfaceC26938x4a846bd0 != null;
        if (!z18) {
            z17 = false;
        }
        synchronized (this.f58169x6243b38) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f = this.f58164xce417d89;
            if (c26949xb6e0a66f.f58254xdfc2ac4d != z18 || c26949xb6e0a66f.f58255xbe5aa881 != z17) {
                c26949xb6e0a66f.f58254xdfc2ac4d = z18;
                c26949xb6e0a66f.f58255xbe5aa881 = z17;
                m107559x84df39e3();
                m107573xc5848fd1();
            }
            this.f58161x45ea9651 = interfaceC26938x4a846bd0;
        }
    }

    /* renamed from: setCheckpointListener */
    public void m107596xd5dd5a5e(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8 interfaceC26939xfb49cfa8) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.mDB.get();
        if (this.f58162x2aa4d1a9 != null) {
            this.f58162x2aa4d1a9.mo107374x3f5eee52(c26948xabb259c7);
        }
        this.f58162x2aa4d1a9 = interfaceC26939xfb49cfa8;
        if (this.f58162x2aa4d1a9 != null) {
            this.f58162x2aa4d1a9.mo107372x3b13c504(c26948xabb259c7);
        }
    }

    /* renamed from: setTraceCallback */
    public void m107597x2c558368(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 interfaceC26973xda906c79) {
        this.f58173x372d693d = interfaceC26973xda906c79;
    }

    /* renamed from: shouldYieldConnection */
    public boolean m107598x96759418(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a, int i17) {
        synchronized (this.f58169x6243b38) {
            if (!this.f58158xe4487c7a.containsKey(c26942xf59ce42a)) {
                throw new java.lang.IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            }
            if (!this.f58168x9132961) {
                return false;
            }
            return m107565x131c7fc(c26942xf59ce42a.m107496xcc523a76(), i17);
        }
    }

    /* renamed from: toString */
    public java.lang.String m107599x9616526c() {
        return "SQLiteConnectionPool: " + this.f58164xce417d89.f58252x346425;
    }

    /* renamed from: traceExecute */
    public void m107600xc1099670(java.lang.String str, int i17, long j17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.mDB.get();
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 interfaceC26973xda906c79 = this.f58173x372d693d;
        if (interfaceC26973xda906c79 == null || c26948xabb259c7 == null || str == null) {
            return;
        }
        interfaceC26973xda906c79.mo8838xcc78f01e(c26948xabb259c7, str, i17, j17);
    }

    /* renamed from: open */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 m107570x34264a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f c26949xb6e0a66f, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, int i17) {
        if (c26949xb6e0a66f != null) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66 c26943x5700cb66 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26943x5700cb66(c26948xabb259c7, c26949xb6e0a66f, i17);
            c26943x5700cb66.f58172x6d876228 = bArr;
            c26943x5700cb66.f58163xfe580cd8 = c26940xf23b9b2 == null ? null : new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2(c26940xf23b9b2);
            c26943x5700cb66.m107571x34264a();
            return c26943x5700cb66;
        }
        throw new java.lang.IllegalArgumentException("configuration must not be null.");
    }

    /* renamed from: open */
    private void m107571x34264a() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a m107572x959715f2 = m107572x959715f2(this.f58164xce417d89, true);
        this.f58160x608f8d04 = m107572x959715f2;
        m107572x959715f2.m107485xb5fee7a8();
        this.f58168x9132961 = true;
    }
}
