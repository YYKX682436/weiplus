package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.NewlifeActionOnLoader */
/* loaded from: classes8.dex */
public class C27449x417ab6c4 {

    /* renamed from: initialized */
    private static java.util.concurrent.atomic.AtomicBoolean f60269x498da6d4 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27449x417ab6c4 f60270x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27449x417ab6c4();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27449x417ab6c4 m116172x9cf0d20b() {
        return f60270x21169495;
    }

    /* renamed from: jniOnLoader */
    private native void m116173xbfb69197();

    /* renamed from: onLoader */
    public void m116174x4d8a06d2() {
        if (f60269x498da6d4.compareAndSet(false, true)) {
            try {
                m116173xbfb69197();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }

    /* renamed from: registerAffNewLifeActionManager */
    public <T> void m116175x8fcdf999(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("newlife.AffNewLifeActionManager@Get", com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27369xdfcb6bbe.class, cls);
    }
}
