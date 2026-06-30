package wq4;

/* loaded from: classes13.dex */
public abstract class f extends wq4.e {

    /* renamed from: c, reason: collision with root package name */
    public final int[] f530162c;

    /* renamed from: d, reason: collision with root package name */
    public final int f530163d;

    /* renamed from: e, reason: collision with root package name */
    public final int f530164e;

    /* renamed from: f, reason: collision with root package name */
    public final int f530165f;

    /* renamed from: g, reason: collision with root package name */
    public final int f530166g;

    /* renamed from: h, reason: collision with root package name */
    public final int f530167h;

    /* renamed from: i, reason: collision with root package name */
    public final int f530168i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b f530169j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b textureViewSurfaceTextureListenerC18921x32ae0c3b, int i17, int i18, int i19, int i27, int i28, int i29) {
        super(textureViewSurfaceTextureListenerC18921x32ae0c3b, new int[]{12324, i17, 12323, i18, 12322, i19, 12321, i27, 12325, i28, 12326, i29, 12344});
        this.f530169j = textureViewSurfaceTextureListenerC18921x32ae0c3b;
        this.f530162c = new int[1];
        this.f530163d = i17;
        this.f530164e = i18;
        this.f530165f = i19;
        this.f530166g = i27;
        this.f530167h = i28;
        this.f530168i = i29;
    }

    public final int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17, int i18) {
        int[] iArr = this.f530162c;
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i17, iArr) ? iArr[0] : i18;
    }
}
