package rc3;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rc3.w0 w0Var) {
        super(0);
        this.f475482d = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475482d;
        java.util.Collection<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26> values = w0Var.f475628p.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 textureViewSurfaceTextureListenerC16468xc9008a26 : values) {
            android.view.TextureView textureView = textureViewSurfaceTextureListenerC16468xc9008a26.f229717d;
            if (textureView != null) {
                textureViewSurfaceTextureListenerC16468xc9008a26.removeView(textureView);
            }
            textureViewSurfaceTextureListenerC16468xc9008a26.f229717d = null;
            android.graphics.SurfaceTexture surfaceTexture = textureViewSurfaceTextureListenerC16468xc9008a26.f229718e;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
        w0Var.f475628p.clear();
        java.util.HashMap hashMap = w0Var.f475629q;
        java.util.Collection<cf3.d> values2 = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
        for (cf3.d dVar : values2) {
            dVar.f122450b.post(new cf3.a(dVar));
        }
        hashMap.clear();
        return jz5.f0.f384359a;
    }
}
