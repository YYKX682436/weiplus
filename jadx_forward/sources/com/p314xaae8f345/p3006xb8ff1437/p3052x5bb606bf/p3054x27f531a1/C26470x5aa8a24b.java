package com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1;

/* renamed from: com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest */
/* loaded from: classes15.dex */
public class C26470x5aa8a24b implements com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26243xc8b78f22 {

    /* renamed from: ENV_DEBUG */
    private static final boolean f53897x8608041 = false;

    /* renamed from: MAX_ASSET_READ_LEN */
    private static final int f53898xf41d68b6 = 1048576;

    /* renamed from: MSG_RESPOND_WITH_DATA */
    private static final int f53899x3ed51adb = 256;
    private static java.lang.String TAG = "TPAssetResourceLoadingDataRequest";

    /* renamed from: mCurrentOffset */
    private long f53900xd92657ff;

    /* renamed from: mDataWritePath */
    private java.lang.String f53901x9b9e60ad;

    /* renamed from: mEventHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.EventHandler f53902xf703545d;

    /* renamed from: mLock */
    private com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26579x7b4fc798 f53903x6243b38 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26579x7b4fc798();

    /* renamed from: mRandomAccessFile */
    private java.io.RandomAccessFile f53904xcbcb80b0;

    /* renamed from: mReadyDataTotalSize */
    private long f53905x50b4cf45;

    /* renamed from: mRealOffset */
    private long f53906x5df5741e;

    /* renamed from: mRequestNum */
    private int f53907xde67fac4;

    /* renamed from: mRequestedLength */
    private long f53908x935e23c7;

    /* renamed from: mRequestedOffset */
    private long f53909x98874d74;

    /* renamed from: mRequestsAllDataToEndOfResource */
    private boolean f53910x6ed12fcb;

    /* renamed from: com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest$DataWriteParams */
    /* loaded from: classes15.dex */
    public static class DataWriteParams {

        /* renamed from: data */
        byte[] f53911x2eefaa;

        /* renamed from: writeOffset */
        long f53912x4c8f0552;

        private DataWriteParams() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest$EventHandler */
    /* loaded from: classes15.dex */
    public class EventHandler extends android.os.Handler {
        public EventHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (message.what != 256) {
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.DataWriteParams dataWriteParams = (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.DataWriteParams) message.obj;
            long j17 = dataWriteParams.f53912x4c8f0552;
            byte[] bArr = dataWriteParams.f53911x2eefaa;
            int i17 = message.arg1;
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b c26470x5aa8a24b = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.this;
            if (!c26470x5aa8a24b.m103151x2c874ec9(j17, bArr, c26470x5aa8a24b.f53901x9b9e60ad)) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.TAG, "write data failed");
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.this.f53903x6243b38.writeLock().lock();
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.this.f53906x5df5741e = i17 + j17;
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.this.f53903x6243b38.writeLock().unlock();
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.TAG, "write data from " + j17 + " , with dataLength" + i17);
        }
    }

    public C26470x5aa8a24b(long j17, long j18, boolean z17) {
        this.f53909x98874d74 = j17;
        this.f53900xd92657ff = j17;
        this.f53906x5df5741e = j17;
        this.f53908x935e23c7 = j18;
        this.f53910x6ed12fcb = z17;
    }

    /* renamed from: internalMessage */
    private void m103150xe737328a(int i17, int i18, int i19, java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.EventHandler eventHandler = this.f53902xf703545d;
        if (eventHandler != null) {
            android.os.Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i17;
            obtainMessage.arg1 = i18;
            obtainMessage.arg2 = i19;
            obtainMessage.obj = obj;
            this.f53902xf703545d.sendMessage(obtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.TAG, "fail to close mRandomAccessFile");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002d, code lost:
    
        if (r4 == null) goto L22;
     */
    /* renamed from: writeDataToPath */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m103151x2c874ec9(long r4, byte[] r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.String r0 = "fail to close mRandomAccessFile"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            java.lang.String r2 = "rw"
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            r3.f53904xcbcb80b0 = r1     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            r1.seek(r4)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            java.io.RandomAccessFile r4 = r3.f53904xcbcb80b0     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            r4.write(r6)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            java.io.RandomAccessFile r4 = r3.f53904xcbcb80b0
            if (r4 == 0) goto L20
            r4.close()     // Catch: java.io.IOException -> L1b
            goto L20
        L1b:
            java.lang.String r4 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.TAG
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(r4, r0)
        L20:
            r4 = 1
            goto L45
        L22:
            r4 = move-exception
            goto L46
        L24:
            java.lang.String r4 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.TAG     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "fail to write data"
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(r4, r5)     // Catch: java.lang.Throwable -> L22
            java.io.RandomAccessFile r4 = r3.f53904xcbcb80b0
            if (r4 == 0) goto L44
            goto L3b
        L30:
            java.lang.String r4 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.TAG     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "file not found"
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(r4, r5)     // Catch: java.lang.Throwable -> L22
            java.io.RandomAccessFile r4 = r3.f53904xcbcb80b0
            if (r4 == 0) goto L44
        L3b:
            r4.close()     // Catch: java.io.IOException -> L3f
            goto L44
        L3f:
            java.lang.String r4 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.TAG
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(r4, r0)
        L44:
            r4 = 0
        L45:
            return r4
        L46:
            java.io.RandomAccessFile r5 = r3.f53904xcbcb80b0
            if (r5 == 0) goto L53
            r5.close()     // Catch: java.io.IOException -> L4e
            goto L53
        L4e:
            java.lang.String r5 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.TAG
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(r5, r0)
        L53:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.m103151x2c874ec9(long, byte[], java.lang.String):boolean");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26243xc8b78f22
    /* renamed from: getCurrentOffset */
    public long mo101490x3b780bb6() {
        this.f53903x6243b38.readLock().lock();
        long j17 = this.f53900xd92657ff;
        this.f53903x6243b38.readLock().unlock();
        return j17;
    }

    /* renamed from: getDataReadyLength */
    public int m103152xed32f629(long j17) {
        this.f53903x6243b38.readLock().lock();
        long j18 = this.f53906x5df5741e;
        this.f53903x6243b38.readLock().unlock();
        if (j17 >= j18) {
            return -1;
        }
        if (j17 >= this.f53909x98874d74) {
            return (int) (j18 - j17);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "Offset less than mRequestedOffset");
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26243xc8b78f22
    /* renamed from: getRequestNum */
    public int mo101491xf076ba6d() {
        return this.f53907xde67fac4;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26243xc8b78f22
    /* renamed from: getRequestedLength */
    public long mo101492xa811c5be() {
        return this.f53908x935e23c7;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26243xc8b78f22
    /* renamed from: getRequestedOffset */
    public long mo101493xad3aef6b() {
        return this.f53909x98874d74;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26243xc8b78f22
    /* renamed from: notifyDataReady */
    public void mo101494xf18eded0(long j17, long j18) {
        long j19 = j18 + j17;
        long j27 = this.f53909x98874d74;
        if (j19 > this.f53908x935e23c7 + j27) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "data exceed the max request offset");
            return;
        }
        if (j17 < j27) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "the notify data offset is less than request offset");
        }
        if (j19 < this.f53900xd92657ff) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "data not reach current offset");
            return;
        }
        this.f53903x6243b38.writeLock().lock();
        this.f53900xd92657ff = j19;
        this.f53906x5df5741e = j19;
        this.f53903x6243b38.writeLock().unlock();
    }

    /* renamed from: release */
    public void m103153x41012807() {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.EventHandler eventHandler = this.f53902xf703545d;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
            this.f53902xf703545d = null;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26243xc8b78f22
    /* renamed from: respondWithData */
    public void mo101495xdffe4145(byte[] bArr) {
        if (this.f53905x50b4cf45 > this.f53908x935e23c7) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "respond full data");
            return;
        }
        int length = bArr.length;
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.DataWriteParams dataWriteParams = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.DataWriteParams();
        dataWriteParams.f53912x4c8f0552 = this.f53900xd92657ff;
        dataWriteParams.f53911x2eefaa = bArr;
        m103150xe737328a(256, length, 0, dataWriteParams);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "respond data from:" + this.f53900xd92657ff + ", dataLength:" + length);
        this.f53903x6243b38.writeLock().lock();
        long j17 = (long) length;
        this.f53900xd92657ff = this.f53900xd92657ff + j17;
        this.f53905x50b4cf45 = this.f53905x50b4cf45 + j17;
        this.f53903x6243b38.writeLock().unlock();
    }

    /* renamed from: setDataWritePath */
    public void m103154x90c67ad8(java.lang.String str) {
        this.f53901x9b9e60ad = str;
    }

    /* renamed from: setDataWriteThreadLooper */
    public void m103155x3b5338ae(android.os.Looper looper) {
        this.f53902xf703545d = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26470x5aa8a24b.EventHandler(looper);
    }

    /* renamed from: setRequestNum */
    public void m103156x1e9b0879(int i17) {
        this.f53907xde67fac4 = i17;
    }
}
