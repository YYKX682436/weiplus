package rc3;

/* loaded from: classes7.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 f475557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(rc3.w0 w0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 textureViewSurfaceTextureListenerC16468xc9008a26) {
        super(0);
        this.f475555d = w0Var;
        this.f475556e = i17;
        this.f475557f = textureViewSurfaceTextureListenerC16468xc9008a26;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jc3.g0 g0Var;
        rc3.w0 w0Var = this.f475555d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = w0Var.f475624i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 textureViewSurfaceTextureListenerC16468xc9008a26 = this.f475557f;
        if (c16416x87606a7b != null && (g0Var = c16416x87606a7b.f229361r) != null) {
            g0Var.Me(this.f475556e, textureViewSurfaceTextureListenerC16468xc9008a26);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b2 = w0Var.f475624i;
        boolean z17 = c16416x87606a7b2 != null ? c16416x87606a7b2.f229366w : false;
        if (textureViewSurfaceTextureListenerC16468xc9008a26.f229717d == null) {
            android.view.TextureView textureView = new android.view.TextureView(textureViewSurfaceTextureListenerC16468xc9008a26.getContext());
            textureView.setOpaque(false);
            textureView.setSurfaceTextureListener(textureViewSurfaceTextureListenerC16468xc9008a26);
            textureViewSurfaceTextureListenerC16468xc9008a26.f229717d = textureView;
            if (z17) {
                textureViewSurfaceTextureListenerC16468xc9008a26.setBackgroundColor(-16777216);
            }
            textureViewSurfaceTextureListenerC16468xc9008a26.addView(textureViewSurfaceTextureListenerC16468xc9008a26.f229717d);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                textureViewSurfaceTextureListenerC16468xc9008a26.setContentDescription("MBView");
                android.view.TextureView textureView2 = textureViewSurfaceTextureListenerC16468xc9008a26.f229717d;
                if (textureView2 != null) {
                    textureView2.setContentDescription("MBTextureView");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
