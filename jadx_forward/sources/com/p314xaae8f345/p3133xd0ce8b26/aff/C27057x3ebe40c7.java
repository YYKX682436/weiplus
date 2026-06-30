package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.AffBizGlobalOnLoader */
/* loaded from: classes15.dex */
public class C27057x3ebe40c7 {

    /* renamed from: initialized */
    private static java.util.concurrent.atomic.AtomicBoolean f58664x498da6d4 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.C27057x3ebe40c7 f58665x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27057x3ebe40c7();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27057x3ebe40c7 m108930x9cf0d20b() {
        return f58665x21169495;
    }

    /* renamed from: jniOnLoader */
    private native void m108931xbfb69197();

    /* renamed from: onLoader */
    public void m108932x4d8a06d2() {
        if (f58664x498da6d4.compareAndSet(false, true)) {
            try {
                m108931xbfb69197();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }
}
