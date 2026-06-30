package com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826;

/* renamed from: com.tencent.wechat.aff.finder.FinderOnLoader */
/* loaded from: classes8.dex */
public class C27308xc6e52938 {

    /* renamed from: initialized */
    private static java.util.concurrent.atomic.AtomicBoolean f59622x498da6d4 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27308xc6e52938 f59623x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27308xc6e52938();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27308xc6e52938 m112817x9cf0d20b() {
        return f59623x21169495;
    }

    /* renamed from: jniOnLoader */
    private native void m112818xbfb69197();

    /* renamed from: onLoader */
    public void m112819x4d8a06d2() {
        if (f59622x498da6d4.compareAndSet(false, true)) {
            try {
                m112818xbfb69197();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }

    /* renamed from: registerFinderDataService */
    public <T> void m112820xe8ae342(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("finder.FinderDataService@Get", java.lang.Class.forName("com.tencent.wechat.aff.finder.FinderDataServiceInvoker"), cls);
    }

    /* renamed from: registerFinderPrefetchManager */
    public <T> void m112821x3cf535cd(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("finder.FinderPrefetchManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.finder.FinderPrefetchManagerInvoker"), cls);
    }

    /* renamed from: registerRedDotManager */
    public <T> void m112822x45b243b2(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("finder.RedDotManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.finder.RedDotManagerInvoker"), cls);
    }
}
