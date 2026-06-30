package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusLogicCommentOnLoader */
/* loaded from: classes8.dex */
public class C27539x95251e45 {

    /* renamed from: initialized */
    private static java.util.concurrent.atomic.AtomicBoolean f60523x498da6d4 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27539x95251e45 f60524x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27539x95251e45();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27539x95251e45 m117405x9cf0d20b() {
        return f60524x21169495;
    }

    /* renamed from: jniOnLoader */
    private native void m117406xbfb69197();

    /* renamed from: onLoader */
    public void m117407x4d8a06d2() {
        if (f60523x498da6d4.compareAndSet(false, true)) {
            try {
                m117406xbfb69197();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }

    /* renamed from: registerStatusLogicCommentManager */
    public <T> void m117408x74773c97(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("status.StatusLogicCommentManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.status.StatusLogicCommentManagerInvoker"), cls);
    }
}
