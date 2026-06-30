package wq4;

/* loaded from: classes13.dex */
public class a implements wq4.i {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f530146b = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final int[] f530147a = new int[1];

    public a(int i17, int i18, int i19, int i27, int i28, int i29) {
    }

    public final int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17, int i18) {
        int[] iArr = this.f530147a;
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i17, iArr) ? iArr[0] : i18;
    }

    @Override // wq4.i
    /* renamed from: chooseConfig */
    public javax.microedition.khronos.egl.EGLConfig mo174319xadc0b839(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        int[] iArr2 = f530146b;
        egl10.eglChooseConfig(eGLDisplay, iArr2, null, 0, iArr);
        int i17 = iArr[0];
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("No configs match configSpec");
        }
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i17];
        egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr, i17, iArr);
        for (int i18 = 0; i18 < i17; i18++) {
            javax.microedition.khronos.egl.EGLConfig eGLConfig = eGLConfigArr[i18];
            int a17 = a(egl10, eGLDisplay, eGLConfig, 12325, 0);
            int a18 = a(egl10, eGLDisplay, eGLConfig, 12326, 0);
            if (a17 >= 0 && a18 >= 0) {
                int a19 = a(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int a27 = a(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int a28 = a(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int a29 = a(egl10, eGLDisplay, eGLConfig, 12321, 0);
                if (a19 == 5 && a27 == 6 && a28 == 5 && a29 == 0) {
                    return eGLConfig;
                }
            }
        }
        return null;
    }
}
