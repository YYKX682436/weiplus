package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJAIGCBridgeService */
/* loaded from: classes5.dex */
public class C3985x6b47324b {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15805x39e86013;

    public C3985x6b47324b(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p461x3a6d265.a aVar) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(android.os.Looper.getMainLooper());
        this.f15805x39e86013 = m32479xfce9a72c(handler, c4099x76754671, c4099x76754671.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.e(this, aVar, false)), c4099x76754671.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.d(this, aVar, false)), c4099x76754671.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.b(this, aVar, false)), c4099x76754671.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.c(this, aVar, false)));
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m32479xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671, int i17, int i18, int i19, int i27);

    /* renamed from: nativeNotifyCancelCompletion */
    private native void m32480x73378856(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);

    /* renamed from: nativeNotifyQueryCompletion */
    private native void m32481x9b03c864(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3990xb891c88 c3990xb891c88, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);

    /* renamed from: nativeNotifySubmitCompletion */
    private native void m32482x121eac74(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3996x128b8fa c3996x128b8fa, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);

    public void a(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        m32480x73378856(str, c4093x6b88526b);
    }

    public void b(java.lang.String str) {
        m32480x73378856(str, null);
    }

    public void c(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        m32481x9b03c864(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3990xb891c88(str), c4093x6b88526b);
    }

    public void d(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3990xb891c88 c3990xb891c88) {
        m32481x9b03c864(c3990xb891c88, null);
    }

    public void e(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        m32482x121eac74(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3996x128b8fa(str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.f.nMJAIGCResultCodeFailed, "", null, 0), c4093x6b88526b);
    }

    public void f(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3996x128b8fa c3996x128b8fa) {
        m32482x121eac74(c3996x128b8fa, null);
    }
}
