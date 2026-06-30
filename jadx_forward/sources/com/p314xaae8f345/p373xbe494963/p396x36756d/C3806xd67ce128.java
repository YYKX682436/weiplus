package com.p314xaae8f345.p373xbe494963.p396x36756d;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::trtc")
/* renamed from: com.tencent.liteav.trtc.TRTCDefConverter */
/* loaded from: classes14.dex */
public class C3806xd67ce128 {
    /* renamed from: getGLContextNativeHandle */
    public static long m30426xbb3f7db3(java.lang.Object obj) {
        if (obj instanceof android.opengl.EGLContext) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 21 ? ((android.opengl.EGLContext) obj).getNativeHandle() : ((android.opengl.EGLContext) obj).getHandle();
        }
        return 0L;
    }
}
