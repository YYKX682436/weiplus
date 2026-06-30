package nq;

/* loaded from: classes13.dex */
public class k extends nq.j {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f420416b;

    /* renamed from: c, reason: collision with root package name */
    public final int f420417c;

    /* renamed from: d, reason: collision with root package name */
    public final int f420418d;

    /* renamed from: e, reason: collision with root package name */
    public final int f420419e;

    /* renamed from: f, reason: collision with root package name */
    public final int f420420f;

    /* renamed from: g, reason: collision with root package name */
    public final int f420421g;

    /* renamed from: h, reason: collision with root package name */
    public final int f420422h;

    public k(com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb, int i17, int i18, int i19, int i27, int i28, int i29) {
        super(surfaceHolderCallback2C10435xb52e77fb, new int[]{12324, i17, 12323, i18, 12322, i19, 12321, i27, 12325, i28, 12326, i29, 12344});
        this.f420416b = new int[1];
        this.f420417c = i17;
        this.f420418d = i18;
        this.f420419e = i19;
        this.f420420f = i27;
        this.f420421g = i28;
        this.f420422h = i29;
    }

    public final int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17, int i18) {
        int[] iArr = this.f420416b;
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i17, iArr) ? iArr[0] : i18;
    }
}
