package com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5;

/* renamed from: com.tencent.tavkit.ciimage.TAVGLUtils */
/* loaded from: classes14.dex */
public class C25862xe58d3f23 {

    /* renamed from: _hellAccFlag_ */
    private byte f48825x7f11beae;

    /* renamed from: checkTextureInfo */
    private static com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98387x108c7641(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        if (c25745xc3945049.f47893x602fd2f5 == 3553) {
            return c25745xc3945049;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450492 = new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(3553), 3553, c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127, null, 0);
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53 c25863x2a5f3c53 = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53();
        c25863x2a5f3c53.mo98383xa85d066(c25745xc39450492);
        c25863x2a5f3c53.mo98380x79f87086(c25745xc3945049, null, c25745xc3945049.m97280xc3a49506(), 1.0f, null);
        return c25745xc39450492;
    }

    /* renamed from: saveBitmap */
    public static android.graphics.Bitmap m98388x2229cd0c(int i17, int i18, int i19) {
        return m98389x2229cd0c(i17, 3553, i18, i19);
    }

    /* renamed from: saveBitmap */
    public static android.graphics.Bitmap m98389x2229cd0c(int i17, int i18, int i19, int i27) {
        return m98390x2229cd0c(new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(i17, i18, i19, i27, 0));
    }

    /* renamed from: saveBitmap */
    public static android.graphics.Bitmap m98391x2229cd0c(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98336x7e2662a9 = com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25858x90ea669.m98336x7e2662a9(c25859x590b0095.m98363xfb854877().f47833x6be2dc6, c25859x590b0095.m98363xfb854877().f47832xb7389127);
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25860x6c39346d c25860x6c39346d = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25860x6c39346d();
        c25860x6c39346d.mo98383xa85d066(m98336x7e2662a9);
        c25859x590b0095.m98359x2f2d44(c25860x6c39346d);
        return m98390x2229cd0c(m98336x7e2662a9);
    }

    /* renamed from: saveBitmap */
    public static android.graphics.Bitmap m98390x2229cd0c(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98387x108c7641 = m98387x108c7641(c25745xc3945049);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, m98387x108c7641.f47890xc35d0376, 0);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(m98387x108c7641.f47894x6be2dc6 * m98387x108c7641.f47883xb7389127 * 4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocateDirect.rewind();
        android.opengl.GLES20.glReadPixels(0, 0, m98387x108c7641.f47894x6be2dc6, m98387x108c7641.f47883xb7389127, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, allocateDirect);
        int i17 = m98387x108c7641.f47894x6be2dc6;
        int i18 = m98387x108c7641.f47883xb7389127;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tavkit/ciimage/TAVGLUtils", "saveBitmap", "(Lcom/tencent/tav/coremedia/TextureInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/tavkit/ciimage/TAVGLUtils", "saveBitmap", "(Lcom/tencent/tav/coremedia/TextureInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        allocateDirect.rewind();
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
        return createBitmap;
    }
}
