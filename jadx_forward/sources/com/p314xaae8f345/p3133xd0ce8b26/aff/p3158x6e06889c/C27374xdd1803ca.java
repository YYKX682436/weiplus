package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeExtraInfoManager */
/* loaded from: classes15.dex */
public class C27374xdd1803ca extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27374xdd1803ca f59686x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27374xdd1803ca();

    /* renamed from: fetchJumpInfoCompleteEventMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27374xdd1803ca.FetchJumpInfoCompleteEvent> f59687xe4c3b7b1 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeExtraInfoManager$FetchJumpInfoCompleteEvent */
    /* loaded from: classes15.dex */
    public interface FetchJumpInfoCompleteEvent {
        /* renamed from: event */
        void m113745x5c6729a(int i17, java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076> arrayList);
    }

    public C27374xdd1803ca() {
        m119450xee932d13("newlife.AffNewLifeExtraInfoManager@Get", null);
        this.f60596x19633840.put("OnFetchJumpInfoCompleteEvent", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: aw5.e$$a
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27374xdd1803ca.this.m113738xac3b22ea(c27686x63f3cf48);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnFetchJumpInfoCompleteEvent */
    public void m113738xac3b22ea(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        this.f59687xe4c3b7b1.size();
        int m119487xe339ac4f = c27686x63f3cf48.m119487xe339ac4f();
        java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076> m119635x75f0b955 = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119635x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076.m115778x7c90cfc0(), c27686x63f3cf48.m119476x14fee6b3());
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27374xdd1803ca.FetchJumpInfoCompleteEvent> entry : this.f59687xe4c3b7b1.entrySet()) {
            entry.getKey();
            entry.getValue().m113745x5c6729a(m119487xe339ac4f, m119635x75f0b955);
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27374xdd1803ca m113739x9cf0d20b() {
        return f59686x21169495;
    }

    /* renamed from: fetchExtraInfo */
    public void m113740xcf29ef44(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27395x12bf02c0 c27395x12bf02c0) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("fetchExtraInfo");
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119633xd1dc376e(c27395x12bf02c0));
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeExtraInfoManager.fetchExtraInfo failed", e17);
        }
    }

    /* renamed from: getLocalJumpInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m113741x586e6ad1(java.lang.String str, int i17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("getLocalJumpInfo");
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119510x55370fd8(i17);
            return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076.m115778x7c90cfc0(), new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48(m119456xb9724478(c27687xa835a820.m119495xeed4b35e())).m119475xbc0c0475());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeExtraInfoManager.getLocalJumpInfo failed", e17);
        }
    }

    /* renamed from: saveLocalExtraInfo */
    public void m113742x9f04fc90(byte[] bArr, java.lang.String str, int i17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("saveLocalExtraInfo");
            c27687xa835a820.m119498xd87f8bcc(bArr);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119510x55370fd8(i17);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeExtraInfoManager.saveLocalExtraInfo failed", e17);
        }
    }

    /* renamed from: subscribeFetchJumpInfoCompleteEvent */
    public void m113743xc4ffa295(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27374xdd1803ca.FetchJumpInfoCompleteEvent fetchJumpInfoCompleteEvent) {
        this.f59687xe4c3b7b1.put(str, fetchJumpInfoCompleteEvent);
    }

    /* renamed from: unSubscribeFetchJumpInfoCompleteEvent */
    public void m113744xd8c58d3c(java.lang.String str) {
        this.f59687xe4c3b7b1.remove(str);
    }
}
