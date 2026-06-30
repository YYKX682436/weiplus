package com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826;

/* renamed from: com.tencent.wechat.aff.finder.FinderCppToNativeOnLoader */
/* loaded from: classes8.dex */
public class C27305x4f4ebd01 {

    /* renamed from: initialized */
    private static java.util.concurrent.atomic.AtomicBoolean f59612x498da6d4 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27305x4f4ebd01 f59613x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27305x4f4ebd01();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27305x4f4ebd01 m112778x9cf0d20b() {
        return f59613x21169495;
    }

    /* renamed from: jniOnLoader */
    private native void m112779xbfb69197();

    /* renamed from: onLoader */
    public void m112780x4d8a06d2() {
        if (f59612x498da6d4.compareAndSet(false, true)) {
            try {
                m112779xbfb69197();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }

    /* renamed from: registerAffFinderProvider */
    public <T> void m112781x353cf15(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("finder.AffFinderProvider@Get", com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27303xbea9ac82.class, cls);
    }
}
