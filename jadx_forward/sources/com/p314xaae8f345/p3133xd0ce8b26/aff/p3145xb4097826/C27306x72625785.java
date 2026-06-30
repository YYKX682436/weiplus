package com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826;

/* renamed from: com.tencent.wechat.aff.finder.FinderDataService */
/* loaded from: classes11.dex */
public class C27306x72625785 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785 f59614x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785();

    /* renamed from: reportMsgReadCGICallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785.reportMsgReadCGICallback> f59615x943590d5 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: com.tencent.wechat.aff.finder.FinderDataService$reportMsgReadCGICallback */
    /* loaded from: classes10.dex */
    public interface reportMsgReadCGICallback {
        /* renamed from: complete */
        void mo112788xdc453139(boolean z17);
    }

    public C27306x72625785() {
        m119450xee932d13("finder.FinderDataService@Get", null);
        this.f60596x19633840.put("OnreportMsgReadCGIComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: yv5.b$$a
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785.this.m112783x6b64acda(c27686x63f3cf48);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnreportMsgReadCGIComplete */
    public void m112783x6b64acda(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785.reportMsgReadCGICallback reportmsgreadcgicallback = this.f59615x943590d5.get(java.lang.Integer.valueOf(m119487xe339ac4f));
        if (reportmsgreadcgicallback != null) {
            reportmsgreadcgicallback.mo112788xdc453139(c27686x63f3cf48.m119473xd7c8d5b2());
            this.f59615x943590d5.remove(java.lang.Integer.valueOf(m119487xe339ac4f));
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785 m112784x9cf0d20b() {
        return f59614x21169495;
    }

    /* renamed from: configService */
    public void m112785x57610d13(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("configService");
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119508x542d00d0(str2);
            c27687xa835a820.m119508x542d00d0(str3);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderDataService.configService failed", e17);
        }
    }

    /* renamed from: reportMsgReadCGIAsync */
    public void m112786xd6adfefa(java.lang.String str, java.lang.String str2, bw5.cu cuVar, com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27306x72625785.reportMsgReadCGICallback reportmsgreadcgicallback) {
        try {
            int m119528x6aa2d0d0 = (int) this.f60599xed126936.m119528x6aa2d0d0();
            if (reportmsgreadcgicallback != null) {
                this.f59615x943590d5.put(java.lang.Integer.valueOf(m119528x6aa2d0d0), reportmsgreadcgicallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("reportMsgReadCGI");
            c27687xa835a820.m119510x55370fd8(m119528x6aa2d0d0);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119508x542d00d0(str2);
            c27687xa835a820.m119504xd8dd29ef(cuVar.f107764d);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderDataService.reportMsgReadCGI failed", e17);
        }
    }

    /* renamed from: testHello */
    public void m112787xb85def60() {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("testHello");
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderDataService.testHello failed", e17);
        }
    }
}
