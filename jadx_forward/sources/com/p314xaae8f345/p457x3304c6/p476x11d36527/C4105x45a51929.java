package com.p314xaae8f345.p457x3304c6.p476x11d36527;

/* renamed from: com.tencent.maas.material.MJMaterialManager */
/* loaded from: classes5.dex */
public class C4105x45a51929 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f129764a;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16086x39e86013;

    public C4105x45a51929(android.os.Handler handler) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(handler.getLooper());
        this.f129764a = c4099x76754671;
        this.f16086x39e86013 = m33801xfce9a72c(handler, c4099x76754671);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m33801xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671);

    /* renamed from: nativeCancelAll */
    private native void m33802x2ca8270();

    /* renamed from: nativeCancelLoadMaterial */
    private native void m33803x409ab83e(int i17);

    /* renamed from: nativeCancelLoadMaterialPack */
    private native void m33804x880e3f77(int i17);

    /* renamed from: nativeGetColorStyleMaterialInfos */
    private native java.lang.Object[] m33805x130a6471(java.lang.String str);

    /* renamed from: nativeGetMaterialInfo */
    private native com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 m33806xd3553bd4(java.lang.String str);

    /* renamed from: nativeIsLocalMaterialLoaded */
    private native boolean m33807xb64926f6(java.lang.String str);

    /* renamed from: nativeIsMaterialLoaded */
    private native boolean m33808x5a55d60d(java.lang.String str);

    /* renamed from: nativeLoadMaterial */
    private native int m33809xb63381e4(java.lang.String str, int i17, int i18);

    /* renamed from: nativeLoadMaterialPack */
    private native int m33810x8b3dc61d(int i17, java.util.Map<java.lang.String, java.lang.String> map, int i18);

    /* renamed from: nativeRegisterLocalStickerMaterial */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33811xc01c9993(java.lang.String str, long j17, java.lang.String str2);

    /* renamed from: nativeWaitLoadingLocalMaterial */
    private native void m33812x12c81622(int i17);

    public com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 a(java.lang.String str) {
        return m33806xd3553bd4(str);
    }

    public void b() {
        m33802x2ca8270();
    }

    public java.util.List c(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object[] m33805x130a6471 = m33805x130a6471(str);
        if (m33805x130a6471 != null) {
            for (java.lang.Object obj : m33805x130a6471) {
                arrayList.add((com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2) obj);
            }
        }
        return arrayList;
    }

    public boolean d(java.lang.String str) {
        return m33807xb64926f6(str);
    }

    public boolean e(java.lang.String str) {
        return m33808x5a55d60d(str);
    }

    public int f(java.lang.String str, com.p314xaae8f345.p457x3304c6.p476x11d36527.c cVar, com.p314xaae8f345.p457x3304c6.p476x11d36527.a aVar) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = this.f129764a;
        if (cVar == null) {
            return m33809xb63381e4(str, -1, aVar != null ? c4099x76754671.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p476x11d36527.d(this, aVar)) : -1);
        }
        int[] m33786xf8cd0e2f = c4099x76754671.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p476x11d36527.f(this, cVar, false), new com.p314xaae8f345.p457x3304c6.p476x11d36527.d(this, aVar));
        return m33809xb63381e4(str, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    public int g(com.p314xaae8f345.p457x3304c6.p476x11d36527.g gVar, com.p314xaae8f345.p457x3304c6.p476x11d36527.b bVar) {
        int i17;
        if (bVar != null) {
            i17 = this.f129764a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p476x11d36527.e(this, bVar));
        } else {
            i17 = -1;
        }
        return m33810x8b3dc61d(gVar.f129781d, new java.util.HashMap(), i17);
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b h(java.lang.String str, long j17, java.lang.String str2) {
        return m33811xc01c9993(str, j17, str2);
    }

    public void i() {
        this.f16086x39e86013.m16727xc85fe246();
    }
}
