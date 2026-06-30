package ym5;

/* loaded from: classes13.dex */
public final class e2 implements org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f544795a;

    public e2(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f544795a = c22789xd23e9a9b;
    }

    @Override // org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener
    /* renamed from: onAnimationCancel */
    public void mo154993x827d33f(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b) {
    }

    @Override // org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener
    /* renamed from: onAnimationEnd */
    public void mo154994xbb3aa236(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b) {
        int i17;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f544795a;
        if (c22789xd23e9a9b.getUseRfx() || (i17 = c22789xd23e9a9b.f294871r) == 0) {
            return;
        }
        ym5.l2.f544957a.a(textureViewSurfaceTextureListenerC29708xfaeeb83b, c22789xd23e9a9b.f294872s, i17);
        c22789xd23e9a9b.f294871r = 0;
        c22789xd23e9a9b.f294872s = 0.0d;
        c22789xd23e9a9b.f294874u = 0;
        c22789xd23e9a9b.f294875v = 0.0d;
    }

    @Override // org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener
    /* renamed from: onAnimationRepeat */
    public void mo154995x21f9d260(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b) {
        int i17;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f544795a;
        if (c22789xd23e9a9b.getUseRfx() || (i17 = c22789xd23e9a9b.f294871r) == 0) {
            return;
        }
        ym5.l2.f544957a.a(textureViewSurfaceTextureListenerC29708xfaeeb83b, c22789xd23e9a9b.f294872s, i17);
        c22789xd23e9a9b.f294871r = 0;
        c22789xd23e9a9b.f294872s = 0.0d;
        c22789xd23e9a9b.f294874u = 0;
        c22789xd23e9a9b.f294875v = 0.0d;
    }

    @Override // org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener
    /* renamed from: onAnimationStart */
    public void mo154996xd7e2f2fd(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f544795a;
        if (c22789xd23e9a9b.getUseRfx()) {
            return;
        }
        c22789xd23e9a9b.f294870q = true;
    }

    @Override // org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener
    /* renamed from: onAnimationUpdate */
    public void mo154997x27addd8e(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b) {
    }
}
