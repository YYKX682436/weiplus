package ym5;

/* loaded from: classes13.dex */
public final class z1 implements org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.w1 f545120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f545121b;

    public z1(ym5.w1 w1Var, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f545120a = w1Var;
        this.f545121b = c22789xd23e9a9b;
    }

    @Override // org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener
    /* renamed from: onAnimationCancel */
    public void mo154993x827d33f(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b) {
        this.f545120a.a(this.f545121b);
    }

    @Override // org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener
    /* renamed from: onAnimationEnd */
    public void mo154994xbb3aa236(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b) {
        this.f545120a.c(this.f545121b);
    }

    @Override // org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener
    /* renamed from: onAnimationRepeat */
    public void mo154995x21f9d260(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b) {
        this.f545120a.e(this.f545121b);
    }

    @Override // org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener
    /* renamed from: onAnimationStart */
    public void mo154996xd7e2f2fd(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b) {
        this.f545120a.b(this.f545121b);
    }

    @Override // org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener
    /* renamed from: onAnimationUpdate */
    public void mo154997x27addd8e(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b) {
        this.f545120a.d(this.f545121b);
    }
}
