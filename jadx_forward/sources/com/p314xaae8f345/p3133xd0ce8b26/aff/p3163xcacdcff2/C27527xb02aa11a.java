package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusCgiManager */
/* loaded from: classes15.dex */
public class C27527xb02aa11a extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a f60495x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a();

    /* renamed from: getSelfHistoryDataCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.getSelfHistoryDataCallback> f60499x833af3fb = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: getCustomIconRecommendDataCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.GetCustomIconRecommendDataCallback> f60498x1e81a411 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: requestIconConfigListCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.RequestIconConfigListCallback> f60500xd3f960ef = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: commitPublishStatusTaskCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.CommitPublishStatusTaskCallback> f60496xd77004c8 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: deleteSelfStatusCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.DeleteSelfStatusCallback> f60497x9a6c3cae = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: com.tencent.wechat.aff.status.StatusCgiManager$CommitPublishStatusTaskCallback */
    /* loaded from: classes15.dex */
    public interface CommitPublishStatusTaskCallback {
        /* renamed from: complete */
        void m117291xdc453139(bw5.tl0 tl0Var);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusCgiManager$DeleteSelfStatusCallback */
    /* loaded from: classes15.dex */
    public interface DeleteSelfStatusCallback {
        /* renamed from: complete */
        void m117292xdc453139(bw5.ll0 ll0Var);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusCgiManager$GetCustomIconRecommendDataCallback */
    /* loaded from: classes11.dex */
    public interface GetCustomIconRecommendDataCallback {
        /* renamed from: complete */
        void mo117293xdc453139(bw5.ll0 ll0Var, bw5.yn0 yn0Var);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusCgiManager$RequestIconConfigListCallback */
    /* loaded from: classes15.dex */
    public interface RequestIconConfigListCallback {
        /* renamed from: complete */
        void m117294xdc453139(bw5.ll0 ll0Var, bw5.fm0 fm0Var);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusCgiManager$getSelfHistoryDataCallback */
    /* loaded from: classes15.dex */
    public interface getSelfHistoryDataCallback {
        /* renamed from: complete */
        void m117295xdc453139(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 c27526x2045dab5, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 c27534x36200514);
    }

    public C27527xb02aa11a() {
        m119450xee932d13("status.StatusCgiManager@Get", null);
        this.f60596x19633840.put("OngetSelfHistoryDataComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusCgiManager$$a
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.this.m117284xbe47cfb4(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OnGetCustomIconRecommendDataComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusCgiManager$$b
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.this.m117282x767af47e(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OnRequestIconConfigListComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusCgiManager$$c
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.this.m117283x49572482(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OnCommitPublishStatusTaskComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusCgiManager$$d
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.this.m117280x36c6a309(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OnDeleteSelfStatusComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusCgiManager$$e
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.this.m117281x5fb25bc1(c27686x63f3cf48);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnCommitPublishStatusTaskComplete */
    public void m117280x36c6a309(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.CommitPublishStatusTaskCallback commitPublishStatusTaskCallback = this.f60496xd77004c8.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (commitPublishStatusTaskCallback != null) {
            commitPublishStatusTaskCallback.m117291xdc453139((bw5.tl0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.tl0.f115040h, c27686x63f3cf48.m119475xbc0c0475()));
            this.f60496xd77004c8.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnDeleteSelfStatusComplete */
    public void m117281x5fb25bc1(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.DeleteSelfStatusCallback deleteSelfStatusCallback = this.f60497x9a6c3cae.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (deleteSelfStatusCallback != null) {
            deleteSelfStatusCallback.m117292xdc453139((bw5.ll0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.ll0.f111379h, c27686x63f3cf48.m119475xbc0c0475()));
            this.f60497x9a6c3cae.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnGetCustomIconRecommendDataComplete */
    public void m117282x767af47e(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.GetCustomIconRecommendDataCallback getCustomIconRecommendDataCallback = this.f60498x1e81a411.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (getCustomIconRecommendDataCallback != null) {
            getCustomIconRecommendDataCallback.mo117293xdc453139((bw5.ll0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.ll0.f111379h, c27686x63f3cf48.m119475xbc0c0475()), (bw5.yn0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.yn0.f117118g, c27686x63f3cf48.m119475xbc0c0475()));
            this.f60498x1e81a411.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnRequestIconConfigListComplete */
    public void m117283x49572482(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.RequestIconConfigListCallback requestIconConfigListCallback = this.f60500xd3f960ef.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (requestIconConfigListCallback != null) {
            requestIconConfigListCallback.m117294xdc453139((bw5.ll0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.ll0.f111379h, c27686x63f3cf48.m119475xbc0c0475()), (bw5.fm0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.fm0.f108902i, c27686x63f3cf48.m119475xbc0c0475()));
            this.f60500xd3f960ef.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OngetSelfHistoryDataComplete */
    public void m117284xbe47cfb4(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.getSelfHistoryDataCallback getselfhistorydatacallback = this.f60499x833af3fb.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (getselfhistorydatacallback != null) {
            getselfhistorydatacallback.m117295xdc453139((com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5.m117268x7c90cfc0(), c27686x63f3cf48.m119475xbc0c0475()), (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514.m117321x7c90cfc0(), c27686x63f3cf48.m119475xbc0c0475()));
            this.f60499x833af3fb.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a m117285x9cf0d20b() {
        return f60495x21169495;
    }

    /* renamed from: commitPublishStatusTaskAsync */
    public void m117286x63ff252d(bw5.pn0 pn0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.CommitPublishStatusTaskCallback commitPublishStatusTaskCallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (commitPublishStatusTaskCallback != null) {
                this.f60496xd77004c8.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), commitPublishStatusTaskCallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("CommitPublishStatusTask");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(pn0Var));
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusCgiManager.commitPublishStatusTask failed", e17);
        }
    }

    /* renamed from: deleteSelfStatusAsync */
    public void m117287x46e4c193(bw5.xl0 xl0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.DeleteSelfStatusCallback deleteSelfStatusCallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (deleteSelfStatusCallback != null) {
                this.f60497x9a6c3cae.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), deleteSelfStatusCallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("DeleteSelfStatus");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(xl0Var));
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusCgiManager.deleteSelfStatus failed", e17);
        }
    }

    /* renamed from: getCustomIconRecommendDataAsync */
    public void m117288xc3682f36(bw5.xn0 xn0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.GetCustomIconRecommendDataCallback getCustomIconRecommendDataCallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (getCustomIconRecommendDataCallback != null) {
                this.f60498x1e81a411.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), getCustomIconRecommendDataCallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("GetCustomIconRecommendData");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(xn0Var));
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusCgiManager.getCustomIconRecommendData failed", e17);
        }
    }

    /* renamed from: getSelfHistoryDataAsync */
    public void m117289x41ae36a0(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da c27533xf13ad6da, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.getSelfHistoryDataCallback getselfhistorydatacallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (getselfhistorydatacallback != null) {
                this.f60499x833af3fb.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), getselfhistorydatacallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("getSelfHistoryData");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(c27533xf13ad6da));
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusCgiManager.getSelfHistoryData failed", e17);
        }
    }

    /* renamed from: requestIconConfigListAsync */
    public void m117290xe92e6a94(bw5.em0 em0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.RequestIconConfigListCallback requestIconConfigListCallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (requestIconConfigListCallback != null) {
                this.f60500xd3f960ef.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), requestIconConfigListCallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("RequestIconConfigList");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(em0Var));
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusCgiManager.requestIconConfigList failed", e17);
        }
    }
}
