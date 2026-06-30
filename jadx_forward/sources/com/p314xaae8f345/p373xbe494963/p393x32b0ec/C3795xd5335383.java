package com.p314xaae8f345.p373xbe494963.p393x32b0ec;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.live.PlatformConvertor */
/* loaded from: classes14.dex */
public class C3795xd5335383 {
    private static final java.lang.String TAG = "PlatformConvertor";

    /* renamed from: createDisplayTarget */
    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 m29735xf57f6557(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3) {
            return (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3) obj;
        }
        if (obj instanceof com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
            return new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3((com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) obj);
        }
        if (obj instanceof android.view.TextureView) {
            return new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3((android.view.TextureView) obj);
        }
        if (obj instanceof android.view.SurfaceView) {
            return new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3((android.view.SurfaceView) obj);
        }
        if (obj instanceof android.view.Surface) {
            return new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3((android.view.Surface) obj);
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "object is unknown. object=".concat(java.lang.String.valueOf(obj)));
        return null;
    }

    /* renamed from: initContextFromNative */
    public static void m29736x19360c40(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29243x19360c40(str);
    }
}
