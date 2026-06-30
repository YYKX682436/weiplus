package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJCDNBridgeService */
/* loaded from: classes5.dex */
public class C4001x1040777c {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15853x39e86013;

    public C4001x1040777c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p461x3a6d265.j jVar) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(android.os.Looper.getMainLooper());
        this.f15853x39e86013 = m32590xfce9a72c(handler, c4099x76754671, c4099x76754671.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.k(this, jVar, false)), c4099x76754671.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.m(this, jVar, false)), c4099x76754671.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.l(this, jVar, false)), c4099x76754671.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.n(this, jVar, false)));
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m32590xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671, int i17, int i18, int i19, int i27);

    /* renamed from: nativeNotifyDownloadCompletion */
    private native void m32591xed1050e4(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);

    /* renamed from: nativeNotifyDownloadProgressUpdate */
    private native void m32592xa6dd7a5e(java.lang.String str, long j17, long j18, float f17, float f18);

    /* renamed from: nativeNotifyUploadCompletion */
    private native void m32593x37d0eb1d(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);

    public void a(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        m32591xed1050e4(str, c4093x6b88526b);
    }

    public void b(java.lang.String str, long j17, long j18, float f17, float f18) {
        m32592xa6dd7a5e(str, j17, j18, f17, f18);
    }

    public void c(java.lang.String str) {
        m32591xed1050e4(str, null);
    }

    public void d(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        m32593x37d0eb1d(str, null, c4093x6b88526b);
    }

    public void e(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4006x492a12ee c4006x492a12ee) {
        m32593x37d0eb1d(c4006x492a12ee.f129405a, c4006x492a12ee.f129406b, null);
    }
}
