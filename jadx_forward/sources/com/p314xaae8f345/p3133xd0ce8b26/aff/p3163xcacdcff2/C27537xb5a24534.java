package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusInitOnLoader */
/* loaded from: classes11.dex */
public class C27537xb5a24534 {
    static java.lang.String TAG = "StatusInitOnLoader";

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27537xb5a24534 f60520x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27537xb5a24534();

    /* renamed from: statusInitManagerRegistedCreator */
    private static com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.InterfaceC27696xc4a99307 f60521x1761672c = null;

    /* renamed from: createStatusInitManager */
    public static void m117378x3087738f(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.c(TAG, "createStatusInitManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 c27692x3687e131 = (com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131) obj;
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.InterfaceC27696xc4a99307 interfaceC27696xc4a99307 = f60521x1761672c;
        if (interfaceC27696xc4a99307 == null) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.b(TAG, "StatusInitManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object mo642x1b78fe61 = interfaceC27696xc4a99307.mo642x1b78fe61();
        c27692x3687e131.mo73242x8aebc093(mo642x1b78fe61);
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.c(TAG, "createStatusInitManager done ".concat(java.lang.String.valueOf(mo642x1b78fe61)), new java.lang.Object[0]);
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27537xb5a24534 m117379x9cf0d20b() {
        return f60520x21169495;
    }

    /* renamed from: onLoader */
    public void m117380x4d8a06d2() {
    }

    /* renamed from: registerStatusInitManager */
    public void m117381xb88708c8(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.InterfaceC27696xc4a99307 interfaceC27696xc4a99307) {
        f60521x1761672c = interfaceC27696xc4a99307;
    }
}
