package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.NewlifeCppToNativeOnLoader */
/* loaded from: classes8.dex */
public class C27450xff0fb90b {

    /* renamed from: initialized */
    private static java.util.concurrent.atomic.AtomicBoolean f60271x498da6d4 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27450xff0fb90b f60272x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27450xff0fb90b();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27450xff0fb90b m116177x9cf0d20b() {
        return f60272x21169495;
    }

    /* renamed from: jniOnLoader */
    private native void m116178xbfb69197();

    /* renamed from: onLoader */
    public void m116179x4d8a06d2() {
        if (f60271x498da6d4.compareAndSet(false, true)) {
            try {
                m116178xbfb69197();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }

    /* renamed from: registerAffNewLifeCppToNativeManager */
    public <T> void m116180x4f20b4f6(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("newlife.AffNewLifeCppToNativeManager@Get", com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27371x2ed6d6a7.class, cls);
    }
}
