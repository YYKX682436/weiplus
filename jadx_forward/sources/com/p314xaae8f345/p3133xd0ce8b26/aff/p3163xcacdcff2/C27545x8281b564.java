package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusStorageManager */
/* loaded from: classes11.dex */
public class C27545x8281b564 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564 f60537x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564();

    /* renamed from: testCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.testCallback> f60542x48219ee5 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: initIconConfigCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.InitIconConfigCallback> f60539xf69a6b8c = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: cleanExpireDBCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.cleanExpireDBCallback> f60538xcde66fb1 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: statusInfoChangeEventMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.StatusInfoChangeEvent> f60541x1255e012 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: statusCommentChangeEventMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.StatusCommentChangeEvent> f60540x6d74379f = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: com.tencent.wechat.aff.status.StatusStorageManager$InitIconConfigCallback */
    /* loaded from: classes11.dex */
    public interface InitIconConfigCallback {
        /* renamed from: complete */
        void m117500xdc453139();
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusStorageManager$StatusCommentChangeEvent */
    /* loaded from: classes11.dex */
    public interface StatusCommentChangeEvent {
        /* renamed from: event */
        void m117501x5c6729a(int i17, int i18, bw5.pl0 pl0Var);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusStorageManager$StatusInfoChangeEvent */
    /* loaded from: classes11.dex */
    public interface StatusInfoChangeEvent {
        /* renamed from: event */
        void mo2097x5c6729a(int i17, int i18, bw5.sm0 sm0Var);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusStorageManager$cleanExpireDBCallback */
    /* loaded from: classes11.dex */
    public interface cleanExpireDBCallback {
        /* renamed from: complete */
        void mo117502xdc453139(bw5.um0 um0Var);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusStorageManager$testCallback */
    /* loaded from: classes11.dex */
    public interface testCallback {
        /* renamed from: complete */
        void m117503xdc453139(int i17);
    }

    public C27545x8281b564() {
        m119450xee932d13("status.StatusStorageManager@Get", null);
        this.f60596x19633840.put("OntestComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusStorageManager$$a
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.this.m117474x4424ef4a(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OnInitIconConfigComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusStorageManager$$b
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.this.m117470xe8b6fd63(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OncleanExpireDBComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusStorageManager$$c
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.this.m117473xddbbfe20(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OnStatusInfoChangeEvent", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusStorageManager$$d
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.this.m117472x8c7c904b(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OnStatusCommentChangeEvent", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusStorageManager$$e
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.this.m117471x10f79d7c(c27686x63f3cf48);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnInitIconConfigComplete */
    public void m117470xe8b6fd63(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.InitIconConfigCallback initIconConfigCallback = this.f60539xf69a6b8c.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (initIconConfigCallback != null) {
            initIconConfigCallback.m117500xdc453139();
            this.f60539xf69a6b8c.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnStatusCommentChangeEvent */
    public void m117471x10f79d7c(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        this.f60540x6d74379f.size();
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        int m119487xe339ac4f2 = c27686x63f3cf48.m119487xe339ac4f();
        bw5.pl0 pl0Var = (bw5.pl0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.pl0.f113259x, c27686x63f3cf48.m119475xbc0c0475());
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.StatusCommentChangeEvent> entry : this.f60540x6d74379f.entrySet()) {
            entry.getKey();
            entry.getValue().m117501x5c6729a(m119487xe339ac4f, m119487xe339ac4f2, pl0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnStatusInfoChangeEvent */
    public void m117472x8c7c904b(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        this.f60541x1255e012.size();
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        int m119487xe339ac4f2 = c27686x63f3cf48.m119487xe339ac4f();
        bw5.sm0 sm0Var = (bw5.sm0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.sm0.f114583u, c27686x63f3cf48.m119475xbc0c0475());
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.StatusInfoChangeEvent> entry : this.f60541x1255e012.entrySet()) {
            entry.getKey();
            entry.getValue().mo2097x5c6729a(m119487xe339ac4f, m119487xe339ac4f2, sm0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OncleanExpireDBComplete */
    public void m117473xddbbfe20(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.cleanExpireDBCallback cleanexpiredbcallback = this.f60538xcde66fb1.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (cleanexpiredbcallback != null) {
            cleanexpiredbcallback.mo117502xdc453139((bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, c27686x63f3cf48.m119475xbc0c0475()));
            this.f60538xcde66fb1.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OntestComplete */
    public void m117474x4424ef4a(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.testCallback testcallback = this.f60542x48219ee5.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (testcallback != null) {
            testcallback.m117503xdc453139(c27686x63f3cf48.m119481xbc69a298());
            this.f60542x48219ee5.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564 m117475x9cf0d20b() {
        return f60537x21169495;
    }

    /* renamed from: cleanExpireDBAsync */
    public void m117476xe2b632d6(long j17, boolean z17, boolean z18, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.cleanExpireDBCallback cleanexpiredbcallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (cleanexpiredbcallback != null) {
                this.f60538xcde66fb1.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), cleanexpiredbcallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("cleanExpireDB");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119506xd8dd2a4e(j17);
            c27687xa835a820.m119496xa577e349(z17);
            c27687xa835a820.m119496xa577e349(z18);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.cleanExpireDB failed", e17);
        }
    }

    /* renamed from: constructStatusInfoCache */
    public void m117477xbf8582cb() {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("constructStatusInfoCache");
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.constructStatusInfoCache failed", e17);
        }
    }

    /* renamed from: deleteLocalPublishStatusInfo */
    public bw5.um0 m117478x2fb4a58f(bw5.sm0 sm0Var) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("DeleteLocalPublishStatusInfo");
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(sm0Var));
            return (bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.deleteLocalPublishStatusInfo failed", e17);
        }
    }

    /* renamed from: deleteStatusInfoWithId */
    public bw5.um0 m117479x7b98302c(java.lang.String str, int i17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("deleteStatusInfoWithId");
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119510x55370fd8(i17);
            return (bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.deleteStatusInfoWithId failed", e17);
        }
    }

    /* renamed from: deleteStatusInfoWithUsername */
    public bw5.um0 m117480x57255b27(java.lang.String str, int i17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("deleteStatusInfoWithUsername");
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119510x55370fd8(i17);
            return (bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.deleteStatusInfoWithUsername failed", e17);
        }
    }

    /* renamed from: deleteTempStatusInfo */
    public bw5.um0 m117481x3068513f(java.lang.String str, long j17, int i17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("deleteTempStatusInfo");
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119506xd8dd2a4e(j17);
            c27687xa835a820.m119510x55370fd8(i17);
            return (bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.deleteTempStatusInfo failed", e17);
        }
    }

    /* renamed from: getAllCacheStatsInfo */
    public bw5.um0 m117482x45d0d7d6() {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("getAllCacheStatsInfo");
            return (bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.getAllCacheStatsInfo failed", e17);
        }
    }

    /* renamed from: getKV */
    public int m117483x5db1b41(java.lang.String str, int i17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("getKV");
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119504xd8dd29ef(i17);
            return new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119481xbc69a298();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.getKV failed", e17);
        }
    }

    /* renamed from: init */
    public void m117484x316510(java.lang.String str, java.lang.String str2, int i17, boolean z17, java.lang.String str3) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119508x542d00d0(str2);
            c27687xa835a820.m119510x55370fd8(i17);
            c27687xa835a820.m119496xa577e349(z17);
            c27687xa835a820.m119508x542d00d0(str3);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.init failed", e17);
        }
    }

    /* renamed from: initIconConfigAsync */
    public void m117485x319eeef1(bw5.pm0 pm0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.InitIconConfigCallback initIconConfigCallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (initIconConfigCallback != null) {
                this.f60539xf69a6b8c.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), initIconConfigCallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("InitIconConfig");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(pm0Var));
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.initIconConfig failed", e17);
        }
    }

    /* renamed from: insertOrReplaceInfo */
    public bw5.um0 m117486xed349166(bw5.sm0 sm0Var) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("insertOrReplaceInfo");
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(sm0Var));
            return (bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.insertOrReplaceInfo failed", e17);
        }
    }

    /* renamed from: markReadUserLatestStatus */
    public boolean m117487x98d2b5e7(java.lang.String str) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("MarkReadUserLatestStatus");
            c27687xa835a820.m119508x542d00d0(str);
            return new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119473xd7c8d5b2();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.markReadUserLatestStatus failed", e17);
        }
    }

    /* renamed from: selectStatusInfo */
    public bw5.um0 m117488x224365dc(bw5.tm0 tm0Var) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("selectStatusInfo");
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(tm0Var));
            return (bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.selectStatusInfo failed", e17);
        }
    }

    /* renamed from: selectStatusInfoWithId */
    public bw5.um0 m117489x9b21d7d(java.lang.String str) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("selectStatusInfoWithId");
            c27687xa835a820.m119508x542d00d0(str);
            return (bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.selectStatusInfoWithId failed", e17);
        }
    }

    /* renamed from: selectStatusInfoWithUsername */
    public bw5.um0 m117490x103247b8(java.lang.String str, int i17, int i18, long j17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("selectStatusInfoWithUsername");
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119504xd8dd29ef(i17);
            c27687xa835a820.m119504xd8dd29ef(i18);
            c27687xa835a820.m119506xd8dd2a4e(j17);
            return (bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.selectStatusInfoWithUsername failed", e17);
        }
    }

    /* renamed from: setKV */
    public boolean m117491x684354d(java.lang.String str, int i17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("setKV");
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119504xd8dd29ef(i17);
            return new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119473xd7c8d5b2();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.setKV failed", e17);
        }
    }

    /* renamed from: subscribeStatusCommentChangeEvent */
    public void m117492xb99e0be7(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.StatusCommentChangeEvent statusCommentChangeEvent) {
        this.f60540x6d74379f.put(str, statusCommentChangeEvent);
    }

    /* renamed from: subscribeStatusInfoChangeEvent */
    public void m117493xd0abb1c0(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.StatusInfoChangeEvent statusInfoChangeEvent) {
        this.f60541x1255e012.put(str, statusInfoChangeEvent);
    }

    /* renamed from: testAsync */
    public void m117494xb801d90a(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.testCallback testcallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (testcallback != null) {
                this.f60542x48219ee5.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), testcallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("test");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.test failed", e17);
        }
    }

    /* renamed from: unSubscribeStatusCommentChangeEvent */
    public void m117495x435c744e(java.lang.String str) {
        this.f60540x6d74379f.remove(str);
    }

    /* renamed from: unSubscribeStatusInfoChangeEvent */
    public void m117496xf5297ab9(java.lang.String str) {
        this.f60541x1255e012.remove(str);
    }

    /* renamed from: updateConfig */
    public void m117497xac5f2d6b(java.lang.String str) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("updateConfig");
            c27687xa835a820.m119508x542d00d0(str);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.updateConfig failed", e17);
        }
    }

    /* renamed from: updateStatusInteractData */
    public bw5.um0 m117498x3e816cbb(java.lang.String str, bw5.vm0 vm0Var) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("updateStatusInteractData");
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(vm0Var));
            return (bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.updateStatusInteractData failed", e17);
        }
    }

    /* renamed from: updateStatusPrivateData */
    public bw5.um0 m117499x43656eb2(java.lang.String str, bw5.gi0 gi0Var) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("updateStatusPrivateData");
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(gi0Var));
            return (bw5.um0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.um0.f115516i, new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.updateStatusPrivateData failed", e17);
        }
    }
}
