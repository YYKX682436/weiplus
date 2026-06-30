package com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1;

/* renamed from: com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader */
/* loaded from: classes15.dex */
public class C26469xb27744b5 implements com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c {

    /* renamed from: MSG_ON_START_READ_DATA */
    private static final int f53876x3aabf034 = 256;

    /* renamed from: MSG_ON_STOP_READ_DATA */
    private static final int f53877x490f25b8 = 257;
    private static java.lang.String TAG = "TPAssetResourceLoader";

    /* renamed from: mCacheDir */
    private static final java.lang.String f53878xb26bd38 = "resourceLoader";

    /* renamed from: mCallbackForResourceLoaderHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.EventHandler f53880x3852e6f2;

    /* renamed from: mContentInformation */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.C26245xdfa71862 f53881x8f86ee40;

    /* renamed from: mContext */
    private android.content.Context f53883xd6cfe882;

    /* renamed from: mHandlerThread */
    private android.os.HandlerThread f53887x3e0f3a87;

    /* renamed from: mTPAssetResourceLoaderListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26242xd2a9d8e0 f53890xeaf1fb3c;

    /* renamed from: mWriteDataThread */
    private android.os.HandlerThread f53891xfbe25b66;

    /* renamed from: mDataTotalSize */
    private long f53885xcd0a256e = 0;

    /* renamed from: mContentType */
    private java.lang.String f53882x92db64a6 = "";

    /* renamed from: mBusinessFilePath */
    private java.lang.String f53879x17e1de2e = "";

    /* renamed from: mDataCacheFilePath */
    private java.lang.String f53884x63d92cec = "";

    /* renamed from: mFileSuffix */
    private java.lang.String f53886x479dc43a = ".mp4";

    /* renamed from: mRequestNum */
    private int f53889xde67fac4 = 0;

    /* renamed from: mLoadingRequests */
    private java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055> f53888xa5c1d8f3 = new java.util.ArrayList<>();

    /* renamed from: com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader$EventHandler */
    /* loaded from: classes15.dex */
    public class EventHandler extends android.os.Handler {
        public EventHandler(android.os.Looper looper) {
            super(looper);
        }

        /* renamed from: handleIsRequestToEnd */
        private boolean m103143x8168d1a3(long j17, long j18) {
            boolean z17 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.this.f53885xcd0a256e > 0 && j18 + j17 >= com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.this.f53885xcd0a256e;
            if (z17) {
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.this.m103134xb52e2740();
            }
            return z17;
        }

        /* renamed from: handleRequestToLoad */
        private void m103144x582b0c28(long j17, long j18, java.lang.String str, java.lang.String str2, int i17, int i18) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055 c26471x3d8a6055 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055(j17, j18, i18, m103143x8168d1a3(j17, j18));
            c26471x3d8a6055.m103161x3b5338ae(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.this.f53891xfbe25b66.getLooper());
            c26471x3d8a6055.m103160x90c67ad8(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.this.mo103119x84354c01(i17, str, str2));
            c26471x3d8a6055.m103159x3abf76f5(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.this.f53881x8f86ee40);
            if (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.this.f53890xeaf1fb3c.mo101489x1ec01c6a(c26471x3d8a6055)) {
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.this.m103133xb30c4aae(c26471x3d8a6055);
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.TAG, "add to mLoadingRequests, requestId: " + i18);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.TAG, "mCallbackForResourceLoaderHandler msg : " + message.what);
            if (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.this.f53890xeaf1fb3c == null) {
                return;
            }
            int i17 = message.what;
            if (i17 != 256) {
                if (i17 != 257) {
                    return;
                }
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.TAG, "stop read data");
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.this.m103141x656612ca(message.arg1);
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.TAG, "start read data");
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.StartReadDataParams startReadDataParams = (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.StartReadDataParams) message.obj;
            long j17 = startReadDataParams.f53896x4d052313;
            long j18 = startReadDataParams.f53895x235dfcc;
            java.lang.String str = startReadDataParams.f53893xcd096f43;
            java.lang.String str2 = startReadDataParams.f53894xd425c627;
            int i18 = message.arg1;
            int i19 = message.arg2;
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.TAG, "start read data, requestStart: " + j17 + " requestEnd:" + j18 + " requestId:" + i19);
            long m103139x43f6e9f = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.this.m103139x43f6e9f(j17, j18);
            if (m103139x43f6e9f <= 0) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.TAG, "requestLength invalid, check requestStart and requestEnd");
            } else {
                m103144x582b0c28(j17, m103139x43f6e9f, str2, str, i18, i19);
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader$StartReadDataParams */
    /* loaded from: classes15.dex */
    public static class StartReadDataParams {

        /* renamed from: fileKey */
        java.lang.String f53893xcd096f43;

        /* renamed from: fileName */
        java.lang.String f53894xd425c627;

        /* renamed from: requestEnd */
        long f53895x235dfcc;

        /* renamed from: requestStart */
        long f53896x4d052313;

        private StartReadDataParams() {
        }
    }

    public C26469xb27744b5(android.content.Context context, android.os.Looper looper) {
        this.f53883xd6cfe882 = context;
        if (looper == null) {
            android.os.HandlerThread m104411x2a51c4e4 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104411x2a51c4e4();
            this.f53887x3e0f3a87 = m104411x2a51c4e4;
            looper = m104411x2a51c4e4.getLooper();
        }
        this.f53880x3852e6f2 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.EventHandler(looper);
        this.f53891xfbe25b66 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104408x3ccacf97("TPAssetResourceLoader-dataWriteThread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addRequest */
    public synchronized void m103133xb30c4aae(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055 c26471x3d8a6055) {
        java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055> arrayList = this.f53888xa5c1d8f3;
        if (arrayList != null) {
            arrayList.add(c26471x3d8a6055);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearRequestList */
    public synchronized void m103134xb52e2740() {
        java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055> arrayList = this.f53888xa5c1d8f3;
        if (arrayList != null) {
            java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055> it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055 next = it.next();
                next.m103157x902cfeb5();
                this.f53890xeaf1fb3c.mo101487x1455adec(next);
            }
            this.f53888xa5c1d8f3.clear();
        }
    }

    /* renamed from: getBusinessFilePath */
    private java.lang.String m103135x99a27b17() {
        return this.f53879x17e1de2e;
    }

    /* renamed from: getDataCacheFilePath */
    private java.lang.String m103136x1a2c2d23(android.content.Context context, int i17) {
        if (android.text.TextUtils.isEmpty(this.f53884x63d92cec)) {
            java.io.File m102458xb43dfdd = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26379xc74951ef.m102458xb43dfdd(context, f53878xb26bd38, new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()) + "-" + i17 + this.f53886x479dc43a);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102478x51962c98(m102458xb43dfdd);
            this.f53884x63d92cec = m102458xb43dfdd.getAbsolutePath();
        }
        return this.f53884x63d92cec;
    }

    /* renamed from: getDataReadyLength */
    private synchronized int m103137xed32f629(long j17) {
        if (this.f53888xa5c1d8f3 == null) {
            return 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f53888xa5c1d8f3.size(); i18++) {
            i17 = java.lang.Math.max(i17, this.f53888xa5c1d8f3.get(i18).m103158xed32f629(j17));
        }
        return i17;
    }

    /* renamed from: getLoadingRequestWithNum */
    private synchronized com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055 m103138x51f5a1f7(int i17) {
        if (this.f53888xa5c1d8f3 == null) {
            return null;
        }
        for (int i18 = 0; i18 < this.f53888xa5c1d8f3.size(); i18++) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055 c26471x3d8a6055 = this.f53888xa5c1d8f3.get(i18);
            if (c26471x3d8a6055.mo101498x11b6d29f().mo101491xf076ba6d() == i17) {
                return c26471x3d8a6055;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRequestLength */
    public long m103139x43f6e9f(long j17, long j18) {
        if (j18 > 0) {
            return j18 - j17;
        }
        long j19 = this.f53885xcd0a256e;
        if (j19 <= 0) {
            return 536870912L;
        }
        return j19 - j17;
    }

    /* renamed from: handleResourceLoaderCallback */
    private void m103140x397fdd6e(int i17, int i18, int i19, java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.EventHandler eventHandler = this.f53880x3852e6f2;
        if (eventHandler != null) {
            android.os.Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i17;
            obtainMessage.arg1 = i18;
            obtainMessage.arg2 = i19;
            obtainMessage.obj = obj;
            this.f53880x3852e6f2.sendMessage(obtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleStopReadData */
    public void m103141x656612ca(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055 m103138x51f5a1f7 = m103138x51f5a1f7(i17);
        if (m103138x51f5a1f7 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "TPAssetLoader can't find the request " + i17 + " with current loading requests");
            return;
        }
        m103138x51f5a1f7.m103157x902cfeb5();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "handleStopReadData, cancel the loading request with id " + i17);
        m103142x8890b56b(m103138x51f5a1f7);
        this.f53890xeaf1fb3c.mo101487x1455adec(m103138x51f5a1f7);
    }

    /* renamed from: removeRequest */
    private synchronized void m103142x8890b56b(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055 c26471x3d8a6055) {
        java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26471x3d8a6055> arrayList = this.f53888xa5c1d8f3;
        if (arrayList != null) {
            arrayList.remove(c26471x3d8a6055);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: fillInContentInformation */
    public void mo103113x5240871b() {
        if (this.f53890xeaf1fb3c == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "listener not set");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.C26245xdfa71862 c26245xdfa71862 = new com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.C26245xdfa71862();
        this.f53881x8f86ee40 = c26245xdfa71862;
        this.f53890xeaf1fb3c.mo101488x5240871b(c26245xdfa71862);
        com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.C26245xdfa71862 c26245xdfa718622 = this.f53881x8f86ee40;
        this.f53882x92db64a6 = c26245xdfa718622.f51347xe8ce5353;
        this.f53885xcd0a256e = c26245xdfa718622.f51349x71fc1cdb;
        this.f53879x17e1de2e = c26245xdfa718622.f51348x2342b98b;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "proxy start, mDataTotalSize: " + this.f53885xcd0a256e + " businessPath:" + this.f53879x17e1de2e);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getContentType */
    public java.lang.String mo103118xc2a49a1d(int i17, java.lang.String str, java.lang.String str2) {
        return this.f53882x92db64a6;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataFilePath */
    public java.lang.String mo103119x84354c01(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String m103135x99a27b17 = m103135x99a27b17();
        return !android.text.TextUtils.isEmpty(m103135x99a27b17) ? m103135x99a27b17 : m103136x1a2c2d23(this.f53883xd6cfe882, i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataTotalSize */
    public long mo103120x2f5bd925(int i17, java.lang.String str, java.lang.String str2) {
        return this.f53885xcd0a256e;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getM3U8Content */
    public java.lang.String mo103114x79c2649a(int i17, java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onReadData */
    public int mo103121x715d255f(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
        int min = (int) java.lang.Math.min(m103137xed32f629(j17), j18);
        if (min <= 0) {
            return -1;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "onReadData, fileId: " + i17 + " readOffset: " + j17 + " readLength:" + j18 + " readyLength:" + min);
        return min;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStartReadData */
    public int mo103122x6e58d43(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
        if (this.f53890xeaf1fb3c == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "listener not set");
            return 0;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onStartReadData, fileId:" + i17 + ", fileKey:" + str2 + ", requestStart:" + j17 + ", requestEnd:" + j18);
        int i18 = this.f53889xde67fac4 + 1;
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.StartReadDataParams startReadDataParams = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.StartReadDataParams();
        startReadDataParams.f53896x4d052313 = j17;
        startReadDataParams.f53895x235dfcc = j18;
        startReadDataParams.f53893xcd096f43 = str2;
        startReadDataParams.f53894xd425c627 = str;
        m103140x397fdd6e(256, i17, i18, startReadDataParams);
        this.f53889xde67fac4 = i18;
        return i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStopReadData */
    public int mo103123xfb96d801(int i17, java.lang.String str, java.lang.String str2, int i18) {
        if (this.f53890xeaf1fb3c == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "listener not set");
            return 0;
        }
        m103140x397fdd6e(257, i18, 0, null);
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: release */
    public void mo103115x41012807() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "release start");
        mo103116x6761d4f();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104417x408b7293(this.f53887x3e0f3a87, this.f53880x3852e6f2);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104417x408b7293(this.f53891xfbe25b66, null);
        this.f53887x3e0f3a87 = null;
        this.f53891xfbe25b66 = null;
        this.f53880x3852e6f2 = null;
        this.f53888xa5c1d8f3 = null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: reset */
    public void mo103116x6761d4f() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "reset start");
        m103134xb52e2740();
        this.f53885xcd0a256e = 0L;
        this.f53882x92db64a6 = "";
        this.f53879x17e1de2e = "";
        if (!android.text.TextUtils.isEmpty(this.f53884x63d92cec)) {
            try {
                new java.io.File(this.f53884x63d92cec).deleteOnExit();
                this.f53884x63d92cec = "";
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "reset, delete cache file has exception:" + e17.toString());
            }
        }
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5.EventHandler eventHandler = this.f53880x3852e6f2;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: setTPAssetResourceLoaderListener */
    public void mo103117x5d2e5f67(com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26242xd2a9d8e0 interfaceC26242xd2a9d8e0) {
        this.f53890xeaf1fb3c = interfaceC26242xd2a9d8e0;
    }
}
