package com.tencent.matrix.openglleak.detector;

/* loaded from: classes12.dex */
class FuncSeeker {
    private static native int getBindFuncIndex(java.lang.String str);

    public static int getFuncIndex(java.lang.String str) {
        if (str.equals("glGetError")) {
            return getGlGetErrorIndex();
        }
        if (str.startsWith("glGen") || str.startsWith("glDelete")) {
            return getTargetFuncIndex(str);
        }
        if (str.startsWith("glBind")) {
            return getBindFuncIndex(str);
        }
        if (str.equals("glTexImage2D")) {
            return getGlTexImage2DIndex();
        }
        if (str.equals("glTexImage3D")) {
            return getGlTexImage3DIndex();
        }
        if (str.equals("glBufferData")) {
            return getGlBufferDataIndex();
        }
        if (str.equals("glRenderbufferStorage")) {
            return getGlRenderbufferStorageIndex();
        }
        return 0;
    }

    private static native int getGlBufferDataIndex();

    private static native int getGlGetErrorIndex();

    private static native int getGlRenderbufferStorageIndex();

    private static native int getGlTexImage2DIndex();

    private static native int getGlTexImage3DIndex();

    private static native int getTargetFuncIndex(java.lang.String str);
}
