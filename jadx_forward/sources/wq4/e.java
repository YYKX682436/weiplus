package wq4;

/* loaded from: classes13.dex */
public abstract class e implements wq4.i {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f530159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b f530160b;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b textureViewSurfaceTextureListenerC18921x32ae0c3b, int[] iArr) {
        this.f530160b = textureViewSurfaceTextureListenerC18921x32ae0c3b;
        if (textureViewSurfaceTextureListenerC18921x32ae0c3b.f258571o == 2) {
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i17 = length - 1;
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i17);
            iArr2[i17] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            iArr = iArr2;
        }
        this.f530159a = iArr;
    }

    @Override // wq4.i
    /* renamed from: chooseConfig */
    public javax.microedition.khronos.egl.EGLConfig mo174319xadc0b839(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay) {
        javax.microedition.khronos.egl.EGLConfig eGLConfig;
        int[] iArr = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, this.f530159a, null, 0, iArr)) {
            throw new java.lang.IllegalArgumentException("eglChooseConfig failed");
        }
        int i17 = 0;
        int i18 = iArr[0];
        if (i18 <= 0) {
            throw new java.lang.IllegalArgumentException("No configs match configSpec");
        }
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i18];
        if (!egl10.eglChooseConfig(eGLDisplay, this.f530159a, eGLConfigArr, i18, iArr)) {
            throw new java.lang.IllegalArgumentException("eglChooseConfig#2 failed");
        }
        wq4.f fVar = (wq4.f) this;
        while (true) {
            if (i17 >= i18) {
                eGLConfig = null;
                break;
            }
            eGLConfig = eGLConfigArr[i17];
            int a17 = fVar.a(egl10, eGLDisplay, eGLConfig, 12325, 0);
            int a18 = fVar.a(egl10, eGLDisplay, eGLConfig, 12326, 0);
            if (a17 >= fVar.f530167h && a18 >= fVar.f530168i) {
                int a19 = fVar.a(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int a27 = fVar.a(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int a28 = fVar.a(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int a29 = fVar.a(egl10, eGLDisplay, eGLConfig, 12321, 0);
                if (a19 == fVar.f530163d && a27 == fVar.f530164e && a28 == fVar.f530165f && a29 == fVar.f530166g) {
                    break;
                }
            }
            i17++;
        }
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new java.lang.IllegalArgumentException("No config chosen");
    }
}
