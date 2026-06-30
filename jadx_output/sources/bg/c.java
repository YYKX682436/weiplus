package bg;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f19746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f19747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg.d f19748g;

    public c(bg.d dVar, boolean z17, float f17, float f18) {
        this.f19748g = dVar;
        this.f19745d = z17;
        this.f19746e = f17;
        this.f19747f = f18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl textureImageViewLikeImpl = (com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) this.f19748g.f19752c.get();
        if (textureImageViewLikeImpl == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TextureScaleLogic", "onTextureScale#ui, textureImageViewLike already release");
        } else if (this.f19745d) {
            textureImageViewLikeImpl.setTextureViewWidthWeight(this.f19746e);
        } else {
            textureImageViewLikeImpl.setTextureViewHeightWeight(this.f19747f);
        }
    }
}
