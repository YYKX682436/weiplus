package com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d;

/* renamed from: com.tencent.wcdb.repair.RepairKit */
/* loaded from: classes12.dex */
public class C26986x49fedfe9 implements com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener {

    /* renamed from: FLAG_ALL_TABLES */
    public static final int f58397xa888f196 = 2;

    /* renamed from: FLAG_CHECK_TABLE_COLUMNS */
    public static final int f58398x99061fc2 = 4;

    /* renamed from: FLAG_NO_CREATE_TABLES */
    public static final int f58399xe312d7d = 1;

    /* renamed from: INTEGRITY_DATA */
    private static final int f58400x925e057c = 2;

    /* renamed from: INTEGRITY_HEADER */
    private static final int f58401x79f5c7df = 1;

    /* renamed from: INTEGRITY_KDF_SALT */
    private static final int f58402xe06b741a = 4;

    /* renamed from: RESULT_CANCELED */
    public static final int f58403x14383a7b = 1;

    /* renamed from: RESULT_FAILED */
    public static final int f58404x122f5e9f = -1;

    /* renamed from: RESULT_IGNORE */
    public static final int f58405x17a4c834 = 2;

    /* renamed from: RESULT_OK */
    public static final int f58406x39a4613e = 0;
    private static final java.lang.String TAG = "WCDB.RepairKit";

    /* renamed from: mCallback */
    private com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.Callback f58407x1ab9c7d2;

    /* renamed from: mCurrentCursor */
    private com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.RepairCursor f58408xc58506c2;

    /* renamed from: mIntegrityFlags */
    private int f58409x17ec9107;

    /* renamed from: mLeafInfo */
    private com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo f58410x821840b9;

    /* renamed from: mMasterInfo */
    private com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.MasterInfo f58411x62a1fa7d;

    /* renamed from: mNativePtr */
    private long f58412x3e9ea96a;

    /* renamed from: com.tencent.wcdb.repair.RepairKit$Callback */
    /* loaded from: classes12.dex */
    public interface Callback {
        /* renamed from: onProgress */
        int mo107986x696ee52c(java.lang.String str, int i17, android.database.Cursor cursor);
    }

    /* renamed from: com.tencent.wcdb.repair.RepairKit$LeafInfo */
    /* loaded from: classes12.dex */
    public static class LeafInfo {

        /* renamed from: mLeafPtr */
        long f58413xa119a983;

        private LeafInfo(long j17) {
            this.f58413xa119a983 = j17;
        }

        /* renamed from: load */
        public static com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo m107987x32c4e6(java.lang.String str) {
            long m107968x85f0a29b = com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.m107968x85f0a29b(str);
            if (m107968x85f0a29b != 0) {
                return new com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo(m107968x85f0a29b);
            }
            throw new java.io.IOException("Cannot load leaf info.");
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
        /* renamed from: scan */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo m107988x35c67d(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 r8, java.lang.String[] r9, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r10) {
            /*
                r0 = 1
                long[] r1 = new long[r0]
                if (r10 == 0) goto Ld
                com.tencent.wcdb.repair.RepairKit$LeafInfo$1 r2 = new com.tencent.wcdb.repair.RepairKit$LeafInfo$1
                r2.<init>()
                r10.m108009x57c2e18f(r2)
            Ld:
                r2 = 0
                if (r9 == 0) goto L14
                int r3 = r9.length
                if (r3 != 0) goto L14
                r9 = r2
            L14:
                java.lang.String r3 = "scanLeaf"
                r4 = 0
                long r3 = r8.m107657x12386953(r3, r0, r4)
                if (r10 == 0) goto L27
                r10.m108011xf4ed245c()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                goto L27
            L22:
                r9 = move-exception
                r0 = r2
                goto L4f
            L25:
                r9 = move-exception
                goto L4a
            L27:
                if (r10 != 0) goto L2a
                r1 = r2
            L2a:
                long r0 = com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.m107955xbbd79537(r3, r9, r1)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                r5 = 0
                int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r9 == 0) goto L42
                com.tencent.wcdb.repair.RepairKit$LeafInfo r9 = new com.tencent.wcdb.repair.RepairKit$LeafInfo     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                if (r10 == 0) goto L3e
                r10.m108009x57c2e18f(r2)
            L3e:
                r8.m107714x63db387c(r3, r2)
                return r9
            L42:
                com.tencent.wcdb.database.SQLiteException r9 = new com.tencent.wcdb.database.SQLiteException     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                java.lang.String r0 = "Cannot scan leaf info."
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
                throw r9     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
            L4a:
                throw r9     // Catch: java.lang.Throwable -> L4b
            L4b:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L4f:
                if (r10 == 0) goto L54
                r10.m108009x57c2e18f(r2)
            L54:
                r8.m107714x63db387c(r3, r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo.m107988x35c67d(com.tencent.wcdb.database.SQLiteDatabase, java.lang.String[], com.tencent.wcdb.support.CancellationSignal):com.tencent.wcdb.repair.RepairKit$LeafInfo");
        }

        /* renamed from: finalize */
        public void m107989xd764dc1e() {
            m107990x41012807();
            super.finalize();
        }

        /* renamed from: release */
        public void m107990x41012807() {
            long j17 = this.f58413xa119a983;
            if (j17 == 0) {
                return;
            }
            com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.m107962xbc3dc121(j17);
            this.f58413xa119a983 = 0L;
        }

        /* renamed from: save */
        public void m107991x35c17d(java.lang.String str) {
            long j17 = this.f58413xa119a983;
            if (j17 != 0 && !com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.m107972x9c657bb2(j17, str)) {
                throw new java.io.IOException("Cannot save leaf info.");
            }
        }
    }

    /* renamed from: com.tencent.wcdb.repair.RepairKit$MasterInfo */
    /* loaded from: classes12.dex */
    public static class MasterInfo {

        /* renamed from: mKDFSalt */
        byte[] f58415x325ea2f6;

        /* renamed from: mMasterPtr */
        long f58416x874fa73f;

        private MasterInfo(long j17, byte[] bArr) {
            this.f58416x874fa73f = j17;
            this.f58415x325ea2f6 = bArr;
        }

        /* renamed from: load */
        public static com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.MasterInfo m107992x32c4e6(java.lang.String str, byte[] bArr, java.lang.String[] strArr) {
            if (str == null) {
                return m107993x3305ee(strArr);
            }
            byte[] bArr2 = new byte[16];
            long m107969xcdd7525f = com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.m107969xcdd7525f(str, bArr, strArr, bArr2);
            if (m107969xcdd7525f != 0) {
                return new com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.MasterInfo(m107969xcdd7525f, bArr2);
            }
            throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("Cannot create MasterInfo.");
        }

        /* renamed from: make */
        public static com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.MasterInfo m107993x3305ee(java.lang.String[] strArr) {
            long m107970xea14ad67 = com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.m107970xea14ad67(strArr);
            if (m107970xea14ad67 != 0) {
                return new com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.MasterInfo(m107970xea14ad67, null);
            }
            throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("Cannot create MasterInfo.");
        }

        /* renamed from: save */
        public static boolean m107994x35c17d(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, byte[] bArr) {
            long m107657x12386953 = c26948xabb259c7.m107657x12386953("backupMaster", true, false);
            boolean m107973x1a7a41b6 = com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.m107973x1a7a41b6(m107657x12386953, str, bArr);
            c26948xabb259c7.m107714x63db387c(m107657x12386953, null);
            return m107973x1a7a41b6;
        }

        /* renamed from: saveMaster */
        public static boolean m107995x347e063f(long j17, java.lang.String str, byte[] bArr) {
            return com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.m107973x1a7a41b6(j17, str, bArr);
        }

        /* renamed from: finalize */
        public void m107996xd764dc1e() {
            m107997x41012807();
            super.finalize();
        }

        /* renamed from: release */
        public void m107997x41012807() {
            long j17 = this.f58416x874fa73f;
            if (j17 == 0) {
                return;
            }
            com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.m107963xa556e765(j17);
            this.f58416x874fa73f = 0L;
        }
    }

    /* renamed from: com.tencent.wcdb.repair.RepairKit$RepairCursor */
    /* loaded from: classes12.dex */
    public static class RepairCursor extends com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38 {

        /* renamed from: mPtr */
        long f58417x32c741;

        private RepairCursor() {
        }

        /* renamed from: nativeGetBlob */
        private static native byte[] m107998xc274e7fc(long j17, int i17);

        /* renamed from: nativeGetColumnCount */
        private static native int m107999x747c221a(long j17);

        /* renamed from: nativeGetDouble */
        private static native double m108000xfc719870(long j17, int i17);

        /* renamed from: nativeGetLong */
        private static native long m108001xc2797edb(long j17, int i17);

        /* renamed from: nativeGetString */
        private static native java.lang.String m108002x164f7cb0(long j17, int i17);

        /* renamed from: nativeGetType */
        private static native int m108003xc27d4799(long j17, int i17);

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public byte[] getBlob(int i17) {
            return m107998xc274e7fc(this.f58417x32c741, i17);
        }

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public int getColumnCount() {
            return m107999x747c221a(this.f58417x32c741);
        }

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public java.lang.String[] getColumnNames() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public int getCount() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public double getDouble(int i17) {
            return m108000xfc719870(this.f58417x32c741, i17);
        }

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public float getFloat(int i17) {
            return (float) getDouble(i17);
        }

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public int getInt(int i17) {
            return (int) getLong(i17);
        }

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public long getLong(int i17) {
            return m108001xc2797edb(this.f58417x32c741, i17);
        }

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public short getShort(int i17) {
            return (short) getLong(i17);
        }

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public java.lang.String getString(int i17) {
            return m108002x164f7cb0(this.f58417x32c741, i17);
        }

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public int getType(int i17) {
            return m108003xc27d4799(this.f58417x32c741, i17);
        }

        @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
        public boolean isNull(int i17) {
            return getType(i17) == 0;
        }
    }

    /* renamed from: com.tencent.wcdb.repair.RepairKit$Statistics */
    /* loaded from: classes12.dex */
    public static class Statistics {

        /* renamed from: damagedPages */
        public final int f58418xf6e799ef;

        /* renamed from: parsedPages */
        public final int f58419xf291a633;

        /* renamed from: totalPages */
        public final int f58420xd5188ee0;

        /* renamed from: validPages */
        public final int f58421xfc6f0d28;

        public Statistics(int[] iArr) {
            this.f58420xd5188ee0 = iArr[0];
            this.f58421xfc6f0d28 = iArr[1];
            this.f58419xf291a633 = iArr[2];
            this.f58418xf6e799ef = iArr[3];
        }
    }

    public C26986x49fedfe9(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.MasterInfo masterInfo) {
        this(str, bArr, c26940xf23b9b2, masterInfo, null);
    }

    /* renamed from: lastError */
    public static java.lang.String m107958x76917d12() {
        return m107967x5cf476bb();
    }

    /* renamed from: nativeCancel */
    private static native void m107959x72d4bd71(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeCancelScanLeaf */
    public static native void m107960x25bf740c(long j17);

    /* renamed from: nativeFini */
    private static native void m107961xb8ffd675(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeFreeLeaf */
    public static native void m107962xbc3dc121(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeFreeMaster */
    public static native void m107963xa556e765(long j17);

    /* renamed from: nativeGetStatistics */
    private static native int[] m107964x8c296642(long j17);

    /* renamed from: nativeInit */
    private static native long m107965xb90145c7(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, byte[] bArr2);

    /* renamed from: nativeIntegrityFlags */
    private static native int m107966xdf2d2f31(long j17);

    /* renamed from: nativeLastError */
    private static native java.lang.String m107967x5cf476bb();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeLoadLeaf */
    public static native long m107968x85f0a29b(java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeLoadMaster */
    public static native long m107969xcdd7525f(java.lang.String str, byte[] bArr, java.lang.String[] strArr, byte[] bArr2);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeMakeMaster */
    public static native long m107970xea14ad67(java.lang.String[] strArr);

    /* renamed from: nativeOutput */
    private native int m107971x886ba7f8(long j17, long j18, long j19, long j27, int i17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeSaveLeaf */
    public static native boolean m107972x9c657bb2(long j17, java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeSaveMaster */
    public static native boolean m107973x1a7a41b6(long j17, java.lang.String str, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeScanLeaf */
    public static native long m107974xe2db00b2(long j17, java.lang.String[] strArr, long[] jArr);

    /* renamed from: onProgress */
    private int m107975x696ee52c(java.lang.String str, int i17, long j17) {
        if (this.f58407x1ab9c7d2 == null) {
            return 0;
        }
        if (this.f58408xc58506c2 == null) {
            this.f58408xc58506c2 = new com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.RepairCursor();
        }
        com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.RepairCursor repairCursor = this.f58408xc58506c2;
        repairCursor.f58417x32c741 = j17;
        return this.f58407x1ab9c7d2.mo107986x696ee52c(str, i17, repairCursor);
    }

    /* renamed from: finalize */
    public void m107976xd764dc1e() {
        m107984x41012807();
        super.finalize();
    }

    /* renamed from: getCallback */
    public com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.Callback m107977x71965dbb() {
        return this.f58407x1ab9c7d2;
    }

    /* renamed from: getStatistics */
    public com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.Statistics m107978xe89d6919() {
        long j17 = this.f58412x3e9ea96a;
        if (j17 != 0) {
            return new com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.Statistics(m107964x8c296642(j17));
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* renamed from: isDataCorrupted */
    public boolean m107979xce7229d8() {
        return (this.f58409x17ec9107 & 2) == 0;
    }

    /* renamed from: isHeaderCorrupted */
    public boolean m107980xe4a1e0d5() {
        return (this.f58409x17ec9107 & 1) == 0;
    }

    /* renamed from: isSaltCorrupted */
    public boolean m107981x426d5aac() {
        return (this.f58409x17ec9107 & 4) == 0;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener
    /* renamed from: onCancel */
    public void mo82492x3d6f0539() {
        long j17 = this.f58412x3e9ea96a;
        if (j17 == 0) {
            return;
        }
        m107959x72d4bd71(j17);
    }

    /* renamed from: output */
    public int m107982xc4111901(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, int i17) {
        if (this.f58412x3e9ea96a != 0) {
            com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.MasterInfo masterInfo = this.f58411x62a1fa7d;
            long j17 = masterInfo == null ? 0L : masterInfo.f58416x874fa73f;
            com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo leafInfo = this.f58410x821840b9;
            long j18 = leafInfo == null ? 0L : leafInfo.f58413xa119a983;
            long m107657x12386953 = c26948xabb259c7.m107657x12386953("repair", false, false);
            int m107971x886ba7f8 = m107971x886ba7f8(this.f58412x3e9ea96a, m107657x12386953, j17, j18, i17);
            c26948xabb259c7.m107714x63db387c(m107657x12386953, null);
            this.f58408xc58506c2 = null;
            this.f58409x17ec9107 = m107966xdf2d2f31(this.f58412x3e9ea96a);
            return m107971x886ba7f8;
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* renamed from: release */
    public void m107984x41012807() {
        com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo leafInfo = this.f58410x821840b9;
        if (leafInfo != null) {
            leafInfo.m107990x41012807();
            this.f58410x821840b9 = null;
        }
        com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.MasterInfo masterInfo = this.f58411x62a1fa7d;
        if (masterInfo != null) {
            masterInfo.m107997x41012807();
            this.f58411x62a1fa7d = null;
        }
        long j17 = this.f58412x3e9ea96a;
        if (j17 != 0) {
            m107961xb8ffd675(j17);
            this.f58412x3e9ea96a = 0L;
        }
    }

    /* renamed from: setCallback */
    public void m107985x6c4ebec7(com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.Callback callback) {
        this.f58407x1ab9c7d2 = callback;
    }

    public C26986x49fedfe9(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.MasterInfo masterInfo, com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo leafInfo) {
        if (str != null) {
            long m107965xb90145c7 = m107965xb90145c7(str, bArr, c26940xf23b9b2, masterInfo == null ? null : masterInfo.f58415x325ea2f6);
            this.f58412x3e9ea96a = m107965xb90145c7;
            if (m107965xb90145c7 != 0) {
                this.f58409x17ec9107 = m107966xdf2d2f31(m107965xb90145c7);
                this.f58411x62a1fa7d = masterInfo;
                this.f58410x821840b9 = leafInfo;
                return;
            }
            throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("Failed initialize RepairKit.");
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* renamed from: output */
    public int m107983xc4111901(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (c26987xeef691ab.m108008xc9602be3()) {
            return 1;
        }
        c26987xeef691ab.m108009x57c2e18f(this);
        int m107982xc4111901 = m107982xc4111901(c26948xabb259c7, i17);
        c26987xeef691ab.m108009x57c2e18f(null);
        return m107982xc4111901;
    }
}
