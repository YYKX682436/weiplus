package com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec;

/* renamed from: com.tencent.wechat.aff.misc.MiscOnLoader */
/* loaded from: classes8.dex */
public class C27356xc71537fe {

    /* renamed from: initialized */
    private static java.util.concurrent.atomic.AtomicBoolean f59637x498da6d4 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27356xc71537fe f59638x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27356xc71537fe();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27356xc71537fe m113457x9cf0d20b() {
        return f59638x21169495;
    }

    /* renamed from: jniOnLoader */
    private native void m113458xbfb69197();

    /* renamed from: onLoader */
    public void m113459x4d8a06d2() {
        if (f59637x498da6d4.compareAndSet(false, true)) {
            try {
                m113458xbfb69197();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }

    /* renamed from: registerWebViewManager */
    public <T> void m113460xac5b7ad7(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119526x6c2286d7("misc.WebViewManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.misc.WebViewManagerInvoker"), cls);
    }
}
