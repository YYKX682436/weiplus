package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe;

/* renamed from: com.tencent.youtu.sdkkitframework.framework.YtFSM */
/* loaded from: classes14.dex */
public class C27897x51bf805 {
    private static final java.lang.String TAG = "YtFSM";

    /* renamed from: instance */
    private static com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805 f61707x21169495;

    /* renamed from: currentState */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb f61709x56e49a98;

    /* renamed from: eventListener */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener f61711xde76616e;

    /* renamed from: firstStateName */
    private java.lang.String f61713xce5655ec;

    /* renamed from: sdkPlatformContex */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKPlatformContext f61716x5e664492;

    /* renamed from: supportCodecJSONStr */
    public java.lang.String f61720x59b7b8c2;

    /* renamed from: updateEventHandler */
    private java.lang.Thread f61721x2585e2b9;

    /* renamed from: currentWorkMode */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode f61710x88621ced = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_UNKNOWN;

    /* renamed from: isStarted */
    private boolean f61714x6c5c87f7 = false;

    /* renamed from: needEventHandler */
    private boolean f61715x1126e706 = false;

    /* renamed from: stateMap */
    private java.util.HashMap<java.lang.String, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb> f61719x4e91d30b = new java.util.HashMap<>();

    /* renamed from: currentData */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMUpdateData f61708x23cebcc3 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMUpdateData();

    /* renamed from: stateLock */
    private java.util.concurrent.locks.Lock f61718x83a84d5c = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: startStopLock */
    private java.util.concurrent.locks.Lock f61717x6dc616cf = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: updateQueue */
    private java.util.concurrent.ConcurrentLinkedQueue<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMUpdateData> f61722xdd0d05c8 = new java.util.concurrent.ConcurrentLinkedQueue<>();

    /* renamed from: eventQueue */
    private java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> f61712x39e74697 = new java.util.concurrent.ConcurrentLinkedQueue<>();

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtFSM$YtFSMFireEventData */
    /* loaded from: classes14.dex */
    public class YtFSMFireEventData {

        /* renamed from: eventType */
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType f61728x1df98f4;

        /* renamed from: extraData */
        java.lang.Object f61729xf0df6fda;

        public YtFSMFireEventData(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
            this.f61728x1df98f4 = ytFrameworkFireEventType;
            this.f61729xf0df6fda = obj;
        }
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtFSM$YtFSMUpdateData */
    /* loaded from: classes14.dex */
    public class YtFSMUpdateData {

        /* renamed from: imageData */
        byte[] f61731xcba0e7a5;

        /* renamed from: imageHeight */
        int f61732x6e0c7662;

        /* renamed from: imageType */
        int f61733xcba88735;

        /* renamed from: imageWidth */
        int f61734xa98b352b;

        /* renamed from: timeStamp */
        long f61736x18638f6;

        private YtFSMUpdateData() {
        }
    }

    private C27897x51bf805() {
    }

    /* renamed from: clearInstance */
    public static synchronized void m120702xf5161202() {
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.class) {
            if (f61707x21169495 != null) {
                f61707x21169495 = null;
            }
        }
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805 m120703x9cf0d20b() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805 c27897x51bf805;
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.class) {
            if (f61707x21169495 == null) {
                f61707x21169495 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805();
            }
            c27897x51bf805 = f61707x21169495;
        }
        return c27897x51bf805;
    }

    /* renamed from: cleanUpQueue */
    public void m120704x5013f0ad() {
        this.f61722xdd0d05c8.clear();
    }

    /* renamed from: getContext */
    public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKPlatformContext m120705x76847179() {
        java.lang.String str = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "YtFSM#getContext");
        if (this.f61716x5e664492 == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "sdkPlatformContex == null");
            this.f61716x5e664492 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKPlatformContext();
        }
        return this.f61716x5e664492;
    }

    /* renamed from: getStateByName */
    public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d(java.lang.String str) {
        if (this.f61719x4e91d30b.containsKey(str)) {
            return this.f61719x4e91d30b.get(str);
        }
        return null;
    }

    /* renamed from: getWorkMode */
    public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode m120707x7deac1ca() {
        return this.f61710x88621ced;
    }

    /* renamed from: handleEvent */
    public void m120708x5797ad52(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
        try {
            this.f61712x39e74697.add(new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMFireEventData(ytFrameworkFireEventType, obj));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Handle event failed:" + e17.getLocalizedMessage());
        }
    }

    /* renamed from: handlePauseEvent */
    public void m120709x57a15e8c() {
        java.util.Iterator<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb> it = this.f61719x4e91d30b.values().iterator();
        while (it.hasNext()) {
            it.next().mo120732xb01dfb57();
        }
    }

    /* renamed from: handleResumeEvent */
    public void m120710x19d51f25() {
        java.util.Iterator<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb> it = this.f61719x4e91d30b.values().iterator();
        while (it.hasNext()) {
            it.next().mo120733x57429eec();
        }
    }

    /* renamed from: registerState */
    public int m120711xac7e53ae(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb abstractC27898x7ecec5bb) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120661xd8d5bb59(abstractC27898x7ecec5bb.m120727x564ba898());
        this.f61719x4e91d30b.put(abstractC27898x7ecec5bb.m120726x83167406(), abstractC27898x7ecec5bb);
        return 0;
    }

    /* renamed from: reset */
    public void m120712x6761d4f() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "FSM reset work mode " + this.f61710x88621ced);
        this.f61720x59b7b8c2 = null;
        try {
            this.f61712x39e74697.add("reset");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "handle reset failed:" + e17.getLocalizedMessage());
        }
    }

    /* renamed from: sendFSMEvent */
    public void m120713x2af1ece2(java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        if (this.f61711xde76616e == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Event listener not init");
            return;
        }
        if (hashMap.containsKey(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d)) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "send framework event result: " + hashMap.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d) + " errorcode:" + hashMap.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4));
        }
        this.f61711xde76616e.mo63470x53c0c6fb(hashMap);
    }

    /* renamed from: sendNetworkRequest */
    public void m120714xc6f9ce29(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        if (!android.text.TextUtils.isEmpty(this.f61720x59b7b8c2)) {
            m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.2
                {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61720x59b7b8c2);
                        jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61504xe0d52f05);
                    } catch (org.json.JSONException unused) {
                    }
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61545x271770a1, jSONObject.toString());
                }
            });
        }
        if (this.f61711xde76616e == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Event listener not init");
        } else {
            m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(str) { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.3

                /* renamed from: val$netType */
                final /* synthetic */ java.lang.String f61727xc798fbf4;

                {
                    this.f61727xc798fbf4 = str;
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, str);
                }
            });
            this.f61711xde76616e.mo63472x2ed2023a(str2, str3, hashMap, iYtSDKKitNetResponseParser);
        }
    }

    /* renamed from: setContext */
    public void m120715xe9f5beed(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKPlatformContext ytSDKPlatformContext) {
        this.f61716x5e664492 = ytSDKPlatformContext;
    }

    /* renamed from: setEventListener */
    public void m120716x2eac842c(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) {
        this.f61711xde76616e = iYtSDKKitFrameworkEventListener;
    }

    /* renamed from: start */
    public void m120717x68ac462(java.lang.String str, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, final int i17) {
        java.lang.String str2 = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str2, "FSM start use work mode " + ytSDKKitFrameworkWorkMode);
        try {
            try {
                this.f61717x6dc616cf.lock();
                if (!this.f61714x6c5c87f7) {
                    this.f61713xce5655ec = str;
                    this.f61710x88621ced = ytSDKKitFrameworkWorkMode;
                    this.f61714x6c5c87f7 = true;
                    this.f61715x1126e706 = true;
                    if (this.f61719x4e91d30b.containsKey(str)) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str2, "start set current state:" + str);
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb abstractC27898x7ecec5bb = this.f61719x4e91d30b.get(this.f61713xce5655ec);
                        this.f61709x56e49a98 = abstractC27898x7ecec5bb;
                        abstractC27898x7ecec5bb.mo120689x5c306d8();
                    } else {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(str2, "Start " + str + " failed which is not found");
                    }
                    this.f61722xdd0d05c8.clear();
                    java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.1
                        @Override // java.lang.Runnable
                        public void run() {
                            android.os.Process.setThreadPriority(i17);
                            while (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61715x1126e706) {
                                if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61714x6c5c87f7) {
                                    while (!com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61712x39e74697.isEmpty()) {
                                        java.lang.Object poll = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61712x39e74697.poll();
                                        if (poll instanceof java.lang.String) {
                                            if (((java.lang.String) poll).equals("reset")) {
                                                java.util.Iterator it = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61719x4e91d30b.values().iterator();
                                                while (it.hasNext()) {
                                                    ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) it.next()).mo120664x6761d4f();
                                                }
                                                if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61719x4e91d30b.containsKey(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61713xce5655ec)) {
                                                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.TAG, "reset set current state:" + com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61713xce5655ec);
                                                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805 c27897x51bf805 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this;
                                                    c27897x51bf805.f61709x56e49a98 = (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) c27897x51bf805.f61719x4e91d30b.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61713xce5655ec);
                                                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61709x56e49a98.mo120689x5c306d8();
                                                } else {
                                                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.TAG, "reset failed: " + com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61713xce5655ec + " state is not found");
                                                }
                                                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61722xdd0d05c8.clear();
                                            }
                                        } else if (poll instanceof com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMFireEventData) {
                                            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMFireEventData ytFSMFireEventData = (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMFireEventData) poll;
                                            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.TAG, "handleevent " + ytFSMFireEventData.f61728x1df98f4 + " for all states");
                                            java.util.Iterator it6 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61719x4e91d30b.values().iterator();
                                            while (it6.hasNext()) {
                                                ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) it6.next()).mo120728x5797ad52(ytFSMFireEventData.f61728x1df98f4, ytFSMFireEventData.f61729xf0df6fda);
                                            }
                                        }
                                    }
                                    try {
                                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61718x83a84d5c.lock();
                                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMUpdateData ytFSMUpdateData = (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMUpdateData) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61722xdd0d05c8.poll();
                                        if (ytFSMUpdateData != null) {
                                            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61708x23cebcc3 = ytFSMUpdateData;
                                            if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61709x56e49a98 != null) {
                                                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61709x56e49a98.mo120735xce0038c9(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61708x23cebcc3.f61731xcba0e7a5, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61708x23cebcc3.f61734xa98b352b, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61708x23cebcc3.f61732x6e0c7662, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61708x23cebcc3.f61733xcba88735, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61708x23cebcc3.f61736x18638f6);
                                            }
                                        }
                                    } finally {
                                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.this.f61718x83a84d5c.unlock();
                                    }
                                }
                                try {
                                    java.lang.Thread.sleep(5L);
                                } catch (java.lang.InterruptedException unused) {
                                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.TAG, "sleep failed");
                                }
                            }
                        }
                    });
                    this.f61721x2585e2b9 = thread;
                    thread.setName("YtEventUpdateThread");
                    this.f61721x2585e2b9.start();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, e17.getLocalizedMessage());
            }
        } finally {
            this.f61717x6dc616cf.unlock();
        }
    }

    /* renamed from: stop */
    public void m120718x360802() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "FSM stop work mode " + this.f61710x88621ced);
        try {
            try {
                this.f61717x6dc616cf.lock();
                this.f61715x1126e706 = false;
                java.lang.Thread thread = this.f61721x2585e2b9;
                if (thread != null && thread.isAlive()) {
                    this.f61721x2585e2b9.join();
                }
                if (this.f61714x6c5c87f7) {
                    this.f61714x6c5c87f7 = false;
                    java.util.Iterator<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb> it = this.f61719x4e91d30b.values().iterator();
                    while (it.hasNext()) {
                        it.next().mo120734xcde7deff();
                    }
                    this.f61719x4e91d30b.clear();
                    this.f61722xdd0d05c8.clear();
                }
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, e17.getLocalizedMessage());
            }
        } finally {
            this.f61717x6dc616cf.unlock();
        }
    }

    /* renamed from: transitNextRound */
    public int m120719x424c1dc8(java.lang.String str) {
        if (!this.f61719x4e91d30b.containsKey(str)) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "transitnextround faild:" + str + " state is not found");
            return -1;
        }
        this.f61709x56e49a98.mo120724x2fb91e();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "transitnextround set current state:" + str);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb abstractC27898x7ecec5bb = this.f61719x4e91d30b.get(str);
        this.f61709x56e49a98 = abstractC27898x7ecec5bb;
        abstractC27898x7ecec5bb.mo120689x5c306d8();
        return 0;
    }

    /* renamed from: transitNow */
    public int m120720x993b0803(java.lang.String str) {
        if (!this.f61719x4e91d30b.containsKey(str)) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "transitnow failed:" + str + " state is not found");
            return -1;
        }
        this.f61709x56e49a98.mo120724x2fb91e();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "transitnow set current state:" + str);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb abstractC27898x7ecec5bb = this.f61719x4e91d30b.get(str);
        this.f61709x56e49a98 = abstractC27898x7ecec5bb;
        abstractC27898x7ecec5bb.mo120689x5c306d8();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMUpdateData ytFSMUpdateData = this.f61708x23cebcc3;
        if (ytFSMUpdateData != null) {
            this.f61709x56e49a98.mo120735xce0038c9(ytFSMUpdateData.f61731xcba0e7a5, ytFSMUpdateData.f61734xa98b352b, ytFSMUpdateData.f61732x6e0c7662, ytFSMUpdateData.f61733xcba88735, ytFSMUpdateData.f61736x18638f6);
        }
        return 0;
    }

    /* renamed from: update */
    public void m120721xce0038c9(byte[] bArr, int i17, int i18, int i19, long j17) {
        if (this.f61714x6c5c87f7) {
            if (bArr == null) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.w(TAG, "imageData == null");
                return;
            }
            if (bArr.length == 0) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.w(TAG, "imageData.length == 0");
                return;
            }
            if (!this.f61722xdd0d05c8.isEmpty()) {
                this.f61722xdd0d05c8.clear();
            }
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMUpdateData ytFSMUpdateData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.YtFSMUpdateData();
            ytFSMUpdateData.f61731xcba0e7a5 = (byte[]) bArr.clone();
            ytFSMUpdateData.f61734xa98b352b = i17;
            ytFSMUpdateData.f61732x6e0c7662 = i18;
            ytFSMUpdateData.f61733xcba88735 = i19;
            ytFSMUpdateData.f61736x18638f6 = j17;
            this.f61722xdd0d05c8.add(ytFSMUpdateData);
        }
    }

    /* renamed from: updateSDKSetting */
    public void m120722x1b37865f(org.json.JSONObject jSONObject) {
        java.util.Iterator<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb> it = this.f61719x4e91d30b.values().iterator();
        while (it.hasNext()) {
            it.next().mo120737x1b37865f(jSONObject);
        }
    }
}
