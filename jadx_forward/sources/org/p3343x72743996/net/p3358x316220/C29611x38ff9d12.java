package org.p3343x72743996.net.p3358x316220;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "cronet")
/* renamed from: org.chromium.net.impl.CronetUrlRequestContext */
/* loaded from: classes16.dex */
public class C29611x38ff9d12 extends org.p3343x72743996.net.p3358x316220.AbstractC29598xc5af37f0 {

    /* renamed from: LOG_TAG */
    static final java.lang.String f74698x3f3d67df = "CronetUrlRequestContext";

    /* renamed from: sInUseStoragePaths */
    private static final java.util.HashSet<java.lang.String> f74699xdf413a42 = new java.util.HashSet<>();

    /* renamed from: mActiveRequestCount */
    private final java.util.concurrent.atomic.AtomicInteger f74700x49378533;

    /* renamed from: mCronetEngineId */
    private final int f74701xe67537a7;

    /* renamed from: mDownstreamThroughputKbps */
    private int f74702x1db44fb3;

    /* renamed from: mEffectiveConnectionType */
    private int f74703x7a901592;

    /* renamed from: mEnableTelemetry */
    private final boolean f74704x799cd149;

    /* renamed from: mFinishedListenerLock */
    private final java.lang.Object f74705x680a399e;

    /* renamed from: mFinishedListenerMap */
    private final java.util.Map<org.p3343x72743996.net.AbstractC29554xec05c04f.Listener, org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.RequestFinishedInfoListener> f74706x98005689;

    /* renamed from: mHttpRttMs */
    private int f74707x84b85623;

    /* renamed from: mInUseStoragePath */
    private final java.lang.String f74708xb7dd9c4b;

    /* renamed from: mInitCompleted */
    private final android.os.ConditionVariable f74709x64086bae;

    /* renamed from: mIsLogging */
    private boolean f74710x6c8f5ce8;

    /* renamed from: mIsStoppingNetLog */
    private boolean f74711xf74e1052;

    /* renamed from: mLock */
    private final java.lang.Object f74712x6243b38;

    /* renamed from: mLogger */
    private final org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd f74713xe041c5d;

    /* renamed from: mNetworkHandle */
    private long f74714xec9e289;

    /* renamed from: mNetworkQualityEstimatorEnabled */
    private final boolean f74715x7345d27f;

    /* renamed from: mNetworkQualityLock */
    private final java.lang.Object f74716xe2e58309;

    /* renamed from: mNetworkThread */
    private java.lang.Thread f74717x23a8826b;

    /* renamed from: mRttListenerList */
    private final org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityRttListenerWrapper> f74718xef5492d7;

    /* renamed from: mRunningRequestCount */
    private final java.util.concurrent.atomic.AtomicInteger f74719x21c28172;

    /* renamed from: mStopNetLogCompleted */
    private final android.os.ConditionVariable f74720xdfb8d395;

    /* renamed from: mThroughputListenerList */
    private final org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityThroughputListenerWrapper> f74721x68293789;

    /* renamed from: mTransportRttMs */
    private int f74722x78e323dc;

    /* renamed from: mUrlRequestContextAdapter */
    private long f74723x8d42e6d;

    /* renamed from: org.chromium.net.impl.CronetUrlRequestContext$Natives */
    /* loaded from: classes16.dex */
    public interface Natives {
        /* renamed from: addPkp */
        void mo154222xab35f174(long j17, java.lang.String str, byte[][] bArr, boolean z17, long j18);

        /* renamed from: addQuicHint */
        void mo154223x864dd1a6(long j17, java.lang.String str, int i17, int i18);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetContextAdapter")
        /* renamed from: configureNetworkQualityEstimatorForTesting */
        void mo154224x1bbc11b0(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, boolean z17, boolean z18, boolean z19);

        /* renamed from: createRequestContextAdapter */
        long mo154225x9b400f73(long j17);

        /* renamed from: createRequestContextConfig */
        long mo154226xc6fc029e(byte[] bArr);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetContextAdapter")
        /* renamed from: destroy */
        void mo154227x5cd39ffa(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetContextAdapter")
        /* renamed from: getEnableTelemetry */
        boolean mo154228x8e507340(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12);

        /* renamed from: getHistogramDeltas */
        byte[] mo154229xe62be009();

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetContextAdapter")
        /* renamed from: initRequestContextOnInitThread */
        void mo154230x90ab4fe9(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetContextAdapter")
        /* renamed from: provideRTTObservations */
        void mo154231xe6f8d078(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, boolean z17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetContextAdapter")
        /* renamed from: provideThroughputObservations */
        void mo154232xff2c6512(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, boolean z17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetContextAdapter")
        /* renamed from: startNetLogToDisk */
        void mo154233xdb787381(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, java.lang.String str, boolean z17, int i17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetContextAdapter")
        /* renamed from: startNetLogToFile */
        boolean mo154234xdb795b60(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, java.lang.String str, boolean z17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetContextAdapter")
        /* renamed from: stopNetLog */
        void mo154235xa63bab09(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12);
    }

    public C29611x38ff9d12(org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c abstractC29599x8a199e5c) {
        boolean mo154228x8e507340;
        java.lang.Object obj = new java.lang.Object();
        this.f74712x6243b38 = obj;
        this.f74709x64086bae = new android.os.ConditionVariable(false);
        this.f74719x21c28172 = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f74700x49378533 = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f74716xe2e58309 = new java.lang.Object();
        this.f74705x680a399e = new java.lang.Object();
        this.f74703x7a901592 = 0;
        this.f74707x84b85623 = -1;
        this.f74722x78e323dc = -1;
        this.f74702x1db44fb3 = -1;
        org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityRttListenerWrapper> c29324xf28570b4 = new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<>();
        this.f74718xef5492d7 = c29324xf28570b4;
        org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityThroughputListenerWrapper> c29324xf28570b42 = new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<>();
        this.f74721x68293789 = c29324xf28570b42;
        this.f74706x98005689 = new java.util.HashMap();
        this.f74720xdfb8d395 = new android.os.ConditionVariable();
        this.f74714xec9e289 = -1L;
        this.f74701xe67537a7 = hashCode();
        c29324xf28570b4.m152534x1ffc867b();
        c29324xf28570b42.m152534x1ffc867b();
        this.f74715x7345d27f = abstractC29599x8a199e5c.m154055xa1be02b2();
        org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154074x44063fb6(abstractC29599x8a199e5c.m154047x76847179(), abstractC29599x8a199e5c);
        if (abstractC29599x8a199e5c.m154052xfebfc9d() == 1) {
            java.lang.String m154062xe0aa6540 = abstractC29599x8a199e5c.m154062xe0aa6540();
            this.f74708xb7dd9c4b = m154062xe0aa6540;
            java.util.HashSet<java.lang.String> hashSet = f74699xdf413a42;
            synchronized (hashSet) {
                if (!hashSet.add(m154062xe0aa6540)) {
                    throw new java.lang.IllegalStateException("Disk cache storage path already in use");
                }
            }
        } else {
            this.f74708xb7dd9c4b = null;
        }
        synchronized (obj) {
            long mo154225x9b400f73 = org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154225x9b400f73(m154199x7de38dde(abstractC29599x8a199e5c));
            this.f74723x8d42e6d = mo154225x9b400f73;
            if (mo154225x9b400f73 == 0) {
                throw new java.lang.NullPointerException("Context Adapter creation failed.");
            }
            mo154228x8e507340 = org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154228x8e507340(this.f74723x8d42e6d, this);
            this.f74704x799cd149 = mo154228x8e507340;
        }
        if (mo154228x8e507340) {
            this.f74713xe041c5d = org.p3343x72743996.net.p3358x316220.C29604x48d9c87d.m154123x4f4cd5ac(abstractC29599x8a199e5c.m154047x76847179(), m154201xd1dbc0ae());
        } else {
            this.f74713xe041c5d = org.p3343x72743996.net.p3358x316220.C29604x48d9c87d.m154124x693dd5ce();
        }
        try {
            this.f74713xe041c5d.mo154091xf02a51c2(m154211xce59fad0(), new org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetEngineBuilderInfo(abstractC29599x8a199e5c), m154196x2ed6e68d(), m154201xd1dbc0ae());
        } catch (java.lang.RuntimeException e17) {
            org.p3343x72743996.p3344x2e06d1.Log.e(f74698x3f3d67df, "Error while trying to log CronetEngine creation: ", (java.lang.Throwable) e17);
        }
        org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154082xccb59cd5(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.1
            @Override // java.lang.Runnable
            public void run() {
                org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154076x1c2a654f();
                synchronized (org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.this.f74712x6243b38) {
                    org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154230x90ab4fe9(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.this.f74723x8d42e6d, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.this);
                }
            }
        });
    }

    /* renamed from: buildCronetVersion */
    private org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetVersion m154196x2ed6e68d() {
        return new org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetVersion(mo153156xeb8c2353().split("/")[1].split("@")[0]);
    }

    /* renamed from: checkHaveAdapter */
    private void m154197x2f25629f() {
        if (!m154202xbf13aa87()) {
            throw new java.lang.IllegalStateException("Engine is shut down.");
        }
    }

    /* renamed from: convertConnectionTypeToApiValue */
    private static int m154198xefc4613d(int i17) {
        if (i17 == 0) {
            return 0;
        }
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    i18 = 4;
                    if (i17 != 4) {
                        if (i17 == 5) {
                            return 5;
                        }
                        throw new java.lang.RuntimeException("Internal Error: Illegal EffectiveConnectionType value " + i17);
                    }
                }
            }
        }
        return i18;
    }

    /* renamed from: createNativeUrlRequestContextConfig */
    public static long m154199x7de38dde(org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c abstractC29599x8a199e5c) {
        long mo154226xc6fc029e = org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154226xc6fc029e(m154200x9d968e20(abstractC29599x8a199e5c).mo20648x5f01b1f6());
        if (mo154226xc6fc029e == 0) {
            throw new java.lang.IllegalArgumentException("Experimental options parsing failed.");
        }
        for (org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.QuicHint quicHint : abstractC29599x8a199e5c.m154060x4ba4972e()) {
            org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154223x864dd1a6(mo154226xc6fc029e, quicHint.f74550x6226bb5, quicHint.f74551x6260e8e, quicHint.f74549x525e88ae);
        }
        for (org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c.Pkp pkp : abstractC29599x8a199e5c.m154058x1acd59d4()) {
            org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154222xab35f174(mo154226xc6fc029e, pkp.f74547x6226bb5, pkp.f74546x670e909, pkp.f74548x92f783ca, pkp.f74545xded5c8ca.getTime());
        }
        return mo154226xc6fc029e;
    }

    /* renamed from: createRequestContextConfigOptions */
    private static org.p3343x72743996.net.C29552x11bcec9c m154200x9d968e20(org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c abstractC29599x8a199e5c) {
        org.p3343x72743996.net.C29552x11bcec9c.Builder m153618x9af0845a = org.p3343x72743996.net.C29552x11bcec9c.m153528x3136c9db().m153621xce2d5961(abstractC29599x8a199e5c.m154059x5df19f23()).m153614xb8274b9(abstractC29599x8a199e5c.m154050x7446e737()).m153608x776d672d(abstractC29599x8a199e5c.m154044x2737446f()).m153610x5ae4bafc(abstractC29599x8a199e5c.m154045x8c42ac1e()).m153616x60221f5b(abstractC29599x8a199e5c.m154052xfebfc9d()).m153615xc0e46cd(abstractC29599x8a199e5c.m154051xc0394a4b()).m153617x9d063446(abstractC29599x8a199e5c.m154054x513137c4()).m153611x7f7c274a(abstractC29599x8a199e5c.m154055xa1be02b2()).m153609xad0f6385(abstractC29599x8a199e5c.m154057xd21c567e()).m153618x9af0845a(abstractC29599x8a199e5c.m154063xa20241ce(10));
        if (abstractC29599x8a199e5c.m154049x11fd7f44() != null) {
            m153618x9af0845a.m153624x6e513fb8(abstractC29599x8a199e5c.m154049x11fd7f44());
        }
        if (abstractC29599x8a199e5c.m154062xe0aa6540() != null) {
            m153618x9af0845a.m153622x50e61f7e(abstractC29599x8a199e5c.m154062xe0aa6540());
        }
        if (abstractC29599x8a199e5c.m154048xc345c20c() != null) {
            m153618x9af0845a.m153619xa79dad94(abstractC29599x8a199e5c.m154048xc345c20c());
        }
        if (abstractC29599x8a199e5c.m154046x953d6c96() != null) {
            m153618x9af0845a.m153612x3bb208d4(abstractC29599x8a199e5c.m154046x953d6c96());
        }
        return (org.p3343x72743996.net.C29552x11bcec9c) m153618x9af0845a.mo20556x59bc66e();
    }

    /* renamed from: getCronetSource */
    public static org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetSource m154201xd1dbc0ae() {
        java.lang.ClassLoader classLoader = org.p3343x72743996.net.p3358x316220.C29609x93734ddd.class.getClassLoader();
        return classLoader.toString().startsWith("java.lang.BootClassLoader") ? org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetSource.CRONET_SOURCE_PLATFORM : org.p3343x72743996.net.AbstractC29500x62bc147f.class.getClassLoader().equals(classLoader) ? org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetSource.CRONET_SOURCE_STATICALLY_LINKED : org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd.CronetSource.CRONET_SOURCE_PLAY_SERVICES;
    }

    /* renamed from: haveRequestContextAdapter */
    private boolean m154202xbf13aa87() {
        return this.f74723x8d42e6d != 0;
    }

    /* renamed from: initNetworkThread */
    private void m154203x2e10fea8() {
        this.f74717x23a8826b = java.lang.Thread.currentThread();
        this.f74709x64086bae.open();
        java.lang.Thread.currentThread().setName("ChromiumNet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$postObservationTaskToExecutor$0 */
    public static /* synthetic */ void m154204x51176e4e(java.lang.Runnable runnable, org.p3343x72743996.net.p3358x316220.C29627xdcc09601 c29627xdcc09601) {
        try {
            try {
                runnable.run();
                if (c29627xdcc09601 == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                org.p3343x72743996.p3344x2e06d1.Log.e(f74698x3f3d67df, "Exception thrown from observation task", (java.lang.Throwable) e17);
                if (c29627xdcc09601 == null) {
                    return;
                }
            }
            c29627xdcc09601.m154260x23e5cc93();
        } catch (java.lang.Throwable th6) {
            if (c29627xdcc09601 != null) {
                c29627xdcc09601.m154260x23e5cc93();
            }
            throw th6;
        }
    }

    /* renamed from: onEffectiveConnectionTypeChanged */
    private void m154205xeba256b4(int i17) {
        synchronized (this.f74716xe2e58309) {
            this.f74703x7a901592 = i17;
        }
    }

    /* renamed from: onRTTOrThroughputEstimatesComputed */
    private void m154206xbd738c38(int i17, int i18, int i19) {
        synchronized (this.f74716xe2e58309) {
            this.f74707x84b85623 = i17;
            this.f74722x78e323dc = i18;
            this.f74702x1db44fb3 = i19;
        }
    }

    /* renamed from: onRttObservation */
    private void m154207xbe23d219(final int i17, final long j17, final int i18) {
        synchronized (this.f74716xe2e58309) {
            java.util.Iterator<org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityRttListenerWrapper> it = this.f74718xef5492d7.iterator();
            while (it.hasNext()) {
                final org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityRttListenerWrapper next = it.next();
                m154209xbacd125f(next.mo153437xf5a03649(), new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.2
                    @Override // java.lang.Runnable
                    public void run() {
                        next.mo153438xbe23d219(i17, j17, i18);
                    }
                });
            }
        }
    }

    /* renamed from: onThroughputObservation */
    private void m154208xe09b5f03(final int i17, final long j17, final int i18) {
        synchronized (this.f74716xe2e58309) {
            java.util.Iterator<org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityThroughputListenerWrapper> it = this.f74721x68293789.iterator();
            while (it.hasNext()) {
                final org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityThroughputListenerWrapper next = it.next();
                m154209xbacd125f(next.mo153439xf5a03649(), new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.3
                    @Override // java.lang.Runnable
                    public void run() {
                        next.mo153440xe09b5f03(i17, j17, i18);
                    }
                });
            }
        }
    }

    /* renamed from: postObservationTaskToExecutor */
    private static void m154210xbacd125f(java.util.concurrent.Executor executor, final java.lang.Runnable runnable, final org.p3343x72743996.net.p3358x316220.C29627xdcc09601 c29627xdcc09601) {
        if (c29627xdcc09601 != null) {
            c29627xdcc09601.m154261xb0268b6f();
        }
        try {
            executor.execute(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.m154204x51176e4e(runnable, c29627xdcc09601);
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            if (c29627xdcc09601 != null) {
                c29627xdcc09601.m154260x23e5cc93();
            }
            org.p3343x72743996.p3344x2e06d1.Log.e(f74698x3f3d67df, "Exception posting task to executor", (java.lang.Throwable) e17);
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: addRequestFinishedListener */
    public void mo153144x41aca14(org.p3343x72743996.net.AbstractC29554xec05c04f.Listener listener) {
        synchronized (this.f74705x680a399e) {
            this.f74706x98005689.put(listener, new org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.RequestFinishedInfoListener(listener));
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: addRttListener */
    public void mo153145xa73e81e5(org.p3343x72743996.net.AbstractC29537x1d237975 abstractC29537x1d237975) {
        if (!this.f74715x7345d27f) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f74716xe2e58309) {
            if (this.f74718xef5492d7.m152536x7aab3243()) {
                synchronized (this.f74712x6243b38) {
                    m154197x2f25629f();
                    org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154231xe6f8d078(this.f74723x8d42e6d, this, true);
                }
            }
            this.f74718xef5492d7.m152532xdab4fe97(new org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityRttListenerWrapper(abstractC29537x1d237975));
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: addThroughputListener */
    public void mo153146xe3ab837f(org.p3343x72743996.net.AbstractC29538x763be9ef abstractC29538x763be9ef) {
        if (!this.f74715x7345d27f) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f74716xe2e58309) {
            if (this.f74721x68293789.m152536x7aab3243()) {
                synchronized (this.f74712x6243b38) {
                    m154197x2f25629f();
                    org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154232xff2c6512(this.f74723x8d42e6d, this, true);
                }
            }
            this.f74721x68293789.m152532xdab4fe97(new org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityThroughputListenerWrapper(abstractC29538x763be9ef));
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: bindToNetwork */
    public void mo153147x5f2b2376(long j17) {
        this.f74714xec9e289 = j17;
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: configureNetworkQualityEstimatorForTesting */
    public void mo153148x1bbc11b0(boolean z17, boolean z18, boolean z19) {
        if (!this.f74715x7345d27f) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f74712x6243b38) {
            m154197x2f25629f();
            org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154224x1bbc11b0(this.f74723x8d42e6d, this, z17, z18, z19);
        }
    }

    @Override // org.p3343x72743996.net.p3358x316220.AbstractC29598xc5af37f0
    /* renamed from: createBidirectionalStream */
    public org.p3343x72743996.net.AbstractC29506xd5b5287b mo154040x28d1ac07(java.lang.String str, org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback callback, java.util.concurrent.Executor executor, java.lang.String str2, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list, int i17, boolean z17, java.util.Collection<java.lang.Object> collection, boolean z18, int i18, boolean z19, int i19, long j17) {
        long j18 = j17 == -1 ? this.f74714xec9e289 : j17;
        synchronized (this.f74712x6243b38) {
            try {
                try {
                    m154197x2f25629f();
                    return new org.p3343x72743996.net.p3358x316220.C29595x3307af86(this, str, i17, callback, executor, str2, list, z17, collection, z18, i18, z19, i19, j18);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    @Override // org.p3343x72743996.net.p3358x316220.AbstractC29598xc5af37f0
    /* renamed from: createRequest */
    public org.p3343x72743996.net.p3358x316220.AbstractC29629x1bdcd131 mo154041xc73615f3(java.lang.String str, org.p3343x72743996.net.AbstractC29563x9a627640.Callback callback, java.util.concurrent.Executor executor, int i17, java.util.Collection<java.lang.Object> collection, boolean z17, boolean z18, boolean z19, boolean z27, int i18, boolean z28, int i19, org.p3343x72743996.net.AbstractC29554xec05c04f.Listener listener, int i27, long j17) {
        long j18 = j17 == -1 ? this.f74714xec9e289 : j17;
        synchronized (this.f74712x6243b38) {
            try {
                try {
                    m154197x2f25629f();
                    return new org.p3343x72743996.net.p3358x316220.C29609x93734ddd(this, str, i17, callback, executor, collection, z17, z18, z19, z27, i18, z28, i19, listener, i27, j18);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: createURLStreamHandlerFactory */
    public java.net.URLStreamHandlerFactory mo153149x1f54973() {
        return new org.p3343x72743996.net.p3359x113d858d.C29645x326f7572(this);
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: getActiveRequestCount */
    public int mo153150x5d448bdc() {
        return this.f74700x49378533.get();
    }

    /* renamed from: getCronetEngineId */
    public int m154211xce59fad0() {
        return this.f74701xe67537a7;
    }

    /* renamed from: getCronetLogger */
    public org.p3343x72743996.net.p3358x316220.AbstractC29603x6ebc0fcd m154212xc5e34e23() {
        return this.f74713xe041c5d;
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: getDownstreamThroughputKbps */
    public int mo153151x8561f39c() {
        int i17;
        if (!this.f74715x7345d27f) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f74716xe2e58309) {
            i17 = this.f74702x1db44fb3;
            if (i17 == -1) {
                i17 = -1;
            }
        }
        return i17;
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: getEffectiveConnectionType */
    public int mo153152x4419d089() {
        int m154198xefc4613d;
        if (!this.f74715x7345d27f) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f74716xe2e58309) {
            m154198xefc4613d = m154198xefc4613d(this.f74703x7a901592);
        }
        return m154198xefc4613d;
    }

    /* renamed from: getEnableTelemetryForTesting */
    public boolean m154213x46403867() {
        return this.f74704x799cd149;
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: getGlobalMetricsDeltas */
    public byte[] mo153153xeeadd445() {
        return org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154229xe62be009();
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: getHttpRttMs */
    public int mo153154x96e7d5a() {
        int i17;
        if (!this.f74715x7345d27f) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f74716xe2e58309) {
            i17 = this.f74707x84b85623;
            if (i17 == -1) {
                i17 = -1;
            }
        }
        return i17;
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: getTransportRttMs */
    public int mo153155x60c7e705() {
        int i17;
        if (!this.f74715x7345d27f) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f74716xe2e58309) {
            i17 = this.f74722x78e323dc;
            if (i17 == -1) {
                i17 = -1;
            }
        }
        return i17;
    }

    /* renamed from: getUrlRequestContextAdapter */
    public long m154214x7081d256() {
        long j17;
        synchronized (this.f74712x6243b38) {
            m154197x2f25629f();
            j17 = this.f74723x8d42e6d;
        }
        return j17;
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: getVersionString */
    public java.lang.String mo153156xeb8c2353() {
        return "Cronet/" + org.p3343x72743996.net.p3358x316220.C29616xa1995678.m154244xb7483551();
    }

    /* renamed from: hasRequestFinishedListener */
    public boolean m154215x489287fb() {
        boolean z17;
        synchronized (this.f74705x680a399e) {
            z17 = !this.f74706x98005689.isEmpty();
        }
        return z17;
    }

    /* renamed from: isNetworkThread */
    public boolean m154216x49d9d0ce(java.lang.Thread thread) {
        return thread == this.f74717x23a8826b;
    }

    @Override // org.p3343x72743996.net.p3358x316220.AbstractC29598xc5af37f0, org.p3343x72743996.net.AbstractC29507xc7c0f987, org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: newUrlRequestBuilder */
    public /* bridge */ /* synthetic */ org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153158x92e7539b(java.lang.String str, org.p3343x72743996.net.AbstractC29563x9a627640.Callback callback, java.util.concurrent.Executor executor) {
        return super.mo153158x92e7539b(str, callback, executor);
    }

    /* renamed from: onRequestDestroyed */
    public void m154217xd847e849() {
        this.f74719x21c28172.decrementAndGet();
    }

    /* renamed from: onRequestFinished */
    public void m154218x1d116842() {
        this.f74700x49378533.decrementAndGet();
    }

    /* renamed from: onRequestStarted */
    public void m154219x4f165eb1() {
        this.f74700x49378533.incrementAndGet();
        this.f74719x21c28172.incrementAndGet();
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: openConnection */
    public java.net.URLConnection mo153159x946eacc8(java.net.URL url) {
        return mo153235x946eacc8(url, java.net.Proxy.NO_PROXY);
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: removeRequestFinishedListener */
    public void mo153160x34f41ad1(org.p3343x72743996.net.AbstractC29554xec05c04f.Listener listener) {
        synchronized (this.f74705x680a399e) {
            this.f74706x98005689.remove(listener);
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: removeRttListener */
    public void mo153161xfae54622(org.p3343x72743996.net.AbstractC29537x1d237975 abstractC29537x1d237975) {
        if (!this.f74715x7345d27f) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f74716xe2e58309) {
            if (this.f74718xef5492d7.m152537xb5bdeb7a(new org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityRttListenerWrapper(abstractC29537x1d237975)) && this.f74718xef5492d7.m152536x7aab3243()) {
                synchronized (this.f74712x6243b38) {
                    m154197x2f25629f();
                    org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154231xe6f8d078(this.f74723x8d42e6d, this, false);
                }
            }
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: removeThroughputListener */
    public void mo153162x7047f0a2(org.p3343x72743996.net.AbstractC29538x763be9ef abstractC29538x763be9ef) {
        if (!this.f74715x7345d27f) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f74716xe2e58309) {
            if (this.f74721x68293789.m152537xb5bdeb7a(new org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.NetworkQualityThroughputListenerWrapper(abstractC29538x763be9ef)) && this.f74721x68293789.m152536x7aab3243()) {
                synchronized (this.f74712x6243b38) {
                    m154197x2f25629f();
                    org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154232xff2c6512(this.f74723x8d42e6d, this, false);
                }
            }
        }
    }

    /* renamed from: reportRequestFinished */
    public void m154220x8d3cec4d(final org.p3343x72743996.net.AbstractC29554xec05c04f abstractC29554xec05c04f, org.p3343x72743996.net.p3358x316220.C29627xdcc09601 c29627xdcc09601) {
        synchronized (this.f74705x680a399e) {
            if (this.f74706x98005689.isEmpty()) {
                return;
            }
            java.util.Iterator it = new java.util.ArrayList(this.f74706x98005689.values()).iterator();
            while (it.hasNext()) {
                final org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.RequestFinishedInfoListener requestFinishedInfoListener = (org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.RequestFinishedInfoListener) it.next();
                m154210xbacd125f(requestFinishedInfoListener.mo153632xf5a03649(), new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.4
                    @Override // java.lang.Runnable
                    public void run() {
                        requestFinishedInfoListener.mo153633x1d116842(abstractC29554xec05c04f);
                    }
                }, c29627xdcc09601);
            }
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: shutdown */
    public void mo153163xf5e80656() {
        if (this.f74708xb7dd9c4b != null) {
            java.util.HashSet<java.lang.String> hashSet = f74699xdf413a42;
            synchronized (hashSet) {
                hashSet.remove(this.f74708xb7dd9c4b);
            }
        }
        synchronized (this.f74712x6243b38) {
            m154197x2f25629f();
            if (this.f74719x21c28172.get() != 0) {
                throw new java.lang.IllegalStateException("Cannot shutdown with running requests.");
            }
            if (java.lang.Thread.currentThread() == this.f74717x23a8826b) {
                throw new java.lang.IllegalThreadStateException("Cannot shutdown from network thread.");
            }
        }
        this.f74709x64086bae.block();
        mo153166xa63bab09();
        synchronized (this.f74712x6243b38) {
            if (m154202xbf13aa87()) {
                org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154227x5cd39ffa(this.f74723x8d42e6d, this);
                this.f74723x8d42e6d = 0L;
            }
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: startNetLogToDisk */
    public void mo153164xdb787381(java.lang.String str, boolean z17, int i17) {
        synchronized (this.f74712x6243b38) {
            m154197x2f25629f();
            if (this.f74710x6c8f5ce8) {
                return;
            }
            org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154233xdb787381(this.f74723x8d42e6d, this, str, z17, i17);
            this.f74710x6c8f5ce8 = true;
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: startNetLogToFile */
    public void mo153165xdb795b60(java.lang.String str, boolean z17) {
        synchronized (this.f74712x6243b38) {
            m154197x2f25629f();
            if (this.f74710x6c8f5ce8) {
                return;
            }
            if (!org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154234xdb795b60(this.f74723x8d42e6d, this, str, z17)) {
                throw new java.lang.RuntimeException("Unable to start NetLog");
            }
            this.f74710x6c8f5ce8 = true;
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: stopNetLog */
    public void mo153166xa63bab09() {
        synchronized (this.f74712x6243b38) {
            m154197x2f25629f();
            if (this.f74710x6c8f5ce8 && !this.f74711xf74e1052) {
                org.p3343x72743996.net.p3358x316220.C29613xfa089533.get().mo154235xa63bab09(this.f74723x8d42e6d, this);
                this.f74711xf74e1052 = true;
                this.f74720xdfb8d395.block();
                this.f74720xdfb8d395.close();
                synchronized (this.f74712x6243b38) {
                    this.f74711xf74e1052 = false;
                    this.f74710x6c8f5ce8 = false;
                }
            }
        }
    }

    /* renamed from: stopNetLogCompleted */
    public void m154221xf51cc542() {
        this.f74720xdfb8d395.open();
    }

    @Override // org.p3343x72743996.net.p3358x316220.AbstractC29598xc5af37f0, org.p3343x72743996.net.AbstractC29507xc7c0f987, org.p3343x72743996.net.AbstractC29500x62bc147f
    /* renamed from: newBidirectionalStreamBuilder */
    public org.p3343x72743996.net.AbstractC29506xd5b5287b.Builder mo153157xd26a5938(java.lang.String str, org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback callback, java.util.concurrent.Executor executor) {
        return new org.p3343x72743996.net.p3358x316220.C29592xf0dcc1d8(str, callback, executor, this);
    }

    @Override // org.p3343x72743996.net.AbstractC29507xc7c0f987
    /* renamed from: openConnection */
    public java.net.URLConnection mo153235x946eacc8(java.net.URL url, java.net.Proxy proxy) {
        if (proxy.type() == java.net.Proxy.Type.DIRECT) {
            java.lang.String protocol = url.getProtocol();
            if (!"http".equals(protocol) && !"https".equals(protocol)) {
                throw new java.lang.UnsupportedOperationException("Unexpected protocol:" + protocol);
            }
            return new org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8(url, this);
        }
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: postObservationTaskToExecutor */
    private static void m154209xbacd125f(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        m154210xbacd125f(executor, runnable, null);
    }
}
