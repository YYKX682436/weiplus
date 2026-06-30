package com.tencent.mm.plugin.api.recordView;

/* loaded from: classes14.dex */
public class b implements android.opengl.GLSurfaceView.EGLConfigChooser {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f74726a = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};

    /* renamed from: b, reason: collision with root package name */
    public final int[] f74727b = new int[1];

    public b(com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView, int i17, int i18, int i19, int i27, int i28, int i29) {
    }

    public final int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17, int i18) {
        int[] iArr = this.f74727b;
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i17, iArr) ? iArr[0] : i18;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, this.f74726a, null, 0, iArr);
        int i17 = iArr[0];
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("No configs match configSpec");
        }
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i17];
        egl10.eglChooseConfig(eGLDisplay, this.f74726a, eGLConfigArr, i17, iArr);
        com.tencent.mars.xlog.Log.i("GLConfigChooser", java.lang.String.format("%d configurations", java.lang.Integer.valueOf(i17)));
        for (int i18 = 0; i18 < i17; i18++) {
            com.tencent.mars.xlog.Log.i("GLConfigChooser", java.lang.String.format("Configuration %d:\n", java.lang.Integer.valueOf(i18)));
            javax.microedition.khronos.egl.EGLConfig eGLConfig = eGLConfigArr[i18];
            int[] iArr2 = {12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354};
            java.lang.String[] strArr = {"EGL_BUFFER_SIZE", "EGL_ALPHA_SIZE", "EGL_BLUE_SIZE", "EGL_GREEN_SIZE", "EGL_RED_SIZE", "EGL_DEPTH_SIZE", "EGL_STENCIL_SIZE", "EGL_CONFIG_CAVEAT", "EGL_CONFIG_ID", "EGL_LEVEL", "EGL_MAX_PBUFFER_HEIGHT", "EGL_MAX_PBUFFER_PIXELS", "EGL_MAX_PBUFFER_WIDTH", "EGL_NATIVE_RENDERABLE", "EGL_NATIVE_VISUAL_ID", "EGL_NATIVE_VISUAL_TYPE", "EGL_PRESERVED_RESOURCES", "EGL_SAMPLES", "EGL_SAMPLE_BUFFERS", "EGL_SURFACE_TYPE", "EGL_TRANSPARENT_TYPE", "EGL_TRANSPARENT_RED_VALUE", "EGL_TRANSPARENT_GREEN_VALUE", "EGL_TRANSPARENT_BLUE_VALUE", "EGL_BIND_TO_TEXTURE_RGB", "EGL_BIND_TO_TEXTURE_RGBA", "EGL_MIN_SWAP_INTERVAL", "EGL_MAX_SWAP_INTERVAL", "EGL_LUMINANCE_SIZE", "EGL_ALPHA_MASK_SIZE", "EGL_COLOR_BUFFER_TYPE", "EGL_RENDERABLE_TYPE", "EGL_CONFORMANT"};
            int[] iArr3 = new int[1];
            for (int i19 = 0; i19 < 33; i19++) {
                int i27 = iArr2[i19];
                java.lang.String str = strArr[i19];
                egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i27, iArr3);
            }
        }
        for (int i28 = 0; i28 < i17; i28++) {
            javax.microedition.khronos.egl.EGLConfig eGLConfig2 = eGLConfigArr[i28];
            int a17 = a(egl10, eGLDisplay, eGLConfig2, 12325, 0);
            int a18 = a(egl10, eGLDisplay, eGLConfig2, 12326, 0);
            if (a17 >= 0 && a18 >= 0) {
                int a19 = a(egl10, eGLDisplay, eGLConfig2, 12324, 0);
                int a27 = a(egl10, eGLDisplay, eGLConfig2, 12323, 0);
                int a28 = a(egl10, eGLDisplay, eGLConfig2, 12322, 0);
                int a29 = a(egl10, eGLDisplay, eGLConfig2, 12321, 0);
                if (a19 == 5 && a27 == 6 && a28 == 5 && a29 == 0) {
                    return eGLConfig2;
                }
            }
        }
        return null;
    }
}
