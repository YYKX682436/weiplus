package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJCamResourceManager */
/* loaded from: classes16.dex */
public class C4016x48c9106d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f129430a;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15873x39e86013;

    public C4016x48c9106d(android.os.Handler handler) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(handler.getLooper());
        this.f129430a = c4099x76754671;
        this.f15873x39e86013 = m32647xfce9a72c(handler, c4099x76754671);
    }

    public static boolean f(java.lang.String str, long j17, java.lang.String str2) {
        return m32658xa97d4860(str, j17, str2);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m32647xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671);

    /* renamed from: nativeCancelAll */
    private native void m32648x2ca8270();

    /* renamed from: nativeCancelLoad */
    private native void m32649x568ad5f7(int i17);

    /* renamed from: nativeCancelLoadMaterial */
    private native void m32650x409ab83e(int i17);

    /* renamed from: nativeCancelLoadMaterialPack */
    private native void m32651x880e3f77(int i17);

    /* renamed from: nativeCancelLoadMusic */
    private native void m32652x51e34a6e(int i17);

    /* renamed from: nativeCancelSelectAndLoadMusic */
    private native void m32653x341c6f35();

    /* renamed from: nativeGetBeautyAdjustmentDesc */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 m32654xdd444f99(java.lang.String str);

    /* renamed from: nativeGetMusicFilePath */
    private native java.lang.String m32655x32574f87(java.lang.String str);

    /* renamed from: nativeGetTemplateInfo */
    private native com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4024xee1c0e5a m32656x1742c1a7(java.lang.String str, long j17);

    /* renamed from: nativeHasAigcTimeline */
    private native boolean m32657x5988ca08(java.lang.String str, long j17);

    /* renamed from: nativeIsLocalTemplateExists */
    private static native boolean m32658xa97d4860(java.lang.String str, long j17, java.lang.String str2);

    /* renamed from: nativeIsMusicLoaded */
    private native boolean m32659x8d8db429(java.lang.String str);

    /* renamed from: nativeIsTemplateLoaded */
    private native boolean m32660x58f93320(java.lang.String str, long j17);

    /* renamed from: nativeLoadBuiltinCommonResources */
    private native int m32661xbdc79bd4(int i17);

    /* renamed from: nativeLoadLocalTemplateComponents */
    private native int m32662x82eb439e(java.lang.String str, long j17, int i17, int i18);

    /* renamed from: nativeLoadMaterial */
    private native int m32663xb63381e4(java.lang.String str, int i17, int i18);

    /* renamed from: nativeLoadMaterialByInfo */
    private native int m32664x9c4754a9(java.lang.String str, long j17, java.lang.String str2, int i17, int i18);

    /* renamed from: nativeLoadMaterialPack */
    private native int m32665x8b3dc61d(int i17, int i18);

    /* renamed from: nativeLoadMusic */
    private native int m32666x38395288(java.lang.String str, int i17, int i18);

    /* renamed from: nativeLoadTemplate */
    private native int m32667x559ae937(java.lang.String str, int i17, int i18, int i19);

    /* renamed from: nativeLoadTemplateByMeta */
    private native int m32668x9aec6313(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4122x30130586 c4122x30130586, int i17, int i18, int i19);

    /* renamed from: nativeRegisterLocalMusic */
    private native void m32669x788338f4(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356, java.lang.String str);

    /* renamed from: nativeRegisterLocalStickerMaterialIfNeeded */
    private native void m32670x2b8971e5(java.lang.String str, long j17, java.lang.String str2, int i17);

    /* renamed from: nativeRegisterLocalTemplate */
    private static native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m32671xad705b4b(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3);

    /* renamed from: nativeRemoveTemplate */
    private native boolean m32672x20250d15(java.lang.String str, long j17);

    /* renamed from: nativeSelectAndLoadMusic */
    private native void m32673x2984e45b(java.util.List<java.lang.String> list, int i17, int i18);

    public static com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b p(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3) {
        return m32671xad705b4b(str, j17, str2, str3);
    }

    public void a() {
        m32648x2ca8270();
    }

    public void b(int i17) {
        m32649x568ad5f7(i17);
    }

    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 c(java.lang.String str) {
        return m32654xdd444f99(str);
    }

    public java.lang.String d(java.lang.String str) {
        return m32655x32574f87(str);
    }

    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4024xee1c0e5a e(java.lang.String str, long j17) {
        return m32656x1742c1a7(str, j17);
    }

    public boolean g(java.lang.String str, long j17) {
        return m32660x58f93320(str, j17);
    }

    public int h(com.p314xaae8f345.p457x3304c6.p461x3a6d265.r rVar) {
        int i17;
        if (rVar != null) {
            i17 = this.f129430a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.v(this, rVar));
        } else {
            i17 = -1;
        }
        return m32661xbdc79bd4(i17);
    }

    public int i(java.lang.String str, long j17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.r rVar) {
        int[] m33786xf8cd0e2f = this.f129430a.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.y(this, uVar, false), new com.p314xaae8f345.p457x3304c6.p461x3a6d265.v(this, rVar));
        return m32662x82eb439e(str, j17, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    public int j(java.lang.String str, long j17, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.r rVar) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = this.f129430a;
        if (uVar == null) {
            return m32664x9c4754a9(str, j17, str2, -1, rVar != null ? c4099x76754671.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.v(this, rVar)) : -1);
        }
        int[] m33786xf8cd0e2f = c4099x76754671.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.y(this, uVar, false), new com.p314xaae8f345.p457x3304c6.p461x3a6d265.v(this, rVar));
        return m32664x9c4754a9(str, j17, str2, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    public int k(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.r rVar) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = this.f129430a;
        if (uVar == null) {
            return m32663xb63381e4(str, -1, rVar != null ? c4099x76754671.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.v(this, rVar)) : -1);
        }
        int[] m33786xf8cd0e2f = c4099x76754671.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.y(this, uVar, false), new com.p314xaae8f345.p457x3304c6.p461x3a6d265.v(this, rVar));
        return m32663xb63381e4(str, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    public int l(com.p314xaae8f345.p457x3304c6.p476x11d36527.g gVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.s sVar) {
        int i17;
        if (sVar != null) {
            i17 = this.f129430a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.w(this, sVar));
        } else {
            i17 = -1;
        }
        return m32665x8b3dc61d(gVar.f129781d, i17);
    }

    public int m(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.r rVar) {
        int[] m33786xf8cd0e2f = this.f129430a.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.y(this, uVar, false), new com.p314xaae8f345.p457x3304c6.p461x3a6d265.x(this, rVar));
        return m32666x38395288(str, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    public int n(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.q qVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.r rVar) {
        int[] m33786xf8cd0e2f = this.f129430a.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.y(this, uVar, false), new com.p314xaae8f345.p457x3304c6.p461x3a6d265.v(this, rVar));
        return m32667x559ae937(str, qVar.f129515d, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    public void o(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356, java.lang.String str) {
        m32669x788338f4(c4116xf4b2c356, str);
    }

    public void q() {
        this.f15873x39e86013.m16727xc85fe246();
    }

    public void r(java.util.List list, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.t tVar) {
        int[] m33786xf8cd0e2f = this.f129430a.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p461x3a6d265.y(this, uVar, false), new com.p314xaae8f345.p457x3304c6.p461x3a6d265.x(this, tVar));
        m32673x2984e45b(list, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }
}
