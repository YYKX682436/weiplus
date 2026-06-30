package com.p314xaae8f345.p457x3304c6.p483x6a710b1;

/* renamed from: com.tencent.maas.utils.MJVideoClassifier */
/* loaded from: classes5.dex */
public class C4203x74688d9f {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16173x39e86013 = m34701xfce9a72c();

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m34701xfce9a72c();

    /* renamed from: nativeCalculateClassifyResult */
    private native com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4204xc1bc4e9c m34702x9026deb0();

    /* renamed from: nativeFeedAudioFrame */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34703xea398f6c(java.nio.ByteBuffer byteBuffer);

    /* renamed from: nativeFeedVideoFrame */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34704x2d71b5e7(java.nio.ByteBuffer byteBuffer, int i17, int i18, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a);

    /* renamed from: nativeInitResourcesWithModelInfos */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m34705x8d590d00(java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4115x6599ae5a> list);

    /* renamed from: nativeIsInitialized */
    private native boolean m34706x990e4073();

    public com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4204xc1bc4e9c a() {
        return m34702x9026deb0();
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b b(java.nio.ByteBuffer byteBuffer) {
        return m34703xea398f6c(byteBuffer);
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c(java.nio.ByteBuffer byteBuffer, int i17, int i18, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        return m34704x2d71b5e7(byteBuffer, i17, i18, c4128x879fba0a);
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b d(java.util.List list) {
        return m34705x8d590d00(list);
    }

    public boolean e() {
        return m34706x990e4073();
    }

    public void f() {
        m34707x98b65415();
        this.f16173x39e86013.m16727xc85fe246();
    }

    /* renamed from: nativeReleaseResources */
    public native void m34707x98b65415();
}
