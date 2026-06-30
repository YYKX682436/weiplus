package com.p314xaae8f345.mm.p2825x7e128009;

/* renamed from: com.tencent.mm.xeffect.WeEffectRender */
/* loaded from: classes14.dex */
public class C22970xcc6c2095 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f296335a = 0;

    static {
        tq5.k.a("xlabeffect");
    }

    public static void a(long j17, long j18, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22960x759189cd interfaceC22960x759189cd) {
        if (interfaceC22960x759189cd != null) {
            com.p314xaae8f345.mm.p2825x7e128009.C22969x864e13f4.f39979x4fbc8495.m83716x6c4ebec7(j17, j18, interfaceC22960x759189cd);
            m83751xacb8bb2a(j17, j18, interfaceC22960x759189cd);
        } else {
            com.p314xaae8f345.mm.p2825x7e128009.C22969x864e13f4.f39979x4fbc8495.m83716x6c4ebec7(j17, j18, null);
            m83751xacb8bb2a(j17, j18, null);
        }
    }

    public static void b(long j17, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced interfaceC22961x9807eced) {
        com.p314xaae8f345.mm.p2825x7e128009.C22974x508788a2.f39981x4fbc8495.m83790x6c4ebec7(j17, interfaceC22961x9807eced);
        m83755xfd6a0db0(j17, interfaceC22961x9807eced);
    }

    /* renamed from: nAddEffectMaterialsFolder */
    public static native long[] m83718x62437256(long j17, java.lang.String str);

    /* renamed from: nAddFaceAutoSlimer */
    public static native long m83719x6246c7a9(long j17, java.lang.String str);

    /* renamed from: nCreateFilter */
    public static native long m83720xcad5cb22(long j17, java.lang.String str, float f17);

    /* renamed from: nCreateFilterWithConfig */
    public static native long m83721x1ef986a(long j17, java.lang.String str);

    /* renamed from: nCreateMakeUp */
    public static native long m83722xd6564cd3(long j17, int i17, java.lang.String str);

    /* renamed from: nCreateSticker */
    public static native long m83723x5227fed3(long j17, int i17, java.lang.String str);

    /* renamed from: nDestroy */
    public static native void m83724x62cd7fac(long j17);

    /* renamed from: nEnableSkinSeg */
    public static native void m83725xffa3acc7(long j17, boolean z17);

    /* renamed from: nExportAction */
    public static native java.util.ArrayList<java.util.HashSet<java.lang.Integer>> m83726x335d0698(long j17);

    /* renamed from: nFaceTrack */
    public static native int m83727x4ce5820(long j17, java.nio.Buffer buffer, int i17, int i18, long j18);

    /* renamed from: nFaceTrackWithAngle */
    public static native int m83728xf7324f6d(long j17, java.nio.Buffer buffer, int i17, int i18, long j18, int i19);

    /* renamed from: nGetFaceRect */
    public static native android.graphics.RectF[] m83729x4b332209(long j17);

    /* renamed from: nGetImageLabel */
    public static native int m83730xd4191081(long j17);

    /* renamed from: nGetResourceType */
    public static native int m83731xfb49b090(long j17, long j18);

    /* renamed from: nGetSdkVersion */
    public static native int m83732xb6312d66();

    /* renamed from: nGetSegmentTexture */
    public static native int m83733x95581490(long j17);

    /* renamed from: nInit */
    public static native long m83734x630f29e(int i17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18);

    /* renamed from: nInitSettings */
    public static native java.lang.String m83735x62b894e1(long j17, java.lang.String str, java.lang.String[] strArr);

    /* renamed from: nInitWithMap */
    public static native long m83736x51329638(java.lang.String[] strArr, int i17, java.lang.String str, boolean z17, boolean z18, boolean z19, int i18, boolean z27);

    /* renamed from: nNeedFaceTrack */
    public static native boolean m83737xfa794f2a(long j17);

    /* renamed from: nReceiveJsonMessage */
    public static native int m83738xc50c2c2a(long j17, long j18, java.lang.String str, int i17, int i18);

    /* renamed from: nRemoveFilter */
    public static native void m83739x3c6d5caa(long j17, long j18);

    /* renamed from: nRemoveResource */
    public static native int m83740xed30d0c0(long j17, long j18);

    /* renamed from: nRenderToBuffer */
    public static native int m83741x6b18aa5f(long j17, byte[] bArr, int i17, int i18, byte[] bArr2, int i19, int i27, boolean z17);

    /* renamed from: nRenderToTexture */
    public static native int m83742x95e382dc(long j17, int i17, int i18, int i19, int i27, int i28, boolean z17, boolean z18);

    /* renamed from: nRenderToTexture2 */
    public static native int m83743x268cd8d6(long j17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, boolean z18, int i39, boolean z19);

    /* renamed from: nRenderToTextureOutputRotate */
    public static native int m83744x5b55cab8(long j17, int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, boolean z18);

    /* renamed from: nResetAnim */
    public static native void m83745xe798cf32(long j17, long j18);

    /* renamed from: nSetAnim */
    public static native void m83746x7c41d145(long j17, long j18, int i17);

    /* renamed from: nSetBeautyDeFaceWrinkle */
    public static native void m83747xe06cf0b6(long j17, float f17, float f18);

    /* renamed from: nSetBeautySharpenFilter */
    public static native int m83748xdb41929b(long j17, float f17);

    /* renamed from: nSetConfigFlags */
    public static native int m83749xd07162b1(long j17, java.lang.String str, float f17);

    /* renamed from: nSetCustomSegmentSticker */
    public static native void m83750x95a3378f(long j17, int i17, int i18, int i19);

    /* renamed from: nSetEffectCallback */
    public static native void m83751xacb8bb2a(long j17, long j18, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22960x759189cd interfaceC22960x759189cd);

    /* renamed from: nSetEffectLevel */
    public static native int m83752x32bc72bf(long j17, int i17, float f17, int i18);

    /* renamed from: nSetFilterColorWeight */
    public static native void m83753xb899ce6f(long j17, long j18, float f17);

    /* renamed from: nSetFocalLength */
    public static native void m83754x9b1e87f7(long j17, float f17);

    /* renamed from: nSetJsonMessageCallback */
    private static native void m83755xfd6a0db0(long j17, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced interfaceC22961x9807eced);

    /* renamed from: nSetMakeUpAlpha */
    public static native void m83756xdc67401(long j17, long j18, float f17);

    /* renamed from: nSetMakeupGlobalAlpha */
    public static native void m83757xaf4957fe(long j17, float f17);

    /* renamed from: nSetMouthMorph */
    public static native void m83758xce67c0b5(long j17, float f17);

    /* renamed from: nSetNativeLog */
    public static native void m83759xa5c0a0f9(long j17);

    /* renamed from: nSetRenderTextureCropSize */
    public static native void m83760x4e444bc2(long j17, float f17);

    /* renamed from: nSetSegment */
    public static native void m83761x97f9d37f(long j17, boolean z17, int i17, int i18, int i19);

    /* renamed from: nSetSegmentBgBlur */
    public static native void m83762x70b1eaab(long j17, boolean z17, float f17, int i17);

    /* renamed from: nSetSlimerRate */
    public static native int m83763x7756cede(long j17, long j18, float f17);

    /* renamed from: nSetTeethBright */
    public static native void m83764x2f0c9cee(long j17, float f17);

    /* renamed from: nSetupReport */
    public static native void m83765x54cba0c3(long j17, boolean z17);

    /* renamed from: nShowDebugInfo */
    public static native void m83766xadc3156(long j17, int i17, boolean z17);

    /* renamed from: nTrackImageLabel */
    public static native int m83767xb21d7fb6(long j17, java.nio.Buffer buffer, int i17, int i18);

    /* renamed from: nUpdateAnim */
    public static native void m83768x5f6a8d88(long j17, long j18);

    /* renamed from: nUpdateSticker */
    public static native void m83769x73167666(long j17);
}
