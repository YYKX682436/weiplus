package com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6;

/* renamed from: com.tencent.matrix.openglleak.detector.FuncSeeker */
/* loaded from: classes12.dex */
class C4698x3a86e529 {
    /* renamed from: getBindFuncIndex */
    private static native int m41148x70f5cfb(java.lang.String str);

    /* renamed from: getFuncIndex */
    public static int m41149xf4b0a1b8(java.lang.String str) {
        if (str.equals("glGetError")) {
            return m41151xd367f485();
        }
        if (str.startsWith("glGen") || str.startsWith("glDelete")) {
            return m41155x5be0e3a7(str);
        }
        if (str.startsWith("glBind")) {
            return m41148x70f5cfb(str);
        }
        if (str.equals("glTexImage2D")) {
            return m41153xee75bd51();
        }
        if (str.equals("glTexImage3D")) {
            return m41154x235bf892();
        }
        if (str.equals("glBufferData")) {
            return m41150x5681028d();
        }
        if (str.equals("glRenderbufferStorage")) {
            return m41152xedef3988();
        }
        return 0;
    }

    /* renamed from: getGlBufferDataIndex */
    private static native int m41150x5681028d();

    /* renamed from: getGlGetErrorIndex */
    private static native int m41151xd367f485();

    /* renamed from: getGlRenderbufferStorageIndex */
    private static native int m41152xedef3988();

    /* renamed from: getGlTexImage2DIndex */
    private static native int m41153xee75bd51();

    /* renamed from: getGlTexImage3DIndex */
    private static native int m41154x235bf892();

    /* renamed from: getTargetFuncIndex */
    private static native int m41155x5be0e3a7(java.lang.String str);
}
