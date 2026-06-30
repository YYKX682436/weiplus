package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f;

/* renamed from: com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup */
/* loaded from: classes14.dex */
public interface InterfaceC26432x5eb375de {
    /* renamed from: checkGlError */
    static void m102813x15195fb(java.lang.String str) {
        if (android.opengl.GLES20.glGetError() != 0) {
            throw new java.lang.RuntimeException(str);
        }
    }

    /* renamed from: destroyBuffers */
    void mo102809xdd60ded9();

    /* renamed from: genOESTexture */
    void mo102810xfe6786e();

    /* renamed from: getOESTextureid */
    int mo102811x473c490f();

    /* renamed from: process */
    void mo102812xed8d1e6f(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19, int i27, boolean z17, int i28);
}
