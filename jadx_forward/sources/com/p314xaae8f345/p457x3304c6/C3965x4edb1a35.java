package com.p314xaae8f345.p457x3304c6;

/* renamed from: com.tencent.maas.MJServiceManager */
/* loaded from: classes5.dex */
public class C3965x4edb1a35 {

    /* renamed from: mCallbackManager */
    private final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f15760xe8c0cf7b;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15761x39e86013;

    /* renamed from: com.tencent.maas.MJServiceManager$OnComplete */
    /* loaded from: classes5.dex */
    public interface OnComplete {
        /* renamed from: onComplete */
        void m32397x815f5438(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4120x4de84755 c4120x4de84755, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);
    }

    public C3965x4edb1a35(android.os.Handler handler) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(handler.getLooper());
        this.f15760xe8c0cf7b = c4099x76754671;
        this.f15761x39e86013 = m32392xfce9a72c(handler, c4099x76754671);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m32392xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671);

    /* renamed from: nativeRequestAllCamFunTemplateInfos */
    private native void m32393x489f0512(int i17);

    /* renamed from: nativeRequestCamFunTemplateDesc */
    private native void m32394x3dbf1e13(java.util.List<java.lang.String> list, int i17);

    /* renamed from: requestAllCamFunTemplateInfos */
    public void m32395x4f7879e9(com.p314xaae8f345.p457x3304c6.C3965x4edb1a35.OnComplete onComplete) {
        m32393x489f0512(onComplete != null ? this.f15760xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.C3966xe2e2999a.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: requestCamFunTemplateDesc */
    public void m32396xe24a966a(java.util.List<java.lang.String> list, com.p314xaae8f345.p457x3304c6.C3965x4edb1a35.OnComplete onComplete) {
        m32394x3dbf1e13(list, onComplete != null ? this.f15760xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.C3966xe2e2999a.CompleteCallback(this, onComplete)) : -1);
    }
}
