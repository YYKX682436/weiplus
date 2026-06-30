package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0;

/* renamed from: com.tencent.thumbplayer.tplayer.reportv2.TPReportController */
/* loaded from: classes16.dex */
public class C26540x26a27a8c implements com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26238x3fcd9a0f, com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24 {

    /* renamed from: CAPTURE_EVENT_TO_PROCESSOR_EVENT_MAP */
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> f55005xd2749084;
    private static final java.lang.String TAG = "TPReportController";

    /* renamed from: mSyncWaitTimeOutMs */
    private static final long f55006xa0dae50a = 500;

    /* renamed from: mContext */
    private android.content.Context f55007xd6cfe882;

    /* renamed from: mReportInfoGetter */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26240x603a7652 f55015x5e048a3a = null;

    /* renamed from: mReportThread */
    private android.os.HandlerThread f55016xbc97b16b = null;

    /* renamed from: mEventHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c.TPReportEventHandler f55009xf703545d = null;

    /* renamed from: mITPReporter */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086 f55010x23bc79f9 = null;

    /* renamed from: mReporterInitParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26546x3533ba13 f55017x806675c4 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26546x3533ba13();

    /* renamed from: mPlayerInfoGetter */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.api.InterfaceC26550x996747bf f55011x97315ba7 = null;

    /* renamed from: mControllerState */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26541xd1881165 f55008xb7318228 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26541xd1881165();

    /* renamed from: mReleaseSyncObjectLock */
    private java.lang.Object f55013xecae777f = new java.lang.Object();

    /* renamed from: mProcessLifeCycleChangeListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.ITPOnProcessLifeCycleChangeListener f55012x92f982cc = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.ITPOnProcessLifeCycleChangeListener() { // from class: com.tencent.thumbplayer.tplayer.reportv2.TPReportController.1
        @Override // com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.ITPOnProcessLifeCycleChangeListener
        /* renamed from: onEvent */
        public void mo103838xaf8c47fb(int i17) {
            int i18;
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c.TAG, "ProcessLifeCycleChangeListener eventId: " + i17);
            if (i17 == 2) {
                i18 = 1002;
            } else if (i17 != 3) {
                return;
            } else {
                i18 = 1001;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c.this.f55009xf703545d.sendEmptyMessage(i18);
        }
    };

    /* renamed from: mReportChannelListenerList */
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e>> f55014x1cc77654 = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: com.tencent.thumbplayer.tplayer.reportv2.TPReportController$TPReportEventHandler */
    /* loaded from: classes16.dex */
    public class TPReportEventHandler extends android.os.Handler {
        public TPReportEventHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i17 = message.what;
            com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo) message.obj;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c.this.m103825x113e7080(i17, baseEventInfo);
            if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c.this.f55010x23bc79f9 != null) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c.this.f55010x23bc79f9.mo103766xaf8c47fb(i17, baseEventInfo);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c.this.m103824xf660fb63(i17, baseEventInfo);
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f55005xd2749084 = hashMap;
        hashMap.put(117, 0);
        hashMap.put(204, 103);
        hashMap.put(101, 1);
        hashMap.put(102, 2);
        hashMap.put(103, 3);
        hashMap.put(104, 4);
        hashMap.put(105, 5);
        hashMap.put(107, 5);
        hashMap.put(108, 5);
        hashMap.put(106, 6);
        hashMap.put(109, 7);
        hashMap.put(110, 8);
        hashMap.put(111, 9);
        hashMap.put(112, 10);
        hashMap.put(114, 11);
        hashMap.put(115, 12);
        hashMap.put(201, 100);
        hashMap.put(202, 101);
        hashMap.put(203, 102);
        hashMap.put(116, 14);
        hashMap.put(113, 13);
        hashMap.put(118, 15);
    }

    public C26540x26a27a8c(android.content.Context context) {
        this.f55007xd6cfe882 = null;
        this.f55007xd6cfe882 = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dealSpecialEventAfterReporterIfNeed */
    public void m103824xf660fb63(int i17, com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (i17 == 5) {
            m103829x323a4a28(baseEventInfo);
        } else {
            if (i17 != 1000) {
                return;
            }
            m103827x546120ac(baseEventInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dealSpecialEventBeforeReporterIfNeed */
    public void m103825x113e7080(int i17, com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (i17 == 0) {
            m103833x9b4c46c8(baseEventInfo);
            return;
        }
        if (i17 == 1) {
            m103832xfbb65f1a(baseEventInfo);
            return;
        }
        if (i17 == 2) {
            m103831x7a447193(baseEventInfo);
        } else if (i17 == 6) {
            m103830x8cd27415(baseEventInfo);
        } else {
            if (i17 != 103) {
                return;
            }
            m103828x249dc920(baseEventInfo);
        }
    }

    /* renamed from: initReporter */
    private void m103826x6da99e11(int i17) {
        if (this.f55010x23bc79f9 != null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "mITPReporter has been create, do not create again.");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086 m103850xdf76263d = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26545x6bfcbacd.m103850xdf76263d(i17);
        this.f55010x23bc79f9 = m103850xdf76263d;
        if (m103850xdf76263d == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "initReporter(" + i17 + ") fail, mITPReporter is null.");
            return;
        }
        m103850xdf76263d.mo103765x316510(this.f55007xd6cfe882, this.f55017x806675c4);
        this.f55010x23bc79f9.mo103769x83c1bc2f(this.f55015x5e048a3a);
        this.f55010x23bc79f9.mo103768xbcee8d9c(this.f55011x97315ba7);
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e>> it = this.f55014x1cc77654.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e interfaceC26239x32996f7e = it.next().get();
            if (interfaceC26239x32996f7e != null) {
                this.f55010x23bc79f9.mo103764xf84afce2(interfaceC26239x32996f7e);
            }
        }
    }

    /* renamed from: onControllerRelease */
    private void m103827x546120ac(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onControllerRelease");
        synchronized (this.f55013xecae777f) {
            if (this.f55016xbc97b16b != null) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104417x408b7293(this.f55016xbc97b16b, this.f55009xf703545d);
                this.f55016xbc97b16b = null;
                this.f55009xf703545d = null;
            }
            this.f55014x1cc77654.clear();
            this.f55013xecae777f.notifyAll();
            this.f55013xecae777f = null;
        }
    }

    /* renamed from: onGetConvertedDataSource */
    private void m103828x249dc920(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTReturnConvertedUrlEventInfo) {
            this.f55017x806675c4.f55068xea88660d = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTReturnConvertedUrlEventInfo) baseEventInfo).m103165xb0301981();
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onGetConvertedDataSource time:" + this.f55017x806675c4.f55068xea88660d);
        }
    }

    /* renamed from: onPlayEnd */
    private void m103829x323a4a28(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        this.f55008xb7318228.m103842x53b6854f(1);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086 interfaceC26533xdd191086 = this.f55010x23bc79f9;
        if (interfaceC26533xdd191086 != null) {
            interfaceC26533xdd191086.mo103767x6761d4f();
            this.f55010x23bc79f9 = null;
        }
        this.f55017x806675c4 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26546x3533ba13();
    }

    /* renamed from: onPlayError */
    private void m103830x8cd27415(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (this.f55008xb7318228.m103841xefef4a96(2)) {
            m103826x6da99e11(2);
        }
        this.f55008xb7318228.m103842x53b6854f(1);
    }

    /* renamed from: onPrepareEnd */
    private void m103831x7a447193(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!this.f55008xb7318228.m103841xefef4a96(2)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onPrepareEnd Current state is not match:" + this.f55008xb7318228.m103843x9616526c());
            return;
        }
        this.f55008xb7318228.m103842x53b6854f(3);
        if (baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareEndEventInfo) {
            com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareEndEventInfo prepareEndEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareEndEventInfo) baseEventInfo;
            this.f55017x806675c4.f55073x591e3e08 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26544xfeac63c1.m103846x2f7fe09b(prepareEndEventInfo.m103196x6b2cfdb1());
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPrepareEnd durationMs:" + prepareEndEventInfo.m103195x37a7fa50() + " playType:" + this.f55017x806675c4.f55073x591e3e08);
            if (prepareEndEventInfo.m103195x37a7fa50() == 0) {
                m103826x6da99e11(1);
            } else {
                m103826x6da99e11(0);
            }
        }
    }

    /* renamed from: onPrepareStart */
    private void m103832xfbb65f1a(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        this.f55008xb7318228.m103842x53b6854f(2);
        if (baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareStartEventInfo) {
            com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareStartEventInfo prepareStartEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareStartEventInfo) baseEventInfo;
            this.f55017x806675c4.f55074x1526a67 = prepareStartEventInfo.m103165xb0301981();
            this.f55017x806675c4.f55075x472031ac = prepareStartEventInfo.m103164x901a4db0();
            this.f55017x806675c4.f55072x23efaf8a = prepareStartEventInfo.m103199x194b99df();
        }
    }

    /* renamed from: onSetDataSource */
    private void m103833x9b4c46c8(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SetDataSourceEventInfo) {
            com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SetDataSourceEventInfo setDataSourceEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SetDataSourceEventInfo) baseEventInfo;
            this.f55017x806675c4.f55076x9d874c31 = setDataSourceEventInfo.m103165xb0301981();
            this.f55017x806675c4.f55071x11423731 = setDataSourceEventInfo.m103211xb5887639();
            this.f55017x806675c4.f55069x9b3610be = setDataSourceEventInfo.m103213x406f153b() ? 1 : 0;
            this.f55017x806675c4.f55077xd50aea7a = setDataSourceEventInfo.m103212x4d41ff1();
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onSetDataSource url:" + this.f55017x806675c4.f55071x11423731 + " isUseProxy:" + this.f55017x806675c4.f55069x9b3610be + " urlProtocol:" + this.f55017x806675c4.f55077xd50aea7a);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26238x3fcd9a0f
    /* renamed from: addReportChannelListener */
    public void mo101482xf84afce2(com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e interfaceC26239x32996f7e) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e>> copyOnWriteArrayList = this.f55014x1cc77654;
        if (copyOnWriteArrayList == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "mReportChannelListenerList is null");
            return;
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26239x32996f7e>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (it.next().get() == interfaceC26239x32996f7e) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "mReportChannelListenerList has contain reportChannelListener");
                return;
            }
        }
        this.f55014x1cc77654.add(new java.lang.ref.WeakReference<>(interfaceC26239x32996f7e));
    }

    /* renamed from: init */
    public void m103834x316510() {
        this.f55016xbc97b16b = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104408x3ccacf97("TPReportController_Thread");
        this.f55009xf703545d = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c.TPReportEventHandler(this.f55016xbc97b16b.getLooper());
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.m104366xdab2e64d(this.f55012x92f982cc);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24
    /* renamed from: onEvent */
    public void mo103162xaf8c47fb(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        java.util.Map<java.lang.Integer, java.lang.Integer> map = f55005xd2749084;
        if (map.containsKey(java.lang.Integer.valueOf(baseEventInfo.m103163xebc1791f()))) {
            this.f55009xf703545d.obtainMessage(map.get(java.lang.Integer.valueOf(baseEventInfo.m103163xebc1791f())).intValue(), baseEventInfo).sendToTarget();
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "EventId:" + baseEventInfo.m103163xebc1791f() + " is not need process");
    }

    /* renamed from: release */
    public void m103835x41012807() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "release");
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.m104376xdfb98f4a(this.f55012x92f982cc);
        synchronized (this.f55013xecae777f) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c.TPReportEventHandler tPReportEventHandler = this.f55009xf703545d;
            if (tPReportEventHandler != null) {
                tPReportEventHandler.sendEmptyMessage(1000);
            }
            try {
                this.f55013xecae777f.wait(500L);
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
    }

    /* renamed from: setPlayerInfoGetter */
    public void m103836xbcee8d9c(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.api.InterfaceC26550x996747bf interfaceC26550x996747bf) {
        this.f55011x97315ba7 = interfaceC26550x996747bf;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26238x3fcd9a0f
    /* renamed from: setReportInfoGetter */
    public void mo101483x83c1bc2f(com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26240x603a7652 interfaceC26240x603a7652) {
        this.f55015x5e048a3a = interfaceC26240x603a7652;
    }

    /* renamed from: setReportToBeaconNeeded */
    public void m103837xe94a10a(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "reporting is needed:" + z17);
        this.f55017x806675c4.f55070x34acf576 = java.lang.Boolean.valueOf(z17);
    }
}
