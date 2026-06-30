package com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc;

/* renamed from: com.tencent.wechat.aff.websearch.WebsearchPlatformManagerOnLoader */
/* loaded from: classes8.dex */
public class C27575xd8197730 {
    static java.lang.String TAG = "WebsearchPlatformManagerOnLoader";

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27575xd8197730 f60565x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27575xd8197730();

    /* renamed from: webSearchPlatformManagerRegistedCreator */
    private static com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.InterfaceC27696xc4a99307 f60566xd632df9 = null;

    /* renamed from: createWebSearchPlatformManager */
    public static void m117740xdcdee71a(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.c(TAG, "createWebSearchPlatformManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 c27692x3687e131 = (com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131) obj;
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.InterfaceC27696xc4a99307 interfaceC27696xc4a99307 = f60566xd632df9;
        if (interfaceC27696xc4a99307 == null) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.b(TAG, "WebSearchPlatformManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object mo642x1b78fe61 = interfaceC27696xc4a99307.mo642x1b78fe61();
        c27692x3687e131.mo73242x8aebc093(mo642x1b78fe61);
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.c(TAG, "createWebSearchPlatformManager done ".concat(java.lang.String.valueOf(mo642x1b78fe61)), new java.lang.Object[0]);
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27575xd8197730 m117741x9cf0d20b() {
        return f60565x21169495;
    }

    /* renamed from: onLoader */
    public void m117742x4d8a06d2() {
    }

    /* renamed from: registerWebSearchPlatformManager */
    public void m117743x5840afc1(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.InterfaceC27696xc4a99307 interfaceC27696xc4a99307) {
        f60566xd632df9 = interfaceC27696xc4a99307;
    }
}
