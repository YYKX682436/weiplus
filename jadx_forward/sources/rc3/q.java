package rc3;

/* loaded from: classes7.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 f475585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(rc3.w0 w0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 textureViewSurfaceTextureListenerC16468xc9008a26) {
        super(0);
        this.f475583d = w0Var;
        this.f475584e = i17;
        this.f475585f = textureViewSurfaceTextureListenerC16468xc9008a26;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jc3.g0 g0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f475583d.f475624i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 textureViewSurfaceTextureListenerC16468xc9008a26 = this.f475585f;
        if (c16416x87606a7b != null && (g0Var = c16416x87606a7b.f229361r) != null) {
            g0Var.Zf(this.f475584e, textureViewSurfaceTextureListenerC16468xc9008a26);
        }
        android.view.TextureView textureView = textureViewSurfaceTextureListenerC16468xc9008a26.f229717d;
        if (textureView != null) {
            textureViewSurfaceTextureListenerC16468xc9008a26.removeView(textureView);
        }
        textureViewSurfaceTextureListenerC16468xc9008a26.f229717d = null;
        android.graphics.SurfaceTexture surfaceTexture = textureViewSurfaceTextureListenerC16468xc9008a26.f229718e;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        return jz5.f0.f384359a;
    }
}
