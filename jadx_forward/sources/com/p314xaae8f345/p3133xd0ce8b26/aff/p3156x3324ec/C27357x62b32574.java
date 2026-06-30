package com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec;

/* renamed from: com.tencent.wechat.aff.misc.WebViewManager */
/* loaded from: classes15.dex */
public class C27357x62b32574 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27357x62b32574 f59639x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27357x62b32574();

    /* renamed from: readDynamicMenuConfigCallbackMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27357x62b32574.ReadDynamicMenuConfigCallback> f59640xa25db44d = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: com.tencent.wechat.aff.misc.WebViewManager$ReadDynamicMenuConfigCallback */
    /* loaded from: classes8.dex */
    public interface ReadDynamicMenuConfigCallback {
        /* renamed from: complete */
        void mo74782xdc453139(com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.ReadDynamicMenuConfigResp readDynamicMenuConfigResp);
    }

    public C27357x62b32574() {
        m119449xee932d13("misc.WebViewManager@Get");
        this.f60596x19633840.put("OnReadDynamicMenuConfigComplete", new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface() { // from class: com.tencent.wechat.aff.misc.WebViewManager$$a
            @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f.InvokerInterface
            /* renamed from: invoke */
            public final void mo9211xb9724478(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27357x62b32574.this.m113462x788cbde4(c27686x63f3cf48);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __OnReadDynamicMenuConfigComplete */
    public void m113462x788cbde4(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27686x63f3cf48 c27686x63f3cf48) {
        long longValue = ((java.lang.Long) c27686x63f3cf48.m119491xbd1ad57b(java.lang.Long.TYPE)).longValue();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27357x62b32574.ReadDynamicMenuConfigCallback readDynamicMenuConfigCallback = this.f59640xa25db44d.get(java.lang.Long.valueOf(longValue));
        if (readDynamicMenuConfigCallback != null) {
            readDynamicMenuConfigCallback.mo74782xdc453139((com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.ReadDynamicMenuConfigResp) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119640x815a2f5(com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.ReadDynamicMenuConfigResp.m113621x7c90cfc0(), c27686x63f3cf48.m119475xbc0c0475()));
            this.f59640xa25db44d.remove(java.lang.Long.valueOf(longValue));
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27357x62b32574 m113463x9cf0d20b() {
        return f59639x21169495;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f
    /* renamed from: createInnerManager */
    public java.lang.Object mo113464xe6b30793(java.lang.String str) {
        return null;
    }

    /* renamed from: readDynamicMenuConfigAsync */
    public void m113465x20b41c72(com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.ReadDynamicMenuConfigReq readDynamicMenuConfigReq, com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27357x62b32574.ReadDynamicMenuConfigCallback readDynamicMenuConfigCallback) {
        try {
            long m119528x6aa2d0d0 = this.f60599xed126936.m119528x6aa2d0d0();
            if (readDynamicMenuConfigCallback != null) {
                this.f59640xa25db44d.put(java.lang.Long.valueOf(m119528x6aa2d0d0), readDynamicMenuConfigCallback);
            }
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0("direct.client.java");
            c27687xa835a820.m119508x542d00d0("ReadDynamicMenuConfig");
            c27687xa835a820.m119514xd98e5cd2(java.lang.Long.valueOf(m119528x6aa2d0d0));
            c27687xa835a820.m119498xd87f8bcc(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119639xfd6f090e(readDynamicMenuConfigReq));
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception unused) {
            throw new java.lang.RuntimeException("WebViewManager.readDynamicMenuConfig failed");
        }
    }
}
