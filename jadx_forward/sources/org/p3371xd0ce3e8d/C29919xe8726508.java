package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.YuvHelper */
/* loaded from: classes16.dex */
public class C29919xe8726508 {
    /* renamed from: ABGRToI420 */
    public static void m156601x97120170(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, int i28, int i29) {
        m156609x63c60c7(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, byteBuffer4, i27, i28, i29);
    }

    /* renamed from: I420Copy */
    public static void m156602xb610af9e(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, int i28) {
        int i29 = (i27 + 1) / 2;
        int i37 = i27 * i28;
        int i38 = ((i28 + 1) / 2) * i29;
        int i39 = (i38 * 2) + i37;
        if (byteBuffer4.capacity() >= i39) {
            byteBuffer4.position(0);
            java.nio.ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i37);
            java.nio.ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i38 + i37);
            m156611xca28f8b5(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, slice, i27, slice2, i29, byteBuffer4.slice(), i29, i27, i28);
            return;
        }
        throw new java.lang.IllegalArgumentException("Expected destination buffer capacity to be at least " + i39 + " was " + byteBuffer4.capacity());
    }

    /* renamed from: I420Rotate */
    public static void m156604x8e3d7744(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, int i28, int i29) {
        int i37 = i29 % 180;
        int i38 = i37 == 0 ? i27 : i28;
        int i39 = i37 == 0 ? i28 : i27;
        int i47 = (i39 + 1) / 2;
        int i48 = (i38 + 1) / 2;
        int i49 = i39 * i38;
        int i57 = i47 * i48;
        int i58 = (i57 * 2) + i49;
        if (byteBuffer4.capacity() >= i58) {
            byteBuffer4.position(0);
            java.nio.ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i49);
            java.nio.ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i57 + i49);
            m156612xfd67d69b(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, slice, i38, slice2, i48, byteBuffer4.slice(), i48, i27, i28, i29);
            return;
        }
        throw new java.lang.IllegalArgumentException("Expected destination buffer capacity to be at least " + i58 + " was " + byteBuffer4.capacity());
    }

    /* renamed from: I420ToNV12 */
    public static void m156606x9195b0cd(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, int i28) {
        int i29 = (i27 + 1) / 2;
        int i37 = i27 * i28;
        int i38 = (((i28 + 1) / 2) * i29 * 2) + i37;
        if (byteBuffer4.capacity() >= i38) {
            byteBuffer4.position(0);
            java.nio.ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i37);
            m156613xc01024(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, slice, i27, byteBuffer4.slice(), i29 * 2, i27, i28);
            return;
        }
        throw new java.lang.IllegalArgumentException("Expected destination buffer capacity to be at least " + i38 + " was " + byteBuffer4.capacity());
    }

    /* renamed from: copyPlane */
    public static void m156608x58e79be7(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, int i19, int i27) {
        m156610x3f4a9590(byteBuffer, i17, byteBuffer2, i18, i19, i27);
    }

    /* renamed from: nativeABGRToI420 */
    private static native void m156609x63c60c7(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, int i28, int i29);

    /* renamed from: nativeCopyPlane */
    private static native void m156610x3f4a9590(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, int i19, int i27);

    /* renamed from: nativeI420Copy */
    private static native void m156611xca28f8b5(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, java.nio.ByteBuffer byteBuffer6, int i29, int i37, int i38);

    /* renamed from: nativeI420Rotate */
    private static native void m156612xfd67d69b(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, java.nio.ByteBuffer byteBuffer6, int i29, int i37, int i38, int i39);

    /* renamed from: nativeI420ToNV12 */
    private static native void m156613xc01024(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, int i29, int i37);

    /* renamed from: I420ToNV12 */
    public static void m156607x9195b0cd(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, int i29, int i37) {
        m156613xc01024(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, byteBuffer4, i27, byteBuffer5, i28, i29, i37);
    }

    /* renamed from: I420Copy */
    public static void m156603xb610af9e(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, java.nio.ByteBuffer byteBuffer6, int i29, int i37, int i38) {
        m156611xca28f8b5(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, byteBuffer4, i27, byteBuffer5, i28, byteBuffer6, i29, i37, i38);
    }

    /* renamed from: I420Rotate */
    public static void m156605x8e3d7744(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, java.nio.ByteBuffer byteBuffer4, int i27, java.nio.ByteBuffer byteBuffer5, int i28, java.nio.ByteBuffer byteBuffer6, int i29, int i37, int i38, int i39) {
        m156612xfd67d69b(byteBuffer, i17, byteBuffer2, i18, byteBuffer3, i19, byteBuffer4, i27, byteBuffer5, i28, byteBuffer6, i29, i37, i38, i39);
    }
}
