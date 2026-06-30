package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager */
/* loaded from: classes16.dex */
public class C27377x40aebffe extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe f59690x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe();

    /* renamed from: initCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.initCallback> f59698xb61e3a7 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: dataChangeEventMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.DataChangeEvent> f59691x5f6a4e7c = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: insertCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.insertCallback> f59699x21c925e = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: deleteByIdCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.deleteByIdCallback> f59692xef8f467a = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: updateByIdCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.updateByIdCallback> f59700x3a11339c = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: getByIdCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getByIdCallback> f59695xe3d0516f = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: getBeforeTimeLimitCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getBeforeTimeLimitCallback> f59694xb164db1e = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: getAfterTimeCreateCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getAfterTimeCreateCallback> f59693xe5975468 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: getLastBufferCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getLastBufferCallback> f59696x9f1194cb = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: updateLastBufferCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.updateLastBufferCallback> f59701xd2196138 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: updateLastestMentionReadIdCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.updateLastestMentionReadIdCallback> f59702x9693c543 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: getUnreadMentionListCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getUnreadMentionListCallback> f59697xe0cfc514 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$DataChangeEvent */
    /* loaded from: classes16.dex */
    public interface DataChangeEvent {
        /* renamed from: event */
        void m113779x5c6729a(int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27443x8fd5f9ae c27443x8fd5f9ae, long j17);
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$deleteByIdCallback */
    /* loaded from: classes16.dex */
    public interface deleteByIdCallback {
        /* renamed from: complete */
        void m113780xdc453139(boolean z17);
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$getAfterTimeCreateCallback */
    /* loaded from: classes16.dex */
    public interface getAfterTimeCreateCallback {
        /* renamed from: complete */
        void m113781xdc453139(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27444x4fc2523a c27444x4fc2523a);
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$getBeforeTimeLimitCallback */
    /* loaded from: classes16.dex */
    public interface getBeforeTimeLimitCallback {
        /* renamed from: complete */
        void m113782xdc453139(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27444x4fc2523a c27444x4fc2523a);
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$getByIdCallback */
    /* loaded from: classes16.dex */
    public interface getByIdCallback {
        /* renamed from: complete */
        void m113783xdc453139(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27443x8fd5f9ae c27443x8fd5f9ae);
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$getLastBufferCallback */
    /* loaded from: classes16.dex */
    public interface getLastBufferCallback {
        /* renamed from: complete */
        void m113784xdc453139(byte[] bArr);
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$getUnreadMentionListCallback */
    /* loaded from: classes16.dex */
    public interface getUnreadMentionListCallback {
        /* renamed from: complete */
        void m113785xdc453139(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27444x4fc2523a c27444x4fc2523a);
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$initCallback */
    /* loaded from: classes16.dex */
    public interface initCallback {
        /* renamed from: complete */
        void m113786xdc453139(boolean z17);
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$insertCallback */
    /* loaded from: classes16.dex */
    public interface insertCallback {
        /* renamed from: complete */
        void m113787xdc453139(boolean z17);
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$updateByIdCallback */
    /* loaded from: classes16.dex */
    public interface updateByIdCallback {
        /* renamed from: complete */
        void m113788xdc453139(boolean z17);
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$updateLastBufferCallback */
    /* loaded from: classes16.dex */
    public interface updateLastBufferCallback {
        /* renamed from: complete */
        void m113789xdc453139(boolean z17);
    }

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeMentionManager$updateLastestMentionReadIdCallback */
    /* loaded from: classes16.dex */
    public interface updateLastestMentionReadIdCallback {
        /* renamed from: complete */
        void m113790xdc453139(boolean z17);
    }

    public C27377x40aebffe() {
        m119450xee932d13("newlife.AffNewLifeMentionManager@Get", null);
        this.f60596x19633840.put("OninitComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$a
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113760xa0aeb1c8(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OnDataChangeEvent", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$f
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113753x85d526e1(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OninsertComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$g
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113761x4499fab1(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OndeleteByIdComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$h
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113754xed883495(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OnupdateByIdComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$i
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113762xfe882ab3(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OngetByIdComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$j
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113757x3c4e99e2(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OngetBeforeTimeLimitComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$k
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113756x603cf371(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OngetAfterTimeCreateComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$l
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113755xa5ec0e67(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OngetLastBufferComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$b
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113758xcb067f46(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OnupdateLastBufferComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$c
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113763xefca6f57(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OnupdateLastestMentionReadIdComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$d
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113764xef9e346c(c27686x63f3cf48);
            }
        });
        this.f60596x19633840.put("OngetUnreadMentionListComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.f$$e
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.this.m113759xda34717b(c27686x63f3cf48);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnDataChangeEvent */
    public void m113753x85d526e1(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        this.f59691x5f6a4e7c.size();
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27443x8fd5f9ae c27443x8fd5f9ae = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27443x8fd5f9ae) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27443x8fd5f9ae.m115812x7c90cfc0(), c27686x63f3cf48.m119475xbc0c0475());
        long m119489xe339acae = c27686x63f3cf48.m119489xe339acae();
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.DataChangeEvent> entry : this.f59691x5f6a4e7c.entrySet()) {
            entry.getKey();
            entry.getValue().m113779x5c6729a(m119487xe339ac4f, c27443x8fd5f9ae, m119489xe339acae);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OndeleteByIdComplete */
    public void m113754xed883495(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.deleteByIdCallback deletebyidcallback = this.f59692xef8f467a.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (deletebyidcallback != null) {
            deletebyidcallback.m113780xdc453139(c27686x63f3cf48.m119473xd7c8d5b2());
            this.f59692xef8f467a.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OngetAfterTimeCreateComplete */
    public void m113755xa5ec0e67(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getAfterTimeCreateCallback getaftertimecreatecallback = this.f59693xe5975468.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (getaftertimecreatecallback != null) {
            getaftertimecreatecallback.m113781xdc453139((com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27444x4fc2523a) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27444x4fc2523a.m116026x7c90cfc0(), c27686x63f3cf48.m119475xbc0c0475()));
            this.f59693xe5975468.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OngetBeforeTimeLimitComplete */
    public void m113756x603cf371(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getBeforeTimeLimitCallback getbeforetimelimitcallback = this.f59694xb164db1e.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (getbeforetimelimitcallback != null) {
            getbeforetimelimitcallback.m113782xdc453139((com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27444x4fc2523a) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27444x4fc2523a.m116026x7c90cfc0(), c27686x63f3cf48.m119475xbc0c0475()));
            this.f59694xb164db1e.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OngetByIdComplete */
    public void m113757x3c4e99e2(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getByIdCallback getbyidcallback = this.f59695xe3d0516f.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (getbyidcallback != null) {
            getbyidcallback.m113783xdc453139((com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27443x8fd5f9ae) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27443x8fd5f9ae.m115812x7c90cfc0(), c27686x63f3cf48.m119475xbc0c0475()));
            this.f59695xe3d0516f.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OngetLastBufferComplete */
    public void m113758xcb067f46(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getLastBufferCallback getlastbuffercallback = this.f59696x9f1194cb.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (getlastbuffercallback != null) {
            getlastbuffercallback.m113784xdc453139(c27686x63f3cf48.m119475xbc0c0475());
            this.f59696x9f1194cb.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OngetUnreadMentionListComplete */
    public void m113759xda34717b(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getUnreadMentionListCallback getunreadmentionlistcallback = this.f59697xe0cfc514.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (getunreadmentionlistcallback != null) {
            getunreadmentionlistcallback.m113785xdc453139((com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27444x4fc2523a) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27444x4fc2523a.m116026x7c90cfc0(), c27686x63f3cf48.m119475xbc0c0475()));
            this.f59697xe0cfc514.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OninitComplete */
    public void m113760xa0aeb1c8(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.initCallback initcallback = this.f59698xb61e3a7.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (initcallback != null) {
            initcallback.m113786xdc453139(c27686x63f3cf48.m119473xd7c8d5b2());
            this.f59698xb61e3a7.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OninsertComplete */
    public void m113761x4499fab1(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.insertCallback insertcallback = this.f59699x21c925e.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (insertcallback != null) {
            insertcallback.m113787xdc453139(c27686x63f3cf48.m119473xd7c8d5b2());
            this.f59699x21c925e.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnupdateByIdComplete */
    public void m113762xfe882ab3(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.updateByIdCallback updatebyidcallback = this.f59700x3a11339c.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (updatebyidcallback != null) {
            updatebyidcallback.m113788xdc453139(c27686x63f3cf48.m119473xd7c8d5b2());
            this.f59700x3a11339c.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnupdateLastBufferComplete */
    public void m113763xefca6f57(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.updateLastBufferCallback updatelastbuffercallback = this.f59701xd2196138.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (updatelastbuffercallback != null) {
            updatelastbuffercallback.m113789xdc453139(c27686x63f3cf48.m119473xd7c8d5b2());
            this.f59701xd2196138.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnupdateLastestMentionReadIdComplete */
    public void m113764xef9e346c(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.updateLastestMentionReadIdCallback updatelastestmentionreadidcallback = this.f59702x9693c543.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (updatelastestmentionreadidcallback != null) {
            updatelastestmentionreadidcallback.m113790xdc453139(c27686x63f3cf48.m119473xd7c8d5b2());
            this.f59702x9693c543.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe m113765x9cf0d20b() {
        return f59690x21169495;
    }

    /* renamed from: deleteByIdAsync */
    public void m113766xce56145f(java.lang.String str, long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.deleteByIdCallback deletebyidcallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (deletebyidcallback != null) {
                this.f59692xef8f467a.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), deletebyidcallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("deleteById");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119512x55371037(j17);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.deleteById failed", e17);
        }
    }

    /* renamed from: getAfterTimeCreateAsync */
    public void m113767xb742accd(java.lang.String str, int i17, long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getAfterTimeCreateCallback getaftertimecreatecallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (getaftertimecreatecallback != null) {
                this.f59693xe5975468.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), getaftertimecreatecallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("getAfterTimeCreate");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119510x55370fd8(i17);
            c27687xa835a820.m119512x55371037(j17);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.getAfterTimeCreate failed", e17);
        }
    }

    /* renamed from: getBeforeTimeLimitAsync */
    public void m113768xb290f403(java.lang.String str, int i17, int i18, long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getBeforeTimeLimitCallback getbeforetimelimitcallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (getbeforetimelimitcallback != null) {
                this.f59694xb164db1e.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), getbeforetimelimitcallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("getBeforeTimeLimit");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119510x55370fd8(i17);
            c27687xa835a820.m119510x55370fd8(i18);
            c27687xa835a820.m119512x55371037(j17);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.getBeforeTimeLimit failed", e17);
        }
    }

    /* renamed from: getByIdAsync */
    public void m113769x9f23bb14(java.lang.String str, long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getByIdCallback getbyidcallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (getbyidcallback != null) {
                this.f59695xe3d0516f.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), getbyidcallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("getById");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119512x55371037(j17);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.getById failed", e17);
        }
    }

    /* renamed from: getLastBufferAsync */
    public void m113770x2801b370(java.lang.String str, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getLastBufferCallback getlastbuffercallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (getlastbuffercallback != null) {
                this.f59696x9f1194cb.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), getlastbuffercallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("getLastBuffer");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119510x55370fd8(i17);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.getLastBuffer failed", e17);
        }
    }

    /* renamed from: getUnreadMentionListAsync */
    public void m113771xdf180e79(java.lang.String str, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.getUnreadMentionListCallback getunreadmentionlistcallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (getunreadmentionlistcallback != null) {
                this.f59697xe0cfc514.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), getunreadmentionlistcallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("getUnreadMentionList");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119510x55370fd8(i17);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.getUnreadMentionList failed", e17);
        }
    }

    /* renamed from: initAsync */
    public void m113772xeefd574c(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, boolean z18, boolean z19, boolean z27, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.initCallback initcallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (initcallback != null) {
                this.f59698xb61e3a7.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), initcallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119508x542d00d0(str2);
            c27687xa835a820.m119508x542d00d0(str3);
            c27687xa835a820.m119510x55370fd8(i17);
            c27687xa835a820.m119496xa577e349(z17);
            c27687xa835a820.m119496xa577e349(z18);
            c27687xa835a820.m119496xa577e349(z19);
            c27687xa835a820.m119496xa577e349(z27);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.init failed", e17);
        }
    }

    /* renamed from: insertAsync */
    public void m113773xf8331b43(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27443x8fd5f9ae c27443x8fd5f9ae, java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.insertCallback insertcallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (insertcallback != null) {
                this.f59699x21c925e.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), insertcallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("insert");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(c27443x8fd5f9ae));
            c27687xa835a820.m119508x542d00d0(str);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.insert failed", e17);
        }
    }

    /* renamed from: subscribeDataChangeEvent */
    public void m113774x5e83c416(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.DataChangeEvent dataChangeEvent) {
        this.f59691x5f6a4e7c.put(str, dataChangeEvent);
    }

    /* renamed from: unSubscribeDataChangeEvent */
    public void m113775x8365fbcf(java.lang.String str) {
        this.f59691x5f6a4e7c.remove(str);
    }

    /* renamed from: updateByIdAsync */
    public void m113776xe7910301(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27443x8fd5f9ae c27443x8fd5f9ae, long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.updateByIdCallback updatebyidcallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (updatebyidcallback != null) {
                this.f59700x3a11339c.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), updatebyidcallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("updateById");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(c27443x8fd5f9ae));
            c27687xa835a820.m119512x55371037(j17);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.updateById failed", e17);
        }
    }

    /* renamed from: updateLastBufferAsync */
    public void m113777x7e42959d(java.lang.String str, int i17, byte[] bArr, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.updateLastBufferCallback updatelastbuffercallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (updatelastbuffercallback != null) {
                this.f59701xd2196138.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), updatelastbuffercallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("updateLastBuffer");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119510x55370fd8(i17);
            c27687xa835a820.m119498xd87f8bcc(bArr);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.updateLastBuffer failed", e17);
        }
    }

    /* renamed from: updateLastestMentionReadIdAsync */
    public void m113778xb72f9de8(java.lang.String str, int i17, long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27377x40aebffe.updateLastestMentionReadIdCallback updatelastestmentionreadidcallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (updatelastestmentionreadidcallback != null) {
                this.f59702x9693c543.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), updatelastestmentionreadidcallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("updateLastestMentionReadId");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119510x55370fd8(i17);
            c27687xa835a820.m119512x55371037(j17);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.updateLastestMentionReadId failed", e17);
        }
    }
}
