package com.p314xaae8f345.p457x3304c6.p458x9b169b86;

/* renamed from: com.tencent.maas.analytics.MJAssetInfoStatistics */
/* loaded from: classes5.dex */
public class C3970x2c87daa4 {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15785x39e86013 = m32413xfce9a72c();

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m32413xfce9a72c();

    /* renamed from: nativeAddMediaFilesFromScene */
    private native void m32414x864405e5(java.util.List<java.lang.String> list, int i17, boolean z17);

    /* renamed from: nativeLoadBinaryBuffer */
    private native boolean m32415xecfd3dde(java.nio.ByteBuffer byteBuffer);

    /* renamed from: nativeRemoveAllMediaFilesFromScene */
    private native void m32416x9a8a3949(int i17);

    /* renamed from: nativeRemoveFinalMediaFiles */
    private native void m32417x97ec560e();

    /* renamed from: nativeRemoveMediaFilesFromScene */
    private native void m32418xb4603d4(java.util.List<java.lang.String> list, int i17);

    /* renamed from: nativeReset */
    private native void m32419x67a25378();

    /* renamed from: nativeToBinaryBuffer */
    private native java.nio.ByteBuffer m32420x7eb1f1b3();

    /* renamed from: nativeToJSONString */
    private native java.lang.String m32421xd3cb8d8b();

    public void a(java.util.List list, int i17, boolean z17) {
        m32414x864405e5(list, i17, z17);
    }

    public boolean b(java.nio.ByteBuffer byteBuffer) {
        return m32415xecfd3dde(byteBuffer);
    }

    public void c() {
        this.f15785x39e86013.m16727xc85fe246();
    }

    public void d(int i17) {
        m32416x9a8a3949(i17);
    }

    public void e(java.util.List list, int i17) {
        m32418xb4603d4(list, i17);
    }

    public java.nio.ByteBuffer f() {
        return m32420x7eb1f1b3();
    }

    public java.lang.String g() {
        return m32421xd3cb8d8b();
    }
}
