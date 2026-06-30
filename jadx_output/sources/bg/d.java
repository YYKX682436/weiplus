package bg;

/* loaded from: classes7.dex */
public class d implements bg.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f19750a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19751b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f19752c;

    public d(fg1.g1 g1Var, com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl textureImageViewLikeImpl) {
        bg.f fVar = g1Var.f261868a;
        float f17 = fVar.O1;
        this.f19750a = f17;
        float f18 = fVar.P1;
        this.f19751b = f18;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TextureScaleLogic", "<init>, originWidthScale: %f, originHeightScale: %f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        this.f19752c = new java.lang.ref.WeakReference(textureImageViewLikeImpl);
    }
}
