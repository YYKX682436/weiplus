package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.SyncCppToNativeOnLoader */
/* loaded from: classes8.dex */
public class C27471xe2184c6c {

    /* renamed from: initialized */
    private static java.util.concurrent.atomic.AtomicBoolean f60341x498da6d4 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27471xe2184c6c f60342x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27471xe2184c6c();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27471xe2184c6c m116461x9cf0d20b() {
        return f60342x21169495;
    }

    /* renamed from: jniOnLoader */
    private native void m116462xbfb69197();

    /* renamed from: onLoader */
    public void m116463x4d8a06d2() {
        if (f60341x498da6d4.compareAndSet(false, true)) {
            try {
                m116462xbfb69197();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }

    /* renamed from: registerAffFinderCppToNativeManager */
    public <T> void m116464xa20728dc(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("newlife.AffFinderCppToNativeManager@Get", com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27367x165a849b.class, cls);
    }

    /* renamed from: registerAffSyncCppToNativeManager */
    public <T> void m116465xbd87b791(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("newlife.AffSyncCppToNativeManager@Get", com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27381xa744d386.class, cls);
    }
}
