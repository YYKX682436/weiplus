package jb4;

/* loaded from: classes14.dex */
public abstract class c extends jb4.b {

    /* renamed from: c, reason: collision with root package name */
    public final int[] f380308c;

    /* renamed from: d, reason: collision with root package name */
    public final int f380309d;

    /* renamed from: e, reason: collision with root package name */
    public final int f380310e;

    /* renamed from: f, reason: collision with root package name */
    public final int f380311f;

    /* renamed from: g, reason: collision with root package name */
    public final int f380312g;

    /* renamed from: h, reason: collision with root package name */
    public final int f380313h;

    /* renamed from: i, reason: collision with root package name */
    public final int f380314i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b f380315j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b textureViewSurfaceTextureListenerC17930x32ae0c3b, int i17, int i18, int i19, int i27, int i28, int i29) {
        super(textureViewSurfaceTextureListenerC17930x32ae0c3b, new int[]{12324, i17, 12323, i18, 12322, i19, 12321, i27, 12325, i28, 12326, i29, 12344});
        this.f380315j = textureViewSurfaceTextureListenerC17930x32ae0c3b;
        this.f380308c = new int[1];
        this.f380309d = i17;
        this.f380310e = i18;
        this.f380311f = i19;
        this.f380312g = i27;
        this.f380313h = i28;
        this.f380314i = i29;
    }

    public final int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findConfigAttrib", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser");
        int[] iArr = this.f380308c;
        if (!egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i17, iArr)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findConfigAttrib", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser");
            return i18;
        }
        int i19 = iArr[0];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findConfigAttrib", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser");
        return i19;
    }
}
