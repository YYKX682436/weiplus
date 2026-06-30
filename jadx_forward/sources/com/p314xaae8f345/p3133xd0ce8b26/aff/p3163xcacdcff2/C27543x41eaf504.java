package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusOnLoader */
/* loaded from: classes8.dex */
public class C27543x41eaf504 {

    /* renamed from: initialized */
    private static java.util.concurrent.atomic.AtomicBoolean f60530x498da6d4 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27543x41eaf504 f60531x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27543x41eaf504();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27543x41eaf504 m117445x9cf0d20b() {
        return f60531x21169495;
    }

    /* renamed from: jniOnLoader */
    private native void m117446xbfb69197();

    /* renamed from: onLoader */
    public void m117447x4d8a06d2() {
        if (f60530x498da6d4.compareAndSet(false, true)) {
            try {
                m117446xbfb69197();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }

    /* renamed from: registerStatusCgiManager */
    public <T> void m117448x311329bd(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("status.StatusCgiManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.status.StatusCgiManagerInvoker"), cls);
    }

    /* renamed from: registerStatusLogicManager */
    public <T> void m117449x72b2c384(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("status.StatusLogicManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.status.StatusLogicManagerInvoker"), cls);
    }

    /* renamed from: registerStatusStorageManager */
    public <T> void m117450xd4df3487(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("status.StatusStorageManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.status.StatusStorageManagerInvoker"), cls);
    }

    /* renamed from: registerStatusXmlParseManager */
    public <T> void m117451xaaa9e1fc(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("status.StatusXmlParseManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.status.StatusXmlParseManagerInvoker"), cls);
    }
}
